package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t1;
import java.util.List;

final class j implements f1 {

    /* renamed from: a  reason: collision with root package name */
    private final i f1971a;

    /* renamed from: b  reason: collision with root package name */
    private int f1972b;

    /* renamed from: c  reason: collision with root package name */
    private int f1973c;

    /* renamed from: d  reason: collision with root package name */
    private int f1974d = 0;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f1975a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.t1$b[] r0 = androidx.datastore.preferences.protobuf.t1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1975a = r0
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f1975a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.j.a.<clinit>():void");
        }
    }

    private j(i iVar) {
        i iVar2 = (i) a0.b(iVar, "input");
        this.f1971a = iVar2;
        iVar2.f1944d = this;
    }

    public static j Q(i iVar) {
        j jVar = iVar.f1944d;
        return jVar != null ? jVar : new j(iVar);
    }

    private Object R(t1.b bVar, Class<?> cls, p pVar) {
        switch (a.f1975a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(r());
            case 2:
                return y();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(d());
            case 5:
                return Integer.valueOf(q());
            case 6:
                return Long.valueOf(h());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(B());
            case 9:
                return Long.valueOf(K());
            case 10:
                return i(cls, pVar);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(u());
            case 13:
                return Integer.valueOf(k());
            case 14:
                return Long.valueOf(m());
            case 15:
                return L();
            case 16:
                return Integer.valueOf(A());
            case 17:
                return Long.valueOf(f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T S(g1<T> g1Var, p pVar) {
        int i10 = this.f1973c;
        this.f1973c = t1.c(t1.a(this.f1972b), 4);
        try {
            T h10 = g1Var.h();
            g1Var.b(h10, this, pVar);
            g1Var.d(h10);
            if (this.f1972b == this.f1973c) {
                return h10;
            }
            throw b0.g();
        } finally {
            this.f1973c = i10;
        }
    }

    private <T> T T(g1<T> g1Var, p pVar) {
        int C = this.f1971a.C();
        i iVar = this.f1971a;
        if (iVar.f1941a < iVar.f1942b) {
            int l10 = iVar.l(C);
            T h10 = g1Var.h();
            this.f1971a.f1941a++;
            g1Var.b(h10, this, pVar);
            g1Var.d(h10);
            this.f1971a.a(0);
            i iVar2 = this.f1971a;
            iVar2.f1941a--;
            iVar2.k(l10);
            return h10;
        }
        throw b0.h();
    }

    private void V(int i10) {
        if (this.f1971a.d() != i10) {
            throw b0.k();
        }
    }

    private void W(int i10) {
        if (t1.b(this.f1972b) != i10) {
            throw b0.d();
        }
    }

    private void X(int i10) {
        if ((i10 & 3) != 0) {
            throw b0.g();
        }
    }

    private void Y(int i10) {
        if ((i10 & 7) != 0) {
            throw b0.g();
        }
    }

    public int A() {
        W(0);
        return this.f1971a.C();
    }

    public int B() {
        W(0);
        return this.f1971a.t();
    }

    public <T> void C(List<T> list, g1<T> g1Var, p pVar) {
        int B;
        if (t1.b(this.f1972b) == 3) {
            int i10 = this.f1972b;
            do {
                list.add(S(g1Var, pVar));
                if (!this.f1971a.e() && this.f1974d == 0) {
                    B = this.f1971a.B();
                } else {
                    return;
                }
            } while (B == i10);
            this.f1974d = B;
            return;
        }
        throw b0.d();
    }

    public boolean D() {
        int i10;
        if (this.f1971a.e() || (i10 = this.f1972b) == this.f1973c) {
            return false;
        }
        return this.f1971a.E(i10);
    }

    public int E() {
        W(5);
        return this.f1971a.v();
    }

    public void F(List<h> list) {
        int B;
        if (t1.b(this.f1972b) == 2) {
            do {
                list.add(y());
                if (!this.f1971a.e()) {
                    B = this.f1971a.B();
                } else {
                    return;
                }
            } while (B == this.f1972b);
            this.f1974d = B;
            return;
        }
        throw b0.d();
    }

    public void G(List<Double> list) {
        int B;
        int B2;
        if (list instanceof m) {
            m mVar = (m) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 1) {
                do {
                    mVar.g(this.f1971a.o());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
            } else if (b10 == 2) {
                int C = this.f1971a.C();
                Y(C);
                int d10 = this.f1971a.d() + C;
                do {
                    mVar.g(this.f1971a.o());
                } while (this.f1971a.d() < d10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 1) {
                do {
                    list.add(Double.valueOf(this.f1971a.o()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
            } else if (b11 == 2) {
                int C2 = this.f1971a.C();
                Y(C2);
                int d11 = this.f1971a.d() + C2;
                do {
                    list.add(Double.valueOf(this.f1971a.o()));
                } while (this.f1971a.d() < d11);
            } else {
                throw b0.d();
            }
        }
    }

    public <T> void H(List<T> list, g1<T> g1Var, p pVar) {
        int B;
        if (t1.b(this.f1972b) == 2) {
            int i10 = this.f1972b;
            do {
                list.add(T(g1Var, pVar));
                if (!this.f1971a.e() && this.f1974d == 0) {
                    B = this.f1971a.B();
                } else {
                    return;
                }
            } while (B == i10);
            this.f1974d = B;
            return;
        }
        throw b0.d();
    }

    public void I(List<Long> list) {
        int i10;
        int B;
        int B2;
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 0) {
                do {
                    i0Var.i(this.f1971a.u());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
                return;
            } else if (b10 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    i0Var.i(this.f1971a.u());
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f1971a.u()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
                return;
            } else if (b11 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    list.add(Long.valueOf(this.f1971a.u()));
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        }
        V(i10);
    }

    public void J(List<Long> list) {
        int B;
        int B2;
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 1) {
                do {
                    i0Var.i(this.f1971a.w());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
            } else if (b10 == 2) {
                int C = this.f1971a.C();
                Y(C);
                int d10 = this.f1971a.d() + C;
                do {
                    i0Var.i(this.f1971a.w());
                } while (this.f1971a.d() < d10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f1971a.w()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
            } else if (b11 == 2) {
                int C2 = this.f1971a.C();
                Y(C2);
                int d11 = this.f1971a.d() + C2;
                do {
                    list.add(Long.valueOf(this.f1971a.w()));
                } while (this.f1971a.d() < d11);
            } else {
                throw b0.d();
            }
        }
    }

    public long K() {
        W(0);
        return this.f1971a.u();
    }

    public String L() {
        W(2);
        return this.f1971a.A();
    }

    public void M(List<Long> list) {
        int B;
        int B2;
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 1) {
                do {
                    i0Var.i(this.f1971a.r());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
            } else if (b10 == 2) {
                int C = this.f1971a.C();
                Y(C);
                int d10 = this.f1971a.d() + C;
                do {
                    i0Var.i(this.f1971a.r());
                } while (this.f1971a.d() < d10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 1) {
                do {
                    list.add(Long.valueOf(this.f1971a.r()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
            } else if (b11 == 2) {
                int C2 = this.f1971a.C();
                Y(C2);
                int d11 = this.f1971a.d() + C2;
                do {
                    list.add(Long.valueOf(this.f1971a.r()));
                } while (this.f1971a.d() < d11);
            } else {
                throw b0.d();
            }
        }
    }

    public void N(List<Integer> list) {
        int i10;
        int B;
        int B2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 0) {
                do {
                    zVar.g(this.f1971a.t());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
                return;
            } else if (b10 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    zVar.g(this.f1971a.t());
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f1971a.t()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
                return;
            } else if (b11 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    list.add(Integer.valueOf(this.f1971a.t()));
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        }
        V(i10);
    }

    public void O(List<Integer> list) {
        int i10;
        int B;
        int B2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 0) {
                do {
                    zVar.g(this.f1971a.p());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
                return;
            } else if (b10 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    zVar.g(this.f1971a.p());
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f1971a.p()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
                return;
            } else if (b11 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    list.add(Integer.valueOf(this.f1971a.p()));
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        }
        V(i10);
    }

    public <T> T P(g1<T> g1Var, p pVar) {
        W(3);
        return S(g1Var, pVar);
    }

    public void U(List<String> list, boolean z9) {
        int B;
        int B2;
        if (t1.b(this.f1972b) != 2) {
            throw b0.d();
        } else if (!(list instanceof g0) || z9) {
            do {
                list.add(z9 ? L() : p());
                if (!this.f1971a.e()) {
                    B = this.f1971a.B();
                } else {
                    return;
                }
            } while (B == this.f1972b);
            this.f1974d = B;
        } else {
            g0 g0Var = (g0) list;
            do {
                g0Var.t(y());
                if (!this.f1971a.e()) {
                    B2 = this.f1971a.B();
                } else {
                    return;
                }
            } while (B2 == this.f1972b);
            this.f1974d = B2;
        }
    }

    public <T> T a(g1<T> g1Var, p pVar) {
        W(2);
        return T(g1Var, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (D() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new androidx.datastore.preferences.protobuf.b0("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void b(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.k0.a<K, V> r9, androidx.datastore.preferences.protobuf.p r10) {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            androidx.datastore.preferences.protobuf.i r1 = r7.f1971a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.i r2 = r7.f1971a
            int r1 = r2.l(r1)
            K r2 = r9.f2017b
            V r3 = r9.f2019d
        L_0x0014:
            int r4 = r7.s()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            androidx.datastore.preferences.protobuf.i r5 = r7.f1971a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.D()     // Catch:{ a -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            androidx.datastore.preferences.protobuf.b0 r4 = new androidx.datastore.preferences.protobuf.b0     // Catch:{ a -> 0x004f }
            r4.<init>(r6)     // Catch:{ a -> 0x004f }
            throw r4     // Catch:{ a -> 0x004f }
        L_0x003a:
            androidx.datastore.preferences.protobuf.t1$b r4 = r9.f2018c     // Catch:{ a -> 0x004f }
            V r5 = r9.f2019d     // Catch:{ a -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ a -> 0x004f }
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x0047:
            androidx.datastore.preferences.protobuf.t1$b r4 = r9.f2016a     // Catch:{ a -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch:{ a -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.D()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            androidx.datastore.preferences.protobuf.b0 r8 = new androidx.datastore.preferences.protobuf.b0     // Catch:{ all -> 0x0065 }
            r8.<init>(r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            androidx.datastore.preferences.protobuf.i r8 = r7.f1971a
            r8.k(r1)
            return
        L_0x0065:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.i r9 = r7.f1971a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.j.b(java.util.Map, androidx.datastore.preferences.protobuf.k0$a, androidx.datastore.preferences.protobuf.p):void");
    }

    public void c(List<Integer> list) {
        int i10;
        int B;
        int B2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 0) {
                do {
                    zVar.g(this.f1971a.x());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
                return;
            } else if (b10 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    zVar.g(this.f1971a.x());
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f1971a.x()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
                return;
            } else if (b11 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    list.add(Integer.valueOf(this.f1971a.x()));
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        }
        V(i10);
    }

    public int d() {
        W(0);
        return this.f1971a.p();
    }

    public int e() {
        return this.f1972b;
    }

    public long f() {
        W(0);
        return this.f1971a.D();
    }

    public void g(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 2) {
                int C = this.f1971a.C();
                X(C);
                int d10 = this.f1971a.d() + C;
                do {
                    zVar.g(this.f1971a.q());
                } while (this.f1971a.d() < d10);
            } else if (b10 == 5) {
                do {
                    zVar.g(this.f1971a.q());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 2) {
                int C2 = this.f1971a.C();
                X(C2);
                int d11 = this.f1971a.d() + C2;
                do {
                    list.add(Integer.valueOf(this.f1971a.q()));
                } while (this.f1971a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f1971a.q()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
            } else {
                throw b0.d();
            }
        }
    }

    public long h() {
        W(1);
        return this.f1971a.r();
    }

    public <T> T i(Class<T> cls, p pVar) {
        W(2);
        return T(c1.a().d(cls), pVar);
    }

    public void j(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 2) {
                int C = this.f1971a.C();
                X(C);
                int d10 = this.f1971a.d() + C;
                do {
                    zVar.g(this.f1971a.v());
                } while (this.f1971a.d() < d10);
            } else if (b10 == 5) {
                do {
                    zVar.g(this.f1971a.v());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 2) {
                int C2 = this.f1971a.C();
                X(C2);
                int d11 = this.f1971a.d() + C2;
                do {
                    list.add(Integer.valueOf(this.f1971a.v()));
                } while (this.f1971a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Integer.valueOf(this.f1971a.v()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
            } else {
                throw b0.d();
            }
        }
    }

    public int k() {
        W(0);
        return this.f1971a.x();
    }

    public void l(List<Long> list) {
        int i10;
        int B;
        int B2;
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 0) {
                do {
                    i0Var.i(this.f1971a.y());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
                return;
            } else if (b10 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    i0Var.i(this.f1971a.y());
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f1971a.y()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
                return;
            } else if (b11 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    list.add(Long.valueOf(this.f1971a.y()));
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        }
        V(i10);
    }

    public long m() {
        W(0);
        return this.f1971a.y();
    }

    public void n(List<Integer> list) {
        int i10;
        int B;
        int B2;
        if (list instanceof z) {
            z zVar = (z) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 0) {
                do {
                    zVar.g(this.f1971a.C());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
                return;
            } else if (b10 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    zVar.g(this.f1971a.C());
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f1971a.C()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
                return;
            } else if (b11 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    list.add(Integer.valueOf(this.f1971a.C()));
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        }
        V(i10);
    }

    public void o(List<Boolean> list) {
        int i10;
        int B;
        int B2;
        if (list instanceof f) {
            f fVar = (f) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 0) {
                do {
                    fVar.i(this.f1971a.m());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
                return;
            } else if (b10 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    fVar.i(this.f1971a.m());
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f1971a.m()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
                return;
            } else if (b11 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    list.add(Boolean.valueOf(this.f1971a.m()));
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        }
        V(i10);
    }

    public String p() {
        W(2);
        return this.f1971a.z();
    }

    public int q() {
        W(5);
        return this.f1971a.q();
    }

    public boolean r() {
        W(0);
        return this.f1971a.m();
    }

    public double readDouble() {
        W(1);
        return this.f1971a.o();
    }

    public float readFloat() {
        W(5);
        return this.f1971a.s();
    }

    public int s() {
        int i10 = this.f1974d;
        if (i10 != 0) {
            this.f1972b = i10;
            this.f1974d = 0;
        } else {
            this.f1972b = this.f1971a.B();
        }
        int i11 = this.f1972b;
        if (i11 == 0 || i11 == this.f1973c) {
            return Integer.MAX_VALUE;
        }
        return t1.a(i11);
    }

    public void t(List<String> list) {
        U(list, false);
    }

    public long u() {
        W(1);
        return this.f1971a.w();
    }

    public void v(List<Long> list) {
        int i10;
        int B;
        int B2;
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 0) {
                do {
                    i0Var.i(this.f1971a.D());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
                return;
            } else if (b10 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    i0Var.i(this.f1971a.D());
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 0) {
                do {
                    list.add(Long.valueOf(this.f1971a.D()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
                return;
            } else if (b11 == 2) {
                i10 = this.f1971a.d() + this.f1971a.C();
                do {
                    list.add(Long.valueOf(this.f1971a.D()));
                } while (this.f1971a.d() < i10);
            } else {
                throw b0.d();
            }
        }
        V(i10);
    }

    public <T> T w(Class<T> cls, p pVar) {
        W(3);
        return S(c1.a().d(cls), pVar);
    }

    public void x(List<String> list) {
        U(list, true);
    }

    public h y() {
        W(2);
        return this.f1971a.n();
    }

    public void z(List<Float> list) {
        int B;
        int B2;
        if (list instanceof w) {
            w wVar = (w) list;
            int b10 = t1.b(this.f1972b);
            if (b10 == 2) {
                int C = this.f1971a.C();
                X(C);
                int d10 = this.f1971a.d() + C;
                do {
                    wVar.g(this.f1971a.s());
                } while (this.f1971a.d() < d10);
            } else if (b10 == 5) {
                do {
                    wVar.g(this.f1971a.s());
                    if (!this.f1971a.e()) {
                        B2 = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B2 == this.f1972b);
                this.f1974d = B2;
            } else {
                throw b0.d();
            }
        } else {
            int b11 = t1.b(this.f1972b);
            if (b11 == 2) {
                int C2 = this.f1971a.C();
                X(C2);
                int d11 = this.f1971a.d() + C2;
                do {
                    list.add(Float.valueOf(this.f1971a.s()));
                } while (this.f1971a.d() < d11);
            } else if (b11 == 5) {
                do {
                    list.add(Float.valueOf(this.f1971a.s()));
                    if (!this.f1971a.e()) {
                        B = this.f1971a.B();
                    } else {
                        return;
                    }
                } while (B == this.f1972b);
                this.f1974d = B;
            } else {
                throw b0.d();
            }
        }
    }
}
