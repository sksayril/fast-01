package com.google.firebase.ktx;

import androidx.annotation.Keep;
import b9.g0;
import b9.j1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.l;
import w3.e;
import w3.f0;
import w3.h;
import w3.r;

@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final a<T> f7467a = new a<>();

        /* renamed from: b */
        public final g0 a(e eVar) {
            Object g10 = eVar.g(f0.a(v3.a.class, Executor.class));
            l.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return j1.a((Executor) g10);
        }
    }

    public static final class b<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final b<T> f7468a = new b<>();

        /* renamed from: b */
        public final g0 a(e eVar) {
            Object g10 = eVar.g(f0.a(v3.c.class, Executor.class));
            l.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return j1.a((Executor) g10);
        }
    }

    public static final class c<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final c<T> f7469a = new c<>();

        /* renamed from: b */
        public final g0 a(e eVar) {
            Object g10 = eVar.g(f0.a(v3.b.class, Executor.class));
            l.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return j1.a((Executor) g10);
        }
    }

    public static final class d<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final d<T> f7470a = new d<>();

        /* renamed from: b */
        public final g0 a(e eVar) {
            Object g10 = eVar.g(f0.a(v3.d.class, Executor.class));
            l.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return j1.a((Executor) g10);
        }
    }

    public List<w3.c<?>> getComponents() {
        Class<g0> cls = g0.class;
        w3.c<v3.a> c10 = w3.c.e(f0.a(v3.a.class, cls)).b(r.j(f0.a(v3.a.class, Executor.class))).e(a.f7467a).c();
        l.d(c10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        w3.c<v3.c> c11 = w3.c.e(f0.a(v3.c.class, cls)).b(r.j(f0.a(v3.c.class, Executor.class))).e(b.f7468a).c();
        l.d(c11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        w3.c<v3.b> c12 = w3.c.e(f0.a(v3.b.class, cls)).b(r.j(f0.a(v3.b.class, Executor.class))).e(c.f7469a).c();
        l.d(c12, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        w3.c<v3.d> c13 = w3.c.e(f0.a(v3.d.class, cls)).b(r.j(f0.a(v3.d.class, Executor.class))).e(d.f7470a).c();
        l.d(c13, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return n.e(c10, c11, c12, c13);
    }
}
