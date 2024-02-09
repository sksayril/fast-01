package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f7034a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f7035b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f7036c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f7037d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        public void onAnimationEnd(Animator animator) {
            c cVar = c.this;
            if (cVar.f7036c == animator) {
                cVar.f7036c = null;
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f7039a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f7040b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f7039a = iArr;
            this.f7040b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f7037d);
        this.f7034a.add(bVar);
    }
}
