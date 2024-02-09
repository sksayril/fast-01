package p;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class g<K, V> {

    /* renamed from: p  reason: collision with root package name */
    static Object[] f11737p;

    /* renamed from: q  reason: collision with root package name */
    static int f11738q;

    /* renamed from: r  reason: collision with root package name */
    static Object[] f11739r;

    /* renamed from: s  reason: collision with root package name */
    static int f11740s;

    /* renamed from: m  reason: collision with root package name */
    int[] f11741m;

    /* renamed from: n  reason: collision with root package name */
    Object[] f11742n;

    /* renamed from: o  reason: collision with root package name */
    int f11743o;

    public g() {
        this.f11741m = c.f11706a;
        this.f11742n = c.f11708c;
        this.f11743o = 0;
    }

    public g(int i10) {
        if (i10 == 0) {
            this.f11741m = c.f11706a;
            this.f11742n = c.f11708c;
        } else {
            a(i10);
        }
        this.f11743o = 0;
    }

    public g(g<K, V> gVar) {
        this();
        if (gVar != null) {
            j(gVar);
        }
    }

    private void a(int i10) {
        Class<g> cls = g.class;
        if (i10 == 8) {
            synchronized (cls) {
                Object[] objArr = f11739r;
                if (objArr != null) {
                    this.f11742n = objArr;
                    f11739r = (Object[]) objArr[0];
                    this.f11741m = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f11740s--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (cls) {
                Object[] objArr2 = f11737p;
                if (objArr2 != null) {
                    this.f11742n = objArr2;
                    f11737p = (Object[]) objArr2[0];
                    this.f11741m = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f11738q--;
                    return;
                }
            }
        }
        this.f11741m = new int[i10];
        this.f11742n = new Object[(i10 << 1)];
    }

    private static int b(int[] iArr, int i10, int i11) {
        try {
            return c.a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void d(int[] iArr, Object[] objArr, int i10) {
        Class<g> cls = g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f11740s < 10) {
                    objArr[0] = f11739r;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f11739r = objArr;
                    f11740s++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f11738q < 10) {
                    objArr[0] = f11737p;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f11737p = objArr;
                    f11738q++;
                }
            }
        }
    }

    public void c(int i10) {
        int i11 = this.f11743o;
        int[] iArr = this.f11741m;
        if (iArr.length < i10) {
            Object[] objArr = this.f11742n;
            a(i10);
            if (this.f11743o > 0) {
                System.arraycopy(iArr, 0, this.f11741m, 0, i11);
                System.arraycopy(objArr, 0, this.f11742n, 0, i11 << 1);
            }
            d(iArr, objArr, i11);
        }
        if (this.f11743o != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f11743o;
        if (i10 > 0) {
            int[] iArr = this.f11741m;
            Object[] objArr = this.f11742n;
            this.f11741m = c.f11706a;
            this.f11742n = c.f11708c;
            this.f11743o = 0;
            d(iArr, objArr, i10);
        }
        if (this.f11743o > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    public int e(Object obj, int i10) {
        int i11 = this.f11743o;
        if (i11 == 0) {
            return -1;
        }
        int b10 = b(this.f11741m, i11, i10);
        if (b10 < 0 || obj.equals(this.f11742n[b10 << 1])) {
            return b10;
        }
        int i12 = b10 + 1;
        while (i12 < i11 && this.f11741m[i12] == i10) {
            if (obj.equals(this.f11742n[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        int i13 = b10 - 1;
        while (i13 >= 0 && this.f11741m[i13] == i10) {
            if (obj.equals(this.f11742n[i13 << 1])) {
                return i13;
            }
            i13--;
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i10 = 0;
            while (i10 < this.f11743o) {
                try {
                    Object i11 = i(i10);
                    Object m10 = m(i10);
                    Object obj2 = gVar.get(i11);
                    if (m10 == null) {
                        if (obj2 != null || !gVar.containsKey(i11)) {
                            return false;
                        }
                    } else if (!m10.equals(obj2)) {
                        return false;
                    }
                    i10++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i12 = 0;
            while (i12 < this.f11743o) {
                try {
                    Object i13 = i(i12);
                    Object m11 = m(i12);
                    Object obj3 = map.get(i13);
                    if (m11 == null) {
                        if (obj3 != null || !map.containsKey(i13)) {
                            return false;
                        }
                    } else if (!m11.equals(obj3)) {
                        return false;
                    }
                    i12++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    public int g() {
        int i10 = this.f11743o;
        if (i10 == 0) {
            return -1;
        }
        int b10 = b(this.f11741m, i10, 0);
        if (b10 < 0 || this.f11742n[b10 << 1] == null) {
            return b10;
        }
        int i11 = b10 + 1;
        while (i11 < i10 && this.f11741m[i11] == 0) {
            if (this.f11742n[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        int i12 = b10 - 1;
        while (i12 >= 0 && this.f11741m[i12] == 0) {
            if (this.f11742n[i12 << 1] == null) {
                return i12;
            }
            i12--;
        }
        return ~i11;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v9) {
        int f10 = f(obj);
        return f10 >= 0 ? this.f11742n[(f10 << 1) + 1] : v9;
    }

    /* access modifiers changed from: package-private */
    public int h(Object obj) {
        int i10 = this.f11743o * 2;
        Object[] objArr = this.f11742n;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f11741m;
        Object[] objArr = this.f11742n;
        int i10 = this.f11743o;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public K i(int i10) {
        return this.f11742n[i10 << 1];
    }

    public boolean isEmpty() {
        return this.f11743o <= 0;
    }

    public void j(g<? extends K, ? extends V> gVar) {
        int i10 = gVar.f11743o;
        c(this.f11743o + i10);
        if (this.f11743o != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(gVar.i(i11), gVar.m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(gVar.f11741m, 0, this.f11741m, 0, i10);
            System.arraycopy(gVar.f11742n, 0, this.f11742n, 0, i10 << 1);
            this.f11743o = i10;
        }
    }

    public V k(int i10) {
        V[] vArr = this.f11742n;
        int i11 = i10 << 1;
        V v9 = vArr[i11 + 1];
        int i12 = this.f11743o;
        int i13 = 0;
        if (i12 <= 1) {
            d(this.f11741m, vArr, i12);
            this.f11741m = c.f11706a;
            this.f11742n = c.f11708c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f11741m;
            int i15 = 8;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i16 = i10 + 1;
                    int i17 = i14 - i10;
                    System.arraycopy(iArr, i16, iArr, i10, i17);
                    Object[] objArr = this.f11742n;
                    System.arraycopy(objArr, i16 << 1, objArr, i11, i17 << 1);
                }
                Object[] objArr2 = this.f11742n;
                int i18 = i14 << 1;
                objArr2[i18] = null;
                objArr2[i18 + 1] = null;
            } else {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                a(i15);
                if (i12 == this.f11743o) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f11741m, 0, i10);
                        System.arraycopy(vArr, 0, this.f11742n, 0, i11);
                    }
                    if (i10 < i14) {
                        int i19 = i10 + 1;
                        int i20 = i14 - i10;
                        System.arraycopy(iArr, i19, this.f11741m, i10, i20);
                        System.arraycopy(vArr, i19 << 1, this.f11742n, i11, i20 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i13 = i14;
        }
        if (i12 == this.f11743o) {
            this.f11743o = i13;
            return v9;
        }
        throw new ConcurrentModificationException();
    }

    public V l(int i10, V v9) {
        int i11 = (i10 << 1) + 1;
        V[] vArr = this.f11742n;
        V v10 = vArr[i11];
        vArr[i11] = v9;
        return v10;
    }

    public V m(int i10) {
        return this.f11742n[(i10 << 1) + 1];
    }

    public V put(K k10, V v9) {
        int i10;
        int i11;
        int i12 = this.f11743o;
        if (k10 == null) {
            i11 = g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            i11 = e(k10, hashCode);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            V[] vArr = this.f11742n;
            V v10 = vArr[i13];
            vArr[i13] = v9;
            return v10;
        }
        int i14 = ~i11;
        int[] iArr = this.f11741m;
        if (i12 >= iArr.length) {
            int i15 = 4;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i15 = 8;
            }
            Object[] objArr = this.f11742n;
            a(i15);
            if (i12 == this.f11743o) {
                int[] iArr2 = this.f11741m;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f11742n, 0, objArr.length);
                }
                d(iArr, objArr, i12);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr3 = this.f11741m;
            int i16 = i14 + 1;
            System.arraycopy(iArr3, i14, iArr3, i16, i12 - i14);
            Object[] objArr2 = this.f11742n;
            System.arraycopy(objArr2, i14 << 1, objArr2, i16 << 1, (this.f11743o - i14) << 1);
        }
        int i17 = this.f11743o;
        if (i12 == i17) {
            int[] iArr4 = this.f11741m;
            if (i14 < iArr4.length) {
                iArr4[i14] = i10;
                Object[] objArr3 = this.f11742n;
                int i18 = i14 << 1;
                objArr3[i18] = k10;
                objArr3[i18 + 1] = v9;
                this.f11743o = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v9) {
        V v10 = get(k10);
        return v10 == null ? put(k10, v9) : v10;
    }

    public V remove(Object obj) {
        int f10 = f(obj);
        if (f10 >= 0) {
            return k(f10);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int f10 = f(obj);
        if (f10 < 0) {
            return false;
        }
        Object m10 = m(f10);
        if (obj2 != m10 && (obj2 == null || !obj2.equals(m10))) {
            return false;
        }
        k(f10);
        return true;
    }

    public V replace(K k10, V v9) {
        int f10 = f(k10);
        if (f10 >= 0) {
            return l(f10, v9);
        }
        return null;
    }

    public boolean replace(K k10, V v9, V v10) {
        int f10 = f(k10);
        if (f10 < 0) {
            return false;
        }
        V m10 = m(f10);
        if (m10 != v9 && (v9 == null || !v9.equals(m10))) {
            return false;
        }
        l(f10, v10);
        return true;
    }

    public int size() {
        return this.f11743o;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11743o * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f11743o; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object i11 = i(i10);
            if (i11 != this) {
                sb.append(i11);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m10 = m(i10);
            if (m10 != this) {
                sb.append(m10);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
