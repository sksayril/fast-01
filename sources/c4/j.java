package c4;

import d4.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z3.g;

public class j {

    /* renamed from: a  reason: collision with root package name */
    private final List<i> f3617a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final int f3618b;

    public j(int i10) {
        this.f3618b = i10;
    }

    public List<f0.e.d.C0122e> a() {
        List<i> b10 = b();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10.size(); i10++) {
            arrayList.add(b10.get(i10).h());
        }
        return arrayList;
    }

    public synchronized List<i> b() {
        return Collections.unmodifiableList(new ArrayList(this.f3617a));
    }

    public synchronized boolean c(List<i> list) {
        this.f3617a.clear();
        if (list.size() > this.f3618b) {
            g f10 = g.f();
            f10.k("Ignored " + 0 + " entries when adding rollout assignments. Maximum allowable: " + this.f3618b);
            return this.f3617a.addAll(list.subList(0, this.f3618b));
        }
        return this.f3617a.addAll(list);
    }
}
