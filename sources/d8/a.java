package d8;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

public final class a {
    public static Handler a(Looper looper) {
        return Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(looper) : new Handler(looper);
    }
}