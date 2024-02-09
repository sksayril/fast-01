package d9;

import b9.q2;
import g8.s;
import g9.e0;
import g9.z;
import j8.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import r8.l;

public final class h<E> extends e0<h<E>> {

    /* renamed from: q  reason: collision with root package name */
    private final b<E> f8270q;

    /* renamed from: r  reason: collision with root package name */
    private final AtomicReferenceArray f8271r = new AtomicReferenceArray(c.f8244b * 2);

    public h(long j10, h<E> hVar, b<E> bVar, int i10) {
        super(j10, hVar, i10);
        this.f8270q = bVar;
    }

    private final void z(int i10, Object obj) {
        this.f8271r.lazySet(i10 * 2, obj);
    }

    public final void A(int i10, Object obj) {
        this.f8271r.set((i10 * 2) + 1, obj);
    }

    public final void B(int i10, E e10) {
        z(i10, e10);
    }

    public int n() {
        return c.f8244b;
    }

    public void o(int i10, Throwable th, g gVar) {
        l<E, s> lVar;
        l<E, s> lVar2;
        int i11 = c.f8244b;
        boolean z9 = i10 >= i11;
        if (z9) {
            i10 -= i11;
        }
        Object v9 = v(i10);
        while (true) {
            Object w9 = w(i10);
            if ((w9 instanceof q2) || (w9 instanceof o)) {
                if (r(i10, w9, z9 ? c.f8252j : c.f8253k)) {
                    s(i10);
                    x(i10, !z9);
                    if (z9 && (lVar = u().f8232c) != null) {
                        z.b(lVar, v9, gVar);
                        return;
                    }
                    return;
                }
            } else if (w9 == c.f8252j || w9 == c.f8253k) {
                s(i10);
            } else if (!(w9 == c.f8249g || w9 == c.f8248f)) {
                if (w9 != c.f8251i && w9 != c.f8246d && w9 != c.z()) {
                    throw new IllegalStateException(("unexpected state: " + w9).toString());
                }
                return;
            }
        }
        s(i10);
        if (z9 && (lVar2 = u().f8232c) != null) {
            z.b(lVar2, v9, gVar);
        }
    }

    public final boolean r(int i10, Object obj, Object obj2) {
        return this.f8271r.compareAndSet((i10 * 2) + 1, obj, obj2);
    }

    public final void s(int i10) {
        z(i10, (Object) null);
    }

    public final Object t(int i10, Object obj) {
        return this.f8271r.getAndSet((i10 * 2) + 1, obj);
    }

    public final b<E> u() {
        b<E> bVar = this.f8270q;
        kotlin.jvm.internal.l.b(bVar);
        return bVar;
    }

    public final E v(int i10) {
        return this.f8271r.get(i10 * 2);
    }

    public final Object w(int i10) {
        return this.f8271r.get((i10 * 2) + 1);
    }

    public final void x(int i10, boolean z9) {
        if (z9) {
            u().x0((this.f8986o * ((long) c.f8244b)) + ((long) i10));
        }
        p();
    }

    public final E y(int i10) {
        E v9 = v(i10);
        s(i10);
        return v9;
    }
}
