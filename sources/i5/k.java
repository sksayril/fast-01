package i5;

import com.google.gson.d;
import com.google.gson.e;
import com.google.gson.s;
import com.google.gson.w;
import com.google.gson.x;
import h5.i;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class k implements x {

    /* renamed from: m  reason: collision with root package name */
    private final h5.c f9523m;

    /* renamed from: n  reason: collision with root package name */
    private final d f9524n;

    /* renamed from: o  reason: collision with root package name */
    private final h5.d f9525o;

    /* renamed from: p  reason: collision with root package name */
    private final e f9526p;

    /* renamed from: q  reason: collision with root package name */
    private final k5.b f9527q = k5.b.a();

    class a extends c {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Field f9528d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f9529e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w f9530f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ e f9531g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ m5.a f9532h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f9533i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, boolean z9, boolean z10, Field field, boolean z11, w wVar, e eVar, m5.a aVar, boolean z12) {
            super(str, z9, z10);
            this.f9528d = field;
            this.f9529e = z11;
            this.f9530f = wVar;
            this.f9531g = eVar;
            this.f9532h = aVar;
            this.f9533i = z12;
        }

        /* access modifiers changed from: package-private */
        public void a(n5.a aVar, Object obj) {
            Object c10 = this.f9530f.c(aVar);
            if (c10 != null || !this.f9533i) {
                this.f9528d.set(obj, c10);
            }
        }

        /* access modifiers changed from: package-private */
        public void b(n5.c cVar, Object obj) {
            (this.f9529e ? this.f9530f : new m(this.f9531g, this.f9530f, this.f9532h.e())).e(cVar, this.f9528d.get(obj));
        }

        public boolean c(Object obj) {
            return this.f9538b && this.f9528d.get(obj) != obj;
        }
    }

    public static final class b<T> extends w<T> {

        /* renamed from: a  reason: collision with root package name */
        private final i<T> f9535a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<String, c> f9536b;

        b(i<T> iVar, Map<String, c> map) {
            this.f9535a = iVar;
            this.f9536b = map;
        }

        public T c(n5.a aVar) {
            if (aVar.G() == n5.b.NULL) {
                aVar.C();
                return null;
            }
            T a10 = this.f9535a.a();
            try {
                aVar.b();
                while (aVar.o()) {
                    c cVar = this.f9536b.get(aVar.z());
                    if (cVar != null) {
                        if (cVar.f9539c) {
                            cVar.a(aVar, a10);
                        }
                    }
                    aVar.Q();
                }
                aVar.l();
                return a10;
            } catch (IllegalStateException e10) {
                throw new s((Throwable) e10);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public void e(n5.c cVar, T t9) {
            if (t9 == null) {
                cVar.r();
                return;
            }
            cVar.g();
            try {
                for (c next : this.f9536b.values()) {
                    if (next.c(t9)) {
                        cVar.p(next.f9537a);
                        next.b(cVar, t9);
                    }
                }
                cVar.l();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        final String f9537a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f9538b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f9539c;

        protected c(String str, boolean z9, boolean z10) {
            this.f9537a = str;
            this.f9538b = z9;
            this.f9539c = z10;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(n5.a aVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract void b(n5.c cVar, Object obj);

        /* access modifiers changed from: package-private */
        public abstract boolean c(Object obj);
    }

    public k(h5.c cVar, d dVar, h5.d dVar2, e eVar) {
        this.f9523m = cVar;
        this.f9524n = dVar;
        this.f9525o = dVar2;
        this.f9526p = eVar;
    }

    private c a(e eVar, Field field, String str, m5.a<?> aVar, boolean z9, boolean z10) {
        e eVar2 = eVar;
        m5.a<?> aVar2 = aVar;
        boolean a10 = h5.k.a(aVar.c());
        Field field2 = field;
        g5.b bVar = (g5.b) field.getAnnotation(g5.b.class);
        w<?> a11 = bVar != null ? this.f9526p.a(this.f9523m, eVar, aVar2, bVar) : null;
        boolean z11 = a11 != null;
        if (a11 == null) {
            a11 = eVar.l(aVar2);
        }
        return new a(str, z9, z10, field, z11, a11, eVar, aVar, a10);
    }

    static boolean c(Field field, boolean z9, h5.d dVar) {
        return !dVar.d(field.getType(), z9) && !dVar.h(field, z9);
    }

    private Map<String, c> d(e eVar, m5.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e10 = aVar.e();
        m5.a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z9 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean b10 = b(field, true);
                boolean b11 = b(field, z9);
                if (b10 || b11) {
                    this.f9527q.b(field);
                    Type p10 = h5.b.p(aVar2.e(), cls2, field.getGenericType());
                    List<String> e11 = e(field);
                    int size = e11.size();
                    c cVar = null;
                    int i11 = 0;
                    while (i11 < size) {
                        String str = e11.get(i11);
                        boolean z10 = i11 != 0 ? false : b10;
                        String str2 = str;
                        int i12 = i11;
                        c cVar2 = cVar;
                        int i13 = size;
                        List<String> list = e11;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str2, a(eVar, field, str2, m5.a.b(p10), z10, b11)) : cVar2;
                        i11 = i12 + 1;
                        b10 = z10;
                        e11 = list;
                        size = i13;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(e10 + " declares multiple JSON fields named " + cVar3.f9537a);
                    }
                }
                i10++;
                z9 = false;
            }
            aVar2 = m5.a.b(h5.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    private List<String> e(Field field) {
        g5.c cVar = (g5.c) field.getAnnotation(g5.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f9524n.translateName(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public boolean b(Field field, boolean z9) {
        return c(field, z9, this.f9525o);
    }

    public <T> w<T> create(e eVar, m5.a<T> aVar) {
        Class<? super T> c10 = aVar.c();
        if (!Object.class.isAssignableFrom(c10)) {
            return null;
        }
        return new b(this.f9523m.a(aVar), d(eVar, aVar, c10));
    }
}
