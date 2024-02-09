package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

public final /* synthetic */ class c0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g0 f1739a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1740b;

    public /* synthetic */ c0(g0 g0Var, View view) {
        this.f1739a = g0Var;
        this.f1740b = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1739a.a(this.f1740b);
    }
}
