package a9;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import w8.f;

public final class b implements Comparable<b> {

    /* renamed from: n  reason: collision with root package name */
    public static final a f50n = new a((g) null);

    /* renamed from: o  reason: collision with root package name */
    private static final long f51o = m(0);

    /* renamed from: p  reason: collision with root package name */
    private static final long f52p = d.e(4611686018427387903L);

    /* renamed from: q  reason: collision with root package name */
    private static final long f53q = d.e(-4611686018427387903L);

    /* renamed from: m  reason: collision with root package name */
    private final long f54m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    private /* synthetic */ b(long j10) {
        this.f54m = j10;
    }

    private static final e A(long j10) {
        return F(j10) ? e.NANOSECONDS : e.MILLISECONDS;
    }

    private static final long B(long j10) {
        return j10 >> 1;
    }

    public static int C(long j10) {
        return a.a(j10);
    }

    public static final boolean D(long j10) {
        return !G(j10);
    }

    private static final boolean E(long j10) {
        return (((int) j10) & 1) == 1;
    }

    private static final boolean F(long j10) {
        return (((int) j10) & 1) == 0;
    }

    public static final boolean G(long j10) {
        return j10 == f52p || j10 == f53q;
    }

    public static final boolean H(long j10) {
        return j10 < 0;
    }

    public static final boolean I(long j10) {
        return j10 > 0;
    }

    public static final long J(long j10, e eVar) {
        l.e(eVar, "unit");
        if (j10 == f52p) {
            return Long.MAX_VALUE;
        }
        if (j10 == f53q) {
            return Long.MIN_VALUE;
        }
        return f.a(B(j10), A(j10), eVar);
    }

    public static String K(long j10) {
        boolean z9;
        String str;
        int i10;
        int i11;
        int i12;
        StringBuilder sb;
        long j11;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f52p) {
            return "Infinity";
        }
        if (j10 == f53q) {
            return "-Infinity";
        }
        boolean H = H(j10);
        StringBuilder sb2 = new StringBuilder();
        if (H) {
            sb2.append('-');
        }
        long q9 = q(j10);
        long s9 = s(q9);
        int r9 = r(q9);
        int x9 = x(q9);
        int z10 = z(q9);
        int y9 = y(q9);
        int i13 = 0;
        boolean z11 = s9 != 0;
        boolean z12 = r9 != 0;
        boolean z13 = x9 != 0;
        boolean z14 = (z10 == 0 && y9 == 0) ? false : true;
        if (z11) {
            sb2.append(s9);
            sb2.append('d');
            i13 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i14 = i13 + 1;
            if (i13 > 0) {
                sb2.append(' ');
            }
            sb2.append(r9);
            sb2.append('h');
            i13 = i14;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb2.append(' ');
            }
            sb2.append(x9);
            sb2.append('m');
            i13 = i15;
        }
        if (z14) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb2.append(' ');
            }
            if (z10 != 0 || z11 || z12 || z13) {
                i10 = 9;
                j11 = j10;
                sb = sb2;
                i12 = z10;
                i11 = y9;
                str = "s";
                z9 = false;
            } else {
                if (y9 >= 1000000) {
                    i12 = y9 / 1000000;
                    i11 = y9 % 1000000;
                    i10 = 6;
                    z9 = false;
                    str = "ms";
                } else if (y9 >= 1000) {
                    i12 = y9 / 1000;
                    i11 = y9 % 1000;
                    i10 = 3;
                    z9 = false;
                    str = "us";
                } else {
                    sb2.append(y9);
                    sb2.append("ns");
                    i13 = i16;
                }
                j11 = j10;
                sb = sb2;
            }
            e(j11, sb, i12, i11, i10, str, z9);
            i13 = i16;
        }
        if (H && i13 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        l.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final long L(long j10) {
        return d.d(-B(j10), ((int) j10) & 1);
    }

    private static final void e(long j10, StringBuilder sb, int i10, int i11, int i12, String str, boolean z9) {
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String N = p.N(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = N.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (N.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z9 || i15 >= 3) {
                i15 = ((i15 + 2) / 3) * 3;
            }
            sb.append(N, 0, i15);
            l.d(sb, "this.append(value, startIndex, endIndex)");
        }
        sb.append(str);
    }

    public static final /* synthetic */ b g(long j10) {
        return new b(j10);
    }

    public static int k(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return l.g(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return H(j10) ? -i10 : i10;
    }

    public static long m(long j10) {
        if (c.a()) {
            if (F(j10)) {
                if (!new f(-4611686018426999999L, 4611686018426999999L).g(B(j10))) {
                    throw new AssertionError(B(j10) + " ns is out of nanoseconds range");
                }
            } else if (!new f(-4611686018427387903L, 4611686018427387903L).g(B(j10))) {
                throw new AssertionError(B(j10) + " ms is out of milliseconds range");
            } else if (new f(-4611686018426L, 4611686018426L).g(B(j10))) {
                throw new AssertionError(B(j10) + " ms is denormalized");
            }
        }
        return j10;
    }

    public static boolean n(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).M();
    }

    public static final long q(long j10) {
        return H(j10) ? L(j10) : j10;
    }

    public static final int r(long j10) {
        if (G(j10)) {
            return 0;
        }
        return (int) (t(j10) % ((long) 24));
    }

    public static final long s(long j10) {
        return J(j10, e.DAYS);
    }

    public static final long t(long j10) {
        return J(j10, e.HOURS);
    }

    public static final long u(long j10) {
        return (!E(j10) || !D(j10)) ? J(j10, e.MILLISECONDS) : B(j10);
    }

    public static final long v(long j10) {
        return J(j10, e.MINUTES);
    }

    public static final long w(long j10) {
        return J(j10, e.SECONDS);
    }

    public static final int x(long j10) {
        if (G(j10)) {
            return 0;
        }
        return (int) (v(j10) % ((long) 60));
    }

    public static final int y(long j10) {
        if (G(j10)) {
            return 0;
        }
        boolean E = E(j10);
        long B = B(j10);
        return (int) (E ? d.g(B % ((long) 1000)) : B % ((long) 1000000000));
    }

    public static final int z(long j10) {
        if (G(j10)) {
            return 0;
        }
        return (int) (w(j10) % ((long) 60));
    }

    public final /* synthetic */ long M() {
        return this.f54m;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return i(((b) obj).M());
    }

    public boolean equals(Object obj) {
        return n(this.f54m, obj);
    }

    public int hashCode() {
        return C(this.f54m);
    }

    public int i(long j10) {
        return k(this.f54m, j10);
    }

    public String toString() {
        return K(this.f54m);
    }
}
