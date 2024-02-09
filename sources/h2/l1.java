package h2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import k2.a;
import s2.e;

final class l1 extends i {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f9213f = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final Context f9214g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile Handler f9215h;

    /* renamed from: i  reason: collision with root package name */
    private final k1 f9216i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final a f9217j;

    /* renamed from: k  reason: collision with root package name */
    private final long f9218k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final long f9219l;

    l1(Context context, Looper looper) {
        k1 k1Var = new k1(this, (j1) null);
        this.f9216i = k1Var;
        this.f9214g = context.getApplicationContext();
        this.f9215h = new e(looper, k1Var);
        this.f9217j = a.b();
        this.f9218k = 5000;
        this.f9219l = 300000;
    }

    /* access modifiers changed from: protected */
    public final void d(h1 h1Var, ServiceConnection serviceConnection, String str) {
        p.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9213f) {
            i1 i1Var = (i1) this.f9213f.get(h1Var);
            if (i1Var == null) {
                String obj = h1Var.toString();
                throw new IllegalStateException("Nonexistent connection status for service config: " + obj);
            } else if (i1Var.h(serviceConnection)) {
                i1Var.f(serviceConnection, str);
                if (i1Var.i()) {
                    this.f9215h.sendMessageDelayed(this.f9215h.obtainMessage(0, h1Var), this.f9218k);
                }
            } else {
                String obj2 = h1Var.toString();
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean f(h1 h1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j10;
        p.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f9213f) {
            i1 i1Var = (i1) this.f9213f.get(h1Var);
            if (i1Var == null) {
                i1Var = new i1(this, h1Var);
                i1Var.d(serviceConnection, serviceConnection, str);
                i1Var.e(str, executor);
                this.f9213f.put(h1Var, i1Var);
            } else {
                this.f9215h.removeMessages(0, h1Var);
                if (!i1Var.h(serviceConnection)) {
                    i1Var.d(serviceConnection, serviceConnection, str);
                    int a10 = i1Var.a();
                    if (a10 == 1) {
                        serviceConnection.onServiceConnected(i1Var.b(), i1Var.c());
                    } else if (a10 == 2) {
                        i1Var.e(str, executor);
                    }
                } else {
                    String obj = h1Var.toString();
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                }
            }
            j10 = i1Var.j();
        }
        return j10;
    }
}
