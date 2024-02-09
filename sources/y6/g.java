package y6;

import android.os.Handler;
import android.os.Looper;
import d8.a;
import y6.c;

public class g implements c.d {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f13315a = a.a(Looper.getMainLooper());

    public void a(Runnable runnable) {
        this.f13315a.post(runnable);
    }
}
