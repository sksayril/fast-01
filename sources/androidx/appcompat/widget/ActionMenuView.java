package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.m0;

public class ActionMenuView extends m0 implements e.b, k {
    private androidx.appcompat.view.menu.e B;
    private Context C;
    private int D;
    private boolean E;
    private c F;
    private j.a G;
    e.a H;
    private boolean I;
    private int J;
    private int K;
    private int L;
    e M;

    public interface a {
        boolean a();

        boolean b();
    }

    private static class b implements j.a {
        b() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends m0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f646a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f647b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f648c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f649d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f650e;

        /* renamed from: f  reason: collision with root package name */
        boolean f651f;

        public c(int i10, int i11) {
            super(i10, i11);
            this.f646a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f646a = cVar.f646a;
        }
    }

    private class d implements e.a {
        d() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.M;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.H;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.K = (int) (56.0f * f10);
        this.L = (int) (f10 * 4.0f);
        this.C = context;
        this.D = 0;
    }

    static int L(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z9 = true;
        boolean z10 = actionMenuItemView != null && actionMenuItemView.f();
        int i14 = 2;
        if (i11 <= 0 || (z10 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z10 || i15 >= 2) {
                i14 = i15;
            }
        }
        if (cVar.f646a || !z10) {
            z9 = false;
        }
        cVar.f649d = z9;
        cVar.f647b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    private void M(int i10, int i11) {
        int i12;
        boolean z9;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        int i15;
        boolean z12;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i16 = size - paddingLeft;
        int i17 = this.K;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = i17 + (i19 / i18);
        int childCount = getChildCount();
        int i21 = 0;
        int i22 = 0;
        boolean z13 = false;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        long j10 = 0;
        while (i22 < childCount) {
            View childAt = getChildAt(i22);
            int i26 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i27 = i23 + 1;
                if (z14) {
                    int i28 = this.L;
                    i15 = i27;
                    z12 = false;
                    childAt.setPadding(i28, 0, i28, 0);
                } else {
                    i15 = i27;
                    z12 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f651f = z12;
                cVar.f648c = z12 ? 1 : 0;
                cVar.f647b = z12;
                cVar.f649d = z12;
                cVar.leftMargin = z12;
                cVar.rightMargin = z12;
                cVar.f650e = z14 && ((ActionMenuItemView) childAt).f();
                int L2 = L(childAt, i20, cVar.f646a ? 1 : i18, childMeasureSpec, paddingTop);
                i24 = Math.max(i24, L2);
                if (cVar.f649d) {
                    i25++;
                }
                if (cVar.f646a) {
                    z13 = true;
                }
                i18 -= L2;
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                if (L2 == 1) {
                    j10 |= (long) (1 << i22);
                    i21 = i21;
                } else {
                    int i29 = i21;
                }
                i23 = i15;
            }
            i22++;
            size2 = i26;
        }
        int i30 = size2;
        boolean z15 = z13 && i23 == 2;
        boolean z16 = false;
        while (true) {
            if (i25 <= 0 || i18 <= 0) {
                i14 = mode;
                i12 = i16;
                z9 = z16;
                i13 = i21;
            } else {
                int i31 = 0;
                int i32 = 0;
                int i33 = Integer.MAX_VALUE;
                long j11 = 0;
                while (i32 < childCount) {
                    boolean z17 = z16;
                    c cVar2 = (c) getChildAt(i32).getLayoutParams();
                    int i34 = i21;
                    if (cVar2.f649d) {
                        int i35 = cVar2.f647b;
                        if (i35 < i33) {
                            j11 = 1 << i32;
                            i33 = i35;
                            i31 = 1;
                        } else if (i35 == i33) {
                            i31++;
                            j11 |= 1 << i32;
                        }
                    }
                    i32++;
                    i21 = i34;
                    z16 = z17;
                }
                z9 = z16;
                i13 = i21;
                j10 |= j11;
                if (i31 > i18) {
                    i14 = mode;
                    i12 = i16;
                    break;
                }
                int i36 = i33 + 1;
                int i37 = 0;
                while (i37 < childCount) {
                    View childAt2 = getChildAt(i37);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i38 = i16;
                    int i39 = mode;
                    long j12 = (long) (1 << i37);
                    if ((j11 & j12) == 0) {
                        if (cVar3.f647b == i36) {
                            j10 |= j12;
                        }
                        z11 = z15;
                    } else {
                        if (!z15 || !cVar3.f650e || i18 != 1) {
                            z11 = z15;
                        } else {
                            int i40 = this.L;
                            z11 = z15;
                            childAt2.setPadding(i40 + i20, 0, i40, 0);
                        }
                        cVar3.f647b++;
                        cVar3.f651f = true;
                        i18--;
                    }
                    i37++;
                    mode = i39;
                    i16 = i38;
                    z15 = z11;
                }
                i21 = i13;
                z16 = true;
            }
        }
        boolean z18 = !z13 && i23 == 1;
        if (i18 <= 0 || j10 == 0 || (i18 >= i23 - 1 && !z18 && i24 <= 1)) {
            z10 = z9;
        } else {
            float bitCount = (float) Long.bitCount(j10);
            if (!z18) {
                if ((j10 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f650e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount - 1;
                if ((j10 & ((long) (1 << i41))) != 0 && !((c) getChildAt(i41).getLayoutParams()).f650e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) (((float) (i18 * i20)) / bitCount) : 0;
            z10 = z9;
            for (int i43 = 0; i43 < childCount; i43++) {
                if ((j10 & ((long) (1 << i43))) != 0) {
                    View childAt3 = getChildAt(i43);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f648c = i42;
                        cVar4.f651f = true;
                        if (i43 == 0 && !cVar4.f650e) {
                            cVar4.leftMargin = (-i42) / 2;
                        }
                    } else if (cVar4.f646a) {
                        cVar4.f648c = i42;
                        cVar4.f651f = true;
                        cVar4.rightMargin = (-i42) / 2;
                    } else {
                        if (i43 != 0) {
                            cVar4.leftMargin = i42 / 2;
                        }
                        if (i43 != childCount - 1) {
                            cVar4.rightMargin = i42 / 2;
                        }
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            for (int i44 = 0; i44 < childCount; i44++) {
                View childAt4 = getChildAt(i44);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f651f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f647b * i20) + cVar5.f648c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, i14 != 1073741824 ? i13 : i30);
    }

    public void B() {
        c cVar = this.F;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public c F() {
        c C2 = m();
        C2.f646a = true;
        return C2;
    }

    /* access modifiers changed from: protected */
    public boolean G(int i10) {
        boolean z9 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z9 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z9 : z9 | ((a) childAt2).b();
    }

    public boolean H() {
        c cVar = this.F;
        return cVar != null && cVar.B();
    }

    public boolean I() {
        c cVar = this.F;
        return cVar != null && cVar.D();
    }

    public boolean J() {
        c cVar = this.F;
        return cVar != null && cVar.E();
    }

    public boolean K() {
        return this.E;
    }

    public androidx.appcompat.view.menu.e N() {
        return this.B;
    }

    public void O(j.a aVar, e.a aVar2) {
        this.G = aVar;
        this.H = aVar2;
    }

    public boolean P() {
        c cVar = this.F;
        return cVar != null && cVar.K();
    }

    public boolean a(g gVar) {
        return this.B.L(gVar, 0);
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        this.B = eVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.B == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.B = eVar;
            eVar.R(new d());
            c cVar = new c(context);
            this.F = cVar;
            cVar.J(true);
            c cVar2 = this.F;
            j.a aVar = this.G;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.k(aVar);
            this.B.c(this.F, this.C);
            this.F.H(this);
        }
        return this.B;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.F.A();
    }

    public int getPopupTheme() {
        return this.D;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.F;
        if (cVar != null) {
            cVar.f(false);
            if (this.F.E()) {
                this.F.B();
                this.F.K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.I) {
            super.onLayout(z9, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = h1.b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f646a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + cVar.leftMargin;
                        i15 = i14 + measuredWidth;
                    } else {
                        i15 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i14 = i15 - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i14, i21, i15, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    G(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (b10) {
            int width = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f646a) {
                    int i26 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width = i26 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f646a) {
                int i29 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = i29 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z9 = this.I;
        boolean z10 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.I = z10;
        if (z9 != z10) {
            this.J = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (!(!this.I || (eVar = this.B) == null || size == this.J)) {
            this.J = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (!this.I || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                c cVar = (c) getChildAt(i12).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        M(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z9) {
        this.F.G(z9);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.M = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.F.I(drawable);
    }

    public void setOverflowReserved(boolean z9) {
        this.E = z9;
    }

    public void setPopupTheme(int i10) {
        if (this.D != i10) {
            this.D = i10;
            if (i10 == 0) {
                this.C = getContext();
            } else {
                this.C = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.F = cVar;
        cVar.H(this);
    }
}
