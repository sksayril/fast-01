package b9;

import g8.s;
import j8.d;

public interface l<T> extends d<T> {

    public static final class a {
        public static /* synthetic */ boolean a(l lVar, Throwable th, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    th = null;
                }
                return lVar.d(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    boolean d(Throwable th);

    void f(T t9, r8.l<? super Throwable, s> lVar);

    void i(r8.l<? super Throwable, s> lVar);

    Object j(T t9, Object obj, r8.l<? super Throwable, s> lVar);

    void n(Object obj);
}
