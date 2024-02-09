package com.google.common.collect;

import java.util.Objects;
import p3.h;

class h0<E> extends n<E> {

    /* renamed from: q  reason: collision with root package name */
    static final n<Object> f7122q = new h0(new Object[0], 0);

    /* renamed from: o  reason: collision with root package name */
    final transient Object[] f7123o;

    /* renamed from: p  reason: collision with root package name */
    private final transient int f7124p;

    h0(Object[] objArr, int i10) {
        this.f7123o = objArr;
        this.f7124p = i10;
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        System.arraycopy(this.f7123o, 0, objArr, i10, this.f7124p);
        return i10 + this.f7124p;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f7123o;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f7124p;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return 0;
    }

    public E get(int i10) {
        h.g(i10, this.f7124p);
        E e10 = this.f7123o[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }

    public int size() {
        return this.f7124p;
    }
}
