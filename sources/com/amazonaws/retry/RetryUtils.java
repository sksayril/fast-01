package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class RetryUtils {
    public static boolean a(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        String a10 = amazonServiceException.a();
        return "RequestTimeTooSkewed".equals(a10) || "RequestExpired".equals(a10) || "InvalidSignatureException".equals(a10) || "SignatureDoesNotMatch".equals(a10);
    }

    public static boolean b(Throwable th) {
        if (th instanceof AbortedException) {
            return true;
        }
        if (th.getCause() == null) {
            return false;
        }
        Throwable cause = th.getCause();
        return (cause instanceof InterruptedException) || ((cause instanceof InterruptedIOException) && !(cause instanceof SocketTimeoutException));
    }

    public static boolean c(AmazonServiceException amazonServiceException) {
        if (amazonServiceException == null) {
            return false;
        }
        String a10 = amazonServiceException.a();
        return "Throttling".equals(a10) || "ThrottlingException".equals(a10) || "ProvisionedThroughputExceededException".equals(a10);
    }
}
