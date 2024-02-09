package com.amazonaws.services.s3.model;

import java.util.HashMap;
import java.util.Map;

public class TagSet {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f4555a;

    public TagSet(Map<String, String> map) {
        HashMap hashMap = new HashMap(1);
        this.f4555a = hashMap;
        hashMap.putAll(map);
    }

    public Map<String, String> a() {
        return this.f4555a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        stringBuffer.append("Tags: " + a());
        stringBuffer.append("}");
        return stringBuffer.toString();
    }
}
