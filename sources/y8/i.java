package y8;

import java.util.Iterator;
import r8.l;

public final class i<T, R> implements b<R> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final b<T> f13325a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final l<T, R> f13326b;

    public static final class a implements Iterator<R>, s8.a {

        /* renamed from: m  reason: collision with root package name */
        private final Iterator<T> f13327m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ i<T, R> f13328n;

        a(i<T, R> iVar) {
            this.f13328n = iVar;
            this.f13327m = iVar.f13325a.iterator();
        }

        public boolean hasNext() {
            return this.f13327m.hasNext();
        }

        public R next() {
            return this.f13328n.f13326b.invoke(this.f13327m.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.l.e(bVar, "sequence");
        kotlin.jvm.internal.l.e(lVar, "transformer");
        this.f13325a = bVar;
        this.f13326b = lVar;
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
