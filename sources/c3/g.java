package c3;

import android.os.IBinder;
import android.os.Parcel;
import r2.a;
import r2.c;

public final class g extends a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void e3(j jVar, f fVar) {
        Parcel B = B();
        c.c(B, jVar);
        c.d(B, fVar);
        J(12, B);
    }
}
