package g2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import e2.b;
import e2.d;
import f2.a;
import h2.c;
import h2.i;
import h2.j;
import h2.p;
import java.util.Collections;
import java.util.Set;

public final class g implements a.f, ServiceConnection {

    /* renamed from: l  reason: collision with root package name */
    private static final String f8876l = g.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final String f8877a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8878b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f8879c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f8880d;

    /* renamed from: e  reason: collision with root package name */
    private final c f8881e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f8882f;

    /* renamed from: g  reason: collision with root package name */
    private final h f8883g;

    /* renamed from: h  reason: collision with root package name */
    private IBinder f8884h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f8885i;

    /* renamed from: j  reason: collision with root package name */
    private String f8886j;

    /* renamed from: k  reason: collision with root package name */
    private String f8887k;

    private final void s() {
        if (Thread.currentThread() != this.f8882f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    public final boolean a() {
        s();
        return this.f8884h != null;
    }

    public final void c(j jVar, Set<Scope> set) {
    }

    public final Set<Scope> d() {
        return Collections.emptySet();
    }

    public final void e(String str) {
        s();
        this.f8886j = str;
        m();
    }

    public final boolean f() {
        return false;
    }

    public final int g() {
        return 0;
    }

    public final boolean h() {
        s();
        return this.f8885i;
    }

    public final d[] i() {
        return new d[0];
    }

    public final String j() {
        String str = this.f8877a;
        if (str != null) {
            return str;
        }
        p.j(this.f8879c);
        return this.f8879c.getPackageName();
    }

    public final String k() {
        return this.f8886j;
    }

    public final void l(c.e eVar) {
    }

    public final void m() {
        s();
        String.valueOf(this.f8884h);
        try {
            this.f8880d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f8885i = false;
        this.f8884h = null;
    }

    public final boolean n() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void o() {
        this.f8885i = false;
        this.f8884h = null;
        this.f8881e.B(1);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f8882f.post(new t(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f8882f.post(new s(this));
    }

    public final void p(c.C0142c cVar) {
        s();
        String.valueOf(this.f8884h);
        if (a()) {
            try {
                e("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f8879c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f8877a).setAction(this.f8878b);
            }
            boolean bindService = this.f8880d.bindService(intent, this, i.a());
            this.f8885i = bindService;
            if (!bindService) {
                this.f8884h = null;
                this.f8883g.J(new b(16));
            }
            String.valueOf(this.f8884h);
        } catch (SecurityException e10) {
            this.f8885i = false;
            this.f8884h = null;
            throw e10;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void q(IBinder iBinder) {
        this.f8885i = false;
        this.f8884h = iBinder;
        String.valueOf(iBinder);
        this.f8881e.Y(new Bundle());
    }

    public final void r(String str) {
        this.f8887k = str;
    }
}
