package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class Tag implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private String f4553m;

    /* renamed from: n  reason: collision with root package name */
    private String f4554n;

    public Tag(String str, String str2) {
        this.f4553m = str;
        this.f4554n = str2;
    }

    public String a() {
        return this.f4553m;
    }

    public String b() {
        return this.f4554n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tag tag = (Tag) obj;
        String str = this.f4553m;
        if (str == null ? tag.f4553m != null : !str.equals(tag.f4553m)) {
            return false;
        }
        String str2 = this.f4554n;
        String str3 = tag.f4554n;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f4553m;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f4554n;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }
}
