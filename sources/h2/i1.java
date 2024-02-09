package h2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import l2.k;

final class i1 implements ServiceConnection, m1 {

    /* renamed from: a  reason: collision with root package name */
    private final Map f9201a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f9202b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f9203c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f9204d;

    /* renamed from: e  reason: collision with root package name */
    private final h1 f9205e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f9206f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l1 f9207g;

    public i1(l1 l1Var, h1 h1Var) {
        this.f9207g = l1Var;
        this.f9205e = h1Var;
    }

    public final int a() {
        return this.f9202b;
    }

    public final ComponentName b() {
        return this.f9206f;
    }

    public final IBinder c() {
        return this.f9204d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f9201a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        this.f9202b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (k.l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            l1 l1Var = this.f9207g;
            boolean d10 = l1Var.f9217j.d(l1Var.f9214g, str, this.f9205e.c(l1Var.f9214g), this, this.f9205e.a(), executor);
            this.f9203c = d10;
            if (d10) {
                this.f9207g.f9215h.sendMessageDelayed(this.f9207g.f9215h.obtainMessage(1, this.f9205e), this.f9207g.f9219l);
            } else {
                this.f9202b = 2;
                try {
                    l1 l1Var2 = this.f9207g;
                    l1Var2.f9217j.c(l1Var2.f9214g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f9201a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f9207g.f9215h.removeMessages(1, this.f9205e);
        l1 l1Var = this.f9207g;
        l1Var.f9217j.c(l1Var.f9214g, this);
        this.f9203c = false;
        this.f9202b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f9201a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f9201a.isEmpty();
    }

    public final boolean j() {
        return this.f9203c;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f9207g.f9213f) {
            this.f9207g.f9215h.removeMessages(1, this.f9205e);
            this.f9204d = iBinder;
            this.f9206f = componentName;
            for (ServiceConnection onServiceConnected : this.f9201a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f9202b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f9207g.f9213f) {
            this.f9207g.f9215h.removeMessages(1, this.f9205e);
            this.f9204d = null;
            this.f9206f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f9201a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f9202b = 2;
        }
    }
}
