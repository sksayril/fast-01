package e2;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;
import o2.b;
import o2.d;

public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new b0();

    /* renamed from: m  reason: collision with root package name */
    private final String f8322m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f8323n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f8324o;

    /* renamed from: p  reason: collision with root package name */
    private final Context f8325p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f8326q;

    a0(String str, boolean z9, boolean z10, IBinder iBinder, boolean z11) {
        this.f8322m = str;
        this.f8323n = z9;
        this.f8324o = z10;
        this.f8325p = (Context) d.Y(b.a.J(iBinder));
        this.f8326q = z11;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [o2.b, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f8322m, false);
        c.c(parcel, 2, this.f8323n);
        c.c(parcel, 3, this.f8324o);
        c.l(parcel, 4, d.e3(this.f8325p), false);
        c.c(parcel, 5, this.f8326q);
        c.b(parcel, a10);
    }
}
