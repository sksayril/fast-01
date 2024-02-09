package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class q4 extends p8<q4, a> implements fa {
    /* access modifiers changed from: private */
    public static final q4 zzc;
    private static volatile pa<q4> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private j4 zzh;

    public static final class a extends p8.b<q4, a> implements fa {
        private a() {
            super(q4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }
    }

    static {
        q4 q4Var = new q4();
        zzc = q4Var;
        p8.x(q4.class, q4Var);
    }

    private q4() {
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new q4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                pa<q4> paVar = zzd;
                if (paVar == null) {
                    synchronized (q4.class) {
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
