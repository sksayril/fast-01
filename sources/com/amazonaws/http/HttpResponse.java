package com.amazonaws.http;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public class HttpResponse {

    /* renamed from: a  reason: collision with root package name */
    private final String f4056a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4057b;

    /* renamed from: c  reason: collision with root package name */
    private final InputStream f4058c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f4059d;

    /* renamed from: e  reason: collision with root package name */
    private InputStream f4060e;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f4061a;

        /* renamed from: b  reason: collision with root package name */
        private int f4062b;

        /* renamed from: c  reason: collision with root package name */
        private InputStream f4063c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, String> f4064d = new HashMap();

        public HttpResponse a() {
            return new HttpResponse(this.f4061a, this.f4062b, Collections.unmodifiableMap(this.f4064d), this.f4063c);
        }

        public Builder b(InputStream inputStream) {
            this.f4063c = inputStream;
            return this;
        }

        public Builder c(String str, String str2) {
            this.f4064d.put(str, str2);
            return this;
        }

        public Builder d(int i10) {
            this.f4062b = i10;
            return this;
        }

        public Builder e(String str) {
            this.f4061a = str;
            return this;
        }
    }

    private HttpResponse(String str, int i10, Map<String, String> map, InputStream inputStream) {
        this.f4056a = str;
        this.f4057b = i10;
        this.f4059d = map;
        this.f4058c = inputStream;
    }

    public static Builder a() {
        return new Builder();
    }

    public InputStream b() {
        if (this.f4060e == null) {
            synchronized (this) {
                this.f4060e = (this.f4058c == null || !"gzip".equals(this.f4059d.get("Content-Encoding"))) ? this.f4058c : new GZIPInputStream(this.f4058c);
            }
        }
        return this.f4060e;
    }

    public Map<String, String> c() {
        return this.f4059d;
    }

    public InputStream d() {
        return this.f4058c;
    }

    public int e() {
        return this.f4057b;
    }

    public String f() {
        return this.f4056a;
    }
}
