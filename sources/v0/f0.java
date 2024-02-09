package v0;

import android.view.View;
import android.view.WindowId;

class f0 implements g0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f12631a;

    f0(View view) {
        this.f12631a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof f0) && ((f0) obj).f12631a.equals(this.f12631a);
    }

    public int hashCode() {
        return this.f12631a.hashCode();
    }
}
