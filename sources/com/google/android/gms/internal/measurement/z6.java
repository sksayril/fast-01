package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class z6<E> extends AbstractList<E> implements y8<E> {

    /* renamed from: m  reason: collision with root package name */
    private boolean f5739m;

    z6() {
        this(true);
    }

    z6(boolean z9) {
        this.f5739m = z9;
    }

    public boolean add(E e10) {
        c();
        return super.add(e10);
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        c();
        return super.addAll(i10, collection);
    }

    public boolean addAll(Collection<? extends E> collection) {
        c();
        return super.addAll(collection);
    }

    public boolean b() {
        return this.f5739m;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (!this.f5739m) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        c();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public abstract E remove(int i10);

    public boolean remove(Object obj) {
        c();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        c();
        return super.retainAll(collection);
    }

    public final void s() {
        if (this.f5739m) {
            this.f5739m = false;
        }
    }
}
