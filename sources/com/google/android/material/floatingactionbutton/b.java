package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.internal.f;
import java.util.ArrayList;
import l3.a;

class b extends a {
    private InsetDrawable G;

    b(f fVar, m3.b bVar) {
        super(fVar, bVar);
    }

    private Animator R(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f7006s, "elevation", new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f7006s, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(a.f6987z);
        return animatorSet;
    }

    /* access modifiers changed from: package-private */
    public boolean C() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void K(ColorStateList colorStateList) {
        Drawable drawable = this.f6997j;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(a.a(colorStateList));
        } else {
            super.K(colorStateList);
        }
    }

    public float j() {
        return this.f7006s.getElevation();
    }

    /* access modifiers changed from: package-private */
    public void m(Rect rect) {
        if (this.f7007t.c()) {
            float d10 = this.f7007t.d();
            float j10 = j() + this.f7001n;
            int ceil = (int) Math.ceil((double) m3.a.c(j10, d10, false));
            int ceil2 = (int) Math.ceil((double) m3.a.d(j10, d10, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: package-private */
    public void s() {
    }

    /* access modifiers changed from: package-private */
    public void u() {
        Q();
    }

    /* access modifiers changed from: package-private */
    public void w(int[] iArr) {
        f fVar;
        if (Build.VERSION.SDK_INT == 21) {
            float f10 = 0.0f;
            if (this.f7006s.isEnabled()) {
                this.f7006s.setElevation(this.f6999l);
                if (this.f7006s.isPressed()) {
                    fVar = this.f7006s;
                    f10 = this.f7001n;
                } else if (this.f7006s.isFocused() || this.f7006s.isHovered()) {
                    fVar = this.f7006s;
                    f10 = this.f7000m;
                }
                fVar.setTranslationZ(f10);
            }
            this.f7006s.setElevation(0.0f);
            fVar = this.f7006s;
            fVar.setTranslationZ(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void x(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21) {
            this.f7006s.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(a.A, R(f10, f12));
            stateListAnimator.addState(a.B, R(f10, f11));
            stateListAnimator.addState(a.C, R(f10, f11));
            stateListAnimator.addState(a.D, R(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f7006s, "elevation", new float[]{f10}).setDuration(0));
            if (i10 >= 22 && i10 <= 24) {
                f fVar = this.f7006s;
                arrayList.add(ObjectAnimator.ofFloat(fVar, View.TRANSLATION_Z, new float[]{fVar.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f7006s, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a.f6987z);
            stateListAnimator.addState(a.E, animatorSet);
            stateListAnimator.addState(a.F, R(0.0f, 0.0f));
            this.f7006s.setStateListAnimator(stateListAnimator);
        }
        if (this.f7007t.c()) {
            Q();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.graphics.drawable.Drawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.graphics.drawable.InsetDrawable} */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y(android.graphics.Rect r8) {
        /*
            r7 = this;
            m3.b r0 = r7.f7007t
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x001d
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.f6997j
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.G = r0
            m3.b r8 = r7.f7007t
            goto L_0x0021
        L_0x001d:
            m3.b r8 = r7.f7007t
            android.graphics.drawable.Drawable r0 = r7.f6997j
        L_0x0021:
            r8.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.b.y(android.graphics.Rect):void");
    }
}
