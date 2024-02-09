package w2;

import android.os.Parcel;
import android.os.Parcelable;
import h2.o;
import i2.c;
import t2.b0;
import t2.j0;

public final class d extends i2.a {
    public static final Parcelable.Creator<d> CREATOR = new a0();

    /* renamed from: m  reason: collision with root package name */
    private final long f12823m;

    /* renamed from: n  reason: collision with root package name */
    private final int f12824n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f12825o;

    /* renamed from: p  reason: collision with root package name */
    private final String f12826p;

    /* renamed from: q  reason: collision with root package name */
    private final b0 f12827q;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f12828a = Long.MAX_VALUE;

        /* renamed from: b  reason: collision with root package name */
        private int f12829b = 0;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12830c = false;

        /* renamed from: d  reason: collision with root package name */
        private String f12831d = null;

        /* renamed from: e  reason: collision with root package name */
        private b0 f12832e = null;

        public d a() {
            return new d(this.f12828a, this.f12829b, this.f12830c, this.f12831d, this.f12832e);
        }
    }

    d(long j10, int i10, boolean z9, String str, b0 b0Var) {
        this.f12823m = j10;
        this.f12824n = i10;
        this.f12825o = z9;
        this.f12826p = str;
        this.f12827q = b0Var;
    }

    public int d() {
        return this.f12824n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12823m == dVar.f12823m && this.f12824n == dVar.f12824n && this.f12825o == dVar.f12825o && o.a(this.f12826p, dVar.f12826p) && o.a(this.f12827q, dVar.f12827q);
    }

    public long f() {
        return this.f12823m;
    }

    public int hashCode() {
        return o.b(Long.valueOf(this.f12823m), Integer.valueOf(this.f12824n), Boolean.valueOf(this.f12825o));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.f12823m != Long.MAX_VALUE) {
            sb.append("maxAge=");
            j0.b(this.f12823m, sb);
        }
        if (this.f12824n != 0) {
            sb.append(", ");
            sb.append(t.b(this.f12824n));
        }
        if (this.f12825o) {
            sb.append(", bypass");
        }
        if (this.f12826p != null) {
            sb.append(", moduleId=");
            sb.append(this.f12826p);
        }
        if (this.f12827q != null) {
            sb.append(", impersonation=");
            sb.append(this.f12827q);
        }
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, f());
        c.m(parcel, 2, d());
        c.c(parcel, 3, this.f12825o);
        c.t(parcel, 4, this.f12826p, false);
        c.s(parcel, 5, this.f12827q, i10, false);
        c.b(parcel, a10);
    }
}
