package y5;

import f.j;
import o5.f;

public final class e {

    /* renamed from: h  reason: collision with root package name */
    private static final e[] f13256h = a();

    /* renamed from: a  reason: collision with root package name */
    private final int f13257a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13258b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13259c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13260d;

    /* renamed from: e  reason: collision with root package name */
    private final int f13261e;

    /* renamed from: f  reason: collision with root package name */
    private final c f13262f;

    /* renamed from: g  reason: collision with root package name */
    private final int f13263g;

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f13264a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13265b;

        private b(int i10, int i11) {
            this.f13264a = i10;
            this.f13265b = i11;
        }

        /* access modifiers changed from: package-private */
        public int a() {
            return this.f13264a;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f13265b;
        }
    }

    static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f13266a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f13267b;

        private c(int i10, b bVar) {
            this.f13266a = i10;
            this.f13267b = new b[]{bVar};
        }

        private c(int i10, b bVar, b bVar2) {
            this.f13266a = i10;
            this.f13267b = new b[]{bVar, bVar2};
        }

        /* access modifiers changed from: package-private */
        public b[] a() {
            return this.f13267b;
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f13266a;
        }
    }

    private e(int i10, int i11, int i12, int i13, int i14, c cVar) {
        this.f13257a = i10;
        this.f13258b = i11;
        this.f13259c = i12;
        this.f13260d = i13;
        this.f13261e = i14;
        this.f13262f = cVar;
        int b10 = cVar.b();
        int i15 = 0;
        for (b bVar : cVar.a()) {
            i15 += bVar.a() * (bVar.b() + b10);
        }
        this.f13263g = i15;
    }

    private static e[] a() {
        return new e[]{new e(1, 10, 10, 8, 8, new c(5, new b(1, 3))), new e(2, 12, 12, 10, 10, new c(7, new b(1, 5))), new e(3, 14, 14, 12, 12, new c(10, new b(1, 8))), new e(4, 16, 16, 14, 14, new c(12, new b(1, 12))), new e(5, 18, 18, 16, 16, new c(14, new b(1, 18))), new e(6, 20, 20, 18, 18, new c(18, new b(1, 22))), new e(7, 22, 22, 20, 20, new c(20, new b(1, 30))), new e(8, 24, 24, 22, 22, new c(24, new b(1, 36))), new e(9, 26, 26, 24, 24, new c(28, new b(1, 44))), new e(10, 32, 32, 14, 14, new c(36, new b(1, 62))), new e(11, 36, 36, 16, 16, new c(42, new b(1, 86))), new e(12, 40, 40, 18, 18, new c(48, new b(1, 114))), new e(13, 44, 44, 20, 20, new c(56, new b(1, 144))), new e(14, 48, 48, 22, 22, new c(68, new b(1, 174))), new e(15, 52, 52, 24, 24, new c(42, new b(2, 102))), new e(16, 64, 64, 14, 14, new c(56, new b(2, 140))), new e(17, 72, 72, 16, 16, new c(36, new b(4, 92))), new e(18, 80, 80, 18, 18, new c(48, new b(4, 114))), new e(19, 88, 88, 20, 20, new c(56, new b(4, 144))), new e(20, 96, 96, 22, 22, new c(68, new b(4, 174))), new e(21, 104, 104, 24, 24, new c(56, new b(6, 136))), new e(22, j.G0, j.G0, 18, 18, new c(68, new b(6, 175))), new e(23, 132, 132, 20, 20, new c(62, new b(8, 163))), new e(24, 144, 144, 22, 22, new c(62, new b(8, 156), new b(2, 155))), new e(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new e(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new e(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new e(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49))), new e(31, 8, 48, 6, 22, new c(15, new b(1, 18))), new e(32, 8, 64, 6, 14, new c(18, new b(1, 24))), new e(33, 8, 80, 6, 18, new c(22, new b(1, 32))), new e(34, 8, 96, 6, 22, new c(28, new b(1, 38))), new e(35, 8, j.G0, 6, 18, new c(32, new b(1, 49))), new e(36, 8, 144, 6, 22, new c(36, new b(1, 63))), new e(37, 12, 64, 10, 14, new c(27, new b(1, 43))), new e(38, 12, 88, 10, 20, new c(36, new b(1, 64))), new e(39, 16, 64, 14, 14, new c(36, new b(1, 62))), new e(40, 20, 36, 18, 16, new c(28, new b(1, 44))), new e(41, 20, 44, 18, 20, new c(34, new b(1, 56))), new e(42, 20, 64, 18, 14, new c(42, new b(1, 84))), new e(43, 22, 48, 20, 22, new c(38, new b(1, 72))), new e(44, 24, 48, 22, 22, new c(41, new b(1, 80))), new e(45, 24, 64, 22, 14, new c(46, new b(1, 108))), new e(46, 26, 40, 24, 18, new c(38, new b(1, 70))), new e(47, 26, 48, 24, 22, new c(42, new b(1, 90))), new e(48, 26, 64, 24, 14, new c(50, new b(1, j.E0)))};
    }

    public static e h(int i10, int i11) {
        if ((i10 & 1) == 0 && (i11 & 1) == 0) {
            for (e eVar : f13256h) {
                if (eVar.f13258b == i10 && eVar.f13259c == i11) {
                    return eVar;
                }
            }
            throw f.a();
        }
        throw f.a();
    }

    public int b() {
        return this.f13261e;
    }

    public int c() {
        return this.f13260d;
    }

    /* access modifiers changed from: package-private */
    public c d() {
        return this.f13262f;
    }

    public int e() {
        return this.f13259c;
    }

    public int f() {
        return this.f13258b;
    }

    public int g() {
        return this.f13263g;
    }

    public int i() {
        return this.f13257a;
    }

    public String toString() {
        return String.valueOf(this.f13257a);
    }
}
