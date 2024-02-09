package t3;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class o {
    public static o a(long j10, long j11, long j12) {
        return new a(j10, j11, j12);
    }

    public static o e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
