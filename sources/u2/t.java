package u2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public final class t extends a implements v {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    public final void C0(double d10) {
        Parcel J = J();
        J.writeDouble(d10);
        Y(5, J);
    }

    public final boolean C1(v vVar) {
        Parcel J = J();
        p.f(J, vVar);
        Parcel B = B(17, J);
        boolean g10 = p.g(B);
        B.recycle();
        return g10;
    }

    public final void J1(int i10) {
        Parcel J = J();
        J.writeInt(i10);
        Y(9, J);
    }

    public final void K(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(13, J);
    }

    public final void R2(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(7, J);
    }

    public final void T1(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(15, J);
    }

    public final void X(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(19, J);
    }

    public final int e() {
        Parcel B = B(18, J());
        int readInt = B.readInt();
        B.recycle();
        return readInt;
    }

    public final String i() {
        Parcel B = B(2, J());
        String readString = B.readString();
        B.recycle();
        return readString;
    }

    public final void n() {
        Y(1, J());
    }

    public final void v(int i10) {
        Parcel J = J();
        J.writeInt(i10);
        Y(11, J);
    }

    public final void w1(LatLng latLng) {
        Parcel J = J();
        p.d(J, latLng);
        Y(3, J);
    }
}
