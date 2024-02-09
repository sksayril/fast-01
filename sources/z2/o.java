package z2;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import h2.p;
import java.util.List;
import u2.e;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final e f13524a;

    public o(e eVar) {
        this.f13524a = (e) p.j(eVar);
    }

    public String a() {
        try {
            return this.f13524a.P();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void b() {
        try {
            this.f13524a.r();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void c(boolean z9) {
        try {
            this.f13524a.X(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void d(int i10) {
        try {
            this.f13524a.v(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void e(boolean z9) {
        try {
            this.f13524a.G(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        try {
            return this.f13524a.P0(((o) obj).f13524a);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void f(List<? extends List<LatLng>> list) {
        try {
            this.f13524a.s1(list);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void g(List<LatLng> list) {
        try {
            p.k(list, "points must not be null.");
            this.f13524a.w0(list);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void h(int i10) {
        try {
            this.f13524a.W(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f13524a.e();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void i(float f10) {
        try {
            this.f13524a.K(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void j(boolean z9) {
        try {
            this.f13524a.C(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void k(float f10) {
        try {
            this.f13524a.O(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
