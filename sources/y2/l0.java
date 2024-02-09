package y2;

import android.os.Parcel;
import u2.o;

public abstract class l0 extends o implements m0 {
    public l0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        a();
        parcel2.writeNoException();
        return true;
    }
}
