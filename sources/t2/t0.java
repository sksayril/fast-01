package t2;

final class t0 extends s0 {

    /* renamed from: q  reason: collision with root package name */
    static final s0 f12388q = new t0(new Object[0], 0);

    /* renamed from: o  reason: collision with root package name */
    final transient Object[] f12389o;

    /* renamed from: p  reason: collision with root package name */
    private final transient int f12390p;

    t0(Object[] objArr, int i10) {
        this.f12389o = objArr;
        this.f12390p = i10;
    }

    /* access modifiers changed from: package-private */
    public final int c(Object[] objArr, int i10) {
        System.arraycopy(this.f12389o, 0, objArr, 0, this.f12390p);
        return this.f12390p;
    }

    /* access modifiers changed from: package-private */
    public final int d() {
        return this.f12390p;
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        return 0;
    }

    public final Object get(int i10) {
        m0.a(i10, this.f12390p, "index");
        Object obj = this.f12389o[i10];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object[] l() {
        return this.f12389o;
    }

    public final int size() {
        return this.f12390p;
    }
}
