package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class m<R> implements h<R>, Serializable {
    private final int arity;

    public m(int i10) {
        this.arity = i10;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String g10 = v.g(this);
        l.d(g10, "renderLambdaToString(this)");
        return g10;
    }
}
