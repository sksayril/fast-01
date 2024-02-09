package kotlin.jvm.internal;

import x8.b;
import x8.g;

public abstract class q extends s implements g {
    public q(Class cls, String str, String str2, int i10) {
        super(c.NO_RECEIVER, cls, str, str2, i10);
    }

    public g.a c() {
        return ((g) getReflected()).c();
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return v.e(this);
    }

    public Object invoke(Object obj, Object obj2) {
        return g(obj, obj2);
    }
}
