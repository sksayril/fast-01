package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class q1 extends AbstractList<String> implements g0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final g0 f2050m;

    class a implements ListIterator<String> {

        /* renamed from: m  reason: collision with root package name */
        ListIterator<String> f2051m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f2052n;

        a(int i10) {
            this.f2052n = i10;
            this.f2051m = q1.this.f2050m.listIterator(i10);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f2051m.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f2051m.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f2051m.hasNext();
        }

        public boolean hasPrevious() {
            return this.f2051m.hasPrevious();
        }

        public int nextIndex() {
            return this.f2051m.nextIndex();
        }

        public int previousIndex() {
            return this.f2051m.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* renamed from: m  reason: collision with root package name */
        Iterator<String> f2054m;

        b() {
            this.f2054m = q1.this.f2050m.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f2054m.next();
        }

        public boolean hasNext() {
            return this.f2054m.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public q1(g0 g0Var) {
        this.f2050m = g0Var;
    }

    /* renamed from: d */
    public String get(int i10) {
        return (String) this.f2050m.get(i10);
    }

    public Iterator<String> iterator() {
        return new b();
    }

    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    public g0 r() {
        return this;
    }

    public int size() {
        return this.f2050m.size();
    }

    public void t(h hVar) {
        throw new UnsupportedOperationException();
    }

    public Object u(int i10) {
        return this.f2050m.u(i10);
    }

    public List<?> w() {
        return this.f2050m.w();
    }
}
