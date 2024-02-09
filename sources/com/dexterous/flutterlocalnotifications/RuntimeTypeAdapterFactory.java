package com.dexterous.flutterlocalnotifications;

import androidx.annotation.Keep;
import com.google.gson.e;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.w;
import com.google.gson.x;
import h5.l;
import java.util.LinkedHashMap;
import java.util.Map;
import n5.c;

@Keep
public final class RuntimeTypeAdapterFactory<T> implements x {
    /* access modifiers changed from: private */
    public final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final String typeFieldName;

    class a extends w<R> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map f4850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map f4851b;

        a(Map map, Map map2) {
            this.f4850a = map;
            this.f4851b = map2;
        }

        public R c(n5.a aVar) {
            k a10 = l.a(aVar);
            k C = a10.f().C(RuntimeTypeAdapterFactory.this.typeFieldName);
            if (C != null) {
                String i10 = C.i();
                w wVar = (w) this.f4850a.get(i10);
                if (wVar != null) {
                    return wVar.a(a10);
                }
                throw new o("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + i10 + "; did you forget to register a subtype?");
            }
            throw new o("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
        }

        public void e(c cVar, R r9) {
            Class<?> cls = r9.getClass();
            String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
            w wVar = (w) this.f4851b.get(cls);
            if (wVar != null) {
                n f10 = wVar.d(r9).f();
                if (!f10.B(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    n nVar = new n();
                    nVar.z(RuntimeTypeAdapterFactory.this.typeFieldName, new p(str));
                    for (Map.Entry next : f10.A()) {
                        nVar.z((String) next.getKey(), (k) next.getValue());
                    }
                    l.b(nVar, cVar);
                    return;
                }
                throw new o("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }
            throw new o("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
        }
    }

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    public <R> w<R> create(e eVar, m5.a<R> aVar) {
        if (aVar.c() != this.baseType) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next : this.labelToSubtype.entrySet()) {
            w m10 = eVar.m(this, m5.a.a((Class) next.getValue()));
            linkedHashMap.put((String) next.getKey(), m10);
            linkedHashMap2.put((Class) next.getValue(), m10);
        }
        return new a(linkedHashMap, linkedHashMap2).b();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        } else if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.labelToSubtype.put(str, cls);
            this.subtypeToLabel.put(cls, str);
            return this;
        }
    }
}
