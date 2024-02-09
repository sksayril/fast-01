package r3;

import java.util.concurrent.Future;

public final class e {
    public static <V> V a(Future<V> future) {
        V v9;
        boolean z9 = false;
        while (true) {
            try {
                v9 = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return v9;
    }
}
