package h6;

final class d {

    /* renamed from: a  reason: collision with root package name */
    private final int f9393a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9394b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9395c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9396d;

    /* renamed from: e  reason: collision with root package name */
    private int f9397e = -1;

    d(int i10, int i11, int i12, int i13) {
        this.f9393a = i10;
        this.f9394b = i11;
        this.f9395c = i12;
        this.f9396d = i13;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f9395c;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f9394b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f9397e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f9393a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f9396d;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f9394b - this.f9393a;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return h(this.f9397e);
    }

    /* access modifiers changed from: package-private */
    public boolean h(int i10) {
        return i10 != -1 && this.f9395c == (i10 % 3) * 3;
    }

    /* access modifiers changed from: package-private */
    public void i(int i10) {
        this.f9397e = i10;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f9397e = ((this.f9396d / 30) * 3) + (this.f9395c / 3);
    }

    public String toString() {
        return this.f9397e + "|" + this.f9396d;
    }
}
