package p1;

import java.util.concurrent.Executor;

class n implements Executor {

    /* renamed from: m  reason: collision with root package name */
    private final Executor f11834m;

    static class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private final Runnable f11835m;

        a(Runnable runnable) {
            this.f11835m = runnable;
        }

        public void run() {
            try {
                this.f11835m.run();
            } catch (Exception e10) {
                t1.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    n(Executor executor) {
        this.f11834m = executor;
    }

    public void execute(Runnable runnable) {
        this.f11834m.execute(new a(runnable));
    }
}
