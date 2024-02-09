package t2;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class e1 extends e implements f1 {
    public e1() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        n.b(parcel);
        S0((Status) n.a(parcel, Status.CREATOR), (Location) n.a(parcel, Location.CREATOR));
        return true;
    }
}
