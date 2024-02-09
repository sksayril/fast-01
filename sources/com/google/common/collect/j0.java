package com.google.common.collect;

final class j0<E> extends q<E> {

    /* renamed from: t  reason: collision with root package name */
    private static final Object[] f7140t;

    /* renamed from: u  reason: collision with root package name */
    static final j0<Object> f7141u;

    /* renamed from: o  reason: collision with root package name */
    final transient Object[] f7142o;

    /* renamed from: p  reason: collision with root package name */
    private final transient int f7143p;

    /* renamed from: q  reason: collision with root package name */
    final transient Object[] f7144q;

    /* renamed from: r  reason: collision with root package name */
    private final transient int f7145r;

    /* renamed from: s  reason: collision with root package name */
    private final transient int f7146s;

    static {
        Object[] objArr = new Object[0];
        f7140t = objArr;
        f7141u = new j0(objArr, 0, objArr, 0, 0);
    }

    j0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f7142o = objArr;
        this.f7143p = i10;
        this.f7144q = objArr2;
        this.f7145r = i11;
        this.f7146s = i12;
    }

    /* access modifiers changed from: package-private */
    public n<E> A() {
        return n.o(this.f7142o, this.f7146s);
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        System.arraycopy(this.f7142o, 0, objArr, i10, this.f7146s);
        return i10 + this.f7146s;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f7144q;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c10 = l.c(obj);
        while (true) {
            int i10 = c10 & this.f7145r;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f7142o;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f7146s;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return 0;
    }

    public int hashCode() {
        return this.f7143p;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }

    /* renamed from: k */
    public q0<E> iterator() {
        return l().iterator();
    }

    public int size() {
        return this.f7146s;
    }
}
