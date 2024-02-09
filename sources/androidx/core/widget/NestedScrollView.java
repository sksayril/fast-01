package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.d;
import androidx.core.view.accessibility.f;
import androidx.core.view.l;
import androidx.core.view.m;
import androidx.core.view.o;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.x;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements q, m {
    private static final float N = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    private static final a O = new a();
    private static final int[] P = {16843130};
    private int A;
    private int B;
    private int C;
    private int D;
    private final int[] E;
    private final int[] F;
    private int G;
    private int H;
    private d I;
    private final r J;
    private final o K;
    private float L;
    private c M;

    /* renamed from: m  reason: collision with root package name */
    private final float f1830m;

    /* renamed from: n  reason: collision with root package name */
    private long f1831n;

    /* renamed from: o  reason: collision with root package name */
    private final Rect f1832o;

    /* renamed from: p  reason: collision with root package name */
    private OverScroller f1833p;

    /* renamed from: q  reason: collision with root package name */
    public EdgeEffect f1834q;

    /* renamed from: r  reason: collision with root package name */
    public EdgeEffect f1835r;

    /* renamed from: s  reason: collision with root package name */
    private int f1836s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f1837t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f1838u;

    /* renamed from: v  reason: collision with root package name */
    private View f1839v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1840w;

    /* renamed from: x  reason: collision with root package name */
    private VelocityTracker f1841x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f1842y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1843z;

    static class a extends androidx.core.view.a {
        a() {
        }

        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            f.a(accessibilityEvent, nestedScrollView.getScrollX());
            f.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, androidx.core.view.accessibility.d dVar) {
            int scrollRange;
            super.g(view, dVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.L(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                dVar.R(true);
                if (nestedScrollView.getScrollY() > 0) {
                    dVar.b(d.a.f1705r);
                    dVar.b(d.a.C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    dVar.b(d.a.f1704q);
                    dVar.b(d.a.E);
                }
            }
        }

        public boolean j(View view, int i10, Bundle bundle) {
            if (super.j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, max, true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, min, true);
            return true;
        }
    }

    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface c {
        void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: m  reason: collision with root package name */
        public int f1844m;

        class a implements Parcelable.Creator<d> {
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

        d(Parcel parcel) {
            super(parcel);
            this.f1844m = parcel.readInt();
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1844m + "}";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1844m);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, r.a.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1832o = new Rect();
        this.f1837t = true;
        this.f1838u = false;
        this.f1839v = null;
        this.f1840w = false;
        this.f1843z = true;
        this.D = -1;
        this.E = new int[2];
        this.F = new int[2];
        this.f1834q = e.a(context, attributeSet);
        this.f1835r = e.a(context, attributeSet);
        this.f1830m = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.J = new r(this);
        this.K = new o(this);
        setNestedScrollingEnabled(true);
        x.g0(this, O);
    }

    private void A() {
        VelocityTracker velocityTracker = this.f1841x;
        if (velocityTracker == null) {
            this.f1841x = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void B() {
        this.f1833p = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.A = viewConfiguration.getScaledTouchSlop();
        this.B = viewConfiguration.getScaledMinimumFlingVelocity();
        this.C = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void C() {
        if (this.f1841x == null) {
            this.f1841x = VelocityTracker.obtain();
        }
    }

    private void D(int i10, int i11) {
        this.f1836s = i10;
        this.D = i11;
        X(2, 0);
    }

    private boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private boolean G(View view, int i10, int i11) {
        view.getDrawingRect(this.f1832o);
        offsetDescendantRectToMyCoords(view, this.f1832o);
        return this.f1832o.bottom + i10 >= getScrollY() && this.f1832o.top - i10 <= getScrollY() + i11;
    }

    private void H(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.K.e(0, scrollY2, 0, i10 - scrollY2, (int[]) null, i11, iArr);
    }

    private void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.D) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1836s = (int) motionEvent.getY(i10);
            this.D = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f1841x;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void L() {
        VelocityTracker velocityTracker = this.f1841x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1841x = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f1834q
            float r0 = androidx.core.widget.e.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f1834q
            float r4 = -r4
            float r4 = androidx.core.widget.e.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f1834q
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f1834q
        L_0x002c:
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0051
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f1835r
            float r0 = androidx.core.widget.e.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            android.widget.EdgeEffect r0 = r3.f1835r
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.e.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f1835r
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f1835r
            goto L_0x002c
        L_0x0051:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0061
            r3.invalidate()
        L_0x0061:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    private void N(boolean z9) {
        if (z9) {
            X(2, 1);
        } else {
            a(1);
        }
        this.H = getScrollY();
        x.a0(this);
    }

    private boolean O(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z9 = false;
        boolean z10 = i10 == 33;
        View u9 = u(z10, i11, i12);
        if (u9 == null) {
            u9 = this;
        }
        if (i11 < scrollY || i12 > i13) {
            P(z10 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z9 = true;
        }
        if (u9 != findFocus()) {
            u9.requestFocus(i10);
        }
        return z9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int P(int r22, int r23, int r24, boolean r25) {
        /*
            r21 = this;
            r10 = r21
            r11 = r23
            r12 = r24
            r13 = 1
            if (r12 != r13) goto L_0x000d
            r0 = 2
            r10.X(r0, r12)
        L_0x000d:
            r1 = 0
            int[] r3 = r10.F
            int[] r4 = r10.E
            r0 = r21
            r2 = r22
            r5 = r24
            boolean r0 = r0.l(r1, r2, r3, r4, r5)
            r14 = 0
            if (r0 == 0) goto L_0x002e
            int[] r0 = r10.F
            r0 = r0[r13]
            int r0 = r22 - r0
            int[] r1 = r10.E
            r1 = r1[r13]
            int r1 = r1 + r14
            r15 = r0
            r16 = r1
            goto L_0x0032
        L_0x002e:
            r15 = r22
            r16 = 0
        L_0x0032:
            int r17 = r21.getScrollY()
            int r9 = r21.getScrollRange()
            boolean r0 = r21.d()
            if (r0 == 0) goto L_0x0045
            if (r25 != 0) goto L_0x0045
            r18 = 1
            goto L_0x0047
        L_0x0045:
            r18 = 0
        L_0x0047:
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r21
            r2 = r15
            r4 = r17
            r6 = r9
            r20 = r9
            r9 = r19
            boolean r0 = r0.J(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x0066
            boolean r0 = r10.y(r12)
            if (r0 != 0) goto L_0x0066
            r8 = 1
            goto L_0x0067
        L_0x0066:
            r8 = 0
        L_0x0067:
            int r0 = r21.getScrollY()
            int r2 = r0 - r17
            int r4 = r15 - r2
            int[] r7 = r10.F
            r7[r13] = r14
            r1 = 0
            r3 = 0
            int[] r5 = r10.E
            r0 = r21
            r6 = r24
            r0.p(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r10.E
            r0 = r0[r13]
            int r16 = r16 + r0
            int[] r0 = r10.F
            r0 = r0[r13]
            int r15 = r15 - r0
            int r0 = r17 + r15
            if (r0 >= 0) goto L_0x00b1
            if (r18 == 0) goto L_0x00d8
            android.widget.EdgeEffect r0 = r10.f1834q
            int r1 = -r15
            float r1 = (float) r1
            int r2 = r21.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            float r2 = (float) r11
            int r3 = r21.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.e.d(r0, r1, r2)
            android.widget.EdgeEffect r0 = r10.f1835r
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00d8
            android.widget.EdgeEffect r0 = r10.f1835r
        L_0x00ad:
            r0.onRelease()
            goto L_0x00d8
        L_0x00b1:
            r1 = r20
            if (r0 <= r1) goto L_0x00d8
            if (r18 == 0) goto L_0x00d8
            android.widget.EdgeEffect r0 = r10.f1835r
            float r1 = (float) r15
            int r2 = r21.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r3 = (float) r11
            int r4 = r21.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            float r2 = r2 - r3
            androidx.core.widget.e.d(r0, r1, r2)
            android.widget.EdgeEffect r0 = r10.f1834q
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00d8
            android.widget.EdgeEffect r0 = r10.f1834q
            goto L_0x00ad
        L_0x00d8:
            android.widget.EdgeEffect r0 = r10.f1834q
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x00eb
            android.widget.EdgeEffect r0 = r10.f1835r
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00e9
            goto L_0x00eb
        L_0x00e9:
            r14 = r8
            goto L_0x00ee
        L_0x00eb:
            androidx.core.view.x.a0(r21)
        L_0x00ee:
            if (r14 == 0) goto L_0x00f7
            if (r12 != 0) goto L_0x00f7
            android.view.VelocityTracker r0 = r10.f1841x
            r0.clear()
        L_0x00f7:
            if (r12 != r13) goto L_0x0106
            r10.a(r12)
            android.widget.EdgeEffect r0 = r10.f1834q
            r0.onRelease()
            android.widget.EdgeEffect r0 = r10.f1835r
            r0.onRelease()
        L_0x0106:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.P(int, int, int, boolean):int");
    }

    private void Q(View view) {
        view.getDrawingRect(this.f1832o);
        offsetDescendantRectToMyCoords(view, this.f1832o);
        int g10 = g(this.f1832o);
        if (g10 != 0) {
            scrollBy(0, g10);
        }
    }

    private boolean R(Rect rect, boolean z9) {
        int g10 = g(rect);
        boolean z10 = g10 != 0;
        if (z10) {
            if (z9) {
                scrollBy(0, g10);
            } else {
                T(0, g10);
            }
        }
        return z10;
    }

    private boolean S(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return x(-i10) < e.b(edgeEffect) * ((float) getHeight());
    }

    private void U(int i10, int i11, int i12, boolean z9) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1831n > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1833p;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i12);
                N(z9);
            } else {
                if (!this.f1833p.isFinished()) {
                    b();
                }
                scrollBy(i10, i11);
            }
            this.f1831n = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    private boolean Y(MotionEvent motionEvent) {
        boolean z9;
        if (e.b(this.f1834q) != 0.0f) {
            e.d(this.f1834q, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z9 = true;
        } else {
            z9 = false;
        }
        if (e.b(this.f1835r) == 0.0f) {
            return z9;
        }
        e.d(this.f1835r, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    private void b() {
        this.f1833p.abortAnimation();
        a(1);
    }

    private boolean d() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    private boolean e() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private static int f(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.L == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.L = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.L;
    }

    private void q(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f1843z) {
            T(0, i10);
        } else {
            scrollBy(0, i10);
        }
    }

    private boolean r(int i10) {
        EdgeEffect edgeEffect;
        if (e.b(this.f1834q) != 0.0f) {
            if (S(this.f1834q, i10)) {
                edgeEffect = this.f1834q;
            } else {
                i10 = -i10;
                v(i10);
                return true;
            }
        } else if (e.b(this.f1835r) == 0.0f) {
            return false;
        } else {
            i10 = -i10;
            if (S(this.f1835r, i10)) {
                edgeEffect = this.f1835r;
            }
            v(i10);
            return true;
        }
        edgeEffect.onAbsorb(i10);
        return true;
    }

    private void s() {
        this.D = -1;
        this.f1840w = false;
        L();
        a(0);
        this.f1834q.onRelease();
        this.f1835r.onRelease();
    }

    private View u(boolean z9, int i10, int i11) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = (View) focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z11 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z10 = z11;
                } else {
                    boolean z12 = (z9 && top < view.getTop()) || (!z9 && bottom > view.getBottom());
                    if (z10) {
                        if (z11) {
                            if (!z12) {
                            }
                        }
                    } else if (z11) {
                        view = view2;
                        z10 = true;
                    } else if (!z12) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    private float x(int i10) {
        double log = Math.log((double) ((((float) Math.abs(i10)) * 0.35f) / (this.f1830m * 0.015f)));
        float f10 = N;
        return (float) (((double) (this.f1830m * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * log));
    }

    private boolean z(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean J(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.y(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f1833p
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.J(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    public boolean K(int i10) {
        boolean z9 = i10 == 130;
        int height = getHeight();
        if (z9) {
            this.f1832o.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1832o;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1832o.top = getScrollY() - height;
            Rect rect2 = this.f1832o;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1832o;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return O(i10, i11, i12);
    }

    public final void T(int i10, int i11) {
        U(i10, i11, 250, false);
    }

    /* access modifiers changed from: package-private */
    public void V(int i10, int i11, int i12, boolean z9) {
        U(i10 - getScrollX(), i11 - getScrollY(), i12, z9);
    }

    /* access modifiers changed from: package-private */
    public void W(int i10, int i11, boolean z9) {
        V(i10, i11, 250, z9);
    }

    public boolean X(int i10, int i11) {
        return this.K.q(i10, i11);
    }

    public void a(int i10) {
        this.K.s(i10);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean c(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f1832o);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1832o);
            P(g(this.f1832o), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f1833p.isFinished()) {
            this.f1833p.computeScrollOffset();
            int currY = this.f1833p.getCurrY();
            int k10 = k(currY - this.H);
            this.H = currY;
            int[] iArr = this.F;
            boolean z9 = false;
            iArr[1] = 0;
            l(0, k10, iArr, (int[]) null, 1);
            int i10 = k10 - this.F[1];
            int scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                J(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i11 = i10 - scrollY2;
                int[] iArr2 = this.F;
                iArr2[1] = 0;
                p(0, scrollY2, 0, i11, this.E, 1, iArr2);
                i10 = i11 - this.F[1];
            }
            if (i10 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z9 = true;
                }
                if (z9) {
                    if (i10 < 0) {
                        if (this.f1834q.isFinished()) {
                            edgeEffect = this.f1834q;
                        }
                    } else if (this.f1835r.isFinished()) {
                        edgeEffect = this.f1835r;
                    }
                    edgeEffect.onAbsorb((int) this.f1833p.getCurrVelocity());
                }
                b();
            }
            if (!this.f1833p.isFinished()) {
                x.a0(this);
            } else {
                a(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    public boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return this.K.a(f10, f11, z9);
    }

    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.K.b(f10, f11);
    }

    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return l(i10, i11, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.K.f(i10, i11, i12, i13, iArr);
    }

    public void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f1834q.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i10, (float) min);
            this.f1834q.setSize(width, height);
            if (this.f1834q.draw(canvas)) {
                x.a0(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f1835r.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i11 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i11 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f1835r.setSize(width2, height2);
            if (this.f1835r.draw(canvas)) {
                x.a0(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    /* access modifiers changed from: protected */
    public int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.J.a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void h(View view, View view2, int i10, int i11) {
        this.J.c(view, view2, i10, i11);
        X(2, i11);
    }

    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public void i(View view, int i10) {
        this.J.d(view, i10);
        a(i10);
    }

    public boolean isNestedScrollingEnabled() {
        return this.K.m();
    }

    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        l(i10, i11, iArr, (int[]) null, i12);
    }

    /* access modifiers changed from: package-private */
    public int k(int i10) {
        int height = getHeight();
        if (i10 > 0 && e.b(this.f1834q) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * e.d(this.f1834q, (((float) (-i10)) * 4.0f) / ((float) height), 0.5f));
            if (round != i10) {
                this.f1834q.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || e.b(this.f1835r) == 0.0f) {
            return i10;
        } else {
            float f10 = (float) height;
            int round2 = Math.round((f10 / 4.0f) * e.d(this.f1835r, (((float) i10) * 4.0f) / f10, 0.5f));
            if (round2 != i10) {
                this.f1835r.finish();
            }
            return i10 - round2;
        }
    }

    public boolean l(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.K.d(i10, i11, iArr, iArr2, i12);
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        H(i13, i14, iArr);
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i10, int i11) {
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        H(i13, i14, (int[]) null);
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1838u = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (motionEvent.getAction() != 8 || this.f1840w) {
            return false;
        }
        if (l.a(motionEvent, 2)) {
            f10 = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
        } else if (l.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f10 = axisValue;
        } else {
            f10 = 0.0f;
            i10 = 0;
        }
        if (f10 == 0.0f) {
            return false;
        }
        P(-((int) (f10 * getVerticalScrollFactorCompat())), i10, 1, l.a(motionEvent, 8194));
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z9 = true;
        if (action == 2 && this.f1840w) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.D;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y9 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y9 - this.f1836s) > this.A && (2 & getNestedScrollAxes()) == 0) {
                                this.f1840w = true;
                                this.f1836s = y9;
                                C();
                                this.f1841x.addMovement(motionEvent);
                                this.G = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        I(motionEvent);
                    }
                }
            }
            this.f1840w = false;
            this.D = -1;
            L();
            if (this.f1833p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                x.a0(this);
            }
            a(0);
        } else {
            int y10 = (int) motionEvent.getY();
            if (!z((int) motionEvent.getX(), y10)) {
                if (!Y(motionEvent) && this.f1833p.isFinished()) {
                    z9 = false;
                }
                this.f1840w = z9;
                L();
            } else {
                this.f1836s = y10;
                this.D = motionEvent.getPointerId(0);
                A();
                this.f1841x.addMovement(motionEvent);
                this.f1833p.computeScrollOffset();
                if (!Y(motionEvent) && this.f1833p.isFinished()) {
                    z9 = false;
                }
                this.f1840w = z9;
                X(2, 0);
            }
        }
        return this.f1840w;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        int i14 = 0;
        this.f1837t = false;
        View view = this.f1839v;
        if (view != null && F(view, this)) {
            Q(this.f1839v);
        }
        this.f1839v = null;
        if (!this.f1838u) {
            if (this.I != null) {
                scrollTo(getScrollX(), this.I.f1844m);
                this.I = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int f10 = f(scrollY, paddingTop, i14);
            if (f10 != scrollY) {
                scrollTo(getScrollX(), f10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1838u = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1842y && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        if (z9) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        v((int) f11);
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        H(i13, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        h(view, view2, i10, 0);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i10, int i11, boolean z9, boolean z10) {
        super.scrollTo(i10, i11);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i10) : instance.findNextFocusFromRect(this, rect, i10);
        if (findNextFocus != null && !E(findNextFocus)) {
            return findNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.I = dVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1844m = getScrollY();
        return dVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.M;
        if (cVar != null) {
            cVar.a(this, i10, i11, i12, i13);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && G(findFocus, 0, i13)) {
            findFocus.getDrawingRect(this.f1832o);
            offsetDescendantRectToMyCoords(findFocus, this.f1832o);
            q(g(this.f1832o));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r12.f1833p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012a, code lost:
        if (r12.f1833p.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r12.C()
            int r0 = r13.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L_0x000c
            r12.G = r1
        L_0x000c:
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r13)
            int r3 = r12.G
            float r3 = (float) r3
            r4 = 0
            r2.offsetLocation(r4, r3)
            r3 = 1
            if (r0 == 0) goto L_0x012e
            if (r0 == r3) goto L_0x00e6
            r4 = 2
            if (r0 == r4) goto L_0x0078
            r1 = 3
            if (r0 == r1) goto L_0x004f
            r1 = 5
            if (r0 == r1) goto L_0x003c
            r1 = 6
            if (r0 == r1) goto L_0x002a
            goto L_0x0159
        L_0x002a:
            r12.I(r13)
            int r0 = r12.D
            int r0 = r13.findPointerIndex(r0)
            float r13 = r13.getY(r0)
            int r13 = (int) r13
            r12.f1836s = r13
            goto L_0x0159
        L_0x003c:
            int r0 = r13.getActionIndex()
            float r1 = r13.getY(r0)
            int r1 = (int) r1
            r12.f1836s = r1
            int r13 = r13.getPointerId(r0)
            r12.D = r13
            goto L_0x0159
        L_0x004f:
            boolean r13 = r12.f1840w
            if (r13 == 0) goto L_0x0073
            int r13 = r12.getChildCount()
            if (r13 <= 0) goto L_0x0073
            android.widget.OverScroller r4 = r12.f1833p
            int r5 = r12.getScrollX()
            int r6 = r12.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r12.getScrollRange()
            boolean r13 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r13 == 0) goto L_0x0073
        L_0x0070:
            androidx.core.view.x.a0(r12)
        L_0x0073:
            r12.s()
            goto L_0x0159
        L_0x0078:
            int r0 = r12.D
            int r0 = r13.findPointerIndex(r0)
            r4 = -1
            if (r0 != r4) goto L_0x00a0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Invalid pointerId="
            r13.append(r0)
            int r0 = r12.D
            r13.append(r0)
            java.lang.String r0 = " in onTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L_0x0159
        L_0x00a0:
            float r4 = r13.getY(r0)
            int r4 = (int) r4
            int r5 = r12.f1836s
            int r5 = r5 - r4
            float r6 = r13.getX(r0)
            int r6 = r12.M(r5, r6)
            int r5 = r5 - r6
            boolean r6 = r12.f1840w
            if (r6 != 0) goto L_0x00cf
            int r6 = java.lang.Math.abs(r5)
            int r7 = r12.A
            if (r6 <= r7) goto L_0x00cf
            android.view.ViewParent r6 = r12.getParent()
            if (r6 == 0) goto L_0x00c6
            r6.requestDisallowInterceptTouchEvent(r3)
        L_0x00c6:
            r12.f1840w = r3
            int r6 = r12.A
            if (r5 <= 0) goto L_0x00ce
            int r5 = r5 - r6
            goto L_0x00cf
        L_0x00ce:
            int r5 = r5 + r6
        L_0x00cf:
            boolean r6 = r12.f1840w
            if (r6 == 0) goto L_0x0159
            float r13 = r13.getX(r0)
            int r13 = (int) r13
            int r13 = r12.P(r5, r13, r1, r1)
            int r4 = r4 - r13
            r12.f1836s = r4
            int r0 = r12.G
            int r0 = r0 + r13
            r12.G = r0
            goto L_0x0159
        L_0x00e6:
            android.view.VelocityTracker r13 = r12.f1841x
            r0 = 1000(0x3e8, float:1.401E-42)
            int r1 = r12.C
            float r1 = (float) r1
            r13.computeCurrentVelocity(r0, r1)
            int r0 = r12.D
            float r13 = r13.getYVelocity(r0)
            int r13 = (int) r13
            int r0 = java.lang.Math.abs(r13)
            int r1 = r12.B
            if (r0 < r1) goto L_0x0115
            boolean r0 = r12.r(r13)
            if (r0 != 0) goto L_0x0073
            int r13 = -r13
            float r0 = (float) r13
            boolean r1 = r12.dispatchNestedPreFling(r4, r0)
            if (r1 != 0) goto L_0x0073
            r12.dispatchNestedFling(r4, r0, r3)
            r12.v(r13)
            goto L_0x0073
        L_0x0115:
            android.widget.OverScroller r5 = r12.f1833p
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x0073
            goto L_0x0070
        L_0x012e:
            int r0 = r12.getChildCount()
            if (r0 != 0) goto L_0x0135
            return r1
        L_0x0135:
            boolean r0 = r12.f1840w
            if (r0 == 0) goto L_0x0142
            android.view.ViewParent r0 = r12.getParent()
            if (r0 == 0) goto L_0x0142
            r0.requestDisallowInterceptTouchEvent(r3)
        L_0x0142:
            android.widget.OverScroller r0 = r12.f1833p
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x014d
            r12.b()
        L_0x014d:
            float r0 = r13.getY()
            int r0 = (int) r0
            int r13 = r13.getPointerId(r1)
            r12.D(r0, r13)
        L_0x0159:
            android.view.VelocityTracker r13 = r12.f1841x
            if (r13 == 0) goto L_0x0160
            r13.addMovement(r2)
        L_0x0160:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.K.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1837t) {
            Q(view2);
        } else {
            this.f1839v = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z9);
    }

    public void requestDisallowInterceptTouchEvent(boolean z9) {
        if (z9) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    public void requestLayout() {
        this.f1837t = true;
        super.requestLayout();
    }

    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int f10 = f(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int f11 = f(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (f10 != getScrollX() || f11 != getScrollY()) {
                super.scrollTo(f10, f11);
            }
        }
    }

    public void setFillViewport(boolean z9) {
        if (z9 != this.f1842y) {
            this.f1842y = z9;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z9) {
        this.K.n(z9);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.M = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z9) {
        this.f1843z = z9;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i10) {
        return X(i10, 0);
    }

    public void stopNestedScroll() {
        a(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f1832o.setEmpty();
        int i10 = 130;
        if (!e()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return !keyEvent.isAltPressed() ? c(33) : w(33);
            }
            if (keyCode == 20) {
                return !keyEvent.isAltPressed() ? c(130) : w(130);
            }
            if (keyCode != 62) {
                return false;
            }
            if (keyEvent.isShiftPressed()) {
                i10 = 33;
            }
            K(i10);
            return false;
        }
    }

    public void v(int i10) {
        if (getChildCount() > 0) {
            this.f1833p.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
        }
    }

    public boolean w(int i10) {
        int childCount;
        boolean z9 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1832o;
        rect.top = 0;
        rect.bottom = height;
        if (z9 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1832o.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1832o;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1832o;
        return O(i10, rect3.top, rect3.bottom);
    }

    public boolean y(int i10) {
        return this.K.l(i10);
    }
}
