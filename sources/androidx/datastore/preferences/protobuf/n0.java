package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;
import java.util.Map;

class n0 implements m0 {
    n0() {
    }

    private static <K, V> int i(int i10, Object obj, Object obj2) {
        l0 l0Var = (l0) obj;
        k0 k0Var = (k0) obj2;
        int i11 = 0;
        if (l0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : l0Var.entrySet()) {
            i11 += k0Var.a(i10, entry.getKey(), entry.getValue());
        }
        return i11;
    }

    private static <K, V> l0<K, V> j(Object obj, Object obj2) {
        l0<K, V> l0Var = (l0) obj;
        l0 l0Var2 = (l0) obj2;
        if (!l0Var2.isEmpty()) {
            if (!l0Var.n()) {
                l0Var = l0Var.r();
            }
            l0Var.q(l0Var2);
        }
        return l0Var;
    }

    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    public Object b(Object obj) {
        return l0.f().r();
    }

    public int c(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    public boolean d(Object obj) {
        return !((l0) obj).n();
    }

    public Object e(Object obj) {
        ((l0) obj).p();
        return obj;
    }

    public k0.a<?, ?> f(Object obj) {
        return ((k0) obj).c();
    }

    public Map<?, ?> g(Object obj) {
        return (l0) obj;
    }

    public Map<?, ?> h(Object obj) {
        return (l0) obj;
    }
}
