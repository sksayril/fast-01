package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicInteger f7297a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f7298b = new AtomicInteger();

    public int a() {
        return this.f7298b.get();
    }

    public int b() {
        return this.f7297a.get();
    }

    public void c() {
        this.f7298b.getAndIncrement();
    }

    public void d() {
        this.f7297a.getAndIncrement();
    }

    public void e() {
        this.f7298b.set(0);
    }
}
