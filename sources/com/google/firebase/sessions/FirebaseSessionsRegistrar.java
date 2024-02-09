package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import b9.g0;
import c5.c0;
import c5.d0;
import c5.e0;
import c5.h;
import c5.h0;
import c5.i0;
import c5.l;
import c5.l0;
import c5.n;
import c5.o;
import c5.p;
import c5.q;
import c5.s;
import c5.x;
import c5.y;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.jvm.internal.g;
import t3.f;
import t4.d;
import v3.b;
import w3.c;
import w3.e;
import w3.f0;
import w3.r;

@Keep
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a((g) null);
    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    @Deprecated
    private static final f0<g0> backgroundDispatcher;
    @Deprecated
    private static final f0<g0> blockingDispatcher;
    @Deprecated
    private static final f0<f> firebaseApp = f0.b(f.class);
    @Deprecated
    private static final f0<d> firebaseInstallationsApi = f0.b(d.class);
    @Deprecated
    private static final f0<c0> sessionFirelogPublisher = f0.b(c0.class);
    @Deprecated
    private static final f0<e0> sessionGenerator = f0.b(e0.class);
    @Deprecated
    private static final f0<e5.f> sessionsSettings = f0.b(e5.f.class);
    @Deprecated
    private static final f0<n1.g> transportFactory = f0.b(n1.g.class);

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    static {
        Class<g0> cls = g0.class;
        backgroundDispatcher = f0.a(v3.a.class, cls);
        blockingDispatcher = f0.a(b.class, cls);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0  reason: not valid java name */
    public static final l m8getComponents$lambda0(e eVar) {
        Object g10 = eVar.g(firebaseApp);
        kotlin.jvm.internal.l.d(g10, "container[firebaseApp]");
        Object g11 = eVar.g(sessionsSettings);
        kotlin.jvm.internal.l.d(g11, "container[sessionsSettings]");
        Object g12 = eVar.g(backgroundDispatcher);
        kotlin.jvm.internal.l.d(g12, "container[backgroundDispatcher]");
        return new l((f) g10, (e5.f) g11, (j8.g) g12);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-1  reason: not valid java name */
    public static final e0 m9getComponents$lambda1(e eVar) {
        return new e0(l0.f3757a, (r8.a) null, 2, (g) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-2  reason: not valid java name */
    public static final c0 m10getComponents$lambda2(e eVar) {
        Object g10 = eVar.g(firebaseApp);
        kotlin.jvm.internal.l.d(g10, "container[firebaseApp]");
        Object g11 = eVar.g(firebaseInstallationsApi);
        kotlin.jvm.internal.l.d(g11, "container[firebaseInstallationsApi]");
        Object g12 = eVar.g(sessionsSettings);
        kotlin.jvm.internal.l.d(g12, "container[sessionsSettings]");
        s4.b<n1.g> h10 = eVar.h(transportFactory);
        kotlin.jvm.internal.l.d(h10, "container.getProvider(transportFactory)");
        h hVar = new h(h10);
        Object g13 = eVar.g(backgroundDispatcher);
        kotlin.jvm.internal.l.d(g13, "container[backgroundDispatcher]");
        return new d0((f) g10, (d) g11, (e5.f) g12, hVar, (j8.g) g13);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-3  reason: not valid java name */
    public static final e5.f m11getComponents$lambda3(e eVar) {
        Object g10 = eVar.g(firebaseApp);
        kotlin.jvm.internal.l.d(g10, "container[firebaseApp]");
        Object g11 = eVar.g(blockingDispatcher);
        kotlin.jvm.internal.l.d(g11, "container[blockingDispatcher]");
        Object g12 = eVar.g(backgroundDispatcher);
        kotlin.jvm.internal.l.d(g12, "container[backgroundDispatcher]");
        Object g13 = eVar.g(firebaseInstallationsApi);
        kotlin.jvm.internal.l.d(g13, "container[firebaseInstallationsApi]");
        return new e5.f((f) g10, (j8.g) g11, (j8.g) g12, (d) g13);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-4  reason: not valid java name */
    public static final x m12getComponents$lambda4(e eVar) {
        Context m10 = ((f) eVar.g(firebaseApp)).m();
        kotlin.jvm.internal.l.d(m10, "container[firebaseApp].applicationContext");
        Object g10 = eVar.g(backgroundDispatcher);
        kotlin.jvm.internal.l.d(g10, "container[backgroundDispatcher]");
        return new y(m10, (j8.g) g10);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-5  reason: not valid java name */
    public static final h0 m13getComponents$lambda5(e eVar) {
        Object g10 = eVar.g(firebaseApp);
        kotlin.jvm.internal.l.d(g10, "container[firebaseApp]");
        return new i0((f) g10);
    }

    public List<c<? extends Object>> getComponents() {
        c.b<l> g10 = c.c(l.class).g(LIBRARY_NAME);
        f0<f> f0Var = firebaseApp;
        c.b<l> b10 = g10.b(r.j(f0Var));
        f0<e5.f> f0Var2 = sessionsSettings;
        c.b<l> b11 = b10.b(r.j(f0Var2));
        f0<g0> f0Var3 = backgroundDispatcher;
        c.b<c0> b12 = c.c(c0.class).g("session-publisher").b(r.j(f0Var));
        f0<d> f0Var4 = firebaseInstallationsApi;
        return n.e(b11.b(r.j(f0Var3)).e(c5.r.f3763a).d().c(), c.c(e0.class).g("session-generator").e(o.f3760a).c(), b12.b(r.j(f0Var4)).b(r.j(f0Var2)).b(r.l(transportFactory)).b(r.j(f0Var3)).e(q.f3762a).c(), c.c(e5.f.class).g("sessions-settings").b(r.j(f0Var)).b(r.j(blockingDispatcher)).b(r.j(f0Var3)).b(r.j(f0Var4)).e(s.f3764a).c(), c.c(x.class).g("sessions-datastore").b(r.j(f0Var)).b(r.j(f0Var3)).e(p.f3761a).c(), c.c(h0.class).g("sessions-service-binder").b(r.j(f0Var)).e(n.f3759a).c(), z4.h.b(LIBRARY_NAME, "1.2.0"));
    }
}
