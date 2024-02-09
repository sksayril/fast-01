package x2;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import h2.p;
import o2.c;
import o2.d;
import y2.d0;
import z2.t;

final class l implements c {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f13159a;

    /* renamed from: b  reason: collision with root package name */
    private final y2.c f13160b;

    /* renamed from: c  reason: collision with root package name */
    private View f13161c;

    public l(ViewGroup viewGroup, y2.c cVar) {
        this.f13160b = (y2.c) p.j(cVar);
        this.f13159a = (ViewGroup) p.j(viewGroup);
    }

    public final void D() {
        try {
            this.f13160b.D();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void T() {
        try {
            this.f13160b.T();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void U(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            d0.b(bundle, bundle2);
            this.f13160b.U(bundle2);
            d0.b(bundle2, bundle);
            this.f13161c = (View) d.Y(this.f13160b.I());
            this.f13159a.removeAllViews();
            this.f13159a.addView(this.f13161c);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void a(f fVar) {
        try {
            this.f13160b.Z(new k(this, fVar));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void l(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            d0.b(bundle, bundle2);
            this.f13160b.l(bundle2);
            d0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void o() {
        try {
            this.f13160b.o();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void s() {
        try {
            this.f13160b.s();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
