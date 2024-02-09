package z;

import kotlin.jvm.internal.g;

final class c<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f13329a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13330b;

    public c(T t9, int i10) {
        super((g) null);
        this.f13329a = t9;
        this.f13330b = i10;
    }

    public final void a() {
        T t9 = this.f13329a;
        boolean z9 = false;
        if ((t9 != null ? t9.hashCode() : 0) == this.f13330b) {
            z9 = true;
        }
        if (!z9) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final T b() {
        return this.f13329a;
    }
}
