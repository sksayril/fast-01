package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CompleteMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* renamed from: r  reason: collision with root package name */
    private String f4386r;

    /* renamed from: s  reason: collision with root package name */
    private String f4387s;

    /* renamed from: t  reason: collision with root package name */
    private String f4388t;

    /* renamed from: u  reason: collision with root package name */
    private List<PartETag> f4389u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f4390v;

    public CompleteMultipartUploadRequest(String str, String str2, String str3, List<PartETag> list) {
        new ArrayList();
        this.f4386r = str;
        this.f4387s = str2;
        this.f4388t = str3;
        this.f4389u = list;
    }

    public String q() {
        return this.f4386r;
    }

    public String r() {
        return this.f4387s;
    }

    public List<PartETag> s() {
        return this.f4389u;
    }

    public String t() {
        return this.f4388t;
    }

    public boolean u() {
        return this.f4390v;
    }
}
