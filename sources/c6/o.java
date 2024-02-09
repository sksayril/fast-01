package c6;

import o5.m;
import o5.n;
import u5.a;

final class o {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f3845c = {1, 1, 2};

    /* renamed from: a  reason: collision with root package name */
    private final m f3846a = new m();

    /* renamed from: b  reason: collision with root package name */
    private final n f3847b = new n();

    o() {
    }

    /* access modifiers changed from: package-private */
    public n a(int i10, a aVar, int i11) {
        int[] o10 = p.o(aVar, i11, false, f3845c);
        try {
            return this.f3847b.b(i10, aVar, o10);
        } catch (m unused) {
            return this.f3846a.b(i10, aVar, o10);
        }
    }
}
