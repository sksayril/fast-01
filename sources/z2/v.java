package z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;
import o2.b;

public class v extends a {
    public static final Parcelable.Creator<v> CREATOR = new r0();

    /* renamed from: m  reason: collision with root package name */
    protected final a f13549m;

    v(IBinder iBinder) {
        this.f13549m = new a(b.a.J(iBinder));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.l(parcel, 2, this.f13549m.a().asBinder(), false);
        c.b(parcel, a10);
    }
}
