package g2;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class m implements Executor {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Handler f8903m;

    public /* synthetic */ m(Handler handler) {
        this.f8903m = handler;
    }

    public final void execute(Runnable runnable) {
        this.f8903m.post(runnable);
    }
}
