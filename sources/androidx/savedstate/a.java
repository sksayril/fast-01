package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g;
import s0.d;

@SuppressLint({"RestrictedApi"})
public final class a {

    /* renamed from: g  reason: collision with root package name */
    private static final b f3226g = new b((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final m.b<String, c> f3227a = new m.b<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f3228b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f3229c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3230d;

    /* renamed from: e  reason: collision with root package name */
    private Recreator.b f3231e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f3232f = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    public interface C0063a {
        void a(d dVar);
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public interface c {
        Bundle a();
    }

    /* access modifiers changed from: private */
    public static final void d(a aVar, l lVar, g.a aVar2) {
        boolean z9;
        kotlin.jvm.internal.l.e(aVar, "this$0");
        kotlin.jvm.internal.l.e(lVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.l.e(aVar2, "event");
        if (aVar2 == g.a.ON_START) {
            z9 = true;
        } else if (aVar2 == g.a.ON_STOP) {
            z9 = false;
        } else {
            return;
        }
        aVar.f3232f = z9;
    }

    public final Bundle b(String str) {
        kotlin.jvm.internal.l.e(str, "key");
        if (this.f3230d) {
            Bundle bundle = this.f3229c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f3229c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f3229c;
            boolean z9 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z9 = true;
            }
            if (!z9) {
                this.f3229c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final c c(String str) {
        kotlin.jvm.internal.l.e(str, "key");
        Iterator<Map.Entry<String, c>> it = this.f3227a.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            kotlin.jvm.internal.l.d(next, "components");
            c cVar = (c) next.getValue();
            if (kotlin.jvm.internal.l.a((String) next.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(androidx.lifecycle.g gVar) {
        kotlin.jvm.internal.l.e(gVar, "lifecycle");
        if (!this.f3228b) {
            gVar.a(new s0.b(this));
            this.f3228b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void f(Bundle bundle) {
        if (!this.f3228b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f3230d) {
            this.f3229c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f3230d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    public final void g(Bundle bundle) {
        kotlin.jvm.internal.l.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f3229c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        m.b<K, V>.d f10 = this.f3227a.f();
        kotlin.jvm.internal.l.d(f10, "this.components.iteratorWithAdditions()");
        while (f10.hasNext()) {
            Map.Entry entry = (Map.Entry) f10.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, c cVar) {
        kotlin.jvm.internal.l.e(str, "key");
        kotlin.jvm.internal.l.e(cVar, "provider");
        if (!(this.f3227a.k(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class<? extends C0063a> cls) {
        kotlin.jvm.internal.l.e(cls, "clazz");
        if (this.f3232f) {
            Recreator.b bVar = this.f3231e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f3231e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.f3231e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    kotlin.jvm.internal.l.d(name, "clazz.name");
                    bVar2.b(name);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
