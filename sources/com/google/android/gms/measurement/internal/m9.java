package com.google.android.gms.measurement.internal;

import java.util.Map;

public final /* synthetic */ class m9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ n9 f6322m;

    /* renamed from: n  reason: collision with root package name */
    private /* synthetic */ int f6323n;

    /* renamed from: o  reason: collision with root package name */
    private /* synthetic */ Exception f6324o;

    /* renamed from: p  reason: collision with root package name */
    private /* synthetic */ byte[] f6325p;

    /* renamed from: q  reason: collision with root package name */
    private /* synthetic */ Map f6326q;

    public /* synthetic */ m9(n9 n9Var, int i10, Exception exc, byte[] bArr, Map map) {
        this.f6322m = n9Var;
        this.f6323n = i10;
        this.f6324o = exc;
        this.f6325p = bArr;
        this.f6326q = map;
    }

    public final void run() {
        this.f6322m.a(this.f6323n, this.f6324o, this.f6325p, this.f6326q);
    }
}
