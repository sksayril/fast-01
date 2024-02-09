package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonServiceException;
import java.util.Map;

public class AmazonS3Exception extends AmazonServiceException {

    /* renamed from: s  reason: collision with root package name */
    private String f4341s;

    /* renamed from: t  reason: collision with root package name */
    private String f4342t;

    /* renamed from: u  reason: collision with root package name */
    private Map<String, String> f4343u;

    /* renamed from: v  reason: collision with root package name */
    private final String f4344v = null;

    public AmazonS3Exception(String str) {
        super(str);
    }

    public Map<String, String> l() {
        return this.f4343u;
    }

    public String m() {
        return this.f4341s;
    }

    public void n(Map<String, String> map) {
        this.f4343u = map;
    }

    public void o(String str) {
        this.f4342t = str;
    }

    public void p(String str) {
        this.f4341s = str;
    }

    public String toString() {
        return super.toString() + ", S3 Extended Request ID: " + m();
    }
}
