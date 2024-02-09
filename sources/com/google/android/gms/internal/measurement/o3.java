package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class o3 extends p8<o3, a> implements fa {
    /* access modifiers changed from: private */
    public static final o3 zzc;
    private static volatile pa<o3> zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    public static final class a extends p8.b<o3, a> implements fa {
        private a() {
            super(o3.zzc);
        }

        /* synthetic */ a(k3 k3Var) {
            this();
        }
    }

    public enum b implements v8 {
        UNKNOWN_COMPARISON_TYPE(0),
        LESS_THAN(1),
        GREATER_THAN(2),
        EQUAL(3),
        BETWEEN(4);
        
        private static final u8<b> zzf = null;
        private final int zzh;

        static {
            zzf = new r3();
        }

        private b(int i10) {
            this.zzh = i10;
        }

        public static b zza(int i10) {
            if (i10 == 0) {
                return UNKNOWN_COMPARISON_TYPE;
            }
            if (i10 == 1) {
                return LESS_THAN;
            }
            if (i10 == 2) {
                return GREATER_THAN;
            }
            if (i10 == 3) {
                return EQUAL;
            }
            if (i10 != 4) {
                return null;
            }
            return BETWEEN;
        }

        public static x8 zzb() {
            return s3.f5587a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzh;
        }
    }

    static {
        o3 o3Var = new o3();
        zzc = o3Var;
        p8.x(o3.class, o3Var);
    }

    private o3() {
    }

    public static o3 L() {
        return zzc;
    }

    public final b J() {
        b zza = b.zza(this.zzf);
        return zza == null ? b.UNKNOWN_COMPARISON_TYPE : zza;
    }

    public final String M() {
        return this.zzh;
    }

    public final String N() {
        return this.zzj;
    }

    public final String O() {
        return this.zzi;
    }

    public final boolean P() {
        return this.zzg;
    }

    public final boolean Q() {
        return (this.zze & 1) != 0;
    }

    public final boolean R() {
        return (this.zze & 4) != 0;
    }

    public final boolean S() {
        return (this.zze & 2) != 0;
    }

    public final boolean T() {
        return (this.zze & 16) != 0;
    }

    public final boolean U() {
        return (this.zze & 8) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (k3.f5401a[i10 - 1]) {
            case 1:
                return new o3();
            case 2:
                return new a((k3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", b.zzb(), "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                pa<o3> paVar = zzd;
                if (paVar == null) {
                    synchronized (o3.class) {
                        paVar = zzd;
                        if (paVar == null) {
                            paVar = new p8.a<>(zzc);
                            zzd = paVar;
                        }
                    }
                }
                return paVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
