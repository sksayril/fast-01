package com.google.android.gms.internal.measurement;

final class b7 {
    static double a(byte[] bArr, int i10) {
        return Double.longBitsToDouble(r(bArr, i10));
    }

    static int b(int i10, byte[] bArr, int i11, int i12, e7 e7Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                return q(bArr, i11, e7Var);
            }
            if (i13 == 1) {
                return i11 + 8;
            }
            if (i13 == 2) {
                return p(bArr, i11, e7Var) + e7Var.f5207a;
            }
            if (i13 == 3) {
                int i14 = (i10 & -8) | 4;
                int i15 = 0;
                while (i11 < i12) {
                    i11 = p(bArr, i11, e7Var);
                    i15 = e7Var.f5207a;
                    if (i15 == i14) {
                        break;
                    }
                    i11 = b(i15, bArr, i11, i12, e7Var);
                }
                if (i11 <= i12 && i15 == i14) {
                    return i11;
                }
                throw b9.e();
            } else if (i13 == 5) {
                return i11 + 4;
            } else {
                throw b9.b();
            }
        } else {
            throw b9.b();
        }
    }

    static int c(int i10, byte[] bArr, int i11, int i12, y8<?> y8Var, e7 e7Var) {
        t8 t8Var = (t8) y8Var;
        int p10 = p(bArr, i11, e7Var);
        while (true) {
            t8Var.g(e7Var.f5207a);
            if (p10 >= i12) {
                break;
            }
            int p11 = p(bArr, p10, e7Var);
            if (i10 != e7Var.f5207a) {
                break;
            }
            p10 = p(bArr, p11, e7Var);
        }
        return p10;
    }

    static int d(int i10, byte[] bArr, int i11, int i12, sb sbVar, e7 e7Var) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 == 0) {
                int q9 = q(bArr, i11, e7Var);
                sbVar.e(i10, Long.valueOf(e7Var.f5208b));
                return q9;
            } else if (i13 == 1) {
                sbVar.e(i10, Long.valueOf(r(bArr, i11)));
                return i11 + 8;
            } else if (i13 == 2) {
                int p10 = p(bArr, i11, e7Var);
                int i14 = e7Var.f5207a;
                if (i14 < 0) {
                    throw b9.d();
                } else if (i14 <= bArr.length - p10) {
                    sbVar.e(i10, i14 == 0 ? f7.f5243n : f7.l(bArr, p10, i14));
                    return p10 + i14;
                } else {
                    throw b9.f();
                }
            } else if (i13 == 3) {
                sb l10 = sb.l();
                int i15 = (i10 & -8) | 4;
                int i16 = 0;
                while (true) {
                    if (i11 >= i12) {
                        break;
                    }
                    int p11 = p(bArr, i11, e7Var);
                    int i17 = e7Var.f5207a;
                    i16 = i17;
                    if (i17 == i15) {
                        i11 = p11;
                        break;
                    }
                    int d10 = d(i16, bArr, p11, i12, l10, e7Var);
                    i16 = i17;
                    i11 = d10;
                }
                if (i11 > i12 || i16 != i15) {
                    throw b9.e();
                }
                sbVar.e(i10, l10);
                return i11;
            } else if (i13 == 5) {
                sbVar.e(i10, Integer.valueOf(o(bArr, i11)));
                return i11 + 4;
            } else {
                throw b9.b();
            }
        } else {
            throw b9.b();
        }
    }

    static int e(int i10, byte[] bArr, int i11, e7 e7Var) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            i13 = b10 << 7;
        } else {
            int i16 = i14 | ((b10 & Byte.MAX_VALUE) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & Byte.MAX_VALUE) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & Byte.MAX_VALUE) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                e7Var.f5207a = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            e7Var.f5207a = i16 | i12;
            return i17;
        }
        e7Var.f5207a = i14 | i13;
        return i15;
    }

    static int f(va<?> vaVar, int i10, byte[] bArr, int i11, int i12, y8<?> y8Var, e7 e7Var) {
        int h10 = h(vaVar, bArr, i11, i12, e7Var);
        while (true) {
            y8Var.add(e7Var.f5209c);
            if (h10 >= i12) {
                break;
            }
            int p10 = p(bArr, h10, e7Var);
            if (i10 != e7Var.f5207a) {
                break;
            }
            h10 = h(vaVar, bArr, p10, i12, e7Var);
        }
        return h10;
    }

    static int g(va vaVar, byte[] bArr, int i10, int i11, int i12, e7 e7Var) {
        Object zza = vaVar.zza();
        int i13 = i(zza, vaVar, bArr, i10, i11, i12, e7Var);
        vaVar.d(zza);
        e7Var.f5209c = zza;
        return i13;
    }

    static int h(va vaVar, byte[] bArr, int i10, int i11, e7 e7Var) {
        Object zza = vaVar.zza();
        int j10 = j(zza, vaVar, bArr, i10, i11, e7Var);
        vaVar.d(zza);
        e7Var.f5209c = zza;
        return j10;
    }

    static int i(Object obj, va vaVar, byte[] bArr, int i10, int i11, int i12, e7 e7Var) {
        int l10 = ((ha) vaVar).l(obj, bArr, i10, i11, i12, e7Var);
        e7Var.f5209c = obj;
        return l10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int j(java.lang.Object r6, com.google.android.gms.internal.measurement.va r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.measurement.e7 r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = e(r9, r8, r0, r11)
            int r9 = r11.f5207a
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.f(r1, r2, r3, r4, r5)
            r11.f5209c = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.measurement.b9 r6 = com.google.android.gms.internal.measurement.b9.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b7.j(java.lang.Object, com.google.android.gms.internal.measurement.va, byte[], int, int, com.google.android.gms.internal.measurement.e7):int");
    }

    static int k(byte[] bArr, int i10, e7 e7Var) {
        int p10 = p(bArr, i10, e7Var);
        int i11 = e7Var.f5207a;
        if (i11 < 0) {
            throw b9.d();
        } else if (i11 > bArr.length - p10) {
            throw b9.f();
        } else if (i11 == 0) {
            e7Var.f5209c = f7.f5243n;
            return p10;
        } else {
            e7Var.f5209c = f7.l(bArr, p10, i11);
            return p10 + i11;
        }
    }

    static int l(byte[] bArr, int i10, y8<?> y8Var, e7 e7Var) {
        t8 t8Var = (t8) y8Var;
        int p10 = p(bArr, i10, e7Var);
        int i11 = e7Var.f5207a + p10;
        while (p10 < i11) {
            p10 = p(bArr, p10, e7Var);
            t8Var.g(e7Var.f5207a);
        }
        if (p10 == i11) {
            return p10;
        }
        throw b9.f();
    }

    static float m(byte[] bArr, int i10) {
        return Float.intBitsToFloat(o(bArr, i10));
    }

    static int n(byte[] bArr, int i10, e7 e7Var) {
        int p10 = p(bArr, i10, e7Var);
        int i11 = e7Var.f5207a;
        if (i11 < 0) {
            throw b9.d();
        } else if (i11 == 0) {
            e7Var.f5209c = "";
            return p10;
        } else {
            e7Var.f5209c = bc.e(bArr, p10, i11);
            return p10 + i11;
        }
    }

    static int o(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int p(byte[] bArr, int i10, e7 e7Var) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return e(b10, bArr, i11, e7Var);
        }
        e7Var.f5207a = b10;
        return i11;
    }

    static int q(byte[] bArr, int i10, e7 e7Var) {
        int i11 = i10 + 1;
        long j10 = (long) bArr[i10];
        if (j10 >= 0) {
            e7Var.f5208b = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i13;
            int i15 = i14;
            b10 = b11;
            i12 = i15;
        }
        e7Var.f5208b = j11;
        return i12;
    }

    static long r(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
