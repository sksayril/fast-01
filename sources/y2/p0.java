package y2;

import android.os.Parcel;
import u2.o;
import u2.p;
import u2.u;
import u2.v;

public abstract class p0 extends o implements q0 {
    public p0() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        v J = u.J(parcel.readStrongBinder());
        p.b(parcel);
        b3(J);
        parcel2.writeNoException();
        return true;
    }
}
