package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class h {

    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f1619a;

        /* renamed from: b  reason: collision with root package name */
        private int f1620b;

        /* renamed from: androidx.core.provider.h$a$a  reason: collision with other inner class name */
        private static class C0027a extends Thread {

            /* renamed from: m  reason: collision with root package name */
            private final int f1621m;

            C0027a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f1621m = i10;
            }

            public void run() {
                Process.setThreadPriority(this.f1621m);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f1619a = str;
            this.f1620b = i10;
        }

        public Thread newThread(Runnable runnable) {
            return new C0027a(runnable, this.f1619a, this.f1620b);
        }
    }

    private static class b<T> implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private Callable<T> f1622m;

        /* renamed from: n  reason: collision with root package name */
        private androidx.core.util.a<T> f1623n;

        /* renamed from: o  reason: collision with root package name */
        private Handler f1624o;

        class a implements Runnable {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ androidx.core.util.a f1625m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ Object f1626n;

            a(androidx.core.util.a aVar, Object obj) {
                this.f1625m = aVar;
                this.f1626n = obj;
            }

            public void run() {
                this.f1625m.accept(this.f1626n);
            }
        }

        b(Handler handler, Callable<T> callable, androidx.core.util.a<T> aVar) {
            this.f1622m = callable;
            this.f1623n = aVar;
            this.f1624o = handler;
        }

        public void run() {
            T t9;
            try {
                t9 = this.f1622m.call();
            } catch (Exception unused) {
                t9 = null;
            }
            this.f1624o.post(new a(this.f1623n, t9));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, androidx.core.util.a<T> aVar) {
        executor.execute(new b(b.a(), callable, aVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i10) {
        try {
            return executorService.submit(callable).get((long) i10, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
