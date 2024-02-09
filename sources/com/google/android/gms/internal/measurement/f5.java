package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class f5 extends p8<f5, a> implements fa {
    /* access modifiers changed from: private */
    public static final f5 zzc;
    private static volatile pa<f5> zzd;
    private int zze;
    private y8<g5> zzf = p8.F();
    private d5 zzg;

    public static final class a extends p8.b<f5, a> implements fa {
        private a() {
            super(f5.zzc);
        }

        /* synthetic */ a(c5 c5Var) {
            this();
        }
    }

    static {
        f5 f5Var = new f5();
        zzc = f5Var;
        p8.x(f5.class, f5Var);
    }

    private f5() {
    }

    public final d5 J() {
        d5 d5Var = this.zzg;
        return d5Var == null ? d5.K() : d5Var;
    }

    public final List<g5> L() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (c5.f5163a[i10 - 1]) {
            case 1:
                return new f5();
            case 2:
                return new a((c5) null);
            case 3:
                return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", g5.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                pa<f5> paVar = zzd;
                if (paVar == null) {
                    synchronized (f5.class) {
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
