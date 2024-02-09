package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import h2.p;
import i2.a;
import i2.c;
import java.util.List;

public final class sc extends a {
    public static final Parcelable.Creator<sc> CREATOR = new uc();
    public final boolean A;
    public final boolean B;
    public final String C;
    public final Boolean D;
    public final long E;
    public final List<String> F;
    private final String G;
    public final String H;
    public final String I;
    public final String J;
    public final boolean K;
    public final long L;
    public final int M;
    public final String N;
    public final int O;
    public final long P;

    /* renamed from: m  reason: collision with root package name */
    public final String f6559m;

    /* renamed from: n  reason: collision with root package name */
    public final String f6560n;

    /* renamed from: o  reason: collision with root package name */
    public final String f6561o;

    /* renamed from: p  reason: collision with root package name */
    public final String f6562p;

    /* renamed from: q  reason: collision with root package name */
    public final long f6563q;

    /* renamed from: r  reason: collision with root package name */
    public final long f6564r;

    /* renamed from: s  reason: collision with root package name */
    public final String f6565s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f6566t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f6567u;

    /* renamed from: v  reason: collision with root package name */
    public final long f6568v;

    /* renamed from: w  reason: collision with root package name */
    public final String f6569w;
    @Deprecated

    /* renamed from: x  reason: collision with root package name */
    private final long f6570x;

    /* renamed from: y  reason: collision with root package name */
    public final long f6571y;

    /* renamed from: z  reason: collision with root package name */
    public final int f6572z;

    sc(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z9, boolean z10, String str6, long j13, long j14, int i10, boolean z11, boolean z12, String str7, Boolean bool, long j15, List<String> list, String str8, String str9, String str10, String str11, boolean z13, long j16, int i11, String str12, int i12, long j17) {
        p.f(str);
        this.f6559m = str;
        this.f6560n = TextUtils.isEmpty(str2) ? null : str2;
        this.f6561o = str3;
        this.f6568v = j10;
        this.f6562p = str4;
        this.f6563q = j11;
        this.f6564r = j12;
        this.f6565s = str5;
        this.f6566t = z9;
        this.f6567u = z10;
        this.f6569w = str6;
        this.f6570x = j13;
        this.f6571y = j14;
        this.f6572z = i10;
        this.A = z11;
        this.B = z12;
        this.C = str7;
        this.D = bool;
        this.E = j15;
        this.F = list;
        this.G = null;
        this.H = str9;
        this.I = str10;
        this.J = str11;
        this.K = z13;
        this.L = j16;
        this.M = i11;
        this.N = str12;
        this.O = i12;
        this.P = j17;
    }

    sc(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z9, boolean z10, long j12, String str6, long j13, long j14, int i10, boolean z11, boolean z12, String str7, Boolean bool, long j15, List<String> list, String str8, String str9, String str10, String str11, boolean z13, long j16, int i11, String str12, int i12, long j17) {
        this.f6559m = str;
        this.f6560n = str2;
        this.f6561o = str3;
        this.f6568v = j12;
        this.f6562p = str4;
        this.f6563q = j10;
        this.f6564r = j11;
        this.f6565s = str5;
        this.f6566t = z9;
        this.f6567u = z10;
        this.f6569w = str6;
        this.f6570x = j13;
        this.f6571y = j14;
        this.f6572z = i10;
        this.A = z11;
        this.B = z12;
        this.C = str7;
        this.D = bool;
        this.E = j15;
        this.F = list;
        this.G = str8;
        this.H = str9;
        this.I = str10;
        this.J = str11;
        this.K = z13;
        this.L = j16;
        this.M = i11;
        this.N = str12;
        this.O = i12;
        this.P = j17;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 2, this.f6559m, false);
        c.t(parcel, 3, this.f6560n, false);
        c.t(parcel, 4, this.f6561o, false);
        c.t(parcel, 5, this.f6562p, false);
        c.q(parcel, 6, this.f6563q);
        c.q(parcel, 7, this.f6564r);
        c.t(parcel, 8, this.f6565s, false);
        c.c(parcel, 9, this.f6566t);
        c.c(parcel, 10, this.f6567u);
        c.q(parcel, 11, this.f6568v);
        c.t(parcel, 12, this.f6569w, false);
        c.q(parcel, 13, this.f6570x);
        c.q(parcel, 14, this.f6571y);
        c.m(parcel, 15, this.f6572z);
        c.c(parcel, 16, this.A);
        c.c(parcel, 18, this.B);
        c.t(parcel, 19, this.C, false);
        c.d(parcel, 21, this.D, false);
        c.q(parcel, 22, this.E);
        c.u(parcel, 23, this.F, false);
        c.t(parcel, 24, this.G, false);
        c.t(parcel, 25, this.H, false);
        c.t(parcel, 26, this.I, false);
        c.t(parcel, 27, this.J, false);
        c.c(parcel, 28, this.K);
        c.q(parcel, 29, this.L);
        c.m(parcel, 30, this.M);
        c.t(parcel, 31, this.N, false);
        c.m(parcel, 32, this.O);
        c.q(parcel, 34, this.P);
        c.b(parcel, a10);
    }
}
