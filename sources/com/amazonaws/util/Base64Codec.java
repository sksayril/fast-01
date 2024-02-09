package com.amazonaws.util;

import f.j;

class Base64Codec {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f4741a = CodecUtils.toBytesDirect("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    private static class LazyHolder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final byte[] f4742a = b();

        private static byte[] b() {
            byte[] bArr = new byte[j.J0];
            for (int i10 = 0; i10 <= 122; i10++) {
                if (i10 >= 65 && i10 <= 90) {
                    bArr[i10] = (byte) (i10 - 65);
                } else if (i10 >= 48 && i10 <= 57) {
                    bArr[i10] = (byte) (i10 + 4);
                } else if (i10 == 43) {
                    bArr[i10] = (byte) (i10 + 19);
                } else if (i10 == 47) {
                    bArr[i10] = (byte) (i10 + 16);
                } else if (i10 < 97 || i10 > 122) {
                    bArr[i10] = -1;
                } else {
                    bArr[i10] = (byte) (i10 - 71);
                }
            }
            return bArr;
        }
    }

    Base64Codec() {
    }

    public byte[] a(byte[] bArr, int i10) {
        int i11;
        if (i10 % 4 == 0) {
            int i12 = i10 - 1;
            int i13 = 0;
            while (true) {
                i11 = 2;
                if (i13 < 2 && i12 > -1 && bArr[i12] == 61) {
                    i12--;
                    i13++;
                }
            }
            if (i13 == 0) {
                i11 = 3;
            } else if (i13 != 1) {
                if (i13 == 2) {
                    i11 = 1;
                } else {
                    throw new Error("Impossible");
                }
            }
            int i14 = ((i10 / 4) * 3) - (3 - i11);
            byte[] bArr2 = new byte[i14];
            int i15 = 0;
            int i16 = 0;
            while (i16 < i14 - (i11 % 3)) {
                c(bArr, i15, bArr2, i16);
                i15 += 4;
                i16 += 3;
            }
            if (i11 < 3) {
                b(i11, bArr, i15, bArr2, i16);
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Input is expected to be encoded in multiple of 4 bytes but found: " + i10);
    }

    /* access modifiers changed from: package-private */
    public void b(int i10, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = i12 + 1;
        int i14 = i11 + 1;
        int i15 = i14 + 1;
        int h10 = h(bArr[i14]);
        bArr2[i12] = (byte) ((h(bArr[i11]) << 2) | ((h10 >>> 4) & 3));
        if (i10 == 1) {
            CodecUtils.sanityCheckLastPos(h10, 15);
            return;
        }
        int i16 = i13 + 1;
        int i17 = i15 + 1;
        int h11 = h(bArr[i15]);
        bArr2[i13] = (byte) ((15 & (h11 >>> 2)) | ((h10 & 15) << 4));
        if (i10 == 2) {
            CodecUtils.sanityCheckLastPos(h11, 3);
        } else {
            bArr2[i16] = (byte) (((h11 & 3) << 6) | h(bArr[i17]));
        }
    }

    /* access modifiers changed from: package-private */
    public void c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = i11 + 1;
        int i13 = i10 + 1;
        int i14 = i13 + 1;
        int h10 = h(bArr[i13]);
        bArr2[i11] = (byte) ((h(bArr[i10]) << 2) | ((h10 >>> 4) & 3));
        int i15 = i14 + 1;
        int h11 = h(bArr[i14]);
        bArr2[i12] = (byte) (((h10 & 15) << 4) | ((h11 >>> 2) & 15));
        bArr2[i12 + 1] = (byte) (h(bArr[i15]) | ((h11 & 3) << 6));
    }

    public byte[] d(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i10 = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[(length * 4)];
            int i11 = 0;
            while (i10 < bArr.length) {
                g(bArr, i10, bArr2, i11);
                i10 += 3;
                i11 += 4;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[((length + 1) * 4)];
        int i12 = 0;
        while (i10 < bArr.length - length2) {
            g(bArr, i10, bArr3, i12);
            i10 += 3;
            i12 += 4;
        }
        if (length2 == 1) {
            e(bArr, i10, bArr3, i12);
        } else if (length2 == 2) {
            f(bArr, i10, bArr3, i12);
        }
        return bArr3;
    }

    /* access modifiers changed from: package-private */
    public void e(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = i11 + 1;
        byte[] bArr3 = this.f4741a;
        byte b10 = bArr[i10];
        bArr2[i11] = bArr3[(b10 >>> 2) & 63];
        int i13 = i12 + 1;
        bArr2[i12] = bArr3[(b10 & 3) << 4];
        bArr2[i13] = 61;
        bArr2[i13 + 1] = 61;
    }

    /* access modifiers changed from: package-private */
    public void f(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = i11 + 1;
        byte[] bArr3 = this.f4741a;
        int i13 = i10 + 1;
        byte b10 = bArr[i10];
        bArr2[i11] = bArr3[(b10 >>> 2) & 63];
        int i14 = i12 + 1;
        byte b11 = bArr[i13];
        bArr2[i12] = bArr3[((b10 & 3) << 4) | ((b11 >>> 4) & 15)];
        bArr2[i14] = bArr3[(b11 & 15) << 2];
        bArr2[i14 + 1] = 61;
    }

    /* access modifiers changed from: package-private */
    public void g(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12 = i11 + 1;
        byte[] bArr3 = this.f4741a;
        int i13 = i10 + 1;
        byte b10 = bArr[i10];
        bArr2[i11] = bArr3[(b10 >>> 2) & 63];
        int i14 = i12 + 1;
        int i15 = i13 + 1;
        byte b11 = bArr[i13];
        bArr2[i12] = bArr3[((b10 & 3) << 4) | ((b11 >>> 4) & 15)];
        byte b12 = bArr[i15];
        bArr2[i14] = bArr3[((b11 & 15) << 2) | ((b12 >>> 6) & 3)];
        bArr2[i14 + 1] = bArr3[b12 & 63];
    }

    /* access modifiers changed from: protected */
    public int h(byte b10) {
        byte b11 = LazyHolder.f4742a[b10];
        if (b11 > -1) {
            return b11;
        }
        throw new IllegalArgumentException("Invalid base 64 character: '" + ((char) b10) + "'");
    }
}
