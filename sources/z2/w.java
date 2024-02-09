package z2;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import i2.c;

public final class w extends i2.a {
    public static final Parcelable.Creator<w> CREATOR = new s0();

    /* renamed from: m  reason: collision with root package name */
    private final float f13550m;

    /* renamed from: n  reason: collision with root package name */
    private final int f13551n;

    /* renamed from: o  reason: collision with root package name */
    private final int f13552o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f13553p;

    /* renamed from: q  reason: collision with root package name */
    private final v f13554q;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private float f13555a;

        /* renamed from: b  reason: collision with root package name */
        private int f13556b;

        /* renamed from: c  reason: collision with root package name */
        private int f13557c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f13558d;

        /* renamed from: e  reason: collision with root package name */
        private v f13559e;

        public a(w wVar) {
            this.f13555a = wVar.g();
            Pair i10 = wVar.i();
            this.f13556b = ((Integer) i10.first).intValue();
            this.f13557c = ((Integer) i10.second).intValue();
            this.f13558d = wVar.f();
            this.f13559e = wVar.d();
        }

        public w a() {
            return new w(this.f13555a, this.f13556b, this.f13557c, this.f13558d, this.f13559e);
        }

        public final a b(boolean z9) {
            this.f13558d = z9;
            return this;
        }

        public final a c(float f10) {
            this.f13555a = f10;
            return this;
        }
    }

    w(float f10, int i10, int i11, boolean z9, v vVar) {
        this.f13550m = f10;
        this.f13551n = i10;
        this.f13552o = i11;
        this.f13553p = z9;
        this.f13554q = vVar;
    }

    public v d() {
        return this.f13554q;
    }

    public boolean f() {
        return this.f13553p;
    }

    public final float g() {
        return this.f13550m;
    }

    public final Pair i() {
        return new Pair(Integer.valueOf(this.f13551n), Integer.valueOf(this.f13552o));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.j(parcel, 2, this.f13550m);
        c.m(parcel, 3, this.f13551n);
        c.m(parcel, 4, this.f13552o);
        c.c(parcel, 5, f());
        c.s(parcel, 6, d(), i10, false);
        c.b(parcel, a10);
    }
}
