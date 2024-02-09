package g9;

import g8.m;
import g8.n;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f9010a;

    static {
        Object obj;
        try {
            m.a aVar = g8.m.f8970m;
            obj = g8.m.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            m.a aVar2 = g8.m.f8970m;
            obj = g8.m.a(n.a(th));
        }
        f9010a = g8.m.d(obj);
    }

    public static final boolean a() {
        return f9010a;
    }
}
