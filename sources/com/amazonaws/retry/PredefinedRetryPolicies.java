package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.retry.RetryPolicy;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Random;

public class PredefinedRetryPolicies {

    /* renamed from: a  reason: collision with root package name */
    public static final RetryPolicy f4245a = new RetryPolicy(RetryPolicy.RetryCondition.f4258a, RetryPolicy.BackoffStrategy.f4257a, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final RetryPolicy f4246b = a();

    /* renamed from: c  reason: collision with root package name */
    public static final RetryPolicy f4247c = b();

    /* renamed from: d  reason: collision with root package name */
    public static final RetryPolicy.RetryCondition f4248d = new SDKDefaultRetryCondition();

    /* renamed from: e  reason: collision with root package name */
    public static final RetryPolicy.BackoffStrategy f4249e = new SDKDefaultBackoffStrategy(100, 20000);

    private static final class SDKDefaultBackoffStrategy implements RetryPolicy.BackoffStrategy {

        /* renamed from: b  reason: collision with root package name */
        private final Random f4250b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4251c;

        /* renamed from: d  reason: collision with root package name */
        private final int f4252d;

        private SDKDefaultBackoffStrategy(int i10, int i11) {
            this.f4250b = new Random();
            this.f4251c = i10;
            this.f4252d = i11;
        }

        public final long a(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i10) {
            if (i10 <= 0) {
                return 0;
            }
            return (long) this.f4250b.nextInt(Math.min(this.f4252d, (1 << i10) * this.f4251c));
        }
    }

    public static class SDKDefaultRetryCondition implements RetryPolicy.RetryCondition {
        public boolean a(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i10) {
            if ((amazonClientException.getCause() instanceof IOException) && !(amazonClientException.getCause() instanceof InterruptedIOException)) {
                return true;
            }
            if (!(amazonClientException instanceof AmazonServiceException)) {
                return false;
            }
            AmazonServiceException amazonServiceException = (AmazonServiceException) amazonClientException;
            int e10 = amazonServiceException.e();
            return e10 == 500 || e10 == 503 || e10 == 502 || e10 == 504 || RetryUtils.c(amazonServiceException) || RetryUtils.a(amazonServiceException);
        }
    }

    public static RetryPolicy a() {
        return new RetryPolicy(f4248d, f4249e, 3, true);
    }

    public static RetryPolicy b() {
        return new RetryPolicy(f4248d, f4249e, 10, true);
    }
}
