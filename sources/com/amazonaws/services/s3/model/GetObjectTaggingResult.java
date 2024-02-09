package com.amazonaws.services.s3.model;

import java.util.List;

public class GetObjectTaggingResult {

    /* renamed from: a  reason: collision with root package name */
    private String f4421a;

    /* renamed from: b  reason: collision with root package name */
    private List<Tag> f4422b;

    public GetObjectTaggingResult(List<Tag> list) {
        this.f4422b = list;
    }

    public void a(String str) {
        this.f4421a = str;
    }
}
