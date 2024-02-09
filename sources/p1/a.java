package p1;

public final class a implements n4.a {

    /* renamed from: a  reason: collision with root package name */
    public static final n4.a f11766a = new a();

    /* renamed from: p1.a$a  reason: collision with other inner class name */
    private static final class C0197a implements m4.d<s1.a> {

        /* renamed from: a  reason: collision with root package name */
        static final C0197a f11767a = new C0197a();

        /* renamed from: b  reason: collision with root package name */
        private static final m4.c f11768b = m4.c.a("window").b(p4.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final m4.c f11769c = m4.c.a("logSourceMetrics").b(p4.a.b().c(2).a()).a();

        /* renamed from: d  reason: collision with root package name */
        private static final m4.c f11770d = m4.c.a("globalMetrics").b(p4.a.b().c(3).a()).a();

        /* renamed from: e  reason: collision with root package name */
        private static final m4.c f11771e = m4.c.a("appNamespace").b(p4.a.b().c(4).a()).a();

        private C0197a() {
        }

        /* renamed from: b */
        public void a(s1.a aVar, m4.e eVar) {
            eVar.c(f11768b, aVar.d());
            eVar.c(f11769c, aVar.c());
            eVar.c(f11770d, aVar.b());
            eVar.c(f11771e, aVar.a());
        }
    }

    private static final class b implements m4.d<s1.b> {

        /* renamed from: a  reason: collision with root package name */
        static final b f11772a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final m4.c f11773b = m4.c.a("storageMetrics").b(p4.a.b().c(1).a()).a();

        private b() {
        }

        /* renamed from: b */
        public void a(s1.b bVar, m4.e eVar) {
            eVar.c(f11773b, bVar.a());
        }
    }

    private static final class c implements m4.d<s1.c> {

        /* renamed from: a  reason: collision with root package name */
        static final c f11774a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final m4.c f11775b = m4.c.a("eventsDroppedCount").b(p4.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final m4.c f11776c = m4.c.a("reason").b(p4.a.b().c(3).a()).a();

        private c() {
        }

        /* renamed from: b */
        public void a(s1.c cVar, m4.e eVar) {
            eVar.f(f11775b, cVar.a());
            eVar.c(f11776c, cVar.b());
        }
    }

    private static final class d implements m4.d<s1.d> {

        /* renamed from: a  reason: collision with root package name */
        static final d f11777a = new d();

        /* renamed from: b  reason: collision with root package name */
        private static final m4.c f11778b = m4.c.a("logSource").b(p4.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final m4.c f11779c = m4.c.a("logEventDropped").b(p4.a.b().c(2).a()).a();

        private d() {
        }

        /* renamed from: b */
        public void a(s1.d dVar, m4.e eVar) {
            eVar.c(f11778b, dVar.b());
            eVar.c(f11779c, dVar.a());
        }
    }

    private static final class e implements m4.d<m> {

        /* renamed from: a  reason: collision with root package name */
        static final e f11780a = new e();

        /* renamed from: b  reason: collision with root package name */
        private static final m4.c f11781b = m4.c.d("clientMetrics");

        private e() {
        }

        /* renamed from: b */
        public void a(m mVar, m4.e eVar) {
            eVar.c(f11781b, mVar.b());
        }
    }

    private static final class f implements m4.d<s1.e> {

        /* renamed from: a  reason: collision with root package name */
        static final f f11782a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final m4.c f11783b = m4.c.a("currentCacheSizeBytes").b(p4.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final m4.c f11784c = m4.c.a("maxCacheSizeBytes").b(p4.a.b().c(2).a()).a();

        private f() {
        }

        /* renamed from: b */
        public void a(s1.e eVar, m4.e eVar2) {
            eVar2.f(f11783b, eVar.a());
            eVar2.f(f11784c, eVar.b());
        }
    }

    private static final class g implements m4.d<s1.f> {

        /* renamed from: a  reason: collision with root package name */
        static final g f11785a = new g();

        /* renamed from: b  reason: collision with root package name */
        private static final m4.c f11786b = m4.c.a("startMs").b(p4.a.b().c(1).a()).a();

        /* renamed from: c  reason: collision with root package name */
        private static final m4.c f11787c = m4.c.a("endMs").b(p4.a.b().c(2).a()).a();

        private g() {
        }

        /* renamed from: b */
        public void a(s1.f fVar, m4.e eVar) {
            eVar.f(f11786b, fVar.b());
            eVar.f(f11787c, fVar.a());
        }
    }

    private a() {
    }

    public void a(n4.b<?> bVar) {
        bVar.a(m.class, e.f11780a);
        bVar.a(s1.a.class, C0197a.f11767a);
        bVar.a(s1.f.class, g.f11785a);
        bVar.a(s1.d.class, d.f11777a);
        bVar.a(s1.c.class, c.f11774a);
        bVar.a(s1.b.class, b.f11772a);
        bVar.a(s1.e.class, f.f11782a);
    }
}
