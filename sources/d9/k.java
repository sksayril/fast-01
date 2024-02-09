package d9;

import b9.q2;
import g8.s;
import g9.h0;
import g9.q0;
import g9.z;
import kotlin.jvm.internal.v;
import r8.l;

public class k<E> extends b<E> {

    /* renamed from: n  reason: collision with root package name */
    private final int f8272n;

    /* renamed from: o  reason: collision with root package name */
    private final a f8273o;

    public k(int i10, a aVar, l<? super E, s> lVar) {
        super(i10, lVar);
        this.f8272n = i10;
        this.f8273o = aVar;
        boolean z9 = false;
        if (aVar != a.SUSPEND) {
            if (!(i10 >= 1 ? true : z9)) {
                throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + v.b(b.class).b() + " instead").toString());
    }

    private final Object A0(E e10, boolean z9) {
        return this.f8273o == a.DROP_LATEST ? y0(e10, z9) : z0(e10);
    }

    private final Object y0(E e10, boolean z9) {
        l<E, s> lVar;
        q0 d10;
        Object d11 = super.d(e10);
        if (g.i(d11) || g.h(d11)) {
            return d11;
        }
        if (!z9 || (lVar = this.f8232c) == null || (d10 = z.d(lVar, e10, (q0) null, 2, (Object) null)) == null) {
            return g.f8266b.c(s.f8976a);
        }
        throw d10;
    }

    private final Object z0(E e10) {
        h hVar;
        h0 h0Var = c.f8246d;
        h hVar2 = (h) b.f8226i.get(this);
        while (true) {
            long andIncrement = b.f8222e.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean l10 = S(andIncrement);
            int i10 = c.f8244b;
            long j11 = j10 / ((long) i10);
            int i11 = (int) (j10 % ((long) i10));
            if (hVar2.f8986o != j11) {
                h f10 = C(j11, hVar2);
                if (f10 != null) {
                    hVar = f10;
                } else if (l10) {
                    return g.f8266b.a(H());
                }
            } else {
                hVar = hVar2;
            }
            int q9 = t0(hVar, i11, e10, j10, h0Var, l10);
            if (q9 == 0) {
                hVar.b();
                return g.f8266b.c(s.f8976a);
            } else if (q9 == 1) {
                return g.f8266b.c(s.f8976a);
            } else {
                if (q9 != 2) {
                    if (q9 == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (q9 != 4) {
                        if (q9 == 5) {
                            hVar.b();
                        }
                        hVar2 = hVar;
                    } else {
                        if (j10 < G()) {
                            hVar.b();
                        }
                        return g.f8266b.a(H());
                    }
                } else if (l10) {
                    hVar.p();
                    return g.f8266b.a(H());
                } else {
                    q2 q2Var = h0Var instanceof q2 ? (q2) h0Var : null;
                    if (q2Var != null) {
                        f0(q2Var, hVar, i11);
                    }
                    y((hVar.f8986o * ((long) i10)) + ((long) i11));
                    return g.f8266b.c(s.f8976a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean T() {
        return this.f8273o == a.DROP_OLDEST;
    }

    public Object d(E e10) {
        return A0(e10, false);
    }
}
