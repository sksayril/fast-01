package com.amazonaws.util;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TimingInfo {

    /* renamed from: a  reason: collision with root package name */
    private final Long f4757a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4758b;

    /* renamed from: c  reason: collision with root package name */
    private Long f4759c;

    protected TimingInfo(Long l10, long j10, Long l11) {
        this.f4757a = l10;
        this.f4758b = j10;
        this.f4759c = l11;
    }

    public static double b(long j10, long j11) {
        return ((double) TimeUnit.NANOSECONDS.toMicros(j11 - j10)) / 1000.0d;
    }

    public static TimingInfo m() {
        return new TimingInfo(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), (Long) null);
    }

    public static TimingInfo n() {
        return new TimingInfoFullSupport(Long.valueOf(System.currentTimeMillis()), System.nanoTime(), (Long) null);
    }

    public static TimingInfo o(long j10) {
        return new TimingInfoFullSupport((Long) null, j10, (Long) null);
    }

    public static TimingInfo p(long j10, Long l10) {
        return new TimingInfoUnmodifiable((Long) null, j10, l10);
    }

    public void a(String str, TimingInfo timingInfo) {
    }

    public TimingInfo c() {
        this.f4759c = Long.valueOf(System.nanoTime());
        return this;
    }

    public Map<String, Number> d() {
        return Collections.emptyMap();
    }

    public final long e() {
        Long l10 = this.f4759c;
        if (l10 == null) {
            return -1;
        }
        return l10.longValue();
    }

    public final long f() {
        return this.f4758b;
    }

    public Map<String, List<TimingInfo>> g() {
        return Collections.emptyMap();
    }

    @Deprecated
    public final double h() {
        Double i10 = i();
        if (i10 == null) {
            return -1.0d;
        }
        return i10.doubleValue();
    }

    public final Double i() {
        if (k()) {
            return Double.valueOf(b(this.f4758b, this.f4759c.longValue()));
        }
        return null;
    }

    public void j(String str) {
    }

    public final boolean k() {
        return this.f4759c != null;
    }

    public void l(String str, long j10) {
    }

    public final String toString() {
        return String.valueOf(h());
    }
}
