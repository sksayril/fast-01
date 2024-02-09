package z;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

final class j<T> extends n<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f13351a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Throwable th) {
        super((g) null);
        l.e(th, "readException");
        this.f13351a = th;
    }

    public final Throwable a() {
        return this.f13351a;
    }
}
