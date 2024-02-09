package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@SuppressLint({"RestrictedApi"})
class p<V> extends androidx.concurrent.futures.a<V> implements ScheduledFuture<V> {

    /* renamed from: t  reason: collision with root package name */
    private final ScheduledFuture<?> f7258t;

    class a implements b<V> {
        a() {
        }

        public void a(Throwable th) {
            boolean unused = p.this.A(th);
        }

        public void set(V v9) {
            boolean unused = p.this.z(v9);
        }
    }

    interface b<T> {
        void a(Throwable th);

        void set(T t9);
    }

    interface c<T> {
        ScheduledFuture<?> a(b<T> bVar);
    }

    p(c<V> cVar) {
        this.f7258t = cVar.a(new a());
    }

    /* renamed from: F */
    public int compareTo(Delayed delayed) {
        return this.f7258t.compareTo(delayed);
    }

    public long getDelay(TimeUnit timeUnit) {
        return this.f7258t.getDelay(timeUnit);
    }

    /* access modifiers changed from: protected */
    public void i() {
        this.f7258t.cancel(C());
    }
}
