package w2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new n();

    /* renamed from: m  reason: collision with root package name */
    private final boolean f12845m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f12846n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f12847o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f12848p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f12849q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f12850r;

    public j(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f12845m = z9;
        this.f12846n = z10;
        this.f12847o = z11;
        this.f12848p = z12;
        this.f12849q = z13;
        this.f12850r = z14;
    }

    public boolean d() {
        return this.f12850r;
    }

    public boolean f() {
        return this.f12847o;
    }

    public boolean g() {
        return this.f12848p;
    }

    public boolean i() {
        return this.f12845m;
    }

    public boolean k() {
        return this.f12849q;
    }

    public boolean l() {
        return this.f12846n;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, i());
        c.c(parcel, 2, l());
        c.c(parcel, 3, f());
        c.c(parcel, 4, g());
        c.c(parcel, 5, k());
        c.c(parcel, 6, d());
        c.b(parcel, a10);
    }
}
