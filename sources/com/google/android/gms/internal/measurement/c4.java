package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class c4 extends p8<c4, a> implements fa {
    /* access modifiers changed from: private */
    public static final c4 zzc;
    private static volatile pa<c4> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    public static final class a extends p8.b<c4, a> implements fa {
        private a() {
            super(c4.zzc);
        }

        /* synthetic */ a(w3 w3Var) {
            this();
        }
    }

    static {
        c4 c4Var = new c4();
        zzc = c4Var;
        p8.x(c4.class, c4Var);
    }

    private c4() {
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (w3.f5679a[i10 - 1]) {
            case 1:
                return new c4();
            case 2:
                return new a((w3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                pa<c4> paVar = zzd;
                if (paVar == null) {
                    synchronized (c4.class) {
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
