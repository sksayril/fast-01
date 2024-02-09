package x1;

import android.content.Context;
import f8.a;
import r1.b;

public final class u0 implements b<t0> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f13138a;

    /* renamed from: b  reason: collision with root package name */
    private final a<String> f13139b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Integer> f13140c;

    public u0(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        this.f13138a = aVar;
        this.f13139b = aVar2;
        this.f13140c = aVar3;
    }

    public static u0 a(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    /* renamed from: b */
    public t0 get() {
        return c(this.f13138a.get(), this.f13139b.get(), this.f13140c.get().intValue());
    }
}
