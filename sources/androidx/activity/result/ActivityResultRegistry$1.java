package androidx.activity.result;

import androidx.activity.result.d;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import e.a;

class ActivityResultRegistry$1 implements j {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ String f195m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ b f196n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ a f197o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ d f198p;

    public void h(l lVar, g.a aVar) {
        if (g.a.ON_START.equals(aVar)) {
            this.f198p.f206f.put(this.f195m, new d.b(this.f196n, this.f197o));
            if (this.f198p.f207g.containsKey(this.f195m)) {
                Object obj = this.f198p.f207g.get(this.f195m);
                this.f198p.f207g.remove(this.f195m);
                this.f196n.a(obj);
            }
            a aVar2 = (a) this.f198p.f208h.getParcelable(this.f195m);
            if (aVar2 != null) {
                this.f198p.f208h.remove(this.f195m);
                this.f196n.a(this.f197o.c(aVar2.b(), aVar2.a()));
            }
        } else if (g.a.ON_STOP.equals(aVar)) {
            this.f198p.f206f.remove(this.f195m);
        } else if (g.a.ON_DESTROY.equals(aVar)) {
            this.f198p.k(this.f195m);
        }
    }
}
