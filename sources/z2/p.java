package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import i2.a;
import i2.c;
import java.util.ArrayList;
import java.util.List;

public final class p extends a {
    public static final Parcelable.Creator<p> CREATOR = new p0();

    /* renamed from: m  reason: collision with root package name */
    private final List f13525m;

    /* renamed from: n  reason: collision with root package name */
    private final List f13526n;

    /* renamed from: o  reason: collision with root package name */
    private float f13527o;

    /* renamed from: p  reason: collision with root package name */
    private int f13528p;

    /* renamed from: q  reason: collision with root package name */
    private int f13529q;

    /* renamed from: r  reason: collision with root package name */
    private float f13530r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13531s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f13532t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f13533u;

    /* renamed from: v  reason: collision with root package name */
    private int f13534v;

    /* renamed from: w  reason: collision with root package name */
    private List f13535w;

    public p() {
        this.f13527o = 10.0f;
        this.f13528p = -16777216;
        this.f13529q = 0;
        this.f13530r = 0.0f;
        this.f13531s = true;
        this.f13532t = false;
        this.f13533u = false;
        this.f13534v = 0;
        this.f13535w = null;
        this.f13525m = new ArrayList();
        this.f13526n = new ArrayList();
    }

    p(List list, List list2, float f10, int i10, int i11, float f11, boolean z9, boolean z10, boolean z11, int i12, List list3) {
        this.f13525m = list;
        this.f13526n = list2;
        this.f13527o = f10;
        this.f13528p = i10;
        this.f13529q = i11;
        this.f13530r = f11;
        this.f13531s = z9;
        this.f13532t = z10;
        this.f13533u = z11;
        this.f13534v = i12;
        this.f13535w = list3;
    }

    public List<n> A() {
        return this.f13535w;
    }

    public float B() {
        return this.f13527o;
    }

    public float C() {
        return this.f13530r;
    }

    public boolean D() {
        return this.f13533u;
    }

    public boolean E() {
        return this.f13532t;
    }

    public boolean F() {
        return this.f13531s;
    }

    public p G(int i10) {
        this.f13528p = i10;
        return this;
    }

    public p H(float f10) {
        this.f13527o = f10;
        return this;
    }

    public p I(boolean z9) {
        this.f13531s = z9;
        return this;
    }

    public p J(float f10) {
        this.f13530r = f10;
        return this;
    }

    public p d(Iterable<LatLng> iterable) {
        h2.p.k(iterable, "points must not be null.");
        for (LatLng add : iterable) {
            this.f13525m.add(add);
        }
        return this;
    }

    public p f(Iterable<LatLng> iterable) {
        h2.p.k(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        for (LatLng add : iterable) {
            arrayList.add(add);
        }
        this.f13526n.add(arrayList);
        return this;
    }

    public p g(boolean z9) {
        this.f13533u = z9;
        return this;
    }

    public p i(int i10) {
        this.f13529q = i10;
        return this;
    }

    public p k(boolean z9) {
        this.f13532t = z9;
        return this;
    }

    public int l() {
        return this.f13529q;
    }

    public List<LatLng> o() {
        return this.f13525m;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.w(parcel, 2, o(), false);
        c.p(parcel, 3, this.f13526n, false);
        c.j(parcel, 4, B());
        c.m(parcel, 5, y());
        c.m(parcel, 6, l());
        c.j(parcel, 7, C());
        c.c(parcel, 8, F());
        c.c(parcel, 9, E());
        c.c(parcel, 10, D());
        c.m(parcel, 11, z());
        c.w(parcel, 12, A(), false);
        c.b(parcel, a10);
    }

    public int y() {
        return this.f13528p;
    }

    public int z() {
        return this.f13534v;
    }
}
