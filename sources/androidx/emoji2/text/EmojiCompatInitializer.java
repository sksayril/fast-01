package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.n;
import androidx.emoji2.text.d;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements t0.a<Boolean> {

    static class a extends d.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        private final Context f2142a;

        class a extends d.h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d.h f2143a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f2144b;

            a(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2143a = hVar;
                this.f2144b = threadPoolExecutor;
            }

            public void a(Throwable th) {
                try {
                    this.f2143a.a(th);
                } finally {
                    this.f2144b.shutdown();
                }
            }

            public void b(l lVar) {
                try {
                    this.f2143a.b(lVar);
                } finally {
                    this.f2144b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f2142a = context.getApplicationContext();
        }

        public void a(d.h hVar) {
            ThreadPoolExecutor b10 = b.b("EmojiCompatInitializer");
            b10.execute(new e(this, hVar, b10));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void d(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i a10 = c.a(this.f2142a);
                if (a10 != null) {
                    a10.c(threadPoolExecutor);
                    a10.a().a(new a(hVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                n.a("EmojiCompat.EmojiCompatInitializer.run");
                if (d.h()) {
                    d.b().k();
                }
            } finally {
                n.b();
            }
        }
    }

    public List<Class<? extends t0.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean b(Context context) {
        d.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    public void d(Context context) {
        final g a10 = ((l) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).a();
        a10.a(new DefaultLifecycleObserver() {
            public void b(l lVar) {
                EmojiCompatInitializer.this.e();
                a10.c(this);
            }

            public /* synthetic */ void c(l lVar) {
                androidx.lifecycle.b.b(this, lVar);
            }

            public /* synthetic */ void d(l lVar) {
                androidx.lifecycle.b.a(this, lVar);
            }

            public /* synthetic */ void i(l lVar) {
                androidx.lifecycle.b.c(this, lVar);
            }

            public /* synthetic */ void k(l lVar) {
                androidx.lifecycle.b.d(this, lVar);
            }

            public /* synthetic */ void s(l lVar) {
                androidx.lifecycle.b.e(this, lVar);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void e() {
        b.d().postDelayed(new c(), 500);
    }
}
