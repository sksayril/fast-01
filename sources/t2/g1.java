package t2;

import android.os.Parcel;
import w2.i;

public abstract class g1 extends e implements h1 {
    public g1() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        n.b(parcel);
        G0((i) n.a(parcel, i.CREATOR));
        return true;
    }
}
