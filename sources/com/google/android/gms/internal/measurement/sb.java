package com.google.android.gms.internal.measurement;

import java.util.Arrays;

public final class sb {

    /* renamed from: f  reason: collision with root package name */
    private static final sb f5598f = new sb(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f5599a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f5600b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f5601c;

    /* renamed from: d  reason: collision with root package name */
    private int f5602d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5603e;

    private sb() {
        this(0, new int[8], new Object[8], true);
    }

    private sb(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f5602d = -1;
        this.f5599a = i10;
        this.f5600b = iArr;
        this.f5601c = objArr;
        this.f5603e = z9;
    }

    static sb c(sb sbVar, sb sbVar2) {
        int i10 = sbVar.f5599a + sbVar2.f5599a;
        int[] copyOf = Arrays.copyOf(sbVar.f5600b, i10);
        System.arraycopy(sbVar2.f5600b, 0, copyOf, sbVar.f5599a, sbVar2.f5599a);
        Object[] copyOf2 = Arrays.copyOf(sbVar.f5601c, i10);
        System.arraycopy(sbVar2.f5601c, 0, copyOf2, sbVar.f5599a, sbVar2.f5599a);
        return new sb(i10, copyOf, copyOf2, true);
    }

    private final void d(int i10) {
        int[] iArr = this.f5600b;
        if (i10 > iArr.length) {
            int i11 = this.f5599a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f5600b = Arrays.copyOf(iArr, i10);
            this.f5601c = Arrays.copyOf(this.f5601c, i10);
        }
    }

    private static void f(int i10, Object obj, qc qcVar) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            qcVar.i(i11, ((Long) obj).longValue());
        } else if (i12 == 1) {
            qcVar.L(i11, ((Long) obj).longValue());
        } else if (i12 == 2) {
            qcVar.d(i11, (f7) obj);
        } else if (i12 != 3) {
            if (i12 == 5) {
                qcVar.k(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(b9.a());
        } else if (qcVar.zza() == tc.f5627a) {
            qcVar.j(i11);
            ((sb) obj).j(qcVar);
            qcVar.e(i11);
        } else {
            qcVar.e(i11);
            ((sb) obj).j(qcVar);
            qcVar.j(i11);
        }
    }

    public static sb k() {
        return f5598f;
    }

    static sb l() {
        return new sb();
    }

    private final void n() {
        if (!this.f5603e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        int i10;
        int i11 = this.f5602d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f5599a; i13++) {
            int i14 = this.f5600b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                i10 = y7.q0(i15, ((Long) this.f5601c[i13]).longValue());
            } else if (i16 == 1) {
                i10 = y7.T(i15, ((Long) this.f5601c[i13]).longValue());
            } else if (i16 == 2) {
                i10 = y7.U(i15, (f7) this.f5601c[i13]);
            } else if (i16 == 3) {
                i10 = (y7.w0(i15) << 1) + ((sb) this.f5601c[i13]).a();
            } else if (i16 == 5) {
                i10 = y7.l0(i15, ((Integer) this.f5601c[i13]).intValue());
            } else {
                throw new IllegalStateException(b9.a());
            }
            i12 += i10;
        }
        this.f5602d = i12;
        return i12;
    }

    /* access modifiers changed from: package-private */
    public final sb b(sb sbVar) {
        if (sbVar.equals(f5598f)) {
            return this;
        }
        n();
        int i10 = this.f5599a + sbVar.f5599a;
        d(i10);
        System.arraycopy(sbVar.f5600b, 0, this.f5600b, this.f5599a, sbVar.f5599a);
        System.arraycopy(sbVar.f5601c, 0, this.f5601c, this.f5599a, sbVar.f5599a);
        this.f5599a = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void e(int i10, Object obj) {
        n();
        d(this.f5599a + 1);
        int[] iArr = this.f5600b;
        int i11 = this.f5599a;
        iArr[i11] = i10;
        this.f5601c[i11] = obj;
        this.f5599a = i11 + 1;
    }

    public final boolean equals(Object obj) {
        boolean z9;
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sb)) {
            return false;
        }
        sb sbVar = (sb) obj;
        int i10 = this.f5599a;
        if (i10 == sbVar.f5599a) {
            int[] iArr = this.f5600b;
            int[] iArr2 = sbVar.f5600b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z9 = true;
                    break;
                } else if (iArr[i11] != iArr2[i11]) {
                    z9 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z9) {
                Object[] objArr = this.f5601c;
                Object[] objArr2 = sbVar.f5601c;
                int i12 = this.f5599a;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z10 = true;
                        break;
                    } else if (!objArr[i13].equals(objArr2[i13])) {
                        z10 = false;
                        break;
                    } else {
                        i13++;
                    }
                }
                return z10;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(qc qcVar) {
        if (qcVar.zza() == tc.f5628b) {
            for (int i10 = this.f5599a - 1; i10 >= 0; i10--) {
                qcVar.s(this.f5600b[i10] >>> 3, this.f5601c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f5599a; i11++) {
            qcVar.s(this.f5600b[i11] >>> 3, this.f5601c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f5599a; i11++) {
            ia.d(sb, i10, String.valueOf(this.f5600b[i11] >>> 3), this.f5601c[i11]);
        }
    }

    public final int hashCode() {
        int i10 = this.f5599a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f5600b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f5601c;
        int i16 = this.f5599a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int i() {
        int i10 = this.f5602d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f5599a; i12++) {
            i11 += y7.d0(this.f5600b[i12] >>> 3, (f7) this.f5601c[i12]);
        }
        this.f5602d = i11;
        return i11;
    }

    public final void j(qc qcVar) {
        if (this.f5599a != 0) {
            if (qcVar.zza() == tc.f5627a) {
                for (int i10 = 0; i10 < this.f5599a; i10++) {
                    f(this.f5600b[i10], this.f5601c[i10], qcVar);
                }
                return;
            }
            for (int i11 = this.f5599a - 1; i11 >= 0; i11--) {
                f(this.f5600b[i11], this.f5601c[i11], qcVar);
            }
        }
    }

    public final void m() {
        if (this.f5603e) {
            this.f5603e = false;
        }
    }
}
