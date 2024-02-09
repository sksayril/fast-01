package w1;

import java.util.concurrent.Executor;
import p1.p;
import x1.d;
import y1.b;

public class v {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f12815a;

    /* renamed from: b  reason: collision with root package name */
    private final d f12816b;

    /* renamed from: c  reason: collision with root package name */
    private final x f12817c;

    /* renamed from: d  reason: collision with root package name */
    private final b f12818d;

    v(Executor executor, d dVar, x xVar, b bVar) {
        this.f12815a = executor;
        this.f12816b = dVar;
        this.f12817c = xVar;
        this.f12818d = bVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d() {
        for (p a10 : this.f12816b.s()) {
            this.f12817c.a(a10, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f12818d.g(new u(this));
    }

    public void c() {
        this.f12815a.execute(new t(this));
    }
}
