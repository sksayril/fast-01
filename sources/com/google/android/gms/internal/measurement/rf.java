package com.google.android.gms.internal.measurement;

public final class rf implements sf {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5575a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5576b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5577c;

    /* renamed from: d  reason: collision with root package name */
    private static final f6<Boolean> f5578d;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5575a = e10.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        f5576b = e10.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f5577c = e10.d("measurement.session_stitching_token_enabled", false);
        f5578d = e10.d("measurement.link_sst_to_sid", true);
    }

    public final boolean a() {
        return f5575a.e().booleanValue();
    }

    public final boolean b() {
        return f5576b.e().booleanValue();
    }

    public final boolean c() {
        return f5577c.e().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
