package q2;

import android.os.IBinder;
import android.os.Parcel;

public final class d extends a implements f {
    d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final boolean X0(boolean z9) {
        Parcel B = B();
        c.a(B, true);
        Parcel J = J(2, B);
        boolean b10 = c.b(J);
        J.recycle();
        return b10;
    }

    public final String b() {
        Parcel J = J(1, B());
        String readString = J.readString();
        J.recycle();
        return readString;
    }
}
