package y8;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.l;

public final class a<T> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<b<T>> f13322a;

    public a(b<? extends T> bVar) {
        l.e(bVar, "sequence");
        this.f13322a = new AtomicReference<>(bVar);
    }

    public Iterator<T> iterator() {
        b andSet = this.f13322a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
