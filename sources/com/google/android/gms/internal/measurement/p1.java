package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

final class p1 implements o1 {
    p1() {
    }

    public final <V> Callable<V> a(Callable<V> callable) {
        return callable;
    }

    public final Runnable b(Runnable runnable) {
        return runnable;
    }
}
