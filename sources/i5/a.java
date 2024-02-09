package i5;

import com.google.gson.e;
import com.google.gson.w;
import com.google.gson.x;
import h5.b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import n5.c;

public final class a<E> extends w<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final x f9492c = new C0148a();

    /* renamed from: a  reason: collision with root package name */
    private final Class<E> f9493a;

    /* renamed from: b  reason: collision with root package name */
    private final w<E> f9494b;

    /* renamed from: i5.a$a  reason: collision with other inner class name */
    class C0148a implements x {
        C0148a() {
        }

        public <T> w<T> create(e eVar, m5.a<T> aVar) {
            Type e10 = aVar.e();
            if (!(e10 instanceof GenericArrayType) && (!(e10 instanceof Class) || !((Class) e10).isArray())) {
                return null;
            }
            Type g10 = b.g(e10);
            return new a(eVar, eVar.l(m5.a.b(g10)), b.k(g10));
        }
    }

    public a(e eVar, w<E> wVar, Class<E> cls) {
        this.f9494b = new m(eVar, wVar, cls);
        this.f9493a = cls;
    }

    public Object c(n5.a aVar) {
        if (aVar.G() == n5.b.NULL) {
            aVar.C();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.o()) {
            arrayList.add(this.f9494b.c(aVar));
        }
        aVar.k();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f9493a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(newInstance, i10, arrayList.get(i10));
        }
        return newInstance;
    }

    public void e(c cVar, Object obj) {
        if (obj == null) {
            cVar.r();
            return;
        }
        cVar.e();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f9494b.e(cVar, Array.get(obj, i10));
        }
        cVar.k();
    }
}
