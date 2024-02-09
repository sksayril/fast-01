package com.amazonaws.services.s3.model.lifecycle;

import java.util.List;

abstract class LifecycleNAryOperator extends LifecycleFilterPredicate {

    /* renamed from: m  reason: collision with root package name */
    private final List<LifecycleFilterPredicate> f4599m;

    public LifecycleNAryOperator(List<LifecycleFilterPredicate> list) {
        this.f4599m = list;
    }
}
