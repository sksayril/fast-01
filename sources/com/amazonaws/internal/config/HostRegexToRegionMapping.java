package com.amazonaws.internal.config;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HostRegexToRegionMapping {

    /* renamed from: a  reason: collision with root package name */
    private final String f4075a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4076b;

    public HostRegexToRegionMapping(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex must be non-empty");
        }
        try {
            Pattern.compile(str);
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: regionName must be non-empty");
            }
            this.f4075a = str;
            this.f4076b = str2;
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex is not a valid regex", e10);
        }
    }

    public String a() {
        return this.f4075a;
    }

    public String b() {
        return this.f4076b;
    }
}
