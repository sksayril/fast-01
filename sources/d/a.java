package d;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f7656a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Context f7657b;

    public final void a(b bVar) {
        l.e(bVar, "listener");
        Context context = this.f7657b;
        if (context != null) {
            bVar.a(context);
        }
        this.f7656a.add(bVar);
    }

    public final void b() {
        this.f7657b = null;
    }

    public final void c(Context context) {
        l.e(context, "context");
        this.f7657b = context;
        for (b a10 : this.f7656a) {
            a10.a(context);
        }
    }
}
