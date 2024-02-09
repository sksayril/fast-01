package com.google.android.gms.internal.measurement;

public final class hd implements id {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5329a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Long> f5330b;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5329a = e10.d("measurement.service.deferred_first_open", false);
        f5330b = e10.b("measurement.id.service.deferred_first_open", 0);
    }

    public final boolean a() {
        return f5329a.e().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
