package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t0.b;
import t0.c;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f3233d;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f3234e = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Map<Class<?>, Object> f3235a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final Set<Class<? extends t0.a<?>>> f3236b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    final Context f3237c;

    a(Context context) {
        this.f3237c = context.getApplicationContext();
    }

    private <T> T d(Class<? extends t0.a<?>> cls, Set<Class<?>> set) {
        T t9;
        if (u0.a.h()) {
            try {
                u0.a.c(cls.getSimpleName());
            } catch (Throwable th) {
                u0.a.f();
                throw th;
            }
        }
        if (!set.contains(cls)) {
            if (!this.f3235a.containsKey(cls)) {
                set.add(cls);
                t0.a aVar = (t0.a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends t0.a<?>>> a10 = aVar.a();
                if (!a10.isEmpty()) {
                    for (Class next : a10) {
                        if (!this.f3235a.containsKey(next)) {
                            d(next, set);
                        }
                    }
                }
                t9 = aVar.b(this.f3237c);
                set.remove(cls);
                this.f3235a.put(cls, t9);
            } else {
                t9 = this.f3235a.get(cls);
            }
            u0.a.f();
            return t9;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
    }

    public static a e(Context context) {
        if (f3233d == null) {
            synchronized (f3234e) {
                if (f3233d == null) {
                    f3233d = new a(context);
                }
            }
        }
        return f3233d;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        try {
            u0.a.c("Startup");
            b(this.f3237c.getPackageManager().getProviderInfo(new ComponentName(this.f3237c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            u0.a.f();
        } catch (PackageManager.NameNotFoundException e10) {
            throw new c((Throwable) e10);
        } catch (Throwable th) {
            u0.a.f();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Bundle bundle) {
        String string = this.f3237c.getString(b.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (t0.a.class.isAssignableFrom(cls)) {
                            this.f3236b.add(cls);
                        }
                    }
                }
                for (Class<? extends t0.a<?>> d10 : this.f3236b) {
                    d(d10, hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new c((Throwable) e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public <T> T c(Class<? extends t0.a<?>> cls) {
        T t9;
        synchronized (f3234e) {
            t9 = this.f3235a.get(cls);
            if (t9 == null) {
                t9 = d(cls, new HashSet());
            }
        }
        return t9;
    }

    public <T> T f(Class<? extends t0.a<T>> cls) {
        return c(cls);
    }

    public boolean g(Class<? extends t0.a<?>> cls) {
        return this.f3236b.contains(cls);
    }
}
