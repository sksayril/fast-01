package w2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import f2.k;
import i2.a;
import i2.c;

public final class i extends a implements k {
    public static final Parcelable.Creator<i> CREATOR = new m();

    /* renamed from: m  reason: collision with root package name */
    private final Status f12843m;

    /* renamed from: n  reason: collision with root package name */
    private final j f12844n;

    public i(Status status, j jVar) {
        this.f12843m = status;
        this.f12844n = jVar;
    }

    public Status c() {
        return this.f12843m;
    }

    public j d() {
        return this.f12844n;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 1, c(), i10, false);
        c.s(parcel, 2, d(), i10, false);
        c.b(parcel, a10);
    }
}
