package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;

public final class o4 extends p8<o4, a> implements fa {
    /* access modifiers changed from: private */
    public static final o4 zzc;
    private static volatile pa<o4> zzd;
    private int zze;
    private String zzf = "";
    private long zzg;

    public static final class a extends p8.b<o4, a> implements fa {
        private a() {
            super(o4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }

        public final a x(long j10) {
            t();
            ((o4) this.f5513n).K(j10);
            return this;
        }

        public final a y(String str) {
            t();
            ((o4) this.f5513n).N(str);
            return this;
        }
    }

    static {
        o4 o4Var = new o4();
        zzc = o4Var;
        p8.x(o4.class, o4Var);
    }

    private o4() {
    }

    public static a J() {
        return (a) zzc.A();
    }

    /* access modifiers changed from: private */
    public final void K(long j10) {
        this.zze |= 2;
        this.zzg = j10;
    }

    /* access modifiers changed from: private */
    public final void N(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzf = str;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new o4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                pa<o4> paVar = zzd;
                if (paVar == null) {
                    synchronized (o4.class) {
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
