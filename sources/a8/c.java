package a8;

import android.os.SystemClock;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final long f48a;

    /* renamed from: b  reason: collision with root package name */
    private final long f49b = SystemClock.elapsedRealtime();

    private c(long j10) {
        this.f48a = j10;
    }

    public static c a(long j10) {
        return new c(j10);
    }

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.f49b > this.f48a;
    }
}
