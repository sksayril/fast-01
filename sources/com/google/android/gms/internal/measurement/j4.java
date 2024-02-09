package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class j4 extends p8<j4, a> implements fa {
    /* access modifiers changed from: private */
    public static final j4 zzc;
    private static volatile pa<j4> zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    public static final class a extends p8.b<j4, a> implements fa {
        private a() {
            super(j4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }
    }

    static {
        j4 j4Var = new j4();
        zzc = j4Var;
        p8.x(j4.class, j4Var);
    }

    private j4() {
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new j4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
            case 4:
                return zzc;
            case 5:
                pa<j4> paVar = zzd;
                if (paVar == null) {
                    synchronized (j4.class) {
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
