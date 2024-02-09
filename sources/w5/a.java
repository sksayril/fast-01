package w5;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f12974h = new a(4201, 4096, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final a f12975i = new a(1033, 1024, 1);

    /* renamed from: j  reason: collision with root package name */
    public static final a f12976j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f12977k = new a(19, 16, 1);

    /* renamed from: l  reason: collision with root package name */
    public static final a f12978l = new a(285, 256, 0);

    /* renamed from: m  reason: collision with root package name */
    public static final a f12979m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f12980n;

    /* renamed from: o  reason: collision with root package name */
    public static final a f12981o;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f12982a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f12983b;

    /* renamed from: c  reason: collision with root package name */
    private final b f12984c;

    /* renamed from: d  reason: collision with root package name */
    private final b f12985d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12986e;

    /* renamed from: f  reason: collision with root package name */
    private final int f12987f;

    /* renamed from: g  reason: collision with root package name */
    private final int f12988g;

    static {
        a aVar = new a(67, 64, 1);
        f12976j = aVar;
        a aVar2 = new a(301, 256, 1);
        f12979m = aVar2;
        f12980n = aVar2;
        f12981o = aVar;
    }

    public a(int i10, int i11, int i12) {
        this.f12987f = i10;
        this.f12986e = i11;
        this.f12988g = i12;
        this.f12982a = new int[i11];
        this.f12983b = new int[i11];
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            this.f12982a[i14] = i13;
            i13 *= 2;
            if (i13 >= i11) {
                i13 = (i13 ^ i10) & (i11 - 1);
            }
        }
        for (int i15 = 0; i15 < i11 - 1; i15++) {
            this.f12983b[this.f12982a[i15]] = i15;
        }
        this.f12984c = new b(this, new int[]{0});
        this.f12985d = new b(this, new int[]{1});
    }

    static int a(int i10, int i11) {
        return i10 ^ i11;
    }

    /* access modifiers changed from: package-private */
    public b b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f12984c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new b(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f12982a[i10];
    }

    public int d() {
        return this.f12988g;
    }

    /* access modifiers changed from: package-private */
    public b e() {
        return this.f12985d;
    }

    public int f() {
        return this.f12986e;
    }

    /* access modifiers changed from: package-private */
    public b g() {
        return this.f12984c;
    }

    /* access modifiers changed from: package-private */
    public int h(int i10) {
        if (i10 != 0) {
            return this.f12982a[(this.f12986e - this.f12983b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int i(int i10) {
        if (i10 != 0) {
            return this.f12983b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int j(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f12982a;
        int[] iArr2 = this.f12983b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f12986e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f12987f) + ',' + this.f12986e + ')';
    }
}
