package c5;

import kotlin.jvm.internal.l;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final String f3765a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3766b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3767c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f3768d;

    public u(String str, int i10, int i11, boolean z9) {
        l.e(str, "processName");
        this.f3765a = str;
        this.f3766b = i10;
        this.f3767c = i11;
        this.f3768d = z9;
    }

    public final int a() {
        return this.f3767c;
    }

    public final int b() {
        return this.f3766b;
    }

    public final String c() {
        return this.f3765a;
    }

    public final boolean d() {
        return this.f3768d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return l.a(this.f3765a, uVar.f3765a) && this.f3766b == uVar.f3766b && this.f3767c == uVar.f3767c && this.f3768d == uVar.f3768d;
    }

    public int hashCode() {
        int hashCode = ((((this.f3765a.hashCode() * 31) + this.f3766b) * 31) + this.f3767c) * 31;
        boolean z9 = this.f3768d;
        if (z9) {
            z9 = true;
        }
        return hashCode + (z9 ? 1 : 0);
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f3765a + ", pid=" + this.f3766b + ", importance=" + this.f3767c + ", isDefaultProcess=" + this.f3768d + ')';
    }
}
