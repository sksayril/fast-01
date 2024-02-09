package y2;

import android.os.Parcel;
import u2.d;
import u2.e;
import u2.o;
import u2.p;

public abstract class v extends o implements w {
    public v() {
        super("com.google.android.gms.maps.internal.IOnPolygonClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        e J = d.J(parcel.readStrongBinder());
        p.b(parcel);
        l2(J);
        parcel2.writeNoException();
        return true;
    }
}
