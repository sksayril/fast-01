package o5;

import u5.a;
import u5.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final b f11614a;

    /* renamed from: b  reason: collision with root package name */
    private b f11615b;

    public c(b bVar) {
        if (bVar != null) {
            this.f11614a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public b a() {
        if (this.f11615b == null) {
            this.f11615b = this.f11614a.b();
        }
        return this.f11615b;
    }

    public a b(int i10, a aVar) {
        return this.f11614a.c(i10, aVar);
    }

    public int c() {
        return this.f11614a.d();
    }

    public int d() {
        return this.f11614a.f();
    }

    public boolean e() {
        return this.f11614a.e().f();
    }

    public c f() {
        return new c(this.f11614a.a(this.f11614a.e().g()));
    }

    public String toString() {
        try {
            return a().toString();
        } catch (j unused) {
            return "";
        }
    }
}
