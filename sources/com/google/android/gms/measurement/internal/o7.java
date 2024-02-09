package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.p7;

public enum o7 {
    STORAGE(p7.a.AD_STORAGE, p7.a.ANALYTICS_STORAGE),
    DMA(p7.a.AD_USER_DATA);
    
    /* access modifiers changed from: private */
    public final p7.a[] zzd;

    private o7(p7.a... aVarArr) {
        this.zzd = aVarArr;
    }

    public final p7.a[] zza() {
        return this.zzd;
    }
}
