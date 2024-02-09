package androidx.recyclerview.widget;

import androidx.core.util.e;
import androidx.core.util.f;
import androidx.recyclerview.widget.i;
import p.d;

class n {

    /* renamed from: a  reason: collision with root package name */
    final p.a<i.b0, a> f3217a = new p.a<>();

    /* renamed from: b  reason: collision with root package name */
    final d<i.b0> f3218b = new d<>();

    static class a {

        /* renamed from: d  reason: collision with root package name */
        static e<a> f3219d = new f(20);

        /* renamed from: a  reason: collision with root package name */
        int f3220a;

        /* renamed from: b  reason: collision with root package name */
        i.k.c f3221b;

        /* renamed from: c  reason: collision with root package name */
        i.k.c f3222c;

        private a() {
        }

        static void a() {
            do {
            } while (f3219d.b() != null);
        }

        static a b() {
            a b10 = f3219d.b();
            return b10 == null ? new a() : b10;
        }

        static void c(a aVar) {
            aVar.f3220a = 0;
            aVar.f3221b = null;
            aVar.f3222c = null;
            f3219d.a(aVar);
        }
    }

    interface b {
    }

    n() {
    }

    /* access modifiers changed from: package-private */
    public void a(long j10, i.b0 b0Var) {
        this.f3218b.p(j10, b0Var);
    }

    /* access modifiers changed from: package-private */
    public void b(i.b0 b0Var, i.k.c cVar) {
        a aVar = this.f3217a.get(b0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f3217a.put(b0Var, aVar);
        }
        aVar.f3221b = cVar;
        aVar.f3220a |= 4;
    }

    /* access modifiers changed from: package-private */
    public void c() {
        a.a();
    }

    /* access modifiers changed from: package-private */
    public void d(i.b0 b0Var) {
        int s9 = this.f3218b.s() - 1;
        while (true) {
            if (s9 < 0) {
                break;
            } else if (b0Var == this.f3218b.t(s9)) {
                this.f3218b.r(s9);
                break;
            } else {
                s9--;
            }
        }
        a remove = this.f3217a.remove(b0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
