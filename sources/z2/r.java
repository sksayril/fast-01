package z2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import h2.p;
import i2.a;
import i2.c;
import java.util.ArrayList;
import java.util.List;
import z2.w;

public final class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new q0();

    /* renamed from: m  reason: collision with root package name */
    private final List f13537m;

    /* renamed from: n  reason: collision with root package name */
    private float f13538n;

    /* renamed from: o  reason: collision with root package name */
    private int f13539o;

    /* renamed from: p  reason: collision with root package name */
    private float f13540p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13541q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f13542r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13543s;

    /* renamed from: t  reason: collision with root package name */
    private d f13544t;

    /* renamed from: u  reason: collision with root package name */
    private d f13545u;

    /* renamed from: v  reason: collision with root package name */
    private int f13546v;

    /* renamed from: w  reason: collision with root package name */
    private List f13547w;

    /* renamed from: x  reason: collision with root package name */
    private List f13548x;

    public r() {
        this.f13538n = 10.0f;
        this.f13539o = -16777216;
        this.f13540p = 0.0f;
        this.f13541q = true;
        this.f13542r = false;
        this.f13543s = false;
        this.f13544t = new c();
        this.f13545u = new c();
        this.f13546v = 0;
        this.f13547w = null;
        this.f13548x = new ArrayList();
        this.f13537m = new ArrayList();
    }

    r(List list, float f10, int i10, float f11, boolean z9, boolean z10, boolean z11, d dVar, d dVar2, int i11, List list2, List list3) {
        this.f13538n = 10.0f;
        this.f13539o = -16777216;
        this.f13540p = 0.0f;
        this.f13541q = true;
        this.f13542r = false;
        this.f13543s = false;
        this.f13544t = new c();
        this.f13545u = new c();
        this.f13546v = 0;
        this.f13547w = null;
        this.f13548x = new ArrayList();
        this.f13537m = list;
        this.f13538n = f10;
        this.f13539o = i10;
        this.f13540p = f11;
        this.f13541q = z9;
        this.f13542r = z10;
        this.f13543s = z11;
        if (dVar != null) {
            this.f13544t = dVar;
        }
        if (dVar2 != null) {
            this.f13545u = dVar2;
        }
        this.f13546v = i11;
        this.f13547w = list2;
        if (list3 != null) {
            this.f13548x = list3;
        }
    }

    public List<LatLng> A() {
        return this.f13537m;
    }

    public d B() {
        return this.f13544t.d();
    }

    public float C() {
        return this.f13538n;
    }

    public float D() {
        return this.f13540p;
    }

    public boolean E() {
        return this.f13543s;
    }

    public boolean F() {
        return this.f13542r;
    }

    public boolean G() {
        return this.f13541q;
    }

    public r H(int i10) {
        this.f13546v = i10;
        return this;
    }

    public r I(List<n> list) {
        this.f13547w = list;
        return this;
    }

    public r J(d dVar) {
        this.f13544t = (d) p.k(dVar, "startCap must not be null");
        return this;
    }

    public r K(boolean z9) {
        this.f13541q = z9;
        return this;
    }

    public r L(float f10) {
        this.f13538n = f10;
        return this;
    }

    public r M(float f10) {
        this.f13540p = f10;
        return this;
    }

    public r d(Iterable<LatLng> iterable) {
        p.k(iterable, "points must not be null.");
        for (LatLng add : iterable) {
            this.f13537m.add(add);
        }
        return this;
    }

    public r f(boolean z9) {
        this.f13543s = z9;
        return this;
    }

    public r g(int i10) {
        this.f13539o = i10;
        return this;
    }

    public r i(d dVar) {
        this.f13545u = (d) p.k(dVar, "endCap must not be null");
        return this;
    }

    public r k(boolean z9) {
        this.f13542r = z9;
        return this;
    }

    public int l() {
        return this.f13539o;
    }

    public d o() {
        return this.f13545u.d();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.w(parcel, 2, A(), false);
        c.j(parcel, 3, C());
        c.m(parcel, 4, l());
        c.j(parcel, 5, D());
        c.c(parcel, 6, G());
        c.c(parcel, 7, F());
        c.c(parcel, 8, E());
        c.s(parcel, 9, B(), i10, false);
        c.s(parcel, 10, o(), i10, false);
        c.m(parcel, 11, y());
        c.w(parcel, 12, z(), false);
        ArrayList arrayList = new ArrayList(this.f13548x.size());
        for (x xVar : this.f13548x) {
            w.a aVar = new w.a(xVar.f());
            aVar.c(this.f13538n);
            aVar.b(this.f13541q);
            arrayList.add(new x(aVar.a(), xVar.d()));
        }
        c.w(parcel, 13, arrayList, false);
        c.b(parcel, a10);
    }

    public int y() {
        return this.f13546v;
    }

    public List<n> z() {
        return this.f13547w;
    }
}
