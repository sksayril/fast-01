package com.google.gson;

import h5.l;
import i5.h;
import i5.i;
import i5.j;
import i5.k;
import i5.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class e {

    /* renamed from: x  reason: collision with root package name */
    private static final m5.a<?> f7481x = m5.a.a(Object.class);

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<Map<m5.a<?>, f<?>>> f7482a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<m5.a<?>, w<?>> f7483b;

    /* renamed from: c  reason: collision with root package name */
    private final h5.c f7484c;

    /* renamed from: d  reason: collision with root package name */
    private final i5.e f7485d;

    /* renamed from: e  reason: collision with root package name */
    final List<x> f7486e;

    /* renamed from: f  reason: collision with root package name */
    final h5.d f7487f;

    /* renamed from: g  reason: collision with root package name */
    final d f7488g;

    /* renamed from: h  reason: collision with root package name */
    final Map<Type, g<?>> f7489h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f7490i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f7491j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f7492k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f7493l;

    /* renamed from: m  reason: collision with root package name */
    final boolean f7494m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f7495n;

    /* renamed from: o  reason: collision with root package name */
    final boolean f7496o;

    /* renamed from: p  reason: collision with root package name */
    final String f7497p;

    /* renamed from: q  reason: collision with root package name */
    final int f7498q;

    /* renamed from: r  reason: collision with root package name */
    final int f7499r;

    /* renamed from: s  reason: collision with root package name */
    final t f7500s;

    /* renamed from: t  reason: collision with root package name */
    final List<x> f7501t;

    /* renamed from: u  reason: collision with root package name */
    final List<x> f7502u;

    /* renamed from: v  reason: collision with root package name */
    final v f7503v;

    /* renamed from: w  reason: collision with root package name */
    final v f7504w;

    class a extends w<Number> {
        a() {
        }

        /* renamed from: f */
        public Double c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return Double.valueOf(aVar.u());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, Number number) {
            if (number == null) {
                cVar.r();
                return;
            }
            e.d(number.doubleValue());
            cVar.H(number);
        }
    }

    class b extends w<Number> {
        b() {
        }

        /* renamed from: f */
        public Float c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return Float.valueOf((float) aVar.u());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, Number number) {
            if (number == null) {
                cVar.r();
                return;
            }
            e.d((double) number.floatValue());
            cVar.H(number);
        }
    }

    class c extends w<Number> {
        c() {
        }

        /* renamed from: f */
        public Number c(n5.a aVar) {
            if (aVar.G() != n5.b.NULL) {
                return Long.valueOf(aVar.y());
            }
            aVar.C();
            return null;
        }

        /* renamed from: g */
        public void e(n5.c cVar, Number number) {
            if (number == null) {
                cVar.r();
            } else {
                cVar.I(number.toString());
            }
        }
    }

    class d extends w<AtomicLong> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f7507a;

        d(w wVar) {
            this.f7507a = wVar;
        }

        /* renamed from: f */
        public AtomicLong c(n5.a aVar) {
            return new AtomicLong(((Number) this.f7507a.c(aVar)).longValue());
        }

        /* renamed from: g */
        public void e(n5.c cVar, AtomicLong atomicLong) {
            this.f7507a.e(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.google.gson.e$e  reason: collision with other inner class name */
    class C0100e extends w<AtomicLongArray> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w f7508a;

        C0100e(w wVar) {
            this.f7508a = wVar;
        }

        /* renamed from: f */
        public AtomicLongArray c(n5.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.o()) {
                arrayList.add(Long.valueOf(((Number) this.f7508a.c(aVar)).longValue()));
            }
            aVar.k();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: g */
        public void e(n5.c cVar, AtomicLongArray atomicLongArray) {
            cVar.e();
            int length = atomicLongArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                this.f7508a.e(cVar, Long.valueOf(atomicLongArray.get(i10)));
            }
            cVar.k();
        }
    }

    static class f<T> extends w<T> {

        /* renamed from: a  reason: collision with root package name */
        private w<T> f7509a;

        f() {
        }

        public T c(n5.a aVar) {
            w<T> wVar = this.f7509a;
            if (wVar != null) {
                return wVar.c(aVar);
            }
            throw new IllegalStateException();
        }

        public void e(n5.c cVar, T t9) {
            w<T> wVar = this.f7509a;
            if (wVar != null) {
                wVar.e(cVar, t9);
                return;
            }
            throw new IllegalStateException();
        }

        public void f(w<T> wVar) {
            if (this.f7509a == null) {
                this.f7509a = wVar;
                return;
            }
            throw new AssertionError();
        }
    }

    public e() {
        this(h5.d.f9330s, c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, t.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), u.DOUBLE, u.LAZILY_PARSED_NUMBER);
    }

    e(h5.d dVar, d dVar2, Map<Type, g<?>> map, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, t tVar, String str, int i10, int i11, List<x> list, List<x> list2, List<x> list3, v vVar, v vVar2) {
        boolean z16 = z10;
        boolean z17 = z15;
        this.f7482a = new ThreadLocal<>();
        this.f7483b = new ConcurrentHashMap();
        this.f7487f = dVar;
        this.f7488g = dVar2;
        this.f7489h = map;
        h5.c cVar = new h5.c(map);
        this.f7484c = cVar;
        this.f7490i = z9;
        this.f7491j = z16;
        this.f7492k = z11;
        this.f7493l = z12;
        this.f7494m = z13;
        this.f7495n = z14;
        this.f7496o = z17;
        this.f7500s = tVar;
        this.f7497p = str;
        this.f7498q = i10;
        this.f7499r = i11;
        this.f7501t = list;
        this.f7502u = list2;
        this.f7503v = vVar;
        this.f7504w = vVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(n.V);
        arrayList.add(j.f(vVar));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(n.B);
        arrayList.add(n.f9568m);
        arrayList.add(n.f9562g);
        arrayList.add(n.f9564i);
        arrayList.add(n.f9566k);
        w<Number> n10 = n(tVar);
        arrayList.add(n.b(Long.TYPE, Long.class, n10));
        arrayList.add(n.b(Double.TYPE, Double.class, e(z17)));
        arrayList.add(n.b(Float.TYPE, Float.class, f(z17)));
        arrayList.add(i.f(vVar2));
        arrayList.add(n.f9570o);
        arrayList.add(n.f9572q);
        arrayList.add(n.a(AtomicLong.class, b(n10)));
        arrayList.add(n.a(AtomicLongArray.class, c(n10)));
        arrayList.add(n.f9574s);
        arrayList.add(n.f9579x);
        arrayList.add(n.D);
        arrayList.add(n.F);
        arrayList.add(n.a(BigDecimal.class, n.f9581z));
        arrayList.add(n.a(BigInteger.class, n.A));
        arrayList.add(n.H);
        arrayList.add(n.J);
        arrayList.add(n.N);
        arrayList.add(n.P);
        arrayList.add(n.T);
        arrayList.add(n.L);
        arrayList.add(n.f9559d);
        arrayList.add(i5.c.f9498b);
        arrayList.add(n.R);
        if (l5.d.f11147a) {
            arrayList.add(l5.d.f11151e);
            arrayList.add(l5.d.f11150d);
            arrayList.add(l5.d.f11152f);
        }
        arrayList.add(i5.a.f9492c);
        arrayList.add(n.f9557b);
        arrayList.add(new i5.b(cVar));
        arrayList.add(new h(cVar, z16));
        i5.e eVar = new i5.e(cVar);
        this.f7485d = eVar;
        arrayList.add(eVar);
        arrayList.add(n.W);
        arrayList.add(new k(cVar, dVar2, dVar, eVar));
        this.f7486e = Collections.unmodifiableList(arrayList);
    }

    private static void a(Object obj, n5.a aVar) {
        if (obj != null) {
            try {
                if (aVar.G() != n5.b.END_DOCUMENT) {
                    throw new l("JSON document was not fully consumed.");
                }
            } catch (n5.d e10) {
                throw new s((Throwable) e10);
            } catch (IOException e11) {
                throw new l((Throwable) e11);
            }
        }
    }

    private static w<AtomicLong> b(w<Number> wVar) {
        return new d(wVar).b();
    }

    private static w<AtomicLongArray> c(w<Number> wVar) {
        return new C0100e(wVar).b();
    }

    static void d(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private w<Number> e(boolean z9) {
        return z9 ? n.f9577v : new a();
    }

    private w<Number> f(boolean z9) {
        return z9 ? n.f9576u : new b();
    }

    private static w<Number> n(t tVar) {
        return tVar == t.DEFAULT ? n.f9575t : new c();
    }

    public <T> T g(Reader reader, Type type) {
        n5.a o10 = o(reader);
        T j10 = j(o10, type);
        a(j10, o10);
        return j10;
    }

    public <T> T h(String str, Class<T> cls) {
        return h5.k.b(cls).cast(i(str, cls));
    }

    public <T> T i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return g(new StringReader(str), type);
    }

    public <T> T j(n5.a aVar, Type type) {
        boolean p10 = aVar.p();
        aVar.L(true);
        try {
            aVar.G();
            T c10 = l(m5.a.b(type)).c(aVar);
            aVar.L(p10);
            return c10;
        } catch (EOFException e10) {
            if (1 != 0) {
                aVar.L(p10);
                return null;
            }
            throw new s((Throwable) e10);
        } catch (IllegalStateException e11) {
            throw new s((Throwable) e11);
        } catch (IOException e12) {
            throw new s((Throwable) e12);
        } catch (AssertionError e13) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e13.getMessage());
            assertionError.initCause(e13);
            throw assertionError;
        } catch (Throwable th) {
            aVar.L(p10);
            throw th;
        }
    }

    public <T> w<T> k(Class<T> cls) {
        return l(m5.a.a(cls));
    }

    public <T> w<T> l(m5.a<T> aVar) {
        w<T> wVar = this.f7483b.get(aVar == null ? f7481x : aVar);
        if (wVar != null) {
            return wVar;
        }
        Map map = this.f7482a.get();
        boolean z9 = false;
        if (map == null) {
            map = new HashMap();
            this.f7482a.set(map);
            z9 = true;
        }
        f fVar = (f) map.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            f fVar2 = new f();
            map.put(aVar, fVar2);
            for (x create : this.f7486e) {
                w<T> create2 = create.create(this, aVar);
                if (create2 != null) {
                    fVar2.f(create2);
                    this.f7483b.put(aVar, create2);
                    return create2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z9) {
                this.f7482a.remove();
            }
        }
    }

    public <T> w<T> m(x xVar, m5.a<T> aVar) {
        if (!this.f7486e.contains(xVar)) {
            xVar = this.f7485d;
        }
        boolean z9 = false;
        for (x next : this.f7486e) {
            if (z9) {
                w<T> create = next.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (next == xVar) {
                z9 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public n5.a o(Reader reader) {
        n5.a aVar = new n5.a(reader);
        aVar.L(this.f7495n);
        return aVar;
    }

    public n5.c p(Writer writer) {
        if (this.f7492k) {
            writer.write(")]}'\n");
        }
        n5.c cVar = new n5.c(writer);
        if (this.f7494m) {
            cVar.A("  ");
        }
        cVar.D(this.f7490i);
        return cVar;
    }

    public String q(k kVar) {
        StringWriter stringWriter = new StringWriter();
        t(kVar, stringWriter);
        return stringWriter.toString();
    }

    public String r(Object obj) {
        return obj == null ? q(m.f7529a) : s(obj, obj.getClass());
    }

    public String s(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void t(k kVar, Appendable appendable) {
        try {
            u(kVar, p(l.c(appendable)));
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f7490i + ",factories:" + this.f7486e + ",instanceCreators:" + this.f7484c + "}";
    }

    public void u(k kVar, n5.c cVar) {
        boolean o10 = cVar.o();
        cVar.C(true);
        boolean n10 = cVar.n();
        cVar.z(this.f7493l);
        boolean m10 = cVar.m();
        cVar.D(this.f7490i);
        try {
            l.b(kVar, cVar);
            cVar.C(o10);
            cVar.z(n10);
            cVar.D(m10);
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        } catch (AssertionError e11) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
            assertionError.initCause(e11);
            throw assertionError;
        } catch (Throwable th) {
            cVar.C(o10);
            cVar.z(n10);
            cVar.D(m10);
            throw th;
        }
    }

    public void v(Object obj, Type type, Appendable appendable) {
        try {
            w(obj, type, p(l.c(appendable)));
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        }
    }

    public void w(Object obj, Type type, n5.c cVar) {
        w<?> l10 = l(m5.a.b(type));
        boolean o10 = cVar.o();
        cVar.C(true);
        boolean n10 = cVar.n();
        cVar.z(this.f7493l);
        boolean m10 = cVar.m();
        cVar.D(this.f7490i);
        try {
            l10.e(cVar, obj);
            cVar.C(o10);
            cVar.z(n10);
            cVar.D(m10);
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        } catch (AssertionError e11) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e11.getMessage());
            assertionError.initCause(e11);
            throw assertionError;
        } catch (Throwable th) {
            cVar.C(o10);
            cVar.z(n10);
            cVar.D(m10);
            throw th;
        }
    }
}
