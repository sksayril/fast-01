package androidx.datastore.preferences.protobuf;

final class y0 {

    /* renamed from: a  reason: collision with root package name */
    private static final w0 f2135a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final w0 f2136b = new x0();

    static w0 a() {
        return f2135a;
    }

    static w0 b() {
        return f2136b;
    }

    private static w0 c() {
        try {
            return (w0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
