package z2;

import android.os.Parcel;
import android.os.Parcelable;
import h2.o;
import h2.p;
import i2.a;
import i2.c;

public class n extends a {
    public static final Parcelable.Creator<n> CREATOR = new o0();

    /* renamed from: o  reason: collision with root package name */
    private static final String f13521o = n.class.getSimpleName();

    /* renamed from: m  reason: collision with root package name */
    private final int f13522m;

    /* renamed from: n  reason: collision with root package name */
    private final Float f13523n;

    public n(int i10, Float f10) {
        boolean z9 = false;
        if (i10 == 1 || (f10 != null && f10.floatValue() >= 0.0f)) {
            z9 = true;
        }
        p.b(z9, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.f13522m = i10;
        this.f13523n = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f13522m == nVar.f13522m && o.a(this.f13523n, nVar.f13523n);
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f13522m), this.f13523n);
    }

    public String toString() {
        int i10 = this.f13522m;
        Float f10 = this.f13523n;
        return "[PatternItem: type=" + i10 + " length=" + f10 + "]";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 2, this.f13522m);
        c.k(parcel, 3, this.f13523n, false);
        c.b(parcel, a10);
    }
}
