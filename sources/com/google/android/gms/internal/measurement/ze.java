package com.google.android.gms.internal.measurement;

public final class ze implements af {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5753a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Double> f5754b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Long> f5755c;

    /* renamed from: d  reason: collision with root package name */
    private static final f6<Long> f5756d;

    /* renamed from: e  reason: collision with root package name */
    private static final f6<String> f5757e;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5753a = e10.d("measurement.test.boolean_flag", false);
        f5754b = e10.a("measurement.test.double_flag", -3.0d);
        f5755c = e10.b("measurement.test.int_flag", -2);
        f5756d = e10.b("measurement.test.long_flag", -1);
        f5757e = e10.c("measurement.test.string_flag", "---");
    }

    public final long a() {
        return f5755c.e().longValue();
    }

    public final long b() {
        return f5756d.e().longValue();
    }

    public final String c() {
        return f5757e.e();
    }

    public final boolean d() {
        return f5753a.e().booleanValue();
    }

    public final double zza() {
        return f5754b.e().doubleValue();
    }
}
