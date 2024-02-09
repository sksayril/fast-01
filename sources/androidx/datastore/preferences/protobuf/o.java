package androidx.datastore.preferences.protobuf;

final class o {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f2034a = c();

    public static p a() {
        if (f2034a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return p.f2046e;
    }

    private static final p b(String str) {
        return (p) f2034a.getDeclaredMethod(str, new Class[0]).invoke((Object) null, new Object[0]);
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
