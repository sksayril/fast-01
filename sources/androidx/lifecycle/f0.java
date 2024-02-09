package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;

public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b0> f2748a = new LinkedHashMap();

    public final void a() {
        for (b0 a10 : this.f2748a.values()) {
            a10.a();
        }
        this.f2748a.clear();
    }

    public final b0 b(String str) {
        l.e(str, "key");
        return this.f2748a.get(str);
    }

    public final Set<String> c() {
        return new HashSet(this.f2748a.keySet());
    }

    public final void d(String str, b0 b0Var) {
        l.e(str, "key");
        l.e(b0Var, "viewModel");
        b0 put = this.f2748a.put(str, b0Var);
        if (put != null) {
            put.d();
        }
    }
}
