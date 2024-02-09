package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    private int f6872a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f6873b = 2;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ViewPropertyAnimator f6874c;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f6874c = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void E(V v9, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f6874c = v9.animate().translationY((float) i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    /* access modifiers changed from: protected */
    public void F(V v9) {
        ViewPropertyAnimator viewPropertyAnimator = this.f6874c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v9.clearAnimation();
        }
        this.f6873b = 1;
        E(v9, this.f6872a, 175, f3.a.f8756c);
    }

    /* access modifiers changed from: protected */
    public void G(V v9) {
        ViewPropertyAnimator viewPropertyAnimator = this.f6874c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v9.clearAnimation();
        }
        this.f6873b = 2;
        E(v9, 0, 225, f3.a.f8757d);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, V v9, int i10) {
        this.f6872a = v9.getMeasuredHeight();
        return super.l(coordinatorLayout, v9, i10);
    }

    public void r(CoordinatorLayout coordinatorLayout, V v9, View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f6873b;
        if (i14 != 1 && i11 > 0) {
            F(v9);
        } else if (i14 != 2 && i11 < 0) {
            G(v9);
        }
    }

    public boolean y(CoordinatorLayout coordinatorLayout, V v9, View view, View view2, int i10) {
        return i10 == 2;
    }
}
