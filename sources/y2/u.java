package y2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import o2.b;
import u2.a;
import u2.p;

public final class u extends a implements a {
    u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final b K2(float f10, int i10, int i11) {
        Parcel J = J();
        J.writeFloat(f10);
        J.writeInt(i10);
        J.writeInt(i11);
        Parcel B = B(6, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b M0(CameraPosition cameraPosition) {
        Parcel J = J();
        p.d(J, cameraPosition);
        Parcel B = B(7, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b Z1(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Parcel B = B(4, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b b2() {
        Parcel B = B(1, J());
        b J = b.a.J(B.readStrongBinder());
        B.recycle();
        return J;
    }

    public final b g0(LatLngBounds latLngBounds, int i10) {
        Parcel J = J();
        p.d(J, latLngBounds);
        J.writeInt(i10);
        Parcel B = B(10, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b k0(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Parcel B = B(5, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b o2(LatLng latLng, float f10) {
        Parcel J = J();
        p.d(J, latLng);
        J.writeFloat(f10);
        Parcel B = B(9, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b q1() {
        Parcel B = B(2, J());
        b J = b.a.J(B.readStrongBinder());
        B.recycle();
        return J;
    }

    public final b q2(float f10, float f11) {
        Parcel J = J();
        J.writeFloat(f10);
        J.writeFloat(f11);
        Parcel B = B(3, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b y1(LatLng latLng) {
        Parcel J = J();
        p.d(J, latLng);
        Parcel B = B(8, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }
}
