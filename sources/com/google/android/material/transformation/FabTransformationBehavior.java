package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f3.h;
import f3.i;
import f3.j;
import g3.d;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    private final Rect f7071c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final RectF f7072d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f7073e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f7074f = new int[2];

    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f7075a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f7076b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f7077c;

        a(boolean z9, View view, View view2) {
            this.f7075a = z9;
            this.f7076b = view;
            this.f7077c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f7075a) {
                this.f7076b.setVisibility(4);
                this.f7077c.setAlpha(1.0f);
                this.f7077c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f7075a) {
                this.f7076b.setVisibility(0);
                this.f7077c.setAlpha(0.0f);
                this.f7077c.setVisibility(4);
            }
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f7079a;

        b(View view) {
            this.f7079a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7079a.invalidate();
        }
    }

    class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g3.d f7081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Drawable f7082b;

        c(g3.d dVar, Drawable drawable) {
            this.f7081a = dVar;
            this.f7082b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f7081a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f7081a.setCircularRevealOverlayDrawable(this.f7082b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g3.d f7084a;

        d(g3.d dVar) {
            this.f7084a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            d.e revealInfo = this.f7084a.getRevealInfo();
            revealInfo.f8926c = Float.MAX_VALUE;
            this.f7084a.setRevealInfo(revealInfo);
        }
    }

    protected static class e {

        /* renamed from: a  reason: collision with root package name */
        public h f7086a;

        /* renamed from: b  reason: collision with root package name */
        public j f7087b;

        protected e() {
        }
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private ViewGroup J(View view) {
        View findViewById = view.findViewById(e3.e.mtrl_child_content_container);
        return findViewById != null ? b0(findViewById) : ((view instanceof o3.b) || (view instanceof o3.a)) ? b0(((ViewGroup) view).getChildAt(0)) : b0(view);
    }

    private void K(View view, e eVar, i iVar, i iVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float P = P(eVar, iVar, f10, f12);
        float P2 = P(eVar, iVar2, f11, f13);
        Rect rect = this.f7071c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f7072d;
        rectF2.set(rect);
        RectF rectF3 = this.f7073e;
        Q(view, rectF3);
        rectF3.offset(P, P2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private float L(View view, View view2, j jVar) {
        RectF rectF = this.f7072d;
        RectF rectF2 = this.f7073e;
        Q(view, rectF);
        Q(view2, rectF2);
        rectF2.offset(-N(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private float M(View view, View view2, j jVar) {
        RectF rectF = this.f7072d;
        RectF rectF2 = this.f7073e;
        Q(view, rectF);
        Q(view2, rectF2);
        rectF2.offset(0.0f, -O(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    private float N(View view, View view2, j jVar) {
        float f10;
        float f11;
        float f12;
        RectF rectF = this.f7072d;
        RectF rectF2 = this.f7073e;
        Q(view, rectF);
        Q(view2, rectF2);
        int i10 = jVar.f8773a & 7;
        if (i10 == 1) {
            f12 = rectF2.centerX();
            f11 = rectF.centerX();
        } else if (i10 == 3) {
            f12 = rectF2.left;
            f11 = rectF.left;
        } else if (i10 != 5) {
            f10 = 0.0f;
            return f10 + jVar.f8774b;
        } else {
            f12 = rectF2.right;
            f11 = rectF.right;
        }
        f10 = f12 - f11;
        return f10 + jVar.f8774b;
    }

    private float O(View view, View view2, j jVar) {
        float f10;
        float f11;
        float f12;
        RectF rectF = this.f7072d;
        RectF rectF2 = this.f7073e;
        Q(view, rectF);
        Q(view2, rectF2);
        int i10 = jVar.f8773a & 112;
        if (i10 == 16) {
            f12 = rectF2.centerY();
            f11 = rectF.centerY();
        } else if (i10 == 48) {
            f12 = rectF2.top;
            f11 = rectF.top;
        } else if (i10 != 80) {
            f10 = 0.0f;
            return f10 + jVar.f8775c;
        } else {
            f12 = rectF2.bottom;
            f11 = rectF.bottom;
        }
        f10 = f12 - f11;
        return f10 + jVar.f8775c;
    }

    private float P(e eVar, i iVar, float f10, float f11) {
        long c10 = iVar.c();
        long d10 = iVar.d();
        i d11 = eVar.f7086a.d("expansion");
        return f3.a.a(f10, f11, iVar.e().getInterpolation(((float) (((d11.c() + d11.d()) + 17) - c10)) / ((float) d10)));
    }

    private void Q(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f7074f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    private void R(View view, View view2, boolean z9, boolean z10, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup J;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof g3.d) || g3.c.f8919a != 0) && (J = J(view2)) != null) {
                if (z9) {
                    if (!z10) {
                        f3.d.f8760a.set(J, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(J, f3.d.f8760a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(J, f3.d.f8760a, new float[]{0.0f});
                }
                eVar.f7086a.d("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    private void S(View view, View view2, boolean z9, boolean z10, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof g3.d) {
            g3.d dVar = (g3.d) view2;
            int Z = Z(view);
            int i10 = 16777215 & Z;
            if (z9) {
                if (!z10) {
                    dVar.setCircularRevealScrimColor(Z);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, d.C0139d.f8923a, new int[]{i10});
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, d.C0139d.f8923a, new int[]{Z});
            }
            objectAnimator.setEvaluator(f3.c.b());
            eVar.f7086a.d("color").a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    @TargetApi(21)
    private void T(View view, View view2, boolean z9, boolean z10, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float t9 = x.t(view2) - x.t(view);
        if (z9) {
            if (!z10) {
                view2.setTranslationZ(-t9);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-t9});
        }
        eVar.f7086a.d("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    private void U(View view, View view2, boolean z9, boolean z10, e eVar, float f10, float f11, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        e eVar2 = eVar;
        if (view4 instanceof g3.d) {
            g3.d dVar = (g3.d) view4;
            float L = L(view3, view4, eVar2.f7087b);
            float M = M(view3, view4, eVar2.f7087b);
            ((FloatingActionButton) view3).h(this.f7071c);
            float width = ((float) this.f7071c.width()) / 2.0f;
            i d10 = eVar2.f7086a.d("expansion");
            if (z9) {
                if (!z10) {
                    dVar.setRevealInfo(new d.e(L, M, width));
                }
                if (z10) {
                    width = dVar.getRevealInfo().f8926c;
                }
                animator = g3.a.a(dVar, L, M, j3.a.b(L, M, 0.0f, 0.0f, f10, f11));
                animator.addListener(new d(dVar));
                X(view2, d10.c(), (int) L, (int) M, width, list);
            } else {
                float f12 = dVar.getRevealInfo().f8926c;
                Animator a10 = g3.a.a(dVar, L, M, width);
                int i10 = (int) L;
                int i11 = (int) M;
                View view5 = view2;
                X(view5, d10.c(), i10, i11, f12, list);
                long c10 = d10.c();
                long d11 = d10.d();
                long e10 = eVar2.f7086a.e();
                W(view5, c10, d11, e10, i10, i11, width, list);
                animator = a10;
            }
            d10.a(animator);
            list.add(animator);
            list2.add(g3.a.b(dVar));
        }
    }

    private void V(View view, View view2, boolean z9, boolean z10, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof g3.d) && (view instanceof ImageView)) {
            g3.d dVar = (g3.d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z9) {
                    if (!z10) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, f3.e.f8761b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, f3.e.f8761b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new b(view2));
                eVar.f7086a.d("iconFade").a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new c(dVar, drawable));
            }
        }
    }

    private void W(View view, long j10, long j11, long j12, int i10, int i11, float f10, List<Animator> list) {
        long j13 = j10 + j11;
        if (j13 < j12) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(j13);
            createCircularReveal.setDuration(j12 - j13);
            list.add(createCircularReveal);
        }
    }

    private void X(View view, long j10, int i10, int i11, float f10, List<Animator> list) {
        if (j10 > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i10, i11, f10, f10);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j10);
            list.add(createCircularReveal);
        }
    }

    private void Y(View view, View view2, boolean z9, boolean z10, e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        String str;
        h hVar;
        i iVar;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        int i10;
        View view3 = view;
        View view4 = view2;
        e eVar2 = eVar;
        List<Animator> list3 = list;
        float N = N(view3, view4, eVar2.f7087b);
        float O = O(view3, view4, eVar2.f7087b);
        if (N == 0.0f || O == 0.0f) {
            iVar = eVar2.f7086a.d("translationXLinear");
            hVar = eVar2.f7086a;
            str = "translationYLinear";
        } else if ((!z9 || O >= 0.0f) && (z9 || i10 <= 0)) {
            iVar = eVar2.f7086a.d("translationXCurveDownwards");
            hVar = eVar2.f7086a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar2.f7086a.d("translationXCurveUpwards");
            hVar = eVar2.f7086a;
            str = "translationYCurveUpwards";
        }
        i iVar2 = iVar;
        i d10 = hVar.d(str);
        if (z9) {
            if (!z10) {
                view4.setTranslationX(-N);
                view4.setTranslationY(-O);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            K(view2, eVar, iVar2, d10, -N, -O, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-N});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-O});
        }
        iVar2.a(objectAnimator2);
        d10.a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    private int Z(View view) {
        ColorStateList p10 = x.p(view);
        if (p10 != null) {
            return p10.getColorForState(view.getDrawableState(), p10.getDefaultColor());
        }
        return 0;
    }

    private ViewGroup b0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public AnimatorSet I(View view, View view2, boolean z9, boolean z10) {
        boolean z11 = z9;
        e a02 = a0(view2.getContext(), z11);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        T(view, view2, z9, z10, a02, arrayList, arrayList2);
        RectF rectF = this.f7072d;
        View view3 = view;
        View view4 = view2;
        boolean z12 = z9;
        boolean z13 = z10;
        e eVar = a02;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        Y(view3, view4, z12, z13, eVar, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        V(view3, view4, z12, z13, eVar, arrayList3, arrayList4);
        U(view3, view4, z12, z13, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        S(view3, view4, z12, z13, eVar, arrayList5, arrayList6);
        R(view3, view4, z12, z13, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        f3.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z11, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    public abstract e a0(Context context, boolean z9);

    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f1188h == 0) {
            fVar.f1188h = 80;
        }
    }
}
