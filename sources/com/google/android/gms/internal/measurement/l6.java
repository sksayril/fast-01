package com.google.android.gms.internal.measurement;

import android.util.Log;

final class l6 extends f6<Double> {
    l6(n6 n6Var, String str, Double d10, boolean z9) {
        super(n6Var, str, d10);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final Double g(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k10 = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid double value for " + k10 + ": " + valueOf);
        return null;
    }
}
