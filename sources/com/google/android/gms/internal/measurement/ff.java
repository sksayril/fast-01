package com.google.android.gms.internal.measurement;

public final class ff implements gf {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5257a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5258b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5259c;

    /* renamed from: d  reason: collision with root package name */
    private static final f6<Boolean> f5260d;

    /* renamed from: e  reason: collision with root package name */
    private static final f6<Boolean> f5261e;

    /* renamed from: f  reason: collision with root package name */
    private static final f6<Long> f5262f;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5257a = e10.d("measurement.rb.attribution.client2", false);
        f5258b = e10.d("measurement.rb.attribution.followup1.service", false);
        f5259c = e10.d("measurement.rb.attribution.service", false);
        f5260d = e10.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f5261e = e10.d("measurement.rb.attribution.uuid_generation", true);
        f5262f = e10.b("measurement.id.rb.attribution.service", 0);
    }

    public final boolean a() {
        return f5257a.e().booleanValue();
    }

    public final boolean b() {
        return f5258b.e().booleanValue();
    }

    public final boolean c() {
        return f5259c.e().booleanValue();
    }

    public final boolean d() {
        return f5260d.e().booleanValue();
    }

    public final boolean f() {
        return f5261e.e().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
