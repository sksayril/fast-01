package h2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s2.b;
import s2.c;

public abstract class r1 extends b implements s1 {
    public r1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static s1 J(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof s1 ? (s1) queryLocalInterface : new q1(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean B(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            o2.b c10 = c();
            parcel2.writeNoException();
            c.e(parcel2, c10);
        } else if (i10 != 2) {
            return false;
        } else {
            int b10 = b();
            parcel2.writeNoException();
            parcel2.writeInt(b10);
        }
        return true;
    }
}
