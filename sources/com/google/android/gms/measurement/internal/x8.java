package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class x8 implements qc {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ y7 f6711a;

    x8(y7 y7Var) {
        this.f6711a = y7Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f6711a.X("auto", str2, bundle, str);
        } else {
            this.f6711a.x0("auto", str2, bundle);
        }
    }
}
