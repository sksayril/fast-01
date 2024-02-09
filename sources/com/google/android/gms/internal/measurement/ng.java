package com.google.android.gms.internal.measurement;

public enum ng {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);
    
    private final int zzg;

    private ng(int i10) {
        this.zzg = i10;
    }

    public static ng zza(int i10) {
        return i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? INFO : ERROR : WARN : DEBUG : VERBOSE;
    }
}
