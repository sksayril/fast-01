package com.amazonaws;

import java.util.Map;

public class ResponseMetadata {

    /* renamed from: a  reason: collision with root package name */
    protected final Map<String, String> f3978a;

    public ResponseMetadata(Map<String, String> map) {
        this.f3978a = map;
    }

    public String a() {
        return this.f3978a.get("AWS_REQUEST_ID");
    }

    public String toString() {
        Map<String, String> map = this.f3978a;
        return map == null ? "{}" : map.toString();
    }
}
