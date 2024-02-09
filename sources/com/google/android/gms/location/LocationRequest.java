package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.o;
import h2.p;
import i2.c;
import t2.b0;
import t2.j0;
import w2.q;
import w2.r;
import w2.t;

public final class LocationRequest extends i2.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new b();
    private final b0 A;

    /* renamed from: m  reason: collision with root package name */
    private int f5765m;

    /* renamed from: n  reason: collision with root package name */
    private long f5766n;

    /* renamed from: o  reason: collision with root package name */
    private long f5767o;

    /* renamed from: p  reason: collision with root package name */
    private long f5768p;

    /* renamed from: q  reason: collision with root package name */
    private long f5769q;

    /* renamed from: r  reason: collision with root package name */
    private int f5770r;

    /* renamed from: s  reason: collision with root package name */
    private float f5771s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f5772t;

    /* renamed from: u  reason: collision with root package name */
    private long f5773u;

    /* renamed from: v  reason: collision with root package name */
    private final int f5774v;

    /* renamed from: w  reason: collision with root package name */
    private final int f5775w;

    /* renamed from: x  reason: collision with root package name */
    private final String f5776x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f5777y;

    /* renamed from: z  reason: collision with root package name */
    private final WorkSource f5778z;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f5779a;

        /* renamed from: b  reason: collision with root package name */
        private long f5780b;

        /* renamed from: c  reason: collision with root package name */
        private long f5781c;

        /* renamed from: d  reason: collision with root package name */
        private long f5782d;

        /* renamed from: e  reason: collision with root package name */
        private long f5783e;

        /* renamed from: f  reason: collision with root package name */
        private int f5784f;

        /* renamed from: g  reason: collision with root package name */
        private float f5785g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f5786h;

        /* renamed from: i  reason: collision with root package name */
        private long f5787i;

        /* renamed from: j  reason: collision with root package name */
        private int f5788j;

        /* renamed from: k  reason: collision with root package name */
        private int f5789k;

        /* renamed from: l  reason: collision with root package name */
        private String f5790l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f5791m;

        /* renamed from: n  reason: collision with root package name */
        private WorkSource f5792n;

        /* renamed from: o  reason: collision with root package name */
        private b0 f5793o;

        public a(long j10) {
            p.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f5780b = j10;
            this.f5779a = 102;
            this.f5781c = -1;
            this.f5782d = 0;
            this.f5783e = Long.MAX_VALUE;
            this.f5784f = Integer.MAX_VALUE;
            this.f5785g = 0.0f;
            this.f5786h = true;
            this.f5787i = -1;
            this.f5788j = 0;
            this.f5789k = 0;
            this.f5790l = null;
            this.f5791m = false;
            this.f5792n = null;
            this.f5793o = null;
        }

        public a(LocationRequest locationRequest) {
            this.f5779a = locationRequest.A();
            this.f5780b = locationRequest.i();
            this.f5781c = locationRequest.z();
            this.f5782d = locationRequest.l();
            this.f5783e = locationRequest.f();
            this.f5784f = locationRequest.o();
            this.f5785g = locationRequest.y();
            this.f5786h = locationRequest.D();
            this.f5787i = locationRequest.k();
            this.f5788j = locationRequest.g();
            this.f5789k = locationRequest.I();
            this.f5790l = locationRequest.L();
            this.f5791m = locationRequest.M();
            this.f5792n = locationRequest.J();
            this.f5793o = locationRequest.K();
        }

        public LocationRequest a() {
            int i10 = this.f5779a;
            long j10 = this.f5780b;
            long j11 = this.f5781c;
            if (j11 == -1) {
                j11 = j10;
            } else if (i10 != 105) {
                j11 = Math.min(j11, j10);
            }
            long max = Math.max(this.f5782d, this.f5780b);
            long j12 = this.f5783e;
            int i11 = this.f5784f;
            float f10 = this.f5785g;
            boolean z9 = this.f5786h;
            long j13 = this.f5787i;
            long j14 = j13 == -1 ? this.f5780b : j13;
            int i12 = this.f5788j;
            int i13 = this.f5789k;
            String str = this.f5790l;
            boolean z10 = this.f5791m;
            WorkSource workSource = r7;
            WorkSource workSource2 = new WorkSource(this.f5792n);
            return new LocationRequest(i10, j10, j11, max, Long.MAX_VALUE, j12, i11, f10, z9, j14, i12, i13, str, z10, workSource, this.f5793o);
        }

        public a b(int i10) {
            t.a(i10);
            this.f5788j = i10;
            return this;
        }

        public a c(long j10) {
            p.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
            this.f5780b = j10;
            return this;
        }

        public a d(long j10) {
            boolean z9 = true;
            if (j10 != -1 && j10 < 0) {
                z9 = false;
            }
            p.b(z9, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.f5787i = j10;
            return this;
        }

        public a e(float f10) {
            p.b(f10 >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.f5785g = f10;
            return this;
        }

        public a f(long j10) {
            boolean z9 = true;
            if (j10 != -1 && j10 < 0) {
                z9 = false;
            }
            p.b(z9, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.f5781c = j10;
            return this;
        }

        public a g(int i10) {
            q.a(i10);
            this.f5779a = i10;
            return this;
        }

        public a h(boolean z9) {
            this.f5786h = z9;
            return this;
        }

        public final a i(boolean z9) {
            this.f5791m = z9;
            return this;
        }

        @Deprecated
        public final a j(String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.f5790l = str;
            }
            return this;
        }

        public final a k(int i10) {
            boolean z9;
            int i11 = 2;
            if (i10 == 0 || i10 == 1) {
                i11 = i10;
            } else if (i10 == 2) {
                i10 = 2;
            } else {
                i11 = i10;
                z9 = false;
                p.c(z9, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
                this.f5789k = i11;
                return this;
            }
            z9 = true;
            p.c(z9, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i10));
            this.f5789k = i11;
            return this;
        }

        public final a l(WorkSource workSource) {
            this.f5792n = workSource;
            return this;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationRequest() {
        /*
            r23 = this;
            r0 = r23
            android.os.WorkSource r1 = new android.os.WorkSource
            r21 = r1
            r1.<init>()
            r1 = 102(0x66, float:1.43E-43)
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            r4 = 600000(0x927c0, double:2.964394E-318)
            r6 = 0
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = 0
            r14 = 1
            r15 = 3600000(0x36ee80, double:1.7786363E-317)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r0.<init>(r1, r2, r4, r6, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationRequest.<init>():void");
    }

    LocationRequest(int i10, long j10, long j11, long j12, long j13, long j14, int i11, float f10, boolean z9, long j15, int i12, int i13, String str, boolean z10, WorkSource workSource, b0 b0Var) {
        this.f5765m = i10;
        long j16 = j10;
        this.f5766n = j16;
        this.f5767o = j11;
        this.f5768p = j12;
        this.f5769q = j13 == Long.MAX_VALUE ? j14 : Math.min(Math.max(1, j13 - SystemClock.elapsedRealtime()), j14);
        this.f5770r = i11;
        this.f5771s = f10;
        this.f5772t = z9;
        this.f5773u = j15 != -1 ? j15 : j16;
        this.f5774v = i12;
        this.f5775w = i13;
        this.f5776x = str;
        this.f5777y = z10;
        this.f5778z = workSource;
        this.A = b0Var;
    }

    private static String N(long j10) {
        return j10 == Long.MAX_VALUE ? "∞" : j0.a(j10);
    }

    @Deprecated
    public static LocationRequest d() {
        WorkSource workSource = r1;
        WorkSource workSource2 = new WorkSource();
        return new LocationRequest(102, 3600000, 600000, 0, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000, 0, 0, (String) null, false, workSource, (b0) null);
    }

    public int A() {
        return this.f5765m;
    }

    public boolean B() {
        long j10 = this.f5768p;
        return j10 > 0 && (j10 >> 1) >= this.f5766n;
    }

    public boolean C() {
        return this.f5765m == 105;
    }

    public boolean D() {
        return this.f5772t;
    }

    @Deprecated
    public LocationRequest E(long j10) {
        p.c(j10 >= 0, "illegal fastest interval: %d", Long.valueOf(j10));
        this.f5767o = j10;
        return this;
    }

    @Deprecated
    public LocationRequest F(long j10) {
        p.b(j10 >= 0, "intervalMillis must be greater than or equal to 0");
        long j11 = this.f5767o;
        long j12 = this.f5766n;
        if (j11 == j12 / 6) {
            this.f5767o = j10 / 6;
        }
        if (this.f5773u == j12) {
            this.f5773u = j10;
        }
        this.f5766n = j10;
        return this;
    }

    @Deprecated
    public LocationRequest G(int i10) {
        q.a(i10);
        this.f5765m = i10;
        return this;
    }

    @Deprecated
    public LocationRequest H(float f10) {
        if (f10 >= 0.0f) {
            this.f5771s = f10;
            return this;
        }
        throw new IllegalArgumentException("invalid displacement: " + f10);
    }

    public final int I() {
        return this.f5775w;
    }

    public final WorkSource J() {
        return this.f5778z;
    }

    public final b0 K() {
        return this.A;
    }

    @Deprecated
    public final String L() {
        return this.f5776x;
    }

    public final boolean M() {
        return this.f5777y;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            return this.f5765m == locationRequest.f5765m && (C() || this.f5766n == locationRequest.f5766n) && this.f5767o == locationRequest.f5767o && B() == locationRequest.B() && ((!B() || this.f5768p == locationRequest.f5768p) && this.f5769q == locationRequest.f5769q && this.f5770r == locationRequest.f5770r && this.f5771s == locationRequest.f5771s && this.f5772t == locationRequest.f5772t && this.f5774v == locationRequest.f5774v && this.f5775w == locationRequest.f5775w && this.f5777y == locationRequest.f5777y && this.f5778z.equals(locationRequest.f5778z) && o.a(this.f5776x, locationRequest.f5776x) && o.a(this.A, locationRequest.A));
        }
    }

    public long f() {
        return this.f5769q;
    }

    public int g() {
        return this.f5774v;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f5765m), Long.valueOf(this.f5766n), Long.valueOf(this.f5767o), this.f5778z);
    }

    public long i() {
        return this.f5766n;
    }

    public long k() {
        return this.f5773u;
    }

    public long l() {
        return this.f5768p;
    }

    public int o() {
        return this.f5770r;
    }

    public String toString() {
        long j10;
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (!C()) {
            sb.append("@");
            if (B()) {
                j0.b(this.f5766n, sb);
                sb.append("/");
                j10 = this.f5768p;
            } else {
                j10 = this.f5766n;
            }
            j0.b(j10, sb);
            sb.append(" ");
        }
        sb.append(q.b(this.f5765m));
        if (C() || this.f5767o != this.f5766n) {
            sb.append(", minUpdateInterval=");
            sb.append(N(this.f5767o));
        }
        if (((double) this.f5771s) > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.f5771s);
        }
        boolean C = C();
        long j11 = this.f5773u;
        if (!C ? j11 != this.f5766n : j11 != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(N(this.f5773u));
        }
        if (this.f5769q != Long.MAX_VALUE) {
            sb.append(", duration=");
            j0.b(this.f5769q, sb);
        }
        if (this.f5770r != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.f5770r);
        }
        if (this.f5775w != 0) {
            sb.append(", ");
            sb.append(r.a(this.f5775w));
        }
        if (this.f5774v != 0) {
            sb.append(", ");
            sb.append(t.b(this.f5774v));
        }
        if (this.f5772t) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.f5777y) {
            sb.append(", bypass");
        }
        if (this.f5776x != null) {
            sb.append(", moduleId=");
            sb.append(this.f5776x);
        }
        if (!l2.o.b(this.f5778z)) {
            sb.append(", ");
            sb.append(this.f5778z);
        }
        if (this.A != null) {
            sb.append(", impersonation=");
            sb.append(this.A);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, A());
        c.q(parcel, 2, i());
        c.q(parcel, 3, z());
        c.m(parcel, 6, o());
        c.j(parcel, 7, y());
        c.q(parcel, 8, l());
        c.c(parcel, 9, D());
        c.q(parcel, 10, f());
        c.q(parcel, 11, k());
        c.m(parcel, 12, g());
        c.m(parcel, 13, this.f5775w);
        c.t(parcel, 14, this.f5776x, false);
        c.c(parcel, 15, this.f5777y);
        c.s(parcel, 16, this.f5778z, i10, false);
        c.s(parcel, 17, this.A, i10, false);
        c.b(parcel, a10);
    }

    public float y() {
        return this.f5771s;
    }

    public long z() {
        return this.f5767o;
    }
}
