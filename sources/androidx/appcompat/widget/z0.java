package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class z0 extends r0 {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f1109b;

    public z0(Context context, Resources resources) {
        super(resources);
        this.f1109b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i10) {
        Drawable a10 = a(i10);
        Context context = (Context) this.f1109b.get();
        if (!(a10 == null || context == null)) {
            q0.h().x(context, i10, a10);
        }
        return a10;
    }
}
