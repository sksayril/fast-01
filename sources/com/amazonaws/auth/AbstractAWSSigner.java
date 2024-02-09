package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.internal.SdkDigestInputStream;
import com.amazonaws.util.Base64;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public abstract class AbstractAWSSigner implements Signer {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3993a = BinaryUtils.a(d(""));

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<MessageDigest> f3994b = new ThreadLocal<MessageDigest>() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public MessageDigest initialValue() {
            try {
                return MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException e10) {
                throw new AmazonClientException("Unable to get SHA256 Function" + e10.getMessage(), e10);
            }
        }
    };

    private static byte[] d(String str) {
        try {
            MessageDigest k10 = k();
            k10.update(str.getBytes(StringUtils.f4756a));
            return k10.digest();
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e10.getMessage(), e10);
        }
    }

    private static MessageDigest k() {
        MessageDigest messageDigest = f3994b.get();
        messageDigest.reset();
        return messageDigest;
    }

    /* access modifiers changed from: protected */
    public InputStream e(Request<?> request) {
        if (!HttpUtils.g(request)) {
            return f(request);
        }
        String d10 = HttpUtils.d(request);
        return d10 == null ? new ByteArrayInputStream(new byte[0]) : new ByteArrayInputStream(d10.getBytes(StringUtils.f4756a));
    }

    /* access modifiers changed from: protected */
    public InputStream f(Request<?> request) {
        try {
            InputStream w9 = request.w();
            if (w9 == null) {
                return new ByteArrayInputStream(new byte[0]);
            }
            if (w9.markSupported()) {
                return request.w();
            }
            throw new AmazonClientException("Unable to read request payload to sign request.");
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to read request payload to sign request: " + e10.getMessage(), e10);
        }
    }

    /* access modifiers changed from: protected */
    public String g(URI uri) {
        String b10 = StringUtils.b(uri.getHost());
        if (!HttpUtils.e(uri)) {
            return b10;
        }
        return b10 + ":" + uri.getPort();
    }

    /* access modifiers changed from: protected */
    public String h(Request<?> request) {
        return HttpUtils.g(request) ? "" : i(request.getParameters());
    }

    /* access modifiers changed from: protected */
    public String i(Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry next : map.entrySet()) {
            treeMap.put(HttpUtils.f((String) next.getKey(), false), HttpUtils.f((String) next.getValue(), false));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append((String) entry.getKey());
            sb.append("=");
            sb.append((String) entry.getValue());
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String j(String str, boolean z9) {
        if (str == null || str.length() == 0) {
            return "/";
        }
        if (z9) {
            str = HttpUtils.f(str, true);
        }
        return str.startsWith("/") ? str : "/".concat(str);
    }

    /* access modifiers changed from: protected */
    public Date l(long j10) {
        Date date = new Date();
        return j10 != 0 ? new Date(date.getTime() - (j10 * 1000)) : date;
    }

    /* access modifiers changed from: protected */
    public long m(Request<?> request) {
        return SDKGlobalConfiguration.a() != 0 ? SDKGlobalConfiguration.a() : request.p();
    }

    /* access modifiers changed from: protected */
    public byte[] n(InputStream inputStream) {
        try {
            SdkDigestInputStream sdkDigestInputStream = new SdkDigestInputStream(inputStream, k());
            while (sdkDigestInputStream.read(new byte[1024]) > -1) {
            }
            return sdkDigestInputStream.getMessageDigest().digest();
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e10.getMessage(), e10);
        }
    }

    public byte[] o(String str) {
        return d(str);
    }

    public byte[] p(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return instance.digest();
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to compute hash while signing request: " + e10.getMessage(), e10);
        }
    }

    /* access modifiers changed from: protected */
    public AWSCredentials q(AWSCredentials aWSCredentials) {
        String c10;
        String a10;
        String b10;
        synchronized (aWSCredentials) {
            c10 = aWSCredentials.c();
            a10 = aWSCredentials.a();
            b10 = aWSCredentials instanceof AWSSessionCredentials ? ((AWSSessionCredentials) aWSCredentials).b() : null;
        }
        if (a10 != null) {
            a10 = a10.trim();
        }
        if (c10 != null) {
            c10 = c10.trim();
        }
        if (b10 != null) {
            b10 = b10.trim();
        }
        return aWSCredentials instanceof AWSSessionCredentials ? new BasicSessionCredentials(c10, a10, b10) : new BasicAWSCredentials(c10, a10);
    }

    public byte[] r(String str, byte[] bArr, SigningAlgorithm signingAlgorithm) {
        try {
            return s(str.getBytes(StringUtils.f4756a), bArr, signingAlgorithm);
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e10.getMessage(), e10);
        }
    }

    /* access modifiers changed from: protected */
    public byte[] s(byte[] bArr, byte[] bArr2, SigningAlgorithm signingAlgorithm) {
        try {
            Mac instance = Mac.getInstance(signingAlgorithm.toString());
            instance.init(new SecretKeySpec(bArr2, signingAlgorithm.toString()));
            return instance.doFinal(bArr);
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e10.getMessage(), e10);
        }
    }

    /* access modifiers changed from: protected */
    public String t(String str, String str2, SigningAlgorithm signingAlgorithm) {
        return u(str.getBytes(StringUtils.f4756a), str2, signingAlgorithm);
    }

    /* access modifiers changed from: protected */
    public String u(byte[] bArr, String str, SigningAlgorithm signingAlgorithm) {
        try {
            return Base64.encodeAsString(s(bArr, str.getBytes(StringUtils.f4756a), signingAlgorithm));
        } catch (Exception e10) {
            throw new AmazonClientException("Unable to calculate a request signature: " + e10.getMessage(), e10);
        }
    }
}
