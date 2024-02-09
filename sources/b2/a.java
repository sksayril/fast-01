package b2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import e2.g;
import e2.i;
import h2.p;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import q2.e;
import q2.f;

public class a {

    /* renamed from: a  reason: collision with root package name */
    e2.a f3374a;

    /* renamed from: b  reason: collision with root package name */
    f f3375b;

    /* renamed from: c  reason: collision with root package name */
    boolean f3376c;

    /* renamed from: d  reason: collision with root package name */
    final Object f3377d = new Object();

    /* renamed from: e  reason: collision with root package name */
    c f3378e;

    /* renamed from: f  reason: collision with root package name */
    private final Context f3379f;

    /* renamed from: g  reason: collision with root package name */
    final long f3380g;

    /* renamed from: b2.a$a  reason: collision with other inner class name */
    public static final class C0069a {

        /* renamed from: a  reason: collision with root package name */
        private final String f3381a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3382b;

        @Deprecated
        public C0069a(String str, boolean z9) {
            this.f3381a = str;
            this.f3382b = z9;
        }

        public String a() {
            return this.f3381a;
        }

        public boolean b() {
            return this.f3382b;
        }

        public String toString() {
            String str = this.f3381a;
            boolean z9 = this.f3382b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z9);
            return sb.toString();
        }
    }

    public a(Context context, long j10, boolean z9, boolean z10) {
        Context applicationContext;
        p.j(context);
        if (z9 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f3379f = context;
        this.f3376c = false;
        this.f3380g = j10;
    }

    public static C0069a a(Context context) {
        a aVar = new a(context, -1, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0069a f10 = aVar.f(-1);
            aVar.e(f10, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", (Throwable) null);
            aVar.c();
            return f10;
        } catch (Throwable th) {
            aVar.c();
            throw th;
        }
    }

    public static void b(boolean z9) {
    }

    private final C0069a f(int i10) {
        C0069a aVar;
        p.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f3376c) {
                synchronized (this.f3377d) {
                    c cVar = this.f3378e;
                    if (cVar == null || !cVar.f3387p) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    d(false);
                    if (!this.f3376c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                } catch (Exception e11) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                }
            }
            p.j(this.f3374a);
            p.j(this.f3375b);
            aVar = new C0069a(this.f3375b.b(), this.f3375b.X0(true));
        }
        g();
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void g() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f3377d
            monitor-enter(r0)
            b2.c r1 = r6.f3378e     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0011
            java.util.concurrent.CountDownLatch r1 = r1.f3386o     // Catch:{ all -> 0x0022 }
            r1.countDown()     // Catch:{ all -> 0x0022 }
            b2.c r1 = r6.f3378e     // Catch:{ InterruptedException -> 0x0011 }
            r1.join()     // Catch:{ InterruptedException -> 0x0011 }
        L_0x0011:
            long r1 = r6.f3380g     // Catch:{ all -> 0x0022 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0020
            b2.c r3 = new b2.c     // Catch:{ all -> 0x0022 }
            r3.<init>(r6, r1)     // Catch:{ all -> 0x0022 }
            r6.f3378e = r3     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return
        L_0x0022:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a.g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            h2.p.i(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f3379f     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            e2.a r0 = r3.f3374a     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0031
        L_0x000f:
            boolean r0 = r3.f3376c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            k2.a r0 = k2.a.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f3379f     // Catch:{ all -> 0x001f }
            e2.a r2 = r3.f3374a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0033 }
        L_0x0027:
            r0 = 0
            r3.f3376c = r0     // Catch:{ all -> 0x0033 }
            r0 = 0
            r3.f3375b = r0     // Catch:{ all -> 0x0033 }
            r3.f3374a = r0     // Catch:{ all -> 0x0033 }
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0031:
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.a.c():void");
    }

    /* access modifiers changed from: protected */
    public final void d(boolean z9) {
        p.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f3376c) {
                c();
            }
            Context context = this.f3379f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h10 = e2.f.f().h(context, i.f8355a);
                if (h10 != 0) {
                    if (h10 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                e2.a aVar = new e2.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (k2.a.b().a(context, intent, aVar, 1)) {
                    this.f3374a = aVar;
                    this.f3375b = e.B(aVar.a(10000, TimeUnit.MILLISECONDS));
                    this.f3376c = true;
                    if (z9) {
                        g();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new g(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e(C0069a aVar, boolean z9, float f10, long j10, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", str2);
        if (aVar != null) {
            if (true != aVar.b()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
            String a10 = aVar.a();
            if (a10 != null) {
                hashMap.put("ad_id_size", Integer.toString(a10.length()));
            }
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j10));
        new b(this, hashMap).start();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        c();
        super.finalize();
    }
}
