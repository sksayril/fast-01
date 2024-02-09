package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.services.s3.AmazonS3;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class S3ClientReference {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Integer, AmazonS3> f4108a = new ConcurrentHashMap();

    public static AmazonS3 a(Integer num) {
        return f4108a.get(num);
    }

    public static void b(Integer num, AmazonS3 amazonS3) {
        f4108a.put(num, amazonS3);
    }

    public static void c(Integer num) {
        f4108a.remove(num);
    }
}
