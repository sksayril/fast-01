package b0;

import a0.b;
import android.content.Context;
import b9.j0;
import b9.k0;
import b9.k2;
import b9.r1;
import b9.x0;
import java.util.List;
import kotlin.jvm.internal.m;
import r8.l;
import z.d;
import z.f;

public final class a {

    /* renamed from: b0.a$a  reason: collision with other inner class name */
    static final class C0068a extends m implements l<Context, List<? extends d<c0.d>>> {

        /* renamed from: m  reason: collision with root package name */
        public static final C0068a f3361m = new C0068a();

        C0068a() {
            super(1);
        }

        /* renamed from: b */
        public final List<d<c0.d>> invoke(Context context) {
            kotlin.jvm.internal.l.e(context, "it");
            return n.c();
        }
    }

    public static final t8.a<Context, f<c0.d>> a(String str, b<c0.d> bVar, l<? super Context, ? extends List<? extends d<c0.d>>> lVar, j0 j0Var) {
        kotlin.jvm.internal.l.e(str, "name");
        kotlin.jvm.internal.l.e(lVar, "produceMigrations");
        kotlin.jvm.internal.l.e(j0Var, "scope");
        return new c(str, bVar, lVar, j0Var);
    }

    public static /* synthetic */ t8.a b(String str, b bVar, l lVar, j0 j0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar = C0068a.f3361m;
        }
        if ((i10 & 8) != 0) {
            x0 x0Var = x0.f3495a;
            j0Var = k0.a(x0.b().t(k2.b((r1) null, 1, (Object) null)));
        }
        return a(str, bVar, lVar, j0Var);
    }
}
