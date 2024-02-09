package com.amazonaws.util;

import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

public class ServiceClientHolderInputStream extends SdkFilterInputStream {

    /* renamed from: m  reason: collision with root package name */
    private AmazonWebServiceClient f4755m;

    public ServiceClientHolderInputStream(InputStream inputStream, AmazonWebServiceClient amazonWebServiceClient) {
        super(inputStream);
        this.f4755m = amazonWebServiceClient;
    }
}
