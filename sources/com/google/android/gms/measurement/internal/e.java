package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import h2.p;
import i2.a;
import i2.c;

public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new h();

    /* renamed from: m  reason: collision with root package name */
    public String f5969m;

    /* renamed from: n  reason: collision with root package name */
    public String f5970n;

    /* renamed from: o  reason: collision with root package name */
    public nc f5971o;

    /* renamed from: p  reason: collision with root package name */
    public long f5972p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5973q;

    /* renamed from: r  reason: collision with root package name */
    public String f5974r;

    /* renamed from: s  reason: collision with root package name */
    public i0 f5975s;

    /* renamed from: t  reason: collision with root package name */
    public long f5976t;

    /* renamed from: u  reason: collision with root package name */
    public i0 f5977u;

    /* renamed from: v  reason: collision with root package name */
    public long f5978v;

    /* renamed from: w  reason: collision with root package name */
    public i0 f5979w;

    e(e eVar) {
        p.j(eVar);
        this.f5969m = eVar.f5969m;
        this.f5970n = eVar.f5970n;
        this.f5971o = eVar.f5971o;
        this.f5972p = eVar.f5972p;
        this.f5973q = eVar.f5973q;
        this.f5974r = eVar.f5974r;
        this.f5975s = eVar.f5975s;
        this.f5976t = eVar.f5976t;
        this.f5977u = eVar.f5977u;
        this.f5978v = eVar.f5978v;
        this.f5979w = eVar.f5979w;
    }

    e(String str, String str2, nc ncVar, long j10, boolean z9, String str3, i0 i0Var, long j11, i0 i0Var2, long j12, i0 i0Var3) {
        this.f5969m = str;
        this.f5970n = str2;
        this.f5971o = ncVar;
        this.f5972p = j10;
        this.f5973q = z9;
        this.f5974r = str3;
        this.f5975s = i0Var;
        this.f5976t = j11;
        this.f5977u = i0Var2;
        this.f5978v = j12;
        this.f5979w = i0Var3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 2, this.f5969m, false);
        c.t(parcel, 3, this.f5970n, false);
        c.s(parcel, 4, this.f5971o, i10, false);
        c.q(parcel, 5, this.f5972p);
        c.c(parcel, 6, this.f5973q);
        c.t(parcel, 7, this.f5974r, false);
        c.s(parcel, 8, this.f5975s, i10, false);
        c.q(parcel, 9, this.f5976t);
        c.s(parcel, 10, this.f5977u, i10, false);
        c.q(parcel, 11, this.f5978v);
        c.s(parcel, 12, this.f5979w, i10, false);
        c.b(parcel, a10);
    }
}
