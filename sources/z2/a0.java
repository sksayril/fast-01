package z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import h2.p;
import i2.a;
import i2.c;
import u2.m;
import u2.n;

public final class a0 extends a {
    public static final Parcelable.Creator<a0> CREATOR = new g0();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public n f13470m;

    /* renamed from: n  reason: collision with root package name */
    private b0 f13471n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13472o = true;

    /* renamed from: p  reason: collision with root package name */
    private float f13473p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13474q = true;

    /* renamed from: r  reason: collision with root package name */
    private float f13475r = 0.0f;

    public a0() {
    }

    a0(IBinder iBinder, boolean z9, float f10, boolean z10, float f11) {
        n J = m.J(iBinder);
        this.f13470m = J;
        this.f13471n = J == null ? null : new e0(this);
        this.f13472o = z9;
        this.f13473p = f10;
        this.f13474q = z10;
        this.f13475r = f11;
    }

    public a0 d(boolean z9) {
        this.f13474q = z9;
        return this;
    }

    public boolean f() {
        return this.f13474q;
    }

    public float g() {
        return this.f13475r;
    }

    public float i() {
        return this.f13473p;
    }

    public boolean k() {
        return this.f13472o;
    }

    public a0 l(b0 b0Var) {
        this.f13471n = (b0) p.k(b0Var, "tileProvider must not be null.");
        this.f13470m = new f0(this, b0Var);
        return this;
    }

    public a0 o(float f10) {
        boolean z9 = false;
        if (f10 >= 0.0f && f10 <= 1.0f) {
            z9 = true;
        }
        p.b(z9, "Transparency must be in the range [0..1]");
        this.f13475r = f10;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        n nVar = this.f13470m;
        c.l(parcel, 2, nVar == null ? null : nVar.asBinder(), false);
        c.c(parcel, 3, k());
        c.j(parcel, 4, i());
        c.c(parcel, 5, f());
        c.j(parcel, 6, g());
        c.b(parcel, a10);
    }

    public a0 y(boolean z9) {
        this.f13472o = z9;
        return this;
    }

    public a0 z(float f10) {
        this.f13473p = f10;
        return this;
    }
}
