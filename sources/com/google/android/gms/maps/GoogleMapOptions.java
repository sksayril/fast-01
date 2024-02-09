package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import h2.o;
import i2.a;
import i2.c;
import y2.f;

public final class GoogleMapOptions extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new a();
    private static final Integer F = Integer.valueOf(Color.argb(255, 236, 233, 225));
    private Float A = null;
    private LatLngBounds B = null;
    private Boolean C;
    private Integer D = null;
    private String E = null;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f5796m;

    /* renamed from: n  reason: collision with root package name */
    private Boolean f5797n;

    /* renamed from: o  reason: collision with root package name */
    private int f5798o = -1;

    /* renamed from: p  reason: collision with root package name */
    private CameraPosition f5799p;

    /* renamed from: q  reason: collision with root package name */
    private Boolean f5800q;

    /* renamed from: r  reason: collision with root package name */
    private Boolean f5801r;

    /* renamed from: s  reason: collision with root package name */
    private Boolean f5802s;

    /* renamed from: t  reason: collision with root package name */
    private Boolean f5803t;

    /* renamed from: u  reason: collision with root package name */
    private Boolean f5804u;

    /* renamed from: v  reason: collision with root package name */
    private Boolean f5805v;

    /* renamed from: w  reason: collision with root package name */
    private Boolean f5806w;

    /* renamed from: x  reason: collision with root package name */
    private Boolean f5807x;

    /* renamed from: y  reason: collision with root package name */
    private Boolean f5808y;

    /* renamed from: z  reason: collision with root package name */
    private Float f5809z = null;

    public GoogleMapOptions() {
    }

    GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str) {
        this.f5796m = f.b(b10);
        this.f5797n = f.b(b11);
        this.f5798o = i10;
        this.f5799p = cameraPosition;
        this.f5800q = f.b(b12);
        this.f5801r = f.b(b13);
        this.f5802s = f.b(b14);
        this.f5803t = f.b(b15);
        this.f5804u = f.b(b16);
        this.f5805v = f.b(b17);
        this.f5806w = f.b(b18);
        this.f5807x = f.b(b19);
        this.f5808y = f.b(b20);
        this.f5809z = f10;
        this.A = f11;
        this.B = latLngBounds;
        this.C = f.b(b21);
        this.D = num;
        this.E = str;
    }

    public Float A() {
        return this.f5809z;
    }

    public GoogleMapOptions B(LatLngBounds latLngBounds) {
        this.B = latLngBounds;
        return this;
    }

    public GoogleMapOptions C(boolean z9) {
        this.f5806w = Boolean.valueOf(z9);
        return this;
    }

    public GoogleMapOptions D(String str) {
        this.E = str;
        return this;
    }

    public GoogleMapOptions E(boolean z9) {
        this.f5807x = Boolean.valueOf(z9);
        return this;
    }

    public GoogleMapOptions F(int i10) {
        this.f5798o = i10;
        return this;
    }

    public GoogleMapOptions G(float f10) {
        this.A = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions H(float f10) {
        this.f5809z = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions I(boolean z9) {
        this.f5805v = Boolean.valueOf(z9);
        return this;
    }

    public GoogleMapOptions J(boolean z9) {
        this.f5802s = Boolean.valueOf(z9);
        return this;
    }

    public GoogleMapOptions K(boolean z9) {
        this.f5804u = Boolean.valueOf(z9);
        return this;
    }

    public GoogleMapOptions L(boolean z9) {
        this.f5800q = Boolean.valueOf(z9);
        return this;
    }

    public GoogleMapOptions M(boolean z9) {
        this.f5803t = Boolean.valueOf(z9);
        return this;
    }

    public GoogleMapOptions d(CameraPosition cameraPosition) {
        this.f5799p = cameraPosition;
        return this;
    }

    public GoogleMapOptions f(boolean z9) {
        this.f5801r = Boolean.valueOf(z9);
        return this;
    }

    public Integer g() {
        return this.D;
    }

    public CameraPosition i() {
        return this.f5799p;
    }

    public LatLngBounds k() {
        return this.B;
    }

    public Boolean l() {
        return this.f5806w;
    }

    public String o() {
        return this.E;
    }

    public String toString() {
        return o.c(this).a("MapType", Integer.valueOf(this.f5798o)).a("LiteMode", this.f5806w).a("Camera", this.f5799p).a("CompassEnabled", this.f5801r).a("ZoomControlsEnabled", this.f5800q).a("ScrollGesturesEnabled", this.f5802s).a("ZoomGesturesEnabled", this.f5803t).a("TiltGesturesEnabled", this.f5804u).a("RotateGesturesEnabled", this.f5805v).a("ScrollGesturesEnabledDuringRotateOrZoom", this.C).a("MapToolbarEnabled", this.f5807x).a("AmbientEnabled", this.f5808y).a("MinZoomPreference", this.f5809z).a("MaxZoomPreference", this.A).a("BackgroundColor", this.D).a("LatLngBoundsForCameraTarget", this.B).a("ZOrderOnTop", this.f5796m).a("UseViewLifecycleInFragment", this.f5797n).toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.f(parcel, 2, f.a(this.f5796m));
        c.f(parcel, 3, f.a(this.f5797n));
        c.m(parcel, 4, y());
        c.s(parcel, 5, i(), i10, false);
        c.f(parcel, 6, f.a(this.f5800q));
        c.f(parcel, 7, f.a(this.f5801r));
        c.f(parcel, 8, f.a(this.f5802s));
        c.f(parcel, 9, f.a(this.f5803t));
        c.f(parcel, 10, f.a(this.f5804u));
        c.f(parcel, 11, f.a(this.f5805v));
        c.f(parcel, 12, f.a(this.f5806w));
        c.f(parcel, 14, f.a(this.f5807x));
        c.f(parcel, 15, f.a(this.f5808y));
        c.k(parcel, 16, A(), false);
        c.k(parcel, 17, z(), false);
        c.s(parcel, 18, k(), i10, false);
        c.f(parcel, 19, f.a(this.C));
        c.o(parcel, 20, g(), false);
        c.t(parcel, 21, o(), false);
        c.b(parcel, a10);
    }

    public int y() {
        return this.f5798o;
    }

    public Float z() {
        return this.A;
    }
}
