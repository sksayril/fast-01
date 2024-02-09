package androidx.datastore.preferences.protobuf;

final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f1895a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f1896b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f1895a;
    }

    static boolean c() {
        return f1895a != null && !f1896b;
    }
}
