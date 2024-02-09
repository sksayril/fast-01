package j0;

import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import q8.a;
import r8.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<f<?>> f10790a = new ArrayList();

    public final <T extends b0> void a(x8.c<T> cVar, l<? super a, ? extends T> lVar) {
        kotlin.jvm.internal.l.e(cVar, "clazz");
        kotlin.jvm.internal.l.e(lVar, "initializer");
        this.f10790a.add(new f(a.a(cVar), lVar));
    }

    public final c0.b b() {
        f[] fVarArr = (f[]) this.f10790a.toArray(new f[0]);
        return new b((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
    }
}
