package u2;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import z2.d;

public final class f extends a implements h {
    f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    public final void E0(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(9, J);
    }

    public final void H2(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(11, J);
    }

    public final void J2(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(13, J);
    }

    public final void O0(int i10) {
        Parcel J = J();
        J.writeInt(i10);
        Y(7, J);
    }

    public final void V1(List list) {
        Parcel J = J();
        J.writeTypedList(list);
        Y(25, J);
    }

    public final void W(int i10) {
        Parcel J = J();
        J.writeInt(i10);
        Y(23, J);
    }

    public final void d3(d dVar) {
        Parcel J = J();
        p.d(J, dVar);
        Y(19, J);
    }

    public final void e1(List list) {
        Parcel J = J();
        J.writeTypedList(list);
        Y(3, J);
    }

    public final void f0(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(5, J);
    }

    public final void f1(d dVar) {
        Parcel J = J();
        p.d(J, dVar);
        Y(21, J);
    }

    public final int g() {
        Parcel B = B(16, J());
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

    public final void m() {
        Y(1, J());
    }

    public final boolean m0(h hVar) {
        Parcel J = J();
        p.f(J, hVar);
        Parcel B = B(15, J);
        boolean g10 = p.g(B);
        B.recycle();
        return g10;
    }

    public final void w(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(17, J);
    }
}
