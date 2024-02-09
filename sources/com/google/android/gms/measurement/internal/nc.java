package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import h2.p;
import i2.a;
import i2.c;

public final class nc extends a {
    public static final Parcelable.Creator<nc> CREATOR = new mc();

    /* renamed from: m  reason: collision with root package name */
    private final int f6358m;

    /* renamed from: n  reason: collision with root package name */
    public final String f6359n;

    /* renamed from: o  reason: collision with root package name */
    public final long f6360o;

    /* renamed from: p  reason: collision with root package name */
    public final Long f6361p;

    /* renamed from: q  reason: collision with root package name */
    private final Float f6362q;

    /* renamed from: r  reason: collision with root package name */
    public final String f6363r;

    /* renamed from: s  reason: collision with root package name */
    public final String f6364s;

    /* renamed from: t  reason: collision with root package name */
    public final Double f6365t;

    nc(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f6358m = i10;
        this.f6359n = str;
        this.f6360o = j10;
        this.f6361p = l10;
        Double d11 = null;
        this.f6362q = null;
        if (i10 == 1) {
            this.f6365t = f10 != null ? Double.valueOf(f10.doubleValue()) : d11;
        } else {
            this.f6365t = d10;
        }
        this.f6363r = str2;
        this.f6364s = str3;
    }

    nc(pc pcVar) {
        this(pcVar.f6446c, pcVar.f6447d, pcVar.f6448e, pcVar.f6445b);
    }

    nc(String str, long j10, Object obj, String str2) {
        p.f(str);
        this.f6358m = 2;
        this.f6359n = str;
        this.f6360o = j10;
        this.f6364s = str2;
        if (obj == null) {
            this.f6361p = null;
            this.f6362q = null;
            this.f6365t = null;
            this.f6363r = null;
        } else if (obj instanceof Long) {
            this.f6361p = (Long) obj;
            this.f6362q = null;
            this.f6365t = null;
            this.f6363r = null;
        } else if (obj instanceof String) {
            this.f6361p = null;
            this.f6362q = null;
            this.f6365t = null;
            this.f6363r = (String) obj;
        } else if (obj instanceof Double) {
            this.f6361p = null;
            this.f6362q = null;
            this.f6365t = (Double) obj;
            this.f6363r = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public final Object d() {
        Long l10 = this.f6361p;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f6365t;
        if (d10 != null) {
            return d10;
        }
        String str = this.f6363r;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f6358m);
        c.t(parcel, 2, this.f6359n, false);
        c.q(parcel, 3, this.f6360o);
        c.r(parcel, 4, this.f6361p, false);
        c.k(parcel, 5, (Float) null, false);
        c.t(parcel, 6, this.f6363r, false);
        c.t(parcel, 7, this.f6364s, false);
        c.i(parcel, 8, this.f6365t, false);
        c.b(parcel, a10);
    }
}
