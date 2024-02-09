package k9;

import b9.m;
import b9.n0;
import b9.o;
import b9.q2;
import g8.s;
import g9.e0;
import j8.d;
import j8.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import r8.l;
import r8.q;

public class b extends d implements a {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11025i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h  reason: collision with root package name */
    private final q<j9.b<?>, Object, Object, l<Throwable, s>> f11026h;
    private volatile Object owner;

    private final class a implements b9.l<s>, q2 {

        /* renamed from: m  reason: collision with root package name */
        public final m<s> f11027m;

        /* renamed from: n  reason: collision with root package name */
        public final Object f11028n;

        /* renamed from: k9.b$a$a  reason: collision with other inner class name */
        static final class C0174a extends kotlin.jvm.internal.m implements l<Throwable, s> {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ b f11030m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ a f11031n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0174a(b bVar, a aVar) {
                super(1);
                this.f11030m = bVar;
                this.f11031n = aVar;
            }

            public final void b(Throwable th) {
                this.f11030m.a(this.f11031n.f11028n);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return s.f8976a;
            }
        }

        /* renamed from: k9.b$a$b  reason: collision with other inner class name */
        static final class C0175b extends kotlin.jvm.internal.m implements l<Throwable, s> {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ b f11032m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ a f11033n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0175b(b bVar, a aVar) {
                super(1);
                this.f11032m = bVar;
                this.f11033n = aVar;
            }

            public final void b(Throwable th) {
                b.f11025i.set(this.f11032m, this.f11033n.f11028n);
                this.f11032m.a(this.f11033n.f11028n);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return s.f8976a;
            }
        }

        public a(m<? super s> mVar, Object obj) {
            this.f11027m = mVar;
            this.f11028n = obj;
        }

        /* renamed from: a */
        public void f(s sVar, l<? super Throwable, s> lVar) {
            b.f11025i.set(b.this, this.f11028n);
            this.f11027m.f(sVar, new C0174a(b.this, this));
        }

        /* renamed from: b */
        public Object j(s sVar, Object obj, l<? super Throwable, s> lVar) {
            Object j10 = this.f11027m.j(sVar, obj, new C0175b(b.this, this));
            if (j10 != null) {
                b.f11025i.set(b.this, this.f11028n);
            }
            return j10;
        }

        public boolean d(Throwable th) {
            return this.f11027m.d(th);
        }

        public void e(e0<?> e0Var, int i10) {
            this.f11027m.e(e0Var, i10);
        }

        public g getContext() {
            return this.f11027m.getContext();
        }

        public void i(l<? super Throwable, s> lVar) {
            this.f11027m.i(lVar);
        }

        public void n(Object obj) {
            this.f11027m.n(obj);
        }

        public void resumeWith(Object obj) {
            this.f11027m.resumeWith(obj);
        }
    }

    /* renamed from: k9.b$b  reason: collision with other inner class name */
    static final class C0176b extends kotlin.jvm.internal.m implements q<j9.b<?>, Object, Object, l<? super Throwable, ? extends s>> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f11034m;

        /* renamed from: k9.b$b$a */
        static final class a extends kotlin.jvm.internal.m implements l<Throwable, s> {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ b f11035m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ Object f11036n;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b bVar, Object obj) {
                super(1);
                this.f11035m = bVar;
                this.f11036n = obj;
            }

            public final void b(Throwable th) {
                this.f11035m.a(this.f11036n);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return s.f8976a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0176b(b bVar) {
            super(3);
            this.f11034m = bVar;
        }

        /* renamed from: b */
        public final l<Throwable, s> a(j9.b<?> bVar, Object obj, Object obj2) {
            return new a(this.f11034m, obj);
        }
    }

    public b(boolean z9) {
        super(1, z9 ? 1 : 0);
        this.owner = z9 ? null : c.f11037a;
        this.f11026h = new C0176b(this);
    }

    static /* synthetic */ Object o(b bVar, Object obj, d<? super s> dVar) {
        if (bVar.q(obj)) {
            return s.f8976a;
        }
        Object p10 = bVar.p(obj, dVar);
        return p10 == d.d() ? p10 : s.f8976a;
    }

    private final Object p(Object obj, d<? super s> dVar) {
        m b10 = o.b(c.c(dVar));
        try {
            d(new a(b10, obj));
            Object w9 = b10.w();
            if (w9 == d.d()) {
                h.c(dVar);
            }
            return w9 == d.d() ? w9 : s.f8976a;
        } catch (Throwable th) {
            b10.I();
            throw th;
        }
    }

    private final int r(Object obj) {
        while (!j()) {
            if (obj == null) {
                return 1;
            }
            if (n(obj)) {
                return 2;
            }
            if (c()) {
                return 1;
            }
        }
        f11025i.set(this, obj);
        return 0;
    }

    public void a(Object obj) {
        while (c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11025i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != c.f11037a) {
                if (!(obj2 == obj || obj == null)) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj2, c.f11037a)) {
                    i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    public Object b(Object obj, d<? super s> dVar) {
        return o(this, obj, dVar);
    }

    public boolean c() {
        return h() == 0;
    }

    public boolean n(Object obj) {
        while (c()) {
            Object obj2 = f11025i.get(this);
            if (obj2 != c.f11037a) {
                return obj2 == obj;
            }
        }
        return false;
    }

    public boolean q(Object obj) {
        int r9 = r(obj);
        if (r9 == 0) {
            return true;
        }
        if (r9 == 1) {
            return false;
        }
        if (r9 != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public String toString() {
        return "Mutex@" + n0.b(this) + "[isLocked=" + c() + ",owner=" + f11025i.get(this) + ']';
    }
}
