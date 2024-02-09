package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class b implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadFactory f7213e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f7214a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    private final String f7215b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7216c;

    /* renamed from: d  reason: collision with root package name */
    private final StrictMode.ThreadPolicy f7217d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f7215b = str;
        this.f7216c = i10;
        this.f7217d = threadPolicy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        Process.setThreadPriority(this.f7216c);
        StrictMode.ThreadPolicy threadPolicy = this.f7217d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = f7213e.newThread(new a(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f7215b, Long.valueOf(this.f7214a.getAndIncrement())}));
        return newThread;
    }
}
