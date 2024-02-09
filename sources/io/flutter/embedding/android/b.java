package io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

@Deprecated
public final class b implements x {

    /* renamed from: a  reason: collision with root package name */
    private final Drawable f9677a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView.ScaleType f9678b;

    /* renamed from: c  reason: collision with root package name */
    private final long f9679c;

    /* renamed from: d  reason: collision with root package name */
    private C0151b f9680d;

    class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f9681a;

        a(Runnable runnable) {
            this.f9681a = runnable;
        }

        public void onAnimationCancel(Animator animator) {
            this.f9681a.run();
        }

        public void onAnimationEnd(Animator animator) {
            this.f9681a.run();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: io.flutter.embedding.android.b$b  reason: collision with other inner class name */
    public static class C0151b extends ImageView {
        public C0151b(Context context) {
            this(context, (AttributeSet) null, 0);
        }

        public C0151b(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
        }

        public void a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            a(drawable, ImageView.ScaleType.FIT_XY);
        }
    }

    public b(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500);
    }

    public b(Drawable drawable, ImageView.ScaleType scaleType, long j10) {
        this.f9677a = drawable;
        this.f9678b = scaleType;
        this.f9679c = j10;
    }

    public void a(Runnable runnable) {
        C0151b bVar = this.f9680d;
        if (bVar == null) {
            runnable.run();
        } else {
            bVar.animate().alpha(0.0f).setDuration(this.f9679c).setListener(new a(runnable));
        }
    }

    public /* synthetic */ boolean b() {
        return w.a(this);
    }

    public View c(Context context, Bundle bundle) {
        C0151b bVar = new C0151b(context);
        this.f9680d = bVar;
        bVar.a(this.f9677a, this.f9678b);
        return this.f9680d;
    }

    public /* synthetic */ Bundle d() {
        return w.b(this);
    }
}
