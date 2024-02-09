package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class z3 extends p8<z3, a> implements fa {
    /* access modifiers changed from: private */
    public static final z3 zzc;
    private static volatile pa<z3> zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    public static final class a extends p8.b<z3, a> implements fa {
        private a() {
            super(z3.zzc);
        }

        /* synthetic */ a(w3 w3Var) {
            this();
        }

        public final boolean A() {
            return ((z3) this.f5513n).N();
        }

        public final boolean B() {
            return ((z3) this.f5513n).O();
        }

        public final boolean C() {
            return ((z3) this.f5513n).P();
        }

        public final boolean D() {
            return ((z3) this.f5513n).Q();
        }

        public final boolean E() {
            return ((z3) this.f5513n).R();
        }

        public final int x() {
            return ((z3) this.f5513n).q();
        }

        public final a y(String str) {
            t();
            ((z3) this.f5513n).K(str);
            return this;
        }

        public final String z() {
            return ((z3) this.f5513n).M();
        }
    }

    static {
        z3 z3Var = new z3();
        zzc = z3Var;
        p8.x(z3.class, z3Var);
    }

    private z3() {
    }

    /* access modifiers changed from: private */
    public final void K(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    public final String M() {
        return this.zzf;
    }

    public final boolean N() {
        return this.zzg;
    }

    public final boolean O() {
        return this.zzh;
    }

    public final boolean P() {
        return (this.zze & 2) != 0;
    }

    public final boolean Q() {
        return (this.zze & 4) != 0;
    }

    public final boolean R() {
        return (this.zze & 8) != 0;
    }

    public final int q() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (w3.f5679a[i10 - 1]) {
            case 1:
                return new z3();
            case 2:
                return new a((w3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                pa<z3> paVar = zzd;
                if (paVar == null) {
                    synchronized (z3.class) {
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
