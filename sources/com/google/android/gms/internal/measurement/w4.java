package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class w4 extends p8<w4, a> implements fa {
    /* access modifiers changed from: private */
    public static final w4 zzc;
    private static volatile pa<w4> zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    public static final class a extends p8.b<w4, a> implements fa {
        private a() {
            super(w4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }

        public final a A(String str) {
            t();
            ((w4) this.f5513n).Q(str);
            return this;
        }

        public final a B() {
            t();
            ((w4) this.f5513n).k0();
            return this;
        }

        public final a C(long j10) {
            t();
            ((w4) this.f5513n).S(j10);
            return this;
        }

        public final a D(String str) {
            t();
            ((w4) this.f5513n).W(str);
            return this;
        }

        public final a E() {
            t();
            ((w4) this.f5513n).l0();
            return this;
        }

        public final a x() {
            t();
            ((w4) this.f5513n).j0();
            return this;
        }

        public final a y(double d10) {
            t();
            ((w4) this.f5513n).K(d10);
            return this;
        }

        public final a z(long j10) {
            t();
            ((w4) this.f5513n).L(j10);
            return this;
        }
    }

    static {
        w4 w4Var = new w4();
        zzc = w4Var;
        p8.x(w4.class, w4Var);
    }

    private w4() {
    }

    /* access modifiers changed from: private */
    public final void K(double d10) {
        this.zze |= 32;
        this.zzk = d10;
    }

    /* access modifiers changed from: private */
    public final void L(long j10) {
        this.zze |= 8;
        this.zzi = j10;
    }

    /* access modifiers changed from: private */
    public final void Q(String str) {
        str.getClass();
        this.zze |= 2;
        this.zzg = str;
    }

    /* access modifiers changed from: private */
    public final void S(long j10) {
        this.zze |= 1;
        this.zzf = j10;
    }

    /* access modifiers changed from: private */
    public final void W(String str) {
        str.getClass();
        this.zze |= 4;
        this.zzh = str;
    }

    public static a a0() {
        return (a) zzc.A();
    }

    /* access modifiers changed from: private */
    public final void j0() {
        this.zze &= -33;
        this.zzk = 0.0d;
    }

    /* access modifiers changed from: private */
    public final void k0() {
        this.zze &= -9;
        this.zzi = 0;
    }

    /* access modifiers changed from: private */
    public final void l0() {
        this.zze &= -5;
        this.zzh = zzc.zzh;
    }

    public final double J() {
        return this.zzk;
    }

    public final float R() {
        return this.zzj;
    }

    public final long X() {
        return this.zzi;
    }

    public final long Z() {
        return this.zzf;
    }

    public final String c0() {
        return this.zzg;
    }

    public final String d0() {
        return this.zzh;
    }

    public final boolean e0() {
        return (this.zze & 32) != 0;
    }

    public final boolean f0() {
        return (this.zze & 16) != 0;
    }

    public final boolean g0() {
        return (this.zze & 8) != 0;
    }

    public final boolean h0() {
        return (this.zze & 1) != 0;
    }

    public final boolean i0() {
        return (this.zze & 4) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new w4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
            case 4:
                return zzc;
            case 5:
                pa<w4> paVar = zzd;
                if (paVar == null) {
                    synchronized (w4.class) {
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
