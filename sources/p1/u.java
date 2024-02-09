package p1;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import n1.b;
import n1.g;
import n1.h;
import v1.e;
import w1.r;
import w1.v;
import z1.a;

public class u implements t {

    /* renamed from: e  reason: collision with root package name */
    private static volatile v f11845e;

    /* renamed from: a  reason: collision with root package name */
    private final a f11846a;

    /* renamed from: b  reason: collision with root package name */
    private final a f11847b;

    /* renamed from: c  reason: collision with root package name */
    private final e f11848c;

    /* renamed from: d  reason: collision with root package name */
    private final r f11849d;

    u(a aVar, a aVar2, e eVar, r rVar, v vVar) {
        this.f11846a = aVar;
        this.f11847b = aVar2;
        this.f11848c = eVar;
        this.f11849d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        return i.a().i(this.f11846a.a()).k(this.f11847b.a()).j(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a()).d();
    }

    public static u c() {
        v vVar = f11845e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<b> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(b.b("proto"));
    }

    public static void f(Context context) {
        if (f11845e == null) {
            synchronized (u.class) {
                if (f11845e == null) {
                    f11845e = e.e().b(context).a();
                }
            }
        }
    }

    public void a(o oVar, h hVar) {
        this.f11848c.a(oVar.f().f(oVar.c().c()), b(oVar), hVar);
    }

    public r e() {
        return this.f11849d;
    }

    public g g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.b()).c(fVar.c()).a(), this);
    }
}
