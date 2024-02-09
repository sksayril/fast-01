package com.google.android.gms.internal.measurement;

import java.lang.reflect.Type;

public enum j8 {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r10),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r15),
    FIXED64(5, r4, r12),
    FIXED32(6, r4, r15),
    BOOL(7, r4, r19),
    STRING(8, r4, r21),
    MESSAGE(9, r4, r23),
    BYTES(10, r4, r25),
    UINT32(11, r4, r15),
    ENUM(12, r4, r28),
    SFIXED32(13, r4, r15),
    SFIXED64(14, r4, r12),
    SINT32(15, r4, r15),
    SINT64(16, r4, r12),
    GROUP(17, r4, r23),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r10),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r15),
    FIXED64_LIST(23, r4, r12),
    FIXED32_LIST(24, r4, r15),
    BOOL_LIST(25, r4, r19),
    STRING_LIST(26, r4, r21),
    MESSAGE_LIST(27, r4, r23),
    BYTES_LIST(28, r4, r25),
    UINT32_LIST(29, r4, r15),
    ENUM_LIST(30, r4, r28),
    SFIXED32_LIST(31, r4, r15),
    SFIXED64_LIST(32, r4, r12),
    SINT32_LIST(33, r4, r15),
    SINT64_LIST(34, r4, r12),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r10),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r15),
    FIXED64_LIST_PACKED(40, r4, r12),
    FIXED32_LIST_PACKED(41, r4, r15),
    BOOL_LIST_PACKED(42, r4, r19),
    UINT32_LIST_PACKED(43, r4, r15),
    ENUM_LIST_PACKED(44, r4, r28),
    SFIXED32_LIST_PACKED(45, r4, r15),
    SFIXED64_LIST_PACKED(46, r4, r12),
    SINT32_LIST_PACKED(47, r4, r15),
    SINT64_LIST_PACKED(48, r4, r12),
    GROUP_LIST(49, r34, r23),
    MAP(50, l8.MAP, d9.VOID);
    
    private static final j8[] zzaz = null;
    private static final Type[] zzba = null;
    private final d9 zzbc;
    private final int zzbd;
    private final l8 zzbe;
    private final Class<?> zzbf;
    private final boolean zzbg;

    static {
        int i10;
        zzba = new Type[0];
        j8[] values = values();
        zzaz = new j8[values.length];
        for (j8 j8Var : values) {
            zzaz[j8Var.zzbd] = j8Var;
        }
    }

    private j8(int i10, l8 l8Var, d9 d9Var) {
        int i11;
        this.zzbd = i10;
        this.zzbe = l8Var;
        this.zzbc = d9Var;
        int ordinal = l8Var.ordinal();
        boolean z9 = true;
        this.zzbf = (ordinal == 1 || ordinal == 3) ? d9Var.zza() : null;
        this.zzbg = (l8Var != l8.SCALAR || (i11 = m8.f5445a[d9Var.ordinal()]) == 1 || i11 == 2 || i11 == 3) ? false : z9;
    }

    public final int zza() {
        return this.zzbd;
    }
}
