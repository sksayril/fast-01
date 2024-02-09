package v0;

import android.view.View;
import android.view.ViewGroup;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f12633a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f12634b;

    static k b(View view) {
        return (k) view.getTag(i.transition_current_scene);
    }

    static void c(View view, k kVar) {
        view.setTag(i.transition_current_scene, kVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f12633a) == this && (runnable = this.f12634b) != null) {
            runnable.run();
        }
    }
}
