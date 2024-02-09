package p1;

import android.content.Context;
import java.io.Closeable;
import x1.d;

abstract class v implements Closeable {

    interface a {
        v a();

        a b(Context context);
    }

    v() {
    }

    /* access modifiers changed from: package-private */
    public abstract d a();

    /* access modifiers changed from: package-private */
    public abstract u b();

    public void close() {
        a().close();
    }
}
