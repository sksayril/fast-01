package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public final class rb extends a {
    public static final Parcelable.Creator<rb> CREATOR = new ub();

    /* renamed from: m  reason: collision with root package name */
    public final String f6528m;

    /* renamed from: n  reason: collision with root package name */
    public final long f6529n;

    /* renamed from: o  reason: collision with root package name */
    public final int f6530o;

    rb(String str, long j10, int i10) {
        this.f6528m = str;
        this.f6529n = j10;
        this.f6530o = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f6528m, false);
        c.q(parcel, 2, this.f6529n);
        c.m(parcel, 3, this.f6530o);
        c.b(parcel, a10);
    }
}
