package com.amazonaws.services.s3.model.lifecycle;

import com.amazonaws.services.s3.model.Tag;

public final class LifecycleTagPredicate extends LifecycleFilterPredicate {

    /* renamed from: m  reason: collision with root package name */
    private final Tag f4601m;

    public LifecycleTagPredicate(Tag tag) {
        this.f4601m = tag;
    }
}
