package com.google.zxing.qrcode.decoder;

import java.util.Collection;
import java.util.Map;
import o5.e;
import o5.f;
import u5.c;
import u5.m;

final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f7539a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7540a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.qrcode.decoder.h[] r0 = com.google.zxing.qrcode.decoder.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7540a = r0
                com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7540a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7540a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7540a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7540a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.TERMINATOR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f7540a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.FNC1_FIRST_POSITION     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f7540a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.FNC1_SECOND_POSITION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f7540a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.STRUCTURED_APPEND     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f7540a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.ECI     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f7540a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.HANZI     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.d.a.<clinit>():void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        r11 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        if (r11 != com.google.zxing.qrcode.decoder.h.TERMINATOR) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e1, code lost:
        if (r18 == null) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        if (r16 == false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        r15 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e7, code lost:
        if (r17 == false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e9, code lost:
        r15 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r16 == false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f0, code lost:
        r15 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f2, code lost:
        if (r17 == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
        r15 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f7, code lost:
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f8, code lost:
        r1 = r8.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0102, code lost:
        if (r10.isEmpty() == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0104, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0106, code lost:
        r11 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0107, code lost:
        if (r24 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010a, code lost:
        r12 = r24.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0116, code lost:
        return new u5.e(r22, r1, r11, r12, r13, r14, r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static u5.e a(byte[] r22, com.google.zxing.qrcode.decoder.j r23, com.google.zxing.qrcode.decoder.f r24, java.util.Map<o5.e, ?> r25) {
        /*
            r0 = r23
            u5.c r7 = new u5.c
            r9 = r22
            r7.<init>(r9)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r1 = 50
            r8.<init>(r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 1
            r10.<init>(r11)
            r1 = -1
            r2 = 0
            r12 = 0
            r18 = r12
            r13 = -1
            r14 = -1
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0022:
            int r1 = r7.a()     // Catch:{ IllegalArgumentException -> 0x011a }
            r6 = 4
            if (r1 >= r6) goto L_0x002d
            com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x011a }
        L_0x002b:
            r5 = r1
            goto L_0x0036
        L_0x002d:
            int r1 = r7.d(r6)     // Catch:{ IllegalArgumentException -> 0x011a }
            com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.forBits(r1)     // Catch:{ IllegalArgumentException -> 0x011a }
            goto L_0x002b
        L_0x0036:
            int[] r1 = com.google.zxing.qrcode.decoder.d.a.f7540a     // Catch:{ IllegalArgumentException -> 0x011a }
            int r2 = r5.ordinal()     // Catch:{ IllegalArgumentException -> 0x011a }
            r2 = r1[r2]     // Catch:{ IllegalArgumentException -> 0x011a }
            r4 = 2
            r3 = 3
            switch(r2) {
                case 5: goto L_0x0064;
                case 6: goto L_0x008a;
                case 7: goto L_0x0085;
                case 8: goto L_0x006b;
                case 9: goto L_0x005a;
                case 10: goto L_0x0048;
                default: goto L_0x0043;
            }     // Catch:{ IllegalArgumentException -> 0x011a }
        L_0x0043:
            int r2 = r5.getCharacterCountBits(r0)     // Catch:{ IllegalArgumentException -> 0x011a }
            goto L_0x0095
        L_0x0048:
            int r1 = r7.d(r6)     // Catch:{ IllegalArgumentException -> 0x011a }
            int r2 = r5.getCharacterCountBits(r0)     // Catch:{ IllegalArgumentException -> 0x011a }
            int r2 = r7.d(r2)     // Catch:{ IllegalArgumentException -> 0x011a }
            if (r1 != r11) goto L_0x0064
            d(r7, r8, r2)     // Catch:{ IllegalArgumentException -> 0x011a }
            goto L_0x0064
        L_0x005a:
            int r1 = g(r7)     // Catch:{ IllegalArgumentException -> 0x011a }
            u5.d r18 = u5.d.getCharacterSetECIByValue(r1)     // Catch:{ IllegalArgumentException -> 0x011a }
            if (r18 == 0) goto L_0x0066
        L_0x0064:
            r11 = r5
            goto L_0x008e
        L_0x0066:
            o5.f r0 = o5.f.a()     // Catch:{ IllegalArgumentException -> 0x011a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x011a }
        L_0x006b:
            int r1 = r7.a()     // Catch:{ IllegalArgumentException -> 0x011a }
            r2 = 16
            if (r1 < r2) goto L_0x0080
            r1 = 8
            int r2 = r7.d(r1)     // Catch:{ IllegalArgumentException -> 0x011a }
            int r1 = r7.d(r1)     // Catch:{ IllegalArgumentException -> 0x011a }
            r14 = r1
            r13 = r2
            goto L_0x0064
        L_0x0080:
            o5.f r0 = o5.f.a()     // Catch:{ IllegalArgumentException -> 0x011a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x011a }
        L_0x0085:
            r11 = r5
            r15 = 1
            r17 = 1
            goto L_0x008e
        L_0x008a:
            r11 = r5
            r15 = 1
            r16 = 1
        L_0x008e:
            r19 = 2
            r20 = 3
            r21 = 4
            goto L_0x00dd
        L_0x0095:
            int r2 = r7.d(r2)     // Catch:{ IllegalArgumentException -> 0x011a }
            int r19 = r5.ordinal()     // Catch:{ IllegalArgumentException -> 0x011a }
            r1 = r1[r19]     // Catch:{ IllegalArgumentException -> 0x011a }
            if (r1 == r11) goto L_0x00d2
            if (r1 == r4) goto L_0x00c6
            if (r1 == r3) goto L_0x00b0
            if (r1 != r6) goto L_0x00ab
            e(r7, r8, r2)     // Catch:{ IllegalArgumentException -> 0x011a }
            goto L_0x0064
        L_0x00ab:
            o5.f r0 = o5.f.a()     // Catch:{ IllegalArgumentException -> 0x011a }
            throw r0     // Catch:{ IllegalArgumentException -> 0x011a }
        L_0x00b0:
            r1 = r7
            r19 = r2
            r2 = r8
            r20 = 3
            r3 = r19
            r19 = 2
            r4 = r18
            r11 = r5
            r5 = r10
            r21 = 4
            r6 = r25
            c(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x011a }
            goto L_0x00dd
        L_0x00c6:
            r1 = r2
            r11 = r5
            r19 = 2
            r20 = 3
            r21 = 4
            b(r7, r8, r1, r15)     // Catch:{ IllegalArgumentException -> 0x011a }
            goto L_0x00dd
        L_0x00d2:
            r1 = r2
            r11 = r5
            r19 = 2
            r20 = 3
            r21 = 4
            f(r7, r8, r1)     // Catch:{ IllegalArgumentException -> 0x011a }
        L_0x00dd:
            com.google.zxing.qrcode.decoder.h r1 = com.google.zxing.qrcode.decoder.h.TERMINATOR     // Catch:{ IllegalArgumentException -> 0x011a }
            if (r11 != r1) goto L_0x0117
            if (r18 == 0) goto L_0x00ee
            if (r16 == 0) goto L_0x00e7
            r15 = 4
            goto L_0x00f8
        L_0x00e7:
            if (r17 == 0) goto L_0x00ec
            r0 = 6
            r15 = 6
            goto L_0x00f8
        L_0x00ec:
            r15 = 2
            goto L_0x00f8
        L_0x00ee:
            if (r16 == 0) goto L_0x00f2
            r15 = 3
            goto L_0x00f8
        L_0x00f2:
            if (r17 == 0) goto L_0x00f7
            r0 = 5
            r15 = 5
            goto L_0x00f8
        L_0x00f7:
            r15 = 1
        L_0x00f8:
            u5.e r0 = new u5.e
            java.lang.String r1 = r8.toString()
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x0106
            r11 = r12
            goto L_0x0107
        L_0x0106:
            r11 = r10
        L_0x0107:
            if (r24 != 0) goto L_0x010a
            goto L_0x010f
        L_0x010a:
            java.lang.String r2 = r24.toString()
            r12 = r2
        L_0x010f:
            r8 = r0
            r9 = r22
            r10 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r0
        L_0x0117:
            r11 = 1
            goto L_0x0022
        L_0x011a:
            o5.f r0 = o5.f.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.decoder.d.a(byte[], com.google.zxing.qrcode.decoder.j, com.google.zxing.qrcode.decoder.f, java.util.Map):u5.e");
    }

    private static void b(c cVar, StringBuilder sb, int i10, boolean z9) {
        while (i10 > 1) {
            if (cVar.a() >= 11) {
                int d10 = cVar.d(11);
                sb.append(h(d10 / 45));
                sb.append(h(d10 % 45));
                i10 -= 2;
            } else {
                throw f.a();
            }
        }
        if (i10 == 1) {
            if (cVar.a() >= 6) {
                sb.append(h(cVar.d(6)));
            } else {
                throw f.a();
            }
        }
        if (z9) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i11 = length + 1;
                        if (sb.charAt(i11) == '%') {
                            sb.deleteCharAt(i11);
                        }
                    }
                    sb.setCharAt(length, 29);
                }
            }
        }
    }

    private static void c(c cVar, StringBuilder sb, int i10, u5.d dVar, Collection<byte[]> collection, Map<e, ?> map) {
        if (i10 * 8 <= cVar.a()) {
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i11] = (byte) cVar.d(8);
            }
            sb.append(new String(bArr, dVar == null ? m.a(bArr, map) : dVar.getCharset()));
            collection.add(bArr);
            return;
        }
        throw f.a();
    }

    private static void d(c cVar, StringBuilder sb, int i10) {
        if (i10 * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i10 * 2)];
            int i11 = 0;
            while (i10 > 0) {
                int d10 = cVar.d(13);
                int i12 = (d10 % 96) | ((d10 / 96) << 8);
                int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
                bArr[i11] = (byte) ((i13 >> 8) & 255);
                bArr[i11 + 1] = (byte) (i13 & 255);
                i11 += 2;
                i10--;
            }
            sb.append(new String(bArr, m.f12520c));
            return;
        }
        throw f.a();
    }

    private static void e(c cVar, StringBuilder sb, int i10) {
        if (i10 * 13 <= cVar.a()) {
            byte[] bArr = new byte[(i10 * 2)];
            int i11 = 0;
            while (i10 > 0) {
                int d10 = cVar.d(13);
                int i12 = (d10 % 192) | ((d10 / 192) << 8);
                int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
                bArr[i11] = (byte) (i13 >> 8);
                bArr[i11 + 1] = (byte) i13;
                i11 += 2;
                i10--;
            }
            sb.append(new String(bArr, m.f12519b));
            return;
        }
        throw f.a();
    }

    private static void f(c cVar, StringBuilder sb, int i10) {
        int d10;
        while (i10 >= 3) {
            if (cVar.a() >= 10) {
                int d11 = cVar.d(10);
                if (d11 < 1000) {
                    sb.append(h(d11 / 100));
                    sb.append(h((d11 / 10) % 10));
                    sb.append(h(d11 % 10));
                    i10 -= 3;
                } else {
                    throw f.a();
                }
            } else {
                throw f.a();
            }
        }
        if (i10 == 2) {
            if (cVar.a() >= 7) {
                int d12 = cVar.d(7);
                if (d12 < 100) {
                    sb.append(h(d12 / 10));
                    d10 = d12 % 10;
                } else {
                    throw f.a();
                }
            } else {
                throw f.a();
            }
        } else if (i10 != 1) {
            return;
        } else {
            if (cVar.a() >= 4) {
                d10 = cVar.d(4);
                if (d10 >= 10) {
                    throw f.a();
                }
            } else {
                throw f.a();
            }
        }
        sb.append(h(d10));
    }

    private static int g(c cVar) {
        int d10 = cVar.d(8);
        if ((d10 & 128) == 0) {
            return d10 & 127;
        }
        if ((d10 & 192) == 128) {
            return cVar.d(8) | ((d10 & 63) << 8);
        }
        if ((d10 & 224) == 192) {
            return cVar.d(16) | ((d10 & 31) << 16);
        }
        throw f.a();
    }

    private static char h(int i10) {
        char[] cArr = f7539a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw f.a();
    }
}
