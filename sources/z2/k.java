package z2;

import android.os.Parcel;
import android.os.Parcelable;
import h2.p;
import i2.a;
import i2.c;

public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new m0();

    /* renamed from: n  reason: collision with root package name */
    private static final String f13504n = k.class.getSimpleName();

    /* renamed from: m  reason: collision with root package name */
    private String f13505m;

    public k(String str) {
        p.k(str, "json must not be null");
        this.f13505m = str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 2, this.f13505m, false);
        c.b(parcel, a10);
    }
}
