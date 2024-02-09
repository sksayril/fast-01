package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class q3 extends p8<q3, b> implements fa {
    /* access modifiers changed from: private */
    public static final q3 zzc;
    private static volatile pa<q3> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private boolean zzh;
    private y8<String> zzi = p8.F();

    public enum a implements v8 {
        UNKNOWN_MATCH_TYPE(0),
        REGEXP(1),
        BEGINS_WITH(2),
        ENDS_WITH(3),
        PARTIAL(4),
        EXACT(5),
        IN_LIST(6);
        
        private static final u8<a> zzh = null;
        private final int zzj;

        static {
            zzh = new v3();
        }

        private a(int i10) {
            this.zzj = i10;
        }

        public static a zza(int i10) {
            switch (i10) {
                case 0:
                    return UNKNOWN_MATCH_TYPE;
                case 1:
                    return REGEXP;
                case 2:
                    return BEGINS_WITH;
                case 3:
                    return ENDS_WITH;
                case 4:
                    return PARTIAL;
                case 5:
                    return EXACT;
                case 6:
                    return IN_LIST;
                default:
                    return null;
            }
        }

        public static x8 zzb() {
            return t3.f5618a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzj + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzj;
        }
    }

    public static final class b extends p8.b<q3, b> implements fa {
        private b() {
            super(q3.zzc);
        }

        /* synthetic */ b(k3 k3Var) {
            this();
        }
    }

    static {
        q3 q3Var = new q3();
        zzc = q3Var;
        p8.x(q3.class, q3Var);
    }

    private q3() {
    }

    public static q3 L() {
        return zzc;
    }

    public final a J() {
        a zza = a.zza(this.zzf);
        return zza == null ? a.UNKNOWN_MATCH_TYPE : zza;
    }

    public final String M() {
        return this.zzg;
    }

    public final List<String> N() {
        return this.zzi;
    }

    public final boolean O() {
        return this.zzh;
    }

    public final boolean P() {
        return (this.zze & 4) != 0;
    }

    public final boolean Q() {
        return (this.zze & 2) != 0;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final int q() {
        return this.zzi.size();
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (k3.f5401a[i10 - 1]) {
            case 1:
                return new q3();
            case 2:
                return new b((k3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", a.zzb(), "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                pa<q3> paVar = zzd;
                if (paVar == null) {
                    synchronized (q3.class) {
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
