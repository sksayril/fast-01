package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.XpathUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.w3c.dom.Document;

public class S3ErrorResponseHandler implements HttpResponseHandler<AmazonServiceException> {

    /* renamed from: a  reason: collision with root package name */
    private static final Log f4300a = LogFactory.b(S3ErrorResponseHandler.class);

    private AmazonServiceException.ErrorType c(int i10) {
        return i10 >= 500 ? AmazonServiceException.ErrorType.Service : AmazonServiceException.ErrorType.Client;
    }

    private AmazonS3Exception e(String str, HttpResponse httpResponse) {
        AmazonS3Exception amazonS3Exception = new AmazonS3Exception(str);
        int e10 = httpResponse.e();
        amazonS3Exception.f(e10 + " " + httpResponse.f());
        amazonS3Exception.k(e10);
        amazonS3Exception.h(c(e10));
        Map<String, String> c10 = httpResponse.c();
        amazonS3Exception.i(c10.get("x-amz-request-id"));
        amazonS3Exception.p(c10.get("x-amz-id-2"));
        amazonS3Exception.o(c10.get("X-Amz-Cf-Id"));
        HashMap hashMap = new HashMap();
        hashMap.put("x-amz-bucket-region", c10.get("x-amz-bucket-region"));
        amazonS3Exception.n(hashMap);
        return amazonS3Exception;
    }

    public boolean a() {
        return false;
    }

    /* renamed from: d */
    public AmazonServiceException b(HttpResponse httpResponse) {
        InputStream b10 = httpResponse.b();
        if (b10 != null) {
            try {
                String iOUtils = IOUtils.toString(b10);
                try {
                    Document d10 = XpathUtils.d(iOUtils);
                    String b11 = XpathUtils.b("Error/Message", d10);
                    String b12 = XpathUtils.b("Error/Code", d10);
                    String b13 = XpathUtils.b("Error/RequestId", d10);
                    String b14 = XpathUtils.b("Error/HostId", d10);
                    AmazonS3Exception amazonS3Exception = new AmazonS3Exception(b11);
                    int e10 = httpResponse.e();
                    amazonS3Exception.k(e10);
                    amazonS3Exception.h(c(e10));
                    amazonS3Exception.f(b12);
                    amazonS3Exception.i(b13);
                    amazonS3Exception.p(b14);
                    amazonS3Exception.o(httpResponse.c().get("X-Amz-Cf-Id"));
                    return amazonS3Exception;
                } catch (Exception e11) {
                    Log log = f4300a;
                    if (log.c()) {
                        log.b("Failed in parsing the response as XML: " + iOUtils, e11);
                    }
                    return e(iOUtils, httpResponse);
                }
            } catch (IOException e12) {
                if (f4300a.c()) {
                    f4300a.b("Failed in reading the error response", e12);
                }
            }
        }
        return e(httpResponse.f(), httpResponse);
    }
}
