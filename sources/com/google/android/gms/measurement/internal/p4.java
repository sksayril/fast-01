package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.z0;

public abstract class p4 extends z0 implements q4 {
    public p4() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0157, code lost:
        r9.writeNoException();
        r9.writeTypedList(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01c0, code lost:
        r9.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            switch(r7) {
                case 1: goto L_0x01aa;
                case 2: goto L_0x0193;
                case 3: goto L_0x0003;
                case 4: goto L_0x0184;
                case 5: goto L_0x016d;
                case 6: goto L_0x015e;
                case 7: goto L_0x0144;
                case 8: goto L_0x0003;
                case 9: goto L_0x0129;
                case 10: goto L_0x0110;
                case 11: goto L_0x00f9;
                case 12: goto L_0x00e1;
                case 13: goto L_0x00d1;
                case 14: goto L_0x00b4;
                case 15: goto L_0x009b;
                case 16: goto L_0x0082;
                case 17: goto L_0x006d;
                case 18: goto L_0x005d;
                case 19: goto L_0x0045;
                case 20: goto L_0x0035;
                case 21: goto L_0x001e;
                case 22: goto L_0x0003;
                case 23: goto L_0x0003;
                case 24: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r7 = 0
            return r7
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r7 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.sc r7 = (com.google.android.gms.measurement.internal.sc) r7
            android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.y0.a(r8, r10)
            android.os.Bundle r10 = (android.os.Bundle) r10
            com.google.android.gms.internal.measurement.y0.f(r8)
            java.util.List r7 = r6.d2(r7, r10)
            goto L_0x0157
        L_0x001e:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r7 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.sc r7 = (com.google.android.gms.measurement.internal.sc) r7
            com.google.android.gms.internal.measurement.y0.f(r8)
            com.google.android.gms.measurement.internal.n r7 = r6.T0(r7)
            r9.writeNoException()
            com.google.android.gms.internal.measurement.y0.g(r9, r7)
            goto L_0x01c3
        L_0x0035:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r7 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.sc r7 = (com.google.android.gms.measurement.internal.sc) r7
            com.google.android.gms.internal.measurement.y0.f(r8)
            r6.b1(r7)
            goto L_0x01c0
        L_0x0045:
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r10 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.y0.a(r8, r10)
            com.google.android.gms.measurement.internal.sc r10 = (com.google.android.gms.measurement.internal.sc) r10
            com.google.android.gms.internal.measurement.y0.f(r8)
            r6.c1(r7, r10)
            goto L_0x01c0
        L_0x005d:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r7 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.sc r7 = (com.google.android.gms.measurement.internal.sc) r7
            com.google.android.gms.internal.measurement.y0.f(r8)
            r6.l0(r7)
            goto L_0x01c0
        L_0x006d:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            com.google.android.gms.internal.measurement.y0.f(r8)
            java.util.List r7 = r6.z2(r7, r10, r0)
            goto L_0x0157
        L_0x0082:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r0 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.measurement.y0.a(r8, r0)
            com.google.android.gms.measurement.internal.sc r0 = (com.google.android.gms.measurement.internal.sc) r0
            com.google.android.gms.internal.measurement.y0.f(r8)
            java.util.List r7 = r6.c0(r7, r10, r0)
            goto L_0x0157
        L_0x009b:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            boolean r1 = com.google.android.gms.internal.measurement.y0.h(r8)
            com.google.android.gms.internal.measurement.y0.f(r8)
            java.util.List r7 = r6.V0(r7, r10, r0, r1)
            goto L_0x0157
        L_0x00b4:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            boolean r0 = com.google.android.gms.internal.measurement.y0.h(r8)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r1 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.measurement.y0.a(r8, r1)
            com.google.android.gms.measurement.internal.sc r1 = (com.google.android.gms.measurement.internal.sc) r1
            com.google.android.gms.internal.measurement.y0.f(r8)
            java.util.List r7 = r6.u1(r7, r10, r0, r1)
            goto L_0x0157
        L_0x00d1:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.e> r7 = com.google.android.gms.measurement.internal.e.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.e r7 = (com.google.android.gms.measurement.internal.e) r7
            com.google.android.gms.internal.measurement.y0.f(r8)
            r6.x0(r7)
            goto L_0x01c0
        L_0x00e1:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.e> r7 = com.google.android.gms.measurement.internal.e.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.e r7 = (com.google.android.gms.measurement.internal.e) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r10 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.y0.a(r8, r10)
            com.google.android.gms.measurement.internal.sc r10 = (com.google.android.gms.measurement.internal.sc) r10
            com.google.android.gms.internal.measurement.y0.f(r8)
            r6.G2(r7, r10)
            goto L_0x01c0
        L_0x00f9:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r7 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.sc r7 = (com.google.android.gms.measurement.internal.sc) r7
            com.google.android.gms.internal.measurement.y0.f(r8)
            java.lang.String r7 = r6.K1(r7)
            r9.writeNoException()
            r9.writeString(r7)
            goto L_0x01c3
        L_0x0110:
            long r1 = r8.readLong()
            java.lang.String r3 = r8.readString()
            java.lang.String r4 = r8.readString()
            java.lang.String r5 = r8.readString()
            com.google.android.gms.internal.measurement.y0.f(r8)
            r0 = r6
            r0.s2(r1, r3, r4, r5)
            goto L_0x01c0
        L_0x0129:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.i0> r7 = com.google.android.gms.measurement.internal.i0.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.i0 r7 = (com.google.android.gms.measurement.internal.i0) r7
            java.lang.String r10 = r8.readString()
            com.google.android.gms.internal.measurement.y0.f(r8)
            byte[] r7 = r6.v2(r7, r10)
            r9.writeNoException()
            r9.writeByteArray(r7)
            goto L_0x01c3
        L_0x0144:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r7 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.sc r7 = (com.google.android.gms.measurement.internal.sc) r7
            boolean r10 = com.google.android.gms.internal.measurement.y0.h(r8)
            com.google.android.gms.internal.measurement.y0.f(r8)
            java.util.List r7 = r6.m2(r7, r10)
        L_0x0157:
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x01c3
        L_0x015e:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r7 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.sc r7 = (com.google.android.gms.measurement.internal.sc) r7
            com.google.android.gms.internal.measurement.y0.f(r8)
            r6.d1(r7)
            goto L_0x01c0
        L_0x016d:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.i0> r7 = com.google.android.gms.measurement.internal.i0.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.i0 r7 = (com.google.android.gms.measurement.internal.i0) r7
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            com.google.android.gms.internal.measurement.y0.f(r8)
            r6.P1(r7, r10, r0)
            goto L_0x01c0
        L_0x0184:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r7 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.sc r7 = (com.google.android.gms.measurement.internal.sc) r7
            com.google.android.gms.internal.measurement.y0.f(r8)
            r6.y2(r7)
            goto L_0x01c0
        L_0x0193:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.nc> r7 = com.google.android.gms.measurement.internal.nc.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.nc r7 = (com.google.android.gms.measurement.internal.nc) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r10 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.y0.a(r8, r10)
            com.google.android.gms.measurement.internal.sc r10 = (com.google.android.gms.measurement.internal.sc) r10
            com.google.android.gms.internal.measurement.y0.f(r8)
            r6.I2(r7, r10)
            goto L_0x01c0
        L_0x01aa:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.i0> r7 = com.google.android.gms.measurement.internal.i0.CREATOR
            android.os.Parcelable r7 = com.google.android.gms.internal.measurement.y0.a(r8, r7)
            com.google.android.gms.measurement.internal.i0 r7 = (com.google.android.gms.measurement.internal.i0) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sc> r10 = com.google.android.gms.measurement.internal.sc.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.measurement.y0.a(r8, r10)
            com.google.android.gms.measurement.internal.sc r10 = (com.google.android.gms.measurement.internal.sc) r10
            com.google.android.gms.internal.measurement.y0.f(r8)
            r6.a2(r7, r10)
        L_0x01c0:
            r9.writeNoException()
        L_0x01c3:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.p4.B(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
