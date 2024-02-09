package com.google.android.gms.internal.measurement;

public final class ye implements ue {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Long> f5729a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5730b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5731c;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5729a = e10.b("measurement.id.lifecycle.app_in_background_parameter", 0);
        f5730b = e10.d("measurement.lifecycle.app_backgrounded_tracking", true);
        f5731c = e10.d("measurement.lifecycle.app_in_background_parameter", false);
    }

    public final boolean zza() {
        return f5731c.e().booleanValue();
    }
}
