package c4;

import g4.f;
import java.io.File;

public class e {

    /* renamed from: c  reason: collision with root package name */
    private static final b f3585c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final f f3586a;

    /* renamed from: b  reason: collision with root package name */
    private c f3587b;

    private static final class b implements c {
        private b() {
        }

        public void a() {
        }

        public String b() {
            return null;
        }

        public byte[] c() {
            return null;
        }

        public void d() {
        }

        public void e(long j10, String str) {
        }
    }

    public e(f fVar) {
        this.f3586a = fVar;
        this.f3587b = f3585c;
    }

    public e(f fVar, String str) {
        this(fVar);
        e(str);
    }

    private File d(String str) {
        return this.f3586a.o(str, "userlog");
    }

    public void a() {
        this.f3587b.d();
    }

    public byte[] b() {
        return this.f3587b.c();
    }

    public String c() {
        return this.f3587b.b();
    }

    public final void e(String str) {
        this.f3587b.a();
        this.f3587b = f3585c;
        if (str != null) {
            f(d(str), 65536);
        }
    }

    /* access modifiers changed from: package-private */
    public void f(File file, int i10) {
        this.f3587b = new h(file, i10);
    }

    public void g(long j10, String str) {
        this.f3587b.e(j10, str);
    }
}
