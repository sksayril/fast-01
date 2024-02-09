package androidx.datastore.preferences.protobuf;

final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final q<?> f2082a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final q<?> f2083b = c();

    static q<?> a() {
        q<?> qVar = f2083b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static q<?> b() {
        return f2082a;
    }

    private static q<?> c() {
        try {
            return (q) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
