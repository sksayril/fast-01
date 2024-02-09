package b9;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.g;

public class z {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f3518b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f3519a;

    public z(Throwable th, boolean z9) {
        this.f3519a = th;
        this._handled = z9 ? 1 : 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Throwable th, boolean z9, int i10, g gVar) {
        this(th, (i10 & 2) != 0 ? false : z9);
    }

    public final boolean a() {
        return f3518b.get(this) != 0;
    }

    public final boolean b() {
        return f3518b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return n0.a(this) + '[' + this.f3519a + ']';
    }
}
