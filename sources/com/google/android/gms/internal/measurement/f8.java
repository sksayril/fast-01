package com.google.android.gms.internal.measurement;

final class f8 {

    /* renamed from: a  reason: collision with root package name */
    private static final e8<?> f5247a = new g8();

    /* renamed from: b  reason: collision with root package name */
    private static final e8<?> f5248b = c();

    static e8<?> a() {
        e8<?> e8Var = f5248b;
        if (e8Var != null) {
            return e8Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static e8<?> b() {
        return f5247a;
    }

    private static e8<?> c() {
        try {
            return (e8) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
