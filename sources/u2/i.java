package u2;

import android.os.IBinder;
import android.os.Parcel;

public final class i extends a implements k {
    i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    public final boolean H1(k kVar) {
        Parcel J = J();
        p.f(J, kVar);
        Parcel B = B(8, J);
        boolean g10 = p.g(B);
        B.recycle();
        return g10;
    }

    public final void N1(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(12, J);
    }

    public final float c() {
        Parcel B = B(13, J());
        float readFloat = B.readFloat();
        B.recycle();
        return readFloat;
    }

    public final float d() {
        Parcel B = B(5, J());
        float readFloat = B.readFloat();
        B.recycle();
        return readFloat;
    }

    public final void d0(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(6, J);
    }

    public final void e() {
        Y(1, J());
    }

    public final int f() {
        Parcel B = B(9, J());
        int readInt = B.readInt();
        B.recycle();
        return readInt;
    }

    public final void g() {
        Y(2, J());
    }

    public final String h() {
        Parcel B = B(3, J());
        String readString = B.readString();
        B.recycle();
        return readString;
    }

    public final boolean m() {
        Parcel B = B(7, J());
        boolean g10 = p.g(B);
        B.recycle();
        return g10;
    }

    public final boolean r() {
        Parcel B = B(11, J());
        boolean g10 = p.g(B);
        B.recycle();
        return g10;
    }

    public final void r0(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Y(4, J);
    }

    public final void z1(boolean z9) {
        Parcel J = J();
        p.c(J, z9);
        Y(10, J);
    }
}
