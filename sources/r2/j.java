package r2;

import android.os.Handler;
import android.os.Looper;

public class j extends Handler {
    public j(Looper looper) {
        super(looper);
    }

    public j(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
