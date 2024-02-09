package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

public final class v implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: m  reason: collision with root package name */
    private final View f1803m;

    /* renamed from: n  reason: collision with root package name */
    private ViewTreeObserver f1804n;

    /* renamed from: o  reason: collision with root package name */
    private final Runnable f1805o;

    private v(View view, Runnable runnable) {
        this.f1803m = view;
        this.f1804n = view.getViewTreeObserver();
        this.f1805o = runnable;
    }

    public static v a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        v vVar = new v(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(vVar);
        view.addOnAttachStateChangeListener(vVar);
        return vVar;
    }

    public void b() {
        (this.f1804n.isAlive() ? this.f1804n : this.f1803m.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1803m.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f1805o.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f1804n = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
