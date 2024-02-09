package io.flutter.embedding.android;

import android.app.Activity;
import androidx.core.util.a;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

public class z {

    /* renamed from: a  reason: collision with root package name */
    final WindowInfoTrackerCallbackAdapter f9797a;

    public z(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f9797a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, a<WindowLayoutInfo> aVar) {
        this.f9797a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void b(a<WindowLayoutInfo> aVar) {
        this.f9797a.removeWindowLayoutInfoListener(aVar);
    }
}
