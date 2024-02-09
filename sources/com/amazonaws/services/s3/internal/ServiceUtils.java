package com.amazonaws.services.s3.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.DateUtils;
import java.util.Date;
import java.util.List;

public class ServiceUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final Log f4313a = LogFactory.b(ServiceUtils.class);
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    protected static final DateUtils f4314b = new DateUtils();

    public static String a(Date date) {
        return DateUtils.d(date);
    }

    public static String b(List<String> list) {
        String str = "";
        boolean z9 = true;
        for (String next : list) {
            if (!z9) {
                str = str + ", ";
            }
            str = str + next;
            z9 = false;
        }
        return str;
    }

    public static Date c(String str) {
        return DateUtils.h(str);
    }

    public static Date d(String str) {
        return DateUtils.i(str);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("\"")) {
            trim = trim.substring(1);
        }
        return trim.endsWith("\"") ? trim.substring(0, trim.length() - 1) : trim;
    }

    public static boolean f(AmazonWebServiceRequest amazonWebServiceRequest, S3ClientOptions s3ClientOptions) {
        if ((s3ClientOptions != null && s3ClientOptions.b()) || System.getProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation") != null) {
            return true;
        }
        if (amazonWebServiceRequest instanceof GetObjectRequest) {
            GetObjectRequest getObjectRequest = (GetObjectRequest) amazonWebServiceRequest;
            if (getObjectRequest.v() != null) {
                return true;
            }
            getObjectRequest.x();
        } else if (amazonWebServiceRequest instanceof PutObjectRequest) {
            PutObjectRequest putObjectRequest = (PutObjectRequest) amazonWebServiceRequest;
            ObjectMetadata y9 = putObjectRequest.y();
            if (y9 != null && y9.E() != null) {
                return true;
            }
            putObjectRequest.B();
            return (putObjectRequest.A() == null || (putObjectRequest.A().b() == null && putObjectRequest.A().a() == null)) ? false : true;
        } else if (amazonWebServiceRequest instanceof UploadPartRequest) {
            ((UploadPartRequest) amazonWebServiceRequest).A();
        }
    }
}
