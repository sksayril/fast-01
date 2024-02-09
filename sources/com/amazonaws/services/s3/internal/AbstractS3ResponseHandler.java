package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.S3ResponseMetadata;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.util.DateUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class AbstractS3ResponseHandler<T> implements HttpResponseHandler<AmazonWebServiceResponse<T>> {

    /* renamed from: a  reason: collision with root package name */
    private static final Log f4276a = LogFactory.b(S3MetadataResponseHandler.class);

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f4277b;

    static {
        HashSet hashSet = new HashSet();
        f4277b = hashSet;
        hashSet.add("Date");
        hashSet.add("Server");
        hashSet.add("x-amz-request-id");
        hashSet.add("x-amz-id-2");
        hashSet.add("X-Amz-Cf-Id");
        hashSet.add("Connection");
    }

    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public AmazonWebServiceResponse<T> c(HttpResponse httpResponse) {
        AmazonWebServiceResponse<T> amazonWebServiceResponse = new AmazonWebServiceResponse<>();
        HashMap hashMap = new HashMap();
        hashMap.put("AWS_REQUEST_ID", httpResponse.c().get("x-amz-request-id"));
        hashMap.put("HOST_ID", httpResponse.c().get("x-amz-id-2"));
        hashMap.put("CLOUD_FRONT_ID", httpResponse.c().get("X-Amz-Cf-Id"));
        amazonWebServiceResponse.c(new S3ResponseMetadata(hashMap));
        return amazonWebServiceResponse;
    }

    /* access modifiers changed from: protected */
    public void d(HttpResponse httpResponse, ObjectMetadata objectMetadata) {
        Map.Entry next;
        Object value;
        Log log;
        StringBuilder sb;
        String str;
        Iterator<Map.Entry<String, String>> it = httpResponse.c().entrySet().iterator();
        while (it.hasNext()) {
            next = it.next();
            String str2 = (String) next.getKey();
            if (str2.startsWith("x-amz-meta-")) {
                objectMetadata.p(str2.substring(11), (String) next.getValue());
            } else if (f4277b.contains(str2)) {
                f4276a.a(String.format("%s is ignored.", new Object[]{str2}));
            } else if (str2.equalsIgnoreCase("Last-Modified")) {
                try {
                    objectMetadata.S(str2, ServiceUtils.d((String) next.getValue()));
                } catch (Exception e10) {
                    e = e10;
                    log = f4276a;
                    sb = new StringBuilder();
                    str = "Unable to parse last modified date: ";
                }
            } else if (str2.equalsIgnoreCase("Content-Length")) {
                try {
                    objectMetadata.S(str2, Long.valueOf(Long.parseLong((String) next.getValue())));
                } catch (NumberFormatException e11) {
                    e = e11;
                    log = f4276a;
                    sb = new StringBuilder();
                    str = "Unable to parse content length: ";
                }
            } else {
                if (str2.equalsIgnoreCase("ETag")) {
                    value = ServiceUtils.e((String) next.getValue());
                } else if (str2.equalsIgnoreCase("Expires")) {
                    try {
                        objectMetadata.T(DateUtils.i((String) next.getValue()));
                    } catch (Exception e12) {
                        e = e12;
                        log = f4276a;
                        sb = new StringBuilder();
                        str = "Unable to parse http expiration date: ";
                    }
                } else if (str2.equalsIgnoreCase("x-amz-expiration")) {
                    new ObjectExpirationHeaderHandler().a(objectMetadata, httpResponse);
                } else if (str2.equalsIgnoreCase("x-amz-restore")) {
                    new ObjectRestoreHeaderHandler().a(objectMetadata, httpResponse);
                } else if (str2.equalsIgnoreCase("x-amz-request-charged")) {
                    new S3RequesterChargedHeaderHandler().a(objectMetadata, httpResponse);
                } else if (str2.equalsIgnoreCase("x-amz-mp-parts-count")) {
                    try {
                        objectMetadata.S(str2, Integer.valueOf(Integer.parseInt((String) next.getValue())));
                    } catch (NumberFormatException e13) {
                        throw new AmazonClientException("Unable to parse part count. Header x-amz-mp-parts-count has corrupted data" + e13.getMessage(), e13);
                    }
                } else {
                    value = next.getValue();
                }
                objectMetadata.S(str2, value);
            }
        }
        return;
        sb.append(str);
        sb.append((String) next.getValue());
        log.i(sb.toString(), e);
    }
}
