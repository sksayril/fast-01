package h8;

import java.util.AbstractList;
import s8.a;

public abstract class c<E> extends AbstractList<E> implements a {
    protected c() {
    }

    public abstract int c();

    public abstract E d(int i10);

    public final /* bridge */ E remove(int i10) {
        return d(i10);
    }

    public final /* bridge */ int size() {
        return c();
    }
}
