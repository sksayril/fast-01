package com.google.android.gms.internal.measurement;

public enum hc {
    DOUBLE(rc.DOUBLE, 1),
    FLOAT(rc.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(rc.BOOLEAN, 0),
    GROUP(r19, (rc) null),
    MESSAGE(r19, (rc) null),
    BYTES(rc.BYTE_STRING, (rc) null),
    UINT32(r11, 0),
    ENUM(rc.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final rc zzt;
    private final int zzu;

    private hc(rc rcVar, int i10) {
        this.zzt = rcVar;
        this.zzu = i10;
    }

    public final int zza() {
        return this.zzu;
    }

    public final rc zzb() {
        return this.zzt;
    }
}
