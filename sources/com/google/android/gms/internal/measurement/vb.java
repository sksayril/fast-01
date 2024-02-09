package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class vb extends AbstractList<String> implements i9, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final i9 f5668m;

    public vb(i9 i9Var) {
        this.f5668m = i9Var;
    }

    public final List<?> a() {
        return this.f5668m.a();
    }

    public final /* synthetic */ Object get(int i10) {
        return (String) this.f5668m.get(i10);
    }

    public final Iterator<String> iterator() {
        return new xb(this);
    }

    public final Object j(int i10) {
        return this.f5668m.j(i10);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new yb(this, i10);
    }

    public final i9 p() {
        return this;
    }

    public final int size() {
        return this.f5668m.size();
    }

    public final void v(f7 f7Var) {
        throw new UnsupportedOperationException();
    }
}
