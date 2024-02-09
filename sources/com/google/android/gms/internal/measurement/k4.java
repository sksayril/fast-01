package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class k4 extends p8<k4, a> implements fa {
    /* access modifiers changed from: private */
    public static final k4 zzc;
    private static volatile pa<k4> zzd;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    public static final class a extends p8.b<k4, a> implements fa {
        private a() {
            super(k4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }

        public final a A(boolean z9) {
            t();
            ((k4) this.f5513n).T(z9);
            return this;
        }

        public final a B(boolean z9) {
            t();
            ((k4) this.f5513n).W(z9);
            return this;
        }

        public final a C(boolean z9) {
            t();
            ((k4) this.f5513n).Z(z9);
            return this;
        }

        public final a D(boolean z9) {
            t();
            ((k4) this.f5513n).c0(z9);
            return this;
        }

        public final a x(boolean z9) {
            t();
            ((k4) this.f5513n).L(z9);
            return this;
        }

        public final a y(boolean z9) {
            t();
            ((k4) this.f5513n).O(z9);
            return this;
        }

        public final a z(boolean z9) {
            t();
            ((k4) this.f5513n).R(z9);
            return this;
        }
    }

    static {
        k4 k4Var = new k4();
        zzc = k4Var;
        p8.x(k4.class, k4Var);
    }

    private k4() {
    }

    public static a J() {
        return (a) zzc.A();
    }

    /* access modifiers changed from: private */
    public final void L(boolean z9) {
        this.zze |= 32;
        this.zzk = z9;
    }

    /* access modifiers changed from: private */
    public final void O(boolean z9) {
        this.zze |= 16;
        this.zzj = z9;
    }

    public static k4 P() {
        return zzc;
    }

    /* access modifiers changed from: private */
    public final void R(boolean z9) {
        this.zze |= 1;
        this.zzf = z9;
    }

    /* access modifiers changed from: private */
    public final void T(boolean z9) {
        this.zze |= 64;
        this.zzl = z9;
    }

    /* access modifiers changed from: private */
    public final void W(boolean z9) {
        this.zze |= 2;
        this.zzg = z9;
    }

    /* access modifiers changed from: private */
    public final void Z(boolean z9) {
        this.zze |= 4;
        this.zzh = z9;
    }

    /* access modifiers changed from: private */
    public final void c0(boolean z9) {
        this.zze |= 8;
        this.zzi = z9;
    }

    public final boolean U() {
        return this.zzk;
    }

    public final boolean X() {
        return this.zzj;
    }

    public final boolean a0() {
        return this.zzf;
    }

    public final boolean d0() {
        return this.zzl;
    }

    public final boolean e0() {
        return this.zzg;
    }

    public final boolean f0() {
        return this.zzh;
    }

    public final boolean g0() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new k4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                pa<k4> paVar = zzd;
                if (paVar == null) {
                    synchronized (k4.class) {
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
