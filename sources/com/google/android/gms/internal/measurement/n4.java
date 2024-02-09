package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p4;
import com.google.android.gms.internal.measurement.p8;
import java.util.Collections;
import java.util.List;

public final class n4 extends p8<n4, a> implements fa {
    /* access modifiers changed from: private */
    public static final n4 zzc;
    private static volatile pa<n4> zzd;
    private int zze;
    private y8<p4> zzf = p8.F();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    public static final class a extends p8.b<n4, a> implements fa {
        private a() {
            super(n4.zzc);
        }

        /* synthetic */ a(i4 i4Var) {
            this();
        }

        public final a A(int i10, p4 p4Var) {
            t();
            ((n4) this.f5513n).K(i10, p4Var);
            return this;
        }

        public final a B(long j10) {
            t();
            ((n4) this.f5513n).L(j10);
            return this;
        }

        public final a C(p4.a aVar) {
            t();
            ((n4) this.f5513n).T((p4) ((p8) aVar.l()));
            return this;
        }

        public final a D(p4 p4Var) {
            t();
            ((n4) this.f5513n).T(p4Var);
            return this;
        }

        public final a E(Iterable<? extends p4> iterable) {
            t();
            ((n4) this.f5513n).U(iterable);
            return this;
        }

        public final a F(String str) {
            t();
            ((n4) this.f5513n).V(str);
            return this;
        }

        public final long G() {
            return ((n4) this.f5513n).a0();
        }

        public final a H(long j10) {
            t();
            ((n4) this.f5513n).Y(j10);
            return this;
        }

        public final p4 I(int i10) {
            return ((n4) this.f5513n).J(i10);
        }

        public final long J() {
            return ((n4) this.f5513n).b0();
        }

        public final a K() {
            t();
            ((n4) this.f5513n).j0();
            return this;
        }

        public final String L() {
            return ((n4) this.f5513n).e0();
        }

        public final List<p4> M() {
            return Collections.unmodifiableList(((n4) this.f5513n).f0());
        }

        public final boolean N() {
            return ((n4) this.f5513n).i0();
        }

        public final int x() {
            return ((n4) this.f5513n).W();
        }

        public final a y(int i10) {
            t();
            ((n4) this.f5513n).X(i10);
            return this;
        }

        public final a z(int i10, p4.a aVar) {
            t();
            ((n4) this.f5513n).K(i10, (p4) ((p8) aVar.l()));
            return this;
        }
    }

    static {
        n4 n4Var = new n4();
        zzc = n4Var;
        p8.x(n4.class, n4Var);
    }

    private n4() {
    }

    /* access modifiers changed from: private */
    public final void K(int i10, p4 p4Var) {
        p4Var.getClass();
        k0();
        this.zzf.set(i10, p4Var);
    }

    /* access modifiers changed from: private */
    public final void L(long j10) {
        this.zze |= 4;
        this.zzi = j10;
    }

    /* access modifiers changed from: private */
    public final void T(p4 p4Var) {
        p4Var.getClass();
        k0();
        this.zzf.add(p4Var);
    }

    /* access modifiers changed from: private */
    public final void U(Iterable<? extends p4> iterable) {
        k0();
        w6.c(iterable, this.zzf);
    }

    /* access modifiers changed from: private */
    public final void V(String str) {
        str.getClass();
        this.zze |= 1;
        this.zzg = str;
    }

    /* access modifiers changed from: private */
    public final void X(int i10) {
        k0();
        this.zzf.remove(i10);
    }

    /* access modifiers changed from: private */
    public final void Y(long j10) {
        this.zze |= 2;
        this.zzh = j10;
    }

    public static a c0() {
        return (a) zzc.A();
    }

    /* access modifiers changed from: private */
    public final void j0() {
        this.zzf = p8.F();
    }

    private final void k0() {
        y8<p4> y8Var = this.zzf;
        if (!y8Var.b()) {
            this.zzf = p8.s(y8Var);
        }
    }

    public final p4 J(int i10) {
        return this.zzf.get(i10);
    }

    public final int W() {
        return this.zzf.size();
    }

    public final long a0() {
        return this.zzi;
    }

    public final long b0() {
        return this.zzh;
    }

    public final String e0() {
        return this.zzg;
    }

    public final List<p4> f0() {
        return this.zzf;
    }

    public final boolean g0() {
        return (this.zze & 8) != 0;
    }

    public final boolean h0() {
        return (this.zze & 4) != 0;
    }

    public final boolean i0() {
        return (this.zze & 2) != 0;
    }

    public final int q() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final Object u(int i10, Object obj, Object obj2) {
        switch (i4.f5337a[i10 - 1]) {
            case 1:
                return new n4();
            case 2:
                return new a((i4) null);
            case 3:
                return p8.v(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", p4.class, "zzg", "zzh", "zzi", "zzj"});
            case 4:
                return zzc;
            case 5:
                pa<n4> paVar = zzd;
                if (paVar == null) {
                    synchronized (n4.class) {
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
