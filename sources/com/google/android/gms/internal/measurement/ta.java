package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class ta {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Callable<? extends m>> f5625a = new HashMap();

    public final r a(String str) {
        if (!this.f5625a.containsKey(str)) {
            return r.f5547d;
        }
        try {
            return (r) this.f5625a.get(str).call();
        } catch (Exception unused) {
            throw new IllegalStateException("Failed to create API implementation: " + str);
        }
    }

    public final void b(String str, Callable<? extends m> callable) {
        this.f5625a.put(str, callable);
    }
}
