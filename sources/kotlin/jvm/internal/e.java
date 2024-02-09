package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r8.b;
import r8.d;
import r8.f;
import r8.g;
import r8.h;
import r8.i;
import r8.j;
import r8.k;
import r8.l;
import r8.m;
import r8.n;
import r8.o;
import r8.p;
import r8.q;
import r8.r;
import r8.s;
import r8.t;
import r8.u;
import r8.v;
import r8.w;
import x8.c;

public final class e implements c<Object>, d {

    /* renamed from: n  reason: collision with root package name */
    public static final a f11066n = new a((g) null);

    /* renamed from: o  reason: collision with root package name */
    private static final Map<Class<? extends g8.c<?>>, Integer> f11067o;

    /* renamed from: p  reason: collision with root package name */
    private static final HashMap<String, String> f11068p;

    /* renamed from: q  reason: collision with root package name */
    private static final HashMap<String, String> f11069q;

    /* renamed from: r  reason: collision with root package name */
    private static final HashMap<String, String> f11070r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public static final Map<String, String> f11071s;

    /* renamed from: m  reason: collision with root package name */
    private final Class<?> f11072m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            l.e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        l.d(simpleName, "name");
                        String g02 = p.g0(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (g02 != null) {
                            return g02;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    l.d(simpleName, "name");
                    if (enclosingConstructor == null) {
                        return p.f0(simpleName, '$', (String) null, 2, (Object) null);
                    }
                    return p.g0(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) e.f11071s.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) e.f11071s.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        int i10 = 0;
        List e10 = n.e(r8.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, r8.c.class, d.class, r8.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(o.i(e10, 10));
        for (Object next : e10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                n.h();
            }
            arrayList.add(g8.p.a((Class) next, Integer.valueOf(i10)));
            i10 = i11;
        }
        f11067o = f0.k(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f11068p = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f11069q = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l.d(str, "kotlinName");
            sb.append(p.i0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            g8.l a10 = g8.p.a(sb2, str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry next2 : f11067o.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f11070r = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0.a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), p.i0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f11071s = linkedHashMap;
    }

    public e(Class<?> cls) {
        l.e(cls, "jClass");
        this.f11072m = cls;
    }

    public Class<?> a() {
        return this.f11072m;
    }

    public String b() {
        return f11066n.a(a());
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && l.a(q8.a.b(this), q8.a.b((c) obj));
    }

    public int hashCode() {
        return q8.a.b(this).hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
