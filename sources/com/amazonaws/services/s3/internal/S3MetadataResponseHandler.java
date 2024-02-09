package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.model.ObjectMetadata;

public class S3MetadataResponseHandler extends AbstractS3ResponseHandler<ObjectMetadata> {
    /* renamed from: e */
    public AmazonWebServiceResponse<ObjectMetadata> b(HttpResponse httpResponse) {
        ObjectMetadata objectMetadata = new ObjectMetadata();
        d(httpResponse, objectMetadata);
        AmazonWebServiceResponse<ObjectMetadata> c10 = c(httpResponse);
        c10.d(objectMetadata);
        return c10;
    }
}
