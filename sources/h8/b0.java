package h8;

import java.util.Iterator;
import s8.a;

public abstract class b0 implements Iterator<Long>, a {
    public abstract long b();

    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(b());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
