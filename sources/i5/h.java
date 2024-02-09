package i5;

import com.google.gson.e;
import com.google.gson.k;
import com.google.gson.p;
import com.google.gson.s;
import com.google.gson.w;
import com.google.gson.x;
import h5.c;
import h5.f;
import h5.i;
import h5.l;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import n5.b;

public final class h implements x {

    /* renamed from: m  reason: collision with root package name */
    private final c f9508m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f9509n;

    private final class a<K, V> extends w<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final w<K> f9510a;

        /* renamed from: b  reason: collision with root package name */
        private final w<V> f9511b;

        /* renamed from: c  reason: collision with root package name */
        private final i<? extends Map<K, V>> f9512c;

        public a(e eVar, Type type, w<K> wVar, Type type2, w<V> wVar2, i<? extends Map<K, V>> iVar) {
            this.f9510a = new m(eVar, wVar, type);
            this.f9511b = new m(eVar, wVar2, type2);
            this.f9512c = iVar;
        }

        private String f(k kVar) {
            if (kVar.y()) {
                p g10 = kVar.g();
                if (g10.F()) {
                    return String.valueOf(g10.C());
                }
                if (g10.D()) {
                    return Boolean.toString(g10.c());
                }
                if (g10.G()) {
                    return g10.i();
                }
                throw new AssertionError();
            } else if (kVar.l()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: g */
        public Map<K, V> c(n5.a aVar) {
            b G = aVar.G();
            if (G == b.NULL) {
                aVar.C();
                return null;
            }
            Map<K, V> map = (Map) this.f9512c.a();
            if (G == b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.o()) {
                    aVar.a();
                    K c10 = this.f9510a.c(aVar);
                    if (map.put(c10, this.f9511b.c(aVar)) == null) {
                        aVar.k();
                    } else {
                        throw new s("duplicate key: " + c10);
                    }
                }
                aVar.k();
            } else {
                aVar.b();
                while (aVar.o()) {
                    f.f9344a.a(aVar);
                    K c11 = this.f9510a.c(aVar);
                    if (map.put(c11, this.f9511b.c(aVar)) != null) {
                        throw new s("duplicate key: " + c11);
                    }
                }
                aVar.l();
            }
            return map;
        }

        /* renamed from: h */
        public void e(n5.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.r();
            } else if (!h.this.f9509n) {
                cVar.g();
                for (Map.Entry next : map.entrySet()) {
                    cVar.p(String.valueOf(next.getKey()));
                    this.f9511b.e(cVar, next.getValue());
                }
                cVar.l();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z9 = false;
                for (Map.Entry next2 : map.entrySet()) {
                    k d10 = this.f9510a.d(next2.getKey());
                    arrayList.add(d10);
                    arrayList2.add(next2.getValue());
                    z9 |= d10.k() || d10.o();
                }
                if (z9) {
                    cVar.e();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.e();
                        l.b((k) arrayList.get(i10), cVar);
                        this.f9511b.e(cVar, arrayList2.get(i10));
                        cVar.k();
                        i10++;
                    }
                    cVar.k();
                    return;
                }
                cVar.g();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    cVar.p(f((k) arrayList.get(i10)));
                    this.f9511b.e(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.l();
            }
        }
    }

    public h(c cVar, boolean z9) {
        this.f9508m = cVar;
        this.f9509n = z9;
    }

    private w<?> a(e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f9561f : eVar.l(m5.a.b(type));
    }

    public <T> w<T> create(e eVar, m5.a<T> aVar) {
        Type e10 = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] j10 = h5.b.j(e10, h5.b.k(e10));
        return new a(eVar, j10[0], a(eVar, j10[0]), j10[1], eVar.l(m5.a.b(j10[1])), this.f9508m.a(aVar));
    }
}
