package com.google.firebase.crashlytics.internal.common;

import d4.f0;
import java.io.File;
import java.util.Objects;

final class b extends u {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f7275a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7276b;

    /* renamed from: c  reason: collision with root package name */
    private final File f7277c;

    b(f0 f0Var, String str, File file) {
        Objects.requireNonNull(f0Var, "Null report");
        this.f7275a = f0Var;
        Objects.requireNonNull(str, "Null sessionId");
        this.f7276b = str;
        Objects.requireNonNull(file, "Null reportFile");
        this.f7277c = file;
    }

    public f0 b() {
        return this.f7275a;
    }

    public File c() {
        return this.f7277c;
    }

    public String d() {
        return this.f7276b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f7275a.equals(uVar.b()) && this.f7276b.equals(uVar.d()) && this.f7277c.equals(uVar.c());
    }

    public int hashCode() {
        return ((((this.f7275a.hashCode() ^ 1000003) * 1000003) ^ this.f7276b.hashCode()) * 1000003) ^ this.f7277c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f7275a + ", sessionId=" + this.f7276b + ", reportFile=" + this.f7277c + "}";
    }
}
