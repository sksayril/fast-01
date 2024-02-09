package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.p8;

public final class t4 extends p8<t4, b> implements fa {
    /* access modifiers changed from: private */
    public static final t4 zzc;
    private static volatile pa<t4> zzd;
    private int zze;
    private int zzf = 1;
    private y8<o4> zzg = p8.F();

    public enum a implements v8 {
        RADS(1),
        PROVISIONING(2);
        
        private static final u8<a> zzc = null;
        private final int zze;

        static {
            zzc = new b5();
        }

        private a(int i10) {
            this.zze = i10;
        }

        public static a zza(int i10) {
            if (i10 == 1) {
                return RADS;
            }
            if (i10 != 2) {
                return null;
            }
            return PROVISIONING;
        }

        public static x8 zzb() {
            return a5.f5081a;
        }

        public final String toString() {
            return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zze;
        }
    }

    public static final class b extends p8.b<t4, b> implements fa {
        private b() {
            super(t4.zzc);
        }

        /* synthetic */ b(i4 i4Var) {
            this();
        }

        public final b x(o4.a aVar) {
            t();
            ((t4) this.f5513n).K((o4) ((p8) aVar.l()));
            return this;
        }
    }

    static {
        t4 t4Var = new t4();
        zzc = t4Var;
        p8.x(t4.class, t4Var);
    }

    private t4() {
    }

    public static b J() {
        return (b) zzc.A();
    }

    /* access modifiers changed from: private */
    public final void K(o4 o4Var) {
        o4Var.getClass();
        y8<o4> y8Var = this.zzg;
        if (!y8Var.b()) {
            this.zzg = p8.s(y8Var);
        }
        this.zzg.add(o4Var);
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new t4();
            case 2:
                return new b((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", a.zzb(), "zzg", o4.class});
            case 4:
                return zzc;
            case 5:
                pa<t4> paVar = zzd;
                if (paVar == null) {
                    synchronized (t4.class) {
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
