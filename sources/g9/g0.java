package g9;

import a.a;
import g8.m;
import g8.n;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final StackTraceElement f8989a = new a().a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f8990b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f8991c;

    static {
        Object obj;
        Object obj2;
        try {
            m.a aVar = m.f8970m;
            obj = m.a(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th) {
            m.a aVar2 = m.f8970m;
            obj = m.a(n.a(th));
        }
        if (m.b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f8990b = (String) obj;
        try {
            m.a aVar3 = m.f8970m;
            obj2 = m.a(g0.class.getCanonicalName());
        } catch (Throwable th2) {
            m.a aVar4 = m.f8970m;
            obj2 = m.a(n.a(th2));
        }
        if (m.b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f8991c = (String) obj2;
    }

    public static final <E extends Throwable> E a(E e10) {
        return e10;
    }
}
