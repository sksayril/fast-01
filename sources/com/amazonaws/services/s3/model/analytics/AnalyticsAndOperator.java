package com.amazonaws.services.s3.model.analytics;

import java.util.List;

public class AnalyticsAndOperator extends AnalyticsNAryOperator {
    public AnalyticsAndOperator(List<AnalyticsFilterPredicate> list) {
        super(list);
    }
}
