package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.h0;
import androidx.core.view.p;
import androidx.core.view.q;
import androidx.core.view.r;
import androidx.core.view.x;
import f.f;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements g0, p, q {
    static final int[] R = {f.a.actionBarSize, 16842841};
    private final Rect A = new Rect();
    private final Rect B = new Rect();
    private final Rect C = new Rect();
    private final Rect D = new Rect();
    private final Rect E = new Rect();
    private final Rect F = new Rect();
    private h0 G;
    private h0 H;
    private h0 I;
    private h0 J;
    private d K;
    private OverScroller L;
    ViewPropertyAnimator M;
    final AnimatorListenerAdapter N;
    private final Runnable O;
    private final Runnable P;
    private final r Q;

    /* renamed from: m  reason: collision with root package name */
    private int f629m;

    /* renamed from: n  reason: collision with root package name */
    private int f630n = 0;

    /* renamed from: o  reason: collision with root package name */
    private ContentFrameLayout f631o;

    /* renamed from: p  reason: collision with root package name */
    ActionBarContainer f632p;

    /* renamed from: q  reason: collision with root package name */
    private h0 f633q;

    /* renamed from: r  reason: collision with root package name */
    private Drawable f634r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f635s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f636t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f637u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f638v;

    /* renamed from: w  reason: collision with root package name */
    boolean f639w;

    /* renamed from: x  reason: collision with root package name */
    private int f640x;

    /* renamed from: y  reason: collision with root package name */
    private int f641y;

    /* renamed from: z  reason: collision with root package name */
    private final Rect f642z = new Rect();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = null;
            actionBarOverlayLayout.f639w = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = null;
            actionBarOverlayLayout.f639w = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = actionBarOverlayLayout.f632p.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.N);
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.M = actionBarOverlayLayout.f632p.animate().translationY((float) (-ActionBarOverlayLayout.this.f632p.getHeight())).setListener(ActionBarOverlayLayout.this.N);
        }
    }

    public interface d {
        void a();

        void b();

        void c(int i10);

        void d();

        void e(boolean z9);

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h0 h0Var = h0.f1753b;
        this.G = h0Var;
        this.H = h0Var;
        this.I = h0Var;
        this.J = h0Var;
        this.N = new a();
        this.O = new b();
        this.P = new c();
        v(context);
        this.Q = new r(this);
    }

    private void A() {
        u();
        this.O.run();
    }

    private boolean B(float f10) {
        this.L.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.L.getFinalY() > this.f632p.getHeight();
    }

    private void p() {
        u();
        this.P.run();
    }

    private boolean q(View view, Rect rect, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        e eVar = (e) view.getLayoutParams();
        if (!z9 || eVar.leftMargin == (i13 = rect.left)) {
            z13 = false;
        } else {
            eVar.leftMargin = i13;
            z13 = true;
        }
        if (z10 && eVar.topMargin != (i12 = rect.top)) {
            eVar.topMargin = i12;
            z13 = true;
        }
        if (z12 && eVar.rightMargin != (i11 = rect.right)) {
            eVar.rightMargin = i11;
            z13 = true;
        }
        if (!z11 || eVar.bottomMargin == (i10 = rect.bottom)) {
            return z13;
        }
        eVar.bottomMargin = i10;
        return true;
    }

    private h0 t(View view) {
        if (view instanceof h0) {
            return (h0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(R);
        boolean z9 = false;
        this.f629m = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f634r = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z9 = true;
        }
        this.f635s = z9;
        this.L = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.P, 600);
    }

    private void y() {
        u();
        postDelayed(this.O, 600);
    }

    public void a(Menu menu, j.a aVar) {
        z();
        this.f633q.a(menu, aVar);
    }

    public boolean b() {
        z();
        return this.f633q.b();
    }

    public void c() {
        z();
        this.f633q.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public boolean d() {
        z();
        return this.f633q.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f634r != null && !this.f635s) {
            int bottom = this.f632p.getVisibility() == 0 ? (int) (((float) this.f632p.getBottom()) + this.f632p.getTranslationY() + 0.5f) : 0;
            this.f634r.setBounds(0, bottom, getWidth(), this.f634r.getIntrinsicHeight() + bottom);
            this.f634r.draw(canvas);
        }
    }

    public boolean e() {
        z();
        return this.f633q.e();
    }

    public boolean f() {
        z();
        return this.f633q.f();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean g() {
        z();
        return this.f633q.g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f632p;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.Q.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f633q.getTitle();
    }

    public void h(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    public void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public void k(int i10) {
        z();
        if (i10 == 2) {
            this.f633q.r();
        } else if (i10 == 5) {
            this.f633q.s();
        } else if (i10 == 109) {
            setOverlayMode(true);
        }
    }

    public void l() {
        z();
        this.f633q.h();
    }

    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        h0 w9 = h0.w(windowInsets, this);
        boolean q9 = q(this.f632p, new Rect(w9.i(), w9.k(), w9.j(), w9.h()), true, true, false, true);
        x.f(this, w9, this.f642z);
        Rect rect = this.f642z;
        h0 l10 = w9.l(rect.left, rect.top, rect.right, rect.bottom);
        this.G = l10;
        boolean z9 = true;
        if (!this.H.equals(l10)) {
            this.H = this.G;
            q9 = true;
        }
        if (!this.A.equals(this.f642z)) {
            this.A.set(this.f642z);
        } else {
            z9 = q9;
        }
        if (z9) {
            requestLayout();
        }
        return w9.a().c().b().u();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        x.d0(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = eVar.leftMargin + paddingLeft;
                int i16 = eVar.topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12;
        h0 h0Var;
        z();
        measureChildWithMargins(this.f632p, i10, 0, i11, 0);
        e eVar = (e) this.f632p.getLayoutParams();
        int max = Math.max(0, this.f632p.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f632p.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f632p.getMeasuredState());
        boolean z9 = (x.I(this) & 256) != 0;
        if (z9) {
            i12 = this.f629m;
            if (this.f637u && this.f632p.getTabContainer() != null) {
                i12 += this.f629m;
            }
        } else {
            i12 = this.f632p.getVisibility() != 8 ? this.f632p.getMeasuredHeight() : 0;
        }
        this.B.set(this.f642z);
        h0 h0Var2 = this.G;
        this.I = h0Var2;
        if (this.f636t || z9) {
            h0Var = new h0.b(this.I).c(androidx.core.graphics.b.b(h0Var2.i(), this.I.k() + i12, this.I.j(), this.I.h() + 0)).a();
        } else {
            Rect rect = this.B;
            rect.top += i12;
            rect.bottom += 0;
            h0Var = h0Var2.l(0, i12, 0, 0);
        }
        this.I = h0Var;
        q(this.f631o, this.B, true, true, true, true);
        if (!this.J.equals(this.I)) {
            h0 h0Var3 = this.I;
            this.J = h0Var3;
            x.g(this.f631o, h0Var3);
        }
        measureChildWithMargins(this.f631o, i10, 0, i11, 0);
        e eVar2 = (e) this.f631o.getLayoutParams();
        int max3 = Math.max(max, this.f631o.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f631o.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f631o.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        if (!this.f638v || !z9) {
            return false;
        }
        if (B(f11)) {
            p();
        } else {
            A();
        }
        this.f639w = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f640x + i11;
        this.f640x = i14;
        setActionBarHideOffset(i14);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.Q.b(view, view2, i10);
        this.f640x = getActionBarHideOffset();
        u();
        d dVar = this.K;
        if (dVar != null) {
            dVar.b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f632p.getVisibility() != 0) {
            return false;
        }
        return this.f638v;
    }

    public void onStopNestedScroll(View view) {
        if (this.f638v && !this.f639w) {
            if (this.f640x <= this.f632p.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.K;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        z();
        int i11 = this.f641y ^ i10;
        this.f641y = i10;
        boolean z9 = false;
        boolean z10 = (i10 & 4) == 0;
        if ((i10 & 256) != 0) {
            z9 = true;
        }
        d dVar = this.K;
        if (dVar != null) {
            dVar.e(!z9);
            if (z10 || !z9) {
                this.K.a();
            } else {
                this.K.f();
            }
        }
        if ((i11 & 256) != 0 && this.K != null) {
            x.d0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f630n = i10;
        d dVar = this.K;
        if (dVar != null) {
            dVar.c(i10);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i10) {
        u();
        this.f632p.setTranslationY((float) (-Math.max(0, Math.min(i10, this.f632p.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.K = dVar;
        if (getWindowToken() != null) {
            this.K.c(this.f630n);
            int i10 = this.f641y;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                x.d0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z9) {
        this.f637u = z9;
    }

    public void setHideOnContentScrollEnabled(boolean z9) {
        if (z9 != this.f638v) {
            this.f638v = z9;
            if (!z9) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        z();
        this.f633q.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f633q.setIcon(drawable);
    }

    public void setLogo(int i10) {
        z();
        this.f633q.o(i10);
    }

    public void setOverlayMode(boolean z9) {
        this.f636t = z9;
        this.f635s = z9 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z9) {
    }

    public void setUiOptions(int i10) {
    }

    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f633q.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f633q.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        removeCallbacks(this.O);
        removeCallbacks(this.P);
        ViewPropertyAnimator viewPropertyAnimator = this.M;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f636t;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        if (this.f631o == null) {
            this.f631o = (ContentFrameLayout) findViewById(f.action_bar_activity_content);
            this.f632p = (ActionBarContainer) findViewById(f.action_bar_container);
            this.f633q = t(findViewById(f.action_bar));
        }
    }
}
