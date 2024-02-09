package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class e5 extends p8<e5, a> implements fa {
    /* access modifiers changed from: private */
    public static final e5 zzc;
    private static volatile pa<e5> zzd;
    private int zze;
    private String zzf = "";
    private y8<g5> zzg = p8.F();

    public static final class a extends p8.b<e5, a> implements fa {
        private a() {
            super(e5.zzc);
        }

        /* synthetic */ a(c5 c5Var) {
            this();
        }
    }

    static {
        e5 e5Var = new e5();
        zzc = e5Var;
        p8.x(e5.class, e5Var);
    }

    private e5() {
    }

    public final String K() {
        return this.zzf;
    }

    public final List<g5> L() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (c5.f5163a[i10 - 1]) {
            case 1:
                return new e5();
            case 2:
                return new a((c5) null);
            case 3:
                return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", g5.class});
            case 4:
                return zzc;
            case 5:
                pa<e5> paVar = zzd;
                if (paVar == null) {
                    synchronized (e5.class) {
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
