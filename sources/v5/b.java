package v5;

import o5.j;
import o5.p;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final u5.b f12729a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12730b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12731c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12732d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12733e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12734f;

    /* renamed from: g  reason: collision with root package name */
    private final int f12735g;

    public b(u5.b bVar) {
        this(bVar, 10, bVar.r() / 2, bVar.n() / 2);
    }

    public b(u5.b bVar, int i10, int i11, int i12) {
        this.f12729a = bVar;
        int n10 = bVar.n();
        this.f12730b = n10;
        int r9 = bVar.r();
        this.f12731c = r9;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f12732d = i14;
        int i15 = i11 + i13;
        this.f12733e = i15;
        int i16 = i12 - i13;
        this.f12735g = i16;
        int i17 = i12 + i13;
        this.f12734f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= n10 || i15 >= r9) {
            throw j.a();
        }
    }

    private p[] a(p pVar, p pVar2, p pVar3, p pVar4) {
        float c10 = pVar.c();
        float d10 = pVar.d();
        float c11 = pVar2.c();
        float d11 = pVar2.d();
        float c12 = pVar3.c();
        float d12 = pVar3.d();
        float c13 = pVar4.c();
        float d13 = pVar4.d();
        if (c10 < ((float) this.f12731c) / 2.0f) {
            return new p[]{new p(c13 - 1.0f, d13 + 1.0f), new p(c11 + 1.0f, d11 + 1.0f), new p(c12 - 1.0f, d12 - 1.0f), new p(c10 + 1.0f, d10 - 1.0f)};
        }
        return new p[]{new p(c13 + 1.0f, d13 + 1.0f), new p(c11 + 1.0f, d11 - 1.0f), new p(c12 - 1.0f, d12 + 1.0f), new p(c10 - 1.0f, d10 - 1.0f)};
    }

    private boolean b(int i10, int i11, int i12, boolean z9) {
        if (z9) {
            while (i10 <= i11) {
                if (this.f12729a.h(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f12729a.h(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private p d(float f10, float f11, float f12, float f13) {
        int c10 = a.c(a.a(f10, f11, f12, f13));
        float f14 = (float) c10;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < c10; i10++) {
            float f17 = (float) i10;
            int c11 = a.c((f17 * f15) + f10);
            int c12 = a.c((f17 * f16) + f11);
            if (this.f12729a.h(c11, c12)) {
                return new p((float) c11, (float) c12);
            }
        }
        return null;
    }

    public p[] c() {
        int i10 = this.f12732d;
        int i11 = this.f12733e;
        int i12 = this.f12735g;
        int i13 = this.f12734f;
        boolean z9 = false;
        int i14 = 1;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        while (true) {
            if (!z10) {
                break;
            }
            boolean z15 = true;
            boolean z16 = false;
            while (true) {
                if ((z15 || !z11) && i11 < this.f12731c) {
                    z15 = b(i12, i13, i11, false);
                    if (z15) {
                        i11++;
                        z11 = true;
                        z16 = true;
                    } else if (!z11) {
                        i11++;
                    }
                }
            }
            if (i11 < this.f12731c) {
                boolean z17 = true;
                while (true) {
                    if ((z17 || !z12) && i13 < this.f12730b) {
                        z17 = b(i10, i11, i13, true);
                        if (z17) {
                            i13++;
                            z12 = true;
                            z16 = true;
                        } else if (!z12) {
                            i13++;
                        }
                    }
                }
                if (i13 < this.f12730b) {
                    boolean z18 = true;
                    while (true) {
                        if ((z18 || !z13) && i10 >= 0) {
                            z18 = b(i12, i13, i10, false);
                            if (z18) {
                                i10--;
                                z13 = true;
                                z16 = true;
                            } else if (!z13) {
                                i10--;
                            }
                        }
                    }
                    if (i10 >= 0) {
                        z10 = z16;
                        boolean z19 = true;
                        while (true) {
                            if ((z19 || !z14) && i12 >= 0) {
                                z19 = b(i10, i11, i12, true);
                                if (z19) {
                                    i12--;
                                    z10 = true;
                                    z14 = true;
                                } else if (!z14) {
                                    i12--;
                                }
                            }
                        }
                        if (i12 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z9 = true;
        if (!z9) {
            int i15 = i11 - i10;
            p pVar = null;
            p pVar2 = null;
            int i16 = 1;
            while (pVar2 == null && i16 < i15) {
                pVar2 = d((float) i10, (float) (i13 - i16), (float) (i10 + i16), (float) i13);
                i16++;
            }
            if (pVar2 != null) {
                p pVar3 = null;
                int i17 = 1;
                while (pVar3 == null && i17 < i15) {
                    pVar3 = d((float) i10, (float) (i12 + i17), (float) (i10 + i17), (float) i12);
                    i17++;
                }
                if (pVar3 != null) {
                    p pVar4 = null;
                    int i18 = 1;
                    while (pVar4 == null && i18 < i15) {
                        pVar4 = d((float) i11, (float) (i12 + i18), (float) (i11 - i18), (float) i12);
                        i18++;
                    }
                    if (pVar4 != null) {
                        while (pVar == null && i14 < i15) {
                            pVar = d((float) i11, (float) (i13 - i14), (float) (i11 - i14), (float) i13);
                            i14++;
                        }
                        if (pVar != null) {
                            return a(pVar, pVar2, pVar4, pVar3);
                        }
                        throw j.a();
                    }
                    throw j.a();
                }
                throw j.a();
            }
            throw j.a();
        }
        throw j.a();
    }
}
