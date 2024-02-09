package r3;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public interface d<V> extends Future<V> {
    void e(Runnable runnable, Executor executor);
}
