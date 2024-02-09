package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

public class DeleteObjectRequest extends AmazonWebServiceRequest implements Serializable {

    /* renamed from: r  reason: collision with root package name */
    private String f4405r;

    /* renamed from: s  reason: collision with root package name */
    private String f4406s;

    public DeleteObjectRequest(String str, String str2) {
        s(str);
        t(str2);
    }

    public String q() {
        return this.f4405r;
    }

    public String r() {
        return this.f4406s;
    }

    public void s(String str) {
        this.f4405r = str;
    }

    public void t(String str) {
        this.f4406s = str;
    }
}
