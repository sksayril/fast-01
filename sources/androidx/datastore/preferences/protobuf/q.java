package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u.b;
import java.util.Map;

abstract class q<T extends u.b<T>> {
    q() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(Map.Entry<?, ?> entry);

    /* access modifiers changed from: package-private */
    public abstract Object b(p pVar, r0 r0Var, int i10);

    /* access modifiers changed from: package-private */
    public abstract u<T> c(Object obj);

    /* access modifiers changed from: package-private */
    public abstract u<T> d(Object obj);

    /* access modifiers changed from: package-private */
    public abstract boolean e(r0 r0Var);

    /* access modifiers changed from: package-private */
    public abstract void f(Object obj);

    /* access modifiers changed from: package-private */
    public abstract <UT, UB> UB g(f1 f1Var, Object obj, p pVar, u<T> uVar, UB ub, n1<UT, UB> n1Var);

    /* access modifiers changed from: package-private */
    public abstract void h(f1 f1Var, Object obj, p pVar, u<T> uVar);

    /* access modifiers changed from: package-private */
    public abstract void i(h hVar, Object obj, p pVar, u<T> uVar);

    /* access modifiers changed from: package-private */
    public abstract void j(u1 u1Var, Map.Entry<?, ?> entry);
}
