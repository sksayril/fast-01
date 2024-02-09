package c4;

import java.util.Objects;

final class b extends i {

    /* renamed from: b  reason: collision with root package name */
    private final String f3577b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3578c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3579d;

    /* renamed from: e  reason: collision with root package name */
    private final String f3580e;

    /* renamed from: f  reason: collision with root package name */
    private final long f3581f;

    b(String str, String str2, String str3, String str4, long j10) {
        Objects.requireNonNull(str, "Null rolloutId");
        this.f3577b = str;
        Objects.requireNonNull(str2, "Null parameterKey");
        this.f3578c = str2;
        Objects.requireNonNull(str3, "Null parameterValue");
        this.f3579d = str3;
        Objects.requireNonNull(str4, "Null variantId");
        this.f3580e = str4;
        this.f3581f = j10;
    }

    public String c() {
        return this.f3578c;
    }

    public String d() {
        return this.f3579d;
    }

    public String e() {
        return this.f3577b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3577b.equals(iVar.e()) && this.f3578c.equals(iVar.c()) && this.f3579d.equals(iVar.d()) && this.f3580e.equals(iVar.g()) && this.f3581f == iVar.f();
    }

    public long f() {
        return this.f3581f;
    }

    public String g() {
        return this.f3580e;
    }

    public int hashCode() {
        long j10 = this.f3581f;
        return ((((((((this.f3577b.hashCode() ^ 1000003) * 1000003) ^ this.f3578c.hashCode()) * 1000003) ^ this.f3579d.hashCode()) * 1000003) ^ this.f3580e.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f3577b + ", parameterKey=" + this.f3578c + ", parameterValue=" + this.f3579d + ", variantId=" + this.f3580e + ", templateVersion=" + this.f3581f + "}";
    }
}
