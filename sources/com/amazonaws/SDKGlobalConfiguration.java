package com.amazonaws;

import java.util.concurrent.atomic.AtomicLong;

public class SDKGlobalConfiguration {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicLong f3979a = new AtomicLong(0);

    public static long a() {
        return f3979a.get();
    }

    public static void b(long j10) {
        f3979a.set(j10);
    }
}
