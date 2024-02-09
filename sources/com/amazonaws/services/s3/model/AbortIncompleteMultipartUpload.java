package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class AbortIncompleteMultipartUpload implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private int f4323m;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbortIncompleteMultipartUpload clone() {
        try {
            return (AbortIncompleteMultipartUpload) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() even though we're Cloneable!", e10);
        }
    }

    public void b(int i10) {
        this.f4323m = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f4323m == ((AbortIncompleteMultipartUpload) obj).f4323m;
    }

    public int hashCode() {
        return this.f4323m;
    }
}
