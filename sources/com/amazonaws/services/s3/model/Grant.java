package com.amazonaws.services.s3.model;

public class Grant {

    /* renamed from: a  reason: collision with root package name */
    private Grantee f4423a;

    /* renamed from: b  reason: collision with root package name */
    private Permission f4424b;

    public Grant(Grantee grantee, Permission permission) {
        this.f4423a = grantee;
        this.f4424b = permission;
    }

    public Grantee a() {
        return this.f4423a;
    }

    public Permission b() {
        return this.f4424b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant grant = (Grant) obj;
        Grantee grantee = this.f4423a;
        if (grantee == null) {
            if (grant.f4423a != null) {
                return false;
            }
        } else if (!grantee.equals(grant.f4423a)) {
            return false;
        }
        return this.f4424b == grant.f4424b;
    }

    public int hashCode() {
        Grantee grantee = this.f4423a;
        int i10 = 0;
        int hashCode = ((grantee == null ? 0 : grantee.hashCode()) + 31) * 31;
        Permission permission = this.f4424b;
        if (permission != null) {
            i10 = permission.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "Grant [grantee=" + this.f4423a + ", permission=" + this.f4424b + "]";
    }
}
