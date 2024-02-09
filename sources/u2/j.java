package u2;

import android.os.IBinder;
import android.os.IInterface;

public abstract class j extends o implements k {
    public static k J(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new i(iBinder);
    }
}
