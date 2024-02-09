package e2;

import android.os.Parcel;
import android.os.Parcelable;
import h2.o;
import i2.a;
import i2.c;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new o();

    /* renamed from: m  reason: collision with root package name */
    private final String f8339m;
    @Deprecated

    /* renamed from: n  reason: collision with root package name */
    private final int f8340n;

    /* renamed from: o  reason: collision with root package name */
    private final long f8341o;

    public d(String str, int i10, long j10) {
        this.f8339m = str;
        this.f8340n = i10;
        this.f8341o = j10;
    }

    public d(String str, long j10) {
        this.f8339m = str;
        this.f8341o = j10;
        this.f8340n = -1;
    }

    public String d() {
        return this.f8339m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            return ((d() != null && d().equals(dVar.d())) || (d() == null && dVar.d() == null)) && f() == dVar.f();
        }
    }

    public long f() {
        long j10 = this.f8341o;
        return j10 == -1 ? (long) this.f8340n : j10;
    }

    public final int hashCode() {
        return o.b(d(), Long.valueOf(f()));
    }

    public final String toString() {
        o.a c10 = o.c(this);
        c10.a("name", d());
        c10.a("version", Long.valueOf(f()));
        return c10.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, d(), false);
        c.m(parcel, 2, this.f8340n);
        c.q(parcel, 3, f());
        c.b(parcel, a10);
    }
}
