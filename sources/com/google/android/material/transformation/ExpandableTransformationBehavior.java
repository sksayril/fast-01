package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f7069b;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            AnimatorSet unused = ExpandableTransformationBehavior.this.f7069b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean G(View view, View view2, boolean z9, boolean z10) {
        AnimatorSet animatorSet = this.f7069b;
        boolean z11 = animatorSet != null;
        if (z11) {
            animatorSet.cancel();
        }
        AnimatorSet I = I(view, view2, z9, z11);
        this.f7069b = I;
        I.addListener(new a());
        this.f7069b.start();
        if (!z10) {
            this.f7069b.end();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract AnimatorSet I(View view, View view2, boolean z9, boolean z10);
}
