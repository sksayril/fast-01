package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.c0;
import java.util.Objects;

final class c extends c0.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7286a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7287b;

    c(String str, String str2) {
        Objects.requireNonNull(str, "Null crashlyticsInstallId");
        this.f7286a = str;
        this.f7287b = str2;
    }

    public String c() {
        return this.f7286a;
    }

    public String d() {
        return this.f7287b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0.a)) {
            return false;
        }
        c0.a aVar = (c0.a) obj;
        if (this.f7286a.equals(aVar.c())) {
            String str = this.f7287b;
            String d10 = aVar.d();
            if (str == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (str.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f7286a.hashCode() ^ 1000003) * 1000003;
        String str = this.f7287b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f7286a + ", firebaseInstallationId=" + this.f7287b + "}";
    }
}
