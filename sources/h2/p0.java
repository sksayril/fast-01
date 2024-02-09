package h2;

import android.os.Bundle;
import android.os.Parcel;
import s2.b;
import s2.c;

public abstract class p0 extends b implements l {
    public p0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            c.b(parcel);
            Y2(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i10 == 2) {
            c.b(parcel);
            O1(parcel.readInt(), (Bundle) c.a(parcel, Bundle.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            c.b(parcel);
            E1(parcel.readInt(), parcel.readStrongBinder(), (d1) c.a(parcel, d1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
