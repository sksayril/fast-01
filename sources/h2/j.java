package h2;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import s2.b;

public interface j extends IInterface {

    public static abstract class a extends b implements j {
        public static j J(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof j ? (j) queryLocalInterface : new p1(iBinder);
        }
    }

    Account a();
}
