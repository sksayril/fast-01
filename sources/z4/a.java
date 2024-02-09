package z4;

import java.util.Objects;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f13586a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13587b;

    a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f13586a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f13587b = str2;
    }

    public String b() {
        return this.f13586a;
    }

    public String c() {
        return this.f13587b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f13586a.equals(fVar.b()) && this.f13587b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f13586a.hashCode() ^ 1000003) * 1000003) ^ this.f13587b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f13586a + ", version=" + this.f13587b + "}";
    }
}
