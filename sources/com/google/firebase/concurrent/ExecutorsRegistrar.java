package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import w3.f0;
import w3.x;
import x3.a;
import x3.b;
import x3.c;
import x3.d;
import x3.e;
import x3.f;
import x3.g;
import x3.h;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a  reason: collision with root package name */
    static final x<ScheduledExecutorService> f7207a = new x<>(d.f13182a);

    /* renamed from: b  reason: collision with root package name */
    static final x<ScheduledExecutorService> f7208b = new x<>(c.f13181a);

    /* renamed from: c  reason: collision with root package name */
    static final x<ScheduledExecutorService> f7209c = new x<>(b.f13180a);

    /* renamed from: d  reason: collision with root package name */
    static final x<ScheduledExecutorService> f7210d = new x<>(a.f13179a);

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i10) {
        return new b(str, i10, (StrictMode.ThreadPolicy) null);
    }

    private static ThreadFactory k(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i10, threadPolicy);
    }

    private static StrictMode.ThreadPolicy t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* access modifiers changed from: private */
    public static ScheduledExecutorService u(ExecutorService executorService) {
        return new o(executorService, f7210d.get());
    }

    public List<w3.c<?>> getComponents() {
        return Arrays.asList(new w3.c[]{w3.c.f(f0.a(v3.a.class, ScheduledExecutorService.class), f0.a(v3.a.class, ExecutorService.class), f0.a(v3.a.class, Executor.class)).e(h.f13186a).c(), w3.c.f(f0.a(v3.b.class, ScheduledExecutorService.class), f0.a(v3.b.class, ExecutorService.class), f0.a(v3.b.class, Executor.class)).e(e.f13183a).c(), w3.c.f(f0.a(v3.c.class, ScheduledExecutorService.class), f0.a(v3.c.class, ExecutorService.class), f0.a(v3.c.class, Executor.class)).e(g.f13185a).c(), w3.c.e(f0.a(v3.d.class, Executor.class)).e(f.f13184a).c()});
    }
}
