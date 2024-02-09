package f6;

import o5.f;

final class p extends q {

    /* renamed from: b  reason: collision with root package name */
    private final int f8795b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8796c;

    p(int i10, int i11, int i12) {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw f.a();
        }
        this.f8795b = i11;
        this.f8796c = i12;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f8795b;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f8796c;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f8795b == 10;
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f8796c == 10;
    }
}
