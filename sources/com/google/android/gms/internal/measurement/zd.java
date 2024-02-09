package com.google.android.gms.internal.measurement;

public final class zd implements wd {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5749a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5750b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Boolean> f5751c;

    /* renamed from: d  reason: collision with root package name */
    private static final f6<Boolean> f5752d;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5749a = e10.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f5750b = e10.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f5751c = e10.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f5752d = e10.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    public final boolean a() {
        return f5750b.e().booleanValue();
    }

    public final boolean b() {
        return f5751c.e().booleanValue();
    }

    public final boolean c() {
        return f5752d.e().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
