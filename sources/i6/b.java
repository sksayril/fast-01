package i6;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final b f9602f = new b(929, 3);

    /* renamed from: a  reason: collision with root package name */
    private final int[] f9603a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f9604b;

    /* renamed from: c  reason: collision with root package name */
    private final c f9605c;

    /* renamed from: d  reason: collision with root package name */
    private final c f9606d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9607e;

    private b(int i10, int i11) {
        this.f9607e = i10;
        this.f9603a = new int[i10];
        this.f9604b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f9603a[i13] = i12;
            i12 = (i12 * i11) % i10;
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f9604b[this.f9603a[i14]] = i14;
        }
        this.f9605c = new c(this, new int[]{0});
        this.f9606d = new c(this, new int[]{1});
    }

    /* access modifiers changed from: package-private */
    public int a(int i10, int i11) {
        return (i10 + i11) % this.f9607e;
    }

    /* access modifiers changed from: package-private */
    public c b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f9605c;
        } else {
            int[] iArr = new int[(i10 + 1)];
            iArr[0] = i11;
            return new c(this, iArr);
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        return this.f9603a[i10];
    }

    /* access modifiers changed from: package-private */
    public c d() {
        return this.f9606d;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f9607e;
    }

    /* access modifiers changed from: package-private */
    public c f() {
        return this.f9605c;
    }

    /* access modifiers changed from: package-private */
    public int g(int i10) {
        if (i10 != 0) {
            return this.f9603a[(this.f9607e - this.f9604b[i10]) - 1];
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    public int h(int i10) {
        if (i10 != 0) {
            return this.f9604b[i10];
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public int i(int i10, int i11) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        int[] iArr = this.f9603a;
        int[] iArr2 = this.f9604b;
        return iArr[(iArr2[i10] + iArr2[i11]) % (this.f9607e - 1)];
    }

    /* access modifiers changed from: package-private */
    public int j(int i10, int i11) {
        int i12 = this.f9607e;
        return ((i10 + i12) - i11) % i12;
    }
}
