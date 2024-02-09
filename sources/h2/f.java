package h2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new f1();

    /* renamed from: m  reason: collision with root package name */
    private final r f9166m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f9167n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f9168o;

    /* renamed from: p  reason: collision with root package name */
    private final int[] f9169p;

    /* renamed from: q  reason: collision with root package name */
    private final int f9170q;

    /* renamed from: r  reason: collision with root package name */
    private final int[] f9171r;

    public f(r rVar, boolean z9, boolean z10, int[] iArr, int i10, int[] iArr2) {
        this.f9166m = rVar;
        this.f9167n = z9;
        this.f9168o = z10;
        this.f9169p = iArr;
        this.f9170q = i10;
        this.f9171r = iArr2;
    }

    public int d() {
        return this.f9170q;
    }

    public int[] f() {
        return this.f9169p;
    }

    public int[] g() {
        return this.f9171r;
    }

    public boolean i() {
        return this.f9167n;
    }

    public boolean k() {
        return this.f9168o;
    }

    public final r l() {
        return this.f9166m;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 1, this.f9166m, i10, false);
        c.c(parcel, 2, i());
        c.c(parcel, 3, k());
        c.n(parcel, 4, f(), false);
        c.m(parcel, 5, d());
        c.n(parcel, 6, g(), false);
        c.b(parcel, a10);
    }
}
