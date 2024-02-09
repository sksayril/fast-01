package com.google.android.gms.internal.measurement;

public final class re implements oe {

    /* renamed from: a  reason: collision with root package name */
    private static final f6<Boolean> f5572a;

    /* renamed from: b  reason: collision with root package name */
    private static final f6<Boolean> f5573b;

    /* renamed from: c  reason: collision with root package name */
    private static final f6<Long> f5574c;

    static {
        n6 e10 = new n6(c6.a("com.google.android.gms.measurement")).f().e();
        f5572a = e10.d("measurement.item_scoped_custom_parameters.client", true);
        f5573b = e10.d("measurement.item_scoped_custom_parameters.service", false);
        f5574c = e10.b("measurement.id.item_scoped_custom_parameters.service", 0);
    }

    public final boolean a() {
        return f5572a.e().booleanValue();
    }

    public final boolean b() {
        return f5573b.e().booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
