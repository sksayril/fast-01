package c5;

import kotlin.jvm.internal.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f3641a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3642b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3643c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3644d;

    /* renamed from: e  reason: collision with root package name */
    private final t f3645e;

    /* renamed from: f  reason: collision with root package name */
    private final a f3646f;

    public b(String str, String str2, String str3, String str4, t tVar, a aVar) {
        l.e(str, "appId");
        l.e(str2, "deviceModel");
        l.e(str3, "sessionSdkVersion");
        l.e(str4, "osVersion");
        l.e(tVar, "logEnvironment");
        l.e(aVar, "androidAppInfo");
        this.f3641a = str;
        this.f3642b = str2;
        this.f3643c = str3;
        this.f3644d = str4;
        this.f3645e = tVar;
        this.f3646f = aVar;
    }

    public final a a() {
        return this.f3646f;
    }

    public final String b() {
        return this.f3641a;
    }

    public final String c() {
        return this.f3642b;
    }

    public final t d() {
        return this.f3645e;
    }

    public final String e() {
        return this.f3644d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f3641a, bVar.f3641a) && l.a(this.f3642b, bVar.f3642b) && l.a(this.f3643c, bVar.f3643c) && l.a(this.f3644d, bVar.f3644d) && this.f3645e == bVar.f3645e && l.a(this.f3646f, bVar.f3646f);
    }

    public final String f() {
        return this.f3643c;
    }

    public int hashCode() {
        return (((((((((this.f3641a.hashCode() * 31) + this.f3642b.hashCode()) * 31) + this.f3643c.hashCode()) * 31) + this.f3644d.hashCode()) * 31) + this.f3645e.hashCode()) * 31) + this.f3646f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f3641a + ", deviceModel=" + this.f3642b + ", sessionSdkVersion=" + this.f3643c + ", osVersion=" + this.f3644d + ", logEnvironment=" + this.f3645e + ", androidAppInfo=" + this.f3646f + ')';
    }
}
