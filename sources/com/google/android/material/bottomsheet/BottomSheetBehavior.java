package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x;
import e3.i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import x.a;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public boolean f6910a = true;

    /* renamed from: b  reason: collision with root package name */
    private float f6911b;

    /* renamed from: c  reason: collision with root package name */
    private int f6912c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6913d;

    /* renamed from: e  reason: collision with root package name */
    private int f6914e;

    /* renamed from: f  reason: collision with root package name */
    private int f6915f;

    /* renamed from: g  reason: collision with root package name */
    int f6916g;

    /* renamed from: h  reason: collision with root package name */
    int f6917h;

    /* renamed from: i  reason: collision with root package name */
    int f6918i;

    /* renamed from: j  reason: collision with root package name */
    boolean f6919j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6920k;

    /* renamed from: l  reason: collision with root package name */
    int f6921l = 4;

    /* renamed from: m  reason: collision with root package name */
    x.a f6922m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f6923n;

    /* renamed from: o  reason: collision with root package name */
    private int f6924o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6925p;

    /* renamed from: q  reason: collision with root package name */
    int f6926q;

    /* renamed from: r  reason: collision with root package name */
    WeakReference<V> f6927r;

    /* renamed from: s  reason: collision with root package name */
    WeakReference<View> f6928s;

    /* renamed from: t  reason: collision with root package name */
    private VelocityTracker f6929t;

    /* renamed from: u  reason: collision with root package name */
    int f6930u;

    /* renamed from: v  reason: collision with root package name */
    private int f6931v;

    /* renamed from: w  reason: collision with root package name */
    boolean f6932w;

    /* renamed from: x  reason: collision with root package name */
    private Map<View, Integer> f6933x;

    /* renamed from: y  reason: collision with root package name */
    private final a.c f6934y = new a();

    class a extends a.c {
        a() {
        }

        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        public int b(View view, int i10, int i11) {
            int E = BottomSheetBehavior.this.I();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return t.a.b(i10, E, bottomSheetBehavior.f6919j ? bottomSheetBehavior.f6926q : bottomSheetBehavior.f6918i);
        }

        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f6919j ? bottomSheetBehavior.f6926q : bottomSheetBehavior.f6918i;
        }

        public void j(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior.this.P(1);
            }
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.G(i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a0, code lost:
            if (r9 < java.lang.Math.abs(r9 - r10.f6918i)) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
            if (java.lang.Math.abs(r9 - r1) < java.lang.Math.abs(r9 - r7.f6935a.f6918i)) goto L_0x00b4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0029
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f6910a
                if (r9 == 0) goto L_0x0018
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f6916g
                r2 = 3
                goto L_0x00ba
            L_0x0018:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f6917h
                if (r9 <= r10) goto L_0x0025
                r0 = r10
            L_0x0023:
                r2 = 6
                goto L_0x0026
            L_0x0025:
                r2 = 3
            L_0x0026:
                r9 = r0
                goto L_0x00ba
            L_0x0029:
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r5.f6919j
                if (r6 == 0) goto L_0x0051
                boolean r5 = r5.Q(r8, r10)
                if (r5 == 0) goto L_0x0051
                int r5 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r6.f6918i
                if (r5 > r6) goto L_0x004b
                float r5 = java.lang.Math.abs(r9)
                float r6 = java.lang.Math.abs(r10)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x0051
            L_0x004b:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f6926q
                r2 = 5
                goto L_0x00ba
            L_0x0051:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0067
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0062
                goto L_0x0067
            L_0x0062:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f6918i
                goto L_0x00ba
            L_0x0067:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f6910a
                if (r10 == 0) goto L_0x0092
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f6916g
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f6918i
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008d
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f6916g
                goto L_0x0025
            L_0x008d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f6918i
                goto L_0x0026
            L_0x0092:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r10.f6917h
                if (r9 >= r1) goto L_0x00a3
                int r10 = r10.f6918i
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00b4
                goto L_0x0025
            L_0x00a3:
                int r10 = r9 - r1
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f6918i
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008d
            L_0x00b4:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f6917h
                goto L_0x0023
            L_0x00ba:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                x.a r10 = r10.f6922m
                int r0 = r8.getLeft()
                boolean r9 = r10.F(r0, r9)
                if (r9 == 0) goto L_0x00d9
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r10 = 2
                r9.P(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior$c r9 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r9.<init>(r8, r2)
                androidx.core.view.x.b0(r8, r9)
                goto L_0x00de
            L_0x00d9:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r8.P(r2)
            L_0x00de:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a.l(android.view.View, float, float):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
            r7 = (android.view.View) r0.f6928s.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
            r7 = r5.f6935a.f6927r;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean m(android.view.View r6, int r7) {
            /*
                r5 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r0.f6921l
                r2 = 1
                r3 = 0
                if (r1 != r2) goto L_0x0009
                return r3
            L_0x0009:
                boolean r4 = r0.f6932w
                if (r4 == 0) goto L_0x000e
                return r3
            L_0x000e:
                r4 = 3
                if (r1 != r4) goto L_0x0027
                int r1 = r0.f6930u
                if (r1 != r7) goto L_0x0027
                java.lang.ref.WeakReference<android.view.View> r7 = r0.f6928s
                java.lang.Object r7 = r7.get()
                android.view.View r7 = (android.view.View) r7
                if (r7 == 0) goto L_0x0027
                r0 = -1
                boolean r7 = r7.canScrollVertically(r0)
                if (r7 == 0) goto L_0x0027
                return r3
            L_0x0027:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.lang.ref.WeakReference<V> r7 = r7.f6927r
                if (r7 == 0) goto L_0x0034
                java.lang.Object r7 = r7.get()
                if (r7 != r6) goto L_0x0034
                goto L_0x0035
            L_0x0034:
                r2 = 0
            L_0x0035:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a.m(android.view.View, int):boolean");
        }
    }

    protected static class b extends w.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        final int f6936o;

        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            /* renamed from: c */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6936o = parcel.readInt();
        }

        public b(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f6936o = i10;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6936o);
        }
    }

    private class c implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private final View f6937m;

        /* renamed from: n  reason: collision with root package name */
        private final int f6938n;

        c(View view, int i10) {
            this.f6937m = view;
            this.f6938n = i10;
        }

        public void run() {
            x.a aVar = BottomSheetBehavior.this.f6922m;
            if (aVar == null || !aVar.k(true)) {
                BottomSheetBehavior.this.P(this.f6938n);
            } else {
                x.b0(this.f6937m, this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f8421s);
        int i11 = i.f8427v;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i11);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            N(obtainStyledAttributes.getDimensionPixelSize(i11, -1));
        } else {
            N(i10);
        }
        M(obtainStyledAttributes.getBoolean(i.f8425u, false));
        L(obtainStyledAttributes.getBoolean(i.f8423t, true));
        O(obtainStyledAttributes.getBoolean(i.f8429w, false));
        obtainStyledAttributes.recycle();
        this.f6911b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void F() {
        this.f6918i = this.f6910a ? Math.max(this.f6926q - this.f6915f, this.f6916g) : this.f6926q - this.f6915f;
    }

    /* access modifiers changed from: private */
    public int I() {
        if (this.f6910a) {
            return this.f6916g;
        }
        return 0;
    }

    private float J() {
        VelocityTracker velocityTracker = this.f6929t;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f6911b);
        return this.f6929t.getYVelocity(this.f6930u);
    }

    private void K() {
        this.f6930u = -1;
        VelocityTracker velocityTracker = this.f6929t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f6929t = null;
        }
    }

    private void R(boolean z9) {
        int i10;
        WeakReference<V> weakReference = this.f6927r;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z9) {
                    if (this.f6933x == null) {
                        this.f6933x = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = coordinatorLayout.getChildAt(i11);
                    if (childAt != this.f6927r.get()) {
                        Map<View, Integer> map = this.f6933x;
                        if (z9) {
                            map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            i10 = 4;
                        } else if (map != null && map.containsKey(childAt)) {
                            i10 = this.f6933x.get(childAt).intValue();
                        }
                        x.q0(childAt, i10);
                    }
                }
                if (!z9) {
                    this.f6933x = null;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.f6918i)) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.I()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.P(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f6928s
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x009f
            boolean r4 = r3.f6925p
            if (r4 != 0) goto L_0x001d
            goto L_0x009f
        L_0x001d:
            int r4 = r3.f6924o
            r6 = 0
            r7 = 4
            if (r4 <= 0) goto L_0x0028
            int r4 = r3.I()
            goto L_0x0081
        L_0x0028:
            boolean r4 = r3.f6919j
            if (r4 == 0) goto L_0x003a
            float r4 = r3.J()
            boolean r4 = r3.Q(r5, r4)
            if (r4 == 0) goto L_0x003a
            int r4 = r3.f6926q
            r0 = 5
            goto L_0x0081
        L_0x003a:
            int r4 = r3.f6924o
            if (r4 != 0) goto L_0x007e
            int r4 = r5.getTop()
            boolean r1 = r3.f6910a
            r2 = 6
            if (r1 == 0) goto L_0x005b
            int r1 = r3.f6916g
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f6918i
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r1 >= r4) goto L_0x007e
            int r4 = r3.f6916g
            goto L_0x0081
        L_0x005b:
            int r1 = r3.f6917h
            if (r4 >= r1) goto L_0x006b
            int r7 = r3.f6918i
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r4 >= r7) goto L_0x007a
            r4 = 0
            goto L_0x0081
        L_0x006b:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f6918i
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x007e
        L_0x007a:
            int r4 = r3.f6917h
            r0 = 6
            goto L_0x0081
        L_0x007e:
            int r4 = r3.f6918i
            r0 = 4
        L_0x0081:
            x.a r7 = r3.f6922m
            int r1 = r5.getLeft()
            boolean r4 = r7.H(r5, r1, r4)
            if (r4 == 0) goto L_0x009a
            r4 = 2
            r3.P(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
            r4.<init>(r5, r0)
            androidx.core.view.x.b0(r5, r4)
            goto L_0x009d
        L_0x009a:
            r3.P(r0)
        L_0x009d:
            r3.f6925p = r6
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.B(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public boolean C(CoordinatorLayout coordinatorLayout, V v9, MotionEvent motionEvent) {
        if (!v9.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6921l == 1 && actionMasked == 0) {
            return true;
        }
        x.a aVar = this.f6922m;
        if (aVar != null) {
            aVar.z(motionEvent);
        }
        if (actionMasked == 0) {
            K();
        }
        if (this.f6929t == null) {
            this.f6929t = VelocityTracker.obtain();
        }
        this.f6929t.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f6923n && Math.abs(((float) this.f6931v) - motionEvent.getY()) > ((float) this.f6922m.u())) {
            this.f6922m.b(v9, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f6923n;
    }

    /* access modifiers changed from: package-private */
    public void G(int i10) {
        View view = (View) this.f6927r.get();
    }

    /* access modifiers changed from: package-private */
    public View H(View view) {
        if (x.Q(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View H = H(viewGroup.getChildAt(i10));
            if (H != null) {
                return H;
            }
        }
        return null;
    }

    public void L(boolean z9) {
        if (this.f6910a != z9) {
            this.f6910a = z9;
            if (this.f6927r != null) {
                F();
            }
            P((!this.f6910a || this.f6921l != 6) ? this.f6921l : 3);
        }
    }

    public void M(boolean z9) {
        this.f6919j = z9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f6913d
            if (r4 != 0) goto L_0x0015
            r3.f6913d = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f6913d
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f6912c
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f6913d = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f6912c = r1
            int r1 = r3.f6926q
            int r1 = r1 - r4
            r3.f6918i = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f6921l
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f6927r
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.N(int):void");
    }

    public void O(boolean z9) {
        this.f6920k = z9;
    }

    /* access modifiers changed from: package-private */
    public void P(int i10) {
        boolean z9;
        if (this.f6921l != i10) {
            this.f6921l = i10;
            if (i10 == 6 || i10 == 3) {
                z9 = true;
            } else {
                if (i10 == 5 || i10 == 4) {
                    z9 = false;
                }
                View view = (View) this.f6927r.get();
            }
            R(z9);
            View view2 = (View) this.f6927r.get();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Q(View view, float f10) {
        if (this.f6920k) {
            return true;
        }
        return view.getTop() >= this.f6918i && Math.abs((((float) view.getTop()) + (f10 * 0.1f)) - ((float) this.f6918i)) / ((float) this.f6912c) > 0.5f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r9, V r10, android.view.MotionEvent r11) {
        /*
            r8 = this;
            boolean r0 = r10.isShown()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000b
            r8.f6923n = r2
            return r1
        L_0x000b:
            int r0 = r11.getActionMasked()
            if (r0 != 0) goto L_0x0014
            r8.K()
        L_0x0014:
            android.view.VelocityTracker r3 = r8.f6929t
            if (r3 != 0) goto L_0x001e
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r8.f6929t = r3
        L_0x001e:
            android.view.VelocityTracker r3 = r8.f6929t
            r3.addMovement(r11)
            r3 = 0
            r4 = -1
            if (r0 == 0) goto L_0x0038
            if (r0 == r2) goto L_0x002d
            r10 = 3
            if (r0 == r10) goto L_0x002d
            goto L_0x0077
        L_0x002d:
            r8.f6932w = r1
            r8.f6930u = r4
            boolean r10 = r8.f6923n
            if (r10 == 0) goto L_0x0077
            r8.f6923n = r1
            return r1
        L_0x0038:
            float r5 = r11.getX()
            int r5 = (int) r5
            float r6 = r11.getY()
            int r6 = (int) r6
            r8.f6931v = r6
            java.lang.ref.WeakReference<android.view.View> r6 = r8.f6928s
            if (r6 == 0) goto L_0x004f
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L_0x0050
        L_0x004f:
            r6 = r3
        L_0x0050:
            if (r6 == 0) goto L_0x0066
            int r7 = r8.f6931v
            boolean r6 = r9.B(r6, r5, r7)
            if (r6 == 0) goto L_0x0066
            int r6 = r11.getActionIndex()
            int r6 = r11.getPointerId(r6)
            r8.f6930u = r6
            r8.f6932w = r2
        L_0x0066:
            int r6 = r8.f6930u
            if (r6 != r4) goto L_0x0074
            int r4 = r8.f6931v
            boolean r10 = r9.B(r10, r5, r4)
            if (r10 != 0) goto L_0x0074
            r10 = 1
            goto L_0x0075
        L_0x0074:
            r10 = 0
        L_0x0075:
            r8.f6923n = r10
        L_0x0077:
            boolean r10 = r8.f6923n
            if (r10 != 0) goto L_0x0086
            x.a r10 = r8.f6922m
            if (r10 == 0) goto L_0x0086
            boolean r10 = r10.G(r11)
            if (r10 == 0) goto L_0x0086
            return r2
        L_0x0086:
            java.lang.ref.WeakReference<android.view.View> r10 = r8.f6928s
            if (r10 == 0) goto L_0x0091
            java.lang.Object r10 = r10.get()
            r3 = r10
            android.view.View r3 = (android.view.View) r3
        L_0x0091:
            r10 = 2
            if (r0 != r10) goto L_0x00ca
            if (r3 == 0) goto L_0x00ca
            boolean r10 = r8.f6923n
            if (r10 != 0) goto L_0x00ca
            int r10 = r8.f6921l
            if (r10 == r2) goto L_0x00ca
            float r10 = r11.getX()
            int r10 = (int) r10
            float r0 = r11.getY()
            int r0 = (int) r0
            boolean r9 = r9.B(r3, r10, r0)
            if (r9 != 0) goto L_0x00ca
            x.a r9 = r8.f6922m
            if (r9 == 0) goto L_0x00ca
            int r9 = r8.f6931v
            float r9 = (float) r9
            float r10 = r11.getY()
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            x.a r10 = r8.f6922m
            int r10 = r10.u()
            float r10 = (float) r10
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ca
            r1 = 1
        L_0x00ca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.k(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, int r7) {
        /*
            r4 = this;
            boolean r0 = androidx.core.view.x.w(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = androidx.core.view.x.w(r6)
            if (r0 != 0) goto L_0x0010
            r6.setFitsSystemWindows(r1)
        L_0x0010:
            int r0 = r6.getTop()
            r5.I(r6, r7)
            int r7 = r5.getHeight()
            r4.f6926q = r7
            boolean r7 = r4.f6913d
            if (r7 == 0) goto L_0x0043
            int r7 = r4.f6914e
            if (r7 != 0) goto L_0x0031
            android.content.res.Resources r7 = r5.getResources()
            int r2 = e3.c.design_bottom_sheet_peek_height_min
            int r7 = r7.getDimensionPixelSize(r2)
            r4.f6914e = r7
        L_0x0031:
            int r7 = r4.f6914e
            int r2 = r4.f6926q
            int r3 = r5.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            goto L_0x0045
        L_0x0043:
            int r7 = r4.f6912c
        L_0x0045:
            r4.f6915f = r7
            r7 = 0
            int r2 = r4.f6926q
            int r3 = r6.getHeight()
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            r4.f6916g = r7
            int r7 = r4.f6926q
            r2 = 2
            int r7 = r7 / r2
            r4.f6917h = r7
            r4.F()
            int r7 = r4.f6921l
            r3 = 3
            if (r7 != r3) goto L_0x006b
            int r7 = r4.I()
        L_0x0067:
            androidx.core.view.x.W(r6, r7)
            goto L_0x008d
        L_0x006b:
            r3 = 6
            if (r7 != r3) goto L_0x0071
            int r7 = r4.f6917h
            goto L_0x0067
        L_0x0071:
            boolean r3 = r4.f6919j
            if (r3 == 0) goto L_0x007b
            r3 = 5
            if (r7 != r3) goto L_0x007b
            int r7 = r4.f6926q
            goto L_0x0067
        L_0x007b:
            r3 = 4
            if (r7 != r3) goto L_0x0081
            int r7 = r4.f6918i
            goto L_0x0067
        L_0x0081:
            if (r7 == r1) goto L_0x0085
            if (r7 != r2) goto L_0x008d
        L_0x0085:
            int r7 = r6.getTop()
            int r0 = r0 - r7
            androidx.core.view.x.W(r6, r0)
        L_0x008d:
            x.a r7 = r4.f6922m
            if (r7 != 0) goto L_0x0099
            x.a$c r7 = r4.f6934y
            x.a r5 = x.a.m(r5, r7)
            r4.f6922m = r5
        L_0x0099:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r6)
            r4.f6927r = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.view.View r6 = r4.H(r6)
            r5.<init>(r6)
            r4.f6928s = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public boolean o(CoordinatorLayout coordinatorLayout, V v9, View view, float f10, float f11) {
        return view == this.f6928s.get() && (this.f6921l != 3 || super.o(coordinatorLayout, v9, view, f10, f11));
    }

    public void q(CoordinatorLayout coordinatorLayout, V v9, View view, int i10, int i11, int[] iArr, int i12) {
        int i13;
        if (i12 != 1 && view == ((View) this.f6928s.get())) {
            int top = v9.getTop();
            int i14 = top - i11;
            if (i11 <= 0) {
                if (i11 < 0 && !view.canScrollVertically(-1)) {
                    int i15 = this.f6918i;
                    if (i14 <= i15 || this.f6919j) {
                        iArr[1] = i11;
                        x.W(v9, -i11);
                        P(1);
                    } else {
                        iArr[1] = top - i15;
                        x.W(v9, -iArr[1]);
                        i13 = 4;
                    }
                }
                G(v9.getTop());
                this.f6924o = i11;
                this.f6925p = true;
            } else if (i14 < I()) {
                iArr[1] = top - I();
                x.W(v9, -iArr[1]);
                i13 = 3;
            } else {
                iArr[1] = i11;
                x.W(v9, -i11);
                P(1);
                G(v9.getTop());
                this.f6924o = i11;
                this.f6925p = true;
            }
            P(i13);
            G(v9.getTop());
            this.f6924o = i11;
            this.f6925p = true;
        }
    }

    public void w(CoordinatorLayout coordinatorLayout, V v9, Parcelable parcelable) {
        b bVar = (b) parcelable;
        super.w(coordinatorLayout, v9, bVar.a());
        int i10 = bVar.f6936o;
        if (i10 == 1 || i10 == 2) {
            i10 = 4;
        }
        this.f6921l = i10;
    }

    public Parcelable x(CoordinatorLayout coordinatorLayout, V v9) {
        return new b(super.x(coordinatorLayout, v9), this.f6921l);
    }

    public boolean z(CoordinatorLayout coordinatorLayout, V v9, View view, View view2, int i10, int i11) {
        this.f6924o = 0;
        this.f6925p = false;
        return (i10 & 2) != 0;
    }
}
