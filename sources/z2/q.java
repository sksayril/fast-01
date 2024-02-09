package z2;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import h2.p;
import java.util.List;
import u2.h;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final h f13536a;

    public q(h hVar) {
        this.f13536a = (h) p.j(hVar);
    }

    public String a() {
        try {
            return this.f13536a.i();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void b() {
        try {
            this.f13536a.m();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void c(boolean z9) {
        try {
            this.f13536a.w(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void d(int i10) {
        try {
            this.f13536a.O0(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void e(d dVar) {
        p.k(dVar, "endCap must not be null");
        try {
            this.f13536a.f1(dVar);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        try {
            return this.f13536a.m0(((q) obj).f13536a);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void f(boolean z9) {
        try {
            this.f13536a.J2(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void g(int i10) {
        try {
            this.f13536a.W(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void h(List<n> list) {
        try {
            this.f13536a.V1(list);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f13536a.g();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void i(List<LatLng> list) {
        p.k(list, "points must not be null");
        try {
            this.f13536a.e1(list);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void j(d dVar) {
        p.k(dVar, "startCap must not be null");
        try {
            this.f13536a.d3(dVar);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void k(boolean z9) {
        try {
            this.f13536a.H2(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void l(float f10) {
        try {
            this.f13536a.f0(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void m(float f10) {
        try {
            this.f13536a.E0(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
