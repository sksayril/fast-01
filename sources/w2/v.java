package w2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import t2.e;
import t2.n;

public abstract class v extends e implements w {
    public v() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static w J(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof w ? (w) queryLocalInterface : new u(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            n.b(parcel);
            Z2((LocationResult) n.a(parcel, LocationResult.CREATOR));
        } else if (i10 == 2) {
            n.b(parcel);
            W0((LocationAvailability) n.a(parcel, LocationAvailability.CREATOR));
        } else if (i10 != 3) {
            return false;
        } else {
            f();
        }
        return true;
    }
}
