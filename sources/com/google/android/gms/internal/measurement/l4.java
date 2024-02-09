package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.u4;

public final class l4 extends p8<l4, a> implements fa {
    /* access modifiers changed from: private */
    public static final l4 zzc;
    private static volatile pa<l4> zzd;
    private int zze;
    private int zzf;
    private u4 zzg;
    private u4 zzh;
    private boolean zzi;

    public static final class a extends p8.b<l4, a> implements fa {
        private a() {
            super(l4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }

        public final a A(boolean z9) {
            t();
            ((l4) this.f5513n).O(z9);
            return this;
        }

        public final a x(int i10) {
            t();
            ((l4) this.f5513n).J(i10);
            return this;
        }

        public final a y(u4.a aVar) {
            t();
            ((l4) this.f5513n).N((u4) ((p8) aVar.l()));
            return this;
        }

        public final a z(u4 u4Var) {
            t();
            ((l4) this.f5513n).R(u4Var);
            return this;
        }
    }

    static {
        l4 l4Var = new l4();
        zzc = l4Var;
        p8.x(l4.class, l4Var);
    }

    private l4() {
    }

    /* access modifiers changed from: private */
    public final void J(int i10) {
        this.zze |= 1;
        this.zzf = i10;
    }

    /* access modifiers changed from: private */
    public final void N(u4 u4Var) {
        u4Var.getClass();
        this.zzg = u4Var;
        this.zze |= 2;
    }

    /* access modifiers changed from: private */
    public final void O(boolean z9) {
        this.zze |= 8;
        this.zzi = z9;
    }

    public static a P() {
        return (a) zzc.A();
    }

    /* access modifiers changed from: private */
    public final void R(u4 u4Var) {
        u4Var.getClass();
        this.zzh = u4Var;
        this.zze |= 4;
    }

    public final u4 T() {
        u4 u4Var = this.zzg;
        return u4Var == null ? u4.a0() : u4Var;
    }

    public final u4 U() {
        u4 u4Var = this.zzh;
        return u4Var == null ? u4.a0() : u4Var;
    }

    public final boolean V() {
        return this.zzi;
    }

    public final boolean W() {
        return (this.zze & 1) != 0;
    }

    public final boolean X() {
        return (this.zze & 8) != 0;
    }

    public final boolean Y() {
        return (this.zze & 4) != 0;
    }

    public final int q() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new l4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                pa<l4> paVar = zzd;
                if (paVar == null) {
                    synchronized (l4.class) {
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
