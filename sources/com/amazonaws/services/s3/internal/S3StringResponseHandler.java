package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.util.StringUtils;
import java.io.InputStream;

public class S3StringResponseHandler extends AbstractS3ResponseHandler<String> {
    /* renamed from: e */
    public AmazonWebServiceResponse<String> b(HttpResponse httpResponse) {
        AmazonWebServiceResponse<String> c10 = c(httpResponse);
        byte[] bArr = new byte[1024];
        StringBuilder sb = new StringBuilder();
        InputStream b10 = httpResponse.b();
        while (true) {
            int read = b10.read(bArr);
            if (read > 0) {
                sb.append(new String(bArr, 0, read, StringUtils.f4756a));
            } else {
                c10.d(sb.toString());
                return c10;
            }
        }
    }
}
