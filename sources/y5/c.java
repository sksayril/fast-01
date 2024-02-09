package y5;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Set;
import o5.f;
import u5.h;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f13249a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f13250b;

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f13251c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f13252d;

    /* renamed from: e  reason: collision with root package name */
    private static final char[] f13253e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13254a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                y5.c$b[] r0 = y5.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13254a = r0
                y5.c$b r1 = y5.c.b.C40_ENCODE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13254a     // Catch:{ NoSuchFieldError -> 0x001d }
                y5.c$b r1 = y5.c.b.TEXT_ENCODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13254a     // Catch:{ NoSuchFieldError -> 0x0028 }
                y5.c$b r1 = y5.c.b.ANSIX12_ENCODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13254a     // Catch:{ NoSuchFieldError -> 0x0033 }
                y5.c$b r1 = y5.c.b.EDIFACT_ENCODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13254a     // Catch:{ NoSuchFieldError -> 0x003e }
                y5.c$b r1 = y5.c.b.BASE256_ENCODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13254a     // Catch:{ NoSuchFieldError -> 0x0049 }
                y5.c$b r1 = y5.c.b.ECI_ENCODE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y5.c.a.<clinit>():void");
        }
    }

    private enum b {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE,
        ECI_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f13250b = cArr;
        f13252d = cArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static u5.e a(byte[] r13) {
        /*
            u5.c r0 = new u5.c
            r0.<init>(r13)
            u5.h r1 = new u5.h
            r2 = 100
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.<init>(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.<init>(r6)
            y5.c$b r8 = y5.c.b.ASCII_ENCODE
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
        L_0x0027:
            y5.c$b r10 = y5.c.b.ASCII_ENCODE
            if (r8 != r10) goto L_0x0030
            y5.c$b r8 = c(r0, r1, r2, r9)
            goto L_0x0059
        L_0x0030:
            int[] r11 = y5.c.a.f13254a
            int r8 = r8.ordinal()
            r8 = r11[r8]
            switch(r8) {
                case 1: goto L_0x0055;
                case 2: goto L_0x0051;
                case 3: goto L_0x004d;
                case 4: goto L_0x0049;
                case 5: goto L_0x0045;
                case 6: goto L_0x0040;
                default: goto L_0x003b;
            }
        L_0x003b:
            o5.f r13 = o5.f.a()
            throw r13
        L_0x0040:
            f(r0, r1)
            r3 = 1
            goto L_0x0058
        L_0x0045:
            d(r0, r1, r5)
            goto L_0x0058
        L_0x0049:
            g(r0, r1)
            goto L_0x0058
        L_0x004d:
            b(r0, r1)
            goto L_0x0058
        L_0x0051:
            h(r0, r1, r9)
            goto L_0x0058
        L_0x0055:
            e(r0, r1, r9)
        L_0x0058:
            r8 = r10
        L_0x0059:
            y5.c$b r10 = y5.c.b.PAD_ENCODE
            if (r8 == r10) goto L_0x0063
            int r10 = r0.a()
            if (r10 > 0) goto L_0x0027
        L_0x0063:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x006c
            r1.e(r2)
        L_0x006c:
            r0 = 5
            r2 = 4
            if (r3 == 0) goto L_0x0099
            boolean r3 = r9.contains(r4)
            if (r3 != 0) goto L_0x0097
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r9.contains(r3)
            if (r3 == 0) goto L_0x0081
            goto L_0x0097
        L_0x0081:
            boolean r3 = r9.contains(r7)
            if (r3 != 0) goto L_0x0094
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r12 = 4
            goto L_0x00c2
        L_0x0094:
            r6 = 6
            r12 = 6
            goto L_0x00c2
        L_0x0097:
            r12 = 5
            goto L_0x00c2
        L_0x0099:
            boolean r3 = r9.contains(r4)
            if (r3 != 0) goto L_0x00c0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r9.contains(r2)
            if (r2 == 0) goto L_0x00aa
            goto L_0x00c0
        L_0x00aa:
            boolean r2 = r9.contains(r7)
            if (r2 != 0) goto L_0x00bd
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r9.contains(r0)
            if (r0 == 0) goto L_0x00bb
            goto L_0x00bd
        L_0x00bb:
            r12 = 1
            goto L_0x00c2
        L_0x00bd:
            r6 = 3
            r12 = 3
            goto L_0x00c2
        L_0x00c0:
            r6 = 2
            r12 = 2
        L_0x00c2:
            u5.e r0 = new u5.e
            java.lang.String r9 = r1.toString()
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x00cf
            r5 = 0
        L_0x00cf:
            r10 = r5
            r11 = 0
            r7 = r0
            r8 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.a(byte[]):u5.e");
    }

    private static void b(u5.c cVar, h hVar) {
        int d10;
        char c10;
        int i10;
        int[] iArr = new int[3];
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            i(d10, cVar.d(8), iArr);
            for (int i11 = 0; i11 < 3; i11++) {
                int i12 = iArr[i11];
                if (i12 == 0) {
                    c10 = 13;
                } else if (i12 == 1) {
                    c10 = '*';
                } else if (i12 == 2) {
                    c10 = '>';
                } else if (i12 != 3) {
                    if (i12 < 14) {
                        i10 = i12 + 44;
                    } else if (i12 < 40) {
                        i10 = i12 + 51;
                    } else {
                        throw f.a();
                    }
                    c10 = (char) i10;
                } else {
                    c10 = ' ';
                }
                hVar.b(c10);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static b c(u5.c cVar, h hVar, StringBuilder sb, Set<Integer> set) {
        String str;
        boolean z9 = false;
        do {
            int d10 = cVar.d(8);
            if (d10 == 0) {
                throw f.a();
            } else if (d10 <= 128) {
                if (z9) {
                    d10 += 128;
                }
                hVar.b((char) (d10 - 1));
                return b.ASCII_ENCODE;
            } else if (d10 == 129) {
                return b.PAD_ENCODE;
            } else {
                if (d10 <= 229) {
                    int i10 = d10 - 130;
                    if (i10 < 10) {
                        hVar.b('0');
                    }
                    hVar.c(i10);
                } else {
                    switch (d10) {
                        case 230:
                            return b.C40_ENCODE;
                        case 231:
                            return b.BASE256_ENCODE;
                        case 232:
                            set.add(Integer.valueOf(hVar.i()));
                            hVar.b(29);
                            break;
                        case 233:
                        case 234:
                            break;
                        case 235:
                            z9 = true;
                            break;
                        case 236:
                            str = "[)>\u001e05\u001d";
                            break;
                        case 237:
                            str = "[)>\u001e06\u001d";
                            break;
                        case 238:
                            return b.ANSIX12_ENCODE;
                        case 239:
                            return b.TEXT_ENCODE;
                        case 240:
                            return b.EDIFACT_ENCODE;
                        case 241:
                            return b.ECI_ENCODE;
                        default:
                            if (!(d10 == 254 && cVar.a() == 0)) {
                                throw f.a();
                            }
                    }
                    hVar.d(str);
                    sb.insert(0, "\u001e\u0004");
                }
            }
        } while (cVar.a() > 0);
        return b.ASCII_ENCODE;
    }

    private static void d(u5.c cVar, h hVar, Collection<byte[]> collection) {
        int c10 = cVar.c() + 1;
        int i10 = c10 + 1;
        int j10 = j(cVar.d(8), c10);
        if (j10 == 0) {
            j10 = cVar.a() / 8;
        } else if (j10 >= 250) {
            j10 = ((j10 - 249) * 250) + j(cVar.d(8), i10);
            i10++;
        }
        if (j10 >= 0) {
            byte[] bArr = new byte[j10];
            int i11 = 0;
            while (i11 < j10) {
                if (cVar.a() >= 8) {
                    bArr[i11] = (byte) j(cVar.d(8), i10);
                    i11++;
                    i10++;
                } else {
                    throw f.a();
                }
            }
            collection.add(bArr);
            hVar.d(new String(bArr, StandardCharsets.ISO_8859_1));
            return;
        }
        throw f.a();
    }

    private static void e(u5.c cVar, h hVar, Set<Integer> set) {
        int d10;
        char c10;
        char c11;
        int i10;
        int[] iArr = new int[3];
        boolean z9 = false;
        int i11 = 0;
        while (cVar.a() != 8 && (d10 = cVar.d(8)) != 254) {
            i(d10, cVar.d(8), iArr);
            for (int i12 = 0; i12 < 3; i12++) {
                int i13 = iArr[i12];
                if (i11 != 0) {
                    if (i11 == 1) {
                        if (z9) {
                            i10 = i13 + 128;
                        }
                        c10 = (char) i13;
                        hVar.b(c10);
                        i11 = 0;
                    } else if (i11 == 2) {
                        char[] cArr = f13250b;
                        if (i13 < cArr.length) {
                            c10 = cArr[i13];
                            if (z9) {
                                c11 = (char) (c10 + 128);
                                hVar.b(c11);
                                z9 = false;
                                i11 = 0;
                            }
                        } else if (i13 == 27) {
                            set.add(Integer.valueOf(hVar.i()));
                            c10 = 29;
                        } else if (i13 == 30) {
                            z9 = true;
                            i11 = 0;
                        } else {
                            throw f.a();
                        }
                        hVar.b(c10);
                        i11 = 0;
                    } else if (i11 != 3) {
                        throw f.a();
                    } else if (z9) {
                        i10 = i13 + 224;
                    } else {
                        i13 += 96;
                        c10 = (char) i13;
                        hVar.b(c10);
                        i11 = 0;
                    }
                    c11 = (char) i10;
                    hVar.b(c11);
                    z9 = false;
                    i11 = 0;
                } else if (i13 < 3) {
                    i11 = i13 + 1;
                } else {
                    char[] cArr2 = f13249a;
                    if (i13 < cArr2.length) {
                        char c12 = cArr2[i13];
                        if (z9) {
                            hVar.b((char) (c12 + 128));
                            z9 = false;
                        } else {
                            hVar.b(c12);
                        }
                    } else {
                        throw f.a();
                    }
                }
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    private static void f(u5.c cVar, h hVar) {
        if (cVar.a() >= 8) {
            int d10 = cVar.d(8);
            if (d10 <= 127) {
                hVar.f(d10 - 1);
                return;
            }
            return;
        }
        throw f.a();
    }

    private static void g(u5.c cVar, h hVar) {
        while (cVar.a() > 16) {
            for (int i10 = 0; i10 < 4; i10++) {
                int d10 = cVar.d(6);
                if (d10 == 31) {
                    int b10 = 8 - cVar.b();
                    if (b10 != 8) {
                        cVar.d(b10);
                        return;
                    }
                    return;
                }
                if ((d10 & 32) == 0) {
                    d10 |= 64;
                }
                hVar.b((char) d10);
            }
            if (cVar.a() <= 0) {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        if (r3 != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        if (r3 != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void h(u5.c r9, u5.h r10, java.util.Set<java.lang.Integer> r11) {
        /*
            r0 = 3
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0006:
            int r5 = r9.a()
            r6 = 8
            if (r5 != r6) goto L_0x000f
            return
        L_0x000f:
            int r5 = r9.d(r6)
            r7 = 254(0xfe, float:3.56E-43)
            if (r5 != r7) goto L_0x0018
            return
        L_0x0018:
            int r6 = r9.d(r6)
            i(r5, r6, r1)
            r5 = 0
        L_0x0020:
            if (r5 >= r0) goto L_0x009e
            r6 = r1[r5]
            if (r4 == 0) goto L_0x007c
            r7 = 1
            if (r4 == r7) goto L_0x006c
            r8 = 2
            if (r4 == r8) goto L_0x0045
            if (r4 != r0) goto L_0x0040
            char[] r4 = f13253e
            int r7 = r4.length
            if (r6 >= r7) goto L_0x003b
            char r4 = r4[r6]
            if (r3 == 0) goto L_0x0077
        L_0x0037:
            int r4 = r4 + 128
            char r3 = (char) r4
            goto L_0x0071
        L_0x003b:
            o5.f r9 = o5.f.a()
            throw r9
        L_0x0040:
            o5.f r9 = o5.f.a()
            throw r9
        L_0x0045:
            char[] r4 = f13252d
            int r8 = r4.length
            if (r6 >= r8) goto L_0x004f
            char r4 = r4[r6]
            if (r3 == 0) goto L_0x0077
            goto L_0x0037
        L_0x004f:
            r4 = 27
            if (r6 == r4) goto L_0x005e
            r3 = 30
            if (r6 != r3) goto L_0x0059
            r3 = 1
            goto L_0x007a
        L_0x0059:
            o5.f r9 = o5.f.a()
            throw r9
        L_0x005e:
            int r4 = r10.i()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11.add(r4)
            r4 = 29
            goto L_0x0077
        L_0x006c:
            if (r3 == 0) goto L_0x0076
            int r6 = r6 + 128
            char r3 = (char) r6
        L_0x0071:
            r10.b(r3)
            r3 = 0
            goto L_0x007a
        L_0x0076:
            char r4 = (char) r6
        L_0x0077:
            r10.b(r4)
        L_0x007a:
            r4 = 0
            goto L_0x0096
        L_0x007c:
            if (r6 >= r0) goto L_0x0082
            int r6 = r6 + 1
            r4 = r6
            goto L_0x0096
        L_0x0082:
            char[] r7 = f13251c
            int r8 = r7.length
            if (r6 >= r8) goto L_0x0099
            char r6 = r7[r6]
            if (r3 == 0) goto L_0x0093
            int r6 = r6 + 128
            char r3 = (char) r6
            r10.b(r3)
            r3 = 0
            goto L_0x0096
        L_0x0093:
            r10.b(r6)
        L_0x0096:
            int r5 = r5 + 1
            goto L_0x0020
        L_0x0099:
            o5.f r9 = o5.f.a()
            throw r9
        L_0x009e:
            int r5 = r9.a()
            if (r5 > 0) goto L_0x0006
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.c.h(u5.c, u5.h, java.util.Set):void");
    }

    private static void i(int i10, int i11, int[] iArr) {
        int i12 = ((i10 << 8) + i11) - 1;
        int i13 = i12 / 1600;
        iArr[0] = i13;
        int i14 = i12 - (i13 * 1600);
        int i15 = i14 / 40;
        iArr[1] = i15;
        iArr[2] = i14 - (i15 * 40);
    }

    private static int j(int i10, int i11) {
        int i12 = i10 - (((i11 * 149) % 255) + 1);
        return i12 >= 0 ? i12 : i12 + 256;
    }
}
