package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class d4 extends p8<d4, a> implements fa {
    /* access modifiers changed from: private */
    public static final d4 zzc;
    private static volatile pa<d4> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    public static final class a extends p8.b<d4, a> implements fa {
        private a() {
            super(d4.zzc);
        }

        /* synthetic */ a(w3 w3Var) {
            this();
        }
    }

    static {
        d4 d4Var = new d4();
        zzc = d4Var;
        p8.x(d4.class, d4Var);
    }

    private d4() {
    }

    public final String K() {
        return this.zzf;
    }

    public final String L() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (w3.f5679a[i10 - 1]) {
            case 1:
                return new d4();
            case 2:
                return new a((w3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                pa<d4> paVar = zzd;
                if (paVar == null) {
                    synchronized (d4.class) {
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
