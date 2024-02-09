package x2;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import h2.p;
import java.util.HashMap;
import y2.k0;
import y2.m0;
import y2.n;
import y2.o0;
import y2.q0;
import y2.r;
import y2.w;
import y2.y;
import z2.a0;
import z2.o;
import z2.q;
import z2.t;
import z2.z;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final y2.b f13148a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f13149b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private i f13150c;

    public interface a {
        void C();
    }

    public interface b {
        void m();
    }

    /* renamed from: x2.c$c  reason: collision with other inner class name */
    public interface C0226c {
        void f(int i10);
    }

    public interface d {
        void p(z2.e eVar);
    }

    public interface e {
        void a(z2.l lVar);
    }

    public interface f {
        void w(LatLng latLng);
    }

    public interface g {
        void a();
    }

    public interface h {
        void v(LatLng latLng);
    }

    public interface i {
        boolean q(z2.l lVar);
    }

    public interface j {
        void B(z2.l lVar);

        void g(z2.l lVar);

        void o(z2.l lVar);
    }

    public interface k {
        void r(o oVar);
    }

    public interface l {
        void j(q qVar);
    }

    public interface m {
        void a(Bitmap bitmap);
    }

    public c(y2.b bVar) {
        this.f13148a = (y2.b) p.j(bVar);
    }

    public final void A(d dVar) {
        if (dVar == null) {
            try {
                this.f13148a.E2((q0) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.E2(new q(this, dVar));
        }
    }

    public final void B(e eVar) {
        if (eVar == null) {
            try {
                this.f13148a.q0((y2.h) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.q0(new o(this, eVar));
        }
    }

    public final void C(f fVar) {
        if (fVar == null) {
            try {
                this.f13148a.p2((y2.j) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.p2(new x(this, fVar));
        }
    }

    public void D(g gVar) {
        if (gVar == null) {
            try {
                this.f13148a.U1((y2.l) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.U1(new p(this, gVar));
        }
    }

    public final void E(h hVar) {
        if (hVar == null) {
            try {
                this.f13148a.k1((n) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.k1(new y(this, hVar));
        }
    }

    public final void F(i iVar) {
        if (iVar == null) {
            try {
                this.f13148a.Q0((r) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.Q0(new j(this, iVar));
        }
    }

    public final void G(j jVar) {
        if (jVar == null) {
            try {
                this.f13148a.a1((y2.t) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.a1(new n(this, jVar));
        }
    }

    public final void H(k kVar) {
        if (kVar == null) {
            try {
                this.f13148a.R1((w) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.R1(new r(this, kVar));
        }
    }

    public final void I(l lVar) {
        if (lVar == null) {
            try {
                this.f13148a.S2((y) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.S2(new s(this, lVar));
        }
    }

    public final void J(int i10, int i11, int i12, int i13) {
        try {
            this.f13148a.m1(i10, i11, i12, i13);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void K(boolean z9) {
        try {
            this.f13148a.R(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void L(m mVar) {
        p.k(mVar, "Callback must not be null.");
        M(mVar, (Bitmap) null);
    }

    public final void M(m mVar, Bitmap bitmap) {
        p.k(mVar, "Callback must not be null.");
        try {
            this.f13148a.k2(new t(this, mVar), (o2.d) (bitmap != null ? o2.d.e3(bitmap) : null));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final z2.e a(z2.f fVar) {
        try {
            p.k(fVar, "CircleOptions must not be null.");
            return new z2.e(this.f13148a.S1(fVar));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final z2.l b(z2.m mVar) {
        try {
            p.k(mVar, "MarkerOptions must not be null.");
            u2.b p02 = this.f13148a.p0(mVar);
            if (p02 != null) {
                return new z2.l(p02);
            }
            return null;
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final o c(z2.p pVar) {
        try {
            p.k(pVar, "PolygonOptions must not be null");
            return new o(this.f13148a.A2(pVar));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final q d(z2.r rVar) {
        try {
            p.k(rVar, "PolylineOptions must not be null");
            return new q(this.f13148a.p1(rVar));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final z e(a0 a0Var) {
        try {
            p.k(a0Var, "TileOverlayOptions must not be null.");
            u2.k U2 = this.f13148a.U2(a0Var);
            if (U2 != null) {
                return new z(U2);
            }
            return null;
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void f(a aVar) {
        try {
            p.k(aVar, "CameraUpdate must not be null.");
            this.f13148a.O2(aVar.a());
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final CameraPosition g() {
        try {
            return this.f13148a.L1();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final float h() {
        try {
            return this.f13148a.g2();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final float i() {
        try {
            return this.f13148a.n0();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final h j() {
        try {
            return new h(this.f13148a.n1());
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final i k() {
        try {
            if (this.f13150c == null) {
                this.f13150c = new i(this.f13148a.D0());
            }
            return this.f13150c;
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final boolean l() {
        try {
            return this.f13148a.R0();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final boolean m() {
        try {
            return this.f13148a.x2();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void n(a aVar) {
        try {
            p.k(aVar, "CameraUpdate must not be null.");
            this.f13148a.r2(aVar.a());
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void o() {
        try {
            this.f13148a.i0();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void p(boolean z9) {
        try {
            this.f13148a.u(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final boolean q(boolean z9) {
        try {
            return this.f13148a.x(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void r(LatLngBounds latLngBounds) {
        try {
            this.f13148a.L0(latLngBounds);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean s(z2.k kVar) {
        try {
            return this.f13148a.Q1(kVar);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void t(int i10) {
        try {
            this.f13148a.t(i10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void u(float f10) {
        try {
            this.f13148a.D2(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void v(float f10) {
        try {
            this.f13148a.Q2(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void w(boolean z9) {
        try {
            this.f13148a.M(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public final void x(a aVar) {
        if (aVar == null) {
            try {
                this.f13148a.U0((k0) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.U0(new w(this, aVar));
        }
    }

    public final void y(b bVar) {
        if (bVar == null) {
            try {
                this.f13148a.P2((m0) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.P2(new v(this, bVar));
        }
    }

    public final void z(C0226c cVar) {
        if (cVar == null) {
            try {
                this.f13148a.B0((o0) null);
            } catch (RemoteException e10) {
                throw new t(e10);
            }
        } else {
            this.f13148a.B0(new u(this, cVar));
        }
    }
}
