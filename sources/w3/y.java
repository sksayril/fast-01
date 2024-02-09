package w3;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import s4.b;

class y<T> implements b<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Set<b<T>> f12946a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<T> f12947b = null;

    y(Collection<b<T>> collection) {
        this.f12946a.addAll(collection);
    }

    static y<?> b(Collection<b<?>> collection) {
        return new y<>((Set) collection);
    }

    private synchronized void d() {
        for (b<T> bVar : this.f12946a) {
            this.f12947b.add(bVar.get());
        }
        this.f12946a = null;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(b<T> bVar) {
        Set set;
        T t9;
        if (this.f12947b == null) {
            set = this.f12946a;
            t9 = bVar;
        } else {
            set = this.f12947b;
            t9 = bVar.get();
        }
        set.add(t9);
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f12947b == null) {
            synchronized (this) {
                if (this.f12947b == null) {
                    this.f12947b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f12947b);
    }
}
