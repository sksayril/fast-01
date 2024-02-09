package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class v4 extends p8<v4, a> implements fa {
    /* access modifiers changed from: private */
    public static final v4 zzc;
    private static volatile pa<v4> zzd;
    private int zze;
    private int zzf;
    private z8 zzg = p8.E();

    public static final class a extends p8.b<v4, a> implements fa {
        private a() {
            super(v4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }

        public final a x(int i10) {
            t();
            ((v4) this.f5513n).O(i10);
            return this;
        }

        public final a y(Iterable<? extends Long> iterable) {
            t();
            ((v4) this.f5513n).M(iterable);
            return this;
        }
    }

    static {
        v4 v4Var = new v4();
        zzc = v4Var;
        p8.x(v4.class, v4Var);
    }

    private v4() {
    }

    /* access modifiers changed from: private */
    public final void M(Iterable<? extends Long> iterable) {
        z8 z8Var = this.zzg;
        if (!z8Var.b()) {
            this.zzg = p8.t(z8Var);
        }
        w6.c(iterable, this.zzg);
    }

    /* access modifiers changed from: private */
    public final void O(int i10) {
        this.zze |= 1;
        this.zzf = i10;
    }

    public static a P() {
        return (a) zzc.A();
    }

    public final long J(int i10) {
        return this.zzg.j(i10);
    }

    public final int N() {
        return this.zzf;
    }

    public final List<Long> R() {
        return this.zzg;
    }

    public final boolean S() {
        return (this.zze & 1) != 0;
    }

    public final int q() {
        return this.zzg.size();
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new v4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                pa<v4> paVar = zzd;
                if (paVar == null) {
                    synchronized (v4.class) {
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
