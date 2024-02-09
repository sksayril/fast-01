package g2;

import d3.k;
import e2.b;
import f2.c;
import java.util.Set;
import p.a;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final a f8871a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8872b;

    /* renamed from: c  reason: collision with root package name */
    private final k f8873c;

    /* renamed from: d  reason: collision with root package name */
    private int f8874d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8875e;

    public final Set a() {
        return this.f8871a.keySet();
    }

    public final void b(b bVar, b bVar2, String str) {
        this.f8871a.put(bVar, bVar2);
        this.f8872b.put(bVar, str);
        this.f8874d--;
        if (!bVar2.k()) {
            this.f8875e = true;
        }
        if (this.f8874d != 0) {
            return;
        }
        if (this.f8875e) {
            this.f8873c.b(new c(this.f8871a));
            return;
        }
        this.f8873c.c(this.f8872b);
    }
}
