package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class f0 extends c<String> implements g0, RandomAccess {

    /* renamed from: o  reason: collision with root package name */
    private static final f0 f1923o;

    /* renamed from: p  reason: collision with root package name */
    public static final g0 f1924p;

    /* renamed from: n  reason: collision with root package name */
    private final List<Object> f1925n;

    static {
        f0 f0Var = new f0();
        f1923o = f0Var;
        f0Var.m();
        f1924p = f0Var;
    }

    public f0() {
        this(10);
    }

    public f0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private f0(ArrayList<Object> arrayList) {
        this.f1925n = arrayList;
    }

    private static String f(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof h ? ((h) obj).K() : a0.j((byte[]) obj);
    }

    public boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof g0) {
            collection = ((g0) collection).w();
        }
        boolean addAll = this.f1925n.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        c();
        this.f1925n.clear();
        this.modCount++;
    }

    /* renamed from: d */
    public void add(int i10, String str) {
        c();
        this.f1925n.add(i10, str);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: g */
    public String get(int i10) {
        Object obj = this.f1925n.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            String K = hVar.K();
            if (hVar.z()) {
                this.f1925n.set(i10, K);
            }
            return K;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = a0.j(bArr);
        if (a0.g(bArr)) {
            this.f1925n.set(i10, j10);
        }
        return j10;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public f0 q(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f1925n);
            return new f0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public String remove(int i10) {
        c();
        Object remove = this.f1925n.remove(i10);
        this.modCount++;
        return f(remove);
    }

    /* renamed from: l */
    public String set(int i10, String str) {
        c();
        return f(this.f1925n.set(i10, str));
    }

    public g0 r() {
        return x() ? new q1(this) : this;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f1925n.size();
    }

    public void t(h hVar) {
        c();
        this.f1925n.add(hVar);
        this.modCount++;
    }

    public Object u(int i10) {
        return this.f1925n.get(i10);
    }

    public List<?> w() {
        return Collections.unmodifiableList(this.f1925n);
    }

    public /* bridge */ /* synthetic */ boolean x() {
        return super.x();
    }
}
