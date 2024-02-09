package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.savedstate.a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import s0.d;

public final class Recreator implements j {

    /* renamed from: n  reason: collision with root package name */
    public static final a f3223n = new a((g) null);

    /* renamed from: m  reason: collision with root package name */
    private final d f3224m;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b implements a.c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<String> f3225a = new LinkedHashSet();

        public b(a aVar) {
            l.e(aVar, "registry");
            aVar.h("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f3225a));
            return bundle;
        }

        public final void b(String str) {
            l.e(str, "className");
            this.f3225a.add(str);
        }
    }

    public Recreator(d dVar) {
        l.e(dVar, "owner");
        this.f3224m = dVar;
    }

    private final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(a.C0063a.class);
            l.d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    l.d(newInstance, "{\n                constr…wInstance()\n            }");
                    ((a.C0063a) newInstance).a(this.f3224m);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    public void h(androidx.lifecycle.l lVar, g.a aVar) {
        l.e(lVar, "source");
        l.e(aVar, "event");
        if (aVar == g.a.ON_CREATE) {
            lVar.a().c(this);
            Bundle b10 = this.f3224m.k().b("androidx.savedstate.Restarter");
            if (b10 != null) {
                ArrayList<String> stringArrayList = b10.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String a10 : stringArrayList) {
                        a(a10);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
