package j0;

import androidx.lifecycle.b0;
import r8.l;

public final class f<T extends b0> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f10791a;

    /* renamed from: b  reason: collision with root package name */
    private final l<a, T> f10792b;

    public f(Class<T> cls, l<? super a, ? extends T> lVar) {
        kotlin.jvm.internal.l.e(cls, "clazz");
        kotlin.jvm.internal.l.e(lVar, "initializer");
        this.f10791a = cls;
        this.f10792b = lVar;
    }

    public final Class<T> a() {
        return this.f10791a;
    }

    public final l<a, T> b() {
        return this.f10792b;
    }
}
