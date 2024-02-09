package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class o {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f1332c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static String f1333d;

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f1334e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f1335f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static e f1336g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f1337a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f1338b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    private static class c implements f {

        /* renamed from: a  reason: collision with root package name */
        final String f1339a;

        /* renamed from: b  reason: collision with root package name */
        final int f1340b;

        /* renamed from: c  reason: collision with root package name */
        final String f1341c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f1342d;

        c(String str, int i10, String str2, Notification notification) {
            this.f1339a = str;
            this.f1340b = i10;
            this.f1341c = str2;
            this.f1342d = notification;
        }

        public void a(b.a aVar) {
            aVar.B2(this.f1339a, this.f1340b, this.f1341c, this.f1342d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f1339a + ", id:" + this.f1340b + ", tag:" + this.f1341c + "]";
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f1343a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f1344b;

        d(ComponentName componentName, IBinder iBinder) {
            this.f1343a = componentName;
            this.f1344b = iBinder;
        }
    }

    private static class e implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final Context f1345a;

        /* renamed from: b  reason: collision with root package name */
        private final HandlerThread f1346b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f1347c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<ComponentName, a> f1348d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private Set<String> f1349e = new HashSet();

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f1350a;

            /* renamed from: b  reason: collision with root package name */
            boolean f1351b = false;

            /* renamed from: c  reason: collision with root package name */
            b.a f1352c;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<f> f1353d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f1354e = 0;

            a(ComponentName componentName) {
                this.f1350a = componentName;
            }
        }

        e(Context context) {
            this.f1345a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f1346b = handlerThread;
            handlerThread.start();
            this.f1347c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f1351b) {
                return true;
            }
            boolean bindService = this.f1345a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f1350a), this, 33);
            aVar.f1351b = bindService;
            if (bindService) {
                aVar.f1354e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f1350a);
                this.f1345a.unbindService(this);
            }
            return aVar.f1351b;
        }

        private void b(a aVar) {
            if (aVar.f1351b) {
                this.f1345a.unbindService(this);
                aVar.f1351b = false;
            }
            aVar.f1352c = null;
        }

        private void c(f fVar) {
            j();
            for (a next : this.f1348d.values()) {
                next.f1353d.add(fVar);
                g(next);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f1348d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f1348d.get(componentName);
            if (aVar != null) {
                aVar.f1352c = a.C0066a.B(iBinder);
                aVar.f1354e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f1348d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f1350a + ", " + aVar.f1353d.size() + " queued tasks");
            }
            if (!aVar.f1353d.isEmpty()) {
                if (!a(aVar) || aVar.f1352c == null) {
                    i(aVar);
                    return;
                }
                while (true) {
                    f peek = aVar.f1353d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f1352c);
                        aVar.f1353d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f1350a);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f1350a, e10);
                    }
                }
                if (!aVar.f1353d.isEmpty()) {
                    i(aVar);
                }
            }
        }

        private void i(a aVar) {
            if (!this.f1347c.hasMessages(3, aVar.f1350a)) {
                int i10 = aVar.f1354e + 1;
                aVar.f1354e = i10;
                if (i10 > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f1353d.size() + " tasks to " + aVar.f1350a + " after " + aVar.f1354e + " retries");
                    aVar.f1353d.clear();
                    return;
                }
                int i11 = (1 << (i10 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
                }
                this.f1347c.sendMessageDelayed(this.f1347c.obtainMessage(3, aVar.f1350a), (long) i11);
            }
        }

        private void j() {
            Set<String> g10 = o.g(this.f1345a);
            if (!g10.equals(this.f1349e)) {
                this.f1349e = g10;
                List<ResolveInfo> queryIntentServices = this.f1345a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (g10.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f1348d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f1348d.put(componentName2, new a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, a>> it = this.f1348d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        b((a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void h(f fVar) {
            this.f1347c.obtainMessage(0, fVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((f) message.obj);
                return true;
            } else if (i10 == 1) {
                d dVar = (d) message.obj;
                e(dVar.f1343a, dVar.f1344b);
                return true;
            } else if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f1347c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f1347c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface f {
        void a(b.a aVar);
    }

    private o(Context context) {
        this.f1337a = context;
        this.f1338b = (NotificationManager) context.getSystemService("notification");
    }

    public static o f(Context context) {
        return new o(context);
    }

    public static Set<String> g(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f1332c) {
            if (string != null) {
                if (!string.equals(f1333d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f1334e = hashSet;
                    f1333d = string;
                }
            }
            set = f1334e;
        }
        return set;
    }

    private void k(f fVar) {
        synchronized (f1335f) {
            if (f1336g == null) {
                f1336g = new e(this.f1337a.getApplicationContext());
            }
            f1336g.h(fVar);
        }
    }

    private static boolean l(Notification notification) {
        Bundle a10 = l.a(notification);
        return a10 != null && a10.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f1338b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f1337a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f1337a.getApplicationInfo();
        String packageName = this.f1337a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int i10) {
        c((String) null, i10);
    }

    public void c(String str, int i10) {
        this.f1338b.cancel(str, i10);
    }

    public void d() {
        this.f1338b.cancelAll();
    }

    public void e(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(this.f1338b, notificationChannel);
        }
    }

    public List<NotificationChannel> h() {
        return Build.VERSION.SDK_INT >= 26 ? b.k(this.f1338b) : Collections.emptyList();
    }

    public void i(int i10, Notification notification) {
        j((String) null, i10, notification);
    }

    public void j(String str, int i10, Notification notification) {
        if (l(notification)) {
            k(new c(this.f1337a.getPackageName(), i10, str, notification));
            this.f1338b.cancel(str, i10);
            return;
        }
        this.f1338b.notify(str, i10, notification);
    }
}
