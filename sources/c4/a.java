package c4;

import m4.c;
import m4.d;
import m4.e;
import n4.b;

public final class a implements n4.a {

    /* renamed from: a  reason: collision with root package name */
    public static final n4.a f3570a = new a();

    /* renamed from: c4.a$a  reason: collision with other inner class name */
    private static final class C0077a implements d<i> {

        /* renamed from: a  reason: collision with root package name */
        static final C0077a f3571a = new C0077a();

        /* renamed from: b  reason: collision with root package name */
        private static final c f3572b = c.d("rolloutId");

        /* renamed from: c  reason: collision with root package name */
        private static final c f3573c = c.d("parameterKey");

        /* renamed from: d  reason: collision with root package name */
        private static final c f3574d = c.d("parameterValue");

        /* renamed from: e  reason: collision with root package name */
        private static final c f3575e = c.d("variantId");

        /* renamed from: f  reason: collision with root package name */
        private static final c f3576f = c.d("templateVersion");

        private C0077a() {
        }

        /* renamed from: b */
        public void a(i iVar, e eVar) {
            eVar.c(f3572b, iVar.e());
            eVar.c(f3573c, iVar.c());
            eVar.c(f3574d, iVar.d());
            eVar.c(f3575e, iVar.g());
            eVar.f(f3576f, iVar.f());
        }
    }

    private a() {
    }

    public void a(b<?> bVar) {
        C0077a aVar = C0077a.f3571a;
        bVar.a(i.class, aVar);
        bVar.a(b.class, aVar);
    }
}
