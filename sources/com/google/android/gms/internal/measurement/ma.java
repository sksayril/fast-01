package com.google.android.gms.internal.measurement;

final class ma {

    /* renamed from: a  reason: collision with root package name */
    private static final ka f5446a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final ka f5447b = new na();

    static ka a() {
        return f5446a;
    }

    static ka b() {
        return f5447b;
    }

    private static ka c() {
        try {
            return (ka) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
