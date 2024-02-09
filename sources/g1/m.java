package g1;

import android.app.Activity;
import android.content.Context;
import c7.a;
import d7.c;
import k7.k;
import k7.o;

public final class m implements a, d7.a {

    /* renamed from: m  reason: collision with root package name */
    private final n f8847m = new n();

    /* renamed from: n  reason: collision with root package name */
    private k f8848n;

    /* renamed from: o  reason: collision with root package name */
    private o f8849o;

    /* renamed from: p  reason: collision with root package name */
    private c f8850p;

    /* renamed from: q  reason: collision with root package name */
    private l f8851q;

    private void a() {
        c cVar = this.f8850p;
        if (cVar != null) {
            cVar.g(this.f8847m);
            this.f8850p.f(this.f8847m);
        }
    }

    private void b() {
        o oVar = this.f8849o;
        if (oVar != null) {
            oVar.c(this.f8847m);
            this.f8849o.b(this.f8847m);
            return;
        }
        c cVar = this.f8850p;
        if (cVar != null) {
            cVar.c(this.f8847m);
            this.f8850p.b(this.f8847m);
        }
    }

    private void c(Context context, k7.c cVar) {
        this.f8848n = new k(cVar, "flutter.baseflow.com/permissions/methods");
        l lVar = new l(context, new a(), this.f8847m, new p());
        this.f8851q = lVar;
        this.f8848n.e(lVar);
    }

    private void d(Activity activity) {
        l lVar = this.f8851q;
        if (lVar != null) {
            lVar.i(activity);
        }
    }

    private void e() {
        this.f8848n.e((k.c) null);
        this.f8848n = null;
        this.f8851q = null;
    }

    private void f() {
        l lVar = this.f8851q;
        if (lVar != null) {
            lVar.i((Activity) null);
        }
    }

    public void onAttachedToActivity(c cVar) {
        d(cVar.d());
        this.f8850p = cVar;
        b();
    }

    public void onAttachedToEngine(a.b bVar) {
        c(bVar.a(), bVar.b());
    }

    public void onDetachedFromActivity() {
        f();
        a();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        e();
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
