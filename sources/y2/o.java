package y2;

public abstract class o extends u2.o implements p {
    public o() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) {
        /*
            r2 = this;
            r6 = 1
            if (r3 != r6) goto L_0x0029
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x000b
            r3 = 0
            goto L_0x001f
        L_0x000b:
            java.lang.String r0 = "com.google.android.gms.maps.internal.IGoogleMapDelegate"
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r1 = r0 instanceof y2.b
            if (r1 == 0) goto L_0x0019
            r3 = r0
            y2.b r3 = (y2.b) r3
            goto L_0x001f
        L_0x0019:
            y2.h0 r0 = new y2.h0
            r0.<init>(r3)
            r3 = r0
        L_0x001f:
            u2.p.b(r4)
            r2.f2(r3)
            r5.writeNoException()
            return r6
        L_0x0029:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.o.B(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
