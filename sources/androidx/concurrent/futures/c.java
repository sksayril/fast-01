package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class c {

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        Object f1158a;

        /* renamed from: b  reason: collision with root package name */
        d<T> f1159b;

        /* renamed from: c  reason: collision with root package name */
        private d<Void> f1160c = d.D();

        /* renamed from: d  reason: collision with root package name */
        private boolean f1161d;

        a() {
        }

        private void d() {
            this.f1158a = null;
            this.f1159b = null;
            this.f1160c = null;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1158a = null;
            this.f1159b = null;
            this.f1160c.z(null);
        }

        public boolean b(T t9) {
            boolean z9 = true;
            this.f1161d = true;
            d<T> dVar = this.f1159b;
            if (dVar == null || !dVar.b(t9)) {
                z9 = false;
            }
            if (z9) {
                d();
            }
            return z9;
        }

        public boolean c() {
            boolean z9 = true;
            this.f1161d = true;
            d<T> dVar = this.f1159b;
            if (dVar == null || !dVar.a(true)) {
                z9 = false;
            }
            if (z9) {
                d();
            }
            return z9;
        }

        public boolean e(Throwable th) {
            boolean z9 = true;
            this.f1161d = true;
            d<T> dVar = this.f1159b;
            if (dVar == null || !dVar.c(th)) {
                z9 = false;
            }
            if (z9) {
                d();
            }
            return z9;
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            d<Void> dVar;
            d<T> dVar2 = this.f1159b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1158a));
            }
            if (!this.f1161d && (dVar = this.f1160c) != null) {
                dVar.z(null);
            }
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c  reason: collision with other inner class name */
    public interface C0014c<T> {
        Object a(a<T> aVar);
    }

    private static final class d<T> implements r3.d<T> {

        /* renamed from: m  reason: collision with root package name */
        final WeakReference<a<T>> f1162m;

        /* renamed from: n  reason: collision with root package name */
        private final a<T> f1163n = new a();

        class a extends a<T> {
            a() {
            }

            /* access modifiers changed from: protected */
            public String w() {
                a aVar = (a) d.this.f1162m.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f1158a + "]";
            }
        }

        d(a<T> aVar) {
            this.f1162m = new WeakReference<>(aVar);
        }

        /* access modifiers changed from: package-private */
        public boolean a(boolean z9) {
            return this.f1163n.cancel(z9);
        }

        /* access modifiers changed from: package-private */
        public boolean b(T t9) {
            return this.f1163n.z(t9);
        }

        /* access modifiers changed from: package-private */
        public boolean c(Throwable th) {
            return this.f1163n.A(th);
        }

        public boolean cancel(boolean z9) {
            a aVar = (a) this.f1162m.get();
            boolean cancel = this.f1163n.cancel(z9);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        public void e(Runnable runnable, Executor executor) {
            this.f1163n.e(runnable, executor);
        }

        public T get() {
            return this.f1163n.get();
        }

        public T get(long j10, TimeUnit timeUnit) {
            return this.f1163n.get(j10, timeUnit);
        }

        public boolean isCancelled() {
            return this.f1163n.isCancelled();
        }

        public boolean isDone() {
            return this.f1163n.isDone();
        }

        public String toString() {
            return this.f1163n.toString();
        }
    }

    public static <T> r3.d<T> a(C0014c<T> cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.f1159b = dVar;
        aVar.f1158a = cVar.getClass();
        try {
            Object a10 = cVar.a(aVar);
            if (a10 != null) {
                aVar.f1158a = a10;
            }
        } catch (Exception e10) {
            dVar.c(e10);
        }
        return dVar;
    }
}
