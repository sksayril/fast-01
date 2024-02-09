package c5;

import a9.a;
import kotlin.jvm.internal.l;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f3721a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3722b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3723c;

    /* renamed from: d  reason: collision with root package name */
    private final long f3724d;

    /* renamed from: e  reason: collision with root package name */
    private final f f3725e;

    /* renamed from: f  reason: collision with root package name */
    private final String f3726f;

    public f0(String str, String str2, int i10, long j10, f fVar, String str3) {
        l.e(str, "sessionId");
        l.e(str2, "firstSessionId");
        l.e(fVar, "dataCollectionStatus");
        l.e(str3, "firebaseInstallationId");
        this.f3721a = str;
        this.f3722b = str2;
        this.f3723c = i10;
        this.f3724d = j10;
        this.f3725e = fVar;
        this.f3726f = str3;
    }

    public final f a() {
        return this.f3725e;
    }

    public final long b() {
        return this.f3724d;
    }

    public final String c() {
        return this.f3726f;
    }

    public final String d() {
        return this.f3722b;
    }

    public final String e() {
        return this.f3721a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return l.a(this.f3721a, f0Var.f3721a) && l.a(this.f3722b, f0Var.f3722b) && this.f3723c == f0Var.f3723c && this.f3724d == f0Var.f3724d && l.a(this.f3725e, f0Var.f3725e) && l.a(this.f3726f, f0Var.f3726f);
    }

    public final int f() {
        return this.f3723c;
    }

    public int hashCode() {
        return (((((((((this.f3721a.hashCode() * 31) + this.f3722b.hashCode()) * 31) + this.f3723c) * 31) + a.a(this.f3724d)) * 31) + this.f3725e.hashCode()) * 31) + this.f3726f.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f3721a + ", firstSessionId=" + this.f3722b + ", sessionIndex=" + this.f3723c + ", eventTimestampUs=" + this.f3724d + ", dataCollectionStatus=" + this.f3725e + ", firebaseInstallationId=" + this.f3726f + ')';
    }
}
