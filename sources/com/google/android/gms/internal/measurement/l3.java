package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.m3;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class l3 extends p8<l3, a> implements fa {
    /* access modifiers changed from: private */
    public static final l3 zzc;
    private static volatile pa<l3> zzd;
    private int zze;
    private int zzf;
    private y8<p3> zzg = p8.F();
    private y8<m3> zzh = p8.F();
    private boolean zzi;
    private boolean zzj;

    public static final class a extends p8.b<l3, a> implements fa {
        private a() {
            super(l3.zzc);
        }

        /* synthetic */ a(k3 k3Var) {
            this();
        }

        public final m3 A(int i10) {
            return ((l3) this.f5513n).J(i10);
        }

        public final int B() {
            return ((l3) this.f5513n).Q();
        }

        public final p3 C(int i10) {
            return ((l3) this.f5513n).P(i10);
        }

        public final int x() {
            return ((l3) this.f5513n).O();
        }

        public final a y(int i10, m3.a aVar) {
            t();
            ((l3) this.f5513n).K(i10, (m3) ((p8) aVar.l()));
            return this;
        }

        public final a z(int i10, p3.a aVar) {
            t();
            ((l3) this.f5513n).L(i10, (p3) ((p8) aVar.l()));
            return this;
        }
    }

    static {
        l3 l3Var = new l3();
        zzc = l3Var;
        p8.x(l3.class, l3Var);
    }

    private l3() {
    }

    /* access modifiers changed from: private */
    public final void K(int i10, m3 m3Var) {
        m3Var.getClass();
        y8<m3> y8Var = this.zzh;
        if (!y8Var.b()) {
            this.zzh = p8.s(y8Var);
        }
        this.zzh.set(i10, m3Var);
    }

    /* access modifiers changed from: private */
    public final void L(int i10, p3 p3Var) {
        p3Var.getClass();
        y8<p3> y8Var = this.zzg;
        if (!y8Var.b()) {
            this.zzg = p8.s(y8Var);
        }
        this.zzg.set(i10, p3Var);
    }

    public final m3 J(int i10) {
        return this.zzh.get(i10);
    }

    public final int O() {
        return this.zzh.size();
    }

    public final p3 P(int i10) {
        return this.zzg.get(i10);
    }

    public final int Q() {
        return this.zzg.size();
    }

    public final List<m3> S() {
        return this.zzh;
    }

    public final List<p3> T() {
        return this.zzg;
    }

    public final boolean U() {
        return (this.zze & 1) != 0;
    }

    public final int q() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (k3.f5401a[i10 - 1]) {
            case 1:
                return new l3();
            case 2:
                return new a((k3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", p3.class, "zzh", m3.class, "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                pa<l3> paVar = zzd;
                if (paVar == null) {
                    synchronized (l3.class) {
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
