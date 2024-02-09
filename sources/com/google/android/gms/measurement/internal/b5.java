package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class b5 {

    /* renamed from: a  reason: collision with root package name */
    public String f5884a;

    /* renamed from: b  reason: collision with root package name */
    private String f5885b;

    /* renamed from: c  reason: collision with root package name */
    private long f5886c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f5887d;

    private b5(String str, String str2, Bundle bundle, long j10) {
        this.f5884a = str;
        this.f5885b = str2;
        this.f5887d = bundle == null ? new Bundle() : bundle;
        this.f5886c = j10;
    }

    public static b5 b(i0 i0Var) {
        return new b5(i0Var.f6112m, i0Var.f6114o, i0Var.f6113n.i(), i0Var.f6115p);
    }

    public final i0 a() {
        return new i0(this.f5884a, new d0(new Bundle(this.f5887d)), this.f5885b, this.f5886c);
    }

    public final String toString() {
        String str = this.f5885b;
        String str2 = this.f5884a;
        String valueOf = String.valueOf(this.f5887d);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }
}
