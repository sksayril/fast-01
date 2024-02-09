package v0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class t implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f12677a;

    t(ViewGroup viewGroup) {
        this.f12677a = viewGroup.getOverlay();
    }

    public void a(View view) {
        this.f12677a.add(view);
    }

    public void b(Drawable drawable) {
        this.f12677a.add(drawable);
    }

    public void c(View view) {
        this.f12677a.remove(view);
    }

    public void d(Drawable drawable) {
        this.f12677a.remove(drawable);
    }
}
