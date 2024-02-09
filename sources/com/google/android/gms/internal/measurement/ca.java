package com.google.android.gms.internal.measurement;

final class ca {

    /* renamed from: a  reason: collision with root package name */
    private static final aa f5172a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final aa f5173b = new z9();

    static aa a() {
        return f5172a;
    }

    static aa b() {
        return f5173b;
    }

    private static aa c() {
        try {
            return (aa) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
