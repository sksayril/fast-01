package com.amazonaws.services.s3.model.metrics;

import java.util.List;

abstract class MetricsNAryOperator extends MetricsFilterPredicate {

    /* renamed from: m  reason: collision with root package name */
    private final List<MetricsFilterPredicate> f4605m;

    public MetricsNAryOperator(List<MetricsFilterPredicate> list) {
        this.f4605m = list;
    }
}
