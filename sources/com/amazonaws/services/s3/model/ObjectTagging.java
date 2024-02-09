package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.List;

public class ObjectTagging implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private List<Tag> f4482m;

    public ObjectTagging(List<Tag> list) {
        this.f4482m = list;
    }

    public List<Tag> a() {
        return this.f4482m;
    }
}
