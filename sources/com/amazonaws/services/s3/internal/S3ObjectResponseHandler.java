package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;

public class S3ObjectResponseHandler extends AbstractS3ResponseHandler<S3Object> {
    public boolean a() {
        return true;
    }

    /* renamed from: e */
    public AmazonWebServiceResponse<S3Object> b(HttpResponse httpResponse) {
        S3Object s3Object = new S3Object();
        AmazonWebServiceResponse<S3Object> c10 = c(httpResponse);
        if (httpResponse.c().get("x-amz-website-redirect-location") != null) {
            s3Object.m(httpResponse.c().get("x-amz-website-redirect-location"));
        }
        if (httpResponse.c().get("x-amz-request-charged") != null) {
            s3Object.b(true);
        }
        if (httpResponse.c().get("x-amz-tagging-count") != null) {
            s3Object.n(Integer.valueOf(Integer.parseInt(httpResponse.c().get("x-amz-tagging-count"))));
        }
        d(httpResponse, s3Object.g());
        s3Object.l(new S3ObjectInputStream(httpResponse.b()));
        c10.d(s3Object);
        return c10;
    }
}
