package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
final class a {

    /* renamed from: c  reason: collision with root package name */
    static a f2726c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, C0049a> f2727a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Boolean> f2728b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    static class C0049a {

        /* renamed from: a  reason: collision with root package name */
        final Map<g.a, List<b>> f2729a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        final Map<b, g.a> f2730b;

        C0049a(Map<b, g.a> map) {
            this.f2730b = map;
            for (Map.Entry next : map.entrySet()) {
                g.a aVar = (g.a) next.getValue();
                List list = this.f2729a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f2729a.put(aVar, list);
                }
                list.add((b) next.getKey());
            }
        }

        private static void b(List<b> list, l lVar, g.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(lVar, aVar, obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(l lVar, g.a aVar, Object obj) {
            b(this.f2729a.get(aVar), lVar, aVar, obj);
            b(this.f2729a.get(g.a.ON_ANY), lVar, aVar, obj);
        }
    }

    @Deprecated
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f2731a;

        /* renamed from: b  reason: collision with root package name */
        final Method f2732b;

        b(int i10, Method method) {
            this.f2731a = i10;
            this.f2732b = method;
            method.setAccessible(true);
        }

        /* access modifiers changed from: package-private */
        public void a(l lVar, g.a aVar, Object obj) {
            try {
                int i10 = this.f2731a;
                if (i10 == 0) {
                    this.f2732b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f2732b.invoke(obj, new Object[]{lVar});
                } else if (i10 == 2) {
                    this.f2732b.invoke(obj, new Object[]{lVar, aVar});
                }
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to call observer method", e10.getCause());
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2731a == bVar.f2731a && this.f2732b.getName().equals(bVar.f2732b.getName());
        }

        public int hashCode() {
            return (this.f2731a * 31) + this.f2732b.getName().hashCode();
        }
    }

    a() {
    }

    private C0049a a(Class<?> cls, Method[] methodArr) {
        int i10;
        C0049a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (c10 = c(superclass)) == null)) {
            hashMap.putAll(c10.f2730b);
        }
        for (Class c11 : cls.getInterfaces()) {
            for (Map.Entry next : c(c11).f2730b.entrySet()) {
                e(hashMap, (b) next.getKey(), (g.a) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z9 = false;
        for (Method method : methodArr) {
            s sVar = (s) method.getAnnotation(s.class);
            if (sVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else if (l.class.isAssignableFrom(parameterTypes[0])) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                g.a value = sVar.value();
                if (parameterTypes.length > 1) {
                    if (!g.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == g.a.ON_ANY) {
                        i10 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    e(hashMap, new b(i10, method), value, cls);
                    z9 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0049a aVar = new C0049a(hashMap);
        this.f2727a.put(cls, aVar);
        this.f2728b.put(cls, Boolean.valueOf(z9));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<b, g.a> map, b bVar, g.a aVar, Class<?> cls) {
        g.a aVar2 = map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f2732b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public C0049a c(Class<?> cls) {
        C0049a aVar = this.f2727a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    /* access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f2728b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method annotation : b10) {
            if (((s) annotation.getAnnotation(s.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f2728b.put(cls, Boolean.FALSE);
        return false;
    }
}
