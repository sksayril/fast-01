package h8;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import r8.l;

public abstract class a<E> implements Collection<E>, s8.a {

    /* renamed from: h8.a$a  reason: collision with other inner class name */
    static final class C0146a extends m implements l<E, CharSequence> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a<E> f9411m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0146a(a<? extends E> aVar) {
            super(1);
            this.f9411m = aVar;
        }

        /* renamed from: b */
        public final CharSequence invoke(E e10) {
            return e10 == this.f9411m ? "(this Collection)" : String.valueOf(e10);
        }
    }

    protected a() {
    }

    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public abstract int c();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        for (Object a10 : this) {
            if (kotlin.jvm.internal.l.a(a10, e10)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        kotlin.jvm.internal.l.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return c();
    }

    public Object[] toArray() {
        return f.a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.l.e(tArr, "array");
        return f.b(this, tArr);
    }

    public String toString() {
        return v.r(this, ", ", "[", "]", 0, (CharSequence) null, new C0146a(this), 24, (Object) null);
    }
}
