package u2;

import android.os.IBinder;
import android.os.IInterface;

public abstract class g extends o implements h {
    public static h J(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new f(iBinder);
    }
}
