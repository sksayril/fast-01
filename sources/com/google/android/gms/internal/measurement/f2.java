package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public final class f2 extends a {
    public static final Parcelable.Creator<f2> CREATOR = new i2();

    /* renamed from: m  reason: collision with root package name */
    public final long f5221m;

    /* renamed from: n  reason: collision with root package name */
    public final long f5222n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f5223o;

    /* renamed from: p  reason: collision with root package name */
    public final String f5224p;

    /* renamed from: q  reason: collision with root package name */
    public final String f5225q;

    /* renamed from: r  reason: collision with root package name */
    public final String f5226r;

    /* renamed from: s  reason: collision with root package name */
    public final Bundle f5227s;

    /* renamed from: t  reason: collision with root package name */
    public final String f5228t;

    public f2(long j10, long j11, boolean z9, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f5221m = j10;
        this.f5222n = j11;
        this.f5223o = z9;
        this.f5224p = str;
        this.f5225q = str2;
        this.f5226r = str3;
        this.f5227s = bundle;
        this.f5228t = str4;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.f5221m);
        c.q(parcel, 2, this.f5222n);
        c.c(parcel, 3, this.f5223o);
        c.t(parcel, 4, this.f5224p, false);
        c.t(parcel, 5, this.f5225q, false);
        c.t(parcel, 6, this.f5226r, false);
        c.e(parcel, 7, this.f5227s, false);
        c.t(parcel, 8, this.f5228t, false);
        c.b(parcel, a10);
    }
}
