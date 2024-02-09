package y2;

import android.os.Parcel;
import u2.g;
import u2.h;
import u2.o;
import u2.p;

public abstract class x extends o implements y {
    public x() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        h J = g.J(parcel.readStrongBinder());
        p.b(parcel);
        h0(J);
        parcel2.writeNoException();
        return true;
    }
}
