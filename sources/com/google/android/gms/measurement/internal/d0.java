package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;
import java.util.Iterator;

public final class d0 extends a implements Iterable<String> {
    public static final Parcelable.Creator<d0> CREATOR = new f0();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Bundle f5943m;

    d0(Bundle bundle) {
        this.f5943m = bundle;
    }

    public final int d() {
        return this.f5943m.size();
    }

    /* access modifiers changed from: package-private */
    public final Double g(String str) {
        return Double.valueOf(this.f5943m.getDouble(str));
    }

    public final Bundle i() {
        return new Bundle(this.f5943m);
    }

    public final Iterator<String> iterator() {
        return new g0(this);
    }

    /* access modifiers changed from: package-private */
    public final Long k(String str) {
        return Long.valueOf(this.f5943m.getLong(str));
    }

    /* access modifiers changed from: package-private */
    public final Object l(String str) {
        return this.f5943m.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String o(String str) {
        return this.f5943m.getString(str);
    }

    public final String toString() {
        return this.f5943m.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 2, i(), false);
        c.b(parcel, a10);
    }
}
