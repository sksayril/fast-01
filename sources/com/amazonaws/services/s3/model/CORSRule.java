package com.amazonaws.services.s3.model;

import java.util.List;

public class CORSRule {

    /* renamed from: a  reason: collision with root package name */
    private String f4378a;

    /* renamed from: b  reason: collision with root package name */
    private List<AllowedMethods> f4379b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f4380c;

    /* renamed from: d  reason: collision with root package name */
    private int f4381d;

    /* renamed from: e  reason: collision with root package name */
    private List<String> f4382e;

    /* renamed from: f  reason: collision with root package name */
    private List<String> f4383f;

    public enum AllowedMethods {
        GET("GET"),
        PUT("PUT"),
        HEAD("HEAD"),
        POST("POST"),
        DELETE("DELETE");
        
        private final String AllowedMethod;

        private AllowedMethods(String str) {
            this.AllowedMethod = str;
        }

        public static AllowedMethods fromValue(String str) {
            for (AllowedMethods allowedMethods : values()) {
                String allowedMethods2 = allowedMethods.toString();
                if (allowedMethods2 == null && str == null) {
                    return allowedMethods;
                }
                if (allowedMethods2 != null && allowedMethods2.equals(str)) {
                    return allowedMethods;
                }
            }
            throw new IllegalArgumentException("Cannot create enum from " + str + " value!");
        }

        public String toString() {
            return this.AllowedMethod;
        }
    }

    public void a(List<String> list) {
        this.f4383f = list;
    }

    public void b(List<AllowedMethods> list) {
        this.f4379b = list;
    }

    public void c(List<String> list) {
        this.f4380c = list;
    }

    public void d(List<String> list) {
        this.f4382e = list;
    }

    public void e(String str) {
        this.f4378a = str;
    }

    public void f(int i10) {
        this.f4381d = i10;
    }
}
