package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class m4 extends p8<m4, a> implements fa {
    /* access modifiers changed from: private */
    public static final m4 zzc;
    private static volatile pa<m4> zzd;
    private int zze;
    private int zzf;
    private long zzg;

    public static final class a extends p8.b<m4, a> implements fa {
        private a() {
            super(m4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }

        public final a x(int i10) {
            t();
            ((m4) this.f5513n).J(i10);
            return this;
        }

        public final a y(long j10) {
            t();
            ((m4) this.f5513n).K(j10);
            return this;
        }
    }

    static {
        m4 m4Var = new m4();
        zzc = m4Var;
        p8.x(m4.class, m4Var);
    }

    private m4() {
    }

    /* access modifiers changed from: private */
    public final void J(int i10) {
        this.zze |= 1;
        this.zzf = i10;
    }

    /* access modifiers changed from: private */
    public final void K(long j10) {
        this.zze |= 2;
        this.zzg = j10;
    }

    public static a O() {
        return (a) zzc.A();
    }

    public final long N() {
        return this.zzg;
    }

    public final boolean Q() {
        return (this.zze & 2) != 0;
    }

    public final boolean R() {
        return (this.zze & 1) != 0;
    }

    public final int q() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new m4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                pa<m4> paVar = zzd;
                if (paVar == null) {
                    synchronized (m4.class) {
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
