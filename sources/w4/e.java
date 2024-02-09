package w4;

import com.google.firebase.installations.f;
import java.util.concurrent.TimeUnit;

class e {

    /* renamed from: d  reason: collision with root package name */
    private static final long f12969d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e  reason: collision with root package name */
    private static final long f12970e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a  reason: collision with root package name */
    private final f f12971a = f.c();

    /* renamed from: b  reason: collision with root package name */
    private long f12972b;

    /* renamed from: c  reason: collision with root package name */
    private int f12973c;

    e() {
    }

    private synchronized long a(int i10) {
        if (!c(i10)) {
            return f12969d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f12973c) + ((double) this.f12971a.e()), (double) f12970e);
    }

    private static boolean c(int i10) {
        return i10 == 429 || (i10 >= 500 && i10 < 600);
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f12973c = 0;
    }

    public synchronized boolean b() {
        return this.f12973c == 0 || this.f12971a.a() > this.f12972b;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f12973c++;
        this.f12972b = this.f12971a.a() + a(i10);
    }
}
