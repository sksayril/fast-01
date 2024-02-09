package c3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import f2.k;
import i2.a;
import i2.c;
import java.util.List;

public final class h extends a implements k {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: m  reason: collision with root package name */
    private final List f3563m;

    /* renamed from: n  reason: collision with root package name */
    private final String f3564n;

    public h(List list, String str) {
        this.f3563m = list;
        this.f3564n = str;
    }

    public final Status c() {
        return this.f3564n != null ? Status.f4903s : Status.f4907w;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f3563m, false);
        c.t(parcel, 2, this.f3564n, false);
        c.b(parcel, a10);
    }
}
