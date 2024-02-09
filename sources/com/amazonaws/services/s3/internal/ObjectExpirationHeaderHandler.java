package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectExpirationHeaderHandler<T extends ObjectExpirationResult> implements HeaderHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f4287a = Pattern.compile("expiry-date=\"(.*?)\"");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f4288b = Pattern.compile("rule-id=\"(.*?)\"");

    /* renamed from: c  reason: collision with root package name */
    private static final Log f4289c = LogFactory.b(ObjectExpirationHeaderHandler.class);

    private Date c(String str) {
        Matcher matcher = f4287a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        try {
            return ServiceUtils.d(matcher.group(1));
        } catch (Exception e10) {
            f4289c.i("Error parsing expiry-date from x-amz-expiration header.", e10);
            return null;
        }
    }

    private String d(String str) {
        Matcher matcher = f4288b.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: b */
    public void a(T t9, HttpResponse httpResponse) {
        String str = httpResponse.c().get("x-amz-expiration");
        if (str != null) {
            t9.n(c(str));
            t9.k(d(str));
        }
    }
}
