package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

public final class u {

    /* renamed from: c  reason: collision with root package name */
    private static u f9792c;

    /* renamed from: a  reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f9793a = new LongSparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Long> f9794b = new PriorityQueue<>();

    public static class a {

        /* renamed from: b  reason: collision with root package name */
        private static final AtomicLong f9795b = new AtomicLong(0);
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final long f9796a;

        private a(long j10) {
            this.f9796a = j10;
        }

        public static a b() {
            return c(f9795b.incrementAndGet());
        }

        public static a c(long j10) {
            return new a(j10);
        }

        public long d() {
            return this.f9796a;
        }
    }

    private u() {
    }

    public static u a() {
        if (f9792c == null) {
            f9792c = new u();
        }
        return f9792c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f9794b.isEmpty() && this.f9794b.peek().longValue() < aVar.f9796a) {
            this.f9793a.remove(this.f9794b.poll().longValue());
        }
        if (!this.f9794b.isEmpty() && this.f9794b.peek().longValue() == aVar.f9796a) {
            this.f9794b.poll();
        }
        MotionEvent motionEvent = this.f9793a.get(aVar.f9796a);
        this.f9793a.remove(aVar.f9796a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b10 = a.b();
        this.f9793a.put(b10.f9796a, MotionEvent.obtain(motionEvent));
        this.f9794b.add(Long.valueOf(b10.f9796a));
        return b10;
    }
}
