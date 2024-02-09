package v0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class x implements y {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f12680a;

    x(View view) {
        this.f12680a = view.getOverlay();
    }

    public void b(Drawable drawable) {
        this.f12680a.add(drawable);
    }

    public void d(Drawable drawable) {
        this.f12680a.remove(drawable);
    }
}
