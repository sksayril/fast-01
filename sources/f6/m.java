package f6;

final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f8789a = 0;

    /* renamed from: b  reason: collision with root package name */
    private a f8790b = a.NUMERIC;

    private enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    m() {
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f8789a;
    }

    /* access modifiers changed from: package-private */
    public void b(int i10) {
        this.f8789a += i10;
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f8790b == a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f8790b == a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f8790b = a.ALPHA;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f8790b = a.ISO_IEC_646;
    }

    /* access modifiers changed from: package-private */
    public void g() {
        this.f8790b = a.NUMERIC;
    }

    /* access modifiers changed from: package-private */
    public void h(int i10) {
        this.f8789a = i10;
    }
}
