package k7;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k7.c;

public final class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f10983a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final String f10984b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final l f10985c;

    /* renamed from: d  reason: collision with root package name */
    private final c.C0169c f10986d;

    public interface b {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    private final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        private final C0170d f10987a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReference<b> f10988b = new AtomicReference<>((Object) null);

        private final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            final AtomicBoolean f10990a;

            private a() {
                this.f10990a = new AtomicBoolean(false);
            }

            public void a(Object obj) {
                if (!this.f10990a.get() && c.this.f10988b.get() == this) {
                    d.this.f10983a.f(d.this.f10984b, d.this.f10985c.a(obj));
                }
            }

            public void b(String str, String str2, Object obj) {
                if (!this.f10990a.get() && c.this.f10988b.get() == this) {
                    d.this.f10983a.f(d.this.f10984b, d.this.f10985c.c(str, str2, obj));
                }
            }

            public void c() {
                if (!this.f10990a.getAndSet(true) && c.this.f10988b.get() == this) {
                    d.this.f10983a.f(d.this.f10984b, (ByteBuffer) null);
                }
            }
        }

        c(C0170d dVar) {
            this.f10987a = dVar;
        }

        private void c(Object obj, c.b bVar) {
            ByteBuffer byteBuffer;
            if (this.f10988b.getAndSet((Object) null) != null) {
                try {
                    this.f10987a.b(obj);
                    bVar.a(d.this.f10985c.a((Object) null));
                } catch (RuntimeException e10) {
                    x6.b.c("EventChannel#" + d.this.f10984b, "Failed to close event stream", e10);
                    byteBuffer = d.this.f10985c.c("error", e10.getMessage(), (Object) null);
                }
            } else {
                byteBuffer = d.this.f10985c.c("error", "No active stream to cancel", (Object) null);
                bVar.a(byteBuffer);
            }
        }

        private void d(Object obj, c.b bVar) {
            a aVar = new a();
            if (this.f10988b.getAndSet(aVar) != null) {
                try {
                    this.f10987a.b((Object) null);
                } catch (RuntimeException e10) {
                    x6.b.c("EventChannel#" + d.this.f10984b, "Failed to close existing event stream", e10);
                }
            }
            try {
                this.f10987a.a(obj, aVar);
                bVar.a(d.this.f10985c.a((Object) null));
            } catch (RuntimeException e11) {
                this.f10988b.set((Object) null);
                x6.b.c("EventChannel#" + d.this.f10984b, "Failed to open event stream", e11);
                bVar.a(d.this.f10985c.c("error", e11.getMessage(), (Object) null));
            }
        }

        public void a(ByteBuffer byteBuffer, c.b bVar) {
            j e10 = d.this.f10985c.e(byteBuffer);
            if (e10.f10996a.equals("listen")) {
                d(e10.f10997b, bVar);
            } else if (e10.f10996a.equals("cancel")) {
                c(e10.f10997b, bVar);
            } else {
                bVar.a((ByteBuffer) null);
            }
        }
    }

    /* renamed from: k7.d$d  reason: collision with other inner class name */
    public interface C0170d {
        void a(Object obj, b bVar);

        void b(Object obj);
    }

    public d(c cVar, String str) {
        this(cVar, str, s.f11011b);
    }

    public d(c cVar, String str, l lVar) {
        this(cVar, str, lVar, (c.C0169c) null);
    }

    public d(c cVar, String str, l lVar, c.C0169c cVar2) {
        this.f10983a = cVar;
        this.f10984b = str;
        this.f10985c = lVar;
        this.f10986d = cVar2;
    }

    public void d(C0170d dVar) {
        c cVar = null;
        if (this.f10986d != null) {
            c cVar2 = this.f10983a;
            String str = this.f10984b;
            if (dVar != null) {
                cVar = new c(dVar);
            }
            cVar2.e(str, cVar, this.f10986d);
            return;
        }
        c cVar3 = this.f10983a;
        String str2 = this.f10984b;
        if (dVar != null) {
            cVar = new c(dVar);
        }
        cVar3.c(str2, cVar);
    }
}
