package com.amazonaws.http;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class HttpRequestFactory {
    private void a(Map<String, String> map, Request<?> request, ExecutionContext executionContext, ClientConfiguration clientConfiguration) {
        URI j10 = request.j();
        String host = j10.getHost();
        if (HttpUtils.e(j10)) {
            host = host + ":" + j10.getPort();
        }
        map.put("Host", host);
        for (Map.Entry next : request.l().entrySet()) {
            map.put(next.getKey(), next.getValue());
        }
        if (map.get("Content-Type") == null || map.get("Content-Type").isEmpty()) {
            map.put("Content-Type", "application/x-www-form-urlencoded; charset=" + StringUtils.b("UTF-8"));
        }
        if (executionContext != null && executionContext.b() != null) {
            map.put("User-Agent", c(clientConfiguration, executionContext.b()));
        }
    }

    private String c(ClientConfiguration clientConfiguration, String str) {
        if (clientConfiguration.h().contains(str)) {
            return clientConfiguration.h();
        }
        return clientConfiguration.h() + " " + str;
    }

    public HttpRequest b(Request<?> request, ClientConfiguration clientConfiguration, ExecutionContext executionContext) {
        URI j10 = request.j();
        String e10 = request.e();
        boolean z9 = true;
        String uri = j10.toString();
        String c10 = e10 != null ? HttpUtils.c(uri, request.e()) : HttpUtils.b(uri, request.f(), true);
        String d10 = HttpUtils.d(request);
        HttpMethodName t9 = request.t();
        boolean z10 = request.w() != null;
        HttpMethodName httpMethodName = HttpMethodName.POST;
        if ((t9 == httpMethodName) && !z10) {
            z9 = false;
        }
        if (d10 != null && z9) {
            c10 = c10 + "?" + d10;
        }
        HashMap hashMap = new HashMap();
        a(hashMap, request, executionContext, clientConfiguration);
        InputStream w9 = request.w();
        HttpMethodName httpMethodName2 = HttpMethodName.PATCH;
        if (t9 == httpMethodName2) {
            hashMap.put("X-HTTP-Method-Override", httpMethodName2.toString());
            t9 = httpMethodName;
        }
        if (t9 == httpMethodName && request.w() == null && d10 != null) {
            byte[] bytes = d10.getBytes(StringUtils.f4756a);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            hashMap.put("Content-Length", String.valueOf(bytes.length));
            w9 = byteArrayInputStream;
        }
        hashMap.put("Accept-Encoding", (!clientConfiguration.k() || hashMap.get("Accept-Encoding") != null) ? "identity" : "gzip");
        HttpRequest httpRequest = new HttpRequest(t9.toString(), URI.create(c10), hashMap, w9);
        httpRequest.g(request.n());
        return httpRequest;
    }
}
