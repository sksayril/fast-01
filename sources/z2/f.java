package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import h2.p;
import i2.a;
import i2.c;
import java.util.List;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new j0();

    /* renamed from: m  reason: collision with root package name */
    private LatLng f13490m;

    /* renamed from: n  reason: collision with root package name */
    private double f13491n;

    /* renamed from: o  reason: collision with root package name */
    private float f13492o;

    /* renamed from: p  reason: collision with root package name */
    private int f13493p;

    /* renamed from: q  reason: collision with root package name */
    private int f13494q;

    /* renamed from: r  reason: collision with root package name */
    private float f13495r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13496s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f13497t;

    /* renamed from: u  reason: collision with root package name */
    private List f13498u;

    public f() {
        this.f13490m = null;
        this.f13491n = 0.0d;
        this.f13492o = 10.0f;
        this.f13493p = -16777216;
        this.f13494q = 0;
        this.f13495r = 0.0f;
        this.f13496s = true;
        this.f13497t = false;
        this.f13498u = null;
    }

    f(LatLng latLng, double d10, float f10, int i10, int i11, float f11, boolean z9, boolean z10, List list) {
        this.f13490m = latLng;
        this.f13491n = d10;
        this.f13492o = f10;
        this.f13493p = i10;
        this.f13494q = i11;
        this.f13495r = f11;
        this.f13496s = z9;
        this.f13497t = z10;
        this.f13498u = list;
    }

    public float A() {
        return this.f13495r;
    }

    public boolean B() {
        return this.f13497t;
    }

    public boolean C() {
        return this.f13496s;
    }

    public f D(double d10) {
        this.f13491n = d10;
        return this;
    }

    public f E(int i10) {
        this.f13493p = i10;
        return this;
    }

    public f F(float f10) {
        this.f13492o = f10;
        return this;
    }

    public f G(boolean z9) {
        this.f13496s = z9;
        return this;
    }

    public f H(float f10) {
        this.f13495r = f10;
        return this;
    }

    public f d(LatLng latLng) {
        p.k(latLng, "center must not be null.");
        this.f13490m = latLng;
        return this;
    }

    public f f(boolean z9) {
        this.f13497t = z9;
        return this;
    }

    public f g(int i10) {
        this.f13494q = i10;
        return this;
    }

    public LatLng i() {
        return this.f13490m;
    }

    public int k() {
        return this.f13494q;
    }

    public double l() {
        return this.f13491n;
    }

    public int o() {
        return this.f13493p;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 2, i(), i10, false);
        c.h(parcel, 3, l());
        c.j(parcel, 4, z());
        c.m(parcel, 5, o());
        c.m(parcel, 6, k());
        c.j(parcel, 7, A());
        c.c(parcel, 8, C());
        c.c(parcel, 9, B());
        c.w(parcel, 10, y(), false);
        c.b(parcel, a10);
    }

    public List<n> y() {
        return this.f13498u;
    }

    public float z() {
        return this.f13492o;
    }
}
