package com.amazonaws.http;

import com.amazonaws.util.StringUtils;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Map;

public class HttpRequest {

    /* renamed from: a  reason: collision with root package name */
    private final String f4051a;

    /* renamed from: b  reason: collision with root package name */
    private URI f4052b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f4053c;

    /* renamed from: d  reason: collision with root package name */
    private final InputStream f4054d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4055e;

    public HttpRequest(String str, URI uri, Map<String, String> map, InputStream inputStream) {
        this.f4051a = StringUtils.c(str);
        this.f4052b = uri;
        this.f4053c = map == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(map);
        this.f4054d = inputStream;
    }

    public InputStream a() {
        return this.f4054d;
    }

    public long b() {
        String str;
        Map<String, String> map = this.f4053c;
        if (map == null || (str = map.get("Content-Length")) == null || str.isEmpty()) {
            return 0;
        }
        return Long.valueOf(str).longValue();
    }

    public Map<String, String> c() {
        return this.f4053c;
    }

    public String d() {
        return this.f4051a;
    }

    public URI e() {
        return this.f4052b;
    }

    public boolean f() {
        return this.f4055e;
    }

    public void g(boolean z9) {
        this.f4055e = z9;
    }
}
