package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class ResponseHeaderHandlerChain<T> extends S3XmlResponseHandler<T> {

    /* renamed from: f  reason: collision with root package name */
    private final List<HeaderHandler<T>> f4298f;

    public ResponseHeaderHandlerChain(Unmarshaller<T, InputStream> unmarshaller, HeaderHandler<T>... headerHandlerArr) {
        super(unmarshaller);
        this.f4298f = Arrays.asList(headerHandlerArr);
    }

    /* renamed from: e */
    public AmazonWebServiceResponse<T> b(HttpResponse httpResponse) {
        AmazonWebServiceResponse<T> e10 = super.b(httpResponse);
        T b10 = e10.b();
        if (b10 != null) {
            for (HeaderHandler<T> a10 : this.f4298f) {
                a10.a(b10, httpResponse);
            }
        }
        return e10;
    }
}
