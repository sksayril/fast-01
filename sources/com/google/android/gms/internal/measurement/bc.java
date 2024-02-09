package com.google.android.gms.internal.measurement;

final class bc {

    /* renamed from: a  reason: collision with root package name */
    private static final cc f5127a = new fc();

    static {
        if (ac.w()) {
            boolean z9 = ac.z();
        }
    }

    static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new ec(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }

    static int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f5127a.b(charSequence, bArr, i10, i11);
    }

    static /* synthetic */ int c(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 > -12 || b11 > -65) {
                    return -1;
                }
                return (b11 << 8) ^ b10;
            } else if (i12 == 2) {
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 > -12 || b12 > -65 || b13 > -65) {
                    return -1;
                }
                return (b13 << 16) ^ ((b12 << 8) ^ b10);
            } else {
                throw new AssertionError();
            }
        } else if (b10 > -12) {
            return -1;
        } else {
            return b10;
        }
    }

    static boolean d(byte[] bArr) {
        return f5127a.d(bArr, 0, bArr.length);
    }

    static String e(byte[] bArr, int i10, int i11) {
        return f5127a.c(bArr, i10, i11);
    }

    static boolean f(byte[] bArr, int i10, int i11) {
        return f5127a.d(bArr, i10, i11);
    }
}
