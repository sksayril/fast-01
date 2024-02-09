package p6;

import c7.a;
import d7.c;
import k7.d;
import k7.k;

public class d implements a, d7.a {

    /* renamed from: m  reason: collision with root package name */
    private k f11931m;

    /* renamed from: n  reason: collision with root package name */
    private k7.d f11932n;

    /* renamed from: o  reason: collision with root package name */
    private c f11933o;

    /* renamed from: p  reason: collision with root package name */
    private a.b f11934p;

    /* renamed from: q  reason: collision with root package name */
    private c f11935q;

    private void a(k7.c cVar, c cVar2) {
        this.f11933o = new c(cVar2.d());
        k kVar = new k(cVar, "com.llfbandit.record/messages");
        this.f11931m = kVar;
        kVar.e(this.f11933o);
        cVar2.b(this.f11933o);
        k7.d dVar = new k7.d(cVar, "com.llfbandit.record/events");
        this.f11932n = dVar;
        dVar.d(this.f11933o);
    }

    private void b() {
        this.f11935q.f(this.f11933o);
        this.f11935q = null;
        this.f11931m.e((k.c) null);
        this.f11932n.d((d.C0170d) null);
        this.f11933o.d();
        this.f11933o = null;
        this.f11931m = null;
        this.f11932n = null;
    }

    public void onAttachedToActivity(c cVar) {
        this.f11935q = cVar;
        a(this.f11934p.b(), cVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f11934p = bVar;
    }

    public void onDetachedFromActivity() {
        b();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f11934p = null;
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
