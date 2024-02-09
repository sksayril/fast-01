package h2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public class n extends a {
    public static final Parcelable.Creator<n> CREATOR = new j0();

    /* renamed from: m  reason: collision with root package name */
    private final int f9225m;

    /* renamed from: n  reason: collision with root package name */
    private final int f9226n;

    /* renamed from: o  reason: collision with root package name */
    private final int f9227o;

    /* renamed from: p  reason: collision with root package name */
    private final long f9228p;

    /* renamed from: q  reason: collision with root package name */
    private final long f9229q;

    /* renamed from: r  reason: collision with root package name */
    private final String f9230r;

    /* renamed from: s  reason: collision with root package name */
    private final String f9231s;

    /* renamed from: t  reason: collision with root package name */
    private final int f9232t;

    /* renamed from: u  reason: collision with root package name */
    private final int f9233u;

    public n(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f9225m = i10;
        this.f9226n = i11;
        this.f9227o = i12;
        this.f9228p = j10;
        this.f9229q = j11;
        this.f9230r = str;
        this.f9231s = str2;
        this.f9232t = i13;
        this.f9233u = i14;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f9225m);
        c.m(parcel, 2, this.f9226n);
        c.m(parcel, 3, this.f9227o);
        c.q(parcel, 4, this.f9228p);
        c.q(parcel, 5, this.f9229q);
        c.t(parcel, 6, this.f9230r, false);
        c.t(parcel, 7, this.f9231s, false);
        c.m(parcel, 8, this.f9232t);
        c.m(parcel, 9, this.f9233u);
        c.b(parcel, a10);
    }
}
