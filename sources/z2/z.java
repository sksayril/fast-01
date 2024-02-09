package z2;

import android.os.RemoteException;
import h2.p;
import u2.k;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final k f13565a;

    public z(k kVar) {
        this.f13565a = (k) p.j(kVar);
    }

    public void a() {
        try {
            this.f13565a.g();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean b() {
        try {
            return this.f13565a.r();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public String c() {
        try {
            return this.f13565a.h();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public float d() {
        try {
            return this.f13565a.c();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public float e() {
        try {
            return this.f13565a.d();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        try {
            return this.f13565a.H1(((z) obj).f13565a);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public boolean f() {
        try {
            return this.f13565a.m();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void g() {
        try {
            this.f13565a.e();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void h(boolean z9) {
        try {
            this.f13565a.z1(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public int hashCode() {
        try {
            return this.f13565a.f();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void i(float f10) {
        try {
            this.f13565a.N1(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void j(boolean z9) {
        try {
            this.f13565a.d0(z9);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public void k(float f10) {
        try {
            this.f13565a.r0(f10);
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
