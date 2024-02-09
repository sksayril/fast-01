package h8;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class e<E> extends c<E> {

    /* renamed from: p  reason: collision with root package name */
    public static final a f9421p = new a((g) null);

    /* renamed from: q  reason: collision with root package name */
    private static final Object[] f9422q = new Object[0];

    /* renamed from: m  reason: collision with root package name */
    private int f9423m;

    /* renamed from: n  reason: collision with root package name */
    private Object[] f9424n = f9422q;

    /* renamed from: o  reason: collision with root package name */
    private int f9425o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            return i12 - 2147483639 > 0 ? i11 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i12;
        }
    }

    private final int A(int i10) {
        Object[] objArr = this.f9424n;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void i(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f9424n.length;
        while (i10 < length && it.hasNext()) {
            this.f9424n[i10] = it.next();
            i10++;
        }
        int i11 = this.f9423m;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f9424n[i12] = it.next();
        }
        this.f9425o = size() + collection.size();
    }

    private final void k(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f9424n;
        i.c(objArr2, objArr, 0, this.f9423m, objArr2.length);
        Object[] objArr3 = this.f9424n;
        int length = objArr3.length;
        int i11 = this.f9423m;
        i.c(objArr3, objArr, length - i11, 0, i11);
        this.f9423m = 0;
        this.f9424n = objArr;
    }

    private final int l(int i10) {
        return i10 == 0 ? j.l(this.f9424n) : i10 - 1;
    }

    private final void o(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f9424n;
            if (i10 > objArr.length) {
                if (objArr == f9422q) {
                    this.f9424n = new Object[i.a(i10, 10)];
                } else {
                    k(f9421p.a(objArr.length, i10));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    private final int y(int i10) {
        if (i10 == j.l(this.f9424n)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int z(int i10) {
        return i10 < 0 ? i10 + this.f9424n.length : i10;
    }

    public final E B() {
        if (!isEmpty()) {
            E[] eArr = this.f9424n;
            int i10 = this.f9423m;
            E e10 = eArr[i10];
            eArr[i10] = null;
            this.f9423m = y(i10);
            this.f9425o = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E C() {
        if (isEmpty()) {
            return null;
        }
        return B();
    }

    public final E D() {
        if (!isEmpty()) {
            int A = A(this.f9423m + n.d(this));
            E[] eArr = this.f9424n;
            E e10 = eArr[A];
            eArr[A] = null;
            this.f9425o = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public void add(int i10, E e10) {
        b.f9412m.b(i10, size());
        if (i10 == size()) {
            g(e10);
        } else if (i10 == 0) {
            f(e10);
        } else {
            o(size() + 1);
            int A = A(this.f9423m + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int l10 = l(A);
                int l11 = l(this.f9423m);
                int i11 = this.f9423m;
                if (l10 >= i11) {
                    Object[] objArr = this.f9424n;
                    objArr[l11] = objArr[i11];
                    i.c(objArr, objArr, i11, i11 + 1, l10 + 1);
                } else {
                    Object[] objArr2 = this.f9424n;
                    i.c(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f9424n;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    i.c(objArr3, objArr3, 0, 1, l10 + 1);
                }
                this.f9424n[l10] = e10;
                this.f9423m = l11;
            } else {
                int A2 = A(this.f9423m + size());
                Object[] objArr4 = this.f9424n;
                if (A < A2) {
                    i.c(objArr4, objArr4, A + 1, A, A2);
                } else {
                    i.c(objArr4, objArr4, 1, 0, A2);
                    Object[] objArr5 = this.f9424n;
                    objArr5[0] = objArr5[objArr5.length - 1];
                    i.c(objArr5, objArr5, A + 1, A, objArr5.length - 1);
                }
                this.f9424n[A] = e10;
            }
            this.f9425o = size() + 1;
        }
    }

    public boolean add(E e10) {
        g(e10);
        return true;
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        l.e(collection, "elements");
        b.f9412m.b(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        o(size() + collection.size());
        int A = A(this.f9423m + size());
        int A2 = A(this.f9423m + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f9423m;
            int i12 = i11 - size;
            if (A2 < i11) {
                Object[] objArr = this.f9424n;
                i.c(objArr, objArr, i12, i11, objArr.length);
                Object[] objArr2 = this.f9424n;
                if (size >= A2) {
                    i.c(objArr2, objArr2, objArr2.length - size, 0, A2);
                } else {
                    i.c(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f9424n;
                    i.c(objArr3, objArr3, 0, size, A2);
                }
            } else if (i12 >= 0) {
                Object[] objArr4 = this.f9424n;
                i.c(objArr4, objArr4, i12, i11, A2);
            } else {
                Object[] objArr5 = this.f9424n;
                i12 += objArr5.length;
                int i13 = A2 - i11;
                int length = objArr5.length - i12;
                if (length >= i13) {
                    i.c(objArr5, objArr5, i12, i11, A2);
                } else {
                    i.c(objArr5, objArr5, i12, i11, i11 + length);
                    Object[] objArr6 = this.f9424n;
                    i.c(objArr6, objArr6, 0, this.f9423m + length, A2);
                }
            }
            this.f9423m = i12;
            i(z(A2 - size), collection);
        } else {
            int i14 = A2 + size;
            if (A2 < A) {
                int i15 = size + A;
                Object[] objArr7 = this.f9424n;
                if (i15 > objArr7.length) {
                    if (i14 >= objArr7.length) {
                        i14 -= objArr7.length;
                    } else {
                        int length2 = A - (i15 - objArr7.length);
                        i.c(objArr7, objArr7, 0, length2, A);
                        Object[] objArr8 = this.f9424n;
                        i.c(objArr8, objArr8, i14, A2, length2);
                    }
                }
                i.c(objArr7, objArr7, i14, A2, A);
            } else {
                Object[] objArr9 = this.f9424n;
                i.c(objArr9, objArr9, size, 0, A);
                Object[] objArr10 = this.f9424n;
                if (i14 >= objArr10.length) {
                    i.c(objArr10, objArr10, i14 - objArr10.length, A2, objArr10.length);
                } else {
                    i.c(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f9424n;
                    i.c(objArr11, objArr11, i14, A2, objArr11.length - size);
                }
            }
            i(A2, collection);
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        l.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        o(size() + collection.size());
        i(A(this.f9423m + size()), collection);
        return true;
    }

    public int c() {
        return this.f9425o;
    }

    public void clear() {
        int A = A(this.f9423m + size());
        int i10 = this.f9423m;
        if (i10 < A) {
            i.e(this.f9424n, null, i10, A);
        } else if (!isEmpty()) {
            Object[] objArr = this.f9424n;
            i.e(objArr, null, this.f9423m, objArr.length);
            i.e(this.f9424n, null, 0, A);
        }
        this.f9423m = 0;
        this.f9425o = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public E d(int i10) {
        b.f9412m.a(i10, size());
        if (i10 == n.d(this)) {
            return D();
        }
        if (i10 == 0) {
            return B();
        }
        int A = A(this.f9423m + i10);
        E e10 = this.f9424n[A];
        if (i10 < (size() >> 1)) {
            int i11 = this.f9423m;
            if (A >= i11) {
                Object[] objArr = this.f9424n;
                i.c(objArr, objArr, i11 + 1, i11, A);
            } else {
                Object[] objArr2 = this.f9424n;
                i.c(objArr2, objArr2, 1, 0, A);
                Object[] objArr3 = this.f9424n;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f9423m;
                i.c(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f9424n;
            int i13 = this.f9423m;
            objArr4[i13] = null;
            this.f9423m = y(i13);
        } else {
            int A2 = A(this.f9423m + n.d(this));
            Object[] objArr5 = this.f9424n;
            if (A <= A2) {
                i.c(objArr5, objArr5, A, A + 1, A2 + 1);
            } else {
                i.c(objArr5, objArr5, A, A + 1, objArr5.length);
                Object[] objArr6 = this.f9424n;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.c(objArr6, objArr6, 0, 1, A2 + 1);
            }
            this.f9424n[A2] = null;
        }
        this.f9425o = size() - 1;
        return e10;
    }

    public final void f(E e10) {
        o(size() + 1);
        int l10 = l(this.f9423m);
        this.f9423m = l10;
        this.f9424n[l10] = e10;
        this.f9425o = size() + 1;
    }

    public final void g(E e10) {
        o(size() + 1);
        this.f9424n[A(this.f9423m + size())] = e10;
        this.f9425o = size() + 1;
    }

    public E get(int i10) {
        b.f9412m.a(i10, size());
        return this.f9424n[A(this.f9423m + i10)];
    }

    public int indexOf(Object obj) {
        int A = A(this.f9423m + size());
        int i10 = this.f9423m;
        if (i10 < A) {
            while (i10 < A) {
                if (!l.a(obj, this.f9424n[i10])) {
                    i10++;
                }
            }
            return -1;
        } else if (i10 < A) {
            return -1;
        } else {
            int length = this.f9424n.length;
            while (true) {
                if (i10 >= length) {
                    int i11 = 0;
                    while (i11 < A) {
                        if (l.a(obj, this.f9424n[i11])) {
                            i10 = i11 + this.f9424n.length;
                        } else {
                            i11++;
                        }
                    }
                    return -1;
                } else if (l.a(obj, this.f9424n[i10])) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        return i10 - this.f9423m;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int lastIndexOf(Object obj) {
        int i10;
        int A = A(this.f9423m + size());
        int i11 = this.f9423m;
        if (i11 < A) {
            i10 = A - 1;
            if (i11 <= i10) {
                while (!l.a(obj, this.f9424n[i10])) {
                    if (i10 != i11) {
                        i10--;
                    }
                }
            }
            return -1;
        }
        if (i11 > A) {
            int i12 = A - 1;
            while (true) {
                if (-1 >= i12) {
                    int l10 = j.l(this.f9424n);
                    int i13 = this.f9423m;
                    if (i13 <= l10) {
                        while (!l.a(obj, this.f9424n[i10])) {
                            if (i10 != i13) {
                                l10 = i10 - 1;
                            }
                        }
                    }
                } else if (l.a(obj, this.f9424n[i12])) {
                    i10 = i12 + this.f9424n.length;
                    break;
                } else {
                    i12--;
                }
            }
        }
        return -1;
        return i10 - this.f9423m;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.l.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.f9424n
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.f9423m
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.A(r0)
            int r3 = r11.f9423m
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.f9424n
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.f9424n
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = 1
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.f9424n
            h8.i.e(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.f9424n
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.f9424n
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.f9424n
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.A(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.f9424n
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.f9424n
            r3[r5] = r6
            int r5 = r11.y(r5)
            goto L_0x0087
        L_0x0086:
            r7 = 1
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.f9423m
            int r5 = r5 - r12
            int r12 = r11.z(r5)
            r11.f9425o = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.e.removeAll(java.util.Collection):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.l.e(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.f9424n
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.f9423m
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.A(r0)
            int r3 = r11.f9423m
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.f9424n
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.f9424n
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.f9424n
            h8.i.e(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.f9424n
            int r5 = r5.length
            r6 = r3
            r7 = 0
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.f9424n
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.f9424n
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = 1
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.A(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.f9424n
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.f9424n
            r3[r5] = r6
            int r5 = r11.y(r5)
            goto L_0x0084
        L_0x0083:
            r7 = 1
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.f9423m
            int r5 = r5 - r12
            int r12 = r11.z(r5)
            r11.f9425o = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.e.retainAll(java.util.Collection):boolean");
    }

    public E set(int i10, E e10) {
        b.f9412m.a(i10, size());
        int A = A(this.f9423m + i10);
        E[] eArr = this.f9424n;
        E e11 = eArr[A];
        eArr[A] = e10;
        return e11;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public <T> T[] toArray(T[] tArr) {
        l.e(tArr, "array");
        if (tArr.length < size()) {
            tArr = g.a(tArr, size());
        }
        int A = A(this.f9423m + size());
        int i10 = this.f9423m;
        if (i10 < A) {
            i.d(this.f9424n, tArr, 0, i10, A, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f9424n;
            i.c(objArr, tArr, 0, this.f9423m, objArr.length);
            Object[] objArr2 = this.f9424n;
            i.c(objArr2, tArr, objArr2.length - this.f9423m, 0, A);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }
}
