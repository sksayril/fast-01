package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class m3 extends p8<m3, a> implements fa {
    /* access modifiers changed from: private */
    public static final m3 zzc;
    private static volatile pa<m3> zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private y8<n3> zzh = p8.F();
    private boolean zzi;
    private o3 zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    public static final class a extends p8.b<m3, a> implements fa {
        private a() {
            super(m3.zzc);
        }

        /* synthetic */ a(k3 k3Var) {
            this();
        }

        public final n3 A(int i10) {
            return ((m3) this.f5513n).J(i10);
        }

        public final String B() {
            return ((m3) this.f5513n).S();
        }

        public final int x() {
            return ((m3) this.f5513n).q();
        }

        public final a y(int i10, n3 n3Var) {
            t();
            ((m3) this.f5513n).K(i10, n3Var);
            return this;
        }

        public final a z(String str) {
            t();
            ((m3) this.f5513n).N(str);
            return this;
        }
    }

    static {
        m3 m3Var = new m3();
        zzc = m3Var;
        p8.x(m3.class, m3Var);
    }

    private m3() {
    }

    /* access modifiers changed from: private */
    public final void K(int i10, n3 n3Var) {
        n3Var.getClass();
        y8<n3> y8Var = this.zzh;
        if (!y8Var.b()) {
            this.zzh = p8.s(y8Var);
        }
        this.zzh.set(i10, n3Var);
    }

    /* access modifiers changed from: private */
    public final void N(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a P() {
        return (a) zzc.A();
    }

    public final n3 J(int i10) {
        return this.zzh.get(i10);
    }

    public final int O() {
        return this.zzf;
    }

    public final o3 R() {
        o3 o3Var = this.zzj;
        return o3Var == null ? o3.L() : o3Var;
    }

    public final String S() {
        return this.zzg;
    }

    public final List<n3> T() {
        return this.zzh;
    }

    public final boolean U() {
        return this.zzk;
    }

    public final boolean V() {
        return this.zzl;
    }

    public final boolean W() {
        return this.zzm;
    }

    public final boolean X() {
        return (this.zze & 8) != 0;
    }

    public final boolean Y() {
        return (this.zze & 1) != 0;
    }

    public final boolean Z() {
        return (this.zze & 64) != 0;
    }

    public final int q() {
        return this.zzh.size();
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (k3.f5401a[i10 - 1]) {
            case 1:
                return new m3();
            case 2:
                return new a((k3) null);
            case 3:
                return p8.v(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", n3.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                pa<m3> paVar = zzd;
                if (paVar == null) {
                    synchronized (m3.class) {
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
