package com.amazonaws.services.s3.model.lifecycle;

import java.io.Serializable;

public class LifecycleFilter implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private LifecycleFilterPredicate f4598m;

    public void a(LifecycleFilterPredicate lifecycleFilterPredicate) {
        this.f4598m = lifecycleFilterPredicate;
    }
}
