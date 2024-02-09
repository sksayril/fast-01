package m6;

import java.util.ArrayList;
import java.util.List;
import o5.c;
import o5.h;
import o5.i;
import o5.l;
import o5.n;
import o5.p;
import o5.q;
import u5.k;

public class f implements q {

    /* renamed from: a  reason: collision with root package name */
    private l f11214a;

    /* renamed from: b  reason: collision with root package name */
    private List<p> f11215b = new ArrayList();

    public f(l lVar) {
        this.f11214a = lVar;
    }

    public void a(p pVar) {
        this.f11215b.add(pVar);
    }

    /* access modifiers changed from: protected */
    public n b(c cVar) {
        n nVar;
        this.f11215b.clear();
        try {
            l lVar = this.f11214a;
            nVar = lVar instanceof i ? ((i) lVar).b(cVar) : lVar.e(cVar);
        } catch (Exception unused) {
            nVar = null;
        } catch (Throwable th) {
            this.f11214a.c();
            throw th;
        }
        this.f11214a.c();
        return nVar;
    }

    public n c(h hVar) {
        return b(e(hVar));
    }

    public List<p> d() {
        return new ArrayList(this.f11215b);
    }

    /* access modifiers changed from: protected */
    public c e(h hVar) {
        return new c(new k(hVar));
    }
}
