package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class p3 extends p8<p3, a> implements fa {
    /* access modifiers changed from: private */
    public static final p3 zzc;
    private static volatile pa<p3> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private n3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public static final class a extends p8.b<p3, a> implements fa {
        private a() {
            super(p3.zzc);
        }

        /* synthetic */ a(k3 k3Var) {
            this();
        }

        public final a x(String str) {
            t();
            ((p3) this.f5513n).K(str);
            return this;
        }
    }

    static {
        p3 p3Var = new p3();
        zzc = p3Var;
        p8.x(p3.class, p3Var);
    }

    private p3() {
    }

    /* access modifiers changed from: private */
    public final void K(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a M() {
        return (a) zzc.A();
    }

    public final n3 L() {
        n3 n3Var = this.zzh;
        return n3Var == null ? n3.M() : n3Var;
    }

    public final String O() {
        return this.zzg;
    }

    public final boolean P() {
        return this.zzi;
    }

    public final boolean Q() {
        return this.zzj;
    }

    public final boolean R() {
        return this.zzk;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final boolean T() {
        return (this.zze & 32) != 0;
    }

    public final int q() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (k3.f5401a[i10 - 1]) {
            case 1:
                return new p3();
            case 2:
                return new a((k3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                pa<p3> paVar = zzd;
                if (paVar == null) {
                    synchronized (p3.class) {
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
