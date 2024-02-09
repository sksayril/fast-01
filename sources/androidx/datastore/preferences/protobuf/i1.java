package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class i1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f1967a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final n1<?, ?> f1968b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final n1<?, ?> f1969c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final n1<?, ?> f1970d = new p1();

    static <UT, UB> UB A(int i10, List<Integer> list, a0.e eVar, UB ub, n1<UT, UB> n1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = L(i10, intValue, ub, n1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = L(i10, intValue2, ub, n1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static n1<?, ?> C(boolean z9) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (n1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z9)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends u.b<FT>> void E(q<FT> qVar, T t9, T t10) {
        u<FT> c10 = qVar.c(t10);
        if (!c10.n()) {
            qVar.d(t9).u(c10);
        }
    }

    static <T> void F(m0 m0Var, T t9, T t10, long j10) {
        r1.O(t9, j10, m0Var.a(r1.A(t9, j10), r1.A(t10, j10)));
    }

    static <T, UT, UB> void G(n1<UT, UB> n1Var, T t9, T t10) {
        n1Var.p(t9, n1Var.k(n1Var.g(t9), n1Var.g(t10)));
    }

    public static n1<?, ?> H() {
        return f1968b;
    }

    public static n1<?, ?> I() {
        return f1969c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!y.class.isAssignableFrom(cls) && (cls2 = f1967a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB L(int i10, int i11, UB ub, n1<UT, UB> n1Var) {
        if (ub == null) {
            ub = n1Var.n();
        }
        n1Var.e(ub, i10, (long) i11);
        return ub;
    }

    public static n1<?, ?> M() {
        return f1970d;
    }

    public static void N(int i10, List<Boolean> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.t(i10, list, z9);
        }
    }

    public static void O(int i10, List<h> list, u1 u1Var) {
        if (list != null && !list.isEmpty()) {
            u1Var.N(i10, list);
        }
    }

    public static void P(int i10, List<Double> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.K(i10, list, z9);
        }
    }

    public static void Q(int i10, List<Integer> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.J(i10, list, z9);
        }
    }

    public static void R(int i10, List<Integer> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.q(i10, list, z9);
        }
    }

    public static void S(int i10, List<Long> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.j(i10, list, z9);
        }
    }

    public static void T(int i10, List<Float> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.b(i10, list, z9);
        }
    }

    public static void U(int i10, List<?> list, u1 u1Var, g1 g1Var) {
        if (list != null && !list.isEmpty()) {
            u1Var.C(i10, list, g1Var);
        }
    }

    public static void V(int i10, List<Integer> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.a(i10, list, z9);
        }
    }

    public static void W(int i10, List<Long> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.I(i10, list, z9);
        }
    }

    public static void X(int i10, List<?> list, u1 u1Var, g1 g1Var) {
        if (list != null && !list.isEmpty()) {
            u1Var.y(i10, list, g1Var);
        }
    }

    public static void Y(int i10, List<Integer> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.k(i10, list, z9);
        }
    }

    public static void Z(int i10, List<Long> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.p(i10, list, z9);
        }
    }

    static int a(int i10, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? k.V(i10) + k.C(size) : size * k.d(i10, true);
    }

    public static void a0(int i10, List<Integer> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.F(i10, list, z9);
        }
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.v(i10, list, z9);
        }
    }

    static int c(int i10, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * k.V(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            V += k.h(list.get(i11));
        }
        return V;
    }

    public static void c0(int i10, List<String> list, u1 u1Var) {
        if (list != null && !list.isEmpty()) {
            u1Var.B(i10, list);
        }
    }

    static int d(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        int V = k.V(i10);
        return z9 ? V + k.C(e10) : e10 + (size * V);
    }

    public static void d0(int i10, List<Integer> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.u(i10, list, z9);
        }
    }

    static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.l(zVar.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, u1 u1Var, boolean z9) {
        if (list != null && !list.isEmpty()) {
            u1Var.r(i10, list, z9);
        }
    }

    static int f(int i10, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? k.V(i10) + k.C(size * 4) : size * k.m(i10, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i10, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z9 ? k.V(i10) + k.C(size * 8) : size * k.o(i10, 0);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i10, List<r0> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += k.s(i10, list.get(i12), g1Var);
        }
        return i11;
    }

    static int k(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        int V = k.V(i10);
        return z9 ? V + k.C(l10) : l10 + (size * V);
    }

    static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.w(zVar.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int m(int i10, List<Long> list, boolean z9) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        return z9 ? k.V(i10) + k.C(n10) : n10 + (list.size() * k.V(i10));
    }

    static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.y(i0Var.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int o(int i10, Object obj, g1 g1Var) {
        return obj instanceof e0 ? k.A(i10, (e0) obj) : k.F(i10, (r0) obj, g1Var);
    }

    static int p(int i10, List<?> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = k.V(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            V += obj instanceof e0 ? k.B((e0) obj) : k.H((r0) obj, g1Var);
        }
        return V;
    }

    static int q(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r9 = r(list);
        int V = k.V(i10);
        return z9 ? V + k.C(r9) : r9 + (size * V);
    }

    static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.Q(zVar.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.Q(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int s(int i10, List<Long> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t9 = t(list);
        int V = k.V(i10);
        return z9 ? V + k.C(t9) : t9 + (size * V);
    }

    static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.S(i0Var.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.S(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int V = k.V(i10) * size;
        if (list instanceof g0) {
            g0 g0Var = (g0) list;
            while (i11 < size) {
                Object u9 = g0Var.u(i11);
                V += u9 instanceof h ? k.h((h) u9) : k.U((String) u9);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                V += obj instanceof h ? k.h((h) obj) : k.U((String) obj);
                i11++;
            }
        }
        return V;
    }

    static int v(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w9 = w(list);
        int V = k.V(i10);
        return z9 ? V + k.C(w9) : w9 + (size * V);
    }

    static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof z) {
            z zVar = (z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.X(zVar.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.X(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int x(int i10, List<Long> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y9 = y(list);
        int V = k.V(i10);
        return z9 ? V + k.C(y9) : y9 + (size * V);
    }

    static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof i0) {
            i0 i0Var = (i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += k.Z(i0Var.o(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + k.Z(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    static <UT, UB> UB z(int i10, List<Integer> list, a0.d<?> dVar, UB ub, n1<UT, UB> n1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = L(i10, intValue, ub, n1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = L(i10, intValue2, ub, n1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
