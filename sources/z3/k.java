package z3;

import c4.m;
import s4.a;
import s4.b;

public class k {

    /* renamed from: a  reason: collision with root package name */
    private final a<a5.a> f13585a;

    public k(a<a5.a> aVar) {
        this.f13585a = aVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(e eVar, b bVar) {
        ((a5.a) bVar.get()).a("firebase", eVar);
        g.f().b("Registering RemoteConfig Rollouts subscriber");
    }

    public void c(m mVar) {
        if (mVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
            return;
        }
        this.f13585a.a(new j(new e(mVar)));
    }
}
