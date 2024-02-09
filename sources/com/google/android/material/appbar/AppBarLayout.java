package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.h0;
import androidx.core.view.n;
import androidx.core.view.x;
import e3.i;
import java.lang.ref.WeakReference;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class AppBarLayout extends LinearLayout {

    /* renamed from: m  reason: collision with root package name */
    private int f6822m;

    /* renamed from: n  reason: collision with root package name */
    private int f6823n;

    /* renamed from: o  reason: collision with root package name */
    private int f6824o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6825p;

    /* renamed from: q  reason: collision with root package name */
    private int f6826q;

    /* renamed from: r  reason: collision with root package name */
    private h0 f6827r;

    /* renamed from: s  reason: collision with root package name */
    private List<a> f6828s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f6829t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f6830u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6831v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f6832w;

    /* renamed from: x  reason: collision with root package name */
    private int[] f6833x;

    protected static class BaseBehavior<T extends AppBarLayout> extends a<T> {
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public int f6834k;

        /* renamed from: l  reason: collision with root package name */
        private int f6835l;

        /* renamed from: m  reason: collision with root package name */
        private ValueAnimator f6836m;

        /* renamed from: n  reason: collision with root package name */
        private int f6837n = -1;

        /* renamed from: o  reason: collision with root package name */
        private boolean f6838o;

        /* renamed from: p  reason: collision with root package name */
        private float f6839p;

        /* renamed from: q  reason: collision with root package name */
        private WeakReference<View> f6840q;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CoordinatorLayout f6841a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppBarLayout f6842b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f6841a = coordinatorLayout;
                this.f6842b = appBarLayout;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.O(this.f6841a, this.f6842b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        protected static class b extends w.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: o  reason: collision with root package name */
            int f6844o;

            /* renamed from: p  reason: collision with root package name */
            float f6845p;

            /* renamed from: q  reason: collision with root package name */
            boolean f6846q;

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
                this.f6844o = parcel.readInt();
                this.f6845p = parcel.readFloat();
                this.f6846q = parcel.readByte() != 0;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeInt(this.f6844o);
                parcel.writeFloat(this.f6845p);
                parcel.writeByte(this.f6846q ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private void R(CoordinatorLayout coordinatorLayout, T t9, int i10, float f10) {
            int abs = Math.abs(L() - i10);
            float abs2 = Math.abs(f10);
            S(coordinatorLayout, t9, i10, abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t9.getHeight())) + 1.0f) * 150.0f));
        }

        private void S(CoordinatorLayout coordinatorLayout, T t9, int i10, int i11) {
            int L = L();
            if (L == i10) {
                ValueAnimator valueAnimator = this.f6836m;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f6836m.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f6836m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f6836m = valueAnimator3;
                valueAnimator3.setInterpolator(f3.a.f8758e);
                this.f6836m.addUpdateListener(new a(coordinatorLayout, t9));
            } else {
                valueAnimator2.cancel();
            }
            this.f6836m.setDuration((long) Math.min(i11, 600));
            this.f6836m.setIntValues(new int[]{L, i10});
            this.f6836m.start();
        }

        private boolean U(CoordinatorLayout coordinatorLayout, T t9, View view) {
            return t9.g() && coordinatorLayout.getHeight() - view.getHeight() <= t9.getHeight();
        }

        private static boolean V(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        private View W(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt instanceof n) {
                    return childAt;
                }
            }
            return null;
        }

        private static View X(AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int Y(T t9, int i10) {
            int childCount = t9.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = t9.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                b bVar = (b) childAt.getLayoutParams();
                if (V(bVar.a(), 32)) {
                    top -= bVar.topMargin;
                    bottom += bVar.bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        private int b0(T t9, int i10) {
            int abs = Math.abs(i10);
            int childCount = t9.getChildCount();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt = t9.getChildAt(i12);
                b bVar = (b) childAt.getLayoutParams();
                Interpolator b10 = bVar.b();
                if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                    i12++;
                } else if (b10 != null) {
                    int a10 = bVar.a();
                    if ((a10 & 1) != 0) {
                        i11 = 0 + childAt.getHeight() + bVar.topMargin + bVar.bottomMargin;
                        if ((a10 & 2) != 0) {
                            i11 -= x.A(childAt);
                        }
                    }
                    if (x.w(childAt)) {
                        i11 -= t9.getTopInset();
                    }
                    if (i11 > 0) {
                        float f10 = (float) i11;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * b10.getInterpolation(((float) (abs - childAt.getTop())) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean m0(CoordinatorLayout coordinatorLayout, T t9) {
            List<View> s9 = coordinatorLayout.s(t9);
            int size = s9.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c f10 = ((CoordinatorLayout.f) s9.get(i10).getLayoutParams()).f();
                if (f10 instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) f10).J() != 0;
                }
            }
            return false;
        }

        private void n0(CoordinatorLayout coordinatorLayout, T t9) {
            int L = L();
            int Y = Y(t9, L);
            if (Y >= 0) {
                View childAt = t9.getChildAt(Y);
                b bVar = (b) childAt.getLayoutParams();
                int a10 = bVar.a();
                if ((a10 & 17) == 17) {
                    int i10 = -childAt.getTop();
                    int i11 = -childAt.getBottom();
                    if (Y == t9.getChildCount() - 1) {
                        i11 += t9.getTopInset();
                    }
                    if (V(a10, 2)) {
                        i11 += x.A(childAt);
                    } else if (V(a10, 5)) {
                        int A = x.A(childAt) + i11;
                        if (L < A) {
                            i10 = A;
                        } else {
                            i11 = A;
                        }
                    }
                    if (V(a10, 32)) {
                        i10 += bVar.topMargin;
                        i11 -= bVar.bottomMargin;
                    }
                    if (L < (i11 + i10) / 2) {
                        i10 = i11;
                    }
                    R(coordinatorLayout, t9, t.a.b(i10, -t9.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void o0(int i10, T t9, View view, int i11) {
            if (i11 == 1) {
                int L = L();
                if ((i10 < 0 && L == 0) || (i10 > 0 && L == (-t9.getDownNestedScrollRange()))) {
                    x.A0(view, 1);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void p0(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
            /*
                r5 = this;
                android.view.View r0 = X(r7, r8)
                if (r0 == 0) goto L_0x0068
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$b r1 = (com.google.android.material.appbar.AppBarLayout.b) r1
                int r1 = r1.a()
                r2 = r1 & 1
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0041
                int r2 = androidx.core.view.x.A(r0)
                if (r9 <= 0) goto L_0x002f
                r9 = r1 & 12
                if (r9 == 0) goto L_0x002f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
            L_0x002d:
                r8 = 1
                goto L_0x0042
            L_0x002f:
                r9 = r1 & 2
                if (r9 == 0) goto L_0x0041
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L_0x0041
                goto L_0x002d
            L_0x0041:
                r8 = 0
            L_0x0042:
                boolean r9 = r7.i()
                if (r9 == 0) goto L_0x0057
                android.view.View r9 = r5.W(r6)
                if (r9 == 0) goto L_0x0057
                int r8 = r9.getScrollY()
                if (r8 <= 0) goto L_0x0055
                goto L_0x0056
            L_0x0055:
                r3 = 0
            L_0x0056:
                r8 = r3
            L_0x0057:
                boolean r8 = r7.n(r8)
                if (r10 != 0) goto L_0x0065
                if (r8 == 0) goto L_0x0068
                boolean r6 = r5.m0(r6, r7)
                if (r6 == 0) goto L_0x0068
            L_0x0065:
                r7.jumpDrawablesToCurrentState()
            L_0x0068:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p0(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* access modifiers changed from: package-private */
        public int L() {
            return D() + this.f6834k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: T */
        public boolean G(T t9) {
            WeakReference<View> weakReference = this.f6840q;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Z */
        public int J(T t9) {
            return -t9.getDownNestedScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a0 */
        public int K(T t9) {
            return t9.getTotalScrollRange();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c0 */
        public void M(CoordinatorLayout coordinatorLayout, T t9) {
            n0(coordinatorLayout, t9);
        }

        /* renamed from: d0 */
        public boolean l(CoordinatorLayout coordinatorLayout, T t9, int i10) {
            boolean l10 = super.l(coordinatorLayout, t9, i10);
            int pendingAction = t9.getPendingAction();
            int i11 = this.f6837n;
            if (i11 >= 0 && (pendingAction & 8) == 0) {
                View childAt = t9.getChildAt(i11);
                O(coordinatorLayout, t9, (-childAt.getBottom()) + (this.f6838o ? x.A(childAt) + t9.getTopInset() : Math.round(((float) childAt.getHeight()) * this.f6839p)));
            } else if (pendingAction != 0) {
                boolean z9 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i12 = -t9.getUpNestedPreScrollRange();
                    if (z9) {
                        R(coordinatorLayout, t9, i12, 0.0f);
                    } else {
                        O(coordinatorLayout, t9, i12);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z9) {
                        R(coordinatorLayout, t9, 0, 0.0f);
                    } else {
                        O(coordinatorLayout, t9, 0);
                    }
                }
            }
            t9.j();
            this.f6837n = -1;
            F(t.a.b(D(), -t9.getTotalScrollRange(), 0));
            p0(coordinatorLayout, t9, D(), 0, true);
            t9.a(D());
            return l10;
        }

        /* renamed from: e0 */
        public boolean m(CoordinatorLayout coordinatorLayout, T t9, int i10, int i11, int i12, int i13) {
            if (((CoordinatorLayout.f) t9.getLayoutParams()).height != -2) {
                return super.m(coordinatorLayout, t9, i10, i11, i12, i13);
            }
            coordinatorLayout.J(t9, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* renamed from: f0 */
        public void q(CoordinatorLayout coordinatorLayout, T t9, View view, int i10, int i11, int[] iArr, int i12) {
            int i13;
            int i14;
            if (i11 != 0) {
                if (i11 < 0) {
                    int i15 = -t9.getTotalScrollRange();
                    i14 = i15;
                    i13 = t9.getDownNestedPreScrollRange() + i15;
                } else {
                    i14 = -t9.getUpNestedPreScrollRange();
                    i13 = 0;
                }
                if (i14 != i13) {
                    iArr[1] = N(coordinatorLayout, t9, i11, i14, i13);
                    o0(i11, t9, view, i12);
                }
            }
        }

        /* renamed from: g0 */
        public void s(CoordinatorLayout coordinatorLayout, T t9, View view, int i10, int i11, int i12, int i13, int i14) {
            if (i13 < 0) {
                N(coordinatorLayout, t9, i13, -t9.getDownNestedScrollRange(), 0);
                o0(i13, t9, view, i14);
            }
            if (t9.i()) {
                t9.n(view.getScrollY() > 0);
            }
        }

        /* renamed from: h0 */
        public void w(CoordinatorLayout coordinatorLayout, T t9, Parcelable parcelable) {
            if (parcelable instanceof b) {
                b bVar = (b) parcelable;
                super.w(coordinatorLayout, t9, bVar.a());
                this.f6837n = bVar.f6844o;
                this.f6839p = bVar.f6845p;
                this.f6838o = bVar.f6846q;
                return;
            }
            super.w(coordinatorLayout, t9, parcelable);
            this.f6837n = -1;
        }

        /* renamed from: i0 */
        public Parcelable x(CoordinatorLayout coordinatorLayout, T t9) {
            Parcelable x9 = super.x(coordinatorLayout, t9);
            int D = D();
            int childCount = t9.getChildCount();
            boolean z9 = false;
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = t9.getChildAt(i10);
                int bottom = childAt.getBottom() + D;
                if (childAt.getTop() + D > 0 || bottom < 0) {
                    i10++;
                } else {
                    b bVar = new b(x9);
                    bVar.f6844o = i10;
                    if (bottom == x.A(childAt) + t9.getTopInset()) {
                        z9 = true;
                    }
                    bVar.f6846q = z9;
                    bVar.f6845p = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return x9;
        }

        /* renamed from: j0 */
        public boolean z(CoordinatorLayout coordinatorLayout, T t9, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z9 = (i10 & 2) != 0 && (t9.i() || U(coordinatorLayout, t9, view));
            if (z9 && (valueAnimator = this.f6836m) != null) {
                valueAnimator.cancel();
            }
            this.f6840q = null;
            this.f6835l = i11;
            return z9;
        }

        /* renamed from: k0 */
        public void B(CoordinatorLayout coordinatorLayout, T t9, View view, int i10) {
            if (this.f6835l == 0 || i10 == 1) {
                n0(coordinatorLayout, t9);
            }
            this.f6840q = new WeakReference<>(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l0 */
        public int P(CoordinatorLayout coordinatorLayout, T t9, int i10, int i11, int i12) {
            int L = L();
            int i13 = 0;
            if (i11 == 0 || L < i11 || L > i12) {
                this.f6834k = 0;
            } else {
                int b10 = t.a.b(i10, i11, i12);
                if (L != b10) {
                    int b02 = t9.e() ? b0(t9, b10) : b10;
                    boolean F = F(b02);
                    i13 = L - b10;
                    this.f6834k = b10 - b02;
                    if (!F && t9.e()) {
                        coordinatorLayout.f(t9);
                    }
                    t9.a(D());
                    p0(coordinatorLayout, t9, b10, b10 < L ? -1 : 1, false);
                }
            }
            return i13;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public /* bridge */ /* synthetic */ int D() {
            return super.D();
        }

        public /* bridge */ /* synthetic */ boolean F(int i10) {
            return super.F(i10);
        }

        public /* bridge */ /* synthetic */ boolean d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        public /* bridge */ /* synthetic */ boolean e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        public /* bridge */ /* synthetic */ void f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        public /* bridge */ /* synthetic */ void g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14) {
            super.s(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14);
        }

        public /* bridge */ /* synthetic */ void h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.w(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.x(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ boolean j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.z(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        public /* bridge */ /* synthetic */ void k0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.B(coordinatorLayout, appBarLayout, view, i10);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f8434y0);
            N(obtainStyledAttributes.getDimensionPixelSize(i.f8436z0, 0));
            obtainStyledAttributes.recycle();
        }

        private static int P(AppBarLayout appBarLayout) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                return ((BaseBehavior) f10).L();
            }
            return 0;
        }

        private void Q(View view, View view2) {
            CoordinatorLayout.c f10 = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (f10 instanceof BaseBehavior) {
                x.W(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) f10).f6834k) + L()) - H(view2));
            }
        }

        private void R(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.i()) {
                    appBarLayout.n(view.getScrollY() > 0);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public float I(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int P = P(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + P > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (((float) P) / ((float) i10)) + 1.0f;
                }
            }
            return 0.0f;
        }

        /* access modifiers changed from: package-private */
        public int K(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.K(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public AppBarLayout G(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            Q(view, view2);
            R(view, view2);
            return false;
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        public boolean v(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z9) {
            AppBarLayout O = G(coordinatorLayout.r(view));
            if (O != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f6859d;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    O.k(false, !z9);
                    return true;
                }
            }
            return false;
        }
    }

    public interface a<T extends AppBarLayout> {
        void a(T t9, int i10);
    }

    public static class b extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        int f6847a = 1;

        /* renamed from: b  reason: collision with root package name */
        Interpolator f6848b;

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f8401i);
            this.f6847a = obtainStyledAttributes.getInt(i.f8403j, 0);
            int i10 = i.f8405k;
            if (obtainStyledAttributes.hasValue(i10)) {
                this.f6848b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i10, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public int a() {
            return this.f6847a;
        }

        public Interpolator b() {
            return this.f6848b;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            int i10 = this.f6847a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }
    }

    private boolean f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((b) getChildAt(i10).getLayoutParams()).c()) {
                return true;
            }
        }
        return false;
    }

    private void h() {
        this.f6822m = -1;
        this.f6823n = -1;
        this.f6824o = -1;
    }

    private void l(boolean z9, boolean z10, boolean z11) {
        int i10 = 0;
        int i11 = (z9 ? 1 : 2) | (z10 ? 4 : 0);
        if (z11) {
            i10 = 8;
        }
        this.f6826q = i11 | i10;
        requestLayout();
    }

    private boolean m(boolean z9) {
        if (this.f6830u == z9) {
            return false;
        }
        this.f6830u = z9;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(int i10) {
        List<a> list = this.f6828s;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f6828s.get(i11);
                if (aVar != null) {
                    aVar.a(this, i10);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public b generateDefaultLayoutParams() {
        return new b(-1, -2);
    }

    /* renamed from: c */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new b((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return this.f6825p;
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return getTotalScrollRange() != 0;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedPreScrollRange() {
        int i10 = this.f6823n;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i12 = bVar.f6847a;
            if ((i12 & 5) == 5) {
                int i13 = i11 + bVar.topMargin + bVar.bottomMargin;
                if ((i12 & 8) != 0) {
                    i11 = i13 + x.A(childAt);
                } else {
                    i11 = i13 + (measuredHeight - ((i12 & 2) != 0 ? x.A(childAt) : getTopInset()));
                }
            } else if (i11 > 0) {
                break;
            }
        }
        int max = Math.max(0, i11);
        this.f6823n = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getDownNestedScrollRange() {
        int i10 = this.f6824o;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + bVar.topMargin + bVar.bottomMargin;
            int i13 = bVar.f6847a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                i12 -= x.A(childAt) + getTopInset();
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f6824o = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int A = x.A(this);
        if (A == 0) {
            int childCount = getChildCount();
            A = childCount >= 1 ? x.A(getChildAt(childCount - 1)) : 0;
            if (A == 0) {
                return getHeight() / 3;
            }
        }
        return (A * 2) + topInset;
    }

    /* access modifiers changed from: package-private */
    public int getPendingAction() {
        return this.f6826q;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    public final int getTopInset() {
        h0 h0Var = this.f6827r;
        if (h0Var != null) {
            return h0Var.k();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f6822m;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            b bVar = (b) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = bVar.f6847a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight + bVar.topMargin + bVar.bottomMargin;
            if ((i13 & 2) != 0) {
                i12 -= x.A(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12 - getTopInset());
        this.f6822m = max;
        return max;
    }

    /* access modifiers changed from: package-private */
    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public boolean i() {
        return this.f6832w;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f6826q = 0;
    }

    public void k(boolean z9, boolean z10) {
        l(z9, z10, true);
    }

    /* access modifiers changed from: package-private */
    public boolean n(boolean z9) {
        if (this.f6831v == z9) {
            return false;
        }
        this.f6831v = z9;
        refreshDrawableState();
        return true;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i10) {
        if (this.f6833x == null) {
            this.f6833x = new int[4];
        }
        int[] iArr = this.f6833x;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z9 = this.f6830u;
        int i11 = e3.b.state_liftable;
        if (!z9) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (!z9 || !this.f6831v) ? -e3.b.state_lifted : e3.b.state_lifted;
        int i12 = e3.b.state_collapsible;
        if (!z9) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (!z9 || !this.f6831v) ? -e3.b.state_collapsed : e3.b.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        h();
        boolean z10 = false;
        this.f6825p = false;
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                break;
            } else if (((b) getChildAt(i14).getLayoutParams()).b() != null) {
                this.f6825p = true;
                break;
            } else {
                i14++;
            }
        }
        if (!this.f6829t) {
            if (this.f6832w || f()) {
                z10 = true;
            }
            m(z10);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        h();
    }

    public void setExpanded(boolean z9) {
        k(z9, x.P(this));
    }

    public void setLiftOnScroll(boolean z9) {
        this.f6832w = z9;
    }

    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        e.a(this, f10);
    }
}
