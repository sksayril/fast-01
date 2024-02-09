package z3;

import d4.f0;
import d4.g0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class d implements a {

    /* renamed from: c  reason: collision with root package name */
    private static final h f13571c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final s4.a<a> f13572a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<a> f13573b = new AtomicReference<>((Object) null);

    private static final class b implements h {
        private b() {
        }

        public File a() {
            return null;
        }

        public File b() {
            return null;
        }

        public File c() {
            return null;
        }

        public f0.a d() {
            return null;
        }

        public File e() {
            return null;
        }

        public File f() {
            return null;
        }

        public File g() {
            return null;
        }
    }

    public d(s4.a<a> aVar) {
        this.f13572a = aVar;
        aVar.a(new c(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(s4.b bVar) {
        g.f().b("Crashlytics native component now available.");
        this.f13573b.set((a) bVar.get());
    }

    public void a(String str, String str2, long j10, g0 g0Var) {
        g f10 = g.f();
        f10.i("Deferring native open session: " + str);
        this.f13572a.a(new b(str, str2, j10, g0Var));
    }

    public h b(String str) {
        a aVar = this.f13573b.get();
        return aVar == null ? f13571c : aVar.b(str);
    }

    public boolean c() {
        a aVar = this.f13573b.get();
        return aVar != null && aVar.c();
    }

    public boolean d(String str) {
        a aVar = this.f13573b.get();
        return aVar != null && aVar.d(str);
    }
}
