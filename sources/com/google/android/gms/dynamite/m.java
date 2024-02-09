package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import o2.b;
import s2.a;
import s2.c;

public final class m extends a {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int Y() {
        Parcel B = B(6, J());
        int readInt = B.readInt();
        B.recycle();
        return readInt;
    }

    public final int e3(b bVar, String str, boolean z9) {
        Parcel J = J();
        c.e(J, bVar);
        J.writeString(str);
        c.c(J, z9);
        Parcel B = B(3, J);
        int readInt = B.readInt();
        B.recycle();
        return readInt;
    }

    public final int f3(b bVar, String str, boolean z9) {
        Parcel J = J();
        c.e(J, bVar);
        J.writeString(str);
        c.c(J, z9);
        Parcel B = B(5, J);
        int readInt = B.readInt();
        B.recycle();
        return readInt;
    }

    public final b g3(b bVar, String str, int i10) {
        Parcel J = J();
        c.e(J, bVar);
        J.writeString(str);
        J.writeInt(i10);
        Parcel B = B(2, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b h3(b bVar, String str, int i10, b bVar2) {
        Parcel J = J();
        c.e(J, bVar);
        J.writeString(str);
        J.writeInt(i10);
        c.e(J, bVar2);
        Parcel B = B(8, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b i3(b bVar, String str, int i10) {
        Parcel J = J();
        c.e(J, bVar);
        J.writeString(str);
        J.writeInt(i10);
        Parcel B = B(4, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }

    public final b j3(b bVar, String str, boolean z9, long j10) {
        Parcel J = J();
        c.e(J, bVar);
        J.writeString(str);
        c.c(J, z9);
        J.writeLong(j10);
        Parcel B = B(7, J);
        b J2 = b.a.J(B.readStrongBinder());
        B.recycle();
        return J2;
    }
}
