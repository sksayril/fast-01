package com.google.android.gms.measurement.internal;

import android.net.Uri;

final class j9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ boolean f6164m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ Uri f6165n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ String f6166o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ String f6167p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ f9 f6168q;

    j9(f9 f9Var, boolean z9, Uri uri, String str, String str2) {
        this.f6168q = f9Var;
        this.f6164m = z9;
        this.f6165n = uri;
        this.f6166o = str;
        this.f6167p = str2;
    }

    public final void run() {
        f9.a(this.f6168q, this.f6164m, this.f6165n, this.f6166o, this.f6167p);
    }
}
