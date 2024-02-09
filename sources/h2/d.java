package h2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new x();

    /* renamed from: m  reason: collision with root package name */
    public final int f9140m;

    /* renamed from: n  reason: collision with root package name */
    public final String f9141n;

    public d(int i10, String str) {
        this.f9140m = i10;
        this.f9141n = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f9140m == this.f9140m && o.a(dVar.f9141n, this.f9141n);
    }

    public final int hashCode() {
        return this.f9140m;
    }

    public final String toString() {
        int i10 = this.f9140m;
        String str = this.f9141n;
        return i10 + ":" + str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f9140m);
        c.t(parcel, 2, this.f9141n, false);
        c.b(parcel, a10);
    }
}
