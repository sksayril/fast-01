package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.e;
import androidx.core.view.v;
import androidx.fragment.app.x;

class f {

    class a implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f2469a;

        a(Fragment fragment) {
            this.f2469a = fragment;
        }

        public void a() {
            if (this.f2469a.q() != null) {
                View q9 = this.f2469a.q();
                this.f2469a.r1((View) null);
                q9.clearAnimation();
            }
            this.f2469a.t1((Animator) null);
        }
    }

    class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2470a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f2471b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x.g f2472c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2473d;

        class a implements Runnable {
            a() {
            }

            public void run() {
                if (b.this.f2471b.q() != null) {
                    b.this.f2471b.r1((View) null);
                    b bVar = b.this;
                    bVar.f2472c.a(bVar.f2471b, bVar.f2473d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, x.g gVar, androidx.core.os.e eVar) {
            this.f2470a = viewGroup;
            this.f2471b = fragment;
            this.f2472c = gVar;
            this.f2473d = eVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2470a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2475a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2476b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f2477c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ x.g f2478d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2479e;

        c(ViewGroup viewGroup, View view, Fragment fragment, x.g gVar, androidx.core.os.e eVar) {
            this.f2475a = viewGroup;
            this.f2476b = view;
            this.f2477c = fragment;
            this.f2478d = gVar;
            this.f2479e = eVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2475a.endViewTransition(this.f2476b);
            Animator r9 = this.f2477c.r();
            this.f2477c.t1((Animator) null);
            if (r9 != null && this.f2475a.indexOfChild(this.f2476b) < 0) {
                this.f2478d.a(this.f2477c, this.f2479e);
            }
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f2480a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f2481b;

        d(Animator animator) {
            this.f2480a = null;
            this.f2481b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        d(Animation animation) {
            this.f2480a = animation;
            this.f2481b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class e extends AnimationSet implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private final ViewGroup f2482m;

        /* renamed from: n  reason: collision with root package name */
        private final View f2483n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f2484o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f2485p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f2486q = true;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2482m = viewGroup;
            this.f2483n = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j10, Transformation transformation) {
            this.f2486q = true;
            if (this.f2484o) {
                return !this.f2485p;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2484o = true;
                v.a(this.f2482m, this);
            }
            return true;
        }

        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2486q = true;
            if (this.f2484o) {
                return !this.f2485p;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2484o = true;
                v.a(this.f2482m, this);
            }
            return true;
        }

        public void run() {
            if (this.f2484o || !this.f2486q) {
                this.f2482m.endViewTransition(this.f2483n);
                this.f2485p = true;
                return;
            }
            this.f2486q = false;
            this.f2482m.post(this);
        }
    }

    static void a(Fragment fragment, d dVar, x.g gVar) {
        View view = fragment.T;
        ViewGroup viewGroup = fragment.S;
        viewGroup.startViewTransition(view);
        androidx.core.os.e eVar = new androidx.core.os.e();
        eVar.c(new a(fragment));
        gVar.b(fragment, eVar);
        if (dVar.f2480a != null) {
            e eVar2 = new e(dVar.f2480a, viewGroup, view);
            fragment.r1(fragment.T);
            eVar2.setAnimationListener(new b(viewGroup, fragment, gVar, eVar));
            fragment.T.startAnimation(eVar2);
            return;
        }
        Animator animator = dVar.f2481b;
        fragment.t1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, eVar));
        animator.setTarget(fragment.T);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z9, boolean z10) {
        return z10 ? z9 ? fragment.I() : fragment.J() : z9 ? fragment.u() : fragment.x();
    }

    static d c(Context context, Fragment fragment, boolean z9, boolean z10) {
        int E = fragment.E();
        int b10 = b(fragment, z9, z10);
        boolean z11 = false;
        fragment.s1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.S;
        if (viewGroup != null) {
            int i10 = f0.b.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i10) != null) {
                fragment.S.setTag(i10, (Object) null);
            }
        }
        ViewGroup viewGroup2 = fragment.S;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation n02 = fragment.n0(E, z9, b10);
        if (n02 != null) {
            return new d(n02);
        }
        Animator o02 = fragment.o0(E, z9, b10);
        if (o02 != null) {
            return new d(o02);
        }
        if (b10 == 0 && E != 0) {
            b10 = d(E, z9);
        }
        if (b10 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b10));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b10);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    z11 = true;
                } catch (Resources.NotFoundException e10) {
                    throw e10;
                } catch (RuntimeException unused) {
                }
            }
            if (!z11) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, b10);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                } catch (RuntimeException e11) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b10);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    } else {
                        throw e11;
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i10, boolean z9) {
        if (i10 == 4097) {
            return z9 ? f0.a.fragment_open_enter : f0.a.fragment_open_exit;
        }
        if (i10 == 4099) {
            return z9 ? f0.a.fragment_fade_enter : f0.a.fragment_fade_exit;
        }
        if (i10 != 8194) {
            return -1;
        }
        return z9 ? f0.a.fragment_close_enter : f0.a.fragment_close_exit;
    }
}
