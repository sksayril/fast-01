package com.google.firebase.crashlytics.internal.common;

import d3.b;
import d3.j;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class o0 implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f7333a;

    public /* synthetic */ o0(CountDownLatch countDownLatch) {
        this.f7333a = countDownLatch;
    }

    public final Object a(j jVar) {
        return this.f7333a.countDown();
    }
}
