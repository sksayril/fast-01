package d6;

import o5.p;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f8206a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f8207b;

    /* renamed from: c  reason: collision with root package name */
    private final p[] f8208c;

    public c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f8206a = i10;
        this.f8207b = iArr;
        float f10 = (float) i13;
        this.f8208c = new p[]{new p((float) i11, f10), new p((float) i12, f10)};
    }

    public p[] a() {
        return this.f8208c;
    }

    public int[] b() {
        return this.f8207b;
    }

    public int c() {
        return this.f8206a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f8206a == ((c) obj).f8206a;
    }

    public int hashCode() {
        return this.f8206a;
    }
}
