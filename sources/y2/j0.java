package y2;

import android.os.Parcel;
import u2.o;

public abstract class j0 extends o implements k0 {
    public j0() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
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
