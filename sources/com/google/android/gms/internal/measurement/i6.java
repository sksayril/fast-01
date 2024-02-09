package com.google.android.gms.internal.measurement;

import android.util.Log;

final class i6 extends f6<Boolean> {
    i6(n6 n6Var, String str, Boolean bool, boolean z9) {
        super(n6Var, str, bool);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object g(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (i5.f5340c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (i5.f5341d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String k10 = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid boolean value for " + k10 + ": " + valueOf);
        return null;
    }
}
