package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    static final c f1628d;

    /* renamed from: e  reason: collision with root package name */
    private static final String f1629e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    private static final String f1630f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    static final a f1631g;

    /* renamed from: h  reason: collision with root package name */
    static final a f1632h;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f1633a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1634b;

    /* renamed from: c  reason: collision with root package name */
    private final c f1635c;

    /* renamed from: androidx.core.text.a$a  reason: collision with other inner class name */
    public static final class C0028a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1636a;

        /* renamed from: b  reason: collision with root package name */
        private int f1637b;

        /* renamed from: c  reason: collision with root package name */
        private c f1638c;

        public C0028a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z9) {
            return z9 ? a.f1632h : a.f1631g;
        }

        private void c(boolean z9) {
            this.f1636a = z9;
            this.f1638c = a.f1628d;
            this.f1637b = 2;
        }

        public a a() {
            return (this.f1637b == 2 && this.f1638c == a.f1628d) ? b(this.f1636a) : new a(this.f1636a, this.f1637b, this.f1638c);
        }
    }

    private static class b {

        /* renamed from: f  reason: collision with root package name */
        private static final byte[] f1639f = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        private final CharSequence f1640a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f1641b;

        /* renamed from: c  reason: collision with root package name */
        private final int f1642c;

        /* renamed from: d  reason: collision with root package name */
        private int f1643d;

        /* renamed from: e  reason: collision with root package name */
        private char f1644e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f1639f[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z9) {
            this.f1640a = charSequence;
            this.f1641b = z9;
            this.f1642c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f1639f[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char charAt;
            int i10 = this.f1643d;
            do {
                int i11 = this.f1643d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1640a;
                int i12 = i11 - 1;
                this.f1643d = i12;
                charAt = charSequence.charAt(i12);
                this.f1644e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f1643d = i10;
            this.f1644e = ';';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i10 = this.f1643d;
                if (i10 >= this.f1642c) {
                    return 12;
                }
                CharSequence charSequence = this.f1640a;
                this.f1643d = i10 + 1;
                charAt = charSequence.charAt(i10);
                this.f1644e = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char charAt;
            int i10 = this.f1643d;
            while (true) {
                int i11 = this.f1643d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1640a;
                int i12 = i11 - 1;
                this.f1643d = i12;
                char charAt2 = charSequence.charAt(i12);
                this.f1644e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.f1643d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f1640a;
                        int i14 = i13 - 1;
                        this.f1643d = i14;
                        charAt = charSequence2.charAt(i14);
                        this.f1644e = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f1643d = i10;
            this.f1644e = '>';
            return 13;
        }

        private byte i() {
            char charAt;
            int i10 = this.f1643d;
            while (true) {
                int i11 = this.f1643d;
                if (i11 < this.f1642c) {
                    CharSequence charSequence = this.f1640a;
                    this.f1643d = i11 + 1;
                    char charAt2 = charSequence.charAt(i11);
                    this.f1644e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i12 = this.f1643d;
                            if (i12 >= this.f1642c) {
                                break;
                            }
                            CharSequence charSequence2 = this.f1640a;
                            this.f1643d = i12 + 1;
                            charAt = charSequence2.charAt(i12);
                            this.f1644e = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f1643d = i10;
                    this.f1644e = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte a() {
            char charAt = this.f1640a.charAt(this.f1643d - 1);
            this.f1644e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f1640a, this.f1643d);
                this.f1643d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f1643d--;
            byte c10 = c(this.f1644e);
            if (!this.f1641b) {
                return c10;
            }
            char c11 = this.f1644e;
            return c11 == '>' ? h() : c11 == ';' ? f() : c10;
        }

        /* access modifiers changed from: package-private */
        public byte b() {
            char charAt = this.f1640a.charAt(this.f1643d);
            this.f1644e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f1640a, this.f1643d);
                this.f1643d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f1643d++;
            byte c10 = c(this.f1644e);
            if (!this.f1641b) {
                return c10;
            }
            char c11 = this.f1644e;
            return c11 == '<' ? i() : c11 == '&' ? g() : c10;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            this.f1643d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f1643d < this.f1642c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f1643d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                }
                i12--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int e() {
            /*
                r7 = this;
                int r0 = r7.f1642c
                r7.f1643d = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f1643d
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.a.b.e():int");
        }
    }

    static {
        c cVar = d.f1660c;
        f1628d = cVar;
        f1631g = new a(false, 2, cVar);
        f1632h = new a(true, 2, cVar);
    }

    a(boolean z9, int i10, c cVar) {
        this.f1633a = z9;
        this.f1634b = i10;
        this.f1635c = cVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0028a().a();
    }

    static boolean e(Locale locale) {
        return e.a(locale) == 1;
    }

    private String f(CharSequence charSequence, c cVar) {
        boolean a10 = cVar.a(charSequence, 0, charSequence.length());
        return (this.f1633a || (!a10 && b(charSequence) != 1)) ? this.f1633a ? (!a10 || b(charSequence) == -1) ? f1630f : "" : "" : f1629e;
    }

    private String g(CharSequence charSequence, c cVar) {
        boolean a10 = cVar.a(charSequence, 0, charSequence.length());
        return (this.f1633a || (!a10 && a(charSequence) != 1)) ? this.f1633a ? (!a10 || a(charSequence) == -1) ? f1630f : "" : "" : f1629e;
    }

    public boolean d() {
        return (this.f1634b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f1635c, true);
    }

    public CharSequence i(CharSequence charSequence, c cVar, boolean z9) {
        if (charSequence == null) {
            return null;
        }
        boolean a10 = cVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z9) {
            spannableStringBuilder.append(g(charSequence, a10 ? d.f1659b : d.f1658a));
        }
        if (a10 != this.f1633a) {
            spannableStringBuilder.append(a10 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z9) {
            spannableStringBuilder.append(f(charSequence, a10 ? d.f1659b : d.f1658a));
        }
        return spannableStringBuilder;
    }
}
