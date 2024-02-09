package w2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

@Deprecated
public final class o extends a {
    public static final Parcelable.Creator<o> CREATOR = new p();

    /* renamed from: m  reason: collision with root package name */
    public final int f12851m;

    /* renamed from: n  reason: collision with root package name */
    public final int f12852n;

    /* renamed from: o  reason: collision with root package name */
    public final long f12853o;

    /* renamed from: p  reason: collision with root package name */
    public final long f12854p;

    o(int i10, int i11, long j10, long j11) {
        this.f12851m = i10;
        this.f12852n = i11;
        this.f12853o = j10;
        this.f12854p = j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f12851m == oVar.f12851m && this.f12852n == oVar.f12852n && this.f12853o == oVar.f12853o && this.f12854p == oVar.f12854p;
        }
    }

    public final int hashCode() {
        return h2.o.b(Integer.valueOf(this.f12852n), Integer.valueOf(this.f12851m), Long.valueOf(this.f12854p), Long.valueOf(this.f12853o));
    }

    public final String toString() {
        int i10 = this.f12851m;
        int i11 = this.f12852n;
        long j10 = this.f12854p;
        long j11 = this.f12853o;
        return "NetworkLocationStatus: Wifi status: " + i10 + " Cell status: " + i11 + " elapsed time NS: " + j10 + " system time ms: " + j11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f12851m);
        c.m(parcel, 2, this.f12852n);
        c.q(parcel, 3, this.f12853o);
        c.q(parcel, 4, this.f12854p);
        c.b(parcel, a10);
    }
}
