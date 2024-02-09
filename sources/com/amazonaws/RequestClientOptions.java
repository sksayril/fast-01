package com.amazonaws;

import java.util.EnumMap;
import java.util.Map;

public final class RequestClientOptions {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Marker, String> f3975a = new EnumMap(Marker.class);

    public enum Marker {
        USER_AGENT
    }

    private String b(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str + " " + str2;
    }

    public void a(String str) {
        Map<Marker, String> map = this.f3975a;
        Marker marker = Marker.USER_AGENT;
        String str2 = map.get(marker);
        if (str2 == null) {
            str2 = "";
        }
        d(marker, b(str2, str));
    }

    public String c(Marker marker) {
        return this.f3975a.get(marker);
    }

    public void d(Marker marker, String str) {
        this.f3975a.put(marker, str);
    }
}