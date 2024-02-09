package k9;

import g9.e0;
import j8.g;
import java.util.concurrent.atomic.AtomicReferenceArray;

final class f extends e0<f> {

    /* renamed from: q  reason: collision with root package name */
    private final AtomicReferenceArray f11055q = new AtomicReferenceArray(e.f11054f);

    public f(long j10, f fVar, int i10) {
        super(j10, fVar, i10);
    }

    public int n() {
        return e.f11054f;
    }

    public void o(int i10, Throwable th, g gVar) {
        r().set(i10, e.f11053e);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f11055q;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f8986o + ", hashCode=" + hashCode() + ']';
    }
}
