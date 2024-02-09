package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class b4 extends p8<b4, a> implements fa {
    /* access modifiers changed from: private */
    public static final b4 zzc;
    private static volatile pa<b4> zzd;
    private int zze;
    private int zzf = 14;
    private int zzg = 11;
    private int zzh = 60;

    public static final class a extends p8.b<b4, a> implements fa {
        private a() {
            super(b4.zzc);
        }

        /* synthetic */ a(w3 w3Var) {
            this();
        }
    }

    static {
        b4 b4Var = new b4();
        zzc = b4Var;
        p8.x(b4.class, b4Var);
    }

    private b4() {
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (w3.f5679a[i10 - 1]) {
            case 1:
                return new b4();
            case 2:
                return new a((w3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                pa<b4> paVar = zzd;
                if (paVar == null) {
                    synchronized (b4.class) {
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
