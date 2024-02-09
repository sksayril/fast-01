package androidx.datastore.preferences.protobuf;

final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private static final m0 f2035a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final m0 f2036b = new n0();

    static m0 a() {
        return f2035a;
    }

    static m0 b() {
        return f2036b;
    }

    private static m0 c() {
        try {
            return (m0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
