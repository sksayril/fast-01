package com.amazonaws;

public class AmazonClientException extends RuntimeException {
    public AmazonClientException(String str) {
        super(str);
    }

    public AmazonClientException(String str, Throwable th) {
        super(str, th);
    }
}
