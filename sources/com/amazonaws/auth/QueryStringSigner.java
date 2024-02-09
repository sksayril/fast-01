package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

public class QueryStringSigner extends AbstractAWSSigner {

    /* renamed from: c  reason: collision with root package name */
    private Date f4026c;

    private String w(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(map);
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    private String x(Request<?> request) {
        URI j10 = request.j();
        Map<String, String> parameters = request.getParameters();
        return "POST" + "\n" + g(j10) + "\n" + y(request) + "\n" + i(parameters);
    }

    private String y(Request<?> request) {
        String str = "";
        if (request.j().getPath() != null) {
            str = str + request.j().getPath();
        }
        if (request.f() != null) {
            if (str.length() > 0 && !str.endsWith("/") && !request.f().startsWith("/")) {
                str = str + "/";
            }
            str = str + request.f();
        } else if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (!str.startsWith("/")) {
            str = "/" + str;
        }
        return str.startsWith("//") ? str.substring(1) : str;
    }

    private String z(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = this.f4026c;
        return date != null ? simpleDateFormat.format(date) : simpleDateFormat.format(l(j10));
    }

    public void A(Request<?> request, SignatureVersion signatureVersion, SigningAlgorithm signingAlgorithm, AWSCredentials aWSCredentials) {
        String str;
        AWSCredentials q9 = q(aWSCredentials);
        request.c("AWSAccessKeyId", q9.c());
        request.c("SignatureVersion", signatureVersion.toString());
        request.c("Timestamp", z(m(request)));
        if (q9 instanceof AWSSessionCredentials) {
            v(request, (AWSSessionCredentials) q9);
        }
        if (signatureVersion.equals(SignatureVersion.V1)) {
            str = w(request.getParameters());
        } else if (signatureVersion.equals(SignatureVersion.V2)) {
            request.c("SignatureMethod", signingAlgorithm.toString());
            str = x(request);
        } else {
            throw new AmazonClientException("Invalid Signature Version specified");
        }
        request.c("Signature", t(str, q9.a(), signingAlgorithm));
    }

    public void a(Request<?> request, AWSCredentials aWSCredentials) {
        A(request, SignatureVersion.V2, SigningAlgorithm.HmacSHA256, aWSCredentials);
    }

    /* access modifiers changed from: protected */
    public void v(Request<?> request, AWSSessionCredentials aWSSessionCredentials) {
        request.c("SecurityToken", aWSSessionCredentials.b());
    }
}
