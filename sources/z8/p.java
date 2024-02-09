package z8;

import g8.l;
import h8.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;

class p extends o {

    static final class a extends m implements r8.p<CharSequence, Integer, l<? extends Integer, ? extends Integer>> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ char[] f13634m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f13635n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z9) {
            super(2);
            this.f13634m = cArr;
            this.f13635n = z9;
        }

        public final l<Integer, Integer> b(CharSequence charSequence, int i10) {
            kotlin.jvm.internal.l.e(charSequence, "$this$$receiver");
            int E = p.E(charSequence, this.f13634m, i10, this.f13635n);
            if (E < 0) {
                return null;
            }
            return g8.p.a(Integer.valueOf(E), 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class b extends m implements r8.p<CharSequence, Integer, l<? extends Integer, ? extends Integer>> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ List<String> f13636m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f13637n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z9) {
            super(2);
            this.f13636m = list;
            this.f13637n = z9;
        }

        public final l<Integer, Integer> b(CharSequence charSequence, int i10) {
            kotlin.jvm.internal.l.e(charSequence, "$this$$receiver");
            l s9 = p.v(charSequence, this.f13636m, i10, this.f13637n, false);
            if (s9 != null) {
                return g8.p.a(s9.c(), Integer.valueOf(((String) s9.d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    static final class c extends m implements r8.l<w8.c, String> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ CharSequence f13638m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f13638m = charSequence;
        }

        /* renamed from: b */
        public final String invoke(w8.c cVar) {
            kotlin.jvm.internal.l.e(cVar, "it");
            return p.c0(this.f13638m, cVar);
        }
    }

    private static final int A(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z9, boolean z10) {
        w8.a cVar = !z10 ? new w8.c(i.a(i10, 0), i.c(i11, charSequence.length())) : i.g(i.c(i10, x(charSequence)), i.a(i11, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int c10 = cVar.c();
            int d10 = cVar.d();
            int f10 = cVar.f();
            if ((f10 <= 0 || c10 > d10) && (f10 >= 0 || d10 > c10)) {
                return -1;
            }
            while (true) {
                if (S(charSequence2, 0, charSequence, c10, charSequence2.length(), z9)) {
                    return c10;
                }
                if (c10 == d10) {
                    return -1;
                }
                c10 += f10;
            }
        } else {
            int c11 = cVar.c();
            int d11 = cVar.d();
            int f11 = cVar.f();
            if ((f11 <= 0 || c11 > d11) && (f11 >= 0 || d11 > c11)) {
                return -1;
            }
            while (true) {
                if (o.l((String) charSequence2, 0, (String) charSequence, c11, charSequence2.length(), z9)) {
                    return c11;
                }
                if (c11 == d11) {
                    return -1;
                }
                c11 += f11;
            }
        }
    }

    static /* synthetic */ int B(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z9, boolean z10, int i12, Object obj) {
        return A(charSequence, charSequence2, i10, i11, z9, (i12 & 16) != 0 ? false : z10);
    }

    public static /* synthetic */ int C(CharSequence charSequence, char c10, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return y(charSequence, c10, i10, z9);
    }

    public static /* synthetic */ int D(CharSequence charSequence, String str, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return z(charSequence, str, i10, z9);
    }

    public static final int E(CharSequence charSequence, char[] cArr, int i10, boolean z9) {
        boolean z10;
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(cArr, "chars");
        if (z9 || cArr.length != 1 || !(charSequence instanceof String)) {
            a0 g10 = new w8.c(i.a(i10, 0), x(charSequence)).iterator();
            while (g10.hasNext()) {
                int b10 = g10.b();
                char charAt = charSequence.charAt(b10);
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = false;
                        continue;
                        break;
                    } else if (b.d(cArr[i11], charAt, z9)) {
                        z10 = true;
                        continue;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z10) {
                    return b10;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(j.o(cArr), i10);
    }

    public static final int F(CharSequence charSequence, char c10, int i10, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (!z9 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c10, i10);
        }
        return J(charSequence, new char[]{c10}, i10, z9);
    }

    public static final int G(CharSequence charSequence, String str, int i10, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(str, "string");
        return (z9 || !(charSequence instanceof String)) ? A(charSequence, str, i10, 0, z9, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    public static /* synthetic */ int H(CharSequence charSequence, char c10, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = x(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return F(charSequence, c10, i10, z9);
    }

    public static /* synthetic */ int I(CharSequence charSequence, String str, int i10, boolean z9, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = x(charSequence);
        }
        if ((i11 & 4) != 0) {
            z9 = false;
        }
        return G(charSequence, str, i10, z9);
    }

    public static final int J(CharSequence charSequence, char[] cArr, int i10, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(cArr, "chars");
        if (z9 || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int c10 = i.c(i10, x(charSequence)); -1 < c10; c10--) {
                char charAt = charSequence.charAt(c10);
                int length = cArr.length;
                boolean z10 = false;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (b.d(cArr[i11], charAt, z9)) {
                        z10 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (z10) {
                    return c10;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(j.o(cArr), i10);
    }

    public static final y8.b<String> K(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return Z(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    public static final List<String> L(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return h.e(K(charSequence));
    }

    public static final CharSequence M(CharSequence charSequence, int i10, char c10) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        } else if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb = new StringBuilder(i10);
            a0 g10 = new w8.c(1, i10 - charSequence.length()).iterator();
            while (g10.hasNext()) {
                g10.b();
                sb.append(c10);
            }
            sb.append(charSequence);
            return sb;
        }
    }

    public static String N(String str, int i10, char c10) {
        kotlin.jvm.internal.l.e(str, "<this>");
        return M(str, i10, c10).toString();
    }

    private static final y8.b<w8.c> O(CharSequence charSequence, char[] cArr, int i10, boolean z9, int i11) {
        U(i11);
        return new d(charSequence, i10, i11, new a(cArr, z9));
    }

    private static final y8.b<w8.c> P(CharSequence charSequence, String[] strArr, int i10, boolean z9, int i11) {
        U(i11);
        return new d(charSequence, i10, i11, new b(i.b(strArr), z9));
    }

    static /* synthetic */ y8.b Q(CharSequence charSequence, char[] cArr, int i10, boolean z9, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return O(charSequence, cArr, i10, z9, i11);
    }

    static /* synthetic */ y8.b R(CharSequence charSequence, String[] strArr, int i10, boolean z9, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z9 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return P(charSequence, strArr, i10, z9, i11);
    }

    public static final boolean S(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b.d(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z9)) {
                return false;
            }
        }
        return true;
    }

    public static String T(String str, CharSequence charSequence) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(charSequence, "prefix");
        if (!b0(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final void U(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
        }
    }

    public static final List<String> V(CharSequence charSequence, char[] cArr, boolean z9, int i10) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(cArr, "delimiters");
        if (cArr.length == 1) {
            return W(charSequence, String.valueOf(cArr[0]), z9, i10);
        }
        Iterable<w8.c> c10 = h.c(Q(charSequence, cArr, 0, z9, i10, 2, (Object) null));
        ArrayList arrayList = new ArrayList(o.i(c10, 10));
        for (w8.c c02 : c10) {
            arrayList.add(c0(charSequence, c02));
        }
        return arrayList;
    }

    private static final List<String> W(CharSequence charSequence, String str, boolean z9, int i10) {
        U(i10);
        int i11 = 0;
        int z10 = z(charSequence, str, 0, z9);
        if (z10 == -1 || i10 == 1) {
            return m.b(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11) {
            i12 = i.c(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, z10).toString());
            i11 = str.length() + z10;
            if ((z11 && arrayList.size() == i10 - 1) || (z10 = z(charSequence, str, i11, z9)) == -1) {
                arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i11, z10).toString());
            i11 = str.length() + z10;
            break;
        } while ((z10 = z(charSequence, str, i11, z9)) == -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List X(CharSequence charSequence, char[] cArr, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return V(charSequence, cArr, z9, i10);
    }

    public static final y8.b<String> Y(CharSequence charSequence, String[] strArr, boolean z9, int i10) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(strArr, "delimiters");
        return h.d(R(charSequence, strArr, 0, z9, i10, 2, (Object) null), new c(charSequence));
    }

    public static /* synthetic */ y8.b Z(CharSequence charSequence, String[] strArr, boolean z9, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z9 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Y(charSequence, strArr, z9, i10);
    }

    public static final boolean a0(CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(charSequence2, "prefix");
        if (!z9 && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return o.r((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return S(charSequence, 0, charSequence2, 0, charSequence2.length(), z9);
    }

    public static /* synthetic */ boolean b0(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return a0(charSequence, charSequence2, z9);
    }

    public static final String c0(CharSequence charSequence, w8.c cVar) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(cVar, "range");
        return charSequence.subSequence(cVar.o().intValue(), cVar.l().intValue() + 1).toString();
    }

    public static final String d0(String str, char c10, String str2) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(str2, "missingDelimiterValue");
        int C = C(str, c10, 0, false, 6, (Object) null);
        if (C == -1) {
            return str2;
        }
        String substring = str.substring(C + 1, str.length());
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String e0(String str, String str2, String str3) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(str2, "delimiter");
        kotlin.jvm.internal.l.e(str3, "missingDelimiterValue");
        int D = D(str, str2, 0, false, 6, (Object) null);
        if (D == -1) {
            return str3;
        }
        String substring = str.substring(D + str2.length(), str.length());
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String f0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return d0(str, c10, str2);
    }

    public static /* synthetic */ String g0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return e0(str, str2, str3);
    }

    public static String h0(String str, char c10, String str2) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(str2, "missingDelimiterValue");
        int H = H(str, c10, 0, false, 6, (Object) null);
        if (H == -1) {
            return str2;
        }
        String substring = str.substring(H + 1, str.length());
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String i0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return h0(str, c10, str2);
    }

    public static final String j0(String str, char c10, String str2) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(str2, "missingDelimiterValue");
        int C = C(str, c10, 0, false, 6, (Object) null);
        if (C == -1) {
            return str2;
        }
        String substring = str.substring(0, C);
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String k0(String str, String str2, String str3) {
        kotlin.jvm.internal.l.e(str, "<this>");
        kotlin.jvm.internal.l.e(str2, "delimiter");
        kotlin.jvm.internal.l.e(str3, "missingDelimiterValue");
        int D = D(str, str2, 0, false, 6, (Object) null);
        if (D == -1) {
            return str3;
        }
        String substring = str.substring(0, D);
        kotlin.jvm.internal.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String l0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return j0(str, c10, str2);
    }

    public static /* synthetic */ String m0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return k0(str, str2, str3);
    }

    public static CharSequence n0(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z9 = false;
        while (i10 <= length) {
            boolean c10 = a.c(charSequence.charAt(!z9 ? i10 : length));
            if (!z9) {
                if (!c10) {
                    z9 = true;
                } else {
                    i10++;
                }
            } else if (!c10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final boolean t(CharSequence charSequence, CharSequence charSequence2, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (D(charSequence, (String) charSequence2, 0, z9, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (B(charSequence, charSequence2, 0, charSequence.length(), z9, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean u(CharSequence charSequence, CharSequence charSequence2, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = false;
        }
        return t(charSequence, charSequence2, z9);
    }

    /* access modifiers changed from: private */
    public static final l<Integer, String> v(CharSequence charSequence, Collection<String> collection, int i10, boolean z9, boolean z10) {
        int i11;
        T t9;
        String str;
        T t10;
        if (z9 || collection.size() != 1) {
            w8.a cVar = !z10 ? new w8.c(i.a(i10, 0), charSequence.length()) : i.g(i.c(i10, x(charSequence)), 0);
            if (charSequence instanceof String) {
                i11 = cVar.c();
                int d10 = cVar.d();
                int f10 = cVar.f();
                if ((f10 > 0 && i11 <= d10) || (f10 < 0 && d10 <= i11)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t10 = null;
                                break;
                            }
                            t10 = it.next();
                            String str2 = (String) t10;
                            if (o.l(str2, 0, (String) charSequence, i11, str2.length(), z9)) {
                                break;
                            }
                        }
                        str = (String) t10;
                        if (str == null) {
                            if (i11 == d10) {
                                break;
                            }
                            i11 += f10;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int c10 = cVar.c();
            int d11 = cVar.d();
            int f11 = cVar.f();
            if ((f11 > 0 && c10 <= d11) || (f11 < 0 && d11 <= c10)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t9 = null;
                            break;
                        }
                        t9 = it2.next();
                        String str3 = (String) t9;
                        if (S(str3, 0, charSequence, i11, str3.length(), z9)) {
                            break;
                        }
                    }
                    str = (String) t9;
                    if (str == null) {
                        if (i11 == d11) {
                            break;
                        }
                        c10 = i11 + f11;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return g8.p.a(Integer.valueOf(i11), str);
        }
        String str4 = (String) v.v(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i12 = i10;
        int D = !z10 ? D(charSequence2, str5, i12, false, 4, (Object) null) : I(charSequence2, str5, i12, false, 4, (Object) null);
        if (D < 0) {
            return null;
        }
        return g8.p.a(Integer.valueOf(D), str4);
    }

    public static final w8.c w(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return new w8.c(0, charSequence.length() - 1);
    }

    public static final int x(CharSequence charSequence) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int y(CharSequence charSequence, char c10, int i10, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        if (!z9 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c10, i10);
        }
        return E(charSequence, new char[]{c10}, i10, z9);
    }

    public static final int z(CharSequence charSequence, String str, int i10, boolean z9) {
        kotlin.jvm.internal.l.e(charSequence, "<this>");
        kotlin.jvm.internal.l.e(str, "string");
        if (!z9 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i10);
        }
        return B(charSequence, str, i10, charSequence.length(), z9, false, 16, (Object) null);
    }
}
