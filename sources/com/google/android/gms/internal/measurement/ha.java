package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class ha<T> implements va<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f5310r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f5311s = ac.p();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f5312a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f5313b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5314c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5315d;

    /* renamed from: e  reason: collision with root package name */
    private final da f5316e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f5317f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5318g;

    /* renamed from: h  reason: collision with root package name */
    private final ra f5319h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f5320i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f5321j;

    /* renamed from: k  reason: collision with root package name */
    private final int f5322k;

    /* renamed from: l  reason: collision with root package name */
    private final int f5323l;

    /* renamed from: m  reason: collision with root package name */
    private final ka f5324m;

    /* renamed from: n  reason: collision with root package name */
    private final l9 f5325n;

    /* renamed from: o  reason: collision with root package name */
    private final ub<?, ?> f5326o;

    /* renamed from: p  reason: collision with root package name */
    private final e8<?> f5327p;

    /* renamed from: q  reason: collision with root package name */
    private final aa f5328q;

    private ha(int[] iArr, Object[] objArr, int i10, int i11, da daVar, ra raVar, boolean z9, int[] iArr2, int i12, int i13, ka kaVar, l9 l9Var, ub<?, ?> ubVar, e8<?> e8Var, aa aaVar) {
        this.f5312a = iArr;
        this.f5313b = objArr;
        this.f5314c = i10;
        this.f5315d = i11;
        this.f5318g = daVar instanceof p8;
        this.f5319h = raVar;
        this.f5317f = e8Var != null && e8Var.e(daVar);
        this.f5320i = false;
        this.f5321j = iArr2;
        this.f5322k = i12;
        this.f5323l = i13;
        this.f5324m = kaVar;
        this.f5325n = l9Var;
        this.f5326o = ubVar;
        this.f5327p = e8Var;
        this.f5316e = daVar;
        this.f5328q = aaVar;
    }

    private static <T> float A(T t9, long j10) {
        return ((Float) ac.B(t9, j10)).floatValue();
    }

    private final int B(int i10) {
        return this.f5312a[i10 + 2];
    }

    private final void C(T t9, int i10) {
        int B = B(i10);
        long j10 = (long) (1048575 & B);
        if (j10 != 1048575) {
            ac.h(t9, j10, (1 << (B >>> 20)) | ac.t(t9, j10));
        }
    }

    private final void D(T t9, int i10, int i11) {
        ac.h(t9, (long) (B(i11) & 1048575), i10);
    }

    private final void E(T t9, T t10, int i10) {
        int i11 = this.f5312a[i10];
        if (I(t10, i11, i10)) {
            long F = (long) (F(i10) & 1048575);
            Unsafe unsafe = f5311s;
            Object object = unsafe.getObject(t10, F);
            if (object != null) {
                va M = M(i10);
                if (!I(t9, i11, i10)) {
                    if (!S(object)) {
                        unsafe.putObject(t9, F, object);
                    } else {
                        Object zza = M.zza();
                        M.c(zza, object);
                        unsafe.putObject(t9, F, zza);
                    }
                    D(t9, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t9, F);
                if (!S(object2)) {
                    Object zza2 = M.zza();
                    M.c(zza2, object2);
                    unsafe.putObject(t9, F, zza2);
                    object2 = zza2;
                }
                M.c(object2, object);
                return;
            }
            int i12 = this.f5312a[i10];
            String valueOf = String.valueOf(t10);
            throw new IllegalStateException("Source subfield " + i12 + " is present but null: " + valueOf);
        }
    }

    private final int F(int i10) {
        return this.f5312a[i10 + 1];
    }

    private static <T> int G(T t9, long j10) {
        return ((Integer) ac.B(t9, j10)).intValue();
    }

    private final boolean H(T t9, int i10) {
        int B = B(i10);
        long j10 = (long) (B & 1048575);
        if (j10 == 1048575) {
            int F = F(i10);
            long j11 = (long) (F & 1048575);
            switch ((F & 267386880) >>> 20) {
                case 0:
                    return Double.doubleToRawLongBits(ac.a(t9, j11)) != 0;
                case 1:
                    return Float.floatToRawIntBits(ac.n(t9, j11)) != 0;
                case 2:
                    return ac.x(t9, j11) != 0;
                case 3:
                    return ac.x(t9, j11) != 0;
                case 4:
                    return ac.t(t9, j11) != 0;
                case 5:
                    return ac.x(t9, j11) != 0;
                case 6:
                    return ac.t(t9, j11) != 0;
                case 7:
                    return ac.F(t9, j11);
                case 8:
                    Object B2 = ac.B(t9, j11);
                    if (B2 instanceof String) {
                        return !((String) B2).isEmpty();
                    }
                    if (B2 instanceof f7) {
                        return !f7.f5243n.equals(B2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return ac.B(t9, j11) != null;
                case 10:
                    return !f7.f5243n.equals(ac.B(t9, j11));
                case 11:
                    return ac.t(t9, j11) != 0;
                case 12:
                    return ac.t(t9, j11) != 0;
                case 13:
                    return ac.t(t9, j11) != 0;
                case 14:
                    return ac.x(t9, j11) != 0;
                case 15:
                    return ac.t(t9, j11) != 0;
                case 16:
                    return ac.x(t9, j11) != 0;
                case 17:
                    return ac.B(t9, j11) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (ac.t(t9, j10) & (1 << (B >>> 20))) != 0;
        }
    }

    private final boolean I(T t9, int i10, int i11) {
        return ac.t(t9, (long) (B(i11) & 1048575)) == i10;
    }

    private final boolean J(T t9, T t10, int i10) {
        return H(t9, i10) == H(t10, i10);
    }

    private static <T> long K(T t9, long j10) {
        return ((Long) ac.B(t9, j10)).longValue();
    }

    private final x8 L(int i10) {
        return (x8) this.f5313b[((i10 / 3) << 1) + 1];
    }

    private final va M(int i10) {
        int i11 = (i10 / 3) << 1;
        va vaVar = (va) this.f5313b[i11];
        if (vaVar != null) {
            return vaVar;
        }
        va b10 = qa.a().b((Class) this.f5313b[i11 + 1]);
        this.f5313b[i11] = b10;
        return b10;
    }

    private static sb N(Object obj) {
        p8 p8Var = (p8) obj;
        sb sbVar = p8Var.zzb;
        if (sbVar != sb.k()) {
            return sbVar;
        }
        sb l10 = sb.l();
        p8Var.zzb = l10;
        return l10;
    }

    private static <T> boolean O(T t9, long j10) {
        return ((Boolean) ac.B(t9, j10)).booleanValue();
    }

    private final Object P(int i10) {
        return this.f5313b[(i10 / 3) << 1];
    }

    private static void Q(Object obj) {
        if (!S(obj)) {
            String valueOf = String.valueOf(obj);
            throw new IllegalArgumentException("Mutating immutable message: " + valueOf);
        }
    }

    private static boolean R(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean S(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof p8) {
            return ((p8) obj).I();
        }
        return true;
    }

    private static <T> double i(T t9, long j10) {
        return ((Double) ac.B(t9, j10)).doubleValue();
    }

    private final int j(int i10) {
        if (i10 < this.f5314c || i10 > this.f5315d) {
            return -1;
        }
        return k(i10, 0);
    }

    private final int k(int i10, int i11) {
        int length = (this.f5312a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f5312a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0275  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.ha<T> m(java.lang.Class<T> r32, com.google.android.gms.internal.measurement.ba r33, com.google.android.gms.internal.measurement.ka r34, com.google.android.gms.internal.measurement.l9 r35, com.google.android.gms.internal.measurement.ub<?, ?> r36, com.google.android.gms.internal.measurement.e8<?> r37, com.google.android.gms.internal.measurement.aa r38) {
        /*
            r0 = r33
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.sa
            if (r1 == 0) goto L_0x03f5
            com.google.android.gms.internal.measurement.sa r0 = (com.google.android.gms.internal.measurement.sa) r0
            java.lang.String r1 = r0.c()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            r6 = 1
            if (r4 < r5) goto L_0x0026
            r4 = 1
        L_0x001c:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0027
            r4 = r7
            goto L_0x001c
        L_0x0026:
            r7 = 1
        L_0x0027:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0046
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0033:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0043
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L_0x0033
        L_0x0043:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L_0x0046:
            if (r7 != 0) goto L_0x0057
            int[] r7 = f5310r
            r17 = r7
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            goto L_0x0167
        L_0x0057:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0063:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0073
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0063
        L_0x0073:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L_0x0076:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0095
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0082:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x0092
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0082
        L_0x0092:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L_0x0095:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x00b4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00b1
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00a1
        L_0x00b1:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00b4:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00d3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 << 1
            int r16 = r16 + r7
            r7 = r4
            r17 = r13
            r18 = r14
            r4 = r15
            r13 = r9
            r14 = r10
        L_0x0167:
            sun.misc.Unsafe r9 = f5311s
            java.lang.Object[] r10 = r0.d()
            com.google.android.gms.internal.measurement.da r15 = r0.zza()
            java.lang.Class r15 = r15.getClass()
            int r3 = r11 * 3
            int[] r3 = new int[r3]
            int r11 = r11 << r6
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r19 = r18 + r12
            r21 = r18
            r22 = r19
            r12 = 0
            r20 = 0
        L_0x0185:
            if (r4 >= r2) goto L_0x03cf
            int r23 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x01ad
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = r23
            r23 = 13
        L_0x0195:
            int r24 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L_0x01a7
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r23
            r4 = r4 | r8
            int r23 = r23 + 13
            r8 = r24
            goto L_0x0195
        L_0x01a7:
            int r8 = r8 << r23
            r4 = r4 | r8
            r8 = r24
            goto L_0x01af
        L_0x01ad:
            r8 = r23
        L_0x01af:
            int r23 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L_0x01d5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r6 = r23
            r23 = 13
        L_0x01bd:
            int r25 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r5) goto L_0x01cf
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r23
            r8 = r8 | r6
            int r23 = r23 + 13
            r6 = r25
            goto L_0x01bd
        L_0x01cf:
            int r6 = r6 << r23
            r8 = r8 | r6
            r6 = r25
            goto L_0x01d7
        L_0x01d5:
            r6 = r23
        L_0x01d7:
            r5 = r8 & 255(0xff, float:3.57E-43)
            r25 = r2
            r2 = r8 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x01e5
            int r2 = r20 + 1
            r17[r20] = r12
            r20 = r2
        L_0x01e5:
            r2 = 51
            r28 = r14
            if (r5 < r2) goto L_0x0289
            int r2 = r6 + 1
            char r6 = r1.charAt(r6)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x0214
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
        L_0x01fa:
            int r30 = r2 + 1
            char r2 = r1.charAt(r2)
            if (r2 < r14) goto L_0x020f
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r29
            r6 = r6 | r2
            int r29 = r29 + 13
            r2 = r30
            r14 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fa
        L_0x020f:
            int r2 = r2 << r29
            r6 = r6 | r2
            r2 = r30
        L_0x0214:
            int r14 = r5 + -51
            r29 = r2
            r2 = 9
            if (r14 == r2) goto L_0x0243
            r2 = 17
            if (r14 != r2) goto L_0x0221
            goto L_0x0243
        L_0x0221:
            r2 = 12
            if (r14 != r2) goto L_0x0241
            com.google.android.gms.internal.measurement.ra r2 = r0.a()
            com.google.android.gms.internal.measurement.ra r14 = com.google.android.gms.internal.measurement.ra.PROTO2
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x0235
            r2 = r8 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0241
        L_0x0235:
            int r2 = r12 / 3
            r14 = 1
            int r2 = r2 << r14
            int r2 = r2 + r14
            int r24 = r16 + 1
            r16 = r10[r16]
            r11[r2] = r16
            goto L_0x024e
        L_0x0241:
            r14 = 1
            goto L_0x0250
        L_0x0243:
            r14 = 1
            int r2 = r12 / 3
            int r2 = r2 << r14
            int r2 = r2 + r14
            int r24 = r16 + 1
            r16 = r10[r16]
            r11[r2] = r16
        L_0x024e:
            r16 = r24
        L_0x0250:
            int r2 = r6 << 1
            r6 = r10[r2]
            boolean r14 = r6 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x025b
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L_0x0263
        L_0x025b:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = r(r15, r6)
            r10[r2] = r6
        L_0x0263:
            r30 = r13
            long r13 = r9.objectFieldOffset(r6)
            int r6 = (int) r13
            int r2 = r2 + 1
            r13 = r10[r2]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0275
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x027d
        L_0x0275:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = r(r15, r13)
            r10[r2] = r13
        L_0x027d:
            long r13 = r9.objectFieldOffset(r13)
            int r2 = (int) r13
            r26 = r0
            r27 = r29
            r0 = 0
            goto L_0x0392
        L_0x0289:
            r30 = r13
            int r2 = r16 + 1
            r13 = r10[r16]
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = r(r15, r13)
            r14 = 9
            if (r5 == r14) goto L_0x030b
            r14 = 17
            if (r5 != r14) goto L_0x029f
            goto L_0x030b
        L_0x029f:
            r14 = 27
            if (r5 == r14) goto L_0x02fb
            r14 = 49
            if (r5 != r14) goto L_0x02a8
            goto L_0x02fb
        L_0x02a8:
            r14 = 12
            if (r5 == r14) goto L_0x02e1
            r14 = 30
            if (r5 == r14) goto L_0x02e1
            r14 = 44
            if (r5 != r14) goto L_0x02b5
            goto L_0x02e1
        L_0x02b5:
            r14 = 50
            if (r5 != r14) goto L_0x02de
            int r14 = r21 + 1
            r17[r21] = r12
            int r21 = r12 / 3
            r24 = 1
            int r21 = r21 << 1
            int r26 = r2 + 1
            r2 = r10[r2]
            r11[r21] = r2
            r2 = r8 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x02da
            int r21 = r21 + 1
            int r2 = r26 + 1
            r26 = r10[r26]
            r11[r21] = r26
            r26 = r0
            r21 = r14
            goto L_0x0318
        L_0x02da:
            r21 = r14
            r2 = r26
        L_0x02de:
            r26 = r0
            goto L_0x0318
        L_0x02e1:
            com.google.android.gms.internal.measurement.ra r14 = r0.a()
            r26 = r0
            com.google.android.gms.internal.measurement.ra r0 = com.google.android.gms.internal.measurement.ra.PROTO2
            if (r14 == r0) goto L_0x02ef
            r0 = r8 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0318
        L_0x02ef:
            int r0 = r12 / 3
            r14 = 1
            int r0 = r0 << r14
            int r0 = r0 + r14
            int r24 = r2 + 1
            r2 = r10[r2]
            r11[r0] = r2
            goto L_0x0308
        L_0x02fb:
            r26 = r0
            r14 = 1
            int r0 = r12 / 3
            int r0 = r0 << r14
            int r0 = r0 + r14
            int r24 = r2 + 1
            r2 = r10[r2]
            r11[r0] = r2
        L_0x0308:
            r2 = r24
            goto L_0x0318
        L_0x030b:
            r26 = r0
            r14 = 1
            int r0 = r12 / 3
            int r0 = r0 << r14
            int r0 = r0 + r14
            java.lang.Class r14 = r13.getType()
            r11[r0] = r14
        L_0x0318:
            long r13 = r9.objectFieldOffset(r13)
            int r0 = (int) r13
            r13 = r8 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0323
            r14 = 1
            goto L_0x0324
        L_0x0323:
            r14 = 0
        L_0x0324:
            if (r14 == 0) goto L_0x0372
            r13 = 17
            if (r5 > r13) goto L_0x0372
            int r13 = r6 + 1
            char r6 = r1.charAt(r6)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r14) goto L_0x034f
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r23 = 13
        L_0x0339:
            int r27 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r14) goto L_0x034b
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r23
            r6 = r6 | r13
            int r23 = r23 + 13
            r13 = r27
            goto L_0x0339
        L_0x034b:
            int r13 = r13 << r23
            r6 = r6 | r13
            goto L_0x0351
        L_0x034f:
            r27 = r13
        L_0x0351:
            r13 = 1
            int r23 = r7 << 1
            int r24 = r6 / 32
            int r23 = r23 + r24
            r13 = r10[r23]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0361
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x0369
        L_0x0361:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = r(r15, r13)
            r10[r23] = r13
        L_0x0369:
            long r13 = r9.objectFieldOffset(r13)
            int r14 = (int) r13
            int r6 = r6 % 32
            r13 = r14
            goto L_0x0378
        L_0x0372:
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r6
            r6 = 0
        L_0x0378:
            r14 = 18
            if (r5 < r14) goto L_0x038a
            r14 = 49
            if (r5 > r14) goto L_0x038a
            int r14 = r22 + 1
            r17[r22] = r0
            r16 = r2
            r2 = r13
            r22 = r14
            goto L_0x038d
        L_0x038a:
            r16 = r2
            r2 = r13
        L_0x038d:
            r31 = r6
            r6 = r0
            r0 = r31
        L_0x0392:
            int r13 = r12 + 1
            r3[r12] = r4
            int r4 = r13 + 1
            r12 = r8 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x039f
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03a0
        L_0x039f:
            r12 = 0
        L_0x03a0:
            r14 = r8 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x03a7
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a8
        L_0x03a7:
            r14 = 0
        L_0x03a8:
            r12 = r12 | r14
            r8 = r8 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x03b0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03b1
        L_0x03b0:
            r8 = 0
        L_0x03b1:
            r8 = r8 | r12
            int r5 = r5 << 20
            r5 = r5 | r8
            r5 = r5 | r6
            r3[r13] = r5
            int r12 = r4 + 1
            int r0 = r0 << 20
            r0 = r0 | r2
            r3[r4] = r0
            r2 = r25
            r0 = r26
            r4 = r27
            r14 = r28
            r13 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            r6 = 1
            goto L_0x0185
        L_0x03cf:
            r26 = r0
            r30 = r13
            r28 = r14
            com.google.android.gms.internal.measurement.ha r0 = new com.google.android.gms.internal.measurement.ha
            com.google.android.gms.internal.measurement.da r14 = r26.zza()
            com.google.android.gms.internal.measurement.ra r15 = r26.a()
            r16 = 0
            r9 = r0
            r10 = r3
            r12 = r30
            r13 = r28
            r20 = r34
            r21 = r35
            r22 = r36
            r23 = r37
            r24 = r38
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r0
        L_0x03f5:
            com.google.android.gms.internal.measurement.mb r0 = (com.google.android.gms.internal.measurement.mb) r0
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ha.m(java.lang.Class, com.google.android.gms.internal.measurement.ba, com.google.android.gms.internal.measurement.ka, com.google.android.gms.internal.measurement.l9, com.google.android.gms.internal.measurement.ub, com.google.android.gms.internal.measurement.e8, com.google.android.gms.internal.measurement.aa):com.google.android.gms.internal.measurement.ha");
    }

    private final <K, V, UT, UB> UB n(int i10, int i11, Map<K, V> map, x8 x8Var, UB ub, ub<UT, UB> ubVar, Object obj) {
        this.f5328q.a(P(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!x8Var.e(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = ubVar.i(obj);
                }
                o7 C = f7.C(v9.a((y9) null, next.getKey(), next.getValue()));
                try {
                    v9.b(C.b(), (y9) null, next.getKey(), next.getValue());
                    ubVar.c(ub, i11, C.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub;
    }

    private final Object o(T t9, int i10) {
        va M = M(i10);
        long F = (long) (F(i10) & 1048575);
        if (!H(t9, i10)) {
            return M.zza();
        }
        Object object = f5311s.getObject(t9, F);
        if (S(object)) {
            return object;
        }
        Object zza = M.zza();
        if (object != null) {
            M.c(zza, object);
        }
        return zza;
    }

    private final Object p(T t9, int i10, int i11) {
        va M = M(i11);
        if (!I(t9, i10, i11)) {
            return M.zza();
        }
        Object object = f5311s.getObject(t9, (long) (F(i11) & 1048575));
        if (S(object)) {
            return object;
        }
        Object zza = M.zza();
        if (object != null) {
            M.c(zza, object);
        }
        return zza;
    }

    private final <UT, UB> UB q(Object obj, int i10, UB ub, ub<UT, UB> ubVar, Object obj2) {
        x8 L;
        int i11 = this.f5312a[i10];
        Object B = ac.B(obj, (long) (F(i10) & 1048575));
        if (B == null || (L = L(i10)) == null) {
            return ub;
        }
        return n(i10, i11, this.f5328q.g(B), L, ub, ubVar, obj2);
    }

    private static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void s(int i10, Object obj, qc qcVar) {
        if (obj instanceof String) {
            qcVar.D(i10, (String) obj);
        } else {
            qcVar.d(i10, (f7) obj);
        }
    }

    private static <UT, UB> void t(ub<UT, UB> ubVar, T t9, qc qcVar) {
        ubVar.g(ubVar.k(t9), qcVar);
    }

    private final <K, V> void u(qc qcVar, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f5328q.a(P(i11));
            qcVar.n(i10, (y9) null, this.f5328q.b(obj));
        }
    }

    private final void v(T t9, int i10, int i11, Object obj) {
        f5311s.putObject(t9, (long) (F(i11) & 1048575), obj);
        D(t9, i10, i11);
    }

    private final void w(T t9, int i10, Object obj) {
        f5311s.putObject(t9, (long) (F(i10) & 1048575), obj);
        C(t9, i10);
    }

    private final void x(T t9, T t10, int i10) {
        if (H(t10, i10)) {
            long F = (long) (F(i10) & 1048575);
            Unsafe unsafe = f5311s;
            Object object = unsafe.getObject(t10, F);
            if (object != null) {
                va M = M(i10);
                if (!H(t9, i10)) {
                    if (!S(object)) {
                        unsafe.putObject(t9, F, object);
                    } else {
                        Object zza = M.zza();
                        M.c(zza, object);
                        unsafe.putObject(t9, F, zza);
                    }
                    C(t9, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t9, F);
                if (!S(object2)) {
                    Object zza2 = M.zza();
                    M.c(zza2, object2);
                    unsafe.putObject(t9, F, zza2);
                    object2 = zza2;
                }
                M.c(object2, object);
                return;
            }
            int i11 = this.f5312a[i10];
            String valueOf = String.valueOf(t10);
            throw new IllegalStateException("Source subfield " + i11 + " is present but null: " + valueOf);
        }
    }

    private final boolean y(T t9, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? H(t9, i10) : (i12 & i13) != 0;
    }

    private static boolean z(Object obj, int i10, va vaVar) {
        return vaVar.b(ac.B(obj, (long) (i10 & 1048575)));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0221, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0223, code lost:
        r1 = (com.google.android.gms.internal.measurement.y7.w0(r13) + com.google.android.gms.internal.measurement.y7.z0(r0)) + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02de, code lost:
        r0 = com.google.android.gms.internal.measurement.y7.B(r13, (com.google.android.gms.internal.measurement.da) r0, M(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02fe, code lost:
        r0 = com.google.android.gms.internal.measurement.y7.m0(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0318, code lost:
        r0 = com.google.android.gms.internal.measurement.y7.x0(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0348, code lost:
        r12 = r12 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0360, code lost:
        r0 = com.google.android.gms.internal.measurement.y7.h0(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x037b, code lost:
        r0 = com.google.android.gms.internal.measurement.y7.A0(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0396, code lost:
        r0 = com.google.android.gms.internal.measurement.y7.U(r13, (com.google.android.gms.internal.measurement.f7) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03b3, code lost:
        r0 = com.google.android.gms.internal.measurement.wa.a(r13, r0, M(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03d4, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.f7) != false) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03d7, code lost:
        r0 = com.google.android.gms.internal.measurement.y7.C(r13, (java.lang.String) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ed, code lost:
        if (y(r19, r11, r14, r16, r17) != false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03ef, code lost:
        r0 = com.google.android.gms.internal.measurement.y7.D(r13, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04a7, code lost:
        r11 = r11 + 3;
        r0 = r14;
        r1 = r16;
        r9 = 1048575;
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d9, code lost:
        if ((r0 instanceof com.google.android.gms.internal.measurement.f7) != false) goto L_0x0396;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e1, code lost:
        if (I(r7, r13, r11) != false) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0172, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0180, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018e, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019c, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01aa, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b8, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c6, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d3, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e0, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ed, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01fa, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0207, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0214, code lost:
        if (r0 > 0) goto L_0x0223;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            sun.misc.Unsafe r8 = f5311s
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x0010:
            int[] r2 = r6.f5312a
            int r2 = r2.length
            if (r11 >= r2) goto L_0x04b2
            int r2 = r6.F(r11)
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r2
            int r3 = r3 >>> 20
            int[] r4 = r6.f5312a
            r13 = r4[r11]
            int r5 = r11 + 2
            r4 = r4[r5]
            r5 = r4 & r9
            r14 = 17
            r15 = 1
            if (r3 > r14) goto L_0x0043
            if (r5 == r0) goto L_0x003a
            if (r5 != r9) goto L_0x0033
            r0 = 0
            goto L_0x0038
        L_0x0033:
            long r0 = (long) r5
            int r0 = r8.getInt(r7, r0)
        L_0x0038:
            r1 = r0
            r0 = r5
        L_0x003a:
            int r4 = r4 >>> 20
            int r4 = r15 << r4
            r14 = r0
            r16 = r1
            r5 = r4
            goto L_0x0047
        L_0x0043:
            r14 = r0
            r16 = r1
            r5 = 0
        L_0x0047:
            r0 = r2 & r9
            long r1 = (long) r0
            com.google.android.gms.internal.measurement.j8 r0 = com.google.android.gms.internal.measurement.j8.DOUBLE_LIST_PACKED
            int r0 = r0.zza()
            if (r3 < r0) goto L_0x0058
            com.google.android.gms.internal.measurement.j8 r0 = com.google.android.gms.internal.measurement.j8.SINT64_LIST_PACKED
            int r0 = r0.zza()
        L_0x0058:
            r17 = r5
            r4 = 0
            switch(r3) {
                case 0: goto L_0x048e;
                case 1: goto L_0x0476;
                case 2: goto L_0x045b;
                case 3: goto L_0x0440;
                case 4: goto L_0x0424;
                case 5: goto L_0x040c;
                case 6: goto L_0x03f5;
                case 7: goto L_0x03df;
                case 8: goto L_0x03bd;
                case 9: goto L_0x039e;
                case 10: goto L_0x0381;
                case 11: goto L_0x0366;
                case 12: goto L_0x034b;
                case 13: goto L_0x0333;
                case 14: goto L_0x031d;
                case 15: goto L_0x0303;
                case 16: goto L_0x02e9;
                case 17: goto L_0x02c8;
                case 18: goto L_0x02ba;
                case 19: goto L_0x02af;
                case 20: goto L_0x02a4;
                case 21: goto L_0x0299;
                case 22: goto L_0x028e;
                case 23: goto L_0x02ba;
                case 24: goto L_0x02af;
                case 25: goto L_0x0283;
                case 26: goto L_0x0278;
                case 27: goto L_0x0269;
                case 28: goto L_0x025e;
                case 29: goto L_0x0253;
                case 30: goto L_0x0247;
                case 31: goto L_0x02af;
                case 32: goto L_0x02ba;
                case 33: goto L_0x023b;
                case 34: goto L_0x022f;
                case 35: goto L_0x0217;
                case 36: goto L_0x020a;
                case 37: goto L_0x01fd;
                case 38: goto L_0x01f0;
                case 39: goto L_0x01e3;
                case 40: goto L_0x01d6;
                case 41: goto L_0x01c9;
                case 42: goto L_0x01bc;
                case 43: goto L_0x01ae;
                case 44: goto L_0x01a0;
                case 45: goto L_0x0192;
                case 46: goto L_0x0184;
                case 47: goto L_0x0176;
                case 48: goto L_0x0168;
                case 49: goto L_0x0158;
                case 50: goto L_0x0148;
                case 51: goto L_0x013a;
                case 52: goto L_0x012d;
                case 53: goto L_0x011d;
                case 54: goto L_0x010d;
                case 55: goto L_0x00fd;
                case 56: goto L_0x00f1;
                case 57: goto L_0x00e5;
                case 58: goto L_0x00dd;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00c1;
                case 61: goto L_0x00b5;
                case 62: goto L_0x00a9;
                case 63: goto L_0x009d;
                case 64: goto L_0x0091;
                case 65: goto L_0x0085;
                case 66: goto L_0x0079;
                case 67: goto L_0x006d;
                case 68: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x02c5
        L_0x0061:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            java.lang.Object r0 = r8.getObject(r7, r1)
            goto L_0x02de
        L_0x006d:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            long r0 = K(r7, r1)
            goto L_0x02fe
        L_0x0079:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            int r0 = G(r7, r1)
            goto L_0x0318
        L_0x0085:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            int r0 = com.google.android.gms.internal.measurement.y7.i0(r13, r4)
            goto L_0x02c4
        L_0x0091:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            int r0 = com.google.android.gms.internal.measurement.y7.t0(r13, r10)
            goto L_0x02c4
        L_0x009d:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            int r0 = G(r7, r1)
            goto L_0x0360
        L_0x00a9:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            int r0 = G(r7, r1)
            goto L_0x037b
        L_0x00b5:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            java.lang.Object r0 = r8.getObject(r7, r1)
            goto L_0x0396
        L_0x00c1:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            java.lang.Object r0 = r8.getObject(r7, r1)
            goto L_0x03b3
        L_0x00cd:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            java.lang.Object r0 = r8.getObject(r7, r1)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.f7
            if (r1 == 0) goto L_0x03d7
            goto L_0x03d6
        L_0x00dd:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            goto L_0x03ef
        L_0x00e5:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            int r0 = com.google.android.gms.internal.measurement.y7.l0(r13, r10)
            goto L_0x02c4
        L_0x00f1:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            int r0 = com.google.android.gms.internal.measurement.y7.T(r13, r4)
            goto L_0x02c4
        L_0x00fd:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            int r0 = G(r7, r1)
            int r0 = com.google.android.gms.internal.measurement.y7.p0(r13, r0)
            goto L_0x02c4
        L_0x010d:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            long r0 = K(r7, r1)
            int r0 = com.google.android.gms.internal.measurement.y7.q0(r13, r0)
            goto L_0x02c4
        L_0x011d:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            long r0 = K(r7, r1)
            int r0 = com.google.android.gms.internal.measurement.y7.c0(r13, r0)
            goto L_0x02c4
        L_0x012d:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            r4 = 0
            int r0 = com.google.android.gms.internal.measurement.y7.f(r13, r4)
            goto L_0x02c4
        L_0x013a:
            boolean r0 = r6.I(r7, r13, r11)
            if (r0 == 0) goto L_0x02c5
            r4 = 0
            int r0 = com.google.android.gms.internal.measurement.y7.e(r13, r4)
            goto L_0x02c4
        L_0x0148:
            com.google.android.gms.internal.measurement.aa r0 = r6.f5328q
            java.lang.Object r1 = r8.getObject(r7, r1)
            java.lang.Object r2 = r6.P(r11)
            int r0 = r0.h(r13, r1, r2)
            goto L_0x02c4
        L_0x0158:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.measurement.va r1 = r6.M(r11)
            int r0 = com.google.android.gms.internal.measurement.wa.c(r13, r0, r1)
            goto L_0x02c4
        L_0x0168:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.R(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x0176:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.O(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x0184:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.D(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x0192:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.z(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x01a0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.t(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x01ae:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.U(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x01bc:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.e(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x01c9:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.z(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x01d6:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.D(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x01e3:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.H(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x01f0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.X(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x01fd:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.L(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x020a:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.z(r0)
            if (r0 <= 0) goto L_0x02c5
            goto L_0x0223
        L_0x0217:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.D(r0)
            if (r0 <= 0) goto L_0x02c5
        L_0x0223:
            int r1 = com.google.android.gms.internal.measurement.y7.w0(r13)
            int r2 = com.google.android.gms.internal.measurement.y7.z0(r0)
            int r1 = r1 + r2
            int r1 = r1 + r0
            goto L_0x0348
        L_0x022f:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.Q(r13, r0, r10)
            goto L_0x02c4
        L_0x023b:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.N(r13, r0, r10)
            goto L_0x02c4
        L_0x0247:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.s(r13, r0, r10)
            goto L_0x02c4
        L_0x0253:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.T(r13, r0, r10)
            goto L_0x02c4
        L_0x025e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.b(r13, r0)
            goto L_0x02c4
        L_0x0269:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.measurement.va r1 = r6.M(r11)
            int r0 = com.google.android.gms.internal.measurement.wa.r(r13, r0, r1)
            goto L_0x02c4
        L_0x0278:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.q(r13, r0)
            goto L_0x02c4
        L_0x0283:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.d(r13, r0, r10)
            goto L_0x02c4
        L_0x028e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.G(r13, r0, r10)
            goto L_0x02c4
        L_0x0299:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.W(r13, r0, r10)
            goto L_0x02c4
        L_0x02a4:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.K(r13, r0, r10)
            goto L_0x02c4
        L_0x02af:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.y(r13, r0, r10)
            goto L_0x02c4
        L_0x02ba:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.wa.C(r13, r0, r10)
        L_0x02c4:
            int r12 = r12 + r0
        L_0x02c5:
            r15 = 0
            goto L_0x04a7
        L_0x02c8:
            r0 = r18
            r4 = r1
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = r4
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            java.lang.Object r0 = r8.getObject(r7, r9)
        L_0x02de:
            com.google.android.gms.internal.measurement.da r0 = (com.google.android.gms.internal.measurement.da) r0
            com.google.android.gms.internal.measurement.va r1 = r6.M(r11)
            int r0 = com.google.android.gms.internal.measurement.y7.B(r13, r0, r1)
            goto L_0x02c4
        L_0x02e9:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            long r0 = r8.getLong(r7, r9)
        L_0x02fe:
            int r0 = com.google.android.gms.internal.measurement.y7.m0(r13, r0)
            goto L_0x02c4
        L_0x0303:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            int r0 = r8.getInt(r7, r9)
        L_0x0318:
            int r0 = com.google.android.gms.internal.measurement.y7.x0(r13, r0)
            goto L_0x02c4
        L_0x031d:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = r4
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            int r0 = com.google.android.gms.internal.measurement.y7.i0(r13, r9)
            goto L_0x02c4
        L_0x0333:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            r0 = 0
            int r1 = com.google.android.gms.internal.measurement.y7.t0(r13, r0)
        L_0x0348:
            int r12 = r12 + r1
            goto L_0x02c5
        L_0x034b:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            int r0 = r8.getInt(r7, r9)
        L_0x0360:
            int r0 = com.google.android.gms.internal.measurement.y7.h0(r13, r0)
            goto L_0x02c4
        L_0x0366:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            int r0 = r8.getInt(r7, r9)
        L_0x037b:
            int r0 = com.google.android.gms.internal.measurement.y7.A0(r13, r0)
            goto L_0x02c4
        L_0x0381:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            java.lang.Object r0 = r8.getObject(r7, r9)
        L_0x0396:
            com.google.android.gms.internal.measurement.f7 r0 = (com.google.android.gms.internal.measurement.f7) r0
            int r0 = com.google.android.gms.internal.measurement.y7.U(r13, r0)
            goto L_0x02c4
        L_0x039e:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            java.lang.Object r0 = r8.getObject(r7, r9)
        L_0x03b3:
            com.google.android.gms.internal.measurement.va r1 = r6.M(r11)
            int r0 = com.google.android.gms.internal.measurement.wa.a(r13, r0, r1)
            goto L_0x02c4
        L_0x03bd:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            java.lang.Object r0 = r8.getObject(r7, r9)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.f7
            if (r1 == 0) goto L_0x03d7
        L_0x03d6:
            goto L_0x0396
        L_0x03d7:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.google.android.gms.internal.measurement.y7.C(r13, r0)
            goto L_0x02c4
        L_0x03df:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
        L_0x03ef:
            int r0 = com.google.android.gms.internal.measurement.y7.D(r13, r15)
            goto L_0x02c4
        L_0x03f5:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x02c5
            r15 = 0
            int r0 = com.google.android.gms.internal.measurement.y7.l0(r13, r15)
            goto L_0x04a6
        L_0x040c:
            r9 = r4
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x04a7
            int r0 = com.google.android.gms.internal.measurement.y7.T(r13, r9)
            goto L_0x04a6
        L_0x0424:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x04a7
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.measurement.y7.p0(r13, r0)
            goto L_0x04a6
        L_0x0440:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x04a7
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.measurement.y7.q0(r13, r0)
            goto L_0x04a6
        L_0x045b:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x04a7
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.measurement.y7.c0(r13, r0)
            goto L_0x04a6
        L_0x0476:
            r4 = 0
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = 0
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x04a7
            int r0 = com.google.android.gms.internal.measurement.y7.f(r13, r9)
            goto L_0x04a6
        L_0x048e:
            r4 = 0
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = r4
            r4 = r16
            r5 = r17
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x04a7
            int r0 = com.google.android.gms.internal.measurement.y7.e(r13, r9)
        L_0x04a6:
            int r12 = r12 + r0
        L_0x04a7:
            int r11 = r11 + 3
            r0 = r14
            r1 = r16
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
            goto L_0x0010
        L_0x04b2:
            r15 = 0
            com.google.android.gms.internal.measurement.ub<?, ?> r0 = r6.f5326o
            java.lang.Object r1 = r0.k(r7)
            int r0 = r0.a(r1)
            int r12 = r12 + r0
            boolean r0 = r6.f5317f
            if (r0 == 0) goto L_0x0510
            com.google.android.gms.internal.measurement.e8<?> r0 = r6.f5327p
            com.google.android.gms.internal.measurement.i8 r0 = r0.b(r7)
            r10 = 0
        L_0x04c9:
            com.google.android.gms.internal.measurement.za<T, java.lang.Object> r1 = r0.f5357a
            int r1 = r1.g()
            if (r10 >= r1) goto L_0x04e9
            com.google.android.gms.internal.measurement.za<T, java.lang.Object> r1 = r0.f5357a
            java.util.Map$Entry r1 = r1.h(r10)
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.measurement.k8 r2 = (com.google.android.gms.internal.measurement.k8) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.measurement.i8.b(r2, r1)
            int r15 = r15 + r1
            int r10 = r10 + 1
            goto L_0x04c9
        L_0x04e9:
            com.google.android.gms.internal.measurement.za<T, java.lang.Object> r0 = r0.f5357a
            java.lang.Iterable r0 = r0.j()
            java.util.Iterator r0 = r0.iterator()
        L_0x04f3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x050f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.measurement.k8 r2 = (com.google.android.gms.internal.measurement.k8) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.measurement.i8.b(r2, r1)
            int r15 = r15 + r1
            goto L_0x04f3
        L_0x050f:
            int r12 = r12 + r15
        L_0x0510:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ha.a(java.lang.Object):int");
    }

    public final boolean b(T t9) {
        int i10;
        int i11;
        T t10 = t9;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z9 = true;
            if (i14 >= this.f5322k) {
                return !this.f5317f || this.f5327p.b(t10).s();
            }
            int i15 = this.f5321j[i14];
            int i16 = this.f5312a[i15];
            int F = F(i15);
            int i17 = this.f5312a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f5311s.getInt(t10, (long) i18);
                }
                i10 = i13;
                i11 = i18;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if (((268435456 & F) != 0) && !y(t9, i15, i11, i10, i19)) {
                return false;
            }
            int i20 = (267386880 & F) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (I(t10, i16, i15) && !z(t10, F, M(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 == 50 && !this.f5328q.b(ac.B(t10, (long) (F & 1048575))).isEmpty()) {
                            this.f5328q.a(P(i15));
                            throw null;
                        }
                    }
                }
                List list = (List) ac.B(t10, (long) (F & 1048575));
                if (!list.isEmpty()) {
                    va M = M(i15);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            break;
                        } else if (!M.b(list.get(i21))) {
                            z9 = false;
                            break;
                        } else {
                            i21++;
                        }
                    }
                }
                if (!z9) {
                    return false;
                }
            } else if (y(t9, i15, i11, i10, i19) && !z(t10, F, M(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        com.google.android.gms.internal.measurement.ac.j(r7, r2, com.google.android.gms.internal.measurement.ac.B(r8, r2));
        D(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        com.google.android.gms.internal.measurement.ac.j(r7, r2, com.google.android.gms.internal.measurement.ac.B(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b7, code lost:
        com.google.android.gms.internal.measurement.ac.h(r7, r2, com.google.android.gms.internal.measurement.ac.t(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cc, code lost:
        com.google.android.gms.internal.measurement.ac.i(r7, r2, com.google.android.gms.internal.measurement.ac.x(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ef, code lost:
        C(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f2, code lost:
        r0 = r0 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(T r7, T r8) {
        /*
            r6 = this;
            Q(r7)
            java.util.Objects.requireNonNull(r8)
            r0 = 0
        L_0x0007:
            int[] r1 = r6.f5312a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f6
            int r1 = r6.F(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f5312a
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00e2;
                case 1: goto L_0x00d4;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00b1;
                case 5: goto L_0x00aa;
                case 6: goto L_0x00a3;
                case 7: goto L_0x0095;
                case 8: goto L_0x0087;
                case 9: goto L_0x0082;
                case 10: goto L_0x007b;
                case 11: goto L_0x0074;
                case 12: goto L_0x006d;
                case 13: goto L_0x0066;
                case 14: goto L_0x005e;
                case 15: goto L_0x0057;
                case 16: goto L_0x004f;
                case 17: goto L_0x0082;
                case 18: goto L_0x0048;
                case 19: goto L_0x0048;
                case 20: goto L_0x0048;
                case 21: goto L_0x0048;
                case 22: goto L_0x0048;
                case 23: goto L_0x0048;
                case 24: goto L_0x0048;
                case 25: goto L_0x0048;
                case 26: goto L_0x0048;
                case 27: goto L_0x0048;
                case 28: goto L_0x0048;
                case 29: goto L_0x0048;
                case 30: goto L_0x0048;
                case 31: goto L_0x0048;
                case 32: goto L_0x0048;
                case 33: goto L_0x0048;
                case 34: goto L_0x0048;
                case 35: goto L_0x0048;
                case 36: goto L_0x0048;
                case 37: goto L_0x0048;
                case 38: goto L_0x0048;
                case 39: goto L_0x0048;
                case 40: goto L_0x0048;
                case 41: goto L_0x0048;
                case 42: goto L_0x0048;
                case 43: goto L_0x0048;
                case 44: goto L_0x0048;
                case 45: goto L_0x0048;
                case 46: goto L_0x0048;
                case 47: goto L_0x0048;
                case 48: goto L_0x0048;
                case 49: goto L_0x0048;
                case 50: goto L_0x0041;
                case 51: goto L_0x002f;
                case 52: goto L_0x002f;
                case 53: goto L_0x002f;
                case 54: goto L_0x002f;
                case 55: goto L_0x002f;
                case 56: goto L_0x002f;
                case 57: goto L_0x002f;
                case 58: goto L_0x002f;
                case 59: goto L_0x002f;
                case 60: goto L_0x002a;
                case 61: goto L_0x0023;
                case 62: goto L_0x0023;
                case 63: goto L_0x0023;
                case 64: goto L_0x0023;
                case 65: goto L_0x0023;
                case 66: goto L_0x0023;
                case 67: goto L_0x0023;
                case 68: goto L_0x002a;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x00f2
        L_0x0023:
            boolean r1 = r6.I(r8, r4, r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x0035
        L_0x002a:
            r6.E(r7, r8, r0)
            goto L_0x00f2
        L_0x002f:
            boolean r1 = r6.I(r8, r4, r0)
            if (r1 == 0) goto L_0x00f2
        L_0x0035:
            java.lang.Object r1 = com.google.android.gms.internal.measurement.ac.B(r8, r2)
            com.google.android.gms.internal.measurement.ac.j(r7, r2, r1)
            r6.D(r7, r4, r0)
            goto L_0x00f2
        L_0x0041:
            com.google.android.gms.internal.measurement.aa r1 = r6.f5328q
            com.google.android.gms.internal.measurement.wa.m(r1, r7, r8, r2)
            goto L_0x00f2
        L_0x0048:
            com.google.android.gms.internal.measurement.l9 r1 = r6.f5325n
            r1.b(r7, r8, r2)
            goto L_0x00f2
        L_0x004f:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x00cc
        L_0x0057:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x0073
        L_0x005e:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x00cc
        L_0x0066:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x0073
        L_0x006d:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
        L_0x0073:
            goto L_0x00b7
        L_0x0074:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x00b7
        L_0x007b:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x008d
        L_0x0082:
            r6.x(r7, r8, r0)
            goto L_0x00f2
        L_0x0087:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
        L_0x008d:
            java.lang.Object r1 = com.google.android.gms.internal.measurement.ac.B(r8, r2)
            com.google.android.gms.internal.measurement.ac.j(r7, r2, r1)
            goto L_0x00ef
        L_0x0095:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            boolean r1 = com.google.android.gms.internal.measurement.ac.F(r8, r2)
            com.google.android.gms.internal.measurement.ac.v(r7, r2, r1)
            goto L_0x00ef
        L_0x00a3:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x00b7
        L_0x00aa:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x00cc
        L_0x00b1:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
        L_0x00b7:
            int r1 = com.google.android.gms.internal.measurement.ac.t(r8, r2)
            com.google.android.gms.internal.measurement.ac.h(r7, r2, r1)
            goto L_0x00ef
        L_0x00bf:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            goto L_0x00cc
        L_0x00c6:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
        L_0x00cc:
            long r4 = com.google.android.gms.internal.measurement.ac.x(r8, r2)
            com.google.android.gms.internal.measurement.ac.i(r7, r2, r4)
            goto L_0x00ef
        L_0x00d4:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            float r1 = com.google.android.gms.internal.measurement.ac.n(r8, r2)
            com.google.android.gms.internal.measurement.ac.g(r7, r2, r1)
            goto L_0x00ef
        L_0x00e2:
            boolean r1 = r6.H(r8, r0)
            if (r1 == 0) goto L_0x00f2
            double r4 = com.google.android.gms.internal.measurement.ac.a(r8, r2)
            com.google.android.gms.internal.measurement.ac.f(r7, r2, r4)
        L_0x00ef:
            r6.C(r7, r0)
        L_0x00f2:
            int r0 = r0 + 3
            goto L_0x0007
        L_0x00f6:
            com.google.android.gms.internal.measurement.ub<?, ?> r0 = r6.f5326o
            com.google.android.gms.internal.measurement.wa.n(r0, r7, r8)
            boolean r0 = r6.f5317f
            if (r0 == 0) goto L_0x0104
            com.google.android.gms.internal.measurement.e8<?> r0 = r6.f5327p
            com.google.android.gms.internal.measurement.wa.l(r0, r7, r8)
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ha.c(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(T r8) {
        /*
            r7 = this;
            boolean r0 = S(r8)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = r8 instanceof com.google.android.gms.internal.measurement.p8
            r1 = 0
            if (r0 == 0) goto L_0x001a
            r0 = r8
            com.google.android.gms.internal.measurement.p8 r0 = (com.google.android.gms.internal.measurement.p8) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.p(r2)
            r0.zza = r1
            r0.H()
        L_0x001a:
            int[] r0 = r7.f5312a
            int r0 = r0.length
        L_0x001d:
            if (r1 >= r0) goto L_0x0076
            int r2 = r7.F(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            long r3 = (long) r3
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = r2 & r5
            int r2 = r2 >>> 20
            r5 = 9
            if (r2 == r5) goto L_0x0060
            r5 = 60
            if (r2 == r5) goto L_0x0055
            r5 = 68
            if (r2 == r5) goto L_0x0055
            switch(r2) {
                case 17: goto L_0x0060;
                case 18: goto L_0x004f;
                case 19: goto L_0x004f;
                case 20: goto L_0x004f;
                case 21: goto L_0x004f;
                case 22: goto L_0x004f;
                case 23: goto L_0x004f;
                case 24: goto L_0x004f;
                case 25: goto L_0x004f;
                case 26: goto L_0x004f;
                case 27: goto L_0x004f;
                case 28: goto L_0x004f;
                case 29: goto L_0x004f;
                case 30: goto L_0x004f;
                case 31: goto L_0x004f;
                case 32: goto L_0x004f;
                case 33: goto L_0x004f;
                case 34: goto L_0x004f;
                case 35: goto L_0x004f;
                case 36: goto L_0x004f;
                case 37: goto L_0x004f;
                case 38: goto L_0x004f;
                case 39: goto L_0x004f;
                case 40: goto L_0x004f;
                case 41: goto L_0x004f;
                case 42: goto L_0x004f;
                case 43: goto L_0x004f;
                case 44: goto L_0x004f;
                case 45: goto L_0x004f;
                case 46: goto L_0x004f;
                case 47: goto L_0x004f;
                case 48: goto L_0x004f;
                case 49: goto L_0x004f;
                case 50: goto L_0x003d;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x0073
        L_0x003d:
            sun.misc.Unsafe r2 = f5311s
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L_0x0073
            com.google.android.gms.internal.measurement.aa r6 = r7.f5328q
            java.lang.Object r5 = r6.d(r5)
            r2.putObject(r8, r3, r5)
            goto L_0x0073
        L_0x004f:
            com.google.android.gms.internal.measurement.l9 r2 = r7.f5325n
            r2.d(r8, r3)
            goto L_0x0073
        L_0x0055:
            int[] r2 = r7.f5312a
            r2 = r2[r1]
            boolean r2 = r7.I(r8, r2, r1)
            if (r2 == 0) goto L_0x0073
            goto L_0x0066
        L_0x0060:
            boolean r2 = r7.H(r8, r1)
            if (r2 == 0) goto L_0x0073
        L_0x0066:
            com.google.android.gms.internal.measurement.va r2 = r7.M(r1)
            sun.misc.Unsafe r5 = f5311s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
        L_0x0073:
            int r1 = r1 + 3
            goto L_0x001d
        L_0x0076:
            com.google.android.gms.internal.measurement.ub<?, ?> r0 = r7.f5326o
            r0.l(r8)
            boolean r0 = r7.f5317f
            if (r0 == 0) goto L_0x0084
            com.google.android.gms.internal.measurement.e8<?> r0 = r7.f5327p
            r0.g(r8)
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ha.d(java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = com.google.android.gms.internal.measurement.ac.B(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = G(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = K(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.measurement.ac.B(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.measurement.ac.B(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = com.google.android.gms.internal.measurement.r8.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = com.google.android.gms.internal.measurement.r8.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f5312a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.F(r1)
            int[] r4 = r8.f5312a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = O(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = G(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = K(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = A(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.I(r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = i(r9, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.ac.F(r9, r5)
        L_0x00fd:
            int r3 = com.google.android.gms.internal.measurement.r8.c(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.ac.t(r9, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.ac.x(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.ac.n(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.ac.a(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = com.google.android.gms.internal.measurement.r8.b(r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.ub<?, ?> r0 = r8.f5326o
            java.lang.Object r0 = r0.k(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f5317f
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.e8<?> r0 = r8.f5327p
            com.google.android.gms.internal.measurement.i8 r9 = r0.b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ha.e(java.lang.Object):int");
    }

    public final void f(T t9, byte[] bArr, int i10, int i11, e7 e7Var) {
        l(t9, bArr, i10, i11, 0, e7Var);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.measurement.wa.p(com.google.android.gms.internal.measurement.ac.B(r10, r6), com.google.android.gms.internal.measurement.ac.B(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.measurement.ac.x(r10, r6) == com.google.android.gms.internal.measurement.ac.x(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.measurement.ac.t(r10, r6) == com.google.android.gms.internal.measurement.ac.t(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.measurement.ac.x(r10, r6) == com.google.android.gms.internal.measurement.ac.x(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.measurement.ac.t(r10, r6) == com.google.android.gms.internal.measurement.ac.t(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.measurement.ac.t(r10, r6) == com.google.android.gms.internal.measurement.ac.t(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.measurement.ac.t(r10, r6) == com.google.android.gms.internal.measurement.ac.t(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.measurement.wa.p(com.google.android.gms.internal.measurement.ac.B(r10, r6), com.google.android.gms.internal.measurement.ac.B(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.measurement.wa.p(com.google.android.gms.internal.measurement.ac.B(r10, r6), com.google.android.gms.internal.measurement.ac.B(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.measurement.wa.p(com.google.android.gms.internal.measurement.ac.B(r10, r6), com.google.android.gms.internal.measurement.ac.B(r11, r6)) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.measurement.ac.F(r10, r6) == com.google.android.gms.internal.measurement.ac.F(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.measurement.ac.t(r10, r6) == com.google.android.gms.internal.measurement.ac.t(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.measurement.ac.x(r10, r6) == com.google.android.gms.internal.measurement.ac.x(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.measurement.ac.t(r10, r6) == com.google.android.gms.internal.measurement.ac.t(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.measurement.ac.x(r10, r6) == com.google.android.gms.internal.measurement.ac.x(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.measurement.ac.x(r10, r6) == com.google.android.gms.internal.measurement.ac.x(r11, r6)) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0195, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.ac.n(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.ac.n(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b0, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.ac.a(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.ac.a(r11, r6))) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.wa.p(com.google.android.gms.internal.measurement.ac.B(r10, r6), com.google.android.gms.internal.measurement.ac.B(r11, r6)) != false) goto L_0x01b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f5312a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01ba
            int r4 = r9.F(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0198;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01b3
        L_0x001c:
            int r4 = r9.B(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.ac.t(r10, r4)
            int r4 = com.google.android.gms.internal.measurement.ac.t(r11, r4)
            if (r8 != r4) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.measurement.ac.B(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.ac.B(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.wa.p(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.ac.B(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.wa.p(r3, r4)
            goto L_0x01b3
        L_0x004a:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.measurement.ac.B(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.ac.B(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.wa.p(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0060:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.measurement.ac.x(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.ac.x(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x0074:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.ac.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.ac.t(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0086:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.measurement.ac.x(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.ac.x(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x009a:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.ac.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.ac.t(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00ac:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.ac.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.ac.t(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x00be:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.ac.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.ac.t(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x00d0:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.measurement.ac.B(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.ac.B(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.wa.p(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x00e6:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.measurement.ac.B(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.ac.B(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.wa.p(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x01b2
        L_0x00fc:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            java.lang.Object r4 = com.google.android.gms.internal.measurement.ac.B(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.ac.B(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.wa.p(r4, r5)
            if (r4 != 0) goto L_0x01b3
            goto L_0x0197
        L_0x0112:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            boolean r4 = com.google.android.gms.internal.measurement.ac.F(r10, r6)
            boolean r5 = com.google.android.gms.internal.measurement.ac.F(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x01b2
        L_0x0124:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.ac.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.ac.t(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0135:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.measurement.ac.x(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.ac.x(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x0148:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            int r4 = com.google.android.gms.internal.measurement.ac.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.ac.t(r11, r6)
            if (r4 == r5) goto L_0x01b3
            goto L_0x0197
        L_0x0159:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.measurement.ac.x(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.ac.x(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x01b2
        L_0x016c:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            long r4 = com.google.android.gms.internal.measurement.ac.x(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.ac.x(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
            goto L_0x0197
        L_0x017f:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            float r4 = com.google.android.gms.internal.measurement.ac.n(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.ac.n(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01b3
        L_0x0197:
            goto L_0x01b2
        L_0x0198:
            boolean r4 = r9.J(r10, r11, r2)
            if (r4 == 0) goto L_0x01b2
            double r4 = com.google.android.gms.internal.measurement.ac.a(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.ac.a(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01b3
        L_0x01b2:
            r3 = 0
        L_0x01b3:
            if (r3 != 0) goto L_0x01b6
            return r1
        L_0x01b6:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01ba:
            com.google.android.gms.internal.measurement.ub<?, ?> r0 = r9.f5326o
            java.lang.Object r0 = r0.k(r10)
            com.google.android.gms.internal.measurement.ub<?, ?> r2 = r9.f5326o
            java.lang.Object r2 = r2.k(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01cd
            return r1
        L_0x01cd:
            boolean r0 = r9.f5317f
            if (r0 == 0) goto L_0x01e2
            com.google.android.gms.internal.measurement.e8<?> r0 = r9.f5327p
            com.google.android.gms.internal.measurement.i8 r10 = r0.b(r10)
            com.google.android.gms.internal.measurement.e8<?> r0 = r9.f5327p
            com.google.android.gms.internal.measurement.i8 r11 = r0.b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01e2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ha.g(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x038c, code lost:
        r8.B(r4, com.google.android.gms.internal.measurement.ac.B(r7, (long) (r3 & 1048575)), M(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03a7, code lost:
        r8.z(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03b8, code lost:
        r8.F(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03c9, code lost:
        r8.r(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03da, code lost:
        r8.w(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03eb, code lost:
        r8.J(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03fc, code lost:
        r8.g(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0407, code lost:
        r8.d(r4, (com.google.android.gms.internal.measurement.f7) com.google.android.gms.internal.measurement.ac.B(r7, (long) (r3 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x041a, code lost:
        r8.c(r4, com.google.android.gms.internal.measurement.ac.B(r7, (long) (r3 & 1048575)), M(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x042f, code lost:
        s(r4, com.google.android.gms.internal.measurement.ac.B(r7, (long) (r3 & 1048575)), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0446, code lost:
        r8.b(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0457, code lost:
        r8.k(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0467, code lost:
        r8.L(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0477, code lost:
        r8.q(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0487, code lost:
        r8.H(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0497, code lost:
        r8.i(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a7, code lost:
        r8.N(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04b7, code lost:
        r8.M(r4, r14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x0b33  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(T r24, com.google.android.gms.internal.measurement.qc r25) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r25
            int r0 = r25.zza()
            int r1 = com.google.android.gms.internal.measurement.tc.f5628b
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r11 = 1
            r12 = 0
            r13 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04d5
            com.google.android.gms.internal.measurement.ub<?, ?> r0 = r6.f5326o
            t(r0, r7, r8)
            boolean r0 = r6.f5317f
            if (r0 == 0) goto L_0x0037
            com.google.android.gms.internal.measurement.e8<?> r0 = r6.f5327p
            com.google.android.gms.internal.measurement.i8 r0 = r0.b(r7)
            com.google.android.gms.internal.measurement.za<T, java.lang.Object> r1 = r0.f5357a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0037
            java.util.Iterator r0 = r0.m()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0039
        L_0x0037:
            r0 = 0
            r1 = 0
        L_0x0039:
            int[] r2 = r6.f5312a
            int r2 = r2.length
            int r2 = r2 + -3
        L_0x003e:
            if (r2 < 0) goto L_0x04be
            int r3 = r6.F(r2)
            int[] r4 = r6.f5312a
            r4 = r4[r2]
        L_0x0048:
            if (r1 == 0) goto L_0x0066
            com.google.android.gms.internal.measurement.e8<?> r5 = r6.f5327p
            int r5 = r5.a(r1)
            if (r5 <= r4) goto L_0x0066
            com.google.android.gms.internal.measurement.e8<?> r5 = r6.f5327p
            r5.d(r8, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0048
        L_0x0064:
            r1 = 0
            goto L_0x0048
        L_0x0066:
            r5 = r3 & r9
            int r5 = r5 >>> 20
            switch(r5) {
                case 0: goto L_0x04ab;
                case 1: goto L_0x049b;
                case 2: goto L_0x048b;
                case 3: goto L_0x047b;
                case 4: goto L_0x046b;
                case 5: goto L_0x045b;
                case 6: goto L_0x044b;
                case 7: goto L_0x043a;
                case 8: goto L_0x0429;
                case 9: goto L_0x0414;
                case 10: goto L_0x0401;
                case 11: goto L_0x03f0;
                case 12: goto L_0x03df;
                case 13: goto L_0x03ce;
                case 14: goto L_0x03bd;
                case 15: goto L_0x03ac;
                case 16: goto L_0x039b;
                case 17: goto L_0x0386;
                case 18: goto L_0x0375;
                case 19: goto L_0x0364;
                case 20: goto L_0x0353;
                case 21: goto L_0x0342;
                case 22: goto L_0x0331;
                case 23: goto L_0x0320;
                case 24: goto L_0x030f;
                case 25: goto L_0x02fe;
                case 26: goto L_0x02ed;
                case 27: goto L_0x02d8;
                case 28: goto L_0x02c7;
                case 29: goto L_0x02b6;
                case 30: goto L_0x02a5;
                case 31: goto L_0x0294;
                case 32: goto L_0x0283;
                case 33: goto L_0x0272;
                case 34: goto L_0x0261;
                case 35: goto L_0x0250;
                case 36: goto L_0x023f;
                case 37: goto L_0x022e;
                case 38: goto L_0x021d;
                case 39: goto L_0x020c;
                case 40: goto L_0x01fb;
                case 41: goto L_0x01ea;
                case 42: goto L_0x01d9;
                case 43: goto L_0x01c8;
                case 44: goto L_0x01b7;
                case 45: goto L_0x01a6;
                case 46: goto L_0x0195;
                case 47: goto L_0x0184;
                case 48: goto L_0x0173;
                case 49: goto L_0x015e;
                case 50: goto L_0x0153;
                case 51: goto L_0x0145;
                case 52: goto L_0x0137;
                case 53: goto L_0x0129;
                case 54: goto L_0x011b;
                case 55: goto L_0x010d;
                case 56: goto L_0x00ff;
                case 57: goto L_0x00f1;
                case 58: goto L_0x00e3;
                case 59: goto L_0x00db;
                case 60: goto L_0x00d3;
                case 61: goto L_0x00cb;
                case 62: goto L_0x00bd;
                case 63: goto L_0x00af;
                case 64: goto L_0x00a1;
                case 65: goto L_0x0093;
                case 66: goto L_0x0085;
                case 67: goto L_0x0077;
                case 68: goto L_0x006f;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x04ba
        L_0x006f:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            goto L_0x038c
        L_0x0077:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = K(r7, r14)
            goto L_0x03a7
        L_0x0085:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = G(r7, r14)
            goto L_0x03b8
        L_0x0093:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = K(r7, r14)
            goto L_0x03c9
        L_0x00a1:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = G(r7, r14)
            goto L_0x03da
        L_0x00af:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = G(r7, r14)
            goto L_0x03eb
        L_0x00bd:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = G(r7, r14)
            goto L_0x03fc
        L_0x00cb:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            goto L_0x0407
        L_0x00d3:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            goto L_0x041a
        L_0x00db:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            goto L_0x042f
        L_0x00e3:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            boolean r3 = O(r7, r14)
            goto L_0x0446
        L_0x00f1:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = G(r7, r14)
            goto L_0x0457
        L_0x00ff:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = K(r7, r14)
            goto L_0x0467
        L_0x010d:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = G(r7, r14)
            goto L_0x0477
        L_0x011b:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = K(r7, r14)
            goto L_0x0487
        L_0x0129:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = K(r7, r14)
            goto L_0x0497
        L_0x0137:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            float r3 = A(r7, r14)
            goto L_0x04a7
        L_0x0145:
            boolean r5 = r6.I(r7, r4, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            double r14 = i(r7, r14)
            goto L_0x04b7
        L_0x0153:
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            r6.u(r8, r4, r3, r2)
            goto L_0x04ba
        L_0x015e:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.va r5 = r6.M(r2)
            com.google.android.gms.internal.measurement.wa.j(r4, r3, r8, r5)
            goto L_0x04ba
        L_0x0173:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.a0(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x0184:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.Z(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x0195:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.Y(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x01a6:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.V(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x01b7:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.B(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x01c8:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.b0(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x01d9:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.k(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x01ea:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.F(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x01fb:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.J(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x020c:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.P(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x021d:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.c0(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x022e:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.S(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x023f:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.M(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x0250:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.x(r4, r3, r8, r11)
            goto L_0x04ba
        L_0x0261:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.a0(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x0272:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.Z(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x0283:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.Y(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x0294:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.V(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x02a5:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.B(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x02b6:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.b0(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x02c7:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.i(r4, r3, r8)
            goto L_0x04ba
        L_0x02d8:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.va r5 = r6.M(r2)
            com.google.android.gms.internal.measurement.wa.w(r4, r3, r8, r5)
            goto L_0x04ba
        L_0x02ed:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.v(r4, r3, r8)
            goto L_0x04ba
        L_0x02fe:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.k(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x030f:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.F(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x0320:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.J(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x0331:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.P(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x0342:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.c0(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x0353:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.S(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x0364:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.M(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x0375:
            int[] r4 = r6.f5312a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.wa.x(r4, r3, r8, r12)
            goto L_0x04ba
        L_0x0386:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
        L_0x038c:
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            com.google.android.gms.internal.measurement.va r5 = r6.M(r2)
            r8.B(r4, r3, r5)
            goto L_0x04ba
        L_0x039b:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.measurement.ac.x(r7, r14)
        L_0x03a7:
            r8.z(r4, r14)
            goto L_0x04ba
        L_0x03ac:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.ac.t(r7, r14)
        L_0x03b8:
            r8.F(r4, r3)
            goto L_0x04ba
        L_0x03bd:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.measurement.ac.x(r7, r14)
        L_0x03c9:
            r8.r(r4, r14)
            goto L_0x04ba
        L_0x03ce:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.ac.t(r7, r14)
        L_0x03da:
            r8.w(r4, r3)
            goto L_0x04ba
        L_0x03df:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.ac.t(r7, r14)
        L_0x03eb:
            r8.J(r4, r3)
            goto L_0x04ba
        L_0x03f0:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.ac.t(r7, r14)
        L_0x03fc:
            r8.g(r4, r3)
            goto L_0x04ba
        L_0x0401:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
        L_0x0407:
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            com.google.android.gms.internal.measurement.f7 r3 = (com.google.android.gms.internal.measurement.f7) r3
            r8.d(r4, r3)
            goto L_0x04ba
        L_0x0414:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
        L_0x041a:
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            com.google.android.gms.internal.measurement.va r5 = r6.M(r2)
            r8.c(r4, r3, r5)
            goto L_0x04ba
        L_0x0429:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
        L_0x042f:
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.ac.B(r7, r14)
            s(r4, r3, r8)
            goto L_0x04ba
        L_0x043a:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            boolean r3 = com.google.android.gms.internal.measurement.ac.F(r7, r14)
        L_0x0446:
            r8.b(r4, r3)
            goto L_0x04ba
        L_0x044b:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.ac.t(r7, r14)
        L_0x0457:
            r8.k(r4, r3)
            goto L_0x04ba
        L_0x045b:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.measurement.ac.x(r7, r14)
        L_0x0467:
            r8.L(r4, r14)
            goto L_0x04ba
        L_0x046b:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.ac.t(r7, r14)
        L_0x0477:
            r8.q(r4, r3)
            goto L_0x04ba
        L_0x047b:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.measurement.ac.x(r7, r14)
        L_0x0487:
            r8.H(r4, r14)
            goto L_0x04ba
        L_0x048b:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.measurement.ac.x(r7, r14)
        L_0x0497:
            r8.i(r4, r14)
            goto L_0x04ba
        L_0x049b:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            float r3 = com.google.android.gms.internal.measurement.ac.n(r7, r14)
        L_0x04a7:
            r8.N(r4, r3)
            goto L_0x04ba
        L_0x04ab:
            boolean r5 = r6.H(r7, r2)
            if (r5 == 0) goto L_0x04ba
            r3 = r3 & r13
            long r14 = (long) r3
            double r14 = com.google.android.gms.internal.measurement.ac.a(r7, r14)
        L_0x04b7:
            r8.M(r4, r14)
        L_0x04ba:
            int r2 = r2 + -3
            goto L_0x003e
        L_0x04be:
            if (r1 == 0) goto L_0x04d4
            com.google.android.gms.internal.measurement.e8<?> r2 = r6.f5327p
            r2.d(r8, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x04d2
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04be
        L_0x04d2:
            r1 = 0
            goto L_0x04be
        L_0x04d4:
            return
        L_0x04d5:
            boolean r0 = r6.f5317f
            if (r0 == 0) goto L_0x04f3
            com.google.android.gms.internal.measurement.e8<?> r0 = r6.f5327p
            com.google.android.gms.internal.measurement.i8 r0 = r0.b(r7)
            com.google.android.gms.internal.measurement.za<T, java.lang.Object> r1 = r0.f5357a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x04f3
            java.util.Iterator r0 = r0.p()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r14 = r0
            goto L_0x04f5
        L_0x04f3:
            r1 = 0
            r14 = 0
        L_0x04f5:
            int[] r0 = r6.f5312a
            int r15 = r0.length
            sun.misc.Unsafe r5 = f5311s
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r4 = 0
        L_0x04ff:
            if (r4 >= r15) goto L_0x0b2f
            int r3 = r6.F(r4)
            int[] r10 = r6.f5312a
            r12 = r10[r4]
            r17 = r3 & r9
            int r9 = r17 >>> 20
            r11 = 17
            if (r9 > r11) goto L_0x0530
            int r11 = r4 + 2
            r10 = r10[r11]
            r11 = r10 & r13
            r19 = r14
            if (r11 == r0) goto L_0x0526
            if (r11 != r13) goto L_0x051f
            r2 = 0
            goto L_0x0525
        L_0x051f:
            long r13 = (long) r11
            int r0 = r5.getInt(r7, r13)
            r2 = r0
        L_0x0525:
            r0 = r11
        L_0x0526:
            int r10 = r10 >>> 20
            r11 = 1
            int r10 = r11 << r10
            r11 = r1
            r13 = r2
            r14 = r10
            r10 = r0
            goto L_0x0536
        L_0x0530:
            r19 = r14
            r10 = r0
            r11 = r1
            r13 = r2
            r14 = 0
        L_0x0536:
            if (r11 == 0) goto L_0x0555
            com.google.android.gms.internal.measurement.e8<?> r0 = r6.f5327p
            int r0 = r0.a(r11)
            if (r0 > r12) goto L_0x0555
            com.google.android.gms.internal.measurement.e8<?> r0 = r6.f5327p
            r0.d(r8, r11)
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0553
            java.lang.Object r0 = r19.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r11 = r0
            goto L_0x0536
        L_0x0553:
            r11 = 0
            goto L_0x0536
        L_0x0555:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3 & r18
            long r2 = (long) r0
            switch(r9) {
                case 0: goto L_0x0af9;
                case 1: goto L_0x0ad7;
                case 2: goto L_0x0ab5;
                case 3: goto L_0x0a92;
                case 4: goto L_0x0a6f;
                case 5: goto L_0x0a4c;
                case 6: goto L_0x0a29;
                case 7: goto L_0x0a06;
                case 8: goto L_0x09e3;
                case 9: goto L_0x09bc;
                case 10: goto L_0x0997;
                case 11: goto L_0x0974;
                case 12: goto L_0x0951;
                case 13: goto L_0x092e;
                case 14: goto L_0x090b;
                case 15: goto L_0x08e8;
                case 16: goto L_0x08c5;
                case 17: goto L_0x0899;
                case 18: goto L_0x0888;
                case 19: goto L_0x0877;
                case 20: goto L_0x0866;
                case 21: goto L_0x0855;
                case 22: goto L_0x0844;
                case 23: goto L_0x0833;
                case 24: goto L_0x0822;
                case 25: goto L_0x0811;
                case 26: goto L_0x0801;
                case 27: goto L_0x07ed;
                case 28: goto L_0x07dd;
                case 29: goto L_0x07cc;
                case 30: goto L_0x07bb;
                case 31: goto L_0x07aa;
                case 32: goto L_0x0799;
                case 33: goto L_0x0788;
                case 34: goto L_0x0777;
                case 35: goto L_0x0767;
                case 36: goto L_0x0757;
                case 37: goto L_0x0747;
                case 38: goto L_0x0737;
                case 39: goto L_0x0727;
                case 40: goto L_0x0717;
                case 41: goto L_0x0707;
                case 42: goto L_0x06f7;
                case 43: goto L_0x06e7;
                case 44: goto L_0x06d7;
                case 45: goto L_0x06c7;
                case 46: goto L_0x06b7;
                case 47: goto L_0x06a7;
                case 48: goto L_0x0697;
                case 49: goto L_0x0684;
                case 50: goto L_0x067b;
                case 51: goto L_0x066c;
                case 52: goto L_0x065d;
                case 53: goto L_0x064e;
                case 54: goto L_0x063f;
                case 55: goto L_0x0630;
                case 56: goto L_0x0621;
                case 57: goto L_0x0612;
                case 58: goto L_0x0603;
                case 59: goto L_0x05f4;
                case 60: goto L_0x05e1;
                case 61: goto L_0x05d0;
                case 62: goto L_0x05c2;
                case 63: goto L_0x05b4;
                case 64: goto L_0x05a6;
                case 65: goto L_0x0598;
                case 66: goto L_0x058a;
                case 67: goto L_0x057c;
                case 68: goto L_0x056a;
                default: goto L_0x055e;
            }
        L_0x055e:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r11 = r4
            r15 = r5
            goto L_0x0b1a
        L_0x056a:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            java.lang.Object r0 = r5.getObject(r7, r2)
            com.google.android.gms.internal.measurement.va r1 = r6.M(r4)
            r8.B(r12, r0, r1)
            goto L_0x055e
        L_0x057c:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            long r0 = K(r7, r2)
            r8.z(r12, r0)
            goto L_0x055e
        L_0x058a:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            int r0 = G(r7, r2)
            r8.F(r12, r0)
            goto L_0x055e
        L_0x0598:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            long r0 = K(r7, r2)
            r8.r(r12, r0)
            goto L_0x055e
        L_0x05a6:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            int r0 = G(r7, r2)
            r8.w(r12, r0)
            goto L_0x055e
        L_0x05b4:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            int r0 = G(r7, r2)
            r8.J(r12, r0)
            goto L_0x055e
        L_0x05c2:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            int r0 = G(r7, r2)
            r8.g(r12, r0)
            goto L_0x055e
        L_0x05d0:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            java.lang.Object r0 = r5.getObject(r7, r2)
            com.google.android.gms.internal.measurement.f7 r0 = (com.google.android.gms.internal.measurement.f7) r0
            r8.d(r12, r0)
            goto L_0x055e
        L_0x05e1:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            java.lang.Object r0 = r5.getObject(r7, r2)
            com.google.android.gms.internal.measurement.va r1 = r6.M(r4)
            r8.c(r12, r0, r1)
            goto L_0x055e
        L_0x05f4:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            java.lang.Object r0 = r5.getObject(r7, r2)
            s(r12, r0, r8)
            goto L_0x055e
        L_0x0603:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            boolean r0 = O(r7, r2)
            r8.b(r12, r0)
            goto L_0x055e
        L_0x0612:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            int r0 = G(r7, r2)
            r8.k(r12, r0)
            goto L_0x055e
        L_0x0621:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            long r0 = K(r7, r2)
            r8.L(r12, r0)
            goto L_0x055e
        L_0x0630:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            int r0 = G(r7, r2)
            r8.q(r12, r0)
            goto L_0x055e
        L_0x063f:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            long r0 = K(r7, r2)
            r8.H(r12, r0)
            goto L_0x055e
        L_0x064e:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            long r0 = K(r7, r2)
            r8.i(r12, r0)
            goto L_0x055e
        L_0x065d:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            float r0 = A(r7, r2)
            r8.N(r12, r0)
            goto L_0x055e
        L_0x066c:
            boolean r0 = r6.I(r7, r12, r4)
            if (r0 == 0) goto L_0x055e
            double r0 = i(r7, r2)
            r8.M(r12, r0)
            goto L_0x055e
        L_0x067b:
            java.lang.Object r0 = r5.getObject(r7, r2)
            r6.u(r8, r12, r0, r4)
            goto L_0x055e
        L_0x0684:
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.va r2 = r6.M(r4)
            com.google.android.gms.internal.measurement.wa.j(r0, r1, r8, r2)
            goto L_0x055e
        L_0x0697:
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r9 = 1
            com.google.android.gms.internal.measurement.wa.a0(r0, r1, r8, r9)
            goto L_0x055e
        L_0x06a7:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.Z(r0, r1, r8, r9)
            goto L_0x055e
        L_0x06b7:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.Y(r0, r1, r8, r9)
            goto L_0x055e
        L_0x06c7:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.V(r0, r1, r8, r9)
            goto L_0x055e
        L_0x06d7:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.B(r0, r1, r8, r9)
            goto L_0x055e
        L_0x06e7:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.b0(r0, r1, r8, r9)
            goto L_0x055e
        L_0x06f7:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.k(r0, r1, r8, r9)
            goto L_0x055e
        L_0x0707:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.F(r0, r1, r8, r9)
            goto L_0x055e
        L_0x0717:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.J(r0, r1, r8, r9)
            goto L_0x055e
        L_0x0727:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.P(r0, r1, r8, r9)
            goto L_0x055e
        L_0x0737:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.c0(r0, r1, r8, r9)
            goto L_0x055e
        L_0x0747:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.S(r0, r1, r8, r9)
            goto L_0x055e
        L_0x0757:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.M(r0, r1, r8, r9)
            goto L_0x055e
        L_0x0767:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.x(r0, r1, r8, r9)
            goto L_0x055e
        L_0x0777:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r12 = 0
            com.google.android.gms.internal.measurement.wa.a0(r0, r1, r8, r12)
            goto L_0x055e
        L_0x0788:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.Z(r0, r1, r8, r12)
            goto L_0x055e
        L_0x0799:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.Y(r0, r1, r8, r12)
            goto L_0x055e
        L_0x07aa:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.V(r0, r1, r8, r12)
            goto L_0x055e
        L_0x07bb:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.B(r0, r1, r8, r12)
            goto L_0x055e
        L_0x07cc:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.b0(r0, r1, r8, r12)
            goto L_0x055e
        L_0x07dd:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.i(r0, r1, r8)
            goto L_0x055e
        L_0x07ed:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.va r2 = r6.M(r4)
            com.google.android.gms.internal.measurement.wa.w(r0, r1, r8, r2)
            goto L_0x055e
        L_0x0801:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.v(r0, r1, r8)
            goto L_0x055e
        L_0x0811:
            r9 = 1
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r12 = 0
            com.google.android.gms.internal.measurement.wa.k(r0, r1, r8, r12)
            goto L_0x055e
        L_0x0822:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.F(r0, r1, r8, r12)
            goto L_0x055e
        L_0x0833:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.J(r0, r1, r8, r12)
            goto L_0x055e
        L_0x0844:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.P(r0, r1, r8, r12)
            goto L_0x055e
        L_0x0855:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.c0(r0, r1, r8, r12)
            goto L_0x055e
        L_0x0866:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.S(r0, r1, r8, r12)
            goto L_0x055e
        L_0x0877:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.M(r0, r1, r8, r12)
            goto L_0x055e
        L_0x0888:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f5312a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.wa.x(r0, r1, r8, r12)
            goto L_0x055e
        L_0x0899:
            r9 = 1
            r16 = 0
            r0 = r23
            r1 = r24
            r8 = r2
            r2 = r4
            r3 = r10
            r20 = r11
            r11 = r4
            r4 = r13
            r21 = r15
            r15 = r5
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x08bf
            java.lang.Object r0 = r15.getObject(r7, r8)
            com.google.android.gms.internal.measurement.va r1 = r6.M(r11)
            r8 = r25
            r8.B(r12, r0, r1)
            goto L_0x08c1
        L_0x08bf:
            r8 = r25
        L_0x08c1:
            r22 = r10
            goto L_0x0b1a
        L_0x08c5:
            r20 = r11
            r21 = r15
            r16 = 0
            r11 = r4
            r15 = r5
            r4 = r2
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r10
            r22 = r10
            r9 = r4
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            long r0 = r15.getLong(r7, r9)
            r8.z(r12, r0)
            goto L_0x0b1a
        L_0x08e8:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            int r0 = r15.getInt(r7, r9)
            r8.F(r12, r0)
            goto L_0x0b1a
        L_0x090b:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            long r0 = r15.getLong(r7, r9)
            r8.r(r12, r0)
            goto L_0x0b1a
        L_0x092e:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            int r0 = r15.getInt(r7, r9)
            r8.w(r12, r0)
            goto L_0x0b1a
        L_0x0951:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            int r0 = r15.getInt(r7, r9)
            r8.J(r12, r0)
            goto L_0x0b1a
        L_0x0974:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            int r0 = r15.getInt(r7, r9)
            r8.g(r12, r0)
            goto L_0x0b1a
        L_0x0997:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            java.lang.Object r0 = r15.getObject(r7, r9)
            com.google.android.gms.internal.measurement.f7 r0 = (com.google.android.gms.internal.measurement.f7) r0
            r8.d(r12, r0)
            goto L_0x0b1a
        L_0x09bc:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            java.lang.Object r0 = r15.getObject(r7, r9)
            com.google.android.gms.internal.measurement.va r1 = r6.M(r11)
            r8.c(r12, r0, r1)
            goto L_0x0b1a
        L_0x09e3:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            java.lang.Object r0 = r15.getObject(r7, r9)
            s(r12, r0, r8)
            goto L_0x0b1a
        L_0x0a06:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            boolean r0 = com.google.android.gms.internal.measurement.ac.F(r7, r9)
            r8.b(r12, r0)
            goto L_0x0b1a
        L_0x0a29:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            int r0 = r15.getInt(r7, r9)
            r8.k(r12, r0)
            goto L_0x0b1a
        L_0x0a4c:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            long r0 = r15.getLong(r7, r9)
            r8.L(r12, r0)
            goto L_0x0b1a
        L_0x0a6f:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            int r0 = r15.getInt(r7, r9)
            r8.q(r12, r0)
            goto L_0x0b1a
        L_0x0a92:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            long r0 = r15.getLong(r7, r9)
            r8.H(r12, r0)
            goto L_0x0b1a
        L_0x0ab5:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            long r0 = r15.getLong(r7, r9)
            r8.i(r12, r0)
            goto L_0x0b1a
        L_0x0ad7:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            float r0 = com.google.android.gms.internal.measurement.ac.n(r7, r9)
            r8.N(r12, r0)
            goto L_0x0b1a
        L_0x0af9:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.y(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b1a
            double r0 = com.google.android.gms.internal.measurement.ac.a(r7, r9)
            r8.M(r12, r0)
        L_0x0b1a:
            int r4 = r11 + 3
            r2 = r13
            r5 = r15
            r14 = r19
            r1 = r20
            r15 = r21
            r0 = r22
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r11 = 1
            r12 = 0
            r13 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x04ff
        L_0x0b2f:
            r19 = r14
        L_0x0b31:
            if (r1 == 0) goto L_0x0b48
            com.google.android.gms.internal.measurement.e8<?> r0 = r6.f5327p
            r0.d(r8, r1)
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0b46
            java.lang.Object r0 = r19.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r1 = r0
            goto L_0x0b31
        L_0x0b46:
            r1 = 0
            goto L_0x0b31
        L_0x0b48:
            com.google.android.gms.internal.measurement.ub<?, ?> r0 = r6.f5326o
            t(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ha.h(java.lang.Object, com.google.android.gms.internal.measurement.qc):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.google.android.gms.internal.measurement.sb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v81, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v101, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v103, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v87, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v107, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v108, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v111, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v114, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v116, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v117, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v119, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v120, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v121, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v122, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v123, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v127, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v131, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v134, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v137, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v139, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v141, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v142, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v145, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v147, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v148, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v149, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v150, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v152, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v154, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v157, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v158, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v160, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v106, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v109, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v110, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v56, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v165, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v112, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v75, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v166, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v167, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v168, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v169, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v171, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v173, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v119, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v80, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v176, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v177, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v179, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v181, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v54, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v182, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v55, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v184, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v185, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v187, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v188, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v56, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v190, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v191, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v59, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v192, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v60, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v61, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v193, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v98, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v132, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v63, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v194, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v65, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v62, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v135, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v137, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v68, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v68, resolved type: byte} */
    /* JADX WARNING: type inference failed for: r11v69, types: [int] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0367, code lost:
        r1 = r26 | r21;
        r10 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x036a, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x036b, code lost:
        r3 = r12;
        r4 = r13;
        r5 = r14;
        r11 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0370, code lost:
        r9 = r24;
        r14 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0374, code lost:
        r8 = r0;
        r13 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0378, code lost:
        r10 = r3;
        r4 = r8;
        r2 = r11;
        r20 = r12;
        r11 = r14;
        r3 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0436, code lost:
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0437, code lost:
        r12 = r13;
        r11 = r19;
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0535, code lost:
        r9 = r11;
        r8 = r12;
        r12 = r13;
        r11 = r19;
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0550, code lost:
        if (r1 == 0) goto L_0x0552;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0552, code lost:
        r14.add(com.google.android.gms.internal.measurement.f7.f5243n);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0558, code lost:
        r14.add(com.google.android.gms.internal.measurement.f7.l(r15, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0560, code lost:
        if (r0 >= r12) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0562, code lost:
        r1 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0568, code lost:
        if (r10 != r13.f5207a) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x056a, code lost:
        r0 = com.google.android.gms.internal.measurement.b7.p(r15, r1, r13);
        r1 = r13.f5207a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0570, code lost:
        if (r1 < 0) goto L_0x057e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0574, code lost:
        if (r1 > (r15.length - r0)) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0576, code lost:
        if (r1 != 0) goto L_0x0558;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x057d, code lost:
        throw com.google.android.gms.internal.measurement.b9.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0582, code lost:
        throw com.google.android.gms.internal.measurement.b9.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05b4, code lost:
        r9 = r11;
        r8 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x066b, code lost:
        r12 = r1;
        r11 = r2;
        r8 = r3;
        r9 = r4;
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x06b0, code lost:
        if (r1.f5208b != 0) goto L_0x06b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x06b2, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x06b4, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x06b5, code lost:
        r14.d(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06b8, code lost:
        if (r0 >= r3) goto L_0x077e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06ba, code lost:
        r8 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06c0, code lost:
        if (r5 != r1.f5207a) goto L_0x077e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06c2, code lost:
        r0 = com.google.android.gms.internal.measurement.b7.q(r15, r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06ca, code lost:
        if (r1.f5208b == 0) goto L_0x06b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0765, code lost:
        r12 = r1;
        r8 = r3;
        r9 = r4;
        r10 = r5;
        r0 = r11;
        r11 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x077e, code lost:
        r12 = r1;
        r11 = r2;
        r8 = r3;
        r9 = r4;
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a9, code lost:
        r13 = r35;
        r14 = r36;
        r24 = r8;
        r19 = r12;
        r8 = r37;
        r12 = r3;
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0878, code lost:
        r0 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0879, code lost:
        if (r0 != r9) goto L_0x088c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x087b, code lost:
        r2 = r0;
        r3 = r10;
        r20 = r11;
        r4 = r12;
        r11 = r13;
        r9 = r24;
        r13 = r26;
        r14 = r27;
        r10 = r7;
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x088c, code lost:
        r4 = r8;
        r3 = r11;
        r2 = r12;
        r5 = r13;
        r9 = r24;
        r13 = r26;
        r14 = r27;
        r8 = r0;
        r11 = r10;
        r10 = r7;
        r7 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0913, code lost:
        r28 = r11;
        r4 = r12;
        r12 = r14;
        r9 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x097d, code lost:
        r5.putObject(r7, r13, r8);
        r5.putInt(r7, r1, r4);
        r8 = r0;
        r20 = r9;
        r28 = r11;
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0989, code lost:
        r4 = r3;
        r3 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x09c3, code lost:
        r20 = r9;
        r28 = r11;
        r9 = r4;
        r4 = r3;
        r3 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x09df, code lost:
        r5.putObject(r7, r13, r8);
        r5.putInt(r7, r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x09e5, code lost:
        r8 = r0;
        r20 = r9;
        r28 = r11;
        r9 = r4;
        r4 = r3;
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0adb, code lost:
        r5.putObject(r7, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0ade, code lost:
        r5.putInt(r7, r1, r9);
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x0af6, code lost:
        r5.putObject(r7, r13, r0);
        r11 = r12 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0b0f, code lost:
        r5.putObject(r7, r13, r0);
        r11 = r12 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0b14, code lost:
        r5.putInt(r7, r1, r9);
        r8 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0b1a, code lost:
        if (r8 != r12) goto L_0x0b7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0b1c, code lost:
        r11 = r36;
        r2 = r8;
        r13 = r26;
        r14 = r27;
        r10 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0b7a, code lost:
        r4 = r35;
        r5 = r36;
        r2 = r37;
        r11 = r3;
        r3 = r20;
        r13 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01c6, code lost:
        r3 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01e6, code lost:
        r1 = r26 | r21;
        r11 = r4;
        r10 = r5;
        r2 = r8;
        r3 = r12;
        r4 = r13;
        r5 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x021f, code lost:
        r19 = r4;
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ef, code lost:
        r1 = r26 | r21;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x032a, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0634  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.measurement.e7 r37) {
        /*
            r31 = this;
            r6 = r31
            r7 = r32
            r15 = r33
            r4 = r35
            r5 = r36
            r2 = r37
            Q(r32)
            sun.misc.Unsafe r3 = f5311s
            r16 = 0
            r8 = r34
            r9 = -1
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            r17 = 0
            if (r8 >= r4) goto L_0x0b88
            int r11 = r8 + 1
            byte r8 = r15[r8]
            if (r8 >= 0) goto L_0x002f
            int r8 = com.google.android.gms.internal.measurement.b7.e(r8, r15, r11, r2)
            int r11 = r2.f5207a
            r12 = r11
            r11 = r8
            goto L_0x0030
        L_0x002f:
            r12 = r8
        L_0x0030:
            int r8 = r12 >>> 3
            r0 = r12 & 7
            r1 = 3
            if (r8 <= r9) goto L_0x0047
            int r10 = r10 / r1
            int r9 = r6.f5314c
            if (r8 < r9) goto L_0x0045
            int r9 = r6.f5315d
            if (r8 > r9) goto L_0x0045
            int r9 = r6.k(r8, r10)
            goto L_0x004b
        L_0x0045:
            r9 = -1
            goto L_0x004b
        L_0x0047:
            int r9 = r6.j(r8)
        L_0x004b:
            r10 = r9
            r9 = -1
            if (r10 != r9) goto L_0x005b
            r4 = r2
            r20 = r3
            r9 = r8
            r2 = r11
            r3 = r12
            r10 = 0
            r18 = -1
            r11 = r5
            goto L_0x0b25
        L_0x005b:
            int[] r9 = r6.f5312a
            int r20 = r10 + 1
            r1 = r9[r20]
            r20 = 267386880(0xff00000, float:2.3665827E-29)
            r20 = r1 & r20
            int r4 = r20 >>> 20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r1 & r18
            r20 = r1
            long r1 = (long) r5
            java.lang.String r5 = ""
            r22 = 0
            r24 = r1
            r2 = 1
            r1 = 17
            if (r4 > r1) goto L_0x0382
            int r1 = r10 + 2
            r1 = r9[r1]
            int r9 = r1 >>> 20
            int r21 = r2 << r9
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r9
            r18 = r10
            if (r1 == r14) goto L_0x00a2
            if (r14 == r9) goto L_0x0093
            long r9 = (long) r14
            r3.putInt(r7, r9, r13)
            r9 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0093:
            if (r1 != r9) goto L_0x0097
            r13 = 0
            goto L_0x009d
        L_0x0097:
            long r13 = (long) r1
            int r10 = r3.getInt(r7, r13)
            r13 = r10
        L_0x009d:
            r27 = r1
            r26 = r13
            goto L_0x00a6
        L_0x00a2:
            r26 = r13
            r27 = r14
        L_0x00a6:
            switch(r4) {
                case 0: goto L_0x034a;
                case 1: goto L_0x032c;
                case 2: goto L_0x02f4;
                case 3: goto L_0x02f4;
                case 4: goto L_0x02d3;
                case 5: goto L_0x02a9;
                case 6: goto L_0x028b;
                case 7: goto L_0x0266;
                case 8: goto L_0x0224;
                case 9: goto L_0x01f0;
                case 10: goto L_0x01ca;
                case 11: goto L_0x02d3;
                case 12: goto L_0x0171;
                case 13: goto L_0x028b;
                case 14: goto L_0x02a9;
                case 15: goto L_0x0141;
                case 16: goto L_0x00f0;
                case 17: goto L_0x00ba;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            r13 = r35
            r14 = r36
            r24 = r8
            r19 = r12
            r8 = r37
            r12 = r3
            r3 = r18
            r18 = -1
            goto L_0x0378
        L_0x00ba:
            r1 = 3
            if (r0 != r1) goto L_0x00a9
            r0 = r18
            java.lang.Object r1 = r6.o(r7, r0)
            int r2 = r8 << 3
            r13 = r2 | 4
            com.google.android.gms.internal.measurement.va r2 = r6.M(r0)
            r4 = r8
            r8 = r1
            r5 = -1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r2
            r2 = r0
            r10 = r33
            r0 = r12
            r12 = r35
            r14 = r37
            int r8 = com.google.android.gms.internal.measurement.b7.i(r8, r9, r10, r11, r12, r13, r14)
            r6.w(r7, r2, r1)
            r13 = r26 | r21
            r5 = r36
            r11 = r0
            r10 = r2
            r9 = r4
            r14 = r27
            r4 = r35
            r2 = r37
            goto L_0x001c
        L_0x00f0:
            r4 = r8
            r2 = r18
            r5 = -1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r37
            if (r0 != 0) goto L_0x0133
            r9 = r24
            int r11 = com.google.android.gms.internal.measurement.b7.q(r15, r11, r8)
            long r0 = r8.f5208b
            long r13 = com.google.android.gms.internal.measurement.v7.b(r0)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r18 = -1
            r1 = r32
            r28 = r2
            r19 = r12
            r12 = r3
            r2 = r9
            r9 = r35
            r10 = r36
            r24 = r4
            r4 = r13
            r0.putLong(r1, r2, r4)
            r13 = r26 | r21
            r2 = r8
            r4 = r9
            r5 = r10
            r8 = r11
            r3 = r12
            r11 = r19
            r9 = r24
        L_0x012d:
            r14 = r27
            r10 = r28
            goto L_0x001c
        L_0x0133:
            r24 = r4
            r19 = r12
            r18 = -1
            r12 = r3
            r13 = r35
            r14 = r36
            r3 = r2
            goto L_0x0378
        L_0x0141:
            r13 = r35
            r14 = r36
            r19 = r12
            r28 = r18
            r9 = r24
            r18 = -1
            r12 = r3
            r24 = r8
            r8 = r37
            if (r0 != 0) goto L_0x01c6
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r11, r8)
            int r1 = r8.f5207a
            int r1 = com.google.android.gms.internal.measurement.v7.e(r1)
            r12.putInt(r7, r9, r1)
            r1 = r26 | r21
            r2 = r8
            r3 = r12
            r4 = r13
            r5 = r14
            r11 = r19
            r9 = r24
            r14 = r27
            r10 = r28
            goto L_0x0374
        L_0x0171:
            r13 = r35
            r14 = r36
            r19 = r12
            r28 = r18
            r9 = r24
            r18 = -1
            r12 = r3
            r24 = r8
            r8 = r37
            if (r0 != 0) goto L_0x01c6
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r11, r8)
            int r1 = r8.f5207a
            r5 = r28
            com.google.android.gms.internal.measurement.x8 r3 = r6.L(r5)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r20 & r4
            if (r4 == 0) goto L_0x0197
            goto L_0x0198
        L_0x0197:
            r2 = 0
        L_0x0198:
            if (r2 == 0) goto L_0x01c0
            if (r3 == 0) goto L_0x01c0
            boolean r2 = r3.e(r1)
            if (r2 == 0) goto L_0x01a3
            goto L_0x01c0
        L_0x01a3:
            com.google.android.gms.internal.measurement.sb r2 = N(r32)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r4 = r19
            r2.e(r4, r1)
            r11 = r4
            r10 = r5
            r2 = r8
            r3 = r12
            r4 = r13
            r5 = r14
            r9 = r24
            r13 = r26
            r14 = r27
            r8 = r0
            goto L_0x001c
        L_0x01c0:
            r4 = r19
            r12.putInt(r7, r9, r1)
            goto L_0x01e6
        L_0x01c6:
            r3 = r28
            goto L_0x0378
        L_0x01ca:
            r13 = r35
            r14 = r36
            r4 = r12
            r5 = r18
            r9 = r24
            r1 = 2
            r18 = -1
            r12 = r3
            r24 = r8
            r8 = r37
            if (r0 != r1) goto L_0x021f
            int r0 = com.google.android.gms.internal.measurement.b7.k(r15, r11, r8)
            java.lang.Object r1 = r8.f5209c
            r12.putObject(r7, r9, r1)
        L_0x01e6:
            r1 = r26 | r21
            r11 = r4
            r10 = r5
            r2 = r8
            r3 = r12
            r4 = r13
            r5 = r14
            goto L_0x0370
        L_0x01f0:
            r13 = r35
            r14 = r36
            r24 = r8
            r4 = r12
            r5 = r18
            r1 = 2
            r18 = -1
            r8 = r37
            r12 = r3
            if (r0 != r1) goto L_0x021f
            java.lang.Object r9 = r6.o(r7, r5)
            com.google.android.gms.internal.measurement.va r1 = r6.M(r5)
            r0 = r9
            r2 = r33
            r3 = r11
            r19 = r4
            r4 = r35
            r10 = r5
            r5 = r37
            int r0 = com.google.android.gms.internal.measurement.b7.j(r0, r1, r2, r3, r4, r5)
            r6.w(r7, r10, r9)
            r1 = r26 | r21
            goto L_0x036a
        L_0x021f:
            r19 = r4
            r3 = r5
            goto L_0x0378
        L_0x0224:
            r13 = r35
            r14 = r36
            r19 = r12
            r4 = r18
            r9 = r24
            r1 = 2
            r18 = -1
            r12 = r3
            r24 = r8
            r8 = r37
            if (r0 != r1) goto L_0x032a
            boolean r0 = R(r20)
            if (r0 == 0) goto L_0x0243
            int r0 = com.google.android.gms.internal.measurement.b7.n(r15, r11, r8)
            goto L_0x025a
        L_0x0243:
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r11, r8)
            int r1 = r8.f5207a
            if (r1 < 0) goto L_0x0261
            if (r1 != 0) goto L_0x0250
            r8.f5209c = r5
            goto L_0x025a
        L_0x0250:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.android.gms.internal.measurement.r8.f5562b
            r2.<init>(r15, r0, r1, r3)
            r8.f5209c = r2
            int r0 = r0 + r1
        L_0x025a:
            java.lang.Object r1 = r8.f5209c
            r12.putObject(r7, r9, r1)
            goto L_0x02ef
        L_0x0261:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.d()
            throw r0
        L_0x0266:
            r13 = r35
            r14 = r36
            r19 = r12
            r4 = r18
            r9 = r24
            r18 = -1
            r12 = r3
            r24 = r8
            r8 = r37
            if (r0 != 0) goto L_0x032a
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r11, r8)
            long r2 = r8.f5208b
            int r5 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r5 == 0) goto L_0x0285
            r2 = 1
            goto L_0x0286
        L_0x0285:
            r2 = 0
        L_0x0286:
            com.google.android.gms.internal.measurement.ac.v(r7, r9, r2)
            goto L_0x02ef
        L_0x028b:
            r13 = r35
            r14 = r36
            r19 = r12
            r4 = r18
            r9 = r24
            r1 = 5
            r18 = -1
            r12 = r3
            r24 = r8
            r8 = r37
            if (r0 != r1) goto L_0x032a
            int r0 = com.google.android.gms.internal.measurement.b7.o(r15, r11)
            r12.putInt(r7, r9, r0)
            int r0 = r11 + 4
            goto L_0x02ef
        L_0x02a9:
            r13 = r35
            r14 = r36
            r19 = r12
            r4 = r18
            r9 = r24
            r1 = 1
            r18 = -1
            r12 = r3
            r24 = r8
            r8 = r37
            if (r0 != r1) goto L_0x032a
            long r22 = com.google.android.gms.internal.measurement.b7.r(r15, r11)
            r0 = r12
            r1 = r32
            r2 = r9
            r9 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            int r0 = r11 + 8
            r1 = r26 | r21
            r2 = r8
            r10 = r9
            goto L_0x036b
        L_0x02d3:
            r13 = r35
            r14 = r36
            r19 = r12
            r4 = r18
            r9 = r24
            r18 = -1
            r12 = r3
            r24 = r8
            r8 = r37
            if (r0 != 0) goto L_0x032a
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r11, r8)
            int r1 = r8.f5207a
            r12.putInt(r7, r9, r1)
        L_0x02ef:
            r1 = r26 | r21
            r10 = r4
            goto L_0x036a
        L_0x02f4:
            r13 = r35
            r14 = r36
            r19 = r12
            r4 = r18
            r9 = r24
            r18 = -1
            r12 = r3
            r24 = r8
            r8 = r37
            if (r0 != 0) goto L_0x032a
            int r11 = com.google.android.gms.internal.measurement.b7.q(r15, r11, r8)
            long r2 = r8.f5208b
            r0 = r12
            r1 = r32
            r22 = r2
            r2 = r9
            r9 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            r0 = r26 | r21
            r2 = r8
            r10 = r9
            r8 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r11 = r19
            r9 = r24
            r14 = r27
            r13 = r0
            goto L_0x001c
        L_0x032a:
            r3 = r4
            goto L_0x0378
        L_0x032c:
            r13 = r35
            r14 = r36
            r19 = r12
            r9 = r24
            r1 = 5
            r12 = r3
            r24 = r8
            r3 = r18
            r18 = -1
            r8 = r37
            if (r0 != r1) goto L_0x0378
            float r0 = com.google.android.gms.internal.measurement.b7.m(r15, r11)
            com.google.android.gms.internal.measurement.ac.g(r7, r9, r0)
            int r0 = r11 + 4
            goto L_0x0367
        L_0x034a:
            r13 = r35
            r14 = r36
            r19 = r12
            r9 = r24
            r1 = 1
            r12 = r3
            r24 = r8
            r3 = r18
            r18 = -1
            r8 = r37
            if (r0 != r1) goto L_0x0378
            double r0 = com.google.android.gms.internal.measurement.b7.a(r15, r11)
            com.google.android.gms.internal.measurement.ac.f(r7, r9, r0)
            int r0 = r11 + 8
        L_0x0367:
            r1 = r26 | r21
            r10 = r3
        L_0x036a:
            r2 = r8
        L_0x036b:
            r3 = r12
            r4 = r13
            r5 = r14
            r11 = r19
        L_0x0370:
            r9 = r24
            r14 = r27
        L_0x0374:
            r8 = r0
            r13 = r1
            goto L_0x001c
        L_0x0378:
            r10 = r3
            r4 = r8
            r2 = r11
            r20 = r12
            r11 = r14
            r3 = r19
            goto L_0x08f7
        L_0x0382:
            r19 = r12
            r1 = r24
            r18 = -1
            r12 = r3
            r24 = r8
            r3 = r10
            r10 = r36
            r8 = 27
            r25 = 10
            if (r4 != r8) goto L_0x03f2
            r8 = 2
            if (r0 != r8) goto L_0x03e1
            java.lang.Object r0 = r12.getObject(r7, r1)
            com.google.android.gms.internal.measurement.y8 r0 = (com.google.android.gms.internal.measurement.y8) r0
            boolean r4 = r0.b()
            if (r4 != 0) goto L_0x03b7
            int r4 = r0.size()
            if (r4 != 0) goto L_0x03ac
            r4 = 10
            goto L_0x03b0
        L_0x03ac:
            int r25 = r4 << 1
            r4 = r25
        L_0x03b0:
            com.google.android.gms.internal.measurement.y8 r0 = r0.e(r4)
            r12.putObject(r7, r1, r0)
        L_0x03b7:
            com.google.android.gms.internal.measurement.va r8 = r6.M(r3)
            r1 = r37
            r9 = r19
            r2 = r10
            r10 = r33
            r4 = r12
            r5 = r19
            r12 = r35
            r26 = r13
            r13 = r0
            r27 = r14
            r14 = r37
            int r8 = com.google.android.gms.internal.measurement.b7.f(r8, r9, r10, r11, r12, r13, r14)
            r10 = r3
            r3 = r4
            r11 = r5
            r9 = r24
            r13 = r26
            r14 = r27
            r4 = r35
            r5 = r2
            r2 = r1
            goto L_0x001c
        L_0x03e1:
            r26 = r13
            r27 = r14
            r5 = r35
            r13 = r10
            r14 = r11
            r20 = r12
            r12 = r37
            r11 = r3
            r3 = r19
            goto L_0x08f3
        L_0x03f2:
            r26 = r13
            r27 = r14
            r13 = r37
            r14 = r10
            r10 = r19
            r8 = 49
            if (r4 > r8) goto L_0x089d
            r8 = r20
            long r8 = (long) r8
            r19 = r12
            sun.misc.Unsafe r12 = f5311s
            java.lang.Object r20 = r12.getObject(r7, r1)
            r14 = r20
            com.google.android.gms.internal.measurement.y8 r14 = (com.google.android.gms.internal.measurement.y8) r14
            boolean r20 = r14.b()
            if (r20 != 0) goto L_0x042e
            int r20 = r14.size()
            if (r20 != 0) goto L_0x041f
            r20 = r5
            r5 = 10
            goto L_0x0425
        L_0x041f:
            int r25 = r20 << 1
            r20 = r5
            r5 = r25
        L_0x0425:
            com.google.android.gms.internal.measurement.y8 r5 = r14.e(r5)
            r12.putObject(r7, r1, r5)
            r14 = r5
            goto L_0x0430
        L_0x042e:
            r20 = r5
        L_0x0430:
            switch(r4) {
                case 18: goto L_0x082d;
                case 19: goto L_0x07e1;
                case 20: goto L_0x079b;
                case 21: goto L_0x079b;
                case 22: goto L_0x076d;
                case 23: goto L_0x0719;
                case 24: goto L_0x06cd;
                case 25: goto L_0x0672;
                case 26: goto L_0x05b8;
                case 27: goto L_0x058d;
                case 28: goto L_0x053e;
                case 29: goto L_0x076d;
                case 30: goto L_0x0509;
                case 31: goto L_0x06cd;
                case 32: goto L_0x0719;
                case 33: goto L_0x04c2;
                case 34: goto L_0x047a;
                case 35: goto L_0x082d;
                case 36: goto L_0x07e1;
                case 37: goto L_0x079b;
                case 38: goto L_0x079b;
                case 39: goto L_0x076d;
                case 40: goto L_0x0719;
                case 41: goto L_0x06cd;
                case 42: goto L_0x0672;
                case 43: goto L_0x076d;
                case 44: goto L_0x0509;
                case 45: goto L_0x06cd;
                case 46: goto L_0x0719;
                case 47: goto L_0x04c2;
                case 48: goto L_0x047a;
                case 49: goto L_0x043e;
                default: goto L_0x0433;
            }
        L_0x0433:
            r8 = r35
            r7 = r3
        L_0x0436:
            r9 = r11
        L_0x0437:
            r12 = r13
            r11 = r19
            r13 = r36
            goto L_0x0878
        L_0x043e:
            r1 = 3
            if (r0 != r1) goto L_0x0476
            com.google.android.gms.internal.measurement.va r8 = r6.M(r3)
            r0 = r10 & -8
            r9 = r0 | 4
            r0 = r8
            r1 = r33
            r12 = r35
            r2 = r11
            r5 = r3
            r3 = r35
            r4 = r9
            r7 = r5
            r5 = r37
            int r0 = com.google.android.gms.internal.measurement.b7.g(r0, r1, r2, r3, r4, r5)
        L_0x045a:
            java.lang.Object r1 = r13.f5209c
            r14.add(r1)
            if (r0 >= r12) goto L_0x0535
            int r2 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r13)
            int r1 = r13.f5207a
            if (r10 != r1) goto L_0x0535
            r0 = r8
            r1 = r33
            r3 = r35
            r4 = r9
            r5 = r37
            int r0 = com.google.android.gms.internal.measurement.b7.g(r0, r1, r2, r3, r4, r5)
            goto L_0x045a
        L_0x0476:
            r7 = r3
            r8 = r35
            goto L_0x0436
        L_0x047a:
            r12 = r35
            r7 = r3
            r1 = 2
            if (r0 != r1) goto L_0x04a2
            com.google.android.gms.internal.measurement.r9 r14 = (com.google.android.gms.internal.measurement.r9) r14
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r11, r13)
            int r1 = r13.f5207a
            int r1 = r1 + r0
        L_0x0489:
            if (r0 >= r1) goto L_0x0499
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r0, r13)
            long r2 = r13.f5208b
            long r2 = com.google.android.gms.internal.measurement.v7.b(r2)
            r14.d(r2)
            goto L_0x0489
        L_0x0499:
            if (r0 != r1) goto L_0x049d
            goto L_0x0535
        L_0x049d:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x04a2:
            if (r0 != 0) goto L_0x05b4
            com.google.android.gms.internal.measurement.r9 r14 = (com.google.android.gms.internal.measurement.r9) r14
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r11, r13)
        L_0x04aa:
            long r1 = r13.f5208b
            long r1 = com.google.android.gms.internal.measurement.v7.b(r1)
            r14.d(r1)
            if (r0 >= r12) goto L_0x0535
            int r1 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r13)
            int r2 = r13.f5207a
            if (r10 != r2) goto L_0x0535
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r1, r13)
            goto L_0x04aa
        L_0x04c2:
            r12 = r35
            r7 = r3
            r1 = 2
            if (r0 != r1) goto L_0x04e9
            com.google.android.gms.internal.measurement.t8 r14 = (com.google.android.gms.internal.measurement.t8) r14
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r11, r13)
            int r1 = r13.f5207a
            int r1 = r1 + r0
        L_0x04d1:
            if (r0 >= r1) goto L_0x04e1
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r13)
            int r2 = r13.f5207a
            int r2 = com.google.android.gms.internal.measurement.v7.e(r2)
            r14.g(r2)
            goto L_0x04d1
        L_0x04e1:
            if (r0 != r1) goto L_0x04e4
            goto L_0x0535
        L_0x04e4:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x04e9:
            if (r0 != 0) goto L_0x05b4
            com.google.android.gms.internal.measurement.t8 r14 = (com.google.android.gms.internal.measurement.t8) r14
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r11, r13)
        L_0x04f1:
            int r1 = r13.f5207a
            int r1 = com.google.android.gms.internal.measurement.v7.e(r1)
            r14.g(r1)
            if (r0 >= r12) goto L_0x0535
            int r1 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r13)
            int r2 = r13.f5207a
            if (r10 != r2) goto L_0x0535
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r1, r13)
            goto L_0x04f1
        L_0x0509:
            r12 = r35
            r7 = r3
            r1 = 2
            if (r0 != r1) goto L_0x0515
            int r0 = com.google.android.gms.internal.measurement.b7.l(r15, r11, r14, r13)
        L_0x0513:
            r8 = r0
            goto L_0x0525
        L_0x0515:
            if (r0 != 0) goto L_0x05b4
            r0 = r10
            r1 = r33
            r2 = r11
            r3 = r35
            r4 = r14
            r5 = r37
            int r0 = com.google.android.gms.internal.measurement.b7.c(r0, r1, r2, r3, r4, r5)
            goto L_0x0513
        L_0x0525:
            com.google.android.gms.internal.measurement.x8 r3 = r6.L(r7)
            r4 = 0
            com.google.android.gms.internal.measurement.ub<?, ?> r5 = r6.f5326o
            r0 = r32
            r1 = r24
            r2 = r14
            com.google.android.gms.internal.measurement.wa.h(r0, r1, r2, r3, r4, r5)
            r0 = r8
        L_0x0535:
            r9 = r11
            r8 = r12
            r12 = r13
            r11 = r19
            r13 = r36
            goto L_0x0879
        L_0x053e:
            r12 = r35
            r7 = r3
            r1 = 2
            if (r0 != r1) goto L_0x05b4
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r11, r13)
            int r1 = r13.f5207a
            if (r1 < 0) goto L_0x0588
            int r2 = r15.length
            int r2 = r2 - r0
            if (r1 > r2) goto L_0x0583
            if (r1 != 0) goto L_0x0558
        L_0x0552:
            com.google.android.gms.internal.measurement.f7 r1 = com.google.android.gms.internal.measurement.f7.f5243n
            r14.add(r1)
            goto L_0x0560
        L_0x0558:
            com.google.android.gms.internal.measurement.f7 r2 = com.google.android.gms.internal.measurement.f7.l(r15, r0, r1)
            r14.add(r2)
            int r0 = r0 + r1
        L_0x0560:
            if (r0 >= r12) goto L_0x0535
            int r1 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r13)
            int r2 = r13.f5207a
            if (r10 != r2) goto L_0x0535
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r1, r13)
            int r1 = r13.f5207a
            if (r1 < 0) goto L_0x057e
            int r2 = r15.length
            int r2 = r2 - r0
            if (r1 > r2) goto L_0x0579
            if (r1 != 0) goto L_0x0558
            goto L_0x0552
        L_0x0579:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x057e:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.d()
            throw r0
        L_0x0583:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x0588:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.d()
            throw r0
        L_0x058d:
            r12 = r35
            r7 = r3
            r1 = 2
            if (r0 != r1) goto L_0x05b4
            com.google.android.gms.internal.measurement.va r8 = r6.M(r7)
            r9 = r10
            r5 = r10
            r10 = r33
            r4 = r11
            r3 = r12
            r2 = r19
            r12 = r35
            r1 = r13
            r13 = r14
            r0 = r36
            r14 = r37
            int r8 = com.google.android.gms.internal.measurement.b7.f(r8, r9, r10, r11, r12, r13, r14)
            r13 = r0
            r12 = r1
            r11 = r2
            r9 = r4
            r10 = r5
            r0 = r8
            r8 = r3
            goto L_0x0879
        L_0x05b4:
            r9 = r11
            r8 = r12
            goto L_0x0437
        L_0x05b8:
            r7 = r3
            r5 = r10
            r4 = r11
            r1 = r13
            r2 = r19
            r10 = 2
            r3 = r35
            r13 = r36
            if (r0 != r10) goto L_0x066b
            r10 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r8 & r10
            int r0 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r0 != 0) goto L_0x060f
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r4, r1)
            int r8 = r1.f5207a
            if (r8 < 0) goto L_0x060a
            r10 = r20
            if (r8 != 0) goto L_0x05dd
        L_0x05d9:
            r14.add(r10)
            goto L_0x05e8
        L_0x05dd:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r11 = com.google.android.gms.internal.measurement.r8.f5562b
            r9.<init>(r15, r0, r8, r11)
        L_0x05e4:
            r14.add(r9)
            int r0 = r0 + r8
        L_0x05e8:
            if (r0 >= r3) goto L_0x077e
            int r8 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r1)
            int r9 = r1.f5207a
            if (r5 != r9) goto L_0x077e
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r8, r1)
            int r8 = r1.f5207a
            if (r8 < 0) goto L_0x0605
            if (r8 != 0) goto L_0x05fd
            goto L_0x05d9
        L_0x05fd:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r11 = com.google.android.gms.internal.measurement.r8.f5562b
            r9.<init>(r15, r0, r8, r11)
            goto L_0x05e4
        L_0x0605:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.d()
            throw r0
        L_0x060a:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.d()
            throw r0
        L_0x060f:
            r10 = r20
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r4, r1)
            int r8 = r1.f5207a
            if (r8 < 0) goto L_0x0666
            if (r8 != 0) goto L_0x061f
        L_0x061b:
            r14.add(r10)
            goto L_0x0632
        L_0x061f:
            int r9 = r0 + r8
            boolean r11 = com.google.android.gms.internal.measurement.bc.f(r15, r0, r9)
            if (r11 == 0) goto L_0x0661
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.measurement.r8.f5562b
            r11.<init>(r15, r0, r8, r12)
        L_0x062e:
            r14.add(r11)
            r0 = r9
        L_0x0632:
            if (r0 >= r3) goto L_0x077e
            int r8 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r1)
            int r9 = r1.f5207a
            if (r5 != r9) goto L_0x077e
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r8, r1)
            int r8 = r1.f5207a
            if (r8 < 0) goto L_0x065c
            if (r8 != 0) goto L_0x0647
            goto L_0x061b
        L_0x0647:
            int r9 = r0 + r8
            boolean r11 = com.google.android.gms.internal.measurement.bc.f(r15, r0, r9)
            if (r11 == 0) goto L_0x0657
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.measurement.r8.f5562b
            r11.<init>(r15, r0, r8, r12)
            goto L_0x062e
        L_0x0657:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.c()
            throw r0
        L_0x065c:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.d()
            throw r0
        L_0x0661:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.c()
            throw r0
        L_0x0666:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.d()
            throw r0
        L_0x066b:
            r12 = r1
            r11 = r2
            r8 = r3
            r9 = r4
            r10 = r5
            goto L_0x0878
        L_0x0672:
            r7 = r3
            r5 = r10
            r4 = r11
            r1 = r13
            r2 = r19
            r8 = 2
            r3 = r35
            r13 = r36
            if (r0 != r8) goto L_0x06a4
            com.google.android.gms.internal.measurement.d7 r14 = (com.google.android.gms.internal.measurement.d7) r14
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r4, r1)
            int r8 = r1.f5207a
            int r8 = r8 + r0
        L_0x0688:
            if (r0 >= r8) goto L_0x069b
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r0, r1)
            long r9 = r1.f5208b
            int r11 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r11 == 0) goto L_0x0696
            r9 = 1
            goto L_0x0697
        L_0x0696:
            r9 = 0
        L_0x0697:
            r14.d(r9)
            goto L_0x0688
        L_0x069b:
            if (r0 != r8) goto L_0x069f
            goto L_0x073d
        L_0x069f:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x06a4:
            if (r0 != 0) goto L_0x066b
            com.google.android.gms.internal.measurement.d7 r14 = (com.google.android.gms.internal.measurement.d7) r14
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r4, r1)
            long r8 = r1.f5208b
            int r10 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x06b4
        L_0x06b2:
            r8 = 1
            goto L_0x06b5
        L_0x06b4:
            r8 = 0
        L_0x06b5:
            r14.d(r8)
            if (r0 >= r3) goto L_0x077e
            int r8 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r1)
            int r9 = r1.f5207a
            if (r5 != r9) goto L_0x077e
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r8, r1)
            long r8 = r1.f5208b
            int r10 = (r8 > r22 ? 1 : (r8 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x06b4
            goto L_0x06b2
        L_0x06cd:
            r7 = r3
            r5 = r10
            r4 = r11
            r1 = r13
            r2 = r19
            r8 = 2
            r3 = r35
            r13 = r36
            if (r0 != r8) goto L_0x06f7
            com.google.android.gms.internal.measurement.t8 r14 = (com.google.android.gms.internal.measurement.t8) r14
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r4, r1)
            int r8 = r1.f5207a
            int r8 = r8 + r0
        L_0x06e3:
            if (r0 >= r8) goto L_0x06ef
            int r9 = com.google.android.gms.internal.measurement.b7.o(r15, r0)
            r14.g(r9)
            int r0 = r0 + 4
            goto L_0x06e3
        L_0x06ef:
            if (r0 != r8) goto L_0x06f2
            goto L_0x073d
        L_0x06f2:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x06f7:
            r8 = 5
            if (r0 != r8) goto L_0x066b
            com.google.android.gms.internal.measurement.t8 r14 = (com.google.android.gms.internal.measurement.t8) r14
            int r0 = com.google.android.gms.internal.measurement.b7.o(r15, r4)
            r14.g(r0)
            int r11 = r4 + 4
        L_0x0705:
            if (r11 >= r3) goto L_0x0765
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r11, r1)
            int r8 = r1.f5207a
            if (r5 != r8) goto L_0x0765
            int r8 = com.google.android.gms.internal.measurement.b7.o(r15, r0)
            r14.g(r8)
            int r11 = r0 + 4
            goto L_0x0705
        L_0x0719:
            r7 = r3
            r5 = r10
            r4 = r11
            r1 = r13
            r2 = r19
            r8 = 2
            r3 = r35
            r13 = r36
            if (r0 != r8) goto L_0x0743
            com.google.android.gms.internal.measurement.r9 r14 = (com.google.android.gms.internal.measurement.r9) r14
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r4, r1)
            int r8 = r1.f5207a
            int r8 = r8 + r0
        L_0x072f:
            if (r0 >= r8) goto L_0x073b
            long r9 = com.google.android.gms.internal.measurement.b7.r(r15, r0)
            r14.d(r9)
            int r0 = r0 + 8
            goto L_0x072f
        L_0x073b:
            if (r0 != r8) goto L_0x073e
        L_0x073d:
            goto L_0x077e
        L_0x073e:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x0743:
            r8 = 1
            if (r0 != r8) goto L_0x066b
            com.google.android.gms.internal.measurement.r9 r14 = (com.google.android.gms.internal.measurement.r9) r14
            long r8 = com.google.android.gms.internal.measurement.b7.r(r15, r4)
            r14.d(r8)
            int r11 = r4 + 8
        L_0x0751:
            if (r11 >= r3) goto L_0x0765
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r11, r1)
            int r8 = r1.f5207a
            if (r5 != r8) goto L_0x0765
            long r8 = com.google.android.gms.internal.measurement.b7.r(r15, r0)
            r14.d(r8)
            int r11 = r0 + 8
            goto L_0x0751
        L_0x0765:
            r12 = r1
            r8 = r3
            r9 = r4
            r10 = r5
            r0 = r11
            r11 = r2
            goto L_0x0879
        L_0x076d:
            r7 = r3
            r5 = r10
            r4 = r11
            r1 = r13
            r2 = r19
            r8 = 2
            r3 = r35
            r13 = r36
            if (r0 != r8) goto L_0x0785
            int r0 = com.google.android.gms.internal.measurement.b7.l(r15, r4, r14, r1)
        L_0x077e:
            r12 = r1
            r11 = r2
            r8 = r3
            r9 = r4
            r10 = r5
            goto L_0x0879
        L_0x0785:
            if (r0 != 0) goto L_0x066b
            r0 = r5
            r12 = r1
            r1 = r33
            r11 = r2
            r2 = r4
            r8 = r3
            r3 = r35
            r9 = r4
            r4 = r14
            r10 = r5
            r5 = r37
            int r0 = com.google.android.gms.internal.measurement.b7.c(r0, r1, r2, r3, r4, r5)
            goto L_0x0879
        L_0x079b:
            r8 = r35
            r7 = r3
            r9 = r11
            r12 = r13
            r11 = r19
            r1 = 2
            r13 = r36
            if (r0 != r1) goto L_0x07c5
            com.google.android.gms.internal.measurement.r9 r14 = (com.google.android.gms.internal.measurement.r9) r14
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r9, r12)
            int r1 = r12.f5207a
            int r1 = r1 + r0
        L_0x07b0:
            if (r0 >= r1) goto L_0x07bc
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r0, r12)
            long r2 = r12.f5208b
            r14.d(r2)
            goto L_0x07b0
        L_0x07bc:
            if (r0 != r1) goto L_0x07c0
            goto L_0x0879
        L_0x07c0:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x07c5:
            if (r0 != 0) goto L_0x0878
            com.google.android.gms.internal.measurement.r9 r14 = (com.google.android.gms.internal.measurement.r9) r14
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r9, r12)
        L_0x07cd:
            long r1 = r12.f5208b
            r14.d(r1)
            if (r0 >= r8) goto L_0x0879
            int r1 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r12)
            int r2 = r12.f5207a
            if (r10 != r2) goto L_0x0879
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r1, r12)
            goto L_0x07cd
        L_0x07e1:
            r8 = r35
            r7 = r3
            r9 = r11
            r12 = r13
            r11 = r19
            r1 = 2
            r13 = r36
            if (r0 != r1) goto L_0x080b
            com.google.android.gms.internal.measurement.o8 r14 = (com.google.android.gms.internal.measurement.o8) r14
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r9, r12)
            int r1 = r12.f5207a
            int r1 = r1 + r0
        L_0x07f6:
            if (r0 >= r1) goto L_0x0802
            float r2 = com.google.android.gms.internal.measurement.b7.m(r15, r0)
            r14.d(r2)
            int r0 = r0 + 4
            goto L_0x07f6
        L_0x0802:
            if (r0 != r1) goto L_0x0806
            goto L_0x0879
        L_0x0806:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x080b:
            r1 = 5
            if (r0 != r1) goto L_0x0878
            com.google.android.gms.internal.measurement.o8 r14 = (com.google.android.gms.internal.measurement.o8) r14
            float r0 = com.google.android.gms.internal.measurement.b7.m(r15, r9)
            r14.d(r0)
            int r0 = r9 + 4
        L_0x0819:
            if (r0 >= r8) goto L_0x0879
            int r1 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r12)
            int r2 = r12.f5207a
            if (r10 != r2) goto L_0x0879
            float r0 = com.google.android.gms.internal.measurement.b7.m(r15, r1)
            r14.d(r0)
            int r0 = r1 + 4
            goto L_0x0819
        L_0x082d:
            r8 = r35
            r7 = r3
            r9 = r11
            r12 = r13
            r11 = r19
            r2 = 2
            r13 = r36
            if (r0 != r2) goto L_0x0856
            com.google.android.gms.internal.measurement.a8 r14 = (com.google.android.gms.internal.measurement.a8) r14
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r9, r12)
            int r1 = r12.f5207a
            int r1 = r1 + r0
        L_0x0842:
            if (r0 >= r1) goto L_0x084e
            double r2 = com.google.android.gms.internal.measurement.b7.a(r15, r0)
            r14.d(r2)
            int r0 = r0 + 8
            goto L_0x0842
        L_0x084e:
            if (r0 != r1) goto L_0x0851
            goto L_0x0879
        L_0x0851:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x0856:
            r1 = 1
            if (r0 != r1) goto L_0x0878
            com.google.android.gms.internal.measurement.a8 r14 = (com.google.android.gms.internal.measurement.a8) r14
            double r0 = com.google.android.gms.internal.measurement.b7.a(r15, r9)
            r14.d(r0)
            int r0 = r9 + 8
        L_0x0864:
            if (r0 >= r8) goto L_0x0879
            int r1 = com.google.android.gms.internal.measurement.b7.p(r15, r0, r12)
            int r2 = r12.f5207a
            if (r10 != r2) goto L_0x0879
            double r2 = com.google.android.gms.internal.measurement.b7.a(r15, r1)
            r14.d(r2)
            int r0 = r1 + 8
            goto L_0x0864
        L_0x0878:
            r0 = r9
        L_0x0879:
            if (r0 != r9) goto L_0x088c
            r2 = r0
            r3 = r10
            r20 = r11
            r4 = r12
            r11 = r13
            r9 = r24
            r13 = r26
            r14 = r27
            r10 = r7
            r7 = r32
            goto L_0x0b25
        L_0x088c:
            r4 = r8
            r3 = r11
            r2 = r12
            r5 = r13
            r9 = r24
            r13 = r26
            r14 = r27
            r8 = r0
            r11 = r10
            r10 = r7
            r7 = r32
            goto L_0x001c
        L_0x089d:
            r7 = r3
            r3 = r10
            r8 = r20
            r10 = r5
            r20 = r12
            r12 = r13
            r13 = r14
            r5 = r35
            r14 = r11
            r11 = 50
            if (r4 != r11) goto L_0x08ff
            r11 = 2
            if (r0 != r11) goto L_0x08f0
            sun.misc.Unsafe r0 = f5311s
            java.lang.Object r3 = r6.P(r7)
            r7 = r32
            java.lang.Object r4 = r0.getObject(r7, r1)
            com.google.android.gms.internal.measurement.aa r8 = r6.f5328q
            boolean r8 = r8.f(r4)
            if (r8 == 0) goto L_0x08d3
            com.google.android.gms.internal.measurement.aa r8 = r6.f5328q
            java.lang.Object r8 = r8.e(r3)
            com.google.android.gms.internal.measurement.aa r9 = r6.f5328q
            r9.c(r8, r4)
            r0.putObject(r7, r1, r8)
            r4 = r8
        L_0x08d3:
            com.google.android.gms.internal.measurement.aa r0 = r6.f5328q
            r0.a(r3)
            com.google.android.gms.internal.measurement.aa r0 = r6.f5328q
            r0.g(r4)
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r14, r12)
            int r1 = r12.f5207a
            if (r1 < 0) goto L_0x08eb
            int r0 = r5 - r0
            if (r1 <= r0) goto L_0x08ea
            goto L_0x08eb
        L_0x08ea:
            throw r17
        L_0x08eb:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.f()
            throw r0
        L_0x08f0:
            r11 = r7
            r7 = r32
        L_0x08f3:
            r10 = r11
            r4 = r12
            r11 = r13
            r2 = r14
        L_0x08f7:
            r9 = r24
            r13 = r26
            r14 = r27
            goto L_0x0b25
        L_0x08ff:
            r11 = r7
            r7 = r32
            sun.misc.Unsafe r5 = f5311s
            int r21 = r11 + 2
            r9 = r9[r21]
            r29 = r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r9 & r1
            long r1 = (long) r2
            switch(r4) {
                case 51: goto L_0x0afc;
                case 52: goto L_0x0ae3;
                case 53: goto L_0x0ac7;
                case 54: goto L_0x0ac7;
                case 55: goto L_0x0ab2;
                case 56: goto L_0x0a9d;
                case 57: goto L_0x0a88;
                case 58: goto L_0x0a6a;
                case 59: goto L_0x0a32;
                case 60: goto L_0x09f8;
                case 61: goto L_0x09cd;
                case 62: goto L_0x0ab2;
                case 63: goto L_0x098e;
                case 64: goto L_0x0a88;
                case 65: goto L_0x0a9d;
                case 66: goto L_0x0963;
                case 67: goto L_0x0948;
                case 68: goto L_0x091b;
                default: goto L_0x0913;
            }
        L_0x0913:
            r28 = r11
            r4 = r12
            r12 = r14
            r9 = r24
            goto L_0x0b19
        L_0x091b:
            r4 = 3
            if (r0 != r4) goto L_0x0913
            r4 = r24
            java.lang.Object r0 = r6.p(r7, r4, r11)
            r1 = r3 & -8
            r1 = r1 | 4
            com.google.android.gms.internal.measurement.va r9 = r6.M(r11)
            r8 = r0
            r10 = r33
            r5 = r11
            r2 = r20
            r11 = r14
            r34 = r3
            r3 = r12
            r12 = r35
            r13 = r1
            r1 = r14
            r14 = r37
            int r8 = com.google.android.gms.internal.measurement.b7.i(r8, r9, r10, r11, r12, r13, r14)
            r6.v(r7, r4, r5, r0)
            r12 = r1
            r9 = r4
            r28 = r5
            goto L_0x0989
        L_0x0948:
            r34 = r3
            r3 = r12
            r12 = r14
            r9 = r20
            r4 = r24
            if (r0 != 0) goto L_0x09c3
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r12, r3)
            long r13 = r3.f5208b
            long r13 = com.google.android.gms.internal.measurement.v7.b(r13)
            java.lang.Long r8 = java.lang.Long.valueOf(r13)
            r13 = r29
            goto L_0x097d
        L_0x0963:
            r34 = r3
            r3 = r12
            r12 = r14
            r9 = r20
            r4 = r24
            r13 = r29
            if (r0 != 0) goto L_0x09c3
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r12, r3)
            int r8 = r3.f5207a
            int r8 = com.google.android.gms.internal.measurement.v7.e(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
        L_0x097d:
            r5.putObject(r7, r13, r8)
            r5.putInt(r7, r1, r4)
            r8 = r0
            r20 = r9
            r28 = r11
            r9 = r4
        L_0x0989:
            r4 = r3
            r3 = r34
            goto L_0x0b1a
        L_0x098e:
            r34 = r3
            r3 = r12
            r12 = r14
            r9 = r20
            r4 = r24
            r13 = r29
            if (r0 != 0) goto L_0x09c3
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r12, r3)
            int r8 = r3.f5207a
            com.google.android.gms.internal.measurement.x8 r10 = r6.L(r11)
            if (r10 == 0) goto L_0x09bc
            boolean r10 = r10.e(r8)
            if (r10 == 0) goto L_0x09ad
            goto L_0x09bc
        L_0x09ad:
            com.google.android.gms.internal.measurement.sb r1 = N(r32)
            long r13 = (long) r8
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r10 = r34
            r1.e(r10, r2)
            goto L_0x09e5
        L_0x09bc:
            r10 = r34
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x09df
        L_0x09c3:
            r20 = r9
            r28 = r11
            r9 = r4
            r4 = r3
            r3 = r34
            goto L_0x0b19
        L_0x09cd:
            r10 = r3
            r3 = r12
            r12 = r14
            r9 = r20
            r4 = r24
            r13 = r29
            r8 = 2
            if (r0 != r8) goto L_0x09ef
            int r0 = com.google.android.gms.internal.measurement.b7.k(r15, r12, r3)
            java.lang.Object r8 = r3.f5209c
        L_0x09df:
            r5.putObject(r7, r13, r8)
            r5.putInt(r7, r1, r4)
        L_0x09e5:
            r8 = r0
            r20 = r9
            r28 = r11
            r9 = r4
            r4 = r3
            r3 = r10
            goto L_0x0b1a
        L_0x09ef:
            r20 = r9
            r28 = r11
            r9 = r4
            r4 = r3
            r3 = r10
            goto L_0x0b19
        L_0x09f8:
            r10 = r3
            r3 = r12
            r12 = r14
            r9 = r20
            r4 = r24
            r8 = 2
            if (r0 != r8) goto L_0x0a29
            java.lang.Object r8 = r6.p(r7, r4, r11)
            com.google.android.gms.internal.measurement.va r1 = r6.M(r11)
            r0 = r8
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r33
            r14 = r10
            r10 = r3
            r3 = r12
            r5 = r4
            r4 = r35
            r20 = r9
            r9 = r5
            r5 = r37
            int r0 = com.google.android.gms.internal.measurement.b7.j(r0, r1, r2, r3, r4, r5)
            r6.v(r7, r9, r11, r8)
            r8 = r0
            r4 = r10
            r28 = r11
            r3 = r14
            goto L_0x0b1a
        L_0x0a29:
            r20 = r9
            r9 = r4
            r4 = r3
            r3 = r10
            r28 = r11
            goto L_0x0b19
        L_0x0a32:
            r28 = r11
            r4 = r12
            r12 = r14
            r9 = r24
            r13 = r29
            r11 = 2
            if (r0 != r11) goto L_0x0b19
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r12, r4)
            int r11 = r4.f5207a
            if (r11 != 0) goto L_0x0a4a
            r5.putObject(r7, r13, r10)
            goto L_0x0ade
        L_0x0a4a:
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = r8 & r10
            if (r8 == 0) goto L_0x0a5d
            int r8 = r0 + r11
            boolean r8 = com.google.android.gms.internal.measurement.bc.f(r15, r0, r8)
            if (r8 == 0) goto L_0x0a58
            goto L_0x0a5d
        L_0x0a58:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.c()
            throw r0
        L_0x0a5d:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.r8.f5562b
            r8.<init>(r15, r0, r11, r10)
            r5.putObject(r7, r13, r8)
            int r0 = r0 + r11
            goto L_0x0ade
        L_0x0a6a:
            r28 = r11
            r4 = r12
            r12 = r14
            r9 = r24
            r13 = r29
            if (r0 != 0) goto L_0x0b19
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r12, r4)
            long r10 = r4.f5208b
            int r8 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r8 == 0) goto L_0x0a81
            r19 = 1
            goto L_0x0a83
        L_0x0a81:
            r19 = 0
        L_0x0a83:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r19)
            goto L_0x0adb
        L_0x0a88:
            r28 = r11
            r4 = r12
            r12 = r14
            r9 = r24
            r13 = r29
            r8 = 5
            if (r0 != r8) goto L_0x0b19
            int r0 = com.google.android.gms.internal.measurement.b7.o(r15, r12)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0af6
        L_0x0a9d:
            r28 = r11
            r4 = r12
            r12 = r14
            r9 = r24
            r13 = r29
            r8 = 1
            if (r0 != r8) goto L_0x0b19
            long r10 = com.google.android.gms.internal.measurement.b7.r(r15, r12)
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            goto L_0x0b0f
        L_0x0ab2:
            r28 = r11
            r4 = r12
            r12 = r14
            r9 = r24
            r13 = r29
            if (r0 != 0) goto L_0x0b19
            int r0 = com.google.android.gms.internal.measurement.b7.p(r15, r12, r4)
            int r8 = r4.f5207a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x0adb
        L_0x0ac7:
            r28 = r11
            r4 = r12
            r12 = r14
            r9 = r24
            r13 = r29
            if (r0 != 0) goto L_0x0b19
            int r0 = com.google.android.gms.internal.measurement.b7.q(r15, r12, r4)
            long r10 = r4.f5208b
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
        L_0x0adb:
            r5.putObject(r7, r13, r8)
        L_0x0ade:
            r5.putInt(r7, r1, r9)
            r8 = r0
            goto L_0x0b1a
        L_0x0ae3:
            r28 = r11
            r4 = r12
            r12 = r14
            r9 = r24
            r13 = r29
            r8 = 5
            if (r0 != r8) goto L_0x0b19
            float r0 = com.google.android.gms.internal.measurement.b7.m(r15, r12)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0af6:
            r5.putObject(r7, r13, r0)
            int r11 = r12 + 4
            goto L_0x0b14
        L_0x0afc:
            r28 = r11
            r4 = r12
            r12 = r14
            r9 = r24
            r13 = r29
            r8 = 1
            if (r0 != r8) goto L_0x0b19
            double r10 = com.google.android.gms.internal.measurement.b7.a(r15, r12)
            java.lang.Double r0 = java.lang.Double.valueOf(r10)
        L_0x0b0f:
            r5.putObject(r7, r13, r0)
            int r11 = r12 + 8
        L_0x0b14:
            r5.putInt(r7, r1, r9)
            r8 = r11
            goto L_0x0b1a
        L_0x0b19:
            r8 = r12
        L_0x0b1a:
            if (r8 != r12) goto L_0x0b7a
            r11 = r36
            r2 = r8
            r13 = r26
            r14 = r27
            r10 = r28
        L_0x0b25:
            if (r3 != r11) goto L_0x0b2e
            if (r11 != 0) goto L_0x0b2a
            goto L_0x0b2e
        L_0x0b2a:
            r8 = r2
            r9 = r3
            goto L_0x0b93
        L_0x0b2e:
            boolean r0 = r6.f5317f
            if (r0 == 0) goto L_0x0b60
            com.google.android.gms.internal.measurement.c8 r0 = r4.f5210d
            com.google.android.gms.internal.measurement.c8 r1 = com.google.android.gms.internal.measurement.c8.f5168c
            if (r0 == r1) goto L_0x0b60
            com.google.android.gms.internal.measurement.da r1 = r6.f5316e
            com.google.android.gms.internal.measurement.p8$f r0 = r0.b(r1, r9)
            if (r0 != 0) goto L_0x0b52
            com.google.android.gms.internal.measurement.sb r5 = N(r32)
            r0 = r3
            r1 = r33
            r12 = r3
            r3 = r35
            r4 = r5
            r5 = r37
            int r8 = com.google.android.gms.internal.measurement.b7.d(r0, r1, r2, r3, r4, r5)
            goto L_0x0b70
        L_0x0b52:
            r0 = r7
            com.google.android.gms.internal.measurement.p8$d r0 = (com.google.android.gms.internal.measurement.p8.d) r0
            r0.J()
            com.google.android.gms.internal.measurement.i8<com.google.android.gms.internal.measurement.p8$c> r0 = r0.zzc
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0b60:
            r12 = r3
            com.google.android.gms.internal.measurement.sb r4 = N(r32)
            r0 = r12
            r1 = r33
            r3 = r35
            r5 = r37
            int r8 = com.google.android.gms.internal.measurement.b7.d(r0, r1, r2, r3, r4, r5)
        L_0x0b70:
            r4 = r35
            r2 = r37
            r5 = r11
            r11 = r12
            r3 = r20
            goto L_0x001c
        L_0x0b7a:
            r12 = r3
            r4 = r35
            r5 = r36
            r2 = r37
            r11 = r12
            r3 = r20
            r13 = r26
            goto L_0x012d
        L_0x0b88:
            r20 = r3
            r19 = r11
            r26 = r13
            r27 = r14
            r11 = r5
            r9 = r19
        L_0x0b93:
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r14 == r0) goto L_0x0b9e
            long r0 = (long) r14
            r2 = r20
            r2.putInt(r7, r0, r13)
        L_0x0b9e:
            int r0 = r6.f5322k
            r10 = r0
            r3 = r17
        L_0x0ba3:
            int r0 = r6.f5323l
            if (r10 >= r0) goto L_0x0bbd
            int[] r0 = r6.f5321j
            r2 = r0[r10]
            com.google.android.gms.internal.measurement.ub<?, ?> r4 = r6.f5326o
            r0 = r31
            r1 = r32
            r5 = r32
            java.lang.Object r0 = r0.q(r1, r2, r3, r4, r5)
            r3 = r0
            com.google.android.gms.internal.measurement.sb r3 = (com.google.android.gms.internal.measurement.sb) r3
            int r10 = r10 + 1
            goto L_0x0ba3
        L_0x0bbd:
            if (r3 == 0) goto L_0x0bc4
            com.google.android.gms.internal.measurement.ub<?, ?> r0 = r6.f5326o
            r0.h(r7, r3)
        L_0x0bc4:
            r0 = r35
            if (r11 != 0) goto L_0x0bd0
            if (r8 != r0) goto L_0x0bcb
            goto L_0x0bd4
        L_0x0bcb:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.e()
            throw r0
        L_0x0bd0:
            if (r8 > r0) goto L_0x0bd5
            if (r9 != r11) goto L_0x0bd5
        L_0x0bd4:
            return r8
        L_0x0bd5:
            com.google.android.gms.internal.measurement.b9 r0 = com.google.android.gms.internal.measurement.b9.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ha.l(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.e7):int");
    }

    public final T zza() {
        return this.f5324m.a(this.f5316e);
    }
}
