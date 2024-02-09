package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e2.b;
import f2.d;
import f2.k;
import h2.o;
import h2.p;
import i2.a;
import i2.c;

public final class Status extends a implements k, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new b();

    /* renamed from: r  reason: collision with root package name */
    public static final Status f4902r = new Status(-1);

    /* renamed from: s  reason: collision with root package name */
    public static final Status f4903s = new Status(0);

    /* renamed from: t  reason: collision with root package name */
    public static final Status f4904t = new Status(14);

    /* renamed from: u  reason: collision with root package name */
    public static final Status f4905u = new Status(8);

    /* renamed from: v  reason: collision with root package name */
    public static final Status f4906v = new Status(15);

    /* renamed from: w  reason: collision with root package name */
    public static final Status f4907w = new Status(16);

    /* renamed from: x  reason: collision with root package name */
    public static final Status f4908x = new Status(18);

    /* renamed from: y  reason: collision with root package name */
    public static final Status f4909y = new Status(17);

    /* renamed from: m  reason: collision with root package name */
    final int f4910m;

    /* renamed from: n  reason: collision with root package name */
    private final int f4911n;

    /* renamed from: o  reason: collision with root package name */
    private final String f4912o;

    /* renamed from: p  reason: collision with root package name */
    private final PendingIntent f4913p;

    /* renamed from: q  reason: collision with root package name */
    private final b f4914q;

    public Status(int i10) {
        this(i10, (String) null);
    }

    Status(int i10, int i11, String str, PendingIntent pendingIntent, b bVar) {
        this.f4910m = i10;
        this.f4911n = i11;
        this.f4912o = str;
        this.f4913p = pendingIntent;
        this.f4914q = bVar;
    }

    public Status(int i10, String str) {
        this(1, i10, str, (PendingIntent) null, (b) null);
    }

    public Status(b bVar, String str) {
        this(bVar, str, 17);
    }

    @Deprecated
    public Status(b bVar, String str, int i10) {
        this(1, i10, str, bVar.g(), bVar);
    }

    public Status c() {
        return this;
    }

    public b d() {
        return this.f4914q;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4910m == status.f4910m && this.f4911n == status.f4911n && o.a(this.f4912o, status.f4912o) && o.a(this.f4913p, status.f4913p) && o.a(this.f4914q, status.f4914q);
    }

    public int f() {
        return this.f4911n;
    }

    public String g() {
        return this.f4912o;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f4910m), Integer.valueOf(this.f4911n), this.f4912o, this.f4913p, this.f4914q);
    }

    public boolean i() {
        return this.f4913p != null;
    }

    public boolean k() {
        return this.f4911n <= 0;
    }

    public void l(Activity activity, int i10) {
        if (i()) {
            PendingIntent pendingIntent = this.f4913p;
            p.j(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, (Intent) null, 0, 0, 0);
        }
    }

    public final String o() {
        String str = this.f4912o;
        return str != null ? str : d.a(this.f4911n);
    }

    public String toString() {
        o.a c10 = o.c(this);
        c10.a("statusCode", o());
        c10.a("resolution", this.f4913p);
        return c10.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, f());
        c.t(parcel, 2, g(), false);
        c.s(parcel, 3, this.f4913p, i10, false);
        c.s(parcel, 4, d(), i10, false);
        c.m(parcel, 1000, this.f4910m);
        c.b(parcel, a10);
    }
}
