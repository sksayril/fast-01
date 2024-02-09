package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import h2.o;
import i2.a;
import i2.c;

public final class c0 extends a {
    public static final Parcelable.Creator<c0> CREATOR = new h0();

    /* renamed from: m  reason: collision with root package name */
    public final LatLng f13478m;

    /* renamed from: n  reason: collision with root package name */
    public final LatLng f13479n;

    /* renamed from: o  reason: collision with root package name */
    public final LatLng f13480o;

    /* renamed from: p  reason: collision with root package name */
    public final LatLng f13481p;

    /* renamed from: q  reason: collision with root package name */
    public final LatLngBounds f13482q;

    public c0(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f13478m = latLng;
        this.f13479n = latLng2;
        this.f13480o = latLng3;
        this.f13481p = latLng4;
        this.f13482q = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f13478m.equals(c0Var.f13478m) && this.f13479n.equals(c0Var.f13479n) && this.f13480o.equals(c0Var.f13480o) && this.f13481p.equals(c0Var.f13481p) && this.f13482q.equals(c0Var.f13482q);
    }

    public int hashCode() {
        return o.b(this.f13478m, this.f13479n, this.f13480o, this.f13481p, this.f13482q);
    }

    public String toString() {
        return o.c(this).a("nearLeft", this.f13478m).a("nearRight", this.f13479n).a("farLeft", this.f13480o).a("farRight", this.f13481p).a("latLngBounds", this.f13482q).toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 2, this.f13478m, i10, false);
        c.s(parcel, 3, this.f13479n, i10, false);
        c.s(parcel, 4, this.f13480o, i10, false);
        c.s(parcel, 5, this.f13481p, i10, false);
        c.s(parcel, 6, this.f13482q, i10, false);
        c.b(parcel, a10);
    }
}
