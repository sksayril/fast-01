package c5;

import java.util.List;
import kotlin.jvm.internal.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f3632a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3633b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3634c;

    /* renamed from: d  reason: collision with root package name */
    private final String f3635d;

    /* renamed from: e  reason: collision with root package name */
    private final u f3636e;

    /* renamed from: f  reason: collision with root package name */
    private final List<u> f3637f;

    public a(String str, String str2, String str3, String str4, u uVar, List<u> list) {
        l.e(str, "packageName");
        l.e(str2, "versionName");
        l.e(str3, "appBuildVersion");
        l.e(str4, "deviceManufacturer");
        l.e(uVar, "currentProcessDetails");
        l.e(list, "appProcessDetails");
        this.f3632a = str;
        this.f3633b = str2;
        this.f3634c = str3;
        this.f3635d = str4;
        this.f3636e = uVar;
        this.f3637f = list;
    }

    public final String a() {
        return this.f3634c;
    }

    public final List<u> b() {
        return this.f3637f;
    }

    public final u c() {
        return this.f3636e;
    }

    public final String d() {
        return this.f3635d;
    }

    public final String e() {
        return this.f3632a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f3632a, aVar.f3632a) && l.a(this.f3633b, aVar.f3633b) && l.a(this.f3634c, aVar.f3634c) && l.a(this.f3635d, aVar.f3635d) && l.a(this.f3636e, aVar.f3636e) && l.a(this.f3637f, aVar.f3637f);
    }

    public final String f() {
        return this.f3633b;
    }

    public int hashCode() {
        return (((((((((this.f3632a.hashCode() * 31) + this.f3633b.hashCode()) * 31) + this.f3634c.hashCode()) * 31) + this.f3635d.hashCode()) * 31) + this.f3636e.hashCode()) * 31) + this.f3637f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f3632a + ", versionName=" + this.f3633b + ", appBuildVersion=" + this.f3634c + ", deviceManufacturer=" + this.f3635d + ", currentProcessDetails=" + this.f3636e + ", appProcessDetails=" + this.f3637f + ')';
    }
}
