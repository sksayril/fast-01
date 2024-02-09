package u2;

import android.os.IBinder;
import android.os.IInterface;

public abstract class x extends o implements b {
    public static b J(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new w(iBinder);
    }
}
