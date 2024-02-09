package z2;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import h2.p;
import u2.b;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final b f13506a;

    public l(b bVar) {
        this.f13506a = (b) p.j(bVar);
    }

    public String a() {
        try {
            return this.f13506a.k();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public LatLng b() {
        try {
            return this.f13506a.e();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void c() {
        try {
            this.f13506a.F();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean d() {
        try {
            return this.f13506a.t0();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void e() {
        try {
            this.f13506a.n();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        try {
            return this.f13506a.X2(((l) obj).f13506a);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void f(float f10) {
        try {
            this.f13506a.D1(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void g(float f10, float f11) {
        try {
            this.f13506a.u2(f10, f11);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void h(boolean z9) {
        try {
            this.f13506a.w(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f13506a.h();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void i(boolean z9) {
        try {
            this.f13506a.G(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void j(a aVar) {
        if (aVar == null) {
            try {
                this.f13506a.c2((o2.b) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13506a.c2(aVar.a());
        }
    }

    public void k(float f10, float f11) {
        try {
            this.f13506a.j2(f10, f11);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void l(LatLng latLng) {
        if (latLng != null) {
            try {
                this.f13506a.w2(latLng);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
    }

    public void m(float f10) {
        try {
            this.f13506a.J0(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void n(String str) {
        try {
            this.f13506a.Y1(str);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void o(String str) {
        try {
            this.f13506a.z0(str);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void p(boolean z9) {
        try {
            this.f13506a.C(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void q(float f10) {
        try {
            this.f13506a.O(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void r() {
        try {
            this.f13506a.A0();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
