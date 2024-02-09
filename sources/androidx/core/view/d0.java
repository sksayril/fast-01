package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<View> f1742a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f1743b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f1744c = null;

    /* renamed from: d  reason: collision with root package name */
    int f1745d = -1;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e0 f1746a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1747b;

        a(e0 e0Var, View view) {
            this.f1746a = e0Var;
            this.f1747b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1746a.a(this.f1747b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1746a.b(this.f1747b);
        }

        public void onAnimationStart(Animator animator) {
            this.f1746a.c(this.f1747b);
        }
    }

    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    d0(View view) {
        this.f1742a = new WeakReference<>(view);
    }

    private void i(View view, e0 e0Var) {
        if (e0Var != null) {
            view.animate().setListener(new a(e0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public d0 b(float f10) {
        View view = (View) this.f1742a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f1742a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f1742a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    public d0 f(long j10) {
        View view = (View) this.f1742a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public d0 g(Interpolator interpolator) {
        View view = (View) this.f1742a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public d0 h(e0 e0Var) {
        View view = (View) this.f1742a.get();
        if (view != null) {
            i(view, e0Var);
        }
        return this;
    }

    public d0 j(long j10) {
        View view = (View) this.f1742a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public d0 k(g0 g0Var) {
        View view = (View) this.f1742a.get();
        if (view != null) {
            c0 c0Var = null;
            if (g0Var != null) {
                c0Var = new c0(g0Var, view);
            }
            b.a(view.animate(), c0Var);
        }
        return this;
    }

    public void l() {
        View view = (View) this.f1742a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public d0 m(float f10) {
        View view = (View) this.f1742a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
