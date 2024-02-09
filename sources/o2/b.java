package o2;

import android.os.IBinder;
import android.os.IInterface;

public interface b extends IInterface {

    public static abstract class a extends s2.b implements b {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static b J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof b ? (b) queryLocalInterface : new l(iBinder);
        }
    }
}
