package y2;

import android.os.Parcel;
import u2.b;
import u2.o;
import u2.p;
import u2.x;

public abstract class q extends o implements r {
    public q() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        b J = x.J(parcel.readStrongBinder());
        p.b(parcel);
        boolean q9 = q(J);
        parcel2.writeNoException();
        p.c(parcel2, q9);
        return true;
    }
}
