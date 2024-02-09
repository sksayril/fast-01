package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public final class n extends a {
    public static final Parcelable.Creator<n> CREATOR = new m();

    /* renamed from: m  reason: collision with root package name */
    public final Bundle f6331m;

    public n(Bundle bundle) {
        this.f6331m = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 1, this.f6331m, false);
        c.b(parcel, a10);
    }
}
