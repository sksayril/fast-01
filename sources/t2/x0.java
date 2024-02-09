package t2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import f2.k;
import i2.a;
import i2.c;

public final class x0 extends a implements k {
    public static final Parcelable.Creator<x0> CREATOR = new y0();

    /* renamed from: n  reason: collision with root package name */
    public static final x0 f12395n = new x0(Status.f4903s);

    /* renamed from: m  reason: collision with root package name */
    private final Status f12396m;

    public x0(Status status) {
        this.f12396m = status;
    }

    public final Status c() {
        return this.f12396m;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 1, this.f12396m, i10, false);
        c.b(parcel, a10);
    }
}
