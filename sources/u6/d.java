package u6;

import k7.j;
import k7.k;

public class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public final a f12531a;

    /* renamed from: b  reason: collision with root package name */
    final j f12532b;

    class a implements f {

        /* renamed from: a  reason: collision with root package name */
        final k.d f12533a;

        a(k.d dVar) {
            this.f12533a = dVar;
        }

        public void a(Object obj) {
            this.f12533a.a(obj);
        }

        public void b(String str, String str2, Object obj) {
            this.f12533a.b(str, str2, obj);
        }
    }

    public d(j jVar, k.d dVar) {
        this.f12532b = jVar;
        this.f12531a = new a(dVar);
    }

    public <T> T c(String str) {
        return this.f12532b.a(str);
    }

    public String i() {
        return this.f12532b.f10996a;
    }

    public boolean j(String str) {
        return this.f12532b.c(str);
    }

    public f o() {
        return this.f12531a;
    }
}
