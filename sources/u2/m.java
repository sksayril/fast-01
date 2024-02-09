package u2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import z2.y;

public abstract class m extends o implements n {
    public m() {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public static n J(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
        return queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        p.b(parcel);
        y N0 = N0(readInt, readInt2, readInt3);
        parcel2.writeNoException();
        p.e(parcel2, N0);
        return true;
    }
}
