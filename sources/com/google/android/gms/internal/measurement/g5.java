package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class g5 extends p8<g5, a> implements fa {
    /* access modifiers changed from: private */
    public static final g5 zzc;
    private static volatile pa<g5> zzd;
    private int zze;
    private int zzf;
    private y8<g5> zzg = p8.F();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    public static final class a extends p8.b<g5, a> implements fa {
        private a() {
            super(g5.zzc);
        }

        /* synthetic */ a(c5 c5Var) {
            this();
        }
    }

    public enum b implements v8 {
        UNKNOWN(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        STATEMENT(4);
        
        private static final u8<b> zzf = null;
        private final int zzh;

        static {
            zzf = new h5();
        }

        private b(int i10) {
            this.zzh = i10;
        }

        public static b zza(int i10) {
            if (i10 == 0) {
                return UNKNOWN;
            }
            if (i10 == 1) {
                return STRING;
            }
            if (i10 == 2) {
                return NUMBER;
            }
            if (i10 == 3) {
                return BOOLEAN;
            }
            if (i10 != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static x8 zzb() {
            return j5.f5375a;
        }

        public final String toString() {
            return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzh;
        }
    }

    static {
        g5 g5Var = new g5();
        zzc = g5Var;
        p8.x(g5.class, g5Var);
    }

    private g5() {
    }

    public final double J() {
        return this.zzk;
    }

    public final b K() {
        b zza = b.zza(this.zzf);
        return zza == null ? b.UNKNOWN : zza;
    }

    public final String M() {
        return this.zzh;
    }

    public final String N() {
        return this.zzi;
    }

    public final List<g5> O() {
        return this.zzg;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean Q() {
        return (this.zze & 8) != 0;
    }

    public final boolean R() {
        return (this.zze & 16) != 0;
    }

    public final boolean S() {
        return (this.zze & 4) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        Class<g5> cls = g5.class;
        switch (c5.f5163a[i10 - 1]) {
            case 1:
                return new g5();
            case 2:
                return new a((c5) null);
            case 3:
                return p8.v(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", b.zzb(), "zzg", cls, "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                pa<g5> paVar = zzd;
                if (paVar == null) {
                    synchronized (cls) {
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
