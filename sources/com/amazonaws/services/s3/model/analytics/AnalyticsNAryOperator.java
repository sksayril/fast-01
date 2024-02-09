package com.amazonaws.services.s3.model.analytics;

import java.util.List;

abstract class AnalyticsNAryOperator extends AnalyticsFilterPredicate {

    /* renamed from: m  reason: collision with root package name */
    private final List<AnalyticsFilterPredicate> f4573m;

    public AnalyticsNAryOperator(List<AnalyticsFilterPredicate> list) {
        this.f4573m = list;
    }
}
