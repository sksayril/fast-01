package com.amazonaws.services.s3.model.metrics;

import java.util.List;

public final class MetricsAndOperator extends MetricsNAryOperator {
    public MetricsAndOperator(List<MetricsFilterPredicate> list) {
        super(list);
    }
}
