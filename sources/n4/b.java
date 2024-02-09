package n4;

import m4.d;
import n4.b;

public interface b<T extends b<T>> {
    <U> T a(Class<U> cls, d<? super U> dVar);
}
