package t2;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public final class d0 extends a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: m  reason: collision with root package name */
    private final int f12347m;

    /* renamed from: n  reason: collision with root package name */
    private final IBinder f12348n;

    /* renamed from: o  reason: collision with root package name */
    private final IBinder f12349o;

    /* renamed from: p  reason: collision with root package name */
    private final PendingIntent f12350p;

    /* renamed from: q  reason: collision with root package name */
    private final String f12351q;

    /* renamed from: r  reason: collision with root package name */
    private final String f12352r;

    d0(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f12347m = i10;
        this.f12348n = iBinder;
        this.f12349o = iBinder2;
        this.f12350p = pendingIntent;
        this.f12351q = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f12352r = str2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static t2.d0 d(android.os.IInterface r7, w2.w r8, java.lang.String r9, java.lang.String r10) {
        /*
            t2.d0 r9 = new t2.d0
            if (r7 != 0) goto L_0x0005
            r7 = 0
        L_0x0005:
            r2 = r7
            r1 = 2
            r4 = 0
            r5 = 0
            r0 = r9
            r3 = r8
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.d0.d(android.os.IInterface, w2.w, java.lang.String, java.lang.String):t2.d0");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f12347m);
        c.l(parcel, 2, this.f12348n, false);
        c.l(parcel, 3, this.f12349o, false);
        c.s(parcel, 4, this.f12350p, i10, false);
        c.t(parcel, 5, this.f12351q, false);
        c.t(parcel, 6, this.f12352r, false);
        c.b(parcel, a10);
    }
}
