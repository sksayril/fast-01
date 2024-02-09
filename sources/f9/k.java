package f9;

import b9.r1;
import g9.d0;
import j8.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import r8.p;

public final class k {

    static final class a extends m implements p<Integer, g.b, Integer> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ i<?> f8827m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i<?> iVar) {
            super(2);
            this.f8827m = iVar;
        }

        public final Integer b(int i10, g.b bVar) {
            g.c key = bVar.getKey();
            g.b a10 = this.f8827m.f8820n.a(key);
            if (key != r1.f3485c) {
                return Integer.valueOf(bVar != a10 ? Integer.MIN_VALUE : i10 + 1);
            }
            r1 r1Var = (r1) a10;
            l.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            r1 b10 = k.b((r1) bVar, r1Var);
            if (b10 == r1Var) {
                if (r1Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b10 + ", expected child of " + r1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(i<?> iVar, g gVar) {
        if (((Number) gVar.k(0, new a(iVar))).intValue() != iVar.f8821o) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + iVar.f8820n + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final r1 b(r1 r1Var, r1 r1Var2) {
        while (r1Var != null) {
            if (r1Var == r1Var2 || !(r1Var instanceof d0)) {
                return r1Var;
            }
            r1Var = r1Var.getParent();
        }
        return null;
    }
}
