package h2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new w0();

    /* renamed from: m  reason: collision with root package name */
    private final int f9249m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f9250n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f9251o;

    /* renamed from: p  reason: collision with root package name */
    private final int f9252p;

    /* renamed from: q  reason: collision with root package name */
    private final int f9253q;

    public r(int i10, boolean z9, boolean z10, int i11, int i12) {
        this.f9249m = i10;
        this.f9250n = z9;
        this.f9251o = z10;
        this.f9252p = i11;
        this.f9253q = i12;
    }

    public int d() {
        return this.f9252p;
    }

    public int f() {
        return this.f9253q;
    }

    public boolean g() {
        return this.f9250n;
    }

    public boolean i() {
        return this.f9251o;
    }

    public int k() {
        return this.f9249m;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, k());
        c.c(parcel, 2, g());
        c.c(parcel, 3, i());
        c.m(parcel, 4, d());
        c.m(parcel, 5, f());
        c.b(parcel, a10);
    }
}
