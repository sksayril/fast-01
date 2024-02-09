package com.amazonaws.event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ProgressListenerCallbackExecutor {

    /* renamed from: b  reason: collision with root package name */
    static ExecutorService f4030b = b();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final ProgressListener f4031a;

    public ProgressListenerCallbackExecutor(ProgressListener progressListener) {
        this.f4031a = progressListener;
    }

    static ExecutorService b() {
        return Executors.newSingleThreadExecutor(new ThreadFactory() {
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setName("android-sdk-progress-listener-callback-thread");
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    public static ProgressListenerCallbackExecutor d(ProgressListener progressListener) {
        if (progressListener == null) {
            return null;
        }
        return new ProgressListenerCallbackExecutor(progressListener);
    }

    public void c(final ProgressEvent progressEvent) {
        if (this.f4031a != null) {
            f4030b.submit(new Runnable() {
                public void run() {
                    ProgressListenerCallbackExecutor.this.f4031a.a(progressEvent);
                }
            });
        }
    }
}
