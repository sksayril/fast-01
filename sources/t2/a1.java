package t2;

import android.os.Parcel;

public abstract class a1 extends e implements b1 {
    public a1() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            n.b(parcel);
            a3((x0) n.a(parcel, x0.CREATOR));
        } else if (i10 != 2) {
            return false;
        } else {
            d();
        }
        return true;
    }
}
