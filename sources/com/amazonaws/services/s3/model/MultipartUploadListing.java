package com.amazonaws.services.s3.model;

import java.util.ArrayList;
import java.util.List;

public class MultipartUploadListing {

    /* renamed from: a  reason: collision with root package name */
    private String f4461a;

    /* renamed from: b  reason: collision with root package name */
    private String f4462b;

    /* renamed from: c  reason: collision with root package name */
    private String f4463c;

    /* renamed from: d  reason: collision with root package name */
    private String f4464d;

    /* renamed from: e  reason: collision with root package name */
    private String f4465e;

    /* renamed from: f  reason: collision with root package name */
    private int f4466f;

    /* renamed from: g  reason: collision with root package name */
    private String f4467g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f4468h;

    /* renamed from: i  reason: collision with root package name */
    private String f4469i;

    /* renamed from: j  reason: collision with root package name */
    private String f4470j;

    /* renamed from: k  reason: collision with root package name */
    private List<MultipartUpload> f4471k;

    /* renamed from: l  reason: collision with root package name */
    private List<String> f4472l = new ArrayList();

    public List<String> a() {
        return this.f4472l;
    }

    public List<MultipartUpload> b() {
        if (this.f4471k == null) {
            this.f4471k = new ArrayList();
        }
        return this.f4471k;
    }

    public void c(String str) {
        this.f4461a = str;
    }

    public void d(String str) {
        this.f4463c = str;
    }

    public void e(String str) {
        this.f4467g = str;
    }

    public void f(String str) {
        this.f4462b = str;
    }

    public void g(int i10) {
        this.f4466f = i10;
    }

    public void h(String str) {
        this.f4469i = str;
    }

    public void i(String str) {
        this.f4470j = str;
    }

    public void j(String str) {
        this.f4464d = str;
    }

    public void k(boolean z9) {
        this.f4468h = z9;
    }

    public void l(String str) {
        this.f4465e = str;
    }
}
