package com.amazonaws.metrics;

public abstract class MetricCollector {

    /* renamed from: a  reason: collision with root package name */
    public static final MetricCollector f4100a = new MetricCollector() {
        public RequestMetricCollector a() {
            return RequestMetricCollector.f4102a;
        }

        public ServiceMetricCollector b() {
            return ServiceMetricCollector.f4103a;
        }

        public boolean c() {
            return false;
        }

        public boolean d() {
            return true;
        }
    };

    public interface Factory {
        MetricCollector a();
    }

    public abstract RequestMetricCollector a();

    public abstract ServiceMetricCollector b();

    public abstract boolean c();

    public abstract boolean d();
}
