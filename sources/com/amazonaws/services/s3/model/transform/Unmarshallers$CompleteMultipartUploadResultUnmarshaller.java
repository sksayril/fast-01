package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.transform.XmlResponsesSaxParser;
import com.amazonaws.transform.Unmarshaller;
import java.io.InputStream;

public final class Unmarshallers$CompleteMultipartUploadResultUnmarshaller implements Unmarshaller<XmlResponsesSaxParser.CompleteMultipartUploadHandler, InputStream> {
    /* renamed from: b */
    public XmlResponsesSaxParser.CompleteMultipartUploadHandler a(InputStream inputStream) {
        return new XmlResponsesSaxParser().i(inputStream);
    }
}
