package l2;

import android.os.SystemClock;

public class g implements d {

    /* renamed from: a  reason: collision with root package name */
    private static final g f11112a = new g();

    private g() {
    }

    public static d d() {
        return f11112a;
    }

    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    public final long c() {
        return System.nanoTime();
    }
}
