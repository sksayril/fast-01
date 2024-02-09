package z2;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import h2.p;
import u2.v;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final v f13487a;

    public e(v vVar) {
        this.f13487a = (v) p.j(vVar);
    }

    public String a() {
        try {
            return this.f13487a.i();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void b() {
        try {
            this.f13487a.n();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void c(LatLng latLng) {
        try {
            p.k(latLng, "center must not be null.");
            this.f13487a.w1(latLng);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void d(boolean z9) {
        try {
            this.f13487a.X(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void e(int i10) {
        try {
            this.f13487a.v(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        try {
            return this.f13487a.C1(((e) obj).f13487a);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void f(double d10) {
        try {
            this.f13487a.C0(d10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void g(int i10) {
        try {
            this.f13487a.J1(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void h(float f10) {
        try {
            this.f13487a.R2(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final int hashCode() {
        try {
            return this.f13487a.e();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void i(boolean z9) {
        try {
            this.f13487a.T1(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void j(float f10) {
        try {
            this.f13487a.K(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
