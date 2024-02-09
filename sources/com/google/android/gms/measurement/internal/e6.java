package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.vd;
import java.util.Map;

final class e6 implements vd {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f5995a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w5 f5996b;

    e6(w5 w5Var, String str) {
        this.f5996b = w5Var;
        this.f5995a = str;
    }

    public final String i(String str) {
        Map map = (Map) this.f5996b.f6649d.get(this.f5995a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
