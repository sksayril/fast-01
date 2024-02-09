package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class h {

    private static class a implements Executor {

        /* renamed from: m  reason: collision with root package name */
        private final Handler f1565m;

        a(Handler handler) {
            this.f1565m = (Handler) androidx.core.util.h.j(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f1565m.post((Runnable) androidx.core.util.h.j(runnable))) {
                throw new RejectedExecutionException(this.f1565m + " is shutting down");
            }
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
