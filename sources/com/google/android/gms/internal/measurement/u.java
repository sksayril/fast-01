package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class u implements r {

    /* renamed from: m  reason: collision with root package name */
    private final String f5631m;

    /* renamed from: n  reason: collision with root package name */
    private final ArrayList<r> f5632n;

    public u(String str, List<r> list) {
        this.f5631m = str;
        ArrayList<r> arrayList = new ArrayList<>();
        this.f5632n = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f5631m;
    }

    public final r b() {
        return this;
    }

    public final Boolean c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final Double d() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final ArrayList<r> e() {
        return this.f5632n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        String str = this.f5631m;
        if (str == null ? uVar.f5631m != null : !str.equals(uVar.f5631m)) {
            return false;
        }
        ArrayList<r> arrayList = this.f5632n;
        ArrayList<r> arrayList2 = uVar.f5632n;
        return arrayList != null ? arrayList.equals(arrayList2) : arrayList2 == null;
    }

    public final String f() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final Iterator<r> g() {
        return null;
    }

    public final int hashCode() {
        String str = this.f5631m;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ArrayList<r> arrayList = this.f5632n;
        if (arrayList != null) {
            i10 = arrayList.hashCode();
        }
        return hashCode + i10;
    }

    public final r l(String str, s6 s6Var, List<r> list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
