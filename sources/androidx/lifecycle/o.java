package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f2765a = new o();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<Class<?>, Integer> f2766b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, List<Constructor<? extends d>>> f2767c = new HashMap();

    private o() {
    }

    private final d a(Constructor<? extends d> constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            l.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (d) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends d> b(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            l.d(name, "fullPackage");
            if (!(name.length() == 0)) {
                l.d(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                l.d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            l.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(canonicalName);
            if (!(name.length() == 0)) {
                c10 = name + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            l.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String str) {
        l.e(str, "className");
        return o.p(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f2766b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && k.class.isAssignableFrom(cls);
    }

    public static final j f(Object obj) {
        l.e(obj, "object");
        boolean z9 = obj instanceof j;
        boolean z10 = obj instanceof DefaultLifecycleObserver;
        if (z9 && z10) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (j) obj);
        }
        if (z10) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) obj, (j) null);
        }
        if (z9) {
            return (j) obj;
        }
        Class<?> cls = obj.getClass();
        o oVar = f2765a;
        if (oVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends d>> list = f2767c.get(cls);
        l.b(list);
        List list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(oVar.a((Constructor) list2.get(0), obj));
        }
        int size = list2.size();
        d[] dVarArr = new d[size];
        for (int i10 = 0; i10 < size; i10++) {
            dVarArr[i10] = f2765a.a((Constructor) list2.get(i10), obj);
        }
        return new CompositeGeneratedAdaptersObserver(dVarArr);
    }

    private final int g(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends d> b10 = b(cls);
        if (b10 != null) {
            f2767c.put(cls, m.b(b10));
            return 2;
        } else if (a.f2726c.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (e(superclass)) {
                l.d(superclass, "superclass");
                if (d(superclass) == 1) {
                    return 1;
                }
                List<Constructor<? extends d>> list = f2767c.get(superclass);
                l.b(list);
                arrayList = new ArrayList(list);
            }
            Class[] interfaces = cls.getInterfaces();
            l.d(interfaces, "klass.interfaces");
            for (Class cls2 : interfaces) {
                if (e(cls2)) {
                    l.d(cls2, "intrface");
                    if (d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    List<Constructor<? extends d>> list2 = f2767c.get(cls2);
                    l.b(list2);
                    arrayList.addAll(list2);
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f2767c.put(cls, arrayList);
            return 2;
        }
    }
}
