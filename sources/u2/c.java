package u2;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class c extends a implements e {
    c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    public final void C(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(15, J);
    }

    public final void G(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(17, J);
    }

    public final void K(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(7, J);
    }

    public final void O(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(13, J);
    }

    public final String P() {
        Parcel B = B(2, J());
        String readString = B.readString();
        B.recycle();
        return readString;
    }

    public final boolean P0(e eVar) {
        Parcel J = J();
        p.f(J, eVar);
        Parcel B = B(19, J);
        boolean g10 = p.g(B);
        B.recycle();
        return g10;
    }

    public final void W(int i10) {
        Parcel J = J();
        J.writeInt(i10);
        Y(9, J);
    }

    public final void X(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(21, J);
    }

    public final int e() {
        Parcel B = B(20, J());
        int readInt = B.readInt();
        B.recycle();
        return readInt;
    }

    public final void r() {
        Y(1, J());
    }

    public final void s1(List list) {
        Parcel J = J();
        J.writeList(list);
        Y(5, J);
    }

    public final void v(int i10) {
        Parcel J = J();
        J.writeInt(i10);
        Y(11, J);
    }

    public final void w0(List list) {
        Parcel J = J();
        J.writeTypedList(list);
        Y(3, J);
    }
}
