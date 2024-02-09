package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import p3.c;

public final class n6 {

    /* renamed from: a  reason: collision with root package name */
    final String f5466a;

    /* renamed from: b  reason: collision with root package name */
    final Uri f5467b;

    /* renamed from: c  reason: collision with root package name */
    final String f5468c;

    /* renamed from: d  reason: collision with root package name */
    final String f5469d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f5470e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f5471f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f5472g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f5473h;

    /* renamed from: i  reason: collision with root package name */
    final c<Context, Boolean> f5474i;

    public n6(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (c<Context, Boolean>) null);
    }

    private n6(String str, Uri uri, String str2, String str3, boolean z9, boolean z10, boolean z11, boolean z12, c<Context, Boolean> cVar) {
        this.f5466a = str;
        this.f5467b = uri;
        this.f5468c = str2;
        this.f5469d = str3;
        this.f5470e = z9;
        this.f5471f = z10;
        this.f5472g = z11;
        this.f5473h = z12;
        this.f5474i = cVar;
    }

    public final f6<Double> a(String str, double d10) {
        return f6.b(this, str, Double.valueOf(-3.0d), true);
    }

    public final f6<Long> b(String str, long j10) {
        return f6.c(this, str, Long.valueOf(j10), true);
    }

    public final f6<String> c(String str, String str2) {
        return f6.d(this, str, str2, true);
    }

    public final f6<Boolean> d(String str, boolean z9) {
        return f6.a(this, str, Boolean.valueOf(z9), true);
    }

    public final n6 e() {
        return new n6(this.f5466a, this.f5467b, this.f5468c, this.f5469d, this.f5470e, this.f5471f, true, this.f5473h, this.f5474i);
    }

    public final n6 f() {
        if (this.f5468c.isEmpty()) {
            c<Context, Boolean> cVar = this.f5474i;
            if (cVar == null) {
                return new n6(this.f5466a, this.f5467b, this.f5468c, this.f5469d, true, this.f5471f, this.f5472g, this.f5473h, cVar);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }
}
