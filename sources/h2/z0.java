package h2;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class z0 extends p0 {

    /* renamed from: c  reason: collision with root package name */
    private c f9269c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9270d;

    public z0(c cVar, int i10) {
        this.f9269c = cVar;
        this.f9270d = i10;
    }

    public final void E1(int i10, IBinder iBinder, d1 d1Var) {
        c cVar = this.f9269c;
        p.k(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        p.j(d1Var);
        c.c0(cVar, d1Var);
        Y2(i10, iBinder, d1Var.f9145m);
    }

    public final void O1(int i10, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void Y2(int i10, IBinder iBinder, Bundle bundle) {
        p.k(this.f9269c, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f9269c.N(i10, iBinder, bundle, this.f9270d);
        this.f9269c = null;
    }
}
