package c5;

import a9.a;
import kotlin.jvm.internal.l;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final String f3804a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3805b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3806c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3807d;

    public z(String str, String str2, int i10, long j10) {
        l.e(str, "sessionId");
        l.e(str2, "firstSessionId");
        this.f3804a = str;
        this.f3805b = str2;
        this.f3806c = i10;
        this.f3807d = j10;
    }

    public final String a() {
        return this.f3805b;
    }

    public final String b() {
        return this.f3804a;
    }

    public final int c() {
        return this.f3806c;
    }

    public final long d() {
        return this.f3807d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return l.a(this.f3804a, zVar.f3804a) && l.a(this.f3805b, zVar.f3805b) && this.f3806c == zVar.f3806c && this.f3807d == zVar.f3807d;
    }

    public int hashCode() {
        return (((((this.f3804a.hashCode() * 31) + this.f3805b.hashCode()) * 31) + this.f3806c) * 31) + a.a(this.f3807d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f3804a + ", firstSessionId=" + this.f3805b + ", sessionIndex=" + this.f3806c + ", sessionStartTimestampUs=" + this.f3807d + ')';
    }
}
