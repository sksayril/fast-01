package j0;

import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import kotlin.jvm.internal.l;

public final class b implements c0.b {

    /* renamed from: b  reason: collision with root package name */
    private final f<?>[] f10789b;

    public b(f<?>... fVarArr) {
        l.e(fVarArr, "initializers");
        this.f10789b = fVarArr;
    }

    public /* synthetic */ b0 a(Class cls) {
        return d0.a(this, cls);
    }

    public <T extends b0> T b(Class<T> cls, a aVar) {
        l.e(cls, "modelClass");
        l.e(aVar, "extras");
        T t9 = null;
        for (f<?> fVar : this.f10789b) {
            if (l.a(fVar.a(), cls)) {
                T invoke = fVar.b().invoke(aVar);
                t9 = invoke instanceof b0 ? (b0) invoke : null;
            }
        }
        if (t9 != null) {
            return t9;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
