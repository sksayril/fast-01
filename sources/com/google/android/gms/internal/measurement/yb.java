package com.google.android.gms.internal.measurement;

import java.util.ListIterator;

final class yb implements ListIterator<String> {

    /* renamed from: m  reason: collision with root package name */
    private ListIterator<String> f5722m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ int f5723n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ vb f5724o;

    yb(vb vbVar, int i10) {
        this.f5724o = vbVar;
        this.f5723n = i10;
        this.f5722m = vbVar.f5668m.listIterator(i10);
    }

    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f5722m.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f5722m.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f5722m.next();
    }

    public final int nextIndex() {
        return this.f5722m.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f5722m.previous();
    }

    public final int previousIndex() {
        return this.f5722m.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
