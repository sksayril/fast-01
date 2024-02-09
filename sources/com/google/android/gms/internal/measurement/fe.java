package com.google.android.gms.internal.measurement;

public final class fe implements ce {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5254a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5255b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5256c;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5254a = e10.d("measurement.client.sessions.check_on_reset_and_enable2", true);
        f5255b = e10.d("measurement.client.sessions.check_on_startup", true);
        f5256c = e10.d("measurement.client.sessions.start_session_before_view_screen", true);
    }

    public final boolean a() {
        return f5254a.e().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
