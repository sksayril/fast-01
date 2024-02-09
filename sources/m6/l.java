package m6;

import o5.c;
import o5.h;
import u5.k;

public class l extends f {

    /* renamed from: c  reason: collision with root package name */
    private boolean f11234c = true;

    public l(o5.l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: protected */
    public c e(h hVar) {
        if (this.f11234c) {
            this.f11234c = false;
            return new c(new k(hVar.e()));
        }
        this.f11234c = true;
        return new c(new k(hVar));
    }
}
