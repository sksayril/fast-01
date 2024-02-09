package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class j9 extends z6<String> implements i9, RandomAccess {

    /* renamed from: o  reason: collision with root package name */
    private static final j9 f5378o;
    @Deprecated

    /* renamed from: p  reason: collision with root package name */
    private static final i9 f5379p;

    /* renamed from: n  reason: collision with root package name */
    private final List<Object> f5380n;

    static {
        j9 j9Var = new j9(false);
        f5378o = j9Var;
        f5379p = j9Var;
    }

    public j9(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private j9(ArrayList<Object> arrayList) {
        this.f5380n = arrayList;
    }

    private j9(boolean z9) {
        super(false);
        this.f5380n = Collections.emptyList();
    }

    private static String d(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof f7 ? ((f7) obj).D() : r8.h((byte[]) obj);
    }

    public final List<?> a() {
        return Collections.unmodifiableList(this.f5380n);
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        c();
        this.f5380n.add(i10, (String) obj);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof i9) {
            collection = ((i9) collection).a();
        }
        boolean addAll = this.f5380n.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final /* bridge */ /* synthetic */ boolean b() {
        return super.b();
    }

    public final void clear() {
        c();
        this.f5380n.clear();
        this.modCount++;
    }

    public final /* synthetic */ y8 e(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f5380n);
            return new j9((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i10) {
        Object obj = this.f5380n.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof f7) {
            f7 f7Var = (f7) obj;
            String D = f7Var.D();
            if (f7Var.E()) {
                this.f5380n.set(i10, D);
            }
            return D;
        }
        byte[] bArr = (byte[]) obj;
        String h10 = r8.h(bArr);
        if (r8.i(bArr)) {
            this.f5380n.set(i10, h10);
        }
        return h10;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final Object j(int i10) {
        return this.f5380n.get(i10);
    }

    public final i9 p() {
        return b() ? new vb(this) : this;
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        Object remove = this.f5380n.remove(i10);
        this.modCount++;
        return d(remove);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        c();
        return d(this.f5380n.set(i10, (String) obj));
    }

    public final int size() {
        return this.f5380n.size();
    }

    public final void v(f7 f7Var) {
        c();
        this.f5380n.add(f7Var);
        this.modCount++;
    }
}
