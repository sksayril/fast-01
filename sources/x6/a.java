package x6;

import a7.d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    private static a f13200e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f13201f;

    /* renamed from: a  reason: collision with root package name */
    private d f13202a;

    /* renamed from: b  reason: collision with root package name */
    private z6.a f13203b;

    /* renamed from: c  reason: collision with root package name */
    private FlutterJNI.c f13204c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f13205d;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private d f13206a;

        /* renamed from: b  reason: collision with root package name */
        private z6.a f13207b;

        /* renamed from: c  reason: collision with root package name */
        private FlutterJNI.c f13208c;

        /* renamed from: d  reason: collision with root package name */
        private ExecutorService f13209d;

        /* renamed from: x6.a$b$a  reason: collision with other inner class name */
        private class C0228a implements ThreadFactory {

            /* renamed from: a  reason: collision with root package name */
            private int f13210a;

            private C0228a() {
                this.f13210a = 0;
            }

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i10 = this.f13210a;
                this.f13210a = i10 + 1;
                sb.append(i10);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f13208c == null) {
                this.f13208c = new FlutterJNI.c();
            }
            if (this.f13209d == null) {
                this.f13209d = Executors.newCachedThreadPool(new C0228a());
            }
            if (this.f13206a == null) {
                this.f13206a = new d(this.f13208c.a(), this.f13209d);
            }
        }

        public a a() {
            b();
            return new a(this.f13206a, this.f13207b, this.f13208c, this.f13209d);
        }
    }

    private a(d dVar, z6.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f13202a = dVar;
        this.f13203b = aVar;
        this.f13204c = cVar;
        this.f13205d = executorService;
    }

    public static a e() {
        f13201f = true;
        if (f13200e == null) {
            f13200e = new b().a();
        }
        return f13200e;
    }

    public z6.a a() {
        return this.f13203b;
    }

    public ExecutorService b() {
        return this.f13205d;
    }

    public d c() {
        return this.f13202a;
    }

    public FlutterJNI.c d() {
        return this.f13204c;
    }
}
