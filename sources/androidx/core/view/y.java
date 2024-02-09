package androidx.core.view;

import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.x;

public final /* synthetic */ class y implements View.OnUnhandledKeyEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x.u f1828a;

    public /* synthetic */ y(x.u uVar) {
        this.f1828a = uVar;
    }

    public final boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
        return this.f1828a.onUnhandledKeyEvent(view, keyEvent);
    }
}
