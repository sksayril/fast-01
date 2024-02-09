package s0;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f12131d = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f12132a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.savedstate.a f12133b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12134c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a(d dVar) {
            l.e(dVar, "owner");
            return new c(dVar, (g) null);
        }
    }

    private c(d dVar) {
        this.f12132a = dVar;
        this.f12133b = new androidx.savedstate.a();
    }

    public /* synthetic */ c(d dVar, g gVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f12131d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f12133b;
    }

    public final void c() {
        androidx.lifecycle.g a10 = this.f12132a.a();
        if (a10.b() == g.b.INITIALIZED) {
            a10.a(new Recreator(this.f12132a));
            this.f12133b.e(a10);
            this.f12134c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.f12134c) {
            c();
        }
        androidx.lifecycle.g a10 = this.f12132a.a();
        if (!a10.b().isAtLeast(g.b.STARTED)) {
            this.f12133b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + a10.b()).toString());
    }

    public final void e(Bundle bundle) {
        l.e(bundle, "outBundle");
        this.f12133b.g(bundle);
    }
}
