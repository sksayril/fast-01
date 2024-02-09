package n5;

import h5.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

public class a implements Closeable {
    private int[] A;

    /* renamed from: m  reason: collision with root package name */
    private final Reader f11296m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f11297n = false;

    /* renamed from: o  reason: collision with root package name */
    private final char[] f11298o = new char[1024];

    /* renamed from: p  reason: collision with root package name */
    private int f11299p = 0;

    /* renamed from: q  reason: collision with root package name */
    private int f11300q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f11301r = 0;

    /* renamed from: s  reason: collision with root package name */
    private int f11302s = 0;

    /* renamed from: t  reason: collision with root package name */
    int f11303t = 0;

    /* renamed from: u  reason: collision with root package name */
    private long f11304u;

    /* renamed from: v  reason: collision with root package name */
    private int f11305v;

    /* renamed from: w  reason: collision with root package name */
    private String f11306w;

    /* renamed from: x  reason: collision with root package name */
    private int[] f11307x;

    /* renamed from: y  reason: collision with root package name */
    private int f11308y;

    /* renamed from: z  reason: collision with root package name */
    private String[] f11309z;

    /* renamed from: n5.a$a  reason: collision with other inner class name */
    class C0187a extends f {
        C0187a() {
        }

        public void a(a aVar) {
            int i10;
            if (aVar instanceof i5.f) {
                ((i5.f) aVar).W();
                return;
            }
            int i11 = aVar.f11303t;
            if (i11 == 0) {
                i11 = aVar.h();
            }
            if (i11 == 13) {
                i10 = 9;
            } else if (i11 == 12) {
                i10 = 8;
            } else if (i11 == 14) {
                i10 = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.G() + aVar.r());
            }
            aVar.f11303t = i10;
        }
    }

    static {
        f.f9344a = new C0187a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f11307x = iArr;
        this.f11308y = 0 + 1;
        iArr[0] = 6;
        this.f11309z = new String[32];
        this.A = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f11296m = reader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r1 != '/') goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        r7.f11299p = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        if (r4 != r2) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        r7.f11299p = r4 - 1;
        r2 = m(2);
        r7.f11299p++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r2 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        e();
        r2 = r7.f11299p;
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r3 == '*') goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r3 == '/') goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        r7.f11299p = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r7.f11299p = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (N("*/") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0097, code lost:
        throw R("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0098, code lost:
        r7.f11299p = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        if (r1 != '#') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
        e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f11298o
        L_0x0002:
            int r1 = r7.f11299p
        L_0x0004:
            int r2 = r7.f11300q
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r7.f11299p = r1
            boolean r1 = r7.m(r3)
            if (r1 != 0) goto L_0x0030
            if (r8 != 0) goto L_0x0015
            r8 = -1
            return r8
        L_0x0015:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.r()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            int r1 = r7.f11299p
            int r2 = r7.f11300q
        L_0x0034:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0044
            int r1 = r7.f11301r
            int r1 = r1 + r3
            r7.f11301r = r1
            r7.f11302s = r4
            goto L_0x00a3
        L_0x0044:
            r5 = 32
            if (r1 == r5) goto L_0x00a3
            r5 = 13
            if (r1 == r5) goto L_0x00a3
            r5 = 9
            if (r1 != r5) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            r5 = 47
            if (r1 != r5) goto L_0x0098
            r7.f11299p = r4
            r6 = 2
            if (r4 != r2) goto L_0x006a
            int r4 = r4 + -1
            r7.f11299p = r4
            boolean r2 = r7.m(r6)
            int r4 = r7.f11299p
            int r4 = r4 + r3
            r7.f11299p = r4
            if (r2 != 0) goto L_0x006a
            return r1
        L_0x006a:
            r7.e()
            int r2 = r7.f11299p
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L_0x0080
            if (r3 == r5) goto L_0x0078
            return r1
        L_0x0078:
            int r2 = r2 + 1
            r7.f11299p = r2
        L_0x007c:
            r7.O()
            goto L_0x0002
        L_0x0080:
            int r2 = r2 + 1
            r7.f11299p = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.N(r1)
            if (r1 == 0) goto L_0x0091
            int r1 = r7.f11299p
            int r1 = r1 + r6
            goto L_0x0004
        L_0x0091:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.R(r8)
            throw r8
        L_0x0098:
            r2 = 35
            r7.f11299p = r4
            if (r1 != r2) goto L_0x00a2
            r7.e()
            goto L_0x007c
        L_0x00a2:
            return r1
        L_0x00a3:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a.A(boolean):int");
    }

    private String D(char c10) {
        char[] cArr = this.f11298o;
        StringBuilder sb = null;
        while (true) {
            int i10 = this.f11299p;
            int i11 = this.f11300q;
            int i12 = i10;
            while (true) {
                if (i10 < i11) {
                    int i13 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f11299p = i13;
                        int i14 = (i13 - i12) - 1;
                        if (sb == null) {
                            return new String(cArr, i12, i14);
                        }
                        sb.append(cArr, i12, i14);
                        return sb.toString();
                    } else if (c11 == '\\') {
                        this.f11299p = i13;
                        int i15 = (i13 - i12) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i15 + 1) * 2, 16));
                        }
                        sb.append(cArr, i12, i15);
                        sb.append(K());
                    } else {
                        if (c11 == 10) {
                            this.f11301r++;
                            this.f11302s = i13;
                        }
                        i10 = i13;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i10 - i12) * 2, 16));
                    }
                    sb.append(cArr, i12, i10 - i12);
                    this.f11299p = i10;
                    if (!m(1)) {
                        throw R("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String F() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f11299p
            int r4 = r3 + r2
            int r5 = r6.f11300q
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f11298o
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.e()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f11298o
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f11298o
            int r4 = r6.f11299p
            r1.append(r3, r4, r2)
            int r3 = r6.f11299p
            int r3 = r3 + r2
            r6.f11299p = r3
            r2 = 1
            boolean r2 = r6.m(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f11298o
            int r3 = r6.f11299p
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f11298o
            int r3 = r6.f11299p
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f11299p
            int r2 = r2 + r0
            r6.f11299p = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a.F():java.lang.String");
    }

    private int H() {
        String str;
        String str2;
        int i10;
        char c10 = this.f11298o[this.f11299p];
        if (c10 == 't' || c10 == 'T') {
            i10 = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c10 == 'f' || c10 == 'F') {
            i10 = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c10 != 'n' && c10 != 'N') {
            return 0;
        } else {
            i10 = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f11299p + i11 >= this.f11300q && !m(i11 + 1)) {
                return 0;
            }
            char c11 = this.f11298o[this.f11299p + i11];
            if (c11 != str2.charAt(i11) && c11 != str.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f11299p + length < this.f11300q || m(length + 1)) && q(this.f11298o[this.f11299p + length])) {
            return 0;
        }
        this.f11299p += length;
        this.f11303t = i10;
        return i10;
    }

    private int I() {
        int i10;
        char c10;
        char[] cArr = this.f11298o;
        int i11 = this.f11299p;
        int i12 = this.f11300q;
        int i13 = 0;
        int i14 = 0;
        char c11 = 0;
        boolean z9 = true;
        long j10 = 0;
        boolean z10 = false;
        while (true) {
            if (i11 + i14 == i12) {
                if (i14 == cArr.length) {
                    return i13;
                }
                if (!m(i14 + 1)) {
                    break;
                }
                i11 = this.f11299p;
                i12 = this.f11300q;
            }
            c10 = cArr[i11 + i14];
            if (c10 == '+') {
                i13 = 0;
                if (c11 != 5) {
                    return 0;
                }
            } else if (c10 == 'E' || c10 == 'e') {
                i13 = 0;
                if (c11 != 2 && c11 != 4) {
                    return 0;
                }
                c11 = 5;
                i14++;
            } else {
                if (c10 == '-') {
                    i13 = 0;
                    if (c11 == 0) {
                        c11 = 1;
                        z10 = true;
                    } else if (c11 != 5) {
                        return 0;
                    }
                } else if (c10 == '.') {
                    i13 = 0;
                    if (c11 != 2) {
                        return 0;
                    }
                    c11 = 3;
                } else if (c10 >= '0' && c10 <= '9') {
                    if (c11 == 1 || c11 == 0) {
                        j10 = (long) (-(c10 - '0'));
                        i13 = 0;
                        c11 = 2;
                    } else {
                        if (c11 == 2) {
                            if (j10 == 0) {
                                return 0;
                            }
                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                            int i15 = (j10 > -922337203685477580L ? 1 : (j10 == -922337203685477580L ? 0 : -1));
                            z9 &= i15 > 0 || (i15 == 0 && j11 < j10);
                            j10 = j11;
                        } else if (c11 == 3) {
                            i13 = 0;
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            i13 = 0;
                            c11 = 7;
                        }
                        i13 = 0;
                    }
                }
                i14++;
            }
            c11 = 6;
            i14++;
        }
        if (q(c10)) {
            return 0;
        }
        if (c11 == 2 && z9 && ((j10 != Long.MIN_VALUE || z10) && (j10 != 0 || !z10))) {
            if (!z10) {
                j10 = -j10;
            }
            this.f11304u = j10;
            this.f11299p += i14;
            i10 = 15;
        } else if (c11 != 2 && c11 != 4 && c11 != 7) {
            return 0;
        } else {
            this.f11305v = i14;
            i10 = 16;
        }
        this.f11303t = i10;
        return i10;
    }

    private void J(int i10) {
        int i11 = this.f11308y;
        int[] iArr = this.f11307x;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f11307x = Arrays.copyOf(iArr, i12);
            this.A = Arrays.copyOf(this.A, i12);
            this.f11309z = (String[]) Arrays.copyOf(this.f11309z, i12);
        }
        int[] iArr2 = this.f11307x;
        int i13 = this.f11308y;
        this.f11308y = i13 + 1;
        iArr2[i13] = i10;
    }

    private char K() {
        int i10;
        int i11;
        if (this.f11299p != this.f11300q || m(1)) {
            char[] cArr = this.f11298o;
            int i12 = this.f11299p;
            int i13 = i12 + 1;
            this.f11299p = i13;
            char c10 = cArr[i12];
            if (c10 == 10) {
                this.f11301r++;
                this.f11302s = i13;
            } else if (!(c10 == '\"' || c10 == '\'' || c10 == '/' || c10 == '\\')) {
                if (c10 == 'b') {
                    return 8;
                }
                if (c10 == 'f') {
                    return 12;
                }
                if (c10 == 'n') {
                    return 10;
                }
                if (c10 == 'r') {
                    return 13;
                }
                if (c10 == 't') {
                    return 9;
                }
                if (c10 != 'u') {
                    throw R("Invalid escape sequence");
                } else if (i13 + 4 <= this.f11300q || m(4)) {
                    char c11 = 0;
                    int i14 = this.f11299p;
                    int i15 = i14 + 4;
                    while (i14 < i15) {
                        char c12 = this.f11298o[i14];
                        char c13 = (char) (c11 << 4);
                        if (c12 < '0' || c12 > '9') {
                            if (c12 >= 'a' && c12 <= 'f') {
                                i10 = c12 - 'a';
                            } else if (c12 < 'A' || c12 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f11298o, this.f11299p, 4));
                            } else {
                                i10 = c12 - 'A';
                            }
                            i11 = i10 + 10;
                        } else {
                            i11 = c12 - '0';
                        }
                        c11 = (char) (c13 + i11);
                        i14++;
                    }
                    this.f11299p += 4;
                    return c11;
                } else {
                    throw R("Unterminated escape sequence");
                }
            }
            return c10;
        }
        throw R("Unterminated escape sequence");
    }

    private void M(char c10) {
        char[] cArr = this.f11298o;
        while (true) {
            int i10 = this.f11299p;
            int i11 = this.f11300q;
            while (true) {
                if (i10 < i11) {
                    int i12 = i10 + 1;
                    char c11 = cArr[i10];
                    if (c11 == c10) {
                        this.f11299p = i12;
                        return;
                    } else if (c11 == '\\') {
                        this.f11299p = i12;
                        K();
                        break;
                    } else {
                        if (c11 == 10) {
                            this.f11301r++;
                            this.f11302s = i12;
                        }
                        i10 = i12;
                    }
                } else {
                    this.f11299p = i10;
                    if (!m(1)) {
                        throw R("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean N(String str) {
        int length = str.length();
        while (true) {
            int i10 = 0;
            if (this.f11299p + length > this.f11300q && !m(length)) {
                return false;
            }
            char[] cArr = this.f11298o;
            int i11 = this.f11299p;
            if (cArr[i11] == 10) {
                this.f11301r++;
                this.f11302s = i11 + 1;
            } else {
                while (i10 < length) {
                    if (this.f11298o[this.f11299p + i10] == str.charAt(i10)) {
                        i10++;
                    }
                }
                return true;
            }
            this.f11299p++;
        }
    }

    private void O() {
        char c10;
        do {
            if (this.f11299p < this.f11300q || m(1)) {
                char[] cArr = this.f11298o;
                int i10 = this.f11299p;
                int i11 = i10 + 1;
                this.f11299p = i11;
                c10 = cArr[i10];
                if (c10 == 10) {
                    this.f11301r++;
                    this.f11302s = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void P() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f11299p
            int r2 = r1 + r0
            int r3 = r4.f11300q
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f11298o
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.e()
        L_0x004b:
            int r1 = r4.f11299p
            int r1 = r1 + r0
            r4.f11299p = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f11299p = r1
            r0 = 1
            boolean r0 = r4.m(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a.P():void");
    }

    private IOException R(String str) {
        throw new d(str + r());
    }

    private void e() {
        if (!this.f11297n) {
            throw R("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void g() {
        A(true);
        int i10 = this.f11299p - 1;
        this.f11299p = i10;
        if (i10 + 5 <= this.f11300q || m(5)) {
            char[] cArr = this.f11298o;
            if (cArr[i10] == ')' && cArr[i10 + 1] == ']' && cArr[i10 + 2] == '}' && cArr[i10 + 3] == '\'' && cArr[i10 + 4] == 10) {
                this.f11299p += 5;
            }
        }
    }

    private boolean m(int i10) {
        int i11;
        int i12;
        char[] cArr = this.f11298o;
        int i13 = this.f11302s;
        int i14 = this.f11299p;
        this.f11302s = i13 - i14;
        int i15 = this.f11300q;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f11300q = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f11300q = 0;
        }
        this.f11299p = 0;
        do {
            Reader reader = this.f11296m;
            int i17 = this.f11300q;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f11300q + read;
            this.f11300q = i11;
            if (this.f11301r == 0 && (i12 = this.f11302s) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f11299p++;
                this.f11302s = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    private boolean q(char c10) {
        if (c10 == 9 || c10 == 10 || c10 == 12 || c10 == 13 || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (!(c10 == '/' || c10 == '=')) {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    public void C() {
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 7) {
            this.f11303t = 0;
            int[] iArr = this.A;
            int i11 = this.f11308y - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + G() + r());
    }

    public String E() {
        String str;
        char c10;
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 10) {
            str = F();
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else if (i10 == 9) {
                c10 = '\"';
            } else if (i10 == 11) {
                str = this.f11306w;
                this.f11306w = null;
            } else if (i10 == 15) {
                str = Long.toString(this.f11304u);
            } else if (i10 == 16) {
                str = new String(this.f11298o, this.f11299p, this.f11305v);
                this.f11299p += this.f11305v;
            } else {
                throw new IllegalStateException("Expected a string but was " + G() + r());
            }
            str = D(c10);
        }
        this.f11303t = 0;
        int[] iArr = this.A;
        int i11 = this.f11308y - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public b G() {
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void L(boolean z9) {
        this.f11297n = z9;
    }

    public void Q() {
        char c10;
        int i10 = 0;
        do {
            int i11 = this.f11303t;
            if (i11 == 0) {
                i11 = h();
            }
            if (i11 == 3) {
                J(1);
            } else if (i11 == 1) {
                J(3);
            } else if (i11 == 4 || i11 == 2) {
                this.f11308y--;
                i10--;
                this.f11303t = 0;
            } else if (i11 == 14 || i11 == 10) {
                P();
                this.f11303t = 0;
            } else {
                if (i11 == 8 || i11 == 12) {
                    c10 = '\'';
                } else if (i11 == 9 || i11 == 13) {
                    c10 = '\"';
                } else {
                    if (i11 == 16) {
                        this.f11299p += this.f11305v;
                    }
                    this.f11303t = 0;
                }
                M(c10);
                this.f11303t = 0;
            }
            i10++;
            this.f11303t = 0;
        } while (i10 != 0);
        int[] iArr = this.A;
        int i12 = this.f11308y;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.f11309z[i12 - 1] = "null";
    }

    public void a() {
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 3) {
            J(1);
            this.A[this.f11308y - 1] = 0;
            this.f11303t = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + G() + r());
    }

    public void b() {
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 1) {
            J(3);
            this.f11303t = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + G() + r());
    }

    public void close() {
        this.f11303t = 0;
        this.f11307x[0] = 8;
        this.f11308y = 1;
        this.f11296m.close();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int h() {
        /*
            r15 = this;
            int[] r0 = r15.f11307x
            int r1 = r15.f11308y
            int r2 = r1 + -1
            r2 = r0[r2]
            r3 = 8
            r4 = 39
            r5 = 34
            r6 = 93
            r7 = 3
            r8 = 7
            r9 = 59
            r10 = 44
            r11 = 4
            r12 = 2
            r13 = 1
            if (r2 != r13) goto L_0x0020
            int r1 = r1 - r13
            r0[r1] = r12
            goto L_0x00a2
        L_0x0020:
            if (r2 != r12) goto L_0x003a
            int r0 = r15.A(r13)
            if (r0 == r10) goto L_0x00a2
            if (r0 == r9) goto L_0x0036
            if (r0 != r6) goto L_0x002f
            r15.f11303t = r11
            return r11
        L_0x002f:
            java.lang.String r0 = "Unterminated array"
            java.io.IOException r0 = r15.R(r0)
            throw r0
        L_0x0036:
            r15.e()
            goto L_0x00a2
        L_0x003a:
            r14 = 5
            if (r2 == r7) goto L_0x0117
            if (r2 != r14) goto L_0x0041
            goto L_0x0117
        L_0x0041:
            if (r2 != r11) goto L_0x0076
            int r1 = r1 - r13
            r0[r1] = r14
            int r0 = r15.A(r13)
            r1 = 58
            if (r0 == r1) goto L_0x00a2
            r1 = 61
            if (r0 != r1) goto L_0x006f
            r15.e()
            int r0 = r15.f11299p
            int r1 = r15.f11300q
            if (r0 < r1) goto L_0x0061
            boolean r0 = r15.m(r13)
            if (r0 == 0) goto L_0x00a2
        L_0x0061:
            char[] r0 = r15.f11298o
            int r1 = r15.f11299p
            char r0 = r0[r1]
            r14 = 62
            if (r0 != r14) goto L_0x00a2
            int r1 = r1 + r13
            r15.f11299p = r1
            goto L_0x00a2
        L_0x006f:
            java.lang.String r0 = "Expected ':'"
            java.io.IOException r0 = r15.R(r0)
            throw r0
        L_0x0076:
            r0 = 6
            if (r2 != r0) goto L_0x0088
            boolean r0 = r15.f11297n
            if (r0 == 0) goto L_0x0080
            r15.g()
        L_0x0080:
            int[] r0 = r15.f11307x
            int r1 = r15.f11308y
            int r1 = r1 - r13
            r0[r1] = r8
            goto L_0x00a2
        L_0x0088:
            if (r2 != r8) goto L_0x00a0
            r0 = 0
            int r0 = r15.A(r0)
            r1 = -1
            if (r0 != r1) goto L_0x0097
            r0 = 17
        L_0x0094:
            r15.f11303t = r0
            return r0
        L_0x0097:
            r15.e()
            int r0 = r15.f11299p
            int r0 = r0 - r13
            r15.f11299p = r0
            goto L_0x00a2
        L_0x00a0:
            if (r2 == r3) goto L_0x010f
        L_0x00a2:
            int r0 = r15.A(r13)
            if (r0 == r5) goto L_0x010c
            if (r0 == r4) goto L_0x0106
            if (r0 == r10) goto L_0x00ef
            if (r0 == r9) goto L_0x00ef
            r1 = 91
            if (r0 == r1) goto L_0x00ec
            if (r0 == r6) goto L_0x00e7
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L_0x00e4
            int r0 = r15.f11299p
            int r0 = r0 - r13
            r15.f11299p = r0
            int r0 = r15.H()
            if (r0 == 0) goto L_0x00c4
            return r0
        L_0x00c4:
            int r0 = r15.I()
            if (r0 == 0) goto L_0x00cb
            return r0
        L_0x00cb:
            char[] r0 = r15.f11298o
            int r1 = r15.f11299p
            char r0 = r0[r1]
            boolean r0 = r15.q(r0)
            if (r0 == 0) goto L_0x00dd
            r15.e()
            r0 = 10
            goto L_0x0094
        L_0x00dd:
            java.lang.String r0 = "Expected value"
            java.io.IOException r0 = r15.R(r0)
            throw r0
        L_0x00e4:
            r15.f11303t = r13
            return r13
        L_0x00e7:
            if (r2 != r13) goto L_0x00ef
            r15.f11303t = r11
            return r11
        L_0x00ec:
            r15.f11303t = r7
            return r7
        L_0x00ef:
            if (r2 == r13) goto L_0x00fb
            if (r2 != r12) goto L_0x00f4
            goto L_0x00fb
        L_0x00f4:
            java.lang.String r0 = "Unexpected value"
            java.io.IOException r0 = r15.R(r0)
            throw r0
        L_0x00fb:
            r15.e()
            int r0 = r15.f11299p
            int r0 = r0 - r13
            r15.f11299p = r0
            r15.f11303t = r8
            return r8
        L_0x0106:
            r15.e()
            r15.f11303t = r3
            return r3
        L_0x010c:
            r0 = 9
            goto L_0x0094
        L_0x010f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L_0x0117:
            int r1 = r1 - r13
            r0[r1] = r11
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 != r14) goto L_0x0135
            int r1 = r15.A(r13)
            if (r1 == r10) goto L_0x0135
            if (r1 == r9) goto L_0x0132
            if (r1 != r0) goto L_0x012b
            r15.f11303t = r12
            return r12
        L_0x012b:
            java.lang.String r0 = "Unterminated object"
            java.io.IOException r0 = r15.R(r0)
            throw r0
        L_0x0132:
            r15.e()
        L_0x0135:
            int r1 = r15.A(r13)
            if (r1 == r5) goto L_0x016a
            if (r1 == r4) goto L_0x0163
            java.lang.String r3 = "Expected name"
            if (r1 == r0) goto L_0x0159
            r15.e()
            int r0 = r15.f11299p
            int r0 = r0 - r13
            r15.f11299p = r0
            char r0 = (char) r1
            boolean r0 = r15.q(r0)
            if (r0 == 0) goto L_0x0154
            r0 = 14
            goto L_0x0094
        L_0x0154:
            java.io.IOException r0 = r15.R(r3)
            throw r0
        L_0x0159:
            if (r2 == r14) goto L_0x015e
            r15.f11303t = r12
            return r12
        L_0x015e:
            java.io.IOException r0 = r15.R(r3)
            throw r0
        L_0x0163:
            r15.e()
            r0 = 12
            goto L_0x0094
        L_0x016a:
            r0 = 13
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.a.h():int");
    }

    public void k() {
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 4) {
            int i11 = this.f11308y - 1;
            this.f11308y = i11;
            int[] iArr = this.A;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f11303t = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + G() + r());
    }

    public void l() {
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 2) {
            int i11 = this.f11308y - 1;
            this.f11308y = i11;
            this.f11309z[i11] = null;
            int[] iArr = this.A;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f11303t = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + G() + r());
    }

    public String n() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i10 = this.f11308y;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f11307x[i11];
            if (i12 == 1 || i12 == 2) {
                sb.append('[');
                sb.append(this.A[i11]);
                sb.append(']');
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb.append('.');
                String[] strArr = this.f11309z;
                if (strArr[i11] != null) {
                    sb.append(strArr[i11]);
                }
            }
        }
        return sb.toString();
    }

    public boolean o() {
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        return (i10 == 2 || i10 == 4) ? false : true;
    }

    public final boolean p() {
        return this.f11297n;
    }

    /* access modifiers changed from: package-private */
    public String r() {
        return " at line " + (this.f11301r + 1) + " column " + ((this.f11299p - this.f11302s) + 1) + " path " + n();
    }

    public boolean t() {
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 5) {
            this.f11303t = 0;
            int[] iArr = this.A;
            int i11 = this.f11308y - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f11303t = 0;
            int[] iArr2 = this.A;
            int i12 = this.f11308y - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + G() + r());
        }
    }

    public String toString() {
        return getClass().getSimpleName() + r();
    }

    public double u() {
        String str;
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 15) {
            this.f11303t = 0;
            int[] iArr = this.A;
            int i11 = this.f11308y - 1;
            iArr[i11] = iArr[i11] + 1;
            return (double) this.f11304u;
        }
        if (i10 == 16) {
            this.f11306w = new String(this.f11298o, this.f11299p, this.f11305v);
            this.f11299p += this.f11305v;
        } else {
            if (i10 == 8 || i10 == 9) {
                str = D(i10 == 8 ? '\'' : '\"');
            } else if (i10 == 10) {
                str = F();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + G() + r());
            }
            this.f11306w = str;
        }
        this.f11303t = 11;
        double parseDouble = Double.parseDouble(this.f11306w);
        if (this.f11297n || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f11306w = null;
            this.f11303t = 0;
            int[] iArr2 = this.A;
            int i12 = this.f11308y - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        throw new d("JSON forbids NaN and infinities: " + parseDouble + r());
    }

    public int w() {
        String D;
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 15) {
            long j10 = this.f11304u;
            int i11 = (int) j10;
            if (j10 == ((long) i11)) {
                this.f11303t = 0;
                int[] iArr = this.A;
                int i12 = this.f11308y - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f11304u + r());
        }
        if (i10 == 16) {
            this.f11306w = new String(this.f11298o, this.f11299p, this.f11305v);
            this.f11299p += this.f11305v;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                D = F();
            } else {
                D = D(i10 == 8 ? '\'' : '\"');
            }
            this.f11306w = D;
            try {
                int parseInt = Integer.parseInt(this.f11306w);
                this.f11303t = 0;
                int[] iArr2 = this.A;
                int i13 = this.f11308y - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + G() + r());
        }
        this.f11303t = 11;
        double parseDouble = Double.parseDouble(this.f11306w);
        int i14 = (int) parseDouble;
        if (((double) i14) == parseDouble) {
            this.f11306w = null;
            this.f11303t = 0;
            int[] iArr3 = this.A;
            int i15 = this.f11308y - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f11306w + r());
    }

    public long y() {
        String D;
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 15) {
            this.f11303t = 0;
            int[] iArr = this.A;
            int i11 = this.f11308y - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f11304u;
        }
        if (i10 == 16) {
            this.f11306w = new String(this.f11298o, this.f11299p, this.f11305v);
            this.f11299p += this.f11305v;
        } else if (i10 == 8 || i10 == 9 || i10 == 10) {
            if (i10 == 10) {
                D = F();
            } else {
                D = D(i10 == 8 ? '\'' : '\"');
            }
            this.f11306w = D;
            try {
                long parseLong = Long.parseLong(this.f11306w);
                this.f11303t = 0;
                int[] iArr2 = this.A;
                int i12 = this.f11308y - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + G() + r());
        }
        this.f11303t = 11;
        double parseDouble = Double.parseDouble(this.f11306w);
        long j10 = (long) parseDouble;
        if (((double) j10) == parseDouble) {
            this.f11306w = null;
            this.f11303t = 0;
            int[] iArr3 = this.A;
            int i13 = this.f11308y - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f11306w + r());
    }

    public String z() {
        String str;
        char c10;
        int i10 = this.f11303t;
        if (i10 == 0) {
            i10 = h();
        }
        if (i10 == 14) {
            str = F();
        } else {
            if (i10 == 12) {
                c10 = '\'';
            } else if (i10 == 13) {
                c10 = '\"';
            } else {
                throw new IllegalStateException("Expected a name but was " + G() + r());
            }
            str = D(c10);
        }
        this.f11303t = 0;
        this.f11309z[this.f11308y - 1] = str;
        return str;
    }
}
