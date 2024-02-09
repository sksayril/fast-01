package j9;

import androidx.concurrent.futures.b;
import b9.j;
import b9.q2;
import b9.y0;
import g8.s;
import g9.e0;
import j8.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r8.l;
import r8.q;

public class a<R> extends j implements b, q2 {

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f10864r = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");

    /* renamed from: m  reason: collision with root package name */
    private final g f10865m;

    /* renamed from: n  reason: collision with root package name */
    private List<a<R>.a> f10866n;

    /* renamed from: o  reason: collision with root package name */
    private Object f10867o;

    /* renamed from: p  reason: collision with root package name */
    private int f10868p;

    /* renamed from: q  reason: collision with root package name */
    private Object f10869q;
    private volatile Object state;

    /* renamed from: j9.a$a  reason: collision with other inner class name */
    public final class C0165a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f10870a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f10871b;

        /* renamed from: c  reason: collision with root package name */
        public final q<b<?>, Object, Object, l<Throwable, s>> f10872c;

        /* renamed from: d  reason: collision with root package name */
        public Object f10873d;

        /* renamed from: e  reason: collision with root package name */
        public int f10874e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a<R> f10875f;

        public final l<Throwable, s> a(b<?> bVar, Object obj) {
            q<b<?>, Object, Object, l<Throwable, s>> qVar = this.f10872c;
            if (qVar != null) {
                return qVar.a(bVar, this.f10871b, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.f10873d;
            a<R> aVar = this.f10875f;
            y0 y0Var = null;
            if (obj instanceof e0) {
                ((e0) obj).o(this.f10874e, (Throwable) null, aVar.getContext());
                return;
            }
            if (obj instanceof y0) {
                y0Var = (y0) obj;
            }
            if (y0Var != null) {
                y0Var.e();
            }
        }
    }

    private final a<R>.a h(Object obj) {
        boolean z9;
        List<a<R>.a> list = this.f10866n;
        T t9 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((C0165a) next).f10870a == obj) {
                z9 = true;
                continue;
            } else {
                z9 = false;
                continue;
            }
            if (z9) {
                t9 = next;
                break;
            }
        }
        a<R>.a aVar = (C0165a) t9;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    private final int j(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10864r;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof b9.l) {
                a<R>.a h10 = h(obj);
                if (h10 == null) {
                    continue;
                } else {
                    l<Throwable, s> a10 = h10.a(this, obj2);
                    if (b.a(atomicReferenceFieldUpdater, this, obj3, h10)) {
                        this.f10869q = obj2;
                        if (c.h((b9.l) obj3, a10)) {
                            return 0;
                        }
                        this.f10869q = null;
                        return 2;
                    }
                }
            } else {
                if (kotlin.jvm.internal.l.a(obj3, c.f10878c) ? true : obj3 instanceof C0165a) {
                    return 3;
                }
                if (kotlin.jvm.internal.l.a(obj3, c.f10879d)) {
                    return 2;
                }
                if (kotlin.jvm.internal.l.a(obj3, c.f10877b)) {
                    if (b.a(atomicReferenceFieldUpdater, this, obj3, m.b(obj))) {
                        return 1;
                    }
                } else if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                } else if (b.a(atomicReferenceFieldUpdater, this, obj3, v.u((Collection) obj3, obj))) {
                    return 1;
                }
            }
        }
    }

    public boolean b(Object obj, Object obj2) {
        return j(obj, obj2) == 0;
    }

    public void d(Object obj) {
        this.f10869q = obj;
    }

    public void e(e0<?> e0Var, int i10) {
        this.f10867o = e0Var;
        this.f10868p = i10;
    }

    public void f(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10864r;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == c.f10878c) {
                return;
            }
        } while (!b.a(atomicReferenceFieldUpdater, this, obj, c.f10879d));
        List<a<R>.a> list = this.f10866n;
        if (list != null) {
            for (C0165a b10 : list) {
                b10.b();
            }
            this.f10869q = c.f10880e;
            this.f10866n = null;
        }
    }

    public g getContext() {
        return this.f10865m;
    }

    public final d i(Object obj, Object obj2) {
        return c.a(j(obj, obj2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        f((Throwable) obj);
        return s.f8976a;
    }
}
