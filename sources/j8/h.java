package j8;

import j8.g;
import java.io.Serializable;
import kotlin.jvm.internal.l;
import r8.p;

public final class h implements g, Serializable {

    /* renamed from: m  reason: collision with root package name */
    public static final h f10863m = new h();

    private h() {
    }

    public <E extends g.b> E a(g.c<E> cVar) {
        l.e(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public <R> R k(R r9, p<? super R, ? super g.b, ? extends R> pVar) {
        l.e(pVar, "operation");
        return r9;
    }

    public g r(g.c<?> cVar) {
        l.e(cVar, "key");
        return this;
    }

    public g t(g gVar) {
        l.e(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
