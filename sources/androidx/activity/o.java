package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.l;

public final class o {
    public static final void a(View view, l lVar) {
        l.e(view, "<this>");
        l.e(lVar, "onBackPressedDispatcherOwner");
        view.setTag(m.view_tree_on_back_pressed_dispatcher_owner, lVar);
    }
}
