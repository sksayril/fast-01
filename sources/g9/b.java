package g9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b<T> extends a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8978a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus");
    private volatile Object _consensus = a.f8977a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8978a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = a.f8977a;
        return obj2 != obj3 ? obj2 : androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public final Object a(Object obj) {
        Object obj2 = f8978a.get(this);
        if (obj2 == a.f8977a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t9, Object obj);

    public abstract Object d(T t9);
}
