package z;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

final class h<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f13350a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Throwable th) {
        super((g) null);
        l.e(th, "finalException");
        this.f13350a = th;
    }

    public final Throwable a() {
        return this.f13350a;
    }
}
