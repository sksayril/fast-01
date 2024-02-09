package com.google.firebase.crashlytics.internal.common;

import i4.i;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import z3.g;

class v implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private final a f7421a;

    /* renamed from: b  reason: collision with root package name */
    private final i f7422b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f7423c;

    /* renamed from: d  reason: collision with root package name */
    private final z3.a f7424d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f7425e = new AtomicBoolean(false);

    interface a {
        void a(i iVar, Thread thread, Throwable th);
    }

    public v(a aVar, i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, z3.a aVar2) {
        this.f7421a = aVar;
        this.f7422b = iVar;
        this.f7423c = uncaughtExceptionHandler;
        this.f7424d = aVar2;
    }

    private boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f7424d.c()) {
            return true;
        } else {
            g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.f7425e.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f7425e.set(true);
        try {
            if (b(thread, th)) {
                this.f7421a.a(this.f7422b, thread, th);
            } else {
                g.f().b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e10) {
            g.f().e("An error occurred in the uncaught exception handler", e10);
        } catch (Throwable th2) {
            g.f().b("Completed exception processing. Invoking default exception handler.");
            this.f7423c.uncaughtException(thread, th);
            this.f7425e.set(false);
            throw th2;
        }
        g.f().b("Completed exception processing. Invoking default exception handler.");
        this.f7423c.uncaughtException(thread, th);
        this.f7425e.set(false);
    }
}
