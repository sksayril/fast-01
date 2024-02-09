package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.MetricType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public class AWSRequestMetricsFullSupport extends AWSRequestMetrics {

    /* renamed from: d  reason: collision with root package name */
    private static final Log f4735d = LogFactory.c("com.amazonaws.latency");

    /* renamed from: e  reason: collision with root package name */
    private static final Object f4736e = "=";

    /* renamed from: f  reason: collision with root package name */
    private static final Object f4737f = ", ";

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, List<Object>> f4738b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, TimingInfo> f4739c = new HashMap();

    public AWSRequestMetricsFullSupport() {
        super(TimingInfo.n());
    }

    private void k(Object obj, Object obj2, StringBuilder sb) {
        sb.append(obj);
        sb.append(f4736e);
        sb.append(obj2);
        sb.append(f4737f);
    }

    public void a(MetricType metricType, Object obj) {
        h(metricType.name(), obj);
    }

    public void b(MetricType metricType) {
        i(metricType.name());
    }

    public void d(MetricType metricType) {
        j(metricType.name());
    }

    public void e() {
        if (f4735d.f()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : this.f4738b.entrySet()) {
                k(next.getKey(), next.getValue(), sb);
            }
            for (Map.Entry next2 : this.f4734a.d().entrySet()) {
                k(next2.getKey(), next2.getValue(), sb);
            }
            for (Map.Entry next3 : this.f4734a.g().entrySet()) {
                k(next3.getKey(), next3.getValue(), sb);
            }
            f4735d.h(sb.toString());
        }
    }

    public void f(MetricType metricType, long j10) {
        l(metricType.name(), j10);
    }

    public void g(MetricType metricType) {
        m(metricType.name());
    }

    public void h(String str, Object obj) {
        List list = this.f4738b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f4738b.put(str, list);
        }
        list.add(obj);
    }

    public void i(String str) {
        TimingInfo timingInfo = this.f4739c.get(str);
        if (timingInfo == null) {
            Log b10 = LogFactory.b(getClass());
            b10.e("Trying to end an event which was never started: " + str);
            return;
        }
        timingInfo.c();
        this.f4734a.a(str, TimingInfo.p(timingInfo.f(), Long.valueOf(timingInfo.e())));
    }

    public void j(String str) {
        this.f4734a.j(str);
    }

    public void l(String str, long j10) {
        this.f4734a.l(str, j10);
    }

    public void m(String str) {
        this.f4739c.put(str, TimingInfo.o(System.nanoTime()));
    }
}
