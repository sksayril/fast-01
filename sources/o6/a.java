package o6;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import c7.a;
import k7.c;
import k7.d;

public class a implements c7.a, d7.a, d.C0170d, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: m  reason: collision with root package name */
    private d.b f11641m;

    /* renamed from: n  reason: collision with root package name */
    private View f11642n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f11643o;

    private void c(c cVar) {
        new d(cVar, "flutter_keyboard_visibility").d(this);
    }

    private void d(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        this.f11642n = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    private void e() {
        View view = this.f11642n;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f11642n = null;
        }
    }

    public void a(Object obj, d.b bVar) {
        this.f11641m = bVar;
    }

    public void b(Object obj) {
        this.f11641m = null;
    }

    public void onAttachedToActivity(d7.c cVar) {
        d(cVar.d());
    }

    public void onAttachedToEngine(a.b bVar) {
        c(bVar.b());
    }

    public void onDetachedFromActivity() {
        e();
    }

    public void onDetachedFromActivityForConfigChanges() {
        e();
    }

    public void onDetachedFromEngine(a.b bVar) {
        e();
    }

    public void onGlobalLayout() {
        if (this.f11642n != null) {
            Rect rect = new Rect();
            this.f11642n.getWindowVisibleDisplayFrame(rect);
            boolean z9 = ((double) rect.height()) / ((double) this.f11642n.getRootView().getHeight()) < 0.85d;
            if (z9 != this.f11643o) {
                this.f11643o = z9;
                d.b bVar = this.f11641m;
                if (bVar != null) {
                    bVar.a(Integer.valueOf(z9 ? 1 : 0));
                }
            }
        }
    }

    public void onReattachedToActivityForConfigChanges(d7.c cVar) {
        d(cVar.d());
    }
}
