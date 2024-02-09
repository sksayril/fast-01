package com.google.android.gms.internal.measurement;

public final class kf implements hf {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5407a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5408b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5409c;

    /* renamed from: d  reason: collision with root package name */
    private static final f6<Boolean> f5410d;

    /* renamed from: e  reason: collision with root package name */
    private static final f6<Boolean> f5411e;

    /* renamed from: f  reason: collision with root package name */
    private static final f6<Boolean> f5412f;

    /* renamed from: g  reason: collision with root package name */
    private static final f6<Boolean> f5413g;

    /* renamed from: h  reason: collision with root package name */
    private static final f6<Boolean> f5414h;

    /* renamed from: i  reason: collision with root package name */
    private static final f6<Boolean> f5415i;

    /* renamed from: j  reason: collision with root package name */
    private static final f6<Boolean> f5416j;

    /* renamed from: k  reason: collision with root package name */
    private static final f6<Boolean> f5417k;

    /* renamed from: l  reason: collision with root package name */
    private static final f6<Boolean> f5418l;

    /* renamed from: m  reason: collision with root package name */
    private static final f6<Boolean> f5419m;

    /* renamed from: n  reason: collision with root package name */
    private static final f6<Boolean> f5420n;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5407a = e10.d("measurement.redaction.app_instance_id", true);
        f5408b = e10.d("measurement.redaction.client_ephemeral_aiid_generation", true);
        f5409c = e10.d("measurement.redaction.config_redacted_fields", true);
        f5410d = e10.d("measurement.redaction.device_info", true);
        f5411e = e10.d("measurement.redaction.e_tag", true);
        f5412f = e10.d("measurement.redaction.enhanced_uid", true);
        f5413g = e10.d("measurement.redaction.populate_ephemeral_app_instance_id", true);
        f5414h = e10.d("measurement.redaction.google_signals", true);
        f5415i = e10.d("measurement.redaction.no_aiid_in_config_request", true);
        f5416j = e10.d("measurement.redaction.retain_major_os_version", true);
        f5417k = e10.d("measurement.redaction.scion_payload_generator", true);
        f5418l = e10.d("measurement.redaction.upload_redacted_fields", true);
        f5419m = e10.d("measurement.redaction.upload_subdomain_override", true);
        f5420n = e10.d("measurement.redaction.user_id", true);
    }

    public final boolean a() {
        return f5417k.e().booleanValue();
    }

    public final boolean zza() {
        return f5416j.e().booleanValue();
    }
}
