package i5;

import com.google.gson.e;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.w;
import com.google.gson.x;

public final class l<T> extends w<T> {

    /* renamed from: a  reason: collision with root package name */
    private final r<T> f9540a;

    /* renamed from: b  reason: collision with root package name */
    private final j<T> f9541b;

    /* renamed from: c  reason: collision with root package name */
    final e f9542c;

    /* renamed from: d  reason: collision with root package name */
    private final m5.a<T> f9543d;

    /* renamed from: e  reason: collision with root package name */
    private final x f9544e;

    /* renamed from: f  reason: collision with root package name */
    private final l<T>.b f9545f = new b();

    /* renamed from: g  reason: collision with root package name */
    private w<T> f9546g;

    private final class b implements q, i {
        private b() {
        }
    }

    private static final class c implements x {

        /* renamed from: m  reason: collision with root package name */
        private final m5.a<?> f9548m;

        /* renamed from: n  reason: collision with root package name */
        private final boolean f9549n;

        /* renamed from: o  reason: collision with root package name */
        private final Class<?> f9550o;

        /* renamed from: p  reason: collision with root package name */
        private final r<?> f9551p;

        /* renamed from: q  reason: collision with root package name */
        private final j<?> f9552q;

        c(Object obj, m5.a<?> aVar, boolean z9, Class<?> cls) {
            j<?> jVar = null;
            r<?> rVar = obj instanceof r ? (r) obj : null;
            this.f9551p = rVar;
            jVar = obj instanceof j ? (j) obj : jVar;
            this.f9552q = jVar;
            h5.a.a((rVar == null && jVar == null) ? false : true);
            this.f9548m = aVar;
            this.f9549n = z9;
            this.f9550o = cls;
        }

        public <T> w<T> create(e eVar, m5.a<T> aVar) {
            m5.a<?> aVar2 = this.f9548m;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f9549n && this.f9548m.e() == aVar.c()) : this.f9550o.isAssignableFrom(aVar.c())) {
                return new l(this.f9551p, this.f9552q, eVar, aVar, this);
            }
            return null;
        }
    }

    public l(r<T> rVar, j<T> jVar, e eVar, m5.a<T> aVar, x xVar) {
        this.f9540a = rVar;
        this.f9541b = jVar;
        this.f9542c = eVar;
        this.f9543d = aVar;
        this.f9544e = xVar;
    }

    private w<T> f() {
        w<T> wVar = this.f9546g;
        if (wVar != null) {
            return wVar;
        }
        w<T> m10 = this.f9542c.m(this.f9544e, this.f9543d);
        this.f9546g = m10;
        return m10;
    }

    public static x g(m5.a<?> aVar, Object obj) {
        return new c(obj, aVar, aVar.e() == aVar.c(), (Class<?>) null);
    }

    public T c(n5.a aVar) {
        if (this.f9541b == null) {
            return f().c(aVar);
        }
        k a10 = h5.l.a(aVar);
        if (a10.l()) {
            return null;
        }
        return this.f9541b.a(a10, this.f9543d.e(), this.f9545f);
    }

    public void e(n5.c cVar, T t9) {
        r<T> rVar = this.f9540a;
        if (rVar == null) {
            f().e(cVar, t9);
        } else if (t9 == null) {
            cVar.r();
        } else {
            h5.l.b(rVar.a(t9, this.f9543d.e(), this.f9545f), cVar);
        }
    }
}
