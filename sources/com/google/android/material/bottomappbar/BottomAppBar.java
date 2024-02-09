package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: g0  reason: collision with root package name */
    private final int f6892g0;

    /* renamed from: h0  reason: collision with root package name */
    private Animator f6893h0;
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public Animator f6894i0;
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public Animator f6895j0;

    /* renamed from: k0  reason: collision with root package name */
    private int f6896k0;

    /* renamed from: l0  reason: collision with root package name */
    private boolean f6897l0;

    /* renamed from: m0  reason: collision with root package name */
    private boolean f6898m0;

    /* renamed from: n0  reason: collision with root package name */
    AnimatorListenerAdapter f6899n0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d  reason: collision with root package name */
        private final Rect f6900d = new Rect();

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private boolean L(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f1184d = 17;
            bottomAppBar.Y(floatingActionButton);
            return true;
        }

        /* renamed from: H */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            FloatingActionButton S = bottomAppBar.d0();
            if (S != null) {
                L(S, bottomAppBar);
                S.i(this.f6900d);
                bottomAppBar.setFabDiameter(this.f6900d.height());
            }
            if (!bottomAppBar.g0()) {
                bottomAppBar.l0();
            }
            coordinatorLayout.I(bottomAppBar, i10);
            return super.l(coordinatorLayout, bottomAppBar, i10);
        }

        /* renamed from: I */
        public boolean z(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.z(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }

        /* access modifiers changed from: protected */
        /* renamed from: J */
        public void F(BottomAppBar bottomAppBar) {
            super.F(bottomAppBar);
            FloatingActionButton S = bottomAppBar.d0();
            if (S != null) {
                S.h(this.f6900d);
                S.clearAnimation();
                S.animate().translationY(((float) (-S.getPaddingBottom())) + ((float) (S.getMeasuredHeight() - this.f6900d.height()))).setInterpolator(f3.a.f8756c).setDuration(175);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: K */
        public void G(BottomAppBar bottomAppBar) {
            super.G(bottomAppBar);
            FloatingActionButton S = bottomAppBar.d0();
            if (S != null) {
                S.clearAnimation();
                S.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(f3.a.f8757d).setDuration(225);
            }
        }
    }

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            Animator unused = BottomAppBar.this.f6894i0 = null;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        public void onAnimationEnd(Animator animator) {
            Animator unused = BottomAppBar.this.f6895j0 = null;
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6903a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f6904b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f6905c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f6906d;

        c(ActionMenuView actionMenuView, int i10, boolean z9) {
            this.f6904b = actionMenuView;
            this.f6905c = i10;
            this.f6906d = z9;
        }

        public void onAnimationCancel(Animator animator) {
            this.f6903a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f6903a) {
                BottomAppBar.this.m0(this.f6904b, this.f6905c, this.f6906d);
            }
        }
    }

    static class d extends w.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: o  reason: collision with root package name */
        int f6908o;

        /* renamed from: p  reason: collision with root package name */
        boolean f6909p;

        static class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            /* renamed from: c */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6908o = parcel.readInt();
            this.f6909p = parcel.readInt() != 0;
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f6908o);
            parcel.writeInt(this.f6909p ? 1 : 0);
        }
    }

    /* access modifiers changed from: private */
    public void Y(FloatingActionButton floatingActionButton) {
        k0(floatingActionButton);
        floatingActionButton.e(this.f6899n0);
        floatingActionButton.f(this.f6899n0);
    }

    private void Z() {
        Animator animator = this.f6893h0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f6895j0;
        if (animator2 != null) {
            animator2.cancel();
        }
        Animator animator3 = this.f6894i0;
        if (animator3 != null) {
            animator3.cancel();
        }
    }

    private void a0(int i10, List<Animator> list) {
        if (this.f6898m0) {
            throw null;
        }
    }

    private void b0(int i10, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d0(), "translationX", new float[]{(float) e0(i10)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    private void c0(int i10, boolean z9, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if ((this.f6898m0 || (z9 && h0())) && (this.f6896k0 == 1 || i10 == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new c(actionMenuView, i10, z9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    public FloatingActionButton d0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View next : ((CoordinatorLayout) getParent()).s(this)) {
            if (next instanceof FloatingActionButton) {
                return (FloatingActionButton) next;
            }
        }
        return null;
    }

    private int e0(int i10) {
        int i11 = 1;
        boolean z9 = x.z(this) == 1;
        if (i10 != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f6892g0;
        if (z9) {
            i11 = -1;
        }
        return measuredWidth * i11;
    }

    private float f0(boolean z9) {
        FloatingActionButton d02 = d0();
        if (d02 == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        d02.h(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) d02.getMeasuredHeight();
        }
        float height2 = (float) (d02.getHeight() - rect.height());
        float height3 = (-getCradleVerticalOffset()) + (height / 2.0f) + ((float) (d02.getHeight() - rect.bottom));
        float paddingBottom = height2 - ((float) d02.getPaddingBottom());
        float f10 = (float) (-getMeasuredHeight());
        if (!z9) {
            height3 = paddingBottom;
        }
        return f10 + height3;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f6895j0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = r1.f6894i0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g0() {
        /*
            r1 = this;
            android.animation.Animator r0 = r1.f6893h0
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001e
        L_0x000a:
            android.animation.Animator r0 = r1.f6895j0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x001e
        L_0x0014:
            android.animation.Animator r0 = r1.f6894i0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.g0():boolean");
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return (float) e0(this.f6896k0);
    }

    /* access modifiers changed from: private */
    public float getFabTranslationY() {
        return f0(this.f6898m0);
    }

    private boolean h0() {
        FloatingActionButton d02 = d0();
        return d02 != null && d02.l();
    }

    private void i0(int i10, boolean z9) {
        if (x.P(this)) {
            Animator animator = this.f6895j0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!h0()) {
                i10 = 0;
                z9 = false;
            }
            c0(i10, z9, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f6895j0 = animatorSet;
            animatorSet.addListener(new b());
            this.f6895j0.start();
        }
    }

    private void j0(int i10) {
        if (this.f6896k0 != i10 && x.P(this)) {
            Animator animator = this.f6894i0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            a0(i10, arrayList);
            b0(i10, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f6894i0 = animatorSet;
            animatorSet.addListener(new a());
            this.f6894i0.start();
        }
    }

    private void k0(FloatingActionButton floatingActionButton) {
        floatingActionButton.o(this.f6899n0);
        floatingActionButton.p(this.f6899n0);
    }

    /* access modifiers changed from: private */
    public void l0() {
        getFabTranslationX();
        throw null;
    }

    /* access modifiers changed from: private */
    public void m0(ActionMenuView actionMenuView, int i10, boolean z9) {
        boolean z10 = x.z(this) == 1;
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f307a & 8388615) == 8388611) {
                i11 = Math.max(i11, z10 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i10 != 1 || !z9) ? 0.0f : (float) (i11 - (z10 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public CoordinatorLayout.c<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.f6896k0;
    }

    public float getFabCradleMargin() {
        throw null;
    }

    public float getFabCradleRoundedCornerRadius() {
        throw null;
    }

    public boolean getHideOnScroll() {
        return this.f6897l0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        Z();
        l0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.f6896k0 = dVar.f6908o;
        this.f6898m0 = dVar.f6909p;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f6908o = this.f6896k0;
        dVar.f6909p = this.f6898m0;
        return dVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        androidx.core.graphics.drawable.a.o((Drawable) null, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            throw null;
        }
    }

    public void setFabAlignmentMode(int i10) {
        j0(i10);
        i0(i10, this.f6898m0);
        this.f6896k0 = i10;
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setFabDiameter(int i10) {
        throw null;
    }

    public void setHideOnScroll(boolean z9) {
        this.f6897l0 = z9;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }
}
