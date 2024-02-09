package b9;

import g8.s;
import j8.g;
import java.util.concurrent.CancellationException;
import r8.l;
import r8.p;

public interface r1 extends g.b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f3485c = b.f3486m;

    public static final class a {
        public static /* synthetic */ void a(r1 r1Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                r1Var.A(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(r1 r1Var, R r9, p<? super R, ? super g.b, ? extends R> pVar) {
            return g.b.a.a(r1Var, r9, pVar);
        }

        public static <E extends g.b> E c(r1 r1Var, g.c<E> cVar) {
            return g.b.a.b(r1Var, cVar);
        }

        public static /* synthetic */ y0 d(r1 r1Var, boolean z9, boolean z10, l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z9 = false;
                }
                if ((i10 & 2) != 0) {
                    z10 = true;
                }
                return r1Var.w(z9, z10, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static g e(r1 r1Var, g.c<?> cVar) {
            return g.b.a.c(r1Var, cVar);
        }

        public static g f(r1 r1Var, g gVar) {
            return g.b.a.d(r1Var, gVar);
        }
    }

    public static final class b implements g.c<r1> {

        /* renamed from: m  reason: collision with root package name */
        static final /* synthetic */ b f3486m = new b();

        private b() {
        }
    }

    void A(CancellationException cancellationException);

    r C(t tVar);

    boolean b();

    r1 getParent();

    y0 h(l<? super Throwable, s> lVar);

    boolean isCancelled();

    boolean start();

    y0 w(boolean z9, boolean z10, l<? super Throwable, s> lVar);

    CancellationException y();
}
