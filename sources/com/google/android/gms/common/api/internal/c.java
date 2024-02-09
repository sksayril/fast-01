package com.google.android.gms.common.api.internal;

import android.os.Looper;
import h2.p;
import java.util.concurrent.Executor;

public final class c<L> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4960a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f4961b;

    /* renamed from: c  reason: collision with root package name */
    private volatile a f4962c;

    public static final class a<L> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f4963a;

        /* renamed from: b  reason: collision with root package name */
        private final String f4964b;

        a(L l10, String str) {
            this.f4963a = l10;
            this.f4964b = str;
        }

        public String a() {
            String str = this.f4964b;
            int identityHashCode = System.identityHashCode(this.f4963a);
            return str + "@" + identityHashCode;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4963a == aVar.f4963a && this.f4964b.equals(aVar.f4964b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f4963a) * 31) + this.f4964b.hashCode();
        }
    }

    public interface b<L> {
        void a(L l10);

        void b();
    }

    c(Looper looper, L l10, String str) {
        this.f4960a = new m2.a(looper);
        this.f4961b = p.k(l10, "Listener must not be null");
        this.f4962c = new a(l10, p.f(str));
    }

    public void a() {
        this.f4961b = null;
        this.f4962c = null;
    }

    public a<L> b() {
        return this.f4962c;
    }

    public void c(b<? super L> bVar) {
        p.k(bVar, "Notifier must not be null");
        this.f4960a.execute(new v(this, bVar));
    }

    /* access modifiers changed from: package-private */
    public final void d(b bVar) {
        Object obj = this.f4961b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }
}
