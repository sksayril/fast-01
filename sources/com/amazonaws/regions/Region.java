package com.amazonaws.regions;

import java.util.HashMap;
import java.util.Map;

public final class Region {

    /* renamed from: a  reason: collision with root package name */
    private final String f4238a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4239b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f4240c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Boolean> f4241d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Boolean> f4242e = new HashMap();

    Region(String str, String str2) {
        this.f4238a = str;
        if (str2 == null || str2.isEmpty()) {
            this.f4239b = "amazonaws.com";
        } else {
            this.f4239b = str2;
        }
    }

    public static Region e(Regions regions) {
        return RegionUtils.a(regions.getName());
    }

    public static Region f(String str) {
        return RegionUtils.a(str);
    }

    public String a() {
        return this.f4239b;
    }

    /* access modifiers changed from: package-private */
    public Map<String, Boolean> b() {
        return this.f4241d;
    }

    /* access modifiers changed from: package-private */
    public Map<String, Boolean> c() {
        return this.f4242e;
    }

    public String d() {
        return this.f4238a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Region)) {
            return false;
        }
        return d().equals(((Region) obj).d());
    }

    public String g(String str) {
        return this.f4240c.get(str);
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> h() {
        return this.f4240c;
    }

    public int hashCode() {
        return d().hashCode();
    }

    public boolean i(String str) {
        return this.f4240c.containsKey(str);
    }

    public String toString() {
        return d();
    }
}
