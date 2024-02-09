package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

class a {
    static final int[] A = {16842919, 16842910};
    static final int[] B = {16843623, 16842908, 16842910};
    static final int[] C = {16842908, 16842910};
    static final int[] D = {16843623, 16842910};
    static final int[] E = {16842910};
    static final int[] F = new int[0];

    /* renamed from: z  reason: collision with root package name */
    static final TimeInterpolator f6987z = f3.a.f8756c;

    /* renamed from: a  reason: collision with root package name */
    int f6988a = 0;

    /* renamed from: b  reason: collision with root package name */
    Animator f6989b;

    /* renamed from: c  reason: collision with root package name */
    f3.h f6990c;

    /* renamed from: d  reason: collision with root package name */
    f3.h f6991d;

    /* renamed from: e  reason: collision with root package name */
    private f3.h f6992e;

    /* renamed from: f  reason: collision with root package name */
    private f3.h f6993f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.android.material.internal.c f6994g;

    /* renamed from: h  reason: collision with root package name */
    private float f6995h;

    /* renamed from: i  reason: collision with root package name */
    Drawable f6996i;

    /* renamed from: j  reason: collision with root package name */
    Drawable f6997j;

    /* renamed from: k  reason: collision with root package name */
    Drawable f6998k;

    /* renamed from: l  reason: collision with root package name */
    float f6999l;

    /* renamed from: m  reason: collision with root package name */
    float f7000m;

    /* renamed from: n  reason: collision with root package name */
    float f7001n;

    /* renamed from: o  reason: collision with root package name */
    int f7002o;

    /* renamed from: p  reason: collision with root package name */
    float f7003p = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f7004q;

    /* renamed from: r  reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f7005r;

    /* renamed from: s  reason: collision with root package name */
    final com.google.android.material.internal.f f7006s;

    /* renamed from: t  reason: collision with root package name */
    final m3.b f7007t;

    /* renamed from: u  reason: collision with root package name */
    private final Rect f7008u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    private final RectF f7009v = new RectF();

    /* renamed from: w  reason: collision with root package name */
    private final RectF f7010w = new RectF();

    /* renamed from: x  reason: collision with root package name */
    private final Matrix f7011x = new Matrix();

    /* renamed from: y  reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f7012y;

    /* renamed from: com.google.android.material.floatingactionbutton.a$a  reason: collision with other inner class name */
    class C0090a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f7013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f7014b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f7015c;

        C0090a(boolean z9, g gVar) {
            this.f7014b = z9;
            this.f7015c = gVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7013a = true;
        }

        public void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.f6988a = 0;
            aVar.f6989b = null;
            if (!this.f7013a) {
                com.google.android.material.internal.f fVar = aVar.f7006s;
                boolean z9 = this.f7014b;
                fVar.b(z9 ? 8 : 4, z9);
                g gVar = this.f7015c;
                if (gVar != null) {
                    gVar.b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            a.this.f7006s.b(0, this.f7014b);
            a aVar = a.this;
            aVar.f6988a = 1;
            aVar.f6989b = animator;
            this.f7013a = false;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f7017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f7018b;

        b(boolean z9, g gVar) {
            this.f7017a = z9;
            this.f7018b = gVar;
        }

        public void onAnimationEnd(Animator animator) {
            a aVar = a.this;
            aVar.f6988a = 0;
            aVar.f6989b = null;
            g gVar = this.f7018b;
            if (gVar != null) {
                gVar.a();
            }
        }

        public void onAnimationStart(Animator animator) {
            a.this.f7006s.b(0, this.f7017a);
            a aVar = a.this;
            aVar.f6988a = 2;
            aVar.f6989b = animator;
        }
    }

    class c implements ViewTreeObserver.OnPreDrawListener {
        c() {
        }

        public boolean onPreDraw() {
            a.this.z();
            return true;
        }
    }

    private class d extends i {
        d() {
            super(a.this, (C0090a) null);
        }
    }

    private class e extends i {
        e() {
            super(a.this, (C0090a) null);
        }
    }

    private class f extends i {
        f() {
            super(a.this, (C0090a) null);
        }
    }

    interface g {
        void a();

        void b();
    }

    private class h extends i {
        h() {
            super(a.this, (C0090a) null);
        }
    }

    private abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f7025a;

        private i() {
        }

        /* synthetic */ i(a aVar, C0090a aVar2) {
            this();
        }

        public void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(a.this);
            throw null;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f7025a) {
                Objects.requireNonNull(a.this);
                throw null;
            }
            Objects.requireNonNull(a.this);
            valueAnimator.getAnimatedFraction();
            throw null;
        }
    }

    a(com.google.android.material.internal.f fVar, m3.b bVar) {
        this.f7006s = fVar;
        this.f7007t = bVar;
        com.google.android.material.internal.c cVar = new com.google.android.material.internal.c();
        this.f6994g = cVar;
        cVar.a(A, e(new f()));
        cVar.a(B, e(new e()));
        cVar.a(C, e(new e()));
        cVar.a(D, e(new e()));
        cVar.a(E, e(new h()));
        cVar.a(F, e(new d()));
        this.f6995h = fVar.getRotation();
    }

    private boolean M() {
        return x.P(this.f7006s) && !this.f7006s.isInEditMode();
    }

    private void O() {
    }

    private void c(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f7006s.getDrawable();
        if (drawable != null && this.f7002o != 0) {
            RectF rectF = this.f7009v;
            RectF rectF2 = this.f7010w;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i10 = this.f7002o;
            rectF2.set(0.0f, 0.0f, (float) i10, (float) i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f7002o;
            matrix.postScale(f10, f10, ((float) i11) / 2.0f, ((float) i11) / 2.0f);
        }
    }

    private AnimatorSet d(f3.h hVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7006s, View.ALPHA, new float[]{f10});
        hVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f7006s, View.SCALE_X, new float[]{f11});
        hVar.d("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f7006s, View.SCALE_Y, new float[]{f11});
        hVar.d("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        c(f12, this.f7011x);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f7006s, new f3.f(), new f3.g(), new Matrix[]{new Matrix(this.f7011x)});
        hVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        f3.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator e(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f6987z);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    private void f() {
        if (this.f7012y == null) {
            this.f7012y = new c();
        }
    }

    private f3.h h() {
        if (this.f6993f == null) {
            this.f6993f = f3.h.b(this.f7006s.getContext(), e3.a.design_fab_hide_motion_spec);
        }
        return this.f6993f;
    }

    private f3.h i() {
        if (this.f6992e == null) {
            this.f6992e = f3.h.b(this.f7006s.getContext(), e3.a.design_fab_show_motion_spec);
        }
        return this.f6992e;
    }

    public void A(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f7005r;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f7004q;
        if (arrayList != null) {
            arrayList.remove(animatorListener);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void D(ColorStateList colorStateList) {
        Drawable drawable = this.f6996i;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    public void E(PorterDuff.Mode mode) {
        Drawable drawable = this.f6996i;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
    }

    /* access modifiers changed from: package-private */
    public final void F(float f10) {
        if (this.f6999l != f10) {
            this.f6999l = f10;
            x(f10, this.f7000m, this.f7001n);
        }
    }

    /* access modifiers changed from: package-private */
    public final void G(f3.h hVar) {
        this.f6991d = hVar;
    }

    /* access modifiers changed from: package-private */
    public final void H(float f10) {
        if (this.f7000m != f10) {
            this.f7000m = f10;
            x(this.f6999l, f10, this.f7001n);
        }
    }

    /* access modifiers changed from: package-private */
    public final void I(float f10) {
        this.f7003p = f10;
        Matrix matrix = this.f7011x;
        c(f10, matrix);
        this.f7006s.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    public final void J(float f10) {
        if (this.f7001n != f10) {
            this.f7001n = f10;
            x(this.f6999l, this.f7000m, f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void K(ColorStateList colorStateList) {
        Drawable drawable = this.f6997j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, l3.a.a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    public final void L(f3.h hVar) {
        this.f6990c = hVar;
    }

    /* access modifiers changed from: package-private */
    public void N(g gVar, boolean z9) {
        if (!r()) {
            Animator animator = this.f6989b;
            if (animator != null) {
                animator.cancel();
            }
            if (M()) {
                if (this.f7006s.getVisibility() != 0) {
                    this.f7006s.setAlpha(0.0f);
                    this.f7006s.setScaleY(0.0f);
                    this.f7006s.setScaleX(0.0f);
                    I(0.0f);
                }
                f3.h hVar = this.f6990c;
                if (hVar == null) {
                    hVar = i();
                }
                AnimatorSet d10 = d(hVar, 1.0f, 1.0f, 1.0f);
                d10.addListener(new b(z9, gVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f7004q;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        d10.addListener(it.next());
                    }
                }
                d10.start();
                return;
            }
            this.f7006s.b(0, z9);
            this.f7006s.setAlpha(1.0f);
            this.f7006s.setScaleY(1.0f);
            this.f7006s.setScaleX(1.0f);
            I(1.0f);
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void P() {
        I(this.f7003p);
    }

    /* access modifiers changed from: package-private */
    public final void Q() {
        Rect rect = this.f7008u;
        m(rect);
        y(rect);
        this.f7007t.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void a(Animator.AnimatorListener animatorListener) {
        if (this.f7005r == null) {
            this.f7005r = new ArrayList<>();
        }
        this.f7005r.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public void b(Animator.AnimatorListener animatorListener) {
        if (this.f7004q == null) {
            this.f7004q = new ArrayList<>();
        }
        this.f7004q.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    public final Drawable g() {
        return this.f6998k;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final f3.h k() {
        return this.f6991d;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f7000m;
    }

    /* access modifiers changed from: package-private */
    public void m(Rect rect) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public float n() {
        return this.f7001n;
    }

    /* access modifiers changed from: package-private */
    public final f3.h o() {
        return this.f6990c;
    }

    /* access modifiers changed from: package-private */
    public void p(g gVar, boolean z9) {
        if (!q()) {
            Animator animator = this.f6989b;
            if (animator != null) {
                animator.cancel();
            }
            if (M()) {
                f3.h hVar = this.f6991d;
                if (hVar == null) {
                    hVar = h();
                }
                AnimatorSet d10 = d(hVar, 0.0f, 0.0f, 0.0f);
                d10.addListener(new C0090a(z9, gVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f7005r;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        d10.addListener(it.next());
                    }
                }
                d10.start();
                return;
            }
            this.f7006s.b(z9 ? 8 : 4, z9);
            if (gVar != null) {
                gVar.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean q() {
        return this.f7006s.getVisibility() == 0 ? this.f6988a == 1 : this.f6988a != 2;
    }

    /* access modifiers changed from: package-private */
    public boolean r() {
        return this.f7006s.getVisibility() != 0 ? this.f6988a == 2 : this.f6988a != 1;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (C()) {
            f();
            this.f7006s.getViewTreeObserver().addOnPreDrawListener(this.f7012y);
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (this.f7012y != null) {
            this.f7006s.getViewTreeObserver().removeOnPreDrawListener(this.f7012y);
            this.f7012y = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void w(int[] iArr) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void x(float f10, float f11, float f12) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void y(Rect rect) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public void z() {
        float rotation = this.f7006s.getRotation();
        if (this.f6995h != rotation) {
            this.f6995h = rotation;
            O();
        }
    }
}
