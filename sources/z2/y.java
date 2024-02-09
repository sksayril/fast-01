package z2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new u0();

    /* renamed from: m  reason: collision with root package name */
    public final int f13562m;

    /* renamed from: n  reason: collision with root package name */
    public final int f13563n;

    /* renamed from: o  reason: collision with root package name */
    public final byte[] f13564o;

    public y(int i10, int i11, byte[] bArr) {
        this.f13562m = i10;
        this.f13563n = i11;
        this.f13564o = bArr;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 2, this.f13562m);
        c.m(parcel, 3, this.f13563n);
        c.g(parcel, 4, this.f13564o, false);
        c.b(parcel, a10);
    }
}
