package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.u;
import java.util.Iterator;
import java.util.Map;

final class v0<T> implements g1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final r0 f2116a;

    /* renamed from: b  reason: collision with root package name */
    private final n1<?, ?> f2117b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f2118c;

    /* renamed from: d  reason: collision with root package name */
    private final q<?> f2119d;

    private v0(n1<?, ?> n1Var, q<?> qVar, r0 r0Var) {
        this.f2117b = n1Var;
        this.f2118c = qVar.e(r0Var);
        this.f2119d = qVar;
        this.f2116a = r0Var;
    }

    private <UT, UB> int j(n1<UT, UB> n1Var, T t9) {
        return n1Var.i(n1Var.g(t9));
    }

    private <UT, UB, ET extends u.b<ET>> void k(n1<UT, UB> n1Var, q<ET> qVar, T t9, f1 f1Var, p pVar) {
        UB f10 = n1Var.f(t9);
        u<ET> d10 = qVar.d(t9);
        do {
            try {
                if (f1Var.s() == Integer.MAX_VALUE) {
                    n1Var.o(t9, f10);
                    return;
                }
            } finally {
                n1Var.o(t9, f10);
            }
        } while (m(f1Var, pVar, qVar, d10, n1Var, f10));
    }

    static <T> v0<T> l(n1<?, ?> n1Var, q<?> qVar, r0 r0Var) {
        return new v0<>(n1Var, qVar, r0Var);
    }

    private <UT, UB, ET extends u.b<ET>> boolean m(f1 f1Var, p pVar, q<ET> qVar, u<ET> uVar, n1<UT, UB> n1Var, UB ub) {
        int e10 = f1Var.e();
        if (e10 == t1.f2085a) {
            int i10 = 0;
            Object obj = null;
            h hVar = null;
            while (f1Var.s() != Integer.MAX_VALUE) {
                int e11 = f1Var.e();
                if (e11 == t1.f2087c) {
                    i10 = f1Var.A();
                    obj = qVar.b(pVar, this.f2116a, i10);
                } else if (e11 == t1.f2088d) {
                    if (obj != null) {
                        qVar.h(f1Var, obj, pVar, uVar);
                    } else {
                        hVar = f1Var.y();
                    }
                } else if (!f1Var.D()) {
                    break;
                }
            }
            if (f1Var.e() == t1.f2086b) {
                if (hVar != null) {
                    if (obj != null) {
                        qVar.i(hVar, obj, pVar, uVar);
                    } else {
                        n1Var.d(ub, i10, hVar);
                    }
                }
                return true;
            }
            throw b0.a();
        } else if (t1.b(e10) != 2) {
            return f1Var.D();
        } else {
            Object b10 = qVar.b(pVar, this.f2116a, t1.a(e10));
            if (b10 == null) {
                return n1Var.m(ub, f1Var);
            }
            qVar.h(f1Var, b10, pVar, uVar);
            return true;
        }
    }

    private <UT, UB> void n(n1<UT, UB> n1Var, T t9, u1 u1Var) {
        n1Var.s(n1Var.g(t9), u1Var);
    }

    public void a(T t9, T t10) {
        i1.G(this.f2117b, t9, t10);
        if (this.f2118c) {
            i1.E(this.f2119d, t9, t10);
        }
    }

    public void b(T t9, f1 f1Var, p pVar) {
        k(this.f2117b, this.f2119d, t9, f1Var, pVar);
    }

    public void c(T t9, u1 u1Var) {
        Iterator<Map.Entry<?, Object>> s9 = this.f2119d.c(t9).s();
        while (s9.hasNext()) {
            Map.Entry next = s9.next();
            u.b bVar = (u.b) next.getKey();
            if (bVar.o() != t1.c.MESSAGE || bVar.f() || bVar.isPacked()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            u1Var.f(bVar.getNumber(), next instanceof d0.b ? ((d0.b) next).a().e() : next.getValue());
        }
        n(this.f2117b, t9, u1Var);
    }

    public void d(T t9) {
        this.f2117b.j(t9);
        this.f2119d.f(t9);
    }

    public final boolean e(T t9) {
        return this.f2119d.c(t9).p();
    }

    public boolean f(T t9, T t10) {
        if (!this.f2117b.g(t9).equals(this.f2117b.g(t10))) {
            return false;
        }
        if (this.f2118c) {
            return this.f2119d.c(t9).equals(this.f2119d.c(t10));
        }
        return true;
    }

    public int g(T t9) {
        int j10 = j(this.f2117b, t9) + 0;
        return this.f2118c ? j10 + this.f2119d.c(t9).j() : j10;
    }

    public T h() {
        return this.f2116a.h().g();
    }

    public int i(T t9) {
        int hashCode = this.f2117b.g(t9).hashCode();
        return this.f2118c ? (hashCode * 53) + this.f2119d.c(t9).hashCode() : hashCode;
    }
}
