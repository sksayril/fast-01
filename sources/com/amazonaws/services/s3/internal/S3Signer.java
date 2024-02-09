package com.amazonaws.services.s3.internal;

import com.amazonaws.Request;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.auth.AbstractAWSSigner;
import com.amazonaws.auth.SigningAlgorithm;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.HttpUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class S3Signer extends AbstractAWSSigner {

    /* renamed from: f  reason: collision with root package name */
    private static final Log f4303f = LogFactory.b(S3Signer.class);

    /* renamed from: c  reason: collision with root package name */
    private final String f4304c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4305d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<String> f4306e;

    public S3Signer() {
        this.f4304c = null;
        this.f4305d = null;
        this.f4306e = null;
    }

    public S3Signer(String str, String str2) {
        this(str, str2, (Collection<String>) null);
    }

    public S3Signer(String str, String str2, Collection<String> collection) {
        if (str2 != null) {
            this.f4304c = str;
            this.f4305d = str2;
            this.f4306e = collection == null ? null : Collections.unmodifiableSet(new HashSet(collection));
            return;
        }
        throw new IllegalArgumentException("Parameter resourcePath is empty");
    }

    public void a(Request<?> request, AWSCredentials aWSCredentials) {
        w(request, aWSCredentials, (Date) null);
    }

    /* access modifiers changed from: protected */
    public void v(Request<?> request, AWSSessionCredentials aWSSessionCredentials) {
        request.i("x-amz-security-token", aWSSessionCredentials.b());
    }

    /* access modifiers changed from: package-private */
    public void w(Request<?> request, AWSCredentials aWSCredentials, Date date) {
        if (this.f4305d == null) {
            throw new UnsupportedOperationException("Cannot sign a request using a dummy S3Signer instance with no resource path");
        } else if (aWSCredentials == null || aWSCredentials.a() == null) {
            f4303f.a("Canonical string will not be signed, as no AWS Secret Key was provided");
        } else {
            AWSCredentials q9 = q(aWSCredentials);
            if (q9 instanceof AWSSessionCredentials) {
                v(request, (AWSSessionCredentials) q9);
            }
            String b10 = HttpUtils.b(request.j().getPath(), this.f4305d, true);
            Date l10 = l(m(request));
            if (date == null) {
                date = l10;
            }
            request.i("Date", ServiceUtils.a(date));
            String a10 = RestUtils.a(this.f4304c, b10, request, (String) null, this.f4306e);
            Log log = f4303f;
            log.a("Calculated string to sign:\n\"" + a10 + "\"");
            String t9 = super.t(a10, q9.a(), SigningAlgorithm.HmacSHA1);
            request.i("Authorization", "AWS " + q9.c() + ":" + t9);
        }
    }
}
