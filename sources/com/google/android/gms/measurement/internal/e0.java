package com.google.android.gms.measurement.internal;

import h2.p;

final class e0 {

    /* renamed from: a  reason: collision with root package name */
    final String f5980a;

    /* renamed from: b  reason: collision with root package name */
    final String f5981b;

    /* renamed from: c  reason: collision with root package name */
    final long f5982c;

    /* renamed from: d  reason: collision with root package name */
    final long f5983d;

    /* renamed from: e  reason: collision with root package name */
    final long f5984e;

    /* renamed from: f  reason: collision with root package name */
    final long f5985f;

    /* renamed from: g  reason: collision with root package name */
    final long f5986g;

    /* renamed from: h  reason: collision with root package name */
    final Long f5987h;

    /* renamed from: i  reason: collision with root package name */
    final Long f5988i;

    /* renamed from: j  reason: collision with root package name */
    final Long f5989j;

    /* renamed from: k  reason: collision with root package name */
    final Boolean f5990k;

    e0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        long j15 = j10;
        long j16 = j11;
        long j17 = j12;
        long j18 = j14;
        p.f(str);
        p.f(str2);
        boolean z9 = true;
        p.a(j15 >= 0);
        p.a(j16 >= 0);
        p.a(j17 >= 0);
        p.a(j18 < 0 ? false : z9);
        this.f5980a = str;
        this.f5981b = str2;
        this.f5982c = j15;
        this.f5983d = j16;
        this.f5984e = j17;
        this.f5985f = j13;
        this.f5986g = j18;
        this.f5987h = l10;
        this.f5988i = l11;
        this.f5989j = l12;
        this.f5990k = bool;
    }

    e0(String str, String str2, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0, 0, 0, j12, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public final e0 a(long j10) {
        return new e0(this.f5980a, this.f5981b, this.f5982c, this.f5983d, this.f5984e, j10, this.f5986g, this.f5987h, this.f5988i, this.f5989j, this.f5990k);
    }

    /* access modifiers changed from: package-private */
    public final e0 b(long j10, long j11) {
        return new e0(this.f5980a, this.f5981b, this.f5982c, this.f5983d, this.f5984e, this.f5985f, j10, Long.valueOf(j11), this.f5988i, this.f5989j, this.f5990k);
    }

    /* access modifiers changed from: package-private */
    public final e0 c(Long l10, Long l11, Boolean bool) {
        return new e0(this.f5980a, this.f5981b, this.f5982c, this.f5983d, this.f5984e, this.f5985f, this.f5986g, this.f5987h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
