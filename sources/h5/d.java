package h5;

import com.google.gson.b;
import com.google.gson.e;
import com.google.gson.w;
import com.google.gson.x;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import n5.c;

public final class d implements x, Cloneable {

    /* renamed from: s  reason: collision with root package name */
    public static final d f9330s = new d();

    /* renamed from: m  reason: collision with root package name */
    private double f9331m = -1.0d;

    /* renamed from: n  reason: collision with root package name */
    private int f9332n = 136;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9333o = true;

    /* renamed from: p  reason: collision with root package name */
    private boolean f9334p;

    /* renamed from: q  reason: collision with root package name */
    private List<com.google.gson.a> f9335q = Collections.emptyList();

    /* renamed from: r  reason: collision with root package name */
    private List<com.google.gson.a> f9336r = Collections.emptyList();

    class a extends w<T> {

        /* renamed from: a  reason: collision with root package name */
        private w<T> f9337a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f9338b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f9339c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f9340d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m5.a f9341e;

        a(boolean z9, boolean z10, e eVar, m5.a aVar) {
            this.f9338b = z9;
            this.f9339c = z10;
            this.f9340d = eVar;
            this.f9341e = aVar;
        }

        private w<T> f() {
            w<T> wVar = this.f9337a;
            if (wVar != null) {
                return wVar;
            }
            w<T> m10 = this.f9340d.m(d.this, this.f9341e);
            this.f9337a = m10;
            return m10;
        }

        public T c(n5.a aVar) {
            if (!this.f9338b) {
                return f().c(aVar);
            }
            aVar.Q();
            return null;
        }

        public void e(c cVar, T t9) {
            if (this.f9339c) {
                cVar.r();
            } else {
                f().e(cVar, t9);
            }
        }
    }

    private boolean e(Class<?> cls) {
        if (this.f9331m == -1.0d || r((g5.d) cls.getAnnotation(g5.d.class), (g5.e) cls.getAnnotation(g5.e.class))) {
            return (!this.f9333o && k(cls)) || i(cls);
        }
        return true;
    }

    private boolean f(Class<?> cls, boolean z9) {
        for (com.google.gson.a a10 : z9 ? this.f9335q : this.f9336r) {
            if (a10.a(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && !n(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    private boolean k(Class<?> cls) {
        return cls.isMemberClass() && !n(cls);
    }

    private boolean n(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean p(g5.d dVar) {
        return dVar == null || dVar.value() <= this.f9331m;
    }

    private boolean q(g5.e eVar) {
        return eVar == null || eVar.value() > this.f9331m;
    }

    private boolean r(g5.d dVar, g5.e eVar) {
        return p(dVar) && q(eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public <T> w<T> create(e eVar, m5.a<T> aVar) {
        Class<? super T> c10 = aVar.c();
        boolean e10 = e(c10);
        boolean z9 = e10 || f(c10, true);
        boolean z10 = e10 || f(c10, false);
        if (z9 || z10) {
            return new a(z10, z9, eVar, aVar);
        }
        return null;
    }

    public boolean d(Class<?> cls, boolean z9) {
        return e(cls) || f(cls, z9);
    }

    public boolean h(Field field, boolean z9) {
        g5.a aVar;
        if ((this.f9332n & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f9331m != -1.0d && !r((g5.d) field.getAnnotation(g5.d.class), (g5.e) field.getAnnotation(g5.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f9334p && ((aVar = (g5.a) field.getAnnotation(g5.a.class)) == null || (!z9 ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f9333o && k(field.getType())) || i(field.getType())) {
            return true;
        }
        List<com.google.gson.a> list = z9 ? this.f9335q : this.f9336r;
        if (list.isEmpty()) {
            return false;
        }
        b bVar = new b(field);
        for (com.google.gson.a b10 : list) {
            if (b10.b(bVar)) {
                return true;
            }
        }
        return false;
    }
}
