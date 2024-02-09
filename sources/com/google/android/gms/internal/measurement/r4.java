package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.s4;
import java.util.List;

public final class r4 extends p8<r4, a> implements fa {
    /* access modifiers changed from: private */
    public static final r4 zzc;
    private static volatile pa<r4> zzd;
    private int zze;
    private y8<s4> zzf = p8.F();
    private String zzg = "";

    public static final class a extends p8.b<r4, a> implements fa {
        private a() {
            super(r4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }

        public final int x() {
            return ((r4) this.f5513n).q();
        }

        public final a y(s4.a aVar) {
            t();
            ((r4) this.f5513n).L((s4) ((p8) aVar.l()));
            return this;
        }

        public final s4 z(int i10) {
            return ((r4) this.f5513n).J(0);
        }
    }

    static {
        r4 r4Var = new r4();
        zzc = r4Var;
        p8.x(r4.class, r4Var);
    }

    private r4() {
    }

    /* access modifiers changed from: private */
    public final void L(s4 s4Var) {
        s4Var.getClass();
        y8<s4> y8Var = this.zzf;
        if (!y8Var.b()) {
            this.zzf = p8.s(y8Var);
        }
        this.zzf.add(s4Var);
    }

    public static a M() {
        return (a) zzc.A();
    }

    public final s4 J(int i10) {
        return this.zzf.get(0);
    }

    public final List<s4> O() {
        return this.zzf;
    }

    public final int q() {
        return this.zzf.size();
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new r4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0007\u0002\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000", new Object[]{"zze", "zzf", s4.class, "zzg"});
            case 4:
                return zzc;
            case 5:
                pa<r4> paVar = zzd;
                if (paVar == null) {
                    synchronized (r4.class) {
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
