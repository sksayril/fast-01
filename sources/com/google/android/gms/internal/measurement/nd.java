package com.google.android.gms.internal.measurement;

public final class nd implements od {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5477a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5478b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5479c;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5477a = e10.d("measurement.collection.event_safelist", true);
        f5478b = e10.d("measurement.service.store_null_safelist", true);
        f5479c = e10.d("measurement.service.store_safelist", true);
    }

    public final boolean a() {
        return f5478b.e().booleanValue();
    }

    public final boolean b() {
        return f5479c.e().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
