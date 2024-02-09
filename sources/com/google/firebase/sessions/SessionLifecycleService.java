package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import c5.c0;
import c5.e0;
import c5.x;
import e5.f;
import java.util.ArrayList;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class SessionLifecycleService extends Service {

    /* renamed from: p  reason: collision with root package name */
    public static final a f7473p = new a((g) null);

    /* renamed from: m  reason: collision with root package name */
    private final HandlerThread f7474m = new HandlerThread("FirebaseSessions_HandlerThread");

    /* renamed from: n  reason: collision with root package name */
    private b f7475n;

    /* renamed from: o  reason: collision with root package name */
    private Messenger f7476o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private boolean f7477a;

        /* renamed from: b  reason: collision with root package name */
        private long f7478b;

        /* renamed from: c  reason: collision with root package name */
        private final ArrayList<Messenger> f7479c = new ArrayList<>();

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Looper looper) {
            super(looper);
            l.e(looper, "looper");
        }

        private final void a() {
            StringBuilder sb = new StringBuilder();
            sb.append("Broadcasting new session: ");
            e0.b bVar = e0.f3711f;
            sb.append(bVar.a().c());
            Log.d("SessionLifecycleService", sb.toString());
            c0.f3684a.a().a(bVar.a().c());
            for (Messenger messenger : new ArrayList(this.f7479c)) {
                l.d(messenger, "it");
                f(messenger);
            }
        }

        private final void b(Message message) {
            Log.d("SessionLifecycleService", "Activity backgrounding at " + message.getWhen());
            this.f7478b = message.getWhen();
        }

        private final void c(Message message) {
            this.f7479c.add(message.replyTo);
            Messenger messenger = message.replyTo;
            l.d(messenger, "msg.replyTo");
            f(messenger);
            Log.d("SessionLifecycleService", "Client " + message.replyTo + " bound at " + message.getWhen() + ". Clients: " + this.f7479c.size());
        }

        private final void d(Message message) {
            Log.d("SessionLifecycleService", "Activity foregrounding at " + message.getWhen() + '.');
            if (!this.f7477a) {
                Log.d("SessionLifecycleService", "Cold start detected.");
                this.f7477a = true;
            } else {
                if (e(message.getWhen())) {
                    Log.d("SessionLifecycleService", "Session too long in background. Creating new session.");
                }
                this.f7478b = message.getWhen();
            }
            g();
            this.f7478b = message.getWhen();
        }

        private final boolean e(long j10) {
            return j10 - this.f7478b > a9.b.u(f.f8482c.c().c());
        }

        private final void f(Messenger messenger) {
            String a10;
            if (this.f7477a) {
                a10 = e0.f3711f.a().c().b();
            } else {
                a10 = x.f3774a.a().a();
                Log.d("SessionLifecycleService", "App has not yet foregrounded. Using previously stored session: " + a10);
                if (a10 == null) {
                    return;
                }
            }
            h(messenger, a10);
        }

        private final void g() {
            e0.b bVar = e0.f3711f;
            bVar.a().a();
            Log.d("SessionLifecycleService", "Generated new session " + bVar.a().c().b());
            a();
            x.f3774a.a().b(bVar.a().c().b());
        }

        private final void h(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain((Handler) null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                Log.d("SessionLifecycleService", "Removing dead client from list: " + messenger);
                this.f7479c.remove(messenger);
            } catch (Exception e10) {
                Log.w("SessionLifecycleService", "Unable to push new session to " + messenger + '.', e10);
            }
        }

        public void handleMessage(Message message) {
            l.e(message, "msg");
            if (this.f7478b > message.getWhen()) {
                Log.d("SessionLifecycleService", "Ignoring old message from " + message.getWhen() + " which is older than " + this.f7478b + '.');
                return;
            }
            int i10 = message.what;
            if (i10 == 1) {
                d(message);
            } else if (i10 == 2) {
                b(message);
            } else if (i10 != 4) {
                Log.w("SessionLifecycleService", "Received unexpected event from the SessionLifecycleClient: " + message);
                super.handleMessage(message);
            } else {
                c(message);
            }
        }
    }

    private final Messenger a(Intent intent) {
        return (Messenger) (Build.VERSION.SDK_INT >= 33 ? intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class) : intent.getParcelableExtra("ClientCallbackMessenger"));
    }

    public IBinder onBind(Intent intent) {
        if (intent == null) {
            Log.d("SessionLifecycleService", "Service bound with null intent. Ignoring.");
            return null;
        }
        Log.d("SessionLifecycleService", "Service bound to new client on process " + intent.getAction());
        Messenger a10 = a(intent);
        if (a10 != null) {
            Message obtain = Message.obtain((Handler) null, 4, 0, 0);
            obtain.replyTo = a10;
            b bVar = this.f7475n;
            if (bVar != null) {
                bVar.sendMessage(obtain);
            }
        }
        Messenger messenger = this.f7476o;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        this.f7474m.start();
        Looper looper = this.f7474m.getLooper();
        l.d(looper, "handlerThread.looper");
        this.f7475n = new b(looper);
        this.f7476o = new Messenger(this.f7475n);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7474m.quit();
    }
}
