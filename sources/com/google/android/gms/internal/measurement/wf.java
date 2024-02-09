package com.google.android.gms.internal.measurement;

public final class wf implements tf {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5685a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5686b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5687c;

    /* renamed from: d  reason: collision with root package name */
    private static final f6<Boolean> f5688d;

    /* renamed from: e  reason: collision with root package name */
    private static final f6<Boolean> f5689e;

    /* renamed from: f  reason: collision with root package name */
    private static final f6<Long> f5690f;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5685a = e10.d("measurement.client.sessions.background_sessions_enabled", true);
        f5686b = e10.d("measurement.client.sessions.enable_fix_background_engagement", false);
        f5687c = e10.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f5688d = e10.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        f5689e = e10.d("measurement.client.sessions.session_id_enabled", true);
        f5690f = e10.b("measurement.id.client.sessions.enable_fix_background_engagement", 0);
    }

    public final boolean zza() {
        return f5686b.e().booleanValue();
    }
}
