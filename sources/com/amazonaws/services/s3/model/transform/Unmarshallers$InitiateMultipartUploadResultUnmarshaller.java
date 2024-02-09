package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;

public final class Unmarshallers$InitiateMultipartUploadResultUnmarshaller implements Unmarshaller<InitiateMultipartUploadResult, InputStream> {
    /* renamed from: b */
    public InitiateMultipartUploadResult a(InputStream inputStream) {
        return new XmlResponsesSaxParser().j(inputStream).l();
    }
}
