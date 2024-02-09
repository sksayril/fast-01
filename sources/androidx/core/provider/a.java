package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

class a {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f1580a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f1581b;

    /* renamed from: androidx.core.provider.a$a  reason: collision with other inner class name */
    class C0026a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g.c f1582m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Typeface f1583n;

        C0026a(g.c cVar, Typeface typeface) {
            this.f1582m = cVar;
            this.f1583n = typeface;
        }

        public void run() {
            this.f1582m.b(this.f1583n);
        }
    }

    class b implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g.c f1585m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ int f1586n;

        b(g.c cVar, int i10) {
            this.f1585m = cVar;
            this.f1586n = i10;
        }

        public void run() {
            this.f1585m.a(this.f1586n);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f1580a = cVar;
        this.f1581b = handler;
    }

    private void a(int i10) {
        this.f1581b.post(new b(this.f1580a, i10));
    }

    private void c(Typeface typeface) {
        this.f1581b.post(new C0026a(this.f1580a, typeface));
    }

    /* access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f1610a);
        } else {
            a(eVar.f1611b);
        }
    }
}
