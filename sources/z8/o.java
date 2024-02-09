package z8;

import kotlin.jvm.internal.l;

class o extends n {
    public static byte[] h(String str) {
        l.e(str, "<this>");
        byte[] bytes = str.getBytes(c.f13614b);
        l.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final boolean i(String str, String str2, boolean z9) {
        l.e(str, "<this>");
        l.e(str2, "suffix");
        if (!z9) {
            return str.endsWith(str2);
        }
        return l(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean j(String str, String str2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return i(str, str2, z9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean k(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            w8.c r0 = z8.p.w(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            h8.a0 r3 = (h8.a0) r3
            int r3 = r3.b()
            char r3 = r4.charAt(r3)
            boolean r3 = z8.a.c(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.o.k(java.lang.CharSequence):boolean");
    }

    public static final boolean l(String str, int i10, String str2, int i11, int i12, boolean z9) {
        l.e(str, "<this>");
        l.e(str2, "other");
        return !z9 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z9, i10, str2, i11, i12);
    }

    public static final String m(String str, char c10, char c11, boolean z9) {
        String sb;
        String str2;
        l.e(str, "<this>");
        if (!z9) {
            sb = str.replace(c10, c11);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        } else {
            StringBuilder sb2 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (b.d(charAt, c10, z9)) {
                    charAt = c11;
                }
                sb2.append(charAt);
            }
            sb = sb2.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        }
        l.d(sb, str2);
        return sb;
    }

    public static final String n(String str, String str2, String str3, boolean z9) {
        l.e(str, "<this>");
        l.e(str2, "oldValue");
        l.e(str3, "newValue");
        int i10 = 0;
        int z10 = p.z(str, str2, 0, z9);
        if (z10 < 0) {
            return str;
        }
        int length = str2.length();
        int a10 = i.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append(str, i10, z10);
                sb.append(str3);
                i10 = z10 + length;
                if (z10 >= str.length() || (z10 = p.z(str, str2, z10 + a10, z9)) <= 0) {
                    sb.append(str, i10, str.length());
                    String sb2 = sb.toString();
                    l.d(sb2, "stringBuilder.append(this, i, length).toString()");
                }
                sb.append(str, i10, z10);
                sb.append(str3);
                i10 = z10 + length;
                break;
            } while ((z10 = p.z(str, str2, z10 + a10, z9)) <= 0);
            sb.append(str, i10, str.length());
            String sb22 = sb.toString();
            l.d(sb22, "stringBuilder.append(this, i, length).toString()");
            return sb22;
        }
        throw new OutOfMemoryError();
    }

    public static /* synthetic */ String o(String str, char c10, char c11, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return m(str, c10, c11, z9);
    }

    public static /* synthetic */ String p(String str, String str2, String str3, boolean z9, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        return n(str, str2, str3, z9);
    }

    public static final boolean q(String str, String str2, boolean z9) {
        l.e(str, "<this>");
        l.e(str2, "prefix");
        if (!z9) {
            return str.startsWith(str2);
        }
        return l(str, 0, str2, 0, str2.length(), z9);
    }

    public static /* synthetic */ boolean r(String str, String str2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return q(str, str2, z9);
    }
}
