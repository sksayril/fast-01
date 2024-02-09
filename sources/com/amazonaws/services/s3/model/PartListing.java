package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.util.ArrayList;
import java.util.List;

public class PartListing implements S3RequesterChargedResult {

    /* renamed from: m  reason: collision with root package name */
    private String f4487m;

    /* renamed from: n  reason: collision with root package name */
    private String f4488n;

    /* renamed from: o  reason: collision with root package name */
    private String f4489o;

    /* renamed from: p  reason: collision with root package name */
    private Integer f4490p;

    /* renamed from: q  reason: collision with root package name */
    private Integer f4491q;

    /* renamed from: r  reason: collision with root package name */
    private String f4492r;

    /* renamed from: s  reason: collision with root package name */
    private Owner f4493s;

    /* renamed from: t  reason: collision with root package name */
    private Owner f4494t;

    /* renamed from: u  reason: collision with root package name */
    private String f4495u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f4496v;

    /* renamed from: w  reason: collision with root package name */
    private Integer f4497w;

    /* renamed from: x  reason: collision with root package name */
    private List<PartSummary> f4498x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f4499y;

    public List<PartSummary> a() {
        if (this.f4498x == null) {
            this.f4498x = new ArrayList();
        }
        return this.f4498x;
    }

    public void b(boolean z9) {
        this.f4499y = z9;
    }

    public void c(String str) {
        this.f4487m = str;
    }

    public void d(String str) {
        this.f4492r = str;
    }

    public void e(Owner owner) {
        this.f4494t = owner;
    }

    public void f(String str) {
        this.f4488n = str;
    }

    public void g(int i10) {
        this.f4490p = Integer.valueOf(i10);
    }

    public void h(int i10) {
        this.f4497w = Integer.valueOf(i10);
    }

    public void i(Owner owner) {
        this.f4493s = owner;
    }

    public void j(int i10) {
        this.f4491q = Integer.valueOf(i10);
    }

    public void k(String str) {
        this.f4495u = str;
    }

    public void l(boolean z9) {
        this.f4496v = z9;
    }

    public void m(String str) {
        this.f4489o = str;
    }
}
