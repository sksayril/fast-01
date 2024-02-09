package h2;

import android.os.IBinder;
import android.os.Parcel;
import o2.b;
import s2.a;

public final class q1 extends a implements s1 {
    q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int b() {
        Parcel B = B(2, J());
        int readInt = B.readInt();
        B.recycle();
        return readInt;
    }

    public final b c() {
        Parcel B = B(1, J());
        b J = b.a.J(B.readStrongBinder());
        B.recycle();
        return J;
    }
}
