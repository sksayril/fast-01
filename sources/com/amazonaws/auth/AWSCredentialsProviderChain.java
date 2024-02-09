package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.LinkedList;
import java.util.List;

public class AWSCredentialsProviderChain implements AWSCredentialsProvider {

    /* renamed from: d  reason: collision with root package name */
    private static final Log f3989d = LogFactory.b(AWSCredentialsProviderChain.class);

    /* renamed from: a  reason: collision with root package name */
    private List<AWSCredentialsProvider> f3990a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    private boolean f3991b = true;

    /* renamed from: c  reason: collision with root package name */
    private AWSCredentialsProvider f3992c;

    public AWSCredentialsProviderChain(AWSCredentialsProvider... aWSCredentialsProviderArr) {
        if (aWSCredentialsProviderArr == null || aWSCredentialsProviderArr.length == 0) {
            throw new IllegalArgumentException("No credential providers specified");
        }
        for (AWSCredentialsProvider add : aWSCredentialsProviderArr) {
            this.f3990a.add(add);
        }
    }

    public AWSCredentials a() {
        AWSCredentialsProvider aWSCredentialsProvider;
        if (this.f3991b && (aWSCredentialsProvider = this.f3992c) != null) {
            return aWSCredentialsProvider.a();
        }
        for (AWSCredentialsProvider next : this.f3990a) {
            try {
                AWSCredentials a10 = next.a();
                if (!(a10.c() == null || a10.a() == null)) {
                    Log log = f3989d;
                    log.a("Loading credentials from " + next.toString());
                    this.f3992c = next;
                    return a10;
                }
            } catch (Exception e10) {
                Log log2 = f3989d;
                log2.a("Unable to load credentials from " + next.toString() + ": " + e10.getMessage());
            }
        }
        throw new AmazonClientException("Unable to load AWS credentials from any provider in the chain");
    }
}
