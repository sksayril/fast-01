package d3;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class o<T> implements p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f7749a = new CountDownLatch(1);

    /* synthetic */ o(n nVar) {
    }

    public final void a(T t9) {
        this.f7749a.countDown();
    }

    public final void b() {
        this.f7749a.await();
    }

    public final void c() {
        this.f7749a.countDown();
    }

    public final boolean d(long j10, TimeUnit timeUnit) {
        return this.f7749a.await(j10, timeUnit);
    }

    public final void e(Exception exc) {
        this.f7749a.countDown();
    }
}
