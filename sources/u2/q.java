package u2;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import o2.b;

public final class q extends a implements s {
    q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public final b I0(float f10) {
        Parcel J = J();
        J.writeFloat(f10);
        Parcel B = B(5, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b Y0(String str) {
        Parcel J = J();
        J.writeString(str);
        Parcel B = B(2, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b c() {
        Parcel B = B(4, J());
        b J = b.a.J(B.readStrongBinder());
        B.recycle();
        return J;
    }

    public final b o1(Bitmap bitmap) {
        Parcel J = J();
        p.d(J, bitmap);
        Parcel B = B(6, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }
}
