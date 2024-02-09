package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.x;
import f.f;
import f.j;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: m  reason: collision with root package name */
    private boolean f611m;

    /* renamed from: n  reason: collision with root package name */
    private View f612n;

    /* renamed from: o  reason: collision with root package name */
    private View f613o;

    /* renamed from: p  reason: collision with root package name */
    private View f614p;

    /* renamed from: q  reason: collision with root package name */
    Drawable f615q;

    /* renamed from: r  reason: collision with root package name */
    Drawable f616r;

    /* renamed from: s  reason: collision with root package name */
    Drawable f617s;

    /* renamed from: t  reason: collision with root package name */
    boolean f618t;

    /* renamed from: u  reason: collision with root package name */
    boolean f619u;

    /* renamed from: v  reason: collision with root package name */
    private int f620v;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x.j0(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f8588a);
        this.f615q = obtainStyledAttributes.getDrawable(j.f8593b);
        this.f616r = obtainStyledAttributes.getDrawable(j.f8603d);
        this.f620v = obtainStyledAttributes.getDimensionPixelSize(j.f8633j, -1);
        boolean z9 = true;
        if (getId() == f.split_action_bar) {
            this.f618t = true;
            this.f617s = obtainStyledAttributes.getDrawable(j.f8598c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f618t ? !(this.f615q == null && this.f616r == null) : this.f617s != null) {
            z9 = false;
        }
        setWillNotDraw(z9);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f615q;
        if (drawable != null && drawable.isStateful()) {
            this.f615q.setState(getDrawableState());
        }
        Drawable drawable2 = this.f616r;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f616r.setState(getDrawableState());
        }
        Drawable drawable3 = this.f617s;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f617s.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f612n;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f615q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f616r;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f617s;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f613o = findViewById(f.action_bar);
        this.f614p = findViewById(f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f611m || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z9, i10, i11, i12, i13);
        View view2 = this.f612n;
        boolean z10 = true;
        boolean z11 = false;
        boolean z12 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i10, (measuredHeight - view2.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f618t) {
            Drawable drawable3 = this.f617s;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f615q != null) {
                if (this.f613o.getVisibility() == 0) {
                    drawable2 = this.f615q;
                    left = this.f613o.getLeft();
                    top = this.f613o.getTop();
                    right = this.f613o.getRight();
                    view = this.f613o;
                } else {
                    View view3 = this.f614p;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f615q.setBounds(0, 0, 0, 0);
                        z11 = true;
                    } else {
                        drawable2 = this.f615q;
                        left = this.f614p.getLeft();
                        top = this.f614p.getTop();
                        right = this.f614p.getRight();
                        view = this.f614p;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z11 = true;
            }
            this.f619u = z12;
            if (!z12 || (drawable = this.f616r) == null) {
                z10 = z11;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z10) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f613o
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f620v
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f613o
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f612n
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f613o
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f613o
        L_0x0042:
            int r0 = r3.a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f614p
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f614p
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f612n
            int r1 = r3.a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f615q;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f615q);
        }
        this.f615q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f613o;
            if (view != null) {
                this.f615q.setBounds(view.getLeft(), this.f613o.getTop(), this.f613o.getRight(), this.f613o.getBottom());
            }
        }
        boolean z9 = true;
        if (!this.f618t ? !(this.f615q == null && this.f616r == null) : this.f617s != null) {
            z9 = false;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f617s;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f617s);
        }
        this.f617s = drawable;
        boolean z9 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f618t && (drawable2 = this.f617s) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f618t ? this.f615q == null && this.f616r == null : this.f617s == null) {
            z9 = true;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f616r;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f616r);
        }
        this.f616r = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f619u && (drawable2 = this.f616r) != null) {
                drawable2.setBounds(this.f612n.getLeft(), this.f612n.getTop(), this.f612n.getRight(), this.f612n.getBottom());
            }
        }
        boolean z9 = true;
        if (!this.f618t ? !(this.f615q == null && this.f616r == null) : this.f617s != null) {
            z9 = false;
        }
        setWillNotDraw(z9);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(t0 t0Var) {
        View view = this.f612n;
        if (view != null) {
            removeView(view);
        }
        this.f612n = t0Var;
        if (t0Var != null) {
            addView(t0Var);
            ViewGroup.LayoutParams layoutParams = t0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            t0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z9) {
        this.f611m = z9;
        setDescendantFocusability(z9 ? 393216 : 262144);
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z9 = i10 == 0;
        Drawable drawable = this.f615q;
        if (drawable != null) {
            drawable.setVisible(z9, false);
        }
        Drawable drawable2 = this.f616r;
        if (drawable2 != null) {
            drawable2.setVisible(z9, false);
        }
        Drawable drawable3 = this.f617s;
        if (drawable3 != null) {
            drawable3.setVisible(z9, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f615q && !this.f618t) || (drawable == this.f616r && this.f619u) || ((drawable == this.f617s && this.f618t) || super.verifyDrawable(drawable));
    }
}
