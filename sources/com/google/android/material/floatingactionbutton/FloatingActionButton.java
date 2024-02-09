package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.f;
import e3.c;
import e3.i;
import f3.h;
import java.util.List;

@CoordinatorLayout.d(Behavior.class)
public class FloatingActionButton extends f implements i3.a {
    private a A;

    /* renamed from: n  reason: collision with root package name */
    private ColorStateList f6971n;

    /* renamed from: o  reason: collision with root package name */
    private PorterDuff.Mode f6972o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f6973p;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f6974q;

    /* renamed from: r  reason: collision with root package name */
    private ColorStateList f6975r;

    /* renamed from: s  reason: collision with root package name */
    private int f6976s;

    /* renamed from: t  reason: collision with root package name */
    private int f6977t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public int f6978u;

    /* renamed from: v  reason: collision with root package name */
    private int f6979v;

    /* renamed from: w  reason: collision with root package name */
    boolean f6980w;

    /* renamed from: x  reason: collision with root package name */
    final Rect f6981x;

    /* renamed from: y  reason: collision with root package name */
    private final Rect f6982y;

    /* renamed from: z  reason: collision with root package name */
    private final q f6983z;

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f6984a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f6985b;

        public BaseBehavior() {
            this.f6985b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.K);
            this.f6985b = obtainStyledAttributes.getBoolean(i.L, true);
            obtainStyledAttributes.recycle();
        }

        private static boolean E(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void F(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f6981x;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                int i10 = 0;
                int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - fVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= fVar.leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - fVar.bottomMargin) {
                    i10 = rect.bottom;
                } else if (floatingActionButton.getTop() <= fVar.topMargin) {
                    i10 = -rect.top;
                }
                if (i10 != 0) {
                    x.W(floatingActionButton, i10);
                }
                if (i11 != 0) {
                    x.V(floatingActionButton, i11);
                }
            }
        }

        private boolean I(View view, FloatingActionButton floatingActionButton) {
            return this.f6985b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean J(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!I(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f6984a == null) {
                this.f6984a = new Rect();
            }
            Rect rect = this.f6984a;
            com.google.android.material.internal.a.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.k((a) null, false);
                return true;
            }
            floatingActionButton.r((a) null, false);
            return true;
        }

        private boolean K(View view, FloatingActionButton floatingActionButton) {
            if (!I(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.k((a) null, false);
                return true;
            }
            floatingActionButton.r((a) null, false);
            return true;
        }

        /* renamed from: D */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f6981x;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        /* renamed from: G */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                J(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!E(view)) {
                return false;
            } else {
                K(view, floatingActionButton);
                return false;
            }
        }

        /* renamed from: H */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List<View> r9 = coordinatorLayout.r(floatingActionButton);
            int size = r9.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = r9.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (E(view) && K(view, floatingActionButton)) {
                        break;
                    }
                } else if (J(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.I(floatingActionButton, i10);
            F(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f1188h == 0) {
                fVar.f1188h = 80;
            }
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        public /* bridge */ /* synthetic */ boolean G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.h(coordinatorLayout, floatingActionButton, view);
        }

        public /* bridge */ /* synthetic */ boolean H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.l(coordinatorLayout, floatingActionButton, i10);
        }

        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }
    }

    public static abstract class a {
    }

    private class b implements m3.b {
        b() {
        }

        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f6981x.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f6978u, i11 + FloatingActionButton.this.f6978u, i12 + FloatingActionButton.this.f6978u, i13 + FloatingActionButton.this.f6978u);
        }

        public void b(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        public boolean c() {
            return FloatingActionButton.this.f6980w;
        }

        public float d() {
            return ((float) FloatingActionButton.this.getSizeDimension()) / 2.0f;
        }
    }

    private a g() {
        return new b(this, new b());
    }

    private a getImpl() {
        if (this.A == null) {
            this.A = g();
        }
        return this.A;
    }

    private int j(int i10) {
        int i11 = this.f6977t;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? j(1) : j(0);
        }
        return resources.getDimensionPixelSize(i10 != 1 ? c.design_fab_size_normal : c.design_fab_size_mini);
    }

    private void m(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f6981x;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void n() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f6973p;
            if (colorStateList == null) {
                androidx.core.graphics.drawable.a.c(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f6974q;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(k.e(colorForState, mode));
        }
    }

    private static int q(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i10, size);
        }
        if (mode == 0) {
            return i10;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    private a.g s(a aVar) {
        return null;
    }

    public boolean a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().w(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().a(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().b(animatorListener);
    }

    public ColorStateList getBackgroundTintList() {
        return this.f6971n;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f6972o;
    }

    public float getCompatElevation() {
        return getImpl().j();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().l();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().n();
    }

    public Drawable getContentBackground() {
        return getImpl().g();
    }

    public int getCustomSize() {
        return this.f6977t;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public h getHideMotionSpec() {
        return getImpl().k();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f6975r;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f6975r;
    }

    public h getShowMotionSpec() {
        return getImpl().o();
    }

    public int getSize() {
        return this.f6976s;
    }

    /* access modifiers changed from: package-private */
    public int getSizeDimension() {
        return j(this.f6976s);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f6973p;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f6974q;
    }

    public boolean getUseCompatPadding() {
        return this.f6980w;
    }

    @Deprecated
    public boolean h(Rect rect) {
        if (!x.P(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        m(rect);
        return true;
    }

    public void i(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        m(rect);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().s();
    }

    /* access modifiers changed from: package-private */
    public void k(a aVar, boolean z9) {
        getImpl().p(s(aVar), z9);
    }

    public boolean l() {
        return getImpl().r();
    }

    public void o(Animator.AnimatorListener animatorListener) {
        getImpl().A(animatorListener);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().t();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().v();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f6978u = (sizeDimension - this.f6979v) / 2;
        getImpl().Q();
        int min = Math.min(q(sizeDimension, i10), q(sizeDimension, i11));
        Rect rect = this.f6981x;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof n3.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        n3.a aVar = (n3.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        Bundle bundle = aVar.f11295o.get("expandableWidgetHelper");
        throw null;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        new n3.a(super.onSaveInstanceState());
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || !h(this.f6982y) || this.f6982y.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void p(Animator.AnimatorListener animatorListener) {
        getImpl().B(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void r(a aVar, boolean z9) {
        getImpl().N(s(aVar), z9);
    }

    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f6971n != colorStateList) {
            this.f6971n = colorStateList;
            getImpl().D(colorStateList);
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f6972o != mode) {
            this.f6972o = mode;
            getImpl().E(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().F(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().H(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().J(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 >= 0) {
            this.f6977t = i10;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i10) {
        throw null;
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().G(hVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.b(getContext(), i10));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        getImpl().P();
    }

    public void setImageResource(int i10) {
        this.f6983z.i(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f6975r != colorStateList) {
            this.f6975r = colorStateList;
            getImpl().K(this.f6975r);
        }
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().L(hVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f6977t = 0;
        if (i10 != this.f6976s) {
            this.f6976s = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f6973p != colorStateList) {
            this.f6973p = colorStateList;
            n();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f6974q != mode) {
            this.f6974q = mode;
            n();
        }
    }

    public void setUseCompatPadding(boolean z9) {
        if (this.f6980w != z9) {
            this.f6980w = z9;
            getImpl().u();
        }
    }
}
