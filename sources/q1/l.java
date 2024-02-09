package q1;

import android.content.Context;
import f8.a;
import r1.b;

public final class l implements b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f11979a;

    /* renamed from: b  reason: collision with root package name */
    private final a<i> f11980b;

    public l(a<Context> aVar, a<i> aVar2) {
        this.f11979a = aVar;
        this.f11980b = aVar2;
    }

    public static l a(a<Context> aVar, a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    /* renamed from: b */
    public k get() {
        return c(this.f11979a.get(), this.f11980b.get());
    }
}
