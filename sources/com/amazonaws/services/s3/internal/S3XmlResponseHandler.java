package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;
import java.util.Map;

public class S3XmlResponseHandler<T> extends AbstractS3ResponseHandler<T> {

    /* renamed from: e  reason: collision with root package name */
    private static final Log f4307e = LogFactory.c("com.amazonaws.request");

    /* renamed from: c  reason: collision with root package name */
    private Unmarshaller<T, InputStream> f4308c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, String> f4309d;

    public S3XmlResponseHandler(Unmarshaller<T, InputStream> unmarshaller) {
        this.f4308c = unmarshaller;
    }

    /* renamed from: e */
    public AmazonWebServiceResponse<T> b(HttpResponse httpResponse) {
        AmazonWebServiceResponse<T> c10 = c(httpResponse);
        this.f4309d = httpResponse.c();
        if (this.f4308c != null) {
            Log log = f4307e;
            log.j("Beginning to parse service response XML");
            T a10 = this.f4308c.a(httpResponse.b());
            log.j("Done parsing service response XML");
            c10.d(a10);
        }
        return c10;
    }
}
