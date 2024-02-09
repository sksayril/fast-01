package e2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public final class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new d0();

    /* renamed from: m  reason: collision with root package name */
    private final boolean f8335m;

    /* renamed from: n  reason: collision with root package name */
    private final String f8336n;

    /* renamed from: o  reason: collision with root package name */
    private final int f8337o;

    /* renamed from: p  reason: collision with root package name */
    private final int f8338p;

    c0(boolean z9, String str, int i10, int i11) {
        this.f8335m = z9;
        this.f8336n = str;
        this.f8337o = k0.a(i10) - 1;
        this.f8338p = p.a(i11) - 1;
    }

    public final String d() {
        return this.f8336n;
    }

    public final boolean f() {
        return this.f8335m;
    }

    public final int g() {
        return p.a(this.f8338p);
    }

    public final int i() {
        return k0.a(this.f8337o);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, this.f8335m);
        c.t(parcel, 2, this.f8336n, false);
        c.m(parcel, 3, this.f8337o);
        c.m(parcel, 4, this.f8338p);
        c.b(parcel, a10);
    }
}
