package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class wa {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f5681a = E();

    /* renamed from: b  reason: collision with root package name */
    private static final ub<?, ?> f5682b = A();

    /* renamed from: c  reason: collision with root package name */
    private static final ub<?, ?> f5683c = new wb();

    private static ub<?, ?> A() {
        try {
            Class<?> I = I();
            if (I == null) {
                return null;
            }
            return (ub) I.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void B(int i10, List<Integer> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.t(i10, list, z9);
        }
    }

    static int C(int i10, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * y7.T(i10, 0);
    }

    static int D(List<?> list) {
        return list.size() << 3;
    }

    private static Class<?> E() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void F(int i10, List<Integer> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.m(i10, list, z9);
        }
    }

    static int G(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return H(list) + (size * y7.w0(i10));
    }

    static int H(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t8) {
            t8 t8Var = (t8) list;
            i10 = 0;
            while (i11 < size) {
                i10 += y7.k0(t8Var.d(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + y7.k0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    private static Class<?> I() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void J(int i10, List<Long> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.a(i10, list, z9);
        }
    }

    static int K(int i10, List<Long> list, boolean z9) {
        if (list.size() == 0) {
            return 0;
        }
        return L(list) + (list.size() * y7.w0(i10));
    }

    static int L(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r9) {
            r9 r9Var = (r9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += y7.e0(r9Var.j(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + y7.e0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void M(int i10, List<Float> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.C(i10, list, z9);
        }
    }

    static int N(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return O(list) + (size * y7.w0(i10));
    }

    static int O(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t8) {
            t8 t8Var = (t8) list;
            i10 = 0;
            while (i11 < size) {
                i10 += y7.s0(t8Var.d(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + y7.s0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void P(int i10, List<Integer> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.u(i10, list, z9);
        }
    }

    static int Q(int i10, List<Long> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return R(list) + (size * y7.w0(i10));
    }

    static int R(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r9) {
            r9 r9Var = (r9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += y7.n0(r9Var.j(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + y7.n0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void S(int i10, List<Long> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.o(i10, list, z9);
        }
    }

    static int T(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return U(list) + (size * y7.w0(i10));
    }

    static int U(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t8) {
            t8 t8Var = (t8) list;
            i10 = 0;
            while (i11 < size) {
                i10 += y7.z0(t8Var.d(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + y7.z0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void V(int i10, List<Integer> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.f(i10, list, z9);
        }
    }

    static int W(int i10, List<Long> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return X(list) + (size * y7.w0(i10));
    }

    static int X(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r9) {
            r9 r9Var = (r9) list;
            i10 = 0;
            while (i11 < size) {
                i10 += y7.r0(r9Var.j(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + y7.r0(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static void Y(int i10, List<Long> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.E(i10, list, z9);
        }
    }

    public static void Z(int i10, List<Integer> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.G(i10, list, z9);
        }
    }

    static int a(int i10, Object obj, va vaVar) {
        return obj instanceof g9 ? y7.z(i10, (g9) obj) : y7.V(i10, (da) obj, vaVar);
    }

    public static void a0(int i10, List<Long> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.x(i10, list, z9);
        }
    }

    static int b(int i10, List<f7> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w02 = size * y7.w0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            w02 += y7.E(list.get(i11));
        }
        return w02;
    }

    public static void b0(int i10, List<Integer> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.p(i10, list, z9);
        }
    }

    static int c(int i10, List<da> list, va vaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += y7.B(i10, list.get(i12), vaVar);
        }
        return i11;
    }

    public static void c0(int i10, List<Long> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.h(i10, list, z9);
        }
    }

    static int d(int i10, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * y7.D(i10, true);
    }

    static int e(List<?> list) {
        return list.size();
    }

    public static ub<?, ?> f() {
        return f5682b;
    }

    static <UT, UB> UB g(Object obj, int i10, int i11, UB ub, ub<UT, UB> ubVar) {
        if (ub == null) {
            ub = ubVar.i(obj);
        }
        ubVar.f(ub, i10, (long) i11);
        return ub;
    }

    static <UT, UB> UB h(Object obj, int i10, List<Integer> list, x8 x8Var, UB ub, ub<UT, UB> ubVar) {
        if (x8Var == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (x8Var.e(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub = g(obj, i10, intValue, ub, ubVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!x8Var.e(intValue2)) {
                    ub = g(obj, i10, intValue2, ub, ubVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static void i(int i10, List<f7> list, qc qcVar) {
        if (list != null && !list.isEmpty()) {
            qcVar.I(i10, list);
        }
    }

    public static void j(int i10, List<?> list, qc qcVar, va vaVar) {
        if (list != null && !list.isEmpty()) {
            qcVar.K(i10, list, vaVar);
        }
    }

    public static void k(int i10, List<Boolean> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.l(i10, list, z9);
        }
    }

    static <T, FT extends k8<FT>> void l(e8<FT> e8Var, T t9, T t10) {
        i8<FT> b10 = e8Var.b(t10);
        if (!b10.f5357a.isEmpty()) {
            e8Var.f(t9).h(b10);
        }
    }

    static <T> void m(aa aaVar, T t9, T t10, long j10) {
        ac.j(t9, j10, aaVar.c(ac.B(t9, j10), ac.B(t10, j10)));
    }

    static <T, UT, UB> void n(ub<UT, UB> ubVar, T t9, T t10) {
        ubVar.j(t9, ubVar.b(ubVar.k(t9), ubVar.k(t10)));
    }

    public static void o(Class<?> cls) {
        Class<?> cls2;
        if (!p8.class.isAssignableFrom(cls) && (cls2 = f5681a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean p(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int q(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int w02 = y7.w0(i10) * size;
        if (list instanceof i9) {
            i9 i9Var = (i9) list;
            while (i11 < size) {
                Object j10 = i9Var.j(i11);
                w02 += j10 instanceof f7 ? y7.E((f7) j10) : y7.G((String) j10);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                w02 += obj instanceof f7 ? y7.E((f7) obj) : y7.G((String) obj);
                i11++;
            }
        }
        return w02;
    }

    static int r(int i10, List<?> list, va vaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w02 = y7.w0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            w02 += obj instanceof g9 ? y7.h((g9) obj) : y7.i((da) obj, vaVar);
        }
        return w02;
    }

    static int s(int i10, List<Integer> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return t(list) + (size * y7.w0(i10));
    }

    static int t(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof t8) {
            t8 t8Var = (t8) list;
            i10 = 0;
            while (i11 < size) {
                i10 += y7.b0(t8Var.d(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + y7.b0(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static ub<?, ?> u() {
        return f5683c;
    }

    public static void v(int i10, List<String> list, qc qcVar) {
        if (list != null && !list.isEmpty()) {
            qcVar.v(i10, list);
        }
    }

    public static void w(int i10, List<?> list, qc qcVar, va vaVar) {
        if (list != null && !list.isEmpty()) {
            qcVar.y(i10, list, vaVar);
        }
    }

    public static void x(int i10, List<Double> list, qc qcVar, boolean z9) {
        if (list != null && !list.isEmpty()) {
            qcVar.A(i10, list, z9);
        }
    }

    static int y(int i10, List<?> list, boolean z9) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * y7.l0(i10, 0);
    }

    static int z(List<?> list) {
        return list.size() << 2;
    }
}
