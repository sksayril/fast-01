package kotlin.coroutines.jvm.internal;

import j8.d;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

public abstract class k extends d implements h<Object> {
    private final int arity;

    public k(int i10) {
        this(i10, (d<Object>) null);
    }

    public k(int i10, d<Object> dVar) {
        super(dVar);
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String f10 = v.f(this);
        l.d(f10, "renderLambdaToString(this)");
        return f10;
    }
}
