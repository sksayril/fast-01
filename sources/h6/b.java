package h6;

import g6.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, Integer> f9383a = new HashMap();

    b() {
    }

    /* access modifiers changed from: package-private */
    public int[] a() {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (Map.Entry next : this.f9383a.entrySet()) {
            if (((Integer) next.getValue()).intValue() > i10) {
                i10 = ((Integer) next.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) next.getValue()).intValue() != i10) {
            }
            arrayList.add(next.getKey());
        }
        return a.b(arrayList);
    }

    /* access modifiers changed from: package-private */
    public void b(int i10) {
        Integer num = this.f9383a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f9383a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }
}
