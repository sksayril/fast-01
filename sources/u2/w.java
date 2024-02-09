package u2;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import o2.b;

public final class w extends a implements b {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    public final void A0() {
        Y(11, J());
    }

    public final void C(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(14, J);
    }

    public final void D1(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(25, J);
    }

    public final void F() {
        Y(12, J());
    }

    public final void G(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(20, J);
    }

    public final void J0(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(22, J);
    }

    public final void O(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(27, J);
    }

    public final boolean X2(b bVar) {
        Parcel J = J();
        p.f(J, bVar);
        Parcel B = B(16, J);
        boolean g10 = p.g(B);
        B.recycle();
        return g10;
    }

    public final void Y1(String str) {
        Parcel J = J();
        J.writeString(str);
        Y(7, J);
    }

    public final void c2(b bVar) {
        Parcel J = J();
        p.f(J, bVar);
        Y(18, J);
    }

    public final LatLng e() {
        Parcel B = B(4, J());
        LatLng latLng = (LatLng) p.a(B, LatLng.CREATOR);
        B.recycle();
        return latLng;
    }

    public final int h() {
        Parcel B = B(17, J());
        int readInt = B.readInt();
        B.recycle();
        return readInt;
    }

    public final void j2(float f10, float f11) {
        Parcel J = J();
        J.writeFloat(f10);
        J.writeFloat(f11);
        Y(24, J);
    }

    public final String k() {
        Parcel B = B(2, J());
        String readString = B.readString();
        B.recycle();
        return readString;
    }

    public final void n() {
        Y(1, J());
    }

    public final boolean t0() {
        Parcel B = B(13, J());
        boolean g10 = p.g(B);
        B.recycle();
        return g10;
    }

    public final void u2(float f10, float f11) {
        Parcel J = J();
        J.writeFloat(f10);
        J.writeFloat(f11);
        Y(19, J);
    }

    public final void w(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(9, J);
    }

    public final void w2(LatLng latLng) {
        Parcel J = J();
        p.d(J, latLng);
        Y(3, J);
    }

    public final void z0(String str) {
        Parcel J = J();
        J.writeString(str);
        Y(5, J);
    }
}
