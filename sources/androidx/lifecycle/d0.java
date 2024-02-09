package androidx.lifecycle;

import androidx.lifecycle.c0;
import j0.a;
import kotlin.jvm.internal.l;

public final /* synthetic */ class d0 {
    static {
        c0.b.a aVar = c0.b.f2743a;
    }

    public static b0 a(c0.b bVar, Class cls) {
        l.e(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static b0 b(c0.b bVar, Class cls, a aVar) {
        l.e(cls, "modelClass");
        l.e(aVar, "extras");
        return bVar.a(cls);
    }
}
