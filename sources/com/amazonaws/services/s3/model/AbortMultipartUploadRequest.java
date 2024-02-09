package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

public class AbortMultipartUploadRequest extends AmazonWebServiceRequest implements Serializable {

    /* renamed from: r  reason: collision with root package name */
    private String f4324r;

    /* renamed from: s  reason: collision with root package name */
    private String f4325s;

    /* renamed from: t  reason: collision with root package name */
    private String f4326t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f4327u;

    public AbortMultipartUploadRequest(String str, String str2, String str3) {
        this.f4324r = str;
        this.f4325s = str2;
        this.f4326t = str3;
    }

    public String q() {
        return this.f4324r;
    }

    public String r() {
        return this.f4325s;
    }

    public String s() {
        return this.f4326t;
    }

    public boolean t() {
        return this.f4327u;
    }
}
