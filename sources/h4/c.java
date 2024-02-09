package h4;

import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ e f9278m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f9279n;

    public /* synthetic */ c(e eVar, CountDownLatch countDownLatch) {
        this.f9278m = eVar;
        this.f9279n = countDownLatch;
    }

    public final void run() {
        this.f9278m.m(this.f9279n);
    }
}
