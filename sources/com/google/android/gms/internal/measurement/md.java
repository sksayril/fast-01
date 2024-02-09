package com.google.android.gms.internal.measurement;

public final class md implements jd {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5448a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5449b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5450c;

    /* renamed from: d  reason: collision with root package name */
    private static final f6<Boolean> f5451d;

    /* renamed from: e  reason: collision with root package name */
    private static final f6<Boolean> f5452e;

    /* renamed from: f  reason: collision with root package name */
    private static final f6<Boolean> f5453f;

    /* renamed from: g  reason: collision with root package name */
    private static final f6<Long> f5454g;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5448a = e10.d("measurement.dma_consent.client", false);
        f5449b = e10.d("measurement.dma_consent.client_bow_check", false);
        f5450c = e10.d("measurement.dma_consent.service", false);
        f5451d = e10.d("measurement.dma_consent.service_gcs_v2", false);
        f5452e = e10.d("measurement.dma_consent.service_npa_remote_default", false);
        f5453f = e10.d("measurement.dma_consent.service_split_batch_on_consent", false);
        f5454g = e10.b("measurement.id.dma_consent.service", 0);
    }

    public final boolean a() {
        return f5448a.e().booleanValue();
    }

    public final boolean b() {
        return f5449b.e().booleanValue();
    }

    public final boolean c() {
        return f5450c.e().booleanValue();
    }

    public final boolean d() {
        return f5451d.e().booleanValue();
    }

    public final boolean f() {
        return f5452e.e().booleanValue();
    }

    public final boolean h() {
        return f5453f.e().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
