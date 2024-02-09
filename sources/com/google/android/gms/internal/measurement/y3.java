package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class y3 extends p8<y3, a> implements fa {
    /* access modifiers changed from: private */
    public static final y3 zzc;
    private static volatile pa<y3> zzd;
    private int zze;
    private String zzf = "";
    private y8<c4> zzg = p8.F();
    private boolean zzh;

    public static final class a extends p8.b<y3, a> implements fa {
        private a() {
            super(y3.zzc);
        }

        /* synthetic */ a(w3 w3Var) {
            this();
        }
    }

    static {
        y3 y3Var = new y3();
        zzc = y3Var;
        p8.x(y3.class, y3Var);
    }

    private y3() {
    }

    public final String K() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (w3.f5679a[i10 - 1]) {
            case 1:
                return new y3();
            case 2:
                return new a((w3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", c4.class, "zzh"});
            case 4:
                return zzc;
            case 5:
                pa<y3> paVar = zzd;
                if (paVar == null) {
                    synchronized (y3.class) {
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
