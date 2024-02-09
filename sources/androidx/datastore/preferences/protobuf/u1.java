package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;
import java.util.List;
import java.util.Map;

interface u1 {

    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i10, float f10);

    void B(int i10, List<String> list);

    @Deprecated
    void C(int i10, List<?> list, g1 g1Var);

    @Deprecated
    void D(int i10);

    void E(int i10, String str);

    void F(int i10, List<Integer> list, boolean z9);

    void G(int i10, long j10);

    void H(int i10, int i11);

    void I(int i10, List<Long> list, boolean z9);

    void J(int i10, List<Integer> list, boolean z9);

    void K(int i10, List<Double> list, boolean z9);

    <K, V> void L(int i10, k0.a<K, V> aVar, Map<K, V> map);

    void M(int i10, int i11);

    void N(int i10, List<h> list);

    @Deprecated
    void O(int i10, Object obj, g1 g1Var);

    void a(int i10, List<Integer> list, boolean z9);

    void b(int i10, List<Float> list, boolean z9);

    void c(int i10, long j10);

    void d(int i10, boolean z9);

    void e(int i10, int i11);

    void f(int i10, Object obj);

    void g(int i10, int i11);

    @Deprecated
    void h(int i10);

    void i(int i10, int i11);

    void j(int i10, List<Long> list, boolean z9);

    void k(int i10, List<Integer> list, boolean z9);

    void l(int i10, h hVar);

    void m(int i10, int i11);

    void n(int i10, double d10);

    void o(int i10, long j10);

    void p(int i10, List<Long> list, boolean z9);

    void q(int i10, List<Integer> list, boolean z9);

    void r(int i10, List<Long> list, boolean z9);

    void s(int i10, Object obj, g1 g1Var);

    void t(int i10, List<Boolean> list, boolean z9);

    void u(int i10, List<Integer> list, boolean z9);

    void v(int i10, List<Long> list, boolean z9);

    void w(int i10, long j10);

    a x();

    void y(int i10, List<?> list, g1 g1Var);

    void z(int i10, long j10);
}
