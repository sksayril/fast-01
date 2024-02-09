package a2;

import android.util.SparseArray;
import java.util.HashMap;
import n1.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f3a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static HashMap<d, Integer> f4b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f4b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f4b.put(d.VERY_LOW, 1);
        f4b.put(d.HIGHEST, 2);
        for (d next : f4b.keySet()) {
            f3a.append(f4b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f4b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f3a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
