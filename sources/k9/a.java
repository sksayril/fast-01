package k9;

import g8.s;
import j8.d;

public interface a {

    /* renamed from: k9.a$a  reason: collision with other inner class name */
    public static final class C0173a {
        public static /* synthetic */ void a(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                aVar.a(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    void a(Object obj);

    Object b(Object obj, d<? super s> dVar);

    boolean c();
}
