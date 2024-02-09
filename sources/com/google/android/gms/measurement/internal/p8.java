package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class p8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ String f6432m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6433n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ long f6434o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ Bundle f6435p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ boolean f6436q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ boolean f6437r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ boolean f6438s;

    /* renamed from: t  reason: collision with root package name */
    private final /* synthetic */ String f6439t;

    /* renamed from: u  reason: collision with root package name */
    private final /* synthetic */ y7 f6440u;

    p8(y7 y7Var, String str, String str2, long j10, Bundle bundle, boolean z9, boolean z10, boolean z11, String str3) {
        this.f6440u = y7Var;
        this.f6432m = str;
        this.f6433n = str2;
        this.f6434o = j10;
        this.f6435p = bundle;
        this.f6436q = z9;
        this.f6437r = z10;
        this.f6438s = z11;
        this.f6439t = str3;
    }

    public final void run() {
        this.f6440u.U(this.f6432m, this.f6433n, this.f6434o, this.f6435p, this.f6436q, this.f6437r, this.f6438s, this.f6439t);
    }
}
