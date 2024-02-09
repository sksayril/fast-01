package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.g;
import j0.a;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;
import r8.l;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b<s0.d> f2792a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b<g0> f2793b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<Bundle> f2794c = new a();

    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    public static final class b implements a.b<s0.d> {
        b() {
        }
    }

    public static final class c implements a.b<g0> {
        c() {
        }
    }

    static final class d extends m implements l<j0.a, a0> {

        /* renamed from: m  reason: collision with root package name */
        public static final d f2795m = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final a0 invoke(j0.a aVar) {
            kotlin.jvm.internal.l.e(aVar, "$this$initializer");
            return new a0();
        }
    }

    public static final <T extends s0.d & g0> void a(T t9) {
        kotlin.jvm.internal.l.e(t9, "<this>");
        g.b b10 = t9.a().b();
        if (!(b10 == g.b.INITIALIZED || b10 == g.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t9.k().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            z zVar = new z(t9.k(), (g0) t9);
            t9.k().h("androidx.lifecycle.internal.SavedStateHandlesProvider", zVar);
            t9.a().a(new SavedStateHandleAttacher(zVar));
        }
    }

    public static final a0 b(g0 g0Var) {
        Class cls = a0.class;
        kotlin.jvm.internal.l.e(g0Var, "<this>");
        j0.c cVar = new j0.c();
        cVar.a(v.b(cls), d.f2795m);
        return (a0) new c0(g0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
    }
}
