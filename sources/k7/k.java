package k7;

import java.nio.ByteBuffer;
import k7.c;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final c f10998a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f10999b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l f11000c;

    /* renamed from: d  reason: collision with root package name */
    private final c.C0169c f11001d;

    private final class a implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final c f11002a;

        /* renamed from: k7.k$a$a  reason: collision with other inner class name */
        class C0171a implements d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f11004a;

            C0171a(c.b bVar) {
                this.f11004a = bVar;
            }

            public void a(Object obj) {
                this.f11004a.a(k.this.f11000c.a(obj));
            }

            public void b(String str, String str2, Object obj) {
                this.f11004a.a(k.this.f11000c.c(str, str2, obj));
            }

            public void c() {
                this.f11004a.a((ByteBuffer) null);
            }
        }

        a(c cVar) {
            this.f11002a = cVar;
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f11002a.onMethodCall(k.this.f11000c.e(byteBuffer), new C0171a(bVar));
            } catch (RuntimeException e10) {
                x6.b.c("MethodChannel#" + k.this.f10999b, "Failed to handle method call", e10);
                bVar.a(k.this.f11000c.b("error", e10.getMessage(), (Object) null, x6.b.d(e10)));
            }
        }
    }

    private final class b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final d f11006a;

        b(d dVar) {
            this.f11006a = dVar;
        }

        public void a(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                try {
                    this.f11006a.c();
                } catch (RuntimeException e10) {
                    x6.b.c("MethodChannel#" + k.this.f10999b, "Failed to handle method call result", e10);
                }
            } else {
                try {
                    this.f11006a.a(k.this.f11000c.f(byteBuffer));
                } catch (e e11) {
                    this.f11006a.b(e11.f10992m, e11.getMessage(), e11.f10993n);
                }
            }
        }
    }

    public interface c {
        void onMethodCall(j jVar, d dVar);
    }

    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public k(c cVar, String str) {
        this(cVar, str, s.f11011b);
    }

    public k(c cVar, String str, l lVar) {
        this(cVar, str, lVar, (c.C0169c) null);
    }

    public k(c cVar, String str, l lVar, c.C0169c cVar2) {
        this.f10998a = cVar;
        this.f10999b = str;
        this.f11000c = lVar;
        this.f11001d = cVar2;
    }

    public void c(String str, Object obj) {
        d(str, obj, (d) null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f10998a.b(this.f10999b, this.f11000c.d(new j(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        a aVar = null;
        if (this.f11001d != null) {
            c cVar2 = this.f10998a;
            String str = this.f10999b;
            if (cVar != null) {
                aVar = new a(cVar);
            }
            cVar2.e(str, aVar, this.f11001d);
            return;
        }
        c cVar3 = this.f10998a;
        String str2 = this.f10999b;
        if (cVar != null) {
            aVar = new a(cVar);
        }
        cVar3.c(str2, aVar);
    }
}
