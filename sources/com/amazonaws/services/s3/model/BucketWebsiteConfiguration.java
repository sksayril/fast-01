package com.amazonaws.services.s3.model;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class BucketWebsiteConfiguration implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4374m;

    /* renamed from: n  reason: collision with root package name */
    private String f4375n;

    /* renamed from: o  reason: collision with root package name */
    private RedirectRule f4376o;

    /* renamed from: p  reason: collision with root package name */
    private List<RoutingRule> f4377p = new LinkedList();

    public BucketWebsiteConfiguration(String str) {
        this.f4374m = str;
    }

    public List<RoutingRule> a() {
        return this.f4377p;
    }

    public void b(String str) {
        this.f4375n = str;
    }

    public void c(String str) {
        this.f4374m = str;
    }

    public void d(RedirectRule redirectRule) {
        this.f4376o = redirectRule;
    }
}
