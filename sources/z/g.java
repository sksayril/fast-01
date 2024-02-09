package z;

import a0.b;
import b9.j0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.l;
import r8.a;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f13349a = new g();

    private g() {
    }

    public final <T> f<T> a(k<T> kVar, b<T> bVar, List<? extends d<T>> list, j0 j0Var, a<? extends File> aVar) {
        l.e(kVar, "serializer");
        l.e(list, "migrations");
        l.e(j0Var, "scope");
        l.e(aVar, "produceFile");
        return new m(aVar, kVar, m.b(e.f13331a.b(list)), new a0.a(), j0Var);
    }
}
