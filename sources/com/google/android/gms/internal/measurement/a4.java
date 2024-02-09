package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.z3;
import java.util.Collections;
import java.util.List;

public final class a4 extends p8<a4, a> implements fa {
    /* access modifiers changed from: private */
    public static final a4 zzc;
    private static volatile pa<a4> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private y8<d4> zzi = p8.F();
    private y8<z3> zzj = p8.F();
    private y8<l3> zzk = p8.F();
    private String zzl = "";
    private boolean zzm;
    private y8<f5> zzn = p8.F();
    private y8<y3> zzo = p8.F();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private x3 zzt;
    private b4 zzu;

    public static final class a extends p8.b<a4, a> implements fa {
        private a() {
            super(a4.zzc);
        }

        /* synthetic */ a(w3 w3Var) {
            this();
        }

        public final a A() {
            t();
            ((a4) this.f5513n).f0();
            return this;
        }

        public final String B() {
            return ((a4) this.f5513n).W();
        }

        public final List<l3> C() {
            return Collections.unmodifiableList(((a4) this.f5513n).X());
        }

        public final List<y3> D() {
            return Collections.unmodifiableList(((a4) this.f5513n).Y());
        }

        public final int x() {
            return ((a4) this.f5513n).N();
        }

        public final z3 y(int i10) {
            return ((a4) this.f5513n).J(i10);
        }

        public final a z(int i10, z3.a aVar) {
            t();
            ((a4) this.f5513n).K(i10, (z3) ((p8) aVar.l()));
            return this;
        }
    }

    static {
        a4 a4Var = new a4();
        zzc = a4Var;
        p8.x(a4.class, a4Var);
    }

    private a4() {
    }

    /* access modifiers changed from: private */
    public final void K(int i10, z3 z3Var) {
        z3Var.getClass();
        y8<z3> y8Var = this.zzj;
        if (!y8Var.b()) {
            this.zzj = p8.s(y8Var);
        }
        this.zzj.set(i10, z3Var);
    }

    public static a Q() {
        return (a) zzc.A();
    }

    public static a4 S() {
        return zzc;
    }

    /* access modifiers changed from: private */
    public final void f0() {
        this.zzk = p8.F();
    }

    public final z3 J(int i10) {
        return this.zzj.get(i10);
    }

    public final int N() {
        return this.zzj.size();
    }

    public final long O() {
        return this.zzf;
    }

    public final x3 P() {
        x3 x3Var = this.zzt;
        return x3Var == null ? x3.K() : x3Var;
    }

    public final String T() {
        return this.zzg;
    }

    public final String U() {
        return this.zzr;
    }

    public final String V() {
        return this.zzq;
    }

    public final String W() {
        return this.zzp;
    }

    public final List<l3> X() {
        return this.zzk;
    }

    public final List<y3> Y() {
        return this.zzo;
    }

    public final List<f5> Z() {
        return this.zzn;
    }

    public final List<d4> a0() {
        return this.zzi;
    }

    public final boolean b0() {
        return this.zzm;
    }

    public final boolean c0() {
        return (this.zze & 512) != 0;
    }

    public final boolean d0() {
        return (this.zze & 2) != 0;
    }

    public final boolean e0() {
        return (this.zze & 1) != 0;
    }

    public final int q() {
        return this.zzn.size();
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (w3.f5679a[i10 - 1]) {
            case 1:
                return new a4();
            case 2:
                return new a((w3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b\u000fဉ\t\u0010ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", d4.class, "zzj", z3.class, "zzk", l3.class, "zzl", "zzm", "zzn", f5.class, "zzo", y3.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            case 4:
                return zzc;
            case 5:
                pa<a4> paVar = zzd;
                if (paVar == null) {
                    synchronized (a4.class) {
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
