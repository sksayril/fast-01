package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.d0;
import androidx.core.view.x;
import f.f;
import f.g;
import f.j;
import j.b;

public class ActionBarContextView extends a {
    private TextView A;
    private TextView B;
    private int C;
    private int D;
    private boolean E;
    private int F;

    /* renamed from: u  reason: collision with root package name */
    private CharSequence f621u;

    /* renamed from: v  reason: collision with root package name */
    private CharSequence f622v;

    /* renamed from: w  reason: collision with root package name */
    private View f623w;

    /* renamed from: x  reason: collision with root package name */
    private View f624x;

    /* renamed from: y  reason: collision with root package name */
    private View f625y;

    /* renamed from: z  reason: collision with root package name */
    private LinearLayout f626z;

    class a implements View.OnClickListener {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f627m;

        a(b bVar) {
            this.f627m = bVar;
        }

        public void onClick(View view) {
            this.f627m.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a1 u9 = a1.u(context, attributeSet, j.f8708y, i10, 0);
        x.j0(this, u9.f(j.f8713z));
        this.C = u9.m(j.D, 0);
        this.D = u9.m(j.C, 0);
        this.f756q = u9.l(j.B, 0);
        this.F = u9.m(j.A, g.abc_action_mode_close_item_material);
        u9.v();
    }

    private void i() {
        if (this.f626z == null) {
            LayoutInflater.from(getContext()).inflate(g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f626z = linearLayout;
            this.A = (TextView) linearLayout.findViewById(f.action_bar_title);
            this.B = (TextView) this.f626z.findViewById(f.action_bar_subtitle);
            if (this.C != 0) {
                this.A.setTextAppearance(getContext(), this.C);
            }
            if (this.D != 0) {
                this.B.setTextAppearance(getContext(), this.D);
            }
        }
        this.A.setText(this.f621u);
        this.B.setText(this.f622v);
        boolean z9 = !TextUtils.isEmpty(this.f621u);
        boolean z10 = !TextUtils.isEmpty(this.f622v);
        int i10 = 0;
        this.B.setVisibility(z10 ? 0 : 8);
        LinearLayout linearLayout2 = this.f626z;
        if (!z9 && !z10) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f626z.getParent() == null) {
            addView(this.f626z);
        }
    }

    public /* bridge */ /* synthetic */ d0 f(int i10, long j10) {
        return super.f(i10, j10);
    }

    public void g() {
        if (this.f623w == null) {
            k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f622v;
    }

    public CharSequence getTitle() {
        return this.f621u;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h(j.b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f623w
            if (r0 != 0) goto L_0x0019
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.F
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f623w = r0
        L_0x0015:
            r3.addView(r0)
            goto L_0x0022
        L_0x0019:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0022
            android.view.View r0 = r3.f623w
            goto L_0x0015
        L_0x0022:
            android.view.View r0 = r3.f623w
            int r1 = f.f.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r3.f624x = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.e) r4
            androidx.appcompat.widget.c r0 = r3.f755p
            if (r0 == 0) goto L_0x0041
            r0.y()
        L_0x0041:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f755p = r0
            r1 = 1
            r0.J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.c r1 = r3.f755p
            android.content.Context r2 = r3.f753n
            r4.c(r1, r2)
            androidx.appcompat.widget.c r4 = r3.f755p
            androidx.appcompat.view.menu.k r4 = r4.o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f754o = r4
            r1 = 0
            androidx.core.view.x.j0(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f754o
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.h(j.b):void");
    }

    public boolean j() {
        return this.E;
    }

    public void k() {
        removeAllViews();
        this.f625y = null;
        this.f754o = null;
        this.f755p = null;
        View view = this.f624x;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public boolean l() {
        c cVar = this.f755p;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f755p;
        if (cVar != null) {
            cVar.B();
            this.f755p.C();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean b10 = h1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f623w;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f623w.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d10 = a.d(paddingRight, i14, b10);
            paddingRight = a.d(d10 + e(this.f623w, d10, paddingTop, paddingTop2, b10), i15, b10);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f626z;
        if (!(linearLayout == null || this.f625y != null || linearLayout.getVisibility() == 8)) {
            i16 += e(this.f626z, i16, paddingTop, paddingTop2, b10);
        }
        int i17 = i16;
        View view2 = this.f625y;
        if (view2 != null) {
            e(view2, i17, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f754o;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.f756q;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
            View view = this.f623w;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f623w.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f754o;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f754o, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f626z;
            if (linearLayout != null && this.f625y == null) {
                if (this.E) {
                    this.f626z.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f626z.getMeasuredWidth();
                    boolean z9 = measuredWidth <= paddingLeft;
                    if (z9) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f626z.setVisibility(z9 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f625y;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.f625y.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.f756q <= 0) {
                int childCount = getChildCount();
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i18) {
                        i18 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i18);
                return;
            }
            setMeasuredDimension(size, i13);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i10) {
        this.f756q = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f625y;
        if (view2 != null) {
            removeView(view2);
        }
        this.f625y = view;
        if (!(view == null || (linearLayout = this.f626z) == null)) {
            removeView(linearLayout);
            this.f626z = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f622v = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f621u = charSequence;
        i();
        x.i0(this, charSequence);
    }

    public void setTitleOptional(boolean z9) {
        if (z9 != this.E) {
            requestLayout();
        }
        this.E = z9;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
