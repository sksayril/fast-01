package j8;

import j8.g;
import java.io.Serializable;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import r8.p;

public final class c implements g, Serializable {

    /* renamed from: m  reason: collision with root package name */
    private final g f10857m;

    /* renamed from: n  reason: collision with root package name */
    private final g.b f10858n;

    static final class a extends m implements p<String, g.b, String> {

        /* renamed from: m  reason: collision with root package name */
        public static final a f10859m = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final String invoke(String str, g.b bVar) {
            l.e(str, "acc");
            l.e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public c(g gVar, g.b bVar) {
        l.e(gVar, "left");
        l.e(bVar, "element");
        this.f10857m = gVar;
        this.f10858n = bVar;
    }

    private final boolean c(g.b bVar) {
        return l.a(a(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (c(cVar.f10858n)) {
            g gVar = cVar.f10857m;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                l.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((g.b) gVar);
            }
        }
        return false;
    }

    private final int e() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f10857m;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public <E extends g.b> E a(g.c<E> cVar) {
        l.e(cVar, "key");
        c cVar2 = this;
        while (true) {
            E a10 = cVar2.f10858n.a(cVar);
            if (a10 != null) {
                return a10;
            }
            g gVar = cVar2.f10857m;
            if (!(gVar instanceof c)) {
                return gVar.a(cVar);
            }
            cVar2 = (c) gVar;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.d(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f10857m.hashCode() + this.f10858n.hashCode();
    }

    public <R> R k(R r9, p<? super R, ? super g.b, ? extends R> pVar) {
        l.e(pVar, "operation");
        return pVar.invoke(this.f10857m.k(r9, pVar), this.f10858n);
    }

    public g r(g.c<?> cVar) {
        l.e(cVar, "key");
        if (this.f10858n.a(cVar) != null) {
            return this.f10857m;
        }
        g r9 = this.f10857m.r(cVar);
        return r9 == this.f10857m ? this : r9 == h.f10863m ? this.f10858n : new c(r9, this.f10858n);
    }

    public g t(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) k("", a.f10859m)) + ']';
    }
}
