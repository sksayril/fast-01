package z2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import h2.o;
import h2.p;
import i2.a;
import i2.c;
import o2.b;

public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new i0();

    /* renamed from: p  reason: collision with root package name */
    private static final String f13483p = d.class.getSimpleName();

    /* renamed from: m  reason: collision with root package name */
    private final int f13484m;

    /* renamed from: n  reason: collision with root package name */
    private final a f13485n;

    /* renamed from: o  reason: collision with root package name */
    private final Float f13486o;

    protected d(int i10) {
        this(i10, (a) null, (Float) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    d(int i10, IBinder iBinder, Float f10) {
        this(i10, iBinder == null ? null : new a(b.a.J(iBinder)), f10);
    }

    private d(int i10, a aVar, Float f10) {
        boolean z9;
        boolean z10 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            if (aVar == null || !z10) {
                i10 = 3;
                z9 = false;
                p.b(z9, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i10), aVar, f10}));
                this.f13484m = i10;
                this.f13485n = aVar;
                this.f13486o = f10;
            }
            i10 = 3;
        }
        z9 = true;
        p.b(z9, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i10), aVar, f10}));
        this.f13484m = i10;
        this.f13485n = aVar;
        this.f13486o = f10;
    }

    protected d(a aVar, float f10) {
        this(3, aVar, Float.valueOf(f10));
    }

    /* access modifiers changed from: package-private */
    public final d d() {
        int i10 = this.f13484m;
        if (i10 == 0) {
            return new c();
        }
        boolean z9 = true;
        if (i10 == 1) {
            return new u();
        }
        if (i10 == 2) {
            return new s();
        }
        if (i10 != 3) {
            String str = f13483p;
            Log.w(str, "Unknown Cap type: " + i10);
            return this;
        }
        p.n(this.f13485n != null, "bitmapDescriptor must not be null");
        if (this.f13486o == null) {
            z9 = false;
        }
        p.n(z9, "bitmapRefWidth must not be null");
        return new g(this.f13485n, this.f13486o.floatValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f13484m == dVar.f13484m && o.a(this.f13485n, dVar.f13485n) && o.a(this.f13486o, dVar.f13486o);
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f13484m), this.f13485n, this.f13486o);
    }

    public String toString() {
        int i10 = this.f13484m;
        return "[Cap: type=" + i10 + "]";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 2, this.f13484m);
        a aVar = this.f13485n;
        c.l(parcel, 3, aVar == null ? null : aVar.a().asBinder(), false);
        c.k(parcel, 4, this.f13486o, false);
        c.b(parcel, a10);
    }
}
