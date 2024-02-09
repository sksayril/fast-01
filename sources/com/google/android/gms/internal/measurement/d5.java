package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class d5 extends p8<d5, a> implements fa {
    /* access modifiers changed from: private */
    public static final d5 zzc;
    private static volatile pa<d5> zzd;
    private y8<e5> zze = p8.F();

    public static final class a extends p8.b<d5, a> implements fa {
        private a() {
            super(d5.zzc);
        }

        /* synthetic */ a(c5 c5Var) {
            this();
        }
    }

    static {
        d5 d5Var = new d5();
        zzc = d5Var;
        p8.x(d5.class, d5Var);
    }

    private d5() {
    }

    public static d5 K() {
        return zzc;
    }

    public final List<e5> L() {
        return this.zze;
    }

    public final int q() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (c5.f5163a[i10 - 1]) {
            case 1:
                return new d5();
            case 2:
                return new a((c5) null);
            case 3:
                return p8.v(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", e5.class});
            case 4:
                return zzc;
            case 5:
                pa<d5> paVar = zzd;
                if (paVar == null) {
                    synchronized (d5.class) {
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
