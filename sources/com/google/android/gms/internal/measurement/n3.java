package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class n3 extends p8<n3, a> implements fa {
    /* access modifiers changed from: private */
    public static final n3 zzc;
    private static volatile pa<n3> zzd;
    private int zze;
    private q3 zzf;
    private o3 zzg;
    private boolean zzh;
    private String zzi = "";

    public static final class a extends p8.b<n3, a> implements fa {
        private a() {
            super(n3.zzc);
        }

        /* synthetic */ a(k3 k3Var) {
            this();
        }

        public final a x(String str) {
            t();
            ((n3) this.f5513n).L(str);
            return this;
        }
    }

    static {
        n3 n3Var = new n3();
        zzc = n3Var;
        p8.x(n3.class, n3Var);
    }

    private n3() {
    }

    /* access modifiers changed from: private */
    public final void L(String str) {
        str.getClass();
        this.zze |= 8;
        this.zzi = str;
    }

    public static n3 M() {
        return zzc;
    }

    public final o3 N() {
        o3 o3Var = this.zzg;
        return o3Var == null ? o3.L() : o3Var;
    }

    public final q3 O() {
        q3 q3Var = this.zzf;
        return q3Var == null ? q3.L() : q3Var;
    }

    public final String P() {
        return this.zzi;
    }

    public final boolean Q() {
        return this.zzh;
    }

    public final boolean R() {
        return (this.zze & 4) != 0;
    }

    public final boolean S() {
        return (this.zze & 2) != 0;
    }

    public final boolean T() {
        return (this.zze & 8) != 0;
    }

    public final boolean U() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (k3.f5401a[i10 - 1]) {
            case 1:
                return new n3();
            case 2:
                return new a((k3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                pa<n3> paVar = zzd;
                if (paVar == null) {
                    synchronized (n3.class) {
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
