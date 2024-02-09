package e2;

import java.util.concurrent.Callable;

final class h0 extends j0 {

    /* renamed from: f  reason: collision with root package name */
    private final Callable f8354f;

    /* synthetic */ h0(Callable callable, g0 g0Var) {
        super(false, 1, 5, (String) null, (Throwable) null, (i0) null);
        this.f8354f = callable;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        try {
            return (String) this.f8354f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
