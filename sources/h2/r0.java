package h2;

import android.os.IBinder;
import android.os.Parcel;
import e2.a0;
import e2.c0;
import e2.e0;
import o2.b;
import s2.a;
import s2.c;

public final class r0 extends a implements t0 {
    r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final c0 F1(a0 a0Var) {
        Parcel J = J();
        c.d(J, a0Var);
        Parcel B = B(6, J);
        c0 c0Var = (c0) c.a(B, c0.CREATOR);
        B.recycle();
        return c0Var;
    }

    public final boolean X1(e0 e0Var, b bVar) {
        Parcel J = J();
        c.d(J, e0Var);
        c.e(J, bVar);
        Parcel B = B(5, J);
        boolean f10 = c.f(B);
        B.recycle();
        return f10;
    }

    public final boolean e() {
        Parcel B = B(7, J());
        boolean f10 = c.f(B);
        B.recycle();
        return f10;
    }

    public final c0 n2(a0 a0Var) {
        Parcel J = J();
        c.d(J, a0Var);
        Parcel B = B(8, J);
        c0 c0Var = (c0) c.a(B, c0.CREATOR);
        B.recycle();
        return c0Var;
    }
}
