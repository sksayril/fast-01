package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.List;

public class BucketCrossOriginConfiguration implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private List<CORSRule> f4349m;

    public BucketCrossOriginConfiguration(List<CORSRule> list) {
        this.f4349m = list;
    }

    public List<CORSRule> a() {
        return this.f4349m;
    }
}
