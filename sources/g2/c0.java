package g2;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b3.e;
import c3.d;
import c3.l;
import e2.b;
import f2.a;
import f2.f;
import h2.m0;
import h2.p;
import java.util.Set;

public final class c0 extends d implements f.a, f.b {

    /* renamed from: j  reason: collision with root package name */
    private static final a.C0134a f8862j = e.f3400c;

    /* renamed from: c  reason: collision with root package name */
    private final Context f8863c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f8864d;

    /* renamed from: e  reason: collision with root package name */
    private final a.C0134a f8865e;

    /* renamed from: f  reason: collision with root package name */
    private final Set f8866f;

    /* renamed from: g  reason: collision with root package name */
    private final h2.e f8867g;

    /* renamed from: h  reason: collision with root package name */
    private b3.f f8868h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public b0 f8869i;

    public c0(Context context, Handler handler, h2.e eVar) {
        a.C0134a aVar = f8862j;
        this.f8863c = context;
        this.f8864d = handler;
        this.f8867g = (h2.e) p.k(eVar, "ClientSettings must not be null");
        this.f8866f = eVar.e();
        this.f8865e = aVar;
    }

    static /* bridge */ /* synthetic */ void g3(c0 c0Var, l lVar) {
        b d10 = lVar.d();
        if (d10.k()) {
            m0 m0Var = (m0) p.j(lVar.f());
            d10 = m0Var.d();
            if (!d10.k()) {
                String valueOf = String.valueOf(d10);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            } else {
                c0Var.f8869i.c(m0Var.f(), c0Var.f8866f);
                c0Var.f8868h.m();
            }
        }
        c0Var.f8869i.b(d10);
        c0Var.f8868h.m();
    }

    public final void B(int i10) {
        this.f8868h.m();
    }

    public final void H0(l lVar) {
        this.f8864d.post(new a0(this, lVar));
    }

    public final void J(b bVar) {
        this.f8869i.b(bVar);
    }

    public final void Y(Bundle bundle) {
        this.f8868h.b(this);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [f2.a$f, b3.f] */
    public final void h3(b0 b0Var) {
        b3.f fVar = this.f8868h;
        if (fVar != null) {
            fVar.m();
        }
        this.f8867g.i(Integer.valueOf(System.identityHashCode(this)));
        a.C0134a aVar = this.f8865e;
        Context context = this.f8863c;
        Looper looper = this.f8864d.getLooper();
        h2.e eVar = this.f8867g;
        this.f8868h = aVar.a(context, looper, eVar, eVar.f(), this, this);
        this.f8869i = b0Var;
        Set set = this.f8866f;
        if (set == null || set.isEmpty()) {
            this.f8864d.post(new z(this));
        } else {
            this.f8868h.o();
        }
    }

    public final void i3() {
        b3.f fVar = this.f8868h;
        if (fVar != null) {
            fVar.m();
        }
    }
}
