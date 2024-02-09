package u2;

import android.os.IBinder;
import android.os.IInterface;

public abstract class u extends o implements v {
    public static v J(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return queryLocalInterface instanceof v ? (v) queryLocalInterface : new t(iBinder);
    }
}
