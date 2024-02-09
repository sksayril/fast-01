package com.google.common.collect;

import p3.h;

final class m0<E> extends q<E> {

    /* renamed from: o  reason: collision with root package name */
    final transient E f7154o;

    m0(E e10) {
        this.f7154o = h.i(e10);
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        objArr[i10] = this.f7154o;
        return i10 + 1;
    }

    public boolean contains(Object obj) {
        return this.f7154o.equals(obj);
    }

    public final int hashCode() {
        return this.f7154o.hashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }

    /* renamed from: k */
    public q0<E> iterator() {
        return v.d(this.f7154o);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        String obj = this.f7154o.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
