package androidx.activity;

import g8.s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.l;
import r8.a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f183a;

    /* renamed from: b  reason: collision with root package name */
    private final a<s> f184b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f185c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f186d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f187e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f188f;

    /* renamed from: g  reason: collision with root package name */
    private final List<a<s>> f189g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f190h = new g(this);

    public h(Executor executor, a<s> aVar) {
        l.e(executor, "executor");
        l.e(aVar, "reportFullyDrawn");
        this.f183a = executor;
        this.f184b = aVar;
    }

    /* access modifiers changed from: private */
    public static final void d(h hVar) {
        l.e(hVar, "this$0");
        synchronized (hVar.f185c) {
            hVar.f187e = false;
            if (hVar.f186d == 0 && !hVar.f188f) {
                hVar.f184b.invoke();
                hVar.b();
            }
            s sVar = s.f8976a;
        }
    }

    public final void b() {
        synchronized (this.f185c) {
            this.f188f = true;
            for (a invoke : this.f189g) {
                invoke.invoke();
            }
            this.f189g.clear();
            s sVar = s.f8976a;
        }
    }

    public final boolean c() {
        boolean z9;
        synchronized (this.f185c) {
            z9 = this.f188f;
        }
        return z9;
    }
}
