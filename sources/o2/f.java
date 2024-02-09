package o2;

import java.util.Iterator;

final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f11586a;

    f(a aVar) {
        this.f11586a = aVar;
    }

    public final void a(c cVar) {
        this.f11586a.f11581a = cVar;
        Iterator it = this.f11586a.f11583c.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a(this.f11586a.f11581a);
        }
        this.f11586a.f11583c.clear();
        this.f11586a.f11582b = null;
    }
}
