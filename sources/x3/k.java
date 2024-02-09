package x3;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum k implements Executor {
    INSTANCE;
    
    @SuppressLint({"ThreadPoolCreation"})
    private static final Handler HANDLER = null;

    static {
        HANDLER = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable runnable) {
        HANDLER.post(runnable);
    }
}
