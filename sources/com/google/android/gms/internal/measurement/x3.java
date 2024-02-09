package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.List;

public final class x3 extends p8<x3, a> implements fa {
    /* access modifiers changed from: private */
    public static final x3 zzc;
    private static volatile pa<x3> zzd;
    private int zze;
    private y8<b> zzf = p8.F();
    private y8<c> zzg = p8.F();
    private y8<f> zzh = p8.F();
    private boolean zzi;
    private y8<b> zzj = p8.F();

    public static final class a extends p8.b<x3, a> implements fa {
        private a() {
            super(x3.zzc);
        }

        /* synthetic */ a(w3 w3Var) {
            this();
        }
    }

    public static final class b extends p8<b, a> implements fa {
        /* access modifiers changed from: private */
        public static final b zzc;
        private static volatile pa<b> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class a extends p8.b<b, a> implements fa {
            private a() {
                super(b.zzc);
            }

            /* synthetic */ a(w3 w3Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzc = bVar;
            p8.x(b.class, bVar);
        }

        private b() {
        }

        public final d K() {
            d zza = d.zza(this.zzg);
            return zza == null ? d.CONSENT_STATUS_UNSPECIFIED : zza;
        }

        public final e L() {
            e zza = e.zza(this.zzf);
            return zza == null ? e.CONSENT_TYPE_UNSPECIFIED : zza;
        }

        /* access modifiers changed from: protected */
        public final Object u(int i10, Object obj, Object obj2) {
            switch (w3.f5679a[i10 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a((w3) null);
                case 3:
                    return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.zzb(), "zzg", d.zzb()});
                case 4:
                    return zzc;
                case 5:
                    pa<b> paVar = zzd;
                    if (paVar == null) {
                        synchronized (b.class) {
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

    public static final class c extends p8<c, a> implements fa {
        /* access modifiers changed from: private */
        public static final c zzc;
        private static volatile pa<c> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        public static final class a extends p8.b<c, a> implements fa {
            private a() {
                super(c.zzc);
            }

            /* synthetic */ a(w3 w3Var) {
                this();
            }
        }

        static {
            c cVar = new c();
            zzc = cVar;
            p8.x(c.class, cVar);
        }

        private c() {
        }

        public final e K() {
            e zza = e.zza(this.zzg);
            return zza == null ? e.CONSENT_TYPE_UNSPECIFIED : zza;
        }

        public final e L() {
            e zza = e.zza(this.zzf);
            return zza == null ? e.CONSENT_TYPE_UNSPECIFIED : zza;
        }

        /* access modifiers changed from: protected */
        public final Object u(int i10, Object obj, Object obj2) {
            switch (w3.f5679a[i10 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a((w3) null);
                case 3:
                    return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", e.zzb(), "zzg", e.zzb()});
                case 4:
                    return zzc;
                case 5:
                    pa<c> paVar = zzd;
                    if (paVar == null) {
                        synchronized (c.class) {
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

    public enum d implements v8 {
        CONSENT_STATUS_UNSPECIFIED(0),
        GRANTED(1),
        DENIED(2);
        
        private static final u8<d> zzd = null;
        private final int zzf;

        static {
            zzd = new e4();
        }

        private d(int i10) {
            this.zzf = i10;
        }

        public static d zza(int i10) {
            if (i10 == 0) {
                return CONSENT_STATUS_UNSPECIFIED;
            }
            if (i10 == 1) {
                return GRANTED;
            }
            if (i10 != 2) {
                return null;
            }
            return DENIED;
        }

        public static x8 zzb() {
            return f4.f5231a;
        }

        public final String toString() {
            return "<" + d.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzf;
        }
    }

    public enum e implements v8 {
        CONSENT_TYPE_UNSPECIFIED(0),
        AD_STORAGE(1),
        ANALYTICS_STORAGE(2),
        AD_USER_DATA(3),
        AD_PERSONALIZATION(4);
        
        private static final u8<e> zzf = null;
        private final int zzh;

        static {
            zzf = new h4();
        }

        private e(int i10) {
            this.zzh = i10;
        }

        public static e zza(int i10) {
            if (i10 == 0) {
                return CONSENT_TYPE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return AD_STORAGE;
            }
            if (i10 == 2) {
                return ANALYTICS_STORAGE;
            }
            if (i10 == 3) {
                return AD_USER_DATA;
            }
            if (i10 != 4) {
                return null;
            }
            return AD_PERSONALIZATION;
        }

        public static x8 zzb() {
            return g4.f5270a;
        }

        public final String toString() {
            return "<" + e.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + '>';
        }

        public final int zza() {
            return this.zzh;
        }
    }

    public static final class f extends p8<f, a> implements fa {
        /* access modifiers changed from: private */
        public static final f zzc;
        private static volatile pa<f> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        public static final class a extends p8.b<f, a> implements fa {
            private a() {
                super(f.zzc);
            }

            /* synthetic */ a(w3 w3Var) {
                this();
            }
        }

        static {
            f fVar = new f();
            zzc = fVar;
            p8.x(f.class, fVar);
        }

        private f() {
        }

        public final String K() {
            return this.zzf;
        }

        /* access modifiers changed from: protected */
        public final Object u(int i10, Object obj, Object obj2) {
            switch (w3.f5679a[i10 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a((w3) null);
                case 3:
                    return p8.v(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    pa<f> paVar = zzd;
                    if (paVar == null) {
                        synchronized (f.class) {
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

    static {
        x3 x3Var = new x3();
        zzc = x3Var;
        p8.x(x3.class, x3Var);
    }

    private x3() {
    }

    public static x3 K() {
        return zzc;
    }

    public final List<f> L() {
        return this.zzh;
    }

    public final List<b> M() {
        return this.zzf;
    }

    public final List<c> N() {
        return this.zzg;
    }

    public final boolean O() {
        return this.zzi;
    }

    public final boolean P() {
        return (this.zze & 1) != 0;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        Class<b> cls = b.class;
        switch (w3.f5679a[i10 - 1]) {
            case 1:
                return new x3();
            case 2:
                return new a((w3) null);
            case 3:
                return p8.v(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", cls, "zzg", c.class, "zzh", f.class, "zzi", "zzj", cls});
            case 4:
                return zzc;
            case 5:
                pa<x3> paVar = zzd;
                if (paVar == null) {
                    synchronized (x3.class) {
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
