package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class o2 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private ThreadFactory f5480a = Executors.defaultThreadFactory();

    o2(h2 h2Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f5480a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
