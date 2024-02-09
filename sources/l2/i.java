package l2;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f11117a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f11118b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length + length)];
        int i10 = 0;
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            int i11 = i10 + 1;
            char[] cArr2 = f11118b;
            cArr[i10] = cArr2[b11 >>> 4];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr, boolean z9) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        int i10 = 0;
        while (i10 < length && (!z9 || i10 != length - 1 || (bArr[i10] & 255) != 0)) {
            char[] cArr = f11117a;
            sb.append(cArr[(bArr[i10] & 240) >>> 4]);
            sb.append(cArr[bArr[i10] & 15]);
            i10++;
        }
        return sb.toString();
    }
}
