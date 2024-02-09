package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.p;
import i2.a;
import i2.c;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* renamed from: m  reason: collision with root package name */
    final int f4900m;

    /* renamed from: n  reason: collision with root package name */
    private final String f4901n;

    Scope(int i10, String str) {
        p.g(str, "scopeUri must not be null or empty");
        this.f4900m = i10;
        this.f4901n = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public String d() {
        return this.f4901n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f4901n.equals(((Scope) obj).f4901n);
    }

    public int hashCode() {
        return this.f4901n.hashCode();
    }

    public String toString() {
        return this.f4901n;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f4900m);
        c.t(parcel, 2, d(), false);
        c.b(parcel, a10);
    }
}
