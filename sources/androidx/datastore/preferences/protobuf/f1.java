package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;
import java.util.List;
import java.util.Map;

interface f1 {
    int A();

    int B();

    @Deprecated
    <T> void C(List<T> list, g1<T> g1Var, p pVar);

    boolean D();

    int E();

    void F(List<h> list);

    void G(List<Double> list);

    <T> void H(List<T> list, g1<T> g1Var, p pVar);

    void I(List<Long> list);

    void J(List<Long> list);

    long K();

    String L();

    void M(List<Long> list);

    void N(List<Integer> list);

    void O(List<Integer> list);

    @Deprecated
    <T> T P(g1<T> g1Var, p pVar);

    <T> T a(g1<T> g1Var, p pVar);

    <K, V> void b(Map<K, V> map, k0.a<K, V> aVar, p pVar);

    void c(List<Integer> list);

    int d();

    int e();

    long f();

    void g(List<Integer> list);

    long h();

    <T> T i(Class<T> cls, p pVar);

    void j(List<Integer> list);

    int k();

    void l(List<Long> list);

    long m();

    void n(List<Integer> list);

    void o(List<Boolean> list);

    String p();

    int q();

    boolean r();

    double readDouble();

    float readFloat();

    int s();

    void t(List<String> list);

    long u();

    void v(List<Long> list);

    @Deprecated
    <T> T w(Class<T> cls, p pVar);

    void x(List<String> list);

    h y();

    void z(List<Float> list);
}
