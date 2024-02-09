package m2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import s2.e;

public class a implements Executor {

    /* renamed from: m  reason: collision with root package name */
    private final Handler f11199m;

    public a(Looper looper) {
        this.f11199m = new e(looper);
    }

    public final void execute(Runnable runnable) {
        this.f11199m.post(runnable);
    }
}
