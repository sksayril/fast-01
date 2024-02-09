package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;

public final class RetryPolicy {

    /* renamed from: a  reason: collision with root package name */
    private final RetryCondition f4253a;

    /* renamed from: b  reason: collision with root package name */
    private final BackoffStrategy f4254b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4255c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f4256d;

    public interface BackoffStrategy {

        /* renamed from: a  reason: collision with root package name */
        public static final BackoffStrategy f4257a = new BackoffStrategy() {
            public long a(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i10) {
                return 0;
            }
        };

        long a(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i10);
    }

    public interface RetryCondition {

        /* renamed from: a  reason: collision with root package name */
        public static final RetryCondition f4258a = new RetryCondition() {
            public boolean a(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i10) {
                return false;
            }
        };

        boolean a(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i10);
    }

    public RetryPolicy(RetryCondition retryCondition, BackoffStrategy backoffStrategy, int i10, boolean z9) {
        retryCondition = retryCondition == null ? PredefinedRetryPolicies.f4248d : retryCondition;
        backoffStrategy = backoffStrategy == null ? PredefinedRetryPolicies.f4249e : backoffStrategy;
        if (i10 >= 0) {
            this.f4253a = retryCondition;
            this.f4254b = backoffStrategy;
            this.f4255c = i10;
            this.f4256d = z9;
            return;
        }
        throw new IllegalArgumentException("Please provide a non-negative value for maxErrorRetry.");
    }

    public BackoffStrategy a() {
        return this.f4254b;
    }

    public int b() {
        return this.f4255c;
    }

    public RetryCondition c() {
        return this.f4253a;
    }

    public boolean d() {
        return this.f4256d;
    }
}
