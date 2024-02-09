package h2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import e2.b;

public final class b1 extends o0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f9108g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ c f9109h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f9109h = cVar;
        this.f9108g = iBinder;
    }

    /* access modifiers changed from: protected */
    public final void f(b bVar) {
        if (this.f9109h.f9131v != null) {
            this.f9109h.f9131v.J(bVar);
        }
        this.f9109h.L(bVar);
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        String str;
        try {
            IBinder iBinder = this.f9108g;
            p.j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f9109h.E().equals(interfaceDescriptor)) {
                str = "service descriptor mismatch: " + this.f9109h.E() + " vs. " + interfaceDescriptor;
                Log.w("GmsClient", str);
                return false;
            }
            IInterface s9 = this.f9109h.s(this.f9108g);
            if (s9 == null || (!c.g0(this.f9109h, 2, 4, s9) && !c.g0(this.f9109h, 3, 4, s9))) {
                return false;
            }
            this.f9109h.f9135z = null;
            Bundle x9 = this.f9109h.x();
            c cVar = this.f9109h;
            if (cVar.f9130u == null) {
                return true;
            }
            cVar.f9130u.Y(x9);
            return true;
        } catch (RemoteException unused) {
            str = "service probably died";
        }
    }
}
