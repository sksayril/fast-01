package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;

public class UploadPartRequest extends AmazonWebServiceRequest implements Serializable {
    private transient InputStream A;
    private File B;
    private long C;
    private boolean D;
    private boolean E;

    /* renamed from: r  reason: collision with root package name */
    private ObjectMetadata f4556r;

    /* renamed from: s  reason: collision with root package name */
    private int f4557s;

    /* renamed from: t  reason: collision with root package name */
    private int f4558t;

    /* renamed from: u  reason: collision with root package name */
    private String f4559u;

    /* renamed from: v  reason: collision with root package name */
    private String f4560v;

    /* renamed from: w  reason: collision with root package name */
    private String f4561w;

    /* renamed from: x  reason: collision with root package name */
    private int f4562x;

    /* renamed from: y  reason: collision with root package name */
    private long f4563y;

    /* renamed from: z  reason: collision with root package name */
    private String f4564z;

    public SSECustomerKey A() {
        return null;
    }

    public String B() {
        return this.f4561w;
    }

    public boolean C() {
        return this.E;
    }

    public void D(File file) {
        this.B = file;
    }

    public void E(long j10) {
        this.C = j10;
    }

    public void F(boolean z9) {
        this.D = z9;
    }

    public UploadPartRequest G(String str) {
        this.f4559u = str;
        return this;
    }

    public UploadPartRequest H(File file) {
        D(file);
        return this;
    }

    public UploadPartRequest I(long j10) {
        E(j10);
        return this;
    }

    public UploadPartRequest J(int i10) {
        this.f4557s = i10;
        return this;
    }

    public UploadPartRequest K(String str) {
        this.f4560v = str;
        return this;
    }

    public UploadPartRequest L(boolean z9) {
        F(z9);
        return this;
    }

    public UploadPartRequest M(int i10) {
        this.f4558t = i10;
        return this;
    }

    public UploadPartRequest N(int i10) {
        this.f4562x = i10;
        return this;
    }

    public UploadPartRequest O(long j10) {
        this.f4563y = j10;
        return this;
    }

    public UploadPartRequest P(String str) {
        this.f4561w = str;
        return this;
    }

    public String q() {
        return this.f4559u;
    }

    public File r() {
        return this.B;
    }

    public long s() {
        return this.C;
    }

    public int t() {
        return this.f4557s;
    }

    public InputStream u() {
        return this.A;
    }

    public String v() {
        return this.f4560v;
    }

    public String w() {
        return this.f4564z;
    }

    public ObjectMetadata x() {
        return this.f4556r;
    }

    public int y() {
        return this.f4562x;
    }

    public long z() {
        return this.f4563y;
    }
}
