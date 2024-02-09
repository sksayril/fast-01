package z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import i2.a;
import i2.c;
import o2.b;

public final class m extends a {
    public static final Parcelable.Creator<m> CREATOR = new n0();

    /* renamed from: m  reason: collision with root package name */
    private LatLng f13507m;

    /* renamed from: n  reason: collision with root package name */
    private String f13508n;

    /* renamed from: o  reason: collision with root package name */
    private String f13509o;

    /* renamed from: p  reason: collision with root package name */
    private a f13510p;

    /* renamed from: q  reason: collision with root package name */
    private float f13511q = 0.5f;

    /* renamed from: r  reason: collision with root package name */
    private float f13512r = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13513s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f13514t = true;

    /* renamed from: u  reason: collision with root package name */
    private boolean f13515u = false;

    /* renamed from: v  reason: collision with root package name */
    private float f13516v = 0.0f;

    /* renamed from: w  reason: collision with root package name */
    private float f13517w = 0.5f;

    /* renamed from: x  reason: collision with root package name */
    private float f13518x = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    private float f13519y = 1.0f;

    /* renamed from: z  reason: collision with root package name */
    private float f13520z;

    public m() {
    }

    m(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z9, boolean z10, boolean z11, float f12, float f13, float f14, float f15, float f16) {
        this.f13507m = latLng;
        this.f13508n = str;
        this.f13509o = str2;
        this.f13510p = iBinder == null ? null : new a(b.a.J(iBinder));
        this.f13511q = f10;
        this.f13512r = f11;
        this.f13513s = z9;
        this.f13514t = z10;
        this.f13515u = z11;
        this.f13516v = f12;
        this.f13517w = f13;
        this.f13518x = f14;
        this.f13519y = f15;
        this.f13520z = f16;
    }

    public LatLng A() {
        return this.f13507m;
    }

    public float B() {
        return this.f13516v;
    }

    public String C() {
        return this.f13509o;
    }

    public String D() {
        return this.f13508n;
    }

    public float E() {
        return this.f13520z;
    }

    public m F(a aVar) {
        this.f13510p = aVar;
        return this;
    }

    public m G(float f10, float f11) {
        this.f13517w = f10;
        this.f13518x = f11;
        return this;
    }

    public boolean H() {
        return this.f13513s;
    }

    public boolean I() {
        return this.f13515u;
    }

    public boolean J() {
        return this.f13514t;
    }

    public m K(LatLng latLng) {
        if (latLng != null) {
            this.f13507m = latLng;
            return this;
        }
        throw new IllegalArgumentException("latlng cannot be null - a position is required.");
    }

    public m L(float f10) {
        this.f13516v = f10;
        return this;
    }

    public m M(String str) {
        this.f13509o = str;
        return this;
    }

    public m N(String str) {
        this.f13508n = str;
        return this;
    }

    public m O(boolean z9) {
        this.f13514t = z9;
        return this;
    }

    public m P(float f10) {
        this.f13520z = f10;
        return this;
    }

    public m d(float f10) {
        this.f13519y = f10;
        return this;
    }

    public m f(float f10, float f11) {
        this.f13511q = f10;
        this.f13512r = f11;
        return this;
    }

    public m g(boolean z9) {
        this.f13513s = z9;
        return this;
    }

    public m i(boolean z9) {
        this.f13515u = z9;
        return this;
    }

    public float k() {
        return this.f13519y;
    }

    public float l() {
        return this.f13511q;
    }

    public float o() {
        return this.f13512r;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 2, A(), i10, false);
        c.t(parcel, 3, D(), false);
        c.t(parcel, 4, C(), false);
        a aVar = this.f13510p;
        c.l(parcel, 5, aVar == null ? null : aVar.a().asBinder(), false);
        c.j(parcel, 6, l());
        c.j(parcel, 7, o());
        c.c(parcel, 8, H());
        c.c(parcel, 9, J());
        c.c(parcel, 10, I());
        c.j(parcel, 11, B());
        c.j(parcel, 12, y());
        c.j(parcel, 13, z());
        c.j(parcel, 14, k());
        c.j(parcel, 15, E());
        c.b(parcel, a10);
    }

    public float y() {
        return this.f13517w;
    }

    public float z() {
        return this.f13518x;
    }
}
