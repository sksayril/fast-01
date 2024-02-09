package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.o;
import h2.p;
import i2.c;
import z2.d0;

public final class CameraPosition extends i2.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new d0();

    /* renamed from: m  reason: collision with root package name */
    public final LatLng f5810m;

    /* renamed from: n  reason: collision with root package name */
    public final float f5811n;

    /* renamed from: o  reason: collision with root package name */
    public final float f5812o;

    /* renamed from: p  reason: collision with root package name */
    public final float f5813p;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private LatLng f5814a;

        /* renamed from: b  reason: collision with root package name */
        private float f5815b;

        /* renamed from: c  reason: collision with root package name */
        private float f5816c;

        /* renamed from: d  reason: collision with root package name */
        private float f5817d;

        public a a(float f10) {
            this.f5817d = f10;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f5814a, this.f5815b, this.f5816c, this.f5817d);
        }

        public a c(LatLng latLng) {
            this.f5814a = (LatLng) p.k(latLng, "location must not be null.");
            return this;
        }

        public a d(float f10) {
            this.f5816c = f10;
            return this;
        }

        public a e(float f10) {
            this.f5815b = f10;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        p.k(latLng, "camera target must not be null.");
        p.c(f11 >= 0.0f && f11 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f5810m = latLng;
        this.f5811n = f10;
        this.f5812o = f11 + 0.0f;
        this.f5813p = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public static a d() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f5810m.equals(cameraPosition.f5810m) && Float.floatToIntBits(this.f5811n) == Float.floatToIntBits(cameraPosition.f5811n) && Float.floatToIntBits(this.f5812o) == Float.floatToIntBits(cameraPosition.f5812o) && Float.floatToIntBits(this.f5813p) == Float.floatToIntBits(cameraPosition.f5813p);
    }

    public int hashCode() {
        return o.b(this.f5810m, Float.valueOf(this.f5811n), Float.valueOf(this.f5812o), Float.valueOf(this.f5813p));
    }

    public String toString() {
        return o.c(this).a("target", this.f5810m).a("zoom", Float.valueOf(this.f5811n)).a("tilt", Float.valueOf(this.f5812o)).a("bearing", Float.valueOf(this.f5813p)).toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 2, this.f5810m, i10, false);
        c.j(parcel, 3, this.f5811n);
        c.j(parcel, 4, this.f5812o);
        c.j(parcel, 5, this.f5813p);
        c.b(parcel, a10);
    }
}
