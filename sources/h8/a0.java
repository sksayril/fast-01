package h8;

import java.util.Iterator;
import s8.a;

public abstract class a0 implements Iterator<Integer>, a {
    public abstract int b();

    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
