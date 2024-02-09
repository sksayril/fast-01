package x2;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import h2.p;
import y2.d;
import z2.c0;
import z2.t;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final d f13155a;

    h(d dVar) {
        this.f13155a = dVar;
    }

    public LatLng a(Point point) {
        p.j(point);
        try {
            return this.f13155a.r1(o2.d.e3(point));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public c0 b() {
        try {
            return this.f13155a.i2();
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }

    public Point c(LatLng latLng) {
        p.j(latLng);
        try {
            return (Point) o2.d.Y(this.f13155a.G1(latLng));
        } catch (RemoteException e10) {
            throw new t(e10);
        }
    }
}
