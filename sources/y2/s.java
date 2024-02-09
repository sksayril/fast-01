package y2;

import android.os.Parcel;
import u2.b;
import u2.o;
import u2.p;
import u2.x;

public abstract class s extends o implements t {
    public s() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            b J = x.J(parcel.readStrongBinder());
            p.b(parcel);
            K0(J);
        } else if (i10 == 2) {
            b J2 = x.J(parcel.readStrongBinder());
            p.b(parcel);
            q(J2);
        } else if (i10 != 3) {
            return false;
        } else {
            b J3 = x.J(parcel.readStrongBinder());
            p.b(parcel);
            v1(J3);
        }
        parcel2.writeNoException();
        return true;
    }
}
