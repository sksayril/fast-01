package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import h2.p;
import i2.a;
import i2.c;

public final class i0 extends a {
    public static final Parcelable.Creator<i0> CREATOR = new h0();

    /* renamed from: m  reason: collision with root package name */
    public final String f6112m;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f6113n;

    /* renamed from: o  reason: collision with root package name */
    public final String f6114o;

    /* renamed from: p  reason: collision with root package name */
    public final long f6115p;

    i0(i0 i0Var, long j10) {
        p.j(i0Var);
        this.f6112m = i0Var.f6112m;
        this.f6113n = i0Var.f6113n;
        this.f6114o = i0Var.f6114o;
        this.f6115p = j10;
    }

    public i0(String str, d0 d0Var, String str2, long j10) {
        this.f6112m = str;
        this.f6113n = d0Var;
        this.f6114o = str2;
        this.f6115p = j10;
    }

    public final String toString() {
        String str = this.f6114o;
        String str2 = this.f6112m;
        String valueOf = String.valueOf(this.f6113n);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 2, this.f6112m, false);
        c.s(parcel, 3, this.f6113n, i10, false);
        c.t(parcel, 4, this.f6114o, false);
        c.q(parcel, 5, this.f6115p);
        c.b(parcel, a10);
    }
}
