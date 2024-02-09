package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.s3.internal.ObjectRestoreResult;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectRestoreHeaderHandler<T extends ObjectRestoreResult> implements HeaderHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f4290a = Pattern.compile("expiry-date=\"(.*?)\"");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f4291b = Pattern.compile("ongoing-request=\"(.*?)\"");

    /* renamed from: c  reason: collision with root package name */
    private static final Log f4292c = LogFactory.b(ObjectRestoreHeaderHandler.class);

    private Boolean c(String str) {
        Matcher matcher = f4291b.matcher(str);
        if (matcher.find()) {
            return Boolean.valueOf(Boolean.parseBoolean(matcher.group(1)));
        }
        return null;
    }

    private Date d(String str) {
        Matcher matcher = f4290a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        try {
            return ServiceUtils.d(matcher.group(1));
        } catch (Exception e10) {
            f4292c.i("Error parsing expiry-date from x-amz-restore header.", e10);
            return null;
        }
    }

    /* renamed from: b */
    public void a(T t9, HttpResponse httpResponse) {
        String str = httpResponse.c().get("x-amz-restore");
        if (str != null) {
            t9.h(d(str));
            Boolean c10 = c(str);
            if (c10 != null) {
                t9.i(c10.booleanValue());
            }
        }
    }
}
