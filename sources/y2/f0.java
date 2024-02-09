package y2;

import android.os.IBinder;
import android.os.Parcel;
import o2.b;
import u2.a;
import u2.p;
import u2.r;
import u2.s;

public final class f0 extends a implements g0 {
    f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    public final void N2(b bVar, int i10) {
        Parcel J = J();
        p.f(J, bVar);
        J.writeInt(i10);
        Y(6, J);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final y2.c V2(o2.b r3, com.google.android.gms.maps.GoogleMapOptions r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.J()
            u2.p.f(r0, r3)
            u2.p.d(r0, r4)
            r3 = 3
            android.os.Parcel r3 = r2.B(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof y2.c
            if (r1 == 0) goto L_0x0025
            r4 = r0
            y2.c r4 = (y2.c) r4
            goto L_0x002b
        L_0x0025:
            y2.i0 r0 = new y2.i0
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.f0.V2(o2.b, com.google.android.gms.maps.GoogleMapOptions):y2.c");
    }

    public final int c() {
        Parcel B = B(9, J());
        int readInt = B.readInt();
        B.recycle();
        return readInt;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final y2.a d() {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.J()
            r1 = 4
            android.os.Parcel r0 = r4.B(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof y2.a
            if (r3 == 0) goto L_0x001f
            r1 = r2
            y2.a r1 = (y2.a) r1
            goto L_0x0025
        L_0x001f:
            y2.u r2 = new y2.u
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.f0.d():y2.a");
    }

    public final s k() {
        Parcel B = B(5, J());
        s J = r.J(B.readStrongBinder());
        B.recycle();
        return J;
    }

    public final void u0(b bVar, int i10) {
        Parcel J = J();
        p.f(J, bVar);
        J.writeInt(i10);
        Y(10, J);
    }
}
