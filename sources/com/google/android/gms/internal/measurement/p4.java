package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class p4 extends p8<p4, a> implements fa {
    /* access modifiers changed from: private */
    public static final p4 zzc;
    private static volatile pa<p4> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;
    private y8<p4> zzk = p8.F();

    public static final class a extends p8.b<p4, a> implements fa {
        private a() {
            super(p4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }

        public final a A(a aVar) {
            t();
            ((p4) this.f5513n).d0((p4) ((p8) aVar.l()));
            return this;
        }

        public final a B(Iterable<? extends p4> iterable) {
            t();
            ((p4) this.f5513n).S(iterable);
            return this;
        }

        public final a C(String str) {
            t();
            ((p4) this.f5513n).T(str);
            return this;
        }

        public final a D() {
            t();
            ((p4) this.f5513n).n0();
            return this;
        }

        public final a E(String str) {
            t();
            ((p4) this.f5513n).X(str);
            return this;
        }

        public final a F() {
            t();
            ((p4) this.f5513n).o0();
            return this;
        }

        public final a G() {
            t();
            ((p4) this.f5513n).p0();
            return this;
        }

        public final a H() {
            t();
            ((p4) this.f5513n).q0();
            return this;
        }

        public final int x() {
            return ((p4) this.f5513n).Y();
        }

        public final a y(double d10) {
            t();
            ((p4) this.f5513n).K(d10);
            return this;
        }

        public final a z(long j10) {
            t();
            ((p4) this.f5513n).L(j10);
            return this;
        }
    }

    static {
        p4 p4Var = new p4();
        zzc = p4Var;
        p8.x(p4.class, p4Var);
    }

    private p4() {
    }

    /* access modifiers changed from: private */
    public final void K(double d10) {
        this.zze |= 16;
        this.zzj = d10;
    }

    /* access modifiers changed from: private */
    public final void L(long j10) {
        this.zze |= 4;
        this.zzh = j10;
    }

    /* access modifiers changed from: private */
    public final void S(Iterable<? extends p4> iterable) {
        r0();
        w6.c(iterable, this.zzk);
    }

    /* access modifiers changed from: private */
    public final void T(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    /* access modifiers changed from: private */
    public final void X(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    public static a c0() {
        return (a) zzc.A();
    }

    /* access modifiers changed from: private */
    public final void d0(p4 p4Var) {
        p4Var.getClass();
        r0();
        this.zzk.add(p4Var);
    }

    /* access modifiers changed from: private */
    public final void n0() {
        this.zze &= -17;
        this.zzj = 0.0d;
    }

    /* access modifiers changed from: private */
    public final void o0() {
        this.zze &= -5;
        this.zzh = 0;
    }

    /* access modifiers changed from: private */
    public final void p0() {
        this.zzk = p8.F();
    }

    /* access modifiers changed from: private */
    public final void q0() {
        this.zze &= -3;
        this.zzg = zzc.zzg;
    }

    private final void r0() {
        y8<p4> y8Var = this.zzk;
        if (!y8Var.b()) {
            this.zzk = p8.s(y8Var);
        }
    }

    public final double J() {
        return this.zzj;
    }

    public final float U() {
        return this.zzi;
    }

    public final int Y() {
        return this.zzk.size();
    }

    public final long a0() {
        return this.zzh;
    }

    public final String f0() {
        return this.zzf;
    }

    public final String g0() {
        return this.zzg;
    }

    public final List<p4> h0() {
        return this.zzk;
    }

    public final boolean i0() {
        return (this.zze & 16) != 0;
    }

    public final boolean j0() {
        return (this.zze & 8) != 0;
    }

    public final boolean k0() {
        return (this.zze & 4) != 0;
    }

    public final boolean l0() {
        return (this.zze & 1) != 0;
    }

    public final boolean m0() {
        return (this.zze & 2) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        Class<p4> cls = p4.class;
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new p4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", cls});
            case 4:
                return zzc;
            case 5:
                pa<p4> paVar = zzd;
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
