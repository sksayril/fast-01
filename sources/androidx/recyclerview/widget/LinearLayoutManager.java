package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.i;
import java.util.List;

public class LinearLayoutManager extends i.n {
    private boolean A;
    d B = null;
    final a C = new a();
    private final b D = new b();
    private int E = 2;

    /* renamed from: q  reason: collision with root package name */
    int f2882q = 1;

    /* renamed from: r  reason: collision with root package name */
    private c f2883r;

    /* renamed from: s  reason: collision with root package name */
    h f2884s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f2885t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f2886u = false;

    /* renamed from: v  reason: collision with root package name */
    boolean f2887v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f2888w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f2889x = true;

    /* renamed from: y  reason: collision with root package name */
    int f2890y = -1;

    /* renamed from: z  reason: collision with root package name */
    int f2891z = Integer.MIN_VALUE;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        h f2892a;

        /* renamed from: b  reason: collision with root package name */
        int f2893b;

        /* renamed from: c  reason: collision with root package name */
        int f2894c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2895d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2896e;

        a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f2893b = -1;
            this.f2894c = Integer.MIN_VALUE;
            this.f2895d = false;
            this.f2896e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2893b + ", mCoordinate=" + this.f2894c + ", mLayoutFromEnd=" + this.f2895d + ", mValid=" + this.f2896e + '}';
        }
    }

    protected static class b {
        protected b() {
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f2897a = true;

        /* renamed from: b  reason: collision with root package name */
        int f2898b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f2899c = false;

        /* renamed from: d  reason: collision with root package name */
        List<i.b0> f2900d = null;

        c() {
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: m  reason: collision with root package name */
        int f2901m;

        /* renamed from: n  reason: collision with root package name */
        int f2902n;

        /* renamed from: o  reason: collision with root package name */
        boolean f2903o;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f2901m = parcel.readInt();
            this.f2902n = parcel.readInt();
            this.f2903o = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f2901m = dVar.f2901m;
            this.f2902n = dVar.f2902n;
            this.f2903o = dVar.f2903o;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f2901m = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2901m);
            parcel.writeInt(this.f2902n);
            parcel.writeInt(this.f2903o ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z9) {
        U0(i10);
        V0(z9);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        i.n.c J = i.n.J(context, attributeSet, i10, i11);
        U0(J.f3170a);
        V0(J.f3172c);
        W0(J.f3173d);
    }

    private int I0(i.y yVar) {
        if (t() == 0) {
            return 0;
        }
        M0();
        h hVar = this.f2884s;
        View O0 = O0(!this.f2889x, true);
        return k.a(yVar, hVar, O0, N0(!this.f2889x, true), this, this.f2889x);
    }

    private int J0(i.y yVar) {
        if (t() == 0) {
            return 0;
        }
        M0();
        h hVar = this.f2884s;
        View O0 = O0(!this.f2889x, true);
        return k.b(yVar, hVar, O0, N0(!this.f2889x, true), this, this.f2889x, this.f2887v);
    }

    private int K0(i.y yVar) {
        if (t() == 0) {
            return 0;
        }
        M0();
        h hVar = this.f2884s;
        View O0 = O0(!this.f2889x, true);
        return k.c(yVar, hVar, O0, N0(!this.f2889x, true), this, this.f2889x);
    }

    private View N0(boolean z9, boolean z10) {
        int t9;
        int i10;
        if (this.f2887v) {
            t9 = 0;
            i10 = t();
        } else {
            t9 = t() - 1;
            i10 = -1;
        }
        return R0(t9, i10, z9, z10);
    }

    private View O0(boolean z9, boolean z10) {
        int i10;
        int t9;
        if (this.f2887v) {
            i10 = t() - 1;
            t9 = -1;
        } else {
            i10 = 0;
            t9 = t();
        }
        return R0(i10, t9, z9, z10);
    }

    private View S0() {
        return s(this.f2887v ? 0 : t() - 1);
    }

    private View T0() {
        return s(this.f2887v ? t() - 1 : 0);
    }

    public boolean H0() {
        return this.B == null && this.f2885t == this.f2888w;
    }

    /* access modifiers changed from: package-private */
    public c L0() {
        return new c();
    }

    /* access modifiers changed from: package-private */
    public void M0() {
        if (this.f2883r == null) {
            this.f2883r = L0();
        }
    }

    public int P0() {
        View R0 = R0(0, t(), false, true);
        if (R0 == null) {
            return -1;
        }
        return I(R0);
    }

    public boolean Q() {
        return true;
    }

    public int Q0() {
        View R0 = R0(t() - 1, -1, false, true);
        if (R0 == null) {
            return -1;
        }
        return I(R0);
    }

    /* access modifiers changed from: package-private */
    public View R0(int i10, int i11, boolean z9, boolean z10) {
        M0();
        int i12 = 320;
        int i13 = z9 ? 24579 : 320;
        if (!z10) {
            i12 = 0;
        }
        return (this.f2882q == 0 ? this.f3156e : this.f3157f).a(i10, i11, i13, i12);
    }

    public void U0(int i10) {
        if (i10 == 0 || i10 == 1) {
            a((String) null);
            if (i10 != this.f2882q || this.f2884s == null) {
                h b10 = h.b(this, i10);
                this.f2884s = b10;
                this.C.f2892a = b10;
                this.f2882q = i10;
                D0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i10);
    }

    public void V0(boolean z9) {
        a((String) null);
        if (z9 != this.f2886u) {
            this.f2886u = z9;
            D0();
        }
    }

    public void W0(boolean z9) {
        a((String) null);
        if (this.f2888w != z9) {
            this.f2888w = z9;
            D0();
        }
    }

    public void Y(i iVar, i.u uVar) {
        super.Y(iVar, uVar);
        if (this.A) {
            w0(uVar);
            uVar.b();
        }
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (t() > 0) {
            accessibilityEvent.setFromIndex(P0());
            accessibilityEvent.setToIndex(Q0());
        }
    }

    public void a(String str) {
        if (this.B == null) {
            super.a(str);
        }
    }

    public boolean b() {
        return this.f2882q == 0;
    }

    public boolean c() {
        return this.f2882q == 1;
    }

    public int f(i.y yVar) {
        return I0(yVar);
    }

    public int g(i.y yVar) {
        return J0(yVar);
    }

    public int h(i.y yVar) {
        return K0(yVar);
    }

    public int i(i.y yVar) {
        return I0(yVar);
    }

    public int j(i.y yVar) {
        return J0(yVar);
    }

    public int k(i.y yVar) {
        return K0(yVar);
    }

    public i.o n() {
        return new i.o(-2, -2);
    }

    public void p0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.B = (d) parcelable;
            D0();
        }
    }

    public Parcelable q0() {
        if (this.B != null) {
            return new d(this.B);
        }
        d dVar = new d();
        if (t() > 0) {
            M0();
            boolean z9 = this.f2885t ^ this.f2887v;
            dVar.f2903o = z9;
            if (z9) {
                View S0 = S0();
                dVar.f2902n = this.f2884s.f() - this.f2884s.d(S0);
                dVar.f2901m = I(S0);
            } else {
                View T0 = T0();
                dVar.f2901m = I(T0);
                dVar.f2902n = this.f2884s.e(T0) - this.f2884s.g();
            }
        } else {
            dVar.a();
        }
        return dVar;
    }
}
