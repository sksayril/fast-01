package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

public final /* synthetic */ class y5 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ w5 f6725a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f6726b;

    public /* synthetic */ y5(w5 w5Var, String str) {
        this.f6725a = w5Var;
        this.f6726b = str;
    }

    public final Object call() {
        w5 w5Var = this.f6725a;
        String str = this.f6726b;
        h6 C0 = w5Var.p().C0(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        hashMap.put("gmp_version", 82001L);
        if (C0 != null) {
            String h10 = C0.h();
            if (h10 != null) {
                hashMap.put("app_version", h10);
            }
            hashMap.put("app_version_int", Long.valueOf(C0.z()));
            hashMap.put("dynamite_version", Long.valueOf(C0.c0()));
        }
        return hashMap;
    }
}
