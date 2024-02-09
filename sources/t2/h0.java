package t2;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;
import w2.v;
import w2.w;
import w2.y;
import w2.z;

@Deprecated
public final class h0 extends a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: m  reason: collision with root package name */
    private final int f12357m;

    /* renamed from: n  reason: collision with root package name */
    private final f0 f12358n;

    /* renamed from: o  reason: collision with root package name */
    private final z f12359o;

    /* renamed from: p  reason: collision with root package name */
    private final w f12360p;

    /* renamed from: q  reason: collision with root package name */
    private final PendingIntent f12361q;

    /* renamed from: r  reason: collision with root package name */
    private final b1 f12362r;

    /* renamed from: s  reason: collision with root package name */
    private final String f12363s;

    h0(int i10, f0 f0Var, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        this.f12357m = i10;
        this.f12358n = f0Var;
        b1 b1Var = null;
        this.f12359o = iBinder != null ? y.J(iBinder) : null;
        this.f12361q = pendingIntent;
        this.f12360p = iBinder2 != null ? v.J(iBinder2) : null;
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            b1Var = queryLocalInterface instanceof b1 ? (b1) queryLocalInterface : new z0(iBinder3);
        }
        this.f12362r = b1Var;
        this.f12363s = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f12357m);
        c.s(parcel, 2, this.f12358n, i10, false);
        z zVar = this.f12359o;
        IBinder iBinder = null;
        c.l(parcel, 3, zVar == null ? null : zVar.asBinder(), false);
        c.s(parcel, 4, this.f12361q, i10, false);
        w wVar = this.f12360p;
        c.l(parcel, 5, wVar == null ? null : wVar.asBinder(), false);
        b1 b1Var = this.f12362r;
        if (b1Var != null) {
            iBinder = b1Var.asBinder();
        }
        c.l(parcel, 6, iBinder, false);
        c.t(parcel, 8, this.f12363s, false);
        c.b(parcel, a10);
    }
}
