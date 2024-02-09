package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import o2.b;
import s2.a;
import s2.c;

public final class n extends a {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final b Y(b bVar, String str, int i10, b bVar2) {
        Parcel J = J();
        c.e(J, bVar);
        J.writeString(str);
        J.writeInt(i10);
        c.e(J, bVar2);
        Parcel B = B(2, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b e3(b bVar, String str, int i10, b bVar2) {
        Parcel J = J();
        c.e(J, bVar);
        J.writeString(str);
        J.writeInt(i10);
        c.e(J, bVar2);
        Parcel B = B(3, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }
}
