package c3;

import android.os.Parcel;
import android.os.Parcelable;
import e2.b;
import h2.m0;
import i2.a;
import i2.c;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: m  reason: collision with root package name */
    final int f3567m;

    /* renamed from: n  reason: collision with root package name */
    private final b f3568n;

    /* renamed from: o  reason: collision with root package name */
    private final m0 f3569o;

    l(int i10, b bVar, m0 m0Var) {
        this.f3567m = i10;
        this.f3568n = bVar;
        this.f3569o = m0Var;
    }

    public final b d() {
        return this.f3568n;
    }

    public final m0 f() {
        return this.f3569o;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f3567m);
        c.s(parcel, 2, this.f3568n, i10, false);
        c.s(parcel, 3, this.f3569o, i10, false);
        c.b(parcel, a10);
    }
}
