package com.google.android.gms.measurement.internal;

enum k {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');
    
    /* access modifiers changed from: private */
    public final char zzj;

    private k(char c10) {
        this.zzj = c10;
    }

    public static k zza(char c10) {
        for (k kVar : values()) {
            if (kVar.zzj == c10) {
                return kVar;
            }
        }
        return UNSET;
    }
}
