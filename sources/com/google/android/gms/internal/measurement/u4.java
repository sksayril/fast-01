package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class u4 extends p8<u4, a> implements fa {
    /* access modifiers changed from: private */
    public static final u4 zzc;
    private static volatile pa<u4> zzd;
    private z8 zze = p8.E();
    private z8 zzf = p8.E();
    private y8<m4> zzg = p8.F();
    private y8<v4> zzh = p8.F();

    public static final class a extends p8.b<u4, a> implements fa {
        private a() {
            super(u4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }

        public final a A(Iterable<? extends Long> iterable) {
            t();
            ((u4) this.f5513n).P(iterable);
            return this;
        }

        public final a B() {
            t();
            ((u4) this.f5513n).h0();
            return this;
        }

        public final a C(Iterable<? extends v4> iterable) {
            t();
            ((u4) this.f5513n).T(iterable);
            return this;
        }

        public final a D() {
            t();
            ((u4) this.f5513n).i0();
            return this;
        }

        public final a E(Iterable<? extends Long> iterable) {
            t();
            ((u4) this.f5513n).X(iterable);
            return this;
        }

        public final a x() {
            t();
            ((u4) this.f5513n).f0();
            return this;
        }

        public final a y(Iterable<? extends m4> iterable) {
            t();
            ((u4) this.f5513n).L(iterable);
            return this;
        }

        public final a z() {
            t();
            ((u4) this.f5513n).g0();
            return this;
        }
    }

    static {
        u4 u4Var = new u4();
        zzc = u4Var;
        p8.x(u4.class, u4Var);
    }

    private u4() {
    }

    /* access modifiers changed from: private */
    public final void L(Iterable<? extends m4> iterable) {
        y8<m4> y8Var = this.zzg;
        if (!y8Var.b()) {
            this.zzg = p8.s(y8Var);
        }
        w6.c(iterable, this.zzg);
    }

    /* access modifiers changed from: private */
    public final void P(Iterable<? extends Long> iterable) {
        z8 z8Var = this.zzf;
        if (!z8Var.b()) {
            this.zzf = p8.t(z8Var);
        }
        w6.c(iterable, this.zzf);
    }

    /* access modifiers changed from: private */
    public final void T(Iterable<? extends v4> iterable) {
        y8<v4> y8Var = this.zzh;
        if (!y8Var.b()) {
            this.zzh = p8.s(y8Var);
        }
        w6.c(iterable, this.zzh);
    }

    /* access modifiers changed from: private */
    public final void X(Iterable<? extends Long> iterable) {
        z8 z8Var = this.zze;
        if (!z8Var.b()) {
            this.zze = p8.t(z8Var);
        }
        w6.c(iterable, this.zze);
    }

    public static a Y() {
        return (a) zzc.A();
    }

    public static u4 a0() {
        return zzc;
    }

    /* access modifiers changed from: private */
    public final void f0() {
        this.zzg = p8.F();
    }

    /* access modifiers changed from: private */
    public final void g0() {
        this.zzf = p8.E();
    }

    /* access modifiers changed from: private */
    public final void h0() {
        this.zzh = p8.F();
    }

    /* access modifiers changed from: private */
    public final void i0() {
        this.zze = p8.E();
    }

    public final int M() {
        return this.zzf.size();
    }

    public final int Q() {
        return this.zzh.size();
    }

    public final int U() {
        return this.zze.size();
    }

    public final List<m4> b0() {
        return this.zzg;
    }

    public final List<Long> c0() {
        return this.zzf;
    }

    public final List<v4> d0() {
        return this.zzh;
    }

    public final List<Long> e0() {
        return this.zze;
    }

    public final int q() {
        return this.zzg.size();
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new u4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", m4.class, "zzh", v4.class});
            case 4:
                return zzc;
            case 5:
                pa<u4> paVar = zzd;
                if (paVar == null) {
                    synchronized (u4.class) {
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
