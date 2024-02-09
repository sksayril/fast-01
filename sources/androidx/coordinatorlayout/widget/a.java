package androidx.coordinatorlayout.widget;

import androidx.core.util.e;
import androidx.core.util.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p.g;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e<ArrayList<T>> f1201a = new f(10);

    /* renamed from: b  reason: collision with root package name */
    private final g<T, ArrayList<T>> f1202b = new g<>();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList<T> f1203c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<T> f1204d = new HashSet<>();

    private void e(T t9, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t9)) {
            if (!hashSet.contains(t9)) {
                hashSet.add(t9);
                ArrayList arrayList2 = this.f1202b.get(t9);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        e(arrayList2.get(i10), arrayList, hashSet);
                    }
                }
                hashSet.remove(t9);
                arrayList.add(t9);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    private ArrayList<T> f() {
        ArrayList<T> b10 = this.f1201a.b();
        return b10 == null ? new ArrayList<>() : b10;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1201a.a(arrayList);
    }

    public void a(T t9, T t10) {
        if (!this.f1202b.containsKey(t9) || !this.f1202b.containsKey(t10)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f1202b.get(t9);
        if (arrayList == null) {
            arrayList = f();
            this.f1202b.put(t9, arrayList);
        }
        arrayList.add(t10);
    }

    public void b(T t9) {
        if (!this.f1202b.containsKey(t9)) {
            this.f1202b.put(t9, null);
        }
    }

    public void c() {
        int size = this.f1202b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList m10 = this.f1202b.m(i10);
            if (m10 != null) {
                k(m10);
            }
        }
        this.f1202b.clear();
    }

    public boolean d(T t9) {
        return this.f1202b.containsKey(t9);
    }

    public List g(T t9) {
        return this.f1202b.get(t9);
    }

    public List<T> h(T t9) {
        int size = this.f1202b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList m10 = this.f1202b.m(i10);
            if (m10 != null && m10.contains(t9)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1202b.i(i10));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f1203c.clear();
        this.f1204d.clear();
        int size = this.f1202b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f1202b.i(i10), this.f1203c, this.f1204d);
        }
        return this.f1203c;
    }

    public boolean j(T t9) {
        int size = this.f1202b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList m10 = this.f1202b.m(i10);
            if (m10 != null && m10.contains(t9)) {
                return true;
            }
        }
        return false;
    }
}
