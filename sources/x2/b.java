package x2;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import h2.p;
import y2.a;
import z2.t;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static a f13147a;

    public static a a(CameraPosition cameraPosition) {
        p.k(cameraPosition, "cameraPosition must not be null");
        try {
            return new a(l().M0(cameraPosition));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a b(LatLng latLng) {
        p.k(latLng, "latLng must not be null");
        try {
            return new a(l().y1(latLng));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a c(LatLngBounds latLngBounds, int i10) {
        p.k(latLngBounds, "bounds must not be null");
        try {
            return new a(l().g0(latLngBounds, i10));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a d(LatLng latLng, float f10) {
        p.k(latLng, "latLng must not be null");
        try {
            return new a(l().o2(latLng, f10));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a e(float f10, float f11) {
        try {
            return new a(l().q2(f10, f11));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a f(float f10) {
        try {
            return new a(l().k0(f10));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a g(float f10, Point point) {
        p.k(point, "focus must not be null");
        try {
            return new a(l().K2(f10, point.x, point.y));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a h() {
        try {
            return new a(l().b2());
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a i() {
        try {
            return new a(l().q1());
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static a j(float f10) {
        try {
            return new a(l().Z1(f10));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public static void k(a aVar) {
        f13147a = (a) p.j(aVar);
    }

    private static a l() {
        return (a) p.k(f13147a, "CameraUpdateFactory is not initialized");
    }
}
