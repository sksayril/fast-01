package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private final u3 f5114a;

    /* renamed from: b  reason: collision with root package name */
    private s6 f5115b;

    /* renamed from: c  reason: collision with root package name */
    d f5116c;

    /* renamed from: d  reason: collision with root package name */
    private final b f5117d;

    public b0() {
        this(new u3());
    }

    private b0(u3 u3Var) {
        this.f5114a = u3Var;
        this.f5115b = u3Var.f5637b.d();
        this.f5116c = new d();
        this.f5117d = new b();
        u3Var.b("internal.registerCallback", new a(this));
        u3Var.b("internal.eventLogger", new b2(this));
    }

    public final d a() {
        return this.f5116c;
    }

    public final void b(f5 f5Var) {
        m mVar;
        try {
            this.f5115b = this.f5114a.f5637b.d();
            if (!(this.f5114a.a(this.f5115b, (g5[]) f5Var.L().toArray(new g5[0])) instanceof k)) {
                for (e5 next : f5Var.J().L()) {
                    List<g5> L = next.L();
                    String K = next.K();
                    Iterator<g5> it = L.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            r a10 = this.f5114a.a(this.f5115b, it.next());
                            if (a10 instanceof q) {
                                s6 s6Var = this.f5115b;
                                if (!s6Var.g(K)) {
                                    mVar = null;
                                } else {
                                    r c10 = s6Var.c(K);
                                    if (c10 instanceof m) {
                                        mVar = (m) c10;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: " + K);
                                    }
                                }
                                if (mVar != null) {
                                    mVar.a(this.f5115b, Collections.singletonList(a10));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: " + K);
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new b1(th);
        }
    }

    public final void c(String str, Callable<? extends m> callable) {
        this.f5114a.b(str, callable);
    }

    public final boolean d(e eVar) {
        try {
            this.f5116c.b(eVar);
            this.f5114a.f5638c.h("runtime.counter", new j(Double.valueOf(0.0d)));
            this.f5117d.b(this.f5115b.d(), this.f5116c);
            return g() || f();
        } catch (Throwable th) {
            throw new b1(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ m e() {
        return new rg(this.f5117d);
    }

    public final boolean f() {
        return !this.f5116c.f().isEmpty();
    }

    public final boolean g() {
        return !this.f5116c.d().equals(this.f5116c.a());
    }
}
