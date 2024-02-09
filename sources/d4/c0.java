package d4;

import d4.g0;
import java.util.Objects;
import z3.f;

final class c0 extends g0.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f7970a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7971b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7972c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7973d;

    /* renamed from: e  reason: collision with root package name */
    private final int f7974e;

    /* renamed from: f  reason: collision with root package name */
    private final f f7975f;

    c0(String str, String str2, String str3, String str4, int i10, f fVar) {
        Objects.requireNonNull(str, "Null appIdentifier");
        this.f7970a = str;
        Objects.requireNonNull(str2, "Null versionCode");
        this.f7971b = str2;
        Objects.requireNonNull(str3, "Null versionName");
        this.f7972c = str3;
        Objects.requireNonNull(str4, "Null installUuid");
        this.f7973d = str4;
        this.f7974e = i10;
        Objects.requireNonNull(fVar, "Null developmentPlatformProvider");
        this.f7975f = fVar;
    }

    public String a() {
        return this.f7970a;
    }

    public int c() {
        return this.f7974e;
    }

    public f d() {
        return this.f7975f;
    }

    public String e() {
        return this.f7973d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.a)) {
            return false;
        }
        g0.a aVar = (g0.a) obj;
        return this.f7970a.equals(aVar.a()) && this.f7971b.equals(aVar.f()) && this.f7972c.equals(aVar.g()) && this.f7973d.equals(aVar.e()) && this.f7974e == aVar.c() && this.f7975f.equals(aVar.d());
    }

    public String f() {
        return this.f7971b;
    }

    public String g() {
        return this.f7972c;
    }

    public int hashCode() {
        return ((((((((((this.f7970a.hashCode() ^ 1000003) * 1000003) ^ this.f7971b.hashCode()) * 1000003) ^ this.f7972c.hashCode()) * 1000003) ^ this.f7973d.hashCode()) * 1000003) ^ this.f7974e) * 1000003) ^ this.f7975f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f7970a + ", versionCode=" + this.f7971b + ", versionName=" + this.f7972c + ", installUuid=" + this.f7973d + ", deliveryMechanism=" + this.f7974e + ", developmentPlatformProvider=" + this.f7975f + "}";
    }
}
