package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class AccessControlList implements Serializable, S3RequesterChargedResult {

    /* renamed from: m  reason: collision with root package name */
    private Set<Grant> f4337m;

    /* renamed from: n  reason: collision with root package name */
    private List<Grant> f4338n;

    /* renamed from: o  reason: collision with root package name */
    private Owner f4339o = null;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4340p;

    private void a() {
        if (this.f4337m != null && this.f4338n != null) {
            throw new IllegalStateException("Both grant set and grant list cannot be null");
        }
    }

    public void b(boolean z9) {
        this.f4340p = z9;
    }

    @Deprecated
    public Set<Grant> c() {
        a();
        if (this.f4337m == null) {
            if (this.f4338n == null) {
                this.f4337m = new HashSet();
            } else {
                this.f4337m = new HashSet(this.f4338n);
                this.f4338n = null;
            }
        }
        return this.f4337m;
    }

    public List<Grant> d() {
        a();
        if (this.f4338n == null) {
            if (this.f4337m == null) {
                this.f4338n = new LinkedList();
            } else {
                this.f4338n = new LinkedList(this.f4337m);
                this.f4337m = null;
            }
        }
        return this.f4338n;
    }

    public Owner e() {
        return this.f4339o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessControlList accessControlList = (AccessControlList) obj;
        Owner owner = this.f4339o;
        if (owner == null) {
            if (accessControlList.f4339o != null) {
                return false;
            }
        } else if (!owner.equals(accessControlList.f4339o)) {
            return false;
        }
        Set<Grant> set = this.f4337m;
        if (set == null) {
            if (accessControlList.f4337m != null) {
                return false;
            }
        } else if (!set.equals(accessControlList.f4337m)) {
            return false;
        }
        List<Grant> list = this.f4338n;
        List<Grant> list2 = accessControlList.f4338n;
        if (list == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list.equals(list2)) {
            return false;
        }
        return true;
    }

    public void f(Grantee grantee, Permission permission) {
        d().add(new Grant(grantee, permission));
    }

    public void g(Owner owner) {
        this.f4339o = owner;
    }

    public int hashCode() {
        Owner owner = this.f4339o;
        int i10 = 0;
        int hashCode = ((owner == null ? 0 : owner.hashCode()) + 31) * 31;
        Set<Grant> set = this.f4337m;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        List<Grant> list = this.f4338n;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return "AccessControlList [owner=" + this.f4339o + ", grants=" + d() + "]";
    }
}
