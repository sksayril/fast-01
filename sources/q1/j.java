package q1;

import android.content.Context;
import f8.a;
import r1.b;

public final class j implements b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f11971a;

    /* renamed from: b  reason: collision with root package name */
    private final a<z1.a> f11972b;

    /* renamed from: c  reason: collision with root package name */
    private final a<z1.a> f11973c;

    public j(a<Context> aVar, a<z1.a> aVar2, a<z1.a> aVar3) {
        this.f11971a = aVar;
        this.f11972b = aVar2;
        this.f11973c = aVar3;
    }

    public static j a(a<Context> aVar, a<z1.a> aVar2, a<z1.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, z1.a aVar, z1.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public i get() {
        return c(this.f11971a.get(), this.f11972b.get(), this.f11973c.get());
    }
}
