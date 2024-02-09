package c0;

import a0.b;
import b9.j0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import z.d;
import z.f;
import z.g;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3544a = new c();

    static final class a extends m implements r8.a<File> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ r8.a<File> f3545m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r8.a<? extends File> aVar) {
            super(0);
            this.f3545m = aVar;
        }

        /* renamed from: b */
        public final File invoke() {
            File invoke = this.f3545m.invoke();
            String a10 = f.a(invoke);
            h hVar = h.f3552a;
            if (l.a(a10, hVar.f())) {
                return invoke;
            }
            throw new IllegalStateException(("File extension for file: " + invoke + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    private c() {
    }

    public final f<d> a(b<d> bVar, List<? extends d<d>> list, j0 j0Var, r8.a<? extends File> aVar) {
        l.e(list, "migrations");
        l.e(j0Var, "scope");
        l.e(aVar, "produceFile");
        return new b(g.f13349a.a(h.f3552a, bVar, list, j0Var, new a(aVar)));
    }
}
