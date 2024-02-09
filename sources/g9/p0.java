package g9;

import b9.l2;
import j8.g;
import kotlin.jvm.internal.l;

final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public final g f9021a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f9022b;

    /* renamed from: c  reason: collision with root package name */
    private final l2<Object>[] f9023c;

    /* renamed from: d  reason: collision with root package name */
    private int f9024d;

    public p0(g gVar, int i10) {
        this.f9021a = gVar;
        this.f9022b = new Object[i10];
        this.f9023c = new l2[i10];
    }

    public final void a(l2<?> l2Var, Object obj) {
        Object[] objArr = this.f9022b;
        int i10 = this.f9024d;
        objArr[i10] = obj;
        l2<Object>[] l2VarArr = this.f9023c;
        this.f9024d = i10 + 1;
        l.c(l2Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        l2VarArr[i10] = l2Var;
    }

    public final void b(g gVar) {
        int length = this.f9023c.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                l2<Object> l2Var = this.f9023c[length];
                l.b(l2Var);
                l2Var.z(gVar, this.f9022b[length]);
                if (i10 >= 0) {
                    length = i10;
                } else {
                    return;
                }
            }
        }
    }
}
