package com.amazonaws;

public class AmazonWebServiceResponse<T> {

    /* renamed from: a  reason: collision with root package name */
    private T f3938a;

    /* renamed from: b  reason: collision with root package name */
    private ResponseMetadata f3939b;

    public String a() {
        ResponseMetadata responseMetadata = this.f3939b;
        if (responseMetadata == null) {
            return null;
        }
        return responseMetadata.a();
    }

    public T b() {
        return this.f3938a;
    }

    public void c(ResponseMetadata responseMetadata) {
        this.f3939b = responseMetadata;
    }

    public void d(T t9) {
        this.f3938a = t9;
    }
}
