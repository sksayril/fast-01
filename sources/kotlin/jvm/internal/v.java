package kotlin.jvm.internal;

import x8.c;
import x8.d;
import x8.e;
import x8.f;
import x8.g;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private static final w f11079a;

    /* renamed from: b  reason: collision with root package name */
    private static final c[] f11080b = new c[0];

    static {
        w wVar = null;
        try {
            wVar = (w) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (wVar == null) {
            wVar = new w();
        }
        f11079a = wVar;
    }

    public static e a(i iVar) {
        return f11079a.a(iVar);
    }

    public static c b(Class cls) {
        return f11079a.b(cls);
    }

    public static d c(Class cls) {
        return f11079a.c(cls, "");
    }

    public static f d(o oVar) {
        return f11079a.d(oVar);
    }

    public static g e(q qVar) {
        return f11079a.e(qVar);
    }

    public static String f(h hVar) {
        return f11079a.f(hVar);
    }

    public static String g(m mVar) {
        return f11079a.g(mVar);
    }
}
