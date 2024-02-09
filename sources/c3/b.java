package c3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import f2.k;
import i2.a;
import i2.c;

public final class b extends a implements k {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: m  reason: collision with root package name */
    final int f3560m;

    /* renamed from: n  reason: collision with root package name */
    private int f3561n;

    /* renamed from: o  reason: collision with root package name */
    private Intent f3562o;

    public b() {
        this(2, 0, (Intent) null);
    }

    b(int i10, int i11, Intent intent) {
        this.f3560m = i10;
        this.f3561n = i11;
        this.f3562o = intent;
    }

    public final Status c() {
        return this.f3561n == 0 ? Status.f4903s : Status.f4907w;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f3560m);
        c.m(parcel, 2, this.f3561n);
        c.s(parcel, 3, this.f3562o, i10, false);
        c.b(parcel, a10);
    }
}
