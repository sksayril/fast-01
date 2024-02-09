package f6;

final class o extends q {

    /* renamed from: b  reason: collision with root package name */
    private final String f8792b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8793c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f8794d;

    o(int i10, String str) {
        super(i10);
        this.f8792b = str;
        this.f8794d = false;
        this.f8793c = 0;
    }

    o(int i10, String str, int i11) {
        super(i10);
        this.f8794d = true;
        this.f8793c = i11;
        this.f8792b = str;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.f8792b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f8793c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f8794d;
    }
}
