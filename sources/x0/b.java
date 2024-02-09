package x0;

import g8.p;
import java.util.Map;
import kotlin.jvm.internal.l;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final c f13050a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13051b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13052c;

    public b(c cVar, String str, String str2) {
        l.e(cVar, "mapType");
        l.e(str, "mapName");
        l.e(str2, "packageName");
        this.f13050a = cVar;
        this.f13051b = str;
        this.f13052c = str2;
    }

    public final c a() {
        return this.f13050a;
    }

    public final String b() {
        return this.f13052c;
    }

    public final Map<String, String> c() {
        return f0.f(p.a("mapType", this.f13050a.name()), p.a("mapName", this.f13051b), p.a("packageName", this.f13052c));
    }
}
