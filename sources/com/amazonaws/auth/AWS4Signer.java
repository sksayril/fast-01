package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class AWS4Signer extends AbstractAWSSigner implements ServiceAwareSigner, RegionAwareSigner {

    /* renamed from: g  reason: collision with root package name */
    protected static final Log f3980g = LogFactory.b(AWS4Signer.class);

    /* renamed from: c  reason: collision with root package name */
    protected String f3981c;

    /* renamed from: d  reason: collision with root package name */
    protected String f3982d;

    /* renamed from: e  reason: collision with root package name */
    protected Date f3983e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f3984f;

    protected static class HeaderSigningResult {

        /* renamed from: a  reason: collision with root package name */
        private final String f3985a;

        /* renamed from: b  reason: collision with root package name */
        private final String f3986b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f3987c;

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f3988d;

        public HeaderSigningResult(String str, String str2, byte[] bArr, byte[] bArr2) {
            this.f3985a = str;
            this.f3986b = str2;
            this.f3987c = bArr;
            this.f3988d = bArr2;
        }

        public String a() {
            return this.f3985a;
        }

        public byte[] b() {
            byte[] bArr = this.f3987c;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public String c() {
            return this.f3986b;
        }

        public byte[] d() {
            byte[] bArr = this.f3988d;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
    }

    public AWS4Signer() {
        this(true);
    }

    public AWS4Signer(boolean z9) {
        this.f3984f = z9;
    }

    /* access modifiers changed from: protected */
    public String A(URI uri) {
        String str = this.f3981c;
        return str != null ? str : AwsHostNameUtils.c(uri);
    }

    /* access modifiers changed from: protected */
    public String B(Request<?> request, String str) {
        String c10 = request.e() != null ? HttpUtils.c(request.j().getPath(), request.e()) : HttpUtils.a(request.j().getPath(), request.f());
        String str2 = request.t().toString() + "\n" + j(c10, this.f3984f) + "\n" + h(request) + "\n" + C(request) + "\n" + G(request) + "\n" + str;
        f3980g.a("AWS4 Canonical Request: '\"" + str2 + "\"");
        return str2;
    }

    /* access modifiers changed from: protected */
    public String C(Request<?> request) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(request.l().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (J(str)) {
                String replaceAll = StringUtils.b(str).replaceAll("\\s+", " ");
                String str2 = request.l().get(str);
                sb.append(replaceAll);
                sb.append(":");
                if (str2 != null) {
                    sb.append(str2.replaceAll("\\s+", " "));
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final long D(Request<?> request) {
        Date l10 = l(m(request));
        Date date = this.f3983e;
        if (date != null) {
            l10 = date;
        }
        return l10.getTime();
    }

    /* access modifiers changed from: protected */
    public final String E(long j10) {
        return DateUtils.c("yyyyMMdd", new Date(j10));
    }

    /* access modifiers changed from: protected */
    public String F(Request<?> request, String str) {
        String z9 = z(request.j());
        String A = A(request.j());
        return str + "/" + z9 + "/" + A + "/" + "aws4_request";
    }

    /* access modifiers changed from: protected */
    public String G(Request<?> request) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(request.l().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (J(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(StringUtils.b(str));
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public String H(String str, String str2, String str3, String str4) {
        String str5 = str + "\n" + str2 + "\n" + str3 + "\n" + BinaryUtils.a(o(str4));
        f3980g.a("AWS4 String to Sign: '\"" + str5 + "\"");
        return str5;
    }

    /* access modifiers changed from: protected */
    public final String I(long j10) {
        return DateUtils.c("yyyyMMdd'T'HHmmss'Z'", new Date(j10));
    }

    /* access modifiers changed from: package-private */
    public boolean J(String str) {
        return "date".equalsIgnoreCase(str) || "Content-MD5".equalsIgnoreCase(str) || "host".equalsIgnoreCase(str) || str.startsWith("x-amz") || str.startsWith("X-Amz");
    }

    /* access modifiers changed from: protected */
    public void K(Request<?> request, HeaderSigningResult headerSigningResult) {
    }

    public void a(Request<?> request, AWSCredentials aWSCredentials) {
        AWSCredentials q9 = q(aWSCredentials);
        if (q9 instanceof AWSSessionCredentials) {
            w(request, (AWSSessionCredentials) q9);
        }
        v(request);
        long D = D(request);
        String E = E(D);
        String F = F(request, E);
        String x9 = x(request);
        String I = I(D);
        request.i("X-Amz-Date", I);
        if (request.l().get("x-amz-content-sha256") != null && "required".equals(request.l().get("x-amz-content-sha256"))) {
            request.i("x-amz-content-sha256", x9);
        }
        HeaderSigningResult y9 = y(request, E, I, "AWS4-HMAC-SHA256", x9, q9);
        request.i("Authorization", "AWS4-HMAC-SHA256 " + ("Credential=" + (q9.c() + "/" + F)) + ", " + ("SignedHeaders=" + G(request)) + ", " + ("Signature=" + BinaryUtils.a(y9.d())));
        K(request, y9);
    }

    public void b(String str) {
        this.f3982d = str;
    }

    public void c(String str) {
        this.f3981c = str;
    }

    /* access modifiers changed from: protected */
    public void v(Request<?> request) {
        String host = request.j().getHost();
        if (HttpUtils.e(request.j())) {
            host = host + ":" + request.j().getPort();
        }
        request.i("Host", host);
    }

    /* access modifiers changed from: protected */
    public void w(Request<?> request, AWSSessionCredentials aWSSessionCredentials) {
        request.i("x-amz-security-token", aWSSessionCredentials.b());
    }

    /* access modifiers changed from: protected */
    public String x(Request<?> request) {
        InputStream e10 = e(request);
        e10.mark(-1);
        String a10 = BinaryUtils.a(n(e10));
        try {
            e10.reset();
            return a10;
        } catch (IOException e11) {
            throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", e11);
        }
    }

    /* access modifiers changed from: protected */
    public final HeaderSigningResult y(Request<?> request, String str, String str2, String str3, String str4, AWSCredentials aWSCredentials) {
        String z9 = z(request.j());
        String A = A(request.j());
        String str5 = str + "/" + z9 + "/" + A + "/" + "aws4_request";
        String H = H(str3, str2, str5, B(request, str4));
        Charset charset = StringUtils.f4756a;
        byte[] bytes = ("AWS4" + aWSCredentials.a()).getBytes(charset);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        byte[] r9 = r("aws4_request", r(A, r(z9, r(str, bytes, signingAlgorithm), signingAlgorithm), signingAlgorithm), signingAlgorithm);
        return new HeaderSigningResult(str2, str5, r9, s(H.getBytes(charset), r9, signingAlgorithm));
    }

    /* access modifiers changed from: protected */
    public String z(URI uri) {
        String str = this.f3982d;
        return str != null ? str : AwsHostNameUtils.a(uri.getHost(), this.f3981c);
    }
}
