package g8;

import java.io.Serializable;

public final class l<A, B> implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private final A f8968m;

    /* renamed from: n  reason: collision with root package name */
    private final B f8969n;

    public l(A a10, B b10) {
        this.f8968m = a10;
        this.f8969n = b10;
    }

    public final A a() {
        return this.f8968m;
    }

    public final B b() {
        return this.f8969n;
    }

    public final A c() {
        return this.f8968m;
    }

    public final B d() {
        return this.f8969n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.l.a(this.f8968m, lVar.f8968m) && kotlin.jvm.internal.l.a(this.f8969n, lVar.f8969n);
    }

    public int hashCode() {
        A a10 = this.f8968m;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f8969n;
        if (b10 != null) {
            i10 = b10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return '(' + this.f8968m + ", " + this.f8969n + ')';
    }
}
