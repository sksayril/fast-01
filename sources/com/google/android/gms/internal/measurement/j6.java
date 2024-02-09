package com.google.android.gms.internal.measurement;

import android.util.Log;

final class j6 extends f6<Long> {
    j6(n6 n6Var, String str, Long l10, boolean z9) {
        super(n6Var, str, l10);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final Long g(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k10 = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid long value for " + k10 + ": " + valueOf);
        return null;
    }
}
