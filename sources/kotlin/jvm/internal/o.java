package kotlin.jvm.internal;

import x8.b;
import x8.f;

public abstract class o extends s implements f {
    public o(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    /* access modifiers changed from: protected */
    public b computeReflected() {
        return v.d(this);
    }

    public Object invoke() {
        return get();
    }
}
