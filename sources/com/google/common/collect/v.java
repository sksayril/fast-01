package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.h;

public final class v {

    class a extends q0<T> {

        /* renamed from: m  reason: collision with root package name */
        boolean f7182m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Object f7183n;

        a(Object obj) {
            this.f7183n = obj;
        }

        public boolean hasNext() {
            return !this.f7182m;
        }

        public T next() {
            if (!this.f7182m) {
                this.f7182m = true;
                return this.f7183n;
            }
            throw new NoSuchElementException();
        }
    }

    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        h.i(collection);
        h.i(it);
        boolean z9 = false;
        while (it.hasNext()) {
            z9 |= collection.add(it.next());
        }
        return z9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = p3.f.a(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.v.b(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static <T> T c(Iterator<? extends T> it, T t9) {
        return it.hasNext() ? it.next() : t9;
    }

    public static <T> q0<T> d(T t9) {
        return new a(t9);
    }
}
