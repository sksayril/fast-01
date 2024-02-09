package y2;

import android.os.Parcel;
import u2.o;
import u2.p;

public abstract class n0 extends o implements o0 {
    public n0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        p.b(parcel);
        j(readInt);
        parcel2.writeNoException();
        return true;
    }
}
