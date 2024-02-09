package d1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import c1.a;
import c1.b;
import e2.e;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k7.m;

public class k implements m {

    /* renamed from: m  reason: collision with root package name */
    private final List<p> f7695m = new CopyOnWriteArrayList();

    private boolean c(Context context) {
        try {
            return e.m().g(context) == 0;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public p a(Context context, boolean z9, s sVar) {
        return z9 ? new q(context, sVar) : c(context) ? new j(context, sVar) : new q(context, sVar);
    }

    public void b(Context context, boolean z9, x xVar, a aVar) {
        a(context, z9, (s) null).c(xVar, aVar);
    }

    public void d(Context context, t tVar) {
        if (context == null) {
            tVar.a(b.locationServicesDisabled);
        }
        a(context, false, (s) null).d(tVar);
    }

    public void e(p pVar, Activity activity, x xVar, a aVar) {
        this.f7695m.add(pVar);
        pVar.b(activity, xVar, aVar);
    }

    public void f(p pVar) {
        this.f7695m.remove(pVar);
        pVar.e();
    }

    public boolean m(int i10, int i11, Intent intent) {
        for (p a10 : this.f7695m) {
            if (a10.a(i10, i11)) {
                return true;
            }
        }
        return false;
    }
}
