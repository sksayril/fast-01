package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.p8;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class c8 {

    /* renamed from: b  reason: collision with root package name */
    private static volatile c8 f5167b;

    /* renamed from: c  reason: collision with root package name */
    static final c8 f5168c = new c8(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<a, p8.f<?, ?>> f5169a;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f5170a;

        /* renamed from: b  reason: collision with root package name */
        private final int f5171b;

        a(Object obj, int i10) {
            this.f5170a = obj;
            this.f5171b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5170a == aVar.f5170a && this.f5171b == aVar.f5171b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f5170a) * 65535) + this.f5171b;
        }
    }

    c8() {
        this.f5169a = new HashMap();
    }

    private c8(boolean z9) {
        this.f5169a = Collections.emptyMap();
    }

    public static c8 a() {
        Class<c8> cls = c8.class;
        c8 c8Var = f5167b;
        if (c8Var != null) {
            return c8Var;
        }
        synchronized (cls) {
            c8 c8Var2 = f5167b;
            if (c8Var2 != null) {
                return c8Var2;
            }
            c8 b10 = n8.b(cls);
            f5167b = b10;
            return b10;
        }
    }

    public final <ContainingType extends da> p8.f<ContainingType, ?> b(ContainingType containingtype, int i10) {
        return this.f5169a.get(new a(containingtype, i10));
    }
}
