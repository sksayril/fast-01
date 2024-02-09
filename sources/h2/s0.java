package h2;

import android.os.IBinder;
import android.os.IInterface;
import s2.b;

public abstract class s0 extends b implements t0 {
    public static t0 J(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof t0 ? (t0) queryLocalInterface : new r0(iBinder);
    }
}
