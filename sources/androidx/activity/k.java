package androidx.activity;

import android.window.OnBackInvokedCallback;
import androidx.activity.OnBackPressedDispatcher;
import r8.a;

public final /* synthetic */ class k implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f194a;

    public /* synthetic */ k(a aVar) {
        this.f194a = aVar;
    }

    public final void onBackInvoked() {
        OnBackPressedDispatcher.c.c(this.f194a);
    }
}
