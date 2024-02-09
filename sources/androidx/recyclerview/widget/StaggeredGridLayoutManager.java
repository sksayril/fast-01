package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.d;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends i.n {
    int A = Integer.MIN_VALUE;
    d B = new d();
    private int C = 2;
    private boolean D;
    private boolean E;
    private e F;
    private final Rect G = new Rect();
    private final b H = new b();
    private boolean I = false;
    private boolean J = true;
    private final Runnable K = new a();

    /* renamed from: q  reason: collision with root package name */
    private int f2904q = -1;

    /* renamed from: r  reason: collision with root package name */
    f[] f2905r;

    /* renamed from: s  reason: collision with root package name */
    h f2906s;

    /* renamed from: t  reason: collision with root package name */
    h f2907t;

    /* renamed from: u  reason: collision with root package name */
    private int f2908u;

    /* renamed from: v  reason: collision with root package name */
    private final f f2909v;

    /* renamed from: w  reason: collision with root package name */
    boolean f2910w = false;

    /* renamed from: x  reason: collision with root package name */
    boolean f2911x = false;

    /* renamed from: y  reason: collision with root package name */
    private BitSet f2912y;

    /* renamed from: z  reason: collision with root package name */
    int f2913z = -1;

    class a implements Runnable {
        a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.I0();
        }
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        int f2915a;

        /* renamed from: b  reason: collision with root package name */
        int f2916b;

        /* renamed from: c  reason: collision with root package name */
        boolean f2917c;

        /* renamed from: d  reason: collision with root package name */
        boolean f2918d;

        /* renamed from: e  reason: collision with root package name */
        boolean f2919e;

        /* renamed from: f  reason: collision with root package name */
        int[] f2920f;

        b() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f2915a = -1;
            this.f2916b = Integer.MIN_VALUE;
            this.f2917c = false;
            this.f2918d = false;
            this.f2919e = false;
            int[] iArr = this.f2920f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends i.o {

        /* renamed from: e  reason: collision with root package name */
        f f2922e;

        /* renamed from: f  reason: collision with root package name */
        boolean f2923f;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int b() {
            f fVar = this.f2922e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f2944e;
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        int[] f2924a;

        /* renamed from: b  reason: collision with root package name */
        List<a> f2925b;

        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0057a();

            /* renamed from: m  reason: collision with root package name */
            int f2926m;

            /* renamed from: n  reason: collision with root package name */
            int f2927n;

            /* renamed from: o  reason: collision with root package name */
            int[] f2928o;

            /* renamed from: p  reason: collision with root package name */
            boolean f2929p;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            static class C0057a implements Parcelable.Creator<a> {
                C0057a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f2926m = parcel.readInt();
                this.f2927n = parcel.readInt();
                this.f2929p = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2928o = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            public int a(int i10) {
                int[] iArr = this.f2928o;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f2926m + ", mGapDir=" + this.f2927n + ", mHasUnwantedGapAfter=" + this.f2929p + ", mGapPerSpan=" + Arrays.toString(this.f2928o) + '}';
            }

            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f2926m);
                parcel.writeInt(this.f2927n);
                parcel.writeInt(this.f2929p ? 1 : 0);
                int[] iArr = this.f2928o;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2928o);
            }
        }

        d() {
        }

        private int g(int i10) {
            if (this.f2925b == null) {
                return -1;
            }
            a e10 = e(i10);
            if (e10 != null) {
                this.f2925b.remove(e10);
            }
            int size = this.f2925b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (this.f2925b.get(i11).f2926m >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return -1;
            }
            this.f2925b.remove(i11);
            return this.f2925b.get(i11).f2926m;
        }

        private void j(int i10, int i11) {
            List<a> list = this.f2925b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f2925b.get(size);
                    int i12 = aVar.f2926m;
                    if (i12 >= i10) {
                        aVar.f2926m = i12 + i11;
                    }
                }
            }
        }

        private void k(int i10, int i11) {
            List<a> list = this.f2925b;
            if (list != null) {
                int i12 = i10 + i11;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = this.f2925b.get(size);
                    int i13 = aVar.f2926m;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            this.f2925b.remove(size);
                        } else {
                            aVar.f2926m = i13 - i11;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f2924a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2925b = null;
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            int[] iArr = this.f2924a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f2924a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[l(i10)];
                this.f2924a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2924a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        public int c(int i10) {
            List<a> list = this.f2925b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f2925b.get(size).f2926m >= i10) {
                        this.f2925b.remove(size);
                    }
                }
            }
            return f(i10);
        }

        public a d(int i10, int i11, int i12, boolean z9) {
            List<a> list = this.f2925b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f2925b.get(i13);
                int i14 = aVar.f2926m;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f2927n == i12 || (z9 && aVar.f2929p))) {
                    return aVar;
                }
            }
            return null;
        }

        public a e(int i10) {
            List<a> list = this.f2925b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2925b.get(size);
                if (aVar.f2926m == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public int f(int i10) {
            int[] iArr = this.f2924a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int g10 = g(i10);
            if (g10 == -1) {
                int[] iArr2 = this.f2924a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f2924a.length;
            }
            int i11 = g10 + 1;
            Arrays.fill(this.f2924a, i10, i11, -1);
            return i11;
        }

        /* access modifiers changed from: package-private */
        public void h(int i10, int i11) {
            int[] iArr = this.f2924a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f2924a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f2924a, i10, i12, -1);
                j(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public void i(int i10, int i11) {
            int[] iArr = this.f2924a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                b(i12);
                int[] iArr2 = this.f2924a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f2924a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                k(i10, i11);
            }
        }

        /* access modifiers changed from: package-private */
        public int l(int i10) {
            int length = this.f2924a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: m  reason: collision with root package name */
        int f2930m;

        /* renamed from: n  reason: collision with root package name */
        int f2931n;

        /* renamed from: o  reason: collision with root package name */
        int f2932o;

        /* renamed from: p  reason: collision with root package name */
        int[] f2933p;

        /* renamed from: q  reason: collision with root package name */
        int f2934q;

        /* renamed from: r  reason: collision with root package name */
        int[] f2935r;

        /* renamed from: s  reason: collision with root package name */
        List<d.a> f2936s;

        /* renamed from: t  reason: collision with root package name */
        boolean f2937t;

        /* renamed from: u  reason: collision with root package name */
        boolean f2938u;

        /* renamed from: v  reason: collision with root package name */
        boolean f2939v;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f2930m = parcel.readInt();
            this.f2931n = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2932o = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2933p = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2934q = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2935r = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z9 = false;
            this.f2937t = parcel.readInt() == 1;
            this.f2938u = parcel.readInt() == 1;
            this.f2939v = parcel.readInt() == 1 ? true : z9;
            this.f2936s = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2932o = eVar.f2932o;
            this.f2930m = eVar.f2930m;
            this.f2931n = eVar.f2931n;
            this.f2933p = eVar.f2933p;
            this.f2934q = eVar.f2934q;
            this.f2935r = eVar.f2935r;
            this.f2937t = eVar.f2937t;
            this.f2938u = eVar.f2938u;
            this.f2939v = eVar.f2939v;
            this.f2936s = eVar.f2936s;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2930m);
            parcel.writeInt(this.f2931n);
            parcel.writeInt(this.f2932o);
            if (this.f2932o > 0) {
                parcel.writeIntArray(this.f2933p);
            }
            parcel.writeInt(this.f2934q);
            if (this.f2934q > 0) {
                parcel.writeIntArray(this.f2935r);
            }
            parcel.writeInt(this.f2937t ? 1 : 0);
            parcel.writeInt(this.f2938u ? 1 : 0);
            parcel.writeInt(this.f2939v ? 1 : 0);
            parcel.writeList(this.f2936s);
        }
    }

    class f {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<View> f2940a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        int f2941b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        int f2942c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        int f2943d = 0;

        /* renamed from: e  reason: collision with root package name */
        final int f2944e;

        f(int i10) {
            this.f2944e = i10;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            d.a e10;
            ArrayList<View> arrayList = this.f2940a;
            View view = arrayList.get(arrayList.size() - 1);
            c f10 = f(view);
            this.f2942c = StaggeredGridLayoutManager.this.f2906s.d(view);
            if (f10.f2923f && (e10 = StaggeredGridLayoutManager.this.B.e(f10.a())) != null && e10.f2927n == 1) {
                this.f2942c += e10.a(this.f2944e);
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            d.a e10;
            View view = this.f2940a.get(0);
            c f10 = f(view);
            this.f2941b = StaggeredGridLayoutManager.this.f2906s.e(view);
            if (f10.f2923f && (e10 = StaggeredGridLayoutManager.this.B.e(f10.a())) != null && e10.f2927n == -1) {
                this.f2941b -= e10.a(this.f2944e);
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f2940a.clear();
            i();
            this.f2943d = 0;
        }

        /* access modifiers changed from: package-private */
        public int d() {
            int i10 = this.f2942c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            a();
            return this.f2942c;
        }

        /* access modifiers changed from: package-private */
        public int e(int i10) {
            int i11 = this.f2942c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2940a.size() == 0) {
                return i10;
            }
            a();
            return this.f2942c;
        }

        /* access modifiers changed from: package-private */
        public c f(View view) {
            return (c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int g() {
            int i10 = this.f2941b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            b();
            return this.f2941b;
        }

        /* access modifiers changed from: package-private */
        public int h(int i10) {
            int i11 = this.f2941b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2940a.size() == 0) {
                return i10;
            }
            b();
            return this.f2941b;
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.f2941b = Integer.MIN_VALUE;
            this.f2942c = Integer.MIN_VALUE;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        i.n.c J2 = i.n.J(context, attributeSet, i10, i11);
        X0(J2.f3170a);
        Z0(J2.f3171b);
        Y0(J2.f3172c);
        this.f2909v = new f();
        N0();
    }

    private boolean J0(f fVar) {
        if (this.f2911x) {
            if (fVar.d() < this.f2906s.f()) {
                ArrayList<View> arrayList = fVar.f2940a;
                return !fVar.f(arrayList.get(arrayList.size() - 1)).f2923f;
            }
        } else if (fVar.g() > this.f2906s.g()) {
            return !fVar.f(fVar.f2940a.get(0)).f2923f;
        }
        return false;
    }

    private int K0(i.y yVar) {
        if (t() == 0) {
            return 0;
        }
        return k.a(yVar, this.f2906s, P0(!this.J), O0(!this.J), this, this.J);
    }

    private int L0(i.y yVar) {
        if (t() == 0) {
            return 0;
        }
        return k.b(yVar, this.f2906s, P0(!this.J), O0(!this.J), this, this.J, this.f2911x);
    }

    private int M0(i.y yVar) {
        if (t() == 0) {
            return 0;
        }
        return k.c(yVar, this.f2906s, P0(!this.J), O0(!this.J), this, this.J);
    }

    private void N0() {
        this.f2906s = h.b(this, this.f2908u);
        this.f2907t = h.b(this, 1 - this.f2908u);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void T0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f2911x
            if (r0 == 0) goto L_0x0009
            int r0 = r6.S0()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.R0()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.B
            r4.f(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.i(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.B
            r7.h(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.i(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.h(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f2911x
            if (r7 == 0) goto L_0x004d
            int r7 = r6.R0()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.S0()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.D0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T0(int, int, int):void");
    }

    public boolean H0() {
        return this.F == null;
    }

    /* access modifiers changed from: package-private */
    public boolean I0() {
        int i10;
        int i11;
        if (t() == 0 || this.C == 0 || !P()) {
            return false;
        }
        if (this.f2911x) {
            i11 = S0();
            i10 = R0();
        } else {
            i11 = R0();
            i10 = S0();
        }
        if (i11 == 0 && U0() != null) {
            this.B.a();
        } else if (!this.I) {
            return false;
        } else {
            int i12 = this.f2911x ? -1 : 1;
            int i13 = i10 + 1;
            d.a d10 = this.B.d(i11, i13, i12, true);
            if (d10 == null) {
                this.I = false;
                this.B.c(i13);
                return false;
            }
            d.a d11 = this.B.d(i11, d10.f2926m, i12 * -1, true);
            if (d11 == null) {
                this.B.c(d10.f2926m);
            } else {
                this.B.c(d11.f2926m + 1);
            }
        }
        E0();
        D0();
        return true;
    }

    public int L(i.u uVar, i.y yVar) {
        return this.f2908u == 0 ? this.f2904q : super.L(uVar, yVar);
    }

    /* access modifiers changed from: package-private */
    public View O0(boolean z9) {
        int g10 = this.f2906s.g();
        int f10 = this.f2906s.f();
        View view = null;
        for (int t9 = t() - 1; t9 >= 0; t9--) {
            View s9 = s(t9);
            int e10 = this.f2906s.e(s9);
            int d10 = this.f2906s.d(s9);
            if (d10 > g10 && e10 < f10) {
                if (d10 <= f10 || !z9) {
                    return s9;
                }
                if (view == null) {
                    view = s9;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public View P0(boolean z9) {
        int g10 = this.f2906s.g();
        int f10 = this.f2906s.f();
        int t9 = t();
        View view = null;
        for (int i10 = 0; i10 < t9; i10++) {
            View s9 = s(i10);
            int e10 = this.f2906s.e(s9);
            if (this.f2906s.d(s9) > g10 && e10 < f10) {
                if (e10 >= g10 || !z9) {
                    return s9;
                }
                if (view == null) {
                    view = s9;
                }
            }
        }
        return view;
    }

    public boolean Q() {
        return this.C != 0;
    }

    /* access modifiers changed from: package-private */
    public int Q0() {
        View O0 = this.f2911x ? O0(true) : P0(true);
        if (O0 == null) {
            return -1;
        }
        return I(O0);
    }

    /* access modifiers changed from: package-private */
    public int R0() {
        if (t() == 0) {
            return 0;
        }
        return I(s(0));
    }

    /* access modifiers changed from: package-private */
    public int S0() {
        int t9 = t();
        if (t9 == 0) {
            return 0;
        }
        return I(s(t9 - 1));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View U0() {
        /*
            r12 = this;
            int r0 = r12.t()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2904q
            r2.<init>(r3)
            int r3 = r12.f2904q
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2908u
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.W0()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f2911x
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.s(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2922e
            int r9 = r9.f2944e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2922e
            boolean r9 = r12.J0(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2922e
            int r9 = r9.f2944e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f2923f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.s(r9)
            boolean r10 = r12.f2911x
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.h r10 = r12.f2906s
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.h r11 = r12.f2906s
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.h r10 = r12.f2906s
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.h r11 = r12.f2906s
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2922e
            int r8 = r8.f2944e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2922e
            int r9 = r9.f2944e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.U0():android.view.View");
    }

    public void V0() {
        this.B.a();
        D0();
    }

    /* access modifiers changed from: package-private */
    public boolean W0() {
        return C() == 1;
    }

    public void X0(int i10) {
        if (i10 == 0 || i10 == 1) {
            a((String) null);
            if (i10 != this.f2908u) {
                this.f2908u = i10;
                h hVar = this.f2906s;
                this.f2906s = this.f2907t;
                this.f2907t = hVar;
                D0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void Y(i iVar, i.u uVar) {
        super.Y(iVar, uVar);
        z0(this.K);
        for (int i10 = 0; i10 < this.f2904q; i10++) {
            this.f2905r[i10].c();
        }
        iVar.requestLayout();
    }

    public void Y0(boolean z9) {
        a((String) null);
        e eVar = this.F;
        if (!(eVar == null || eVar.f2937t == z9)) {
            eVar.f2937t = z9;
        }
        this.f2910w = z9;
        D0();
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        super.Z(accessibilityEvent);
        if (t() > 0) {
            View P0 = P0(false);
            View O0 = O0(false);
            if (P0 != null && O0 != null) {
                int I2 = I(P0);
                int I3 = I(O0);
                if (I2 < I3) {
                    accessibilityEvent.setFromIndex(I2);
                    accessibilityEvent.setToIndex(I3);
                    return;
                }
                accessibilityEvent.setFromIndex(I3);
                accessibilityEvent.setToIndex(I2);
            }
        }
    }

    public void Z0(int i10) {
        a((String) null);
        if (i10 != this.f2904q) {
            V0();
            this.f2904q = i10;
            this.f2912y = new BitSet(this.f2904q);
            this.f2905r = new f[this.f2904q];
            for (int i11 = 0; i11 < this.f2904q; i11++) {
                this.f2905r[i11] = new f(i11);
            }
            D0();
        }
    }

    public void a(String str) {
        if (this.F == null) {
            super.a(str);
        }
    }

    public boolean b() {
        return this.f2908u == 0;
    }

    public boolean c() {
        return this.f2908u == 1;
    }

    public boolean d(i.o oVar) {
        return oVar instanceof c;
    }

    public void e0(i.u uVar, i.y yVar, View view, androidx.core.view.accessibility.d dVar) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.d0(view, dVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f2908u == 0) {
            i13 = cVar.b();
            z9 = cVar.f2923f;
            i12 = z9 ? this.f2904q : 1;
            i11 = -1;
            i10 = -1;
        } else {
            i13 = -1;
            i12 = -1;
            i11 = cVar.b();
            z9 = cVar.f2923f;
            i10 = z9 ? this.f2904q : 1;
        }
        dVar.N(d.C0033d.a(i13, i12, i11, i10, z9, false));
    }

    public int f(i.y yVar) {
        return K0(yVar);
    }

    public int g(i.y yVar) {
        return L0(yVar);
    }

    public void g0(i iVar, int i10, int i11) {
        T0(i10, i11, 1);
    }

    public int h(i.y yVar) {
        return M0(yVar);
    }

    public void h0(i iVar) {
        this.B.a();
        D0();
    }

    public int i(i.y yVar) {
        return K0(yVar);
    }

    public void i0(i iVar, int i10, int i11, int i12) {
        T0(i10, i11, 8);
    }

    public int j(i.y yVar) {
        return L0(yVar);
    }

    public void j0(i iVar, int i10, int i11) {
        T0(i10, i11, 2);
    }

    public int k(i.y yVar) {
        return M0(yVar);
    }

    public void l0(i iVar, int i10, int i11, Object obj) {
        T0(i10, i11, 4);
    }

    public i.o n() {
        return this.f2908u == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public i.o o(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public i.o p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void p0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.F = (e) parcelable;
            D0();
        }
    }

    public Parcelable q0() {
        int i10;
        int i11;
        int[] iArr;
        if (this.F != null) {
            return new e(this.F);
        }
        e eVar = new e();
        eVar.f2937t = this.f2910w;
        eVar.f2938u = this.D;
        eVar.f2939v = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.f2924a) == null) {
            eVar.f2934q = 0;
        } else {
            eVar.f2935r = iArr;
            eVar.f2934q = iArr.length;
            eVar.f2936s = dVar.f2925b;
        }
        if (t() > 0) {
            eVar.f2930m = this.D ? S0() : R0();
            eVar.f2931n = Q0();
            int i12 = this.f2904q;
            eVar.f2932o = i12;
            eVar.f2933p = new int[i12];
            for (int i13 = 0; i13 < this.f2904q; i13++) {
                if (this.D) {
                    i10 = this.f2905r[i13].e(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = this.f2906s.f();
                    } else {
                        eVar.f2933p[i13] = i10;
                    }
                } else {
                    i10 = this.f2905r[i13].h(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = this.f2906s.g();
                    } else {
                        eVar.f2933p[i13] = i10;
                    }
                }
                i10 -= i11;
                eVar.f2933p[i13] = i10;
            }
        } else {
            eVar.f2930m = -1;
            eVar.f2931n = -1;
            eVar.f2932o = 0;
        }
        return eVar;
    }

    public void r0(int i10) {
        if (i10 == 0) {
            I0();
        }
    }

    public int v(i.u uVar, i.y yVar) {
        return this.f2908u == 1 ? this.f2904q : super.v(uVar, yVar);
    }
}
