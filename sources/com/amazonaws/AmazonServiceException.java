package com.amazonaws;

public class AmazonServiceException extends AmazonClientException {

    /* renamed from: m  reason: collision with root package name */
    private String f3916m;

    /* renamed from: n  reason: collision with root package name */
    private String f3917n;

    /* renamed from: o  reason: collision with root package name */
    private ErrorType f3918o = ErrorType.Unknown;

    /* renamed from: p  reason: collision with root package name */
    private String f3919p;

    /* renamed from: q  reason: collision with root package name */
    private int f3920q;

    /* renamed from: r  reason: collision with root package name */
    private String f3921r;

    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    public AmazonServiceException(String str) {
        super(str);
        this.f3919p = str;
    }

    public String a() {
        return this.f3917n;
    }

    public String b() {
        return this.f3919p;
    }

    public String c() {
        return this.f3916m;
    }

    public String d() {
        return this.f3921r;
    }

    public int e() {
        return this.f3920q;
    }

    public void f(String str) {
        this.f3917n = str;
    }

    public void g(String str) {
        this.f3919p = str;
    }

    public String getMessage() {
        return b() + " (Service: " + d() + "; Status Code: " + e() + "; Error Code: " + a() + "; Request ID: " + c() + ")";
    }

    public void h(ErrorType errorType) {
        this.f3918o = errorType;
    }

    public void i(String str) {
        this.f3916m = str;
    }

    public void j(String str) {
        this.f3921r = str;
    }

    public void k(int i10) {
        this.f3920q = i10;
    }
}
