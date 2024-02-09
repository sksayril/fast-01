package com.google.android.gms.internal.measurement;

public final class se implements te {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5607a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5608b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5609c;

    /* renamed from: d  reason: collision with root package name */
    private static final f6<Long> f5610d;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5607a = e10.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        f5608b = e10.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f5609c = e10.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        f5610d = e10.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0);
    }

    public final boolean zza() {
        return f5609c.e().booleanValue();
    }
}
