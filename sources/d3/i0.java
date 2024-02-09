package d3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import v2.a;

final class i0 implements Executor {

    /* renamed from: m  reason: collision with root package name */
    private final Handler f7736m = new a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f7736m.post(runnable);
    }
}
