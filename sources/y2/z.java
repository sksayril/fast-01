package y2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import o2.b;
import u2.a;
import u2.p;
import z2.c0;

public final class z extends a implements d {
    z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    public final b G1(LatLng latLng) {
        Parcel J = J();
        p.d(J, latLng);
        Parcel B = B(2, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final c0 i2() {
        Parcel B = B(3, J());
        c0 c0Var = (c0) p.a(B, c0.CREATOR);
        B.recycle();
        return c0Var;
    }

    public final LatLng r1(b bVar) {
        Parcel J = J();
        p.f(J, bVar);
        Parcel B = B(1, J);
        LatLng latLng = (LatLng) p.a(B, LatLng.CREATOR);
        B.recycle();
        return latLng;
    }
}
