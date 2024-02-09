package k7;

import java.nio.ByteBuffer;
import k7.c;

public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c f10972a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f10973b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final i<T> f10974c;

    /* renamed from: d  reason: collision with root package name */
    private final c.C0169c f10975d;

    private final class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final d<T> f10976a;

        /* renamed from: k7.a$b$a  reason: collision with other inner class name */
        class C0168a implements e<T> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c.b f10978a;

            C0168a(c.b bVar) {
                this.f10978a = bVar;
            }

            public void a(T t9) {
                this.f10978a.a(a.this.f10974c.a(t9));
            }
        }

        private b(d<T> dVar) {
            this.f10976a = dVar;
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            try {
                this.f10976a.a(a.this.f10974c.b(byteBuffer), new C0168a(bVar));
            } catch (RuntimeException e10) {
                x6.b.c("BasicMessageChannel#" + a.this.f10973b, "Failed to handle message", e10);
                bVar.a((ByteBuffer) null);
            }
        }
    }

    private final class c implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final e<T> f10980a;

        private c(e<T> eVar) {
            this.f10980a = eVar;
        }

        public void a(ByteBuffer byteBuffer) {
            try {
                this.f10980a.a(a.this.f10974c.b(byteBuffer));
            } catch (RuntimeException e10) {
                x6.b.c("BasicMessageChannel#" + a.this.f10973b, "Failed to handle message reply", e10);
            }
        }
    }

    public interface d<T> {
        void a(T t9, e<T> eVar);
    }

    public interface e<T> {
        void a(T t9);
    }

    public a(c cVar, String str, i<T> iVar) {
        this(cVar, str, iVar, (c.C0169c) null);
    }

    public a(c cVar, String str, i<T> iVar, c.C0169c cVar2) {
        this.f10972a = cVar;
        this.f10973b = str;
        this.f10974c = iVar;
        this.f10975d = cVar2;
    }

    public void c(T t9) {
        d(t9, (e) null);
    }

    public void d(T t9, e<T> eVar) {
        c cVar = this.f10972a;
        String str = this.f10973b;
        ByteBuffer a10 = this.f10974c.a(t9);
        c cVar2 = null;
        if (eVar != null) {
            cVar2 = new c(eVar);
        }
        cVar.b(str, a10, cVar2);
    }

    public void e(d<T> dVar) {
        b bVar = null;
        if (this.f10975d != null) {
            c cVar = this.f10972a;
            String str = this.f10973b;
            if (dVar != null) {
                bVar = new b(dVar);
            }
            cVar.e(str, bVar, this.f10975d);
            return;
        }
        c cVar2 = this.f10972a;
        String str2 = this.f10973b;
        if (dVar != null) {
            bVar = new b(dVar);
        }
        cVar2.c(str2, bVar);
    }
}
