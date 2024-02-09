package b9;

import j8.b;
import j8.g;
import java.io.Closeable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import r8.l;

public abstract class h1 extends g0 implements Closeable {

    /* renamed from: o  reason: collision with root package name */
    public static final a f3456o = new a((g) null);

    public static final class a extends b<g0, h1> {

        /* renamed from: b9.h1$a$a  reason: collision with other inner class name */
        static final class C0072a extends m implements l<g.b, h1> {

            /* renamed from: m  reason: collision with root package name */
            public static final C0072a f3457m = new C0072a();

            C0072a() {
                super(1);
            }

            /* renamed from: b */
            public final h1 invoke(g.b bVar) {
                if (bVar instanceof h1) {
                    return (h1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(g0.f3452n, C0072a.f3457m);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }
}
