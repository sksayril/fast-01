package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f11695q = new int[0];

    /* renamed from: r  reason: collision with root package name */
    private static final Object[] f11696r = new Object[0];

    /* renamed from: s  reason: collision with root package name */
    private static Object[] f11697s;

    /* renamed from: t  reason: collision with root package name */
    private static int f11698t;

    /* renamed from: u  reason: collision with root package name */
    private static Object[] f11699u;

    /* renamed from: v  reason: collision with root package name */
    private static int f11700v;

    /* renamed from: m  reason: collision with root package name */
    private int[] f11701m;

    /* renamed from: n  reason: collision with root package name */
    Object[] f11702n;

    /* renamed from: o  reason: collision with root package name */
    int f11703o;

    /* renamed from: p  reason: collision with root package name */
    private f<E, E> f11704p;

    class a extends f<E, E> {
        a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            b.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i10, int i11) {
            return b.this.f11702n[i10];
        }

        /* access modifiers changed from: protected */
        public Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        public int d() {
            return b.this.f11703o;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        public void g(E e10, E e11) {
            b.this.add(e10);
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            b.this.l(i10);
        }

        /* access modifiers changed from: protected */
        public E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f11701m = f11695q;
            this.f11702n = f11696r;
        } else {
            c(i10);
        }
        this.f11703o = 0;
    }

    private void c(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f11699u;
                if (objArr != null) {
                    this.f11702n = objArr;
                    f11699u = (Object[]) objArr[0];
                    this.f11701m = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f11700v--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f11697s;
                if (objArr2 != null) {
                    this.f11702n = objArr2;
                    f11697s = (Object[]) objArr2[0];
                    this.f11701m = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f11698t--;
                    return;
                }
            }
        }
        this.f11701m = new int[i10];
        this.f11702n = new Object[i10];
    }

    private static void f(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f11700v < 10) {
                    objArr[0] = f11699u;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f11699u = objArr;
                    f11700v++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (b.class) {
                if (f11698t < 10) {
                    objArr[0] = f11697s;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f11697s = objArr;
                    f11698t++;
                }
            }
        }
    }

    private f<E, E> g() {
        if (this.f11704p == null) {
            this.f11704p = new a();
        }
        return this.f11704p;
    }

    private int i(Object obj, int i10) {
        int i11 = this.f11703o;
        if (i11 == 0) {
            return -1;
        }
        int a10 = c.a(this.f11701m, i11, i10);
        if (a10 < 0 || obj.equals(this.f11702n[a10])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f11701m[i12] == i10) {
            if (obj.equals(this.f11702n[i12])) {
                return i12;
            }
            i12++;
        }
        int i13 = a10 - 1;
        while (i13 >= 0 && this.f11701m[i13] == i10) {
            if (obj.equals(this.f11702n[i13])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    private int k() {
        int i10 = this.f11703o;
        if (i10 == 0) {
            return -1;
        }
        int a10 = c.a(this.f11701m, i10, 0);
        if (a10 < 0 || this.f11702n[a10] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f11701m[i11] == 0) {
            if (this.f11702n[i11] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = a10 - 1;
        while (i12 >= 0 && this.f11701m[i12] == 0) {
            if (this.f11702n[i12] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public boolean add(E e10) {
        int i10;
        int i11;
        if (e10 == null) {
            i11 = k();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = i(e10, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        int i13 = this.f11703o;
        int[] iArr = this.f11701m;
        if (i13 >= iArr.length) {
            int i14 = 4;
            if (i13 >= 8) {
                i14 = (i13 >> 1) + i13;
            } else if (i13 >= 4) {
                i14 = 8;
            }
            Object[] objArr = this.f11702n;
            c(i14);
            int[] iArr2 = this.f11701m;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f11702n, 0, objArr.length);
            }
            f(iArr, objArr, this.f11703o);
        }
        int i15 = this.f11703o;
        if (i12 < i15) {
            int[] iArr3 = this.f11701m;
            int i16 = i12 + 1;
            System.arraycopy(iArr3, i12, iArr3, i16, i15 - i12);
            Object[] objArr2 = this.f11702n;
            System.arraycopy(objArr2, i12, objArr2, i16, this.f11703o - i12);
        }
        this.f11701m[i12] = i10;
        this.f11702n[i12] = e10;
        this.f11703o++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        d(this.f11703o + collection.size());
        boolean z9 = false;
        for (Object add : collection) {
            z9 |= add(add);
        }
        return z9;
    }

    public void clear() {
        int i10 = this.f11703o;
        if (i10 != 0) {
            f(this.f11701m, this.f11702n, i10);
            this.f11701m = f11695q;
            this.f11702n = f11696r;
            this.f11703o = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public void d(int i10) {
        int[] iArr = this.f11701m;
        if (iArr.length < i10) {
            Object[] objArr = this.f11702n;
            c(i10);
            int i11 = this.f11703o;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f11701m, 0, i11);
                System.arraycopy(objArr, 0, this.f11702n, 0, this.f11703o);
            }
            f(iArr, objArr, this.f11703o);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f11703o) {
                try {
                    if (!set.contains(o(i10))) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f11701m;
        int i10 = this.f11703o;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? k() : i(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f11703o <= 0;
    }

    public Iterator<E> iterator() {
        return g().m().iterator();
    }

    public E l(int i10) {
        E[] eArr = this.f11702n;
        E e10 = eArr[i10];
        int i11 = this.f11703o;
        if (i11 <= 1) {
            f(this.f11701m, eArr, i11);
            this.f11701m = f11695q;
            this.f11702n = f11696r;
            this.f11703o = 0;
        } else {
            int[] iArr = this.f11701m;
            int i12 = 8;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i13 = i11 - 1;
                this.f11703o = i13;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, iArr, i10, i13 - i10);
                    Object[] objArr = this.f11702n;
                    System.arraycopy(objArr, i14, objArr, i10, this.f11703o - i10);
                }
                this.f11702n[this.f11703o] = null;
            } else {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                c(i12);
                this.f11703o--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f11701m, 0, i10);
                    System.arraycopy(eArr, 0, this.f11702n, 0, i10);
                }
                int i15 = this.f11703o;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, this.f11701m, i10, i15 - i10);
                    System.arraycopy(eArr, i16, this.f11702n, i10, this.f11703o - i10);
                }
            }
        }
        return e10;
    }

    public E o(int i10) {
        return this.f11702n[i10];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        l(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z9 = false;
        for (Object remove : collection) {
            z9 |= remove(remove);
        }
        return z9;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z9 = false;
        for (int i10 = this.f11703o - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f11702n[i10])) {
                l(i10);
                z9 = true;
            }
        }
        return z9;
    }

    public int size() {
        return this.f11703o;
    }

    public Object[] toArray() {
        int i10 = this.f11703o;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f11702n, 0, objArr, 0, i10);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f11703o) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f11703o);
        }
        System.arraycopy(this.f11702n, 0, tArr, 0, this.f11703o);
        int length = tArr.length;
        int i10 = this.f11703o;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11703o * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f11703o; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object o10 = o(i10);
            if (o10 != this) {
                sb.append(o10);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
