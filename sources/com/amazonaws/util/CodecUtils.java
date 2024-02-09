package com.amazonaws.util;

public enum CodecUtils {
    ;

    static int sanitize(String str, byte[] bArr) {
        int length = bArr.length;
        char[] charArray = str.toCharArray();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char c10 = charArray[i11];
            if (!(c10 == 13 || c10 == 10 || c10 == ' ')) {
                if (c10 <= 127) {
                    bArr[i10] = (byte) c10;
                    i10++;
                } else {
                    throw new IllegalArgumentException("Invalid character found at position " + i11 + " for " + str);
                }
            }
        }
        return i10;
    }

    static void sanityCheckLastPos(int i10, int i11) {
        if ((i10 & i11) != 0) {
            throw new IllegalArgumentException("Invalid last non-pad character detected");
        }
    }

    public static byte[] toBytesDirect(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        int i10 = 0;
        while (i10 < length) {
            char c10 = charArray[i10];
            if (c10 <= 127) {
                bArr[i10] = (byte) c10;
                i10++;
            } else {
                throw new IllegalArgumentException("Invalid character found at position " + i10 + " for " + str);
            }
        }
        return bArr;
    }

    public static String toStringDirect(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            cArr[i11] = (char) bArr[i10];
            i10++;
            i11++;
        }
        return new String(cArr);
    }
}
