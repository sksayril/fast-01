package com.google.android.gms.internal.measurement;

public final class gd implements dd {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5279a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5280b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5281c;

    /* renamed from: d  reason: collision with root package name */
    private static final f6<Long> f5282d;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5279a = e10.d("measurement.client.consent_state_v1", true);
        f5280b = e10.d("measurement.client.3p_consent_state_v1", true);
        f5281c = e10.d("measurement.service.consent_state_v1_W36", true);
        f5282d = e10.b("measurement.service.storage_consent_support_version", 203600);
    }

    public final long zza() {
        return f5282d.e().longValue();
    }
}
