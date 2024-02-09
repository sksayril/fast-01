package z4;

import java.util.Iterator;
import java.util.Set;
import w3.e;
import w3.r;

public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f13589a;

    /* renamed from: b  reason: collision with root package name */
    private final d f13590b;

    c(Set<f> set, d dVar) {
        this.f13589a = e(set);
        this.f13590b = dVar;
    }

    public static w3.c<i> c() {
        return w3.c.c(i.class).b(r.m(f.class)).e(b.f13588a).c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ i d(e eVar) {
        return new c(eVar.c(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String a() {
        if (this.f13590b.b().isEmpty()) {
            return this.f13589a;
        }
        return this.f13589a + ' ' + e(this.f13590b.b());
    }
}
