package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class p {

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2043b = true;

    /* renamed from: c  reason: collision with root package name */
    private static final Class<?> f2044c = c();

    /* renamed from: d  reason: collision with root package name */
    private static volatile p f2045d;

    /* renamed from: e  reason: collision with root package name */
    static final p f2046e = new p(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, y.e<?, ?>> f2047a;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f2048a;

        /* renamed from: b  reason: collision with root package name */
        private final int f2049b;

        a(Object obj, int i10) {
            this.f2048a = obj;
            this.f2049b = i10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2048a == aVar.f2048a && this.f2049b == aVar.f2049b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f2048a) * 65535) + this.f2049b;
        }
    }

    p() {
        this.f2047a = new HashMap();
    }

    p(boolean z9) {
        this.f2047a = Collections.emptyMap();
    }

    public static p b() {
        p pVar = f2045d;
        if (pVar == null) {
            synchronized (p.class) {
                pVar = f2045d;
                if (pVar == null) {
                    pVar = f2043b ? o.a() : f2046e;
                    f2045d = pVar;
                }
            }
        }
        return pVar;
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public <ContainingType extends r0> y.e<ContainingType, ?> a(ContainingType containingtype, int i10) {
        return this.f2047a.get(new a(containingtype, i10));
    }
}
