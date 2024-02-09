package i5;

import com.google.gson.e;
import com.google.gson.w;
import com.google.gson.x;
import h5.c;
import h5.i;
import java.lang.reflect.Type;
import java.util.Collection;

public final class b implements x {

    /* renamed from: m  reason: collision with root package name */
    private final c f9495m;

    private static final class a<E> extends w<Collection<E>> {

        /* renamed from: a  reason: collision with root package name */
        private final w<E> f9496a;

        /* renamed from: b  reason: collision with root package name */
        private final i<? extends Collection<E>> f9497b;

        public a(e eVar, Type type, w<E> wVar, i<? extends Collection<E>> iVar) {
            this.f9496a = new m(eVar, wVar, type);
            this.f9497b = iVar;
        }

        /* renamed from: f */
        public Collection<E> c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            Collection<E> collection = (Collection) this.f9497b.a();
            aVar.a();
            while (aVar.o()) {
                collection.add(this.f9496a.c(aVar));
            }
            aVar.k();
            return collection;
        }

        /* renamed from: g */
        public void e(n5.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.r();
                return;
            }
            cVar.e();
            for (E e10 : collection) {
                this.f9496a.e(cVar, e10);
            }
            cVar.k();
        }
    }

    public b(c cVar) {
        this.f9495m = cVar;
    }

    public <T> w<T> create(e eVar, m5.a<T> aVar) {
        Type e10 = aVar.e();
        Class<? super T> c10 = aVar.c();
        if (!Collection.class.isAssignableFrom(c10)) {
            return null;
        }
        Type h10 = h5.b.h(e10, c10);
        return new a(eVar, h10, eVar.l(m5.a.b(h10)), this.f9495m.a(aVar));
    }
}
