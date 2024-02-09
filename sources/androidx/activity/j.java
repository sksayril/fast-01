package androidx.activity;

import g8.s;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.l;
import r8.a;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    private boolean f191a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f192b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private a<s> f193c;

    public j(boolean z9) {
        this.f191a = z9;
    }

    public final void a(a aVar) {
        l.e(aVar, "cancellable");
        this.f192b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f191a;
    }

    public final void d() {
        for (a cancel : this.f192b) {
            cancel.cancel();
        }
    }

    public final void e(a aVar) {
        l.e(aVar, "cancellable");
        this.f192b.remove(aVar);
    }

    public final void f(boolean z9) {
        this.f191a = z9;
        a<s> aVar = this.f193c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void g(a<s> aVar) {
        this.f193c = aVar;
    }
}
