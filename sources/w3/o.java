package w3;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import q4.c;
import q4.d;

public class o implements e, l4.a {

    /* renamed from: i  reason: collision with root package name */
    private static final s4.b<Set<Object>> f12915i = n.f12914a;

    /* renamed from: a  reason: collision with root package name */
    private final Map<c<?>, s4.b<?>> f12916a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<f0<?>, s4.b<?>> f12917b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<f0<?>, y<?>> f12918c;

    /* renamed from: d  reason: collision with root package name */
    private final List<s4.b<ComponentRegistrar>> f12919d;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f12920e;

    /* renamed from: f  reason: collision with root package name */
    private final v f12921f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference<Boolean> f12922g;

    /* renamed from: h  reason: collision with root package name */
    private final j f12923h;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Executor f12924a;

        /* renamed from: b  reason: collision with root package name */
        private final List<s4.b<ComponentRegistrar>> f12925b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final List<c<?>> f12926c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        private j f12927d = j.f12907a;

        b(Executor executor) {
            this.f12924a = executor;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(c<?> cVar) {
            this.f12926c.add(cVar);
            return this;
        }

        public b c(ComponentRegistrar componentRegistrar) {
            this.f12925b.add(new p(componentRegistrar));
            return this;
        }

        public b d(Collection<s4.b<ComponentRegistrar>> collection) {
            this.f12925b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f12924a, this.f12925b, this.f12926c, this.f12927d);
        }

        public b g(j jVar) {
            this.f12927d = jVar;
            return this;
        }
    }

    private o(Executor executor, Iterable<s4.b<ComponentRegistrar>> iterable, Collection<c<?>> collection, j jVar) {
        this.f12916a = new HashMap();
        this.f12917b = new HashMap();
        this.f12918c = new HashMap();
        this.f12920e = new HashSet();
        this.f12922g = new AtomicReference<>();
        v vVar = new v(executor);
        this.f12921f = vVar;
        this.f12923h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c.s(vVar, v.class, d.class, c.class));
        arrayList.add(c.s(this, l4.a.class, new Class[0]));
        for (c next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f12919d = q(iterable);
        n(arrayList);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    private void n(List<c<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<s4.b<ComponentRegistrar>> it = this.f12919d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f12923h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    Object obj = array[i10];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f12920e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f12920e.add(obj.toString());
                    }
                    i10++;
                }
            }
            if (this.f12916a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f12916a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            for (c next : list) {
                this.f12916a.put(next, new x(new m(this, next)));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        u();
    }

    private void o(Map<c<?>, s4.b<?>> map, boolean z9) {
        for (Map.Entry next : map.entrySet()) {
            c cVar = (c) next.getKey();
            s4.b bVar = (s4.b) next.getValue();
            if (cVar.n() || (cVar.o() && z9)) {
                bVar.get();
            }
        }
        this.f12921f.d();
    }

    private static <T> List<T> q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object r(c cVar) {
        return cVar.h().a(new g0(cVar, this));
    }

    private void u() {
        Boolean bool = this.f12922g.get();
        if (bool != null) {
            o(this.f12916a, bool.booleanValue());
        }
    }

    private void v() {
        Map map;
        f0<?> c10;
        Object e10;
        for (c next : this.f12916a.keySet()) {
            Iterator<r> it = next.g().iterator();
            while (true) {
                if (it.hasNext()) {
                    r next2 = it.next();
                    if (next2.g() && !this.f12918c.containsKey(next2.c())) {
                        map = this.f12918c;
                        c10 = next2.c();
                        e10 = y.b(Collections.emptySet());
                    } else if (this.f12917b.containsKey(next2.c())) {
                        continue;
                    } else if (next2.f()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.c()}));
                    } else if (!next2.g()) {
                        map = this.f12917b;
                        c10 = next2.c();
                        e10 = d0.e();
                    }
                    map.put(c10, e10);
                }
            }
        }
    }

    private List<Runnable> w(List<c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (c next : list) {
            if (next.p()) {
                s4.b bVar = this.f12916a.get(next);
                for (f0 f0Var : next.j()) {
                    if (!this.f12917b.containsKey(f0Var)) {
                        this.f12917b.put(f0Var, bVar);
                    } else {
                        arrayList.add(new l((d0) this.f12917b.get(f0Var), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f12916a.entrySet()) {
            c cVar = (c) next.getKey();
            if (!cVar.p()) {
                s4.b bVar = (s4.b) next.getValue();
                for (f0 f0Var : cVar.j()) {
                    if (!hashMap.containsKey(f0Var)) {
                        hashMap.put(f0Var, new HashSet());
                    }
                    ((Set) hashMap.get(f0Var)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f12918c.containsKey(entry.getKey())) {
                this.f12918c.put((f0) entry.getKey(), y.b((Collection) entry.getValue()));
            } else {
                y yVar = this.f12918c.get(entry.getKey());
                for (s4.b kVar : (Set) entry.getValue()) {
                    arrayList.add(new k(yVar, kVar));
                }
            }
        }
        return arrayList;
    }

    public /* synthetic */ Object a(Class cls) {
        return d.a(this, cls);
    }

    public <T> s4.a<T> b(f0<T> f0Var) {
        s4.b<T> h10 = h(f0Var);
        return h10 == null ? d0.e() : h10 instanceof d0 ? (d0) h10 : d0.i(h10);
    }

    public /* synthetic */ Set c(Class cls) {
        return d.e(this, cls);
    }

    public synchronized <T> s4.b<Set<T>> d(f0<T> f0Var) {
        y yVar = this.f12918c.get(f0Var);
        if (yVar != null) {
            return yVar;
        }
        return f12915i;
    }

    public /* synthetic */ s4.b e(Class cls) {
        return d.d(this, cls);
    }

    public /* synthetic */ Set f(f0 f0Var) {
        return d.f(this, f0Var);
    }

    public /* synthetic */ Object g(f0 f0Var) {
        return d.b(this, f0Var);
    }

    public synchronized <T> s4.b<T> h(f0<T> f0Var) {
        e0.c(f0Var, "Null interface requested.");
        return this.f12917b.get(f0Var);
    }

    public /* synthetic */ s4.a i(Class cls) {
        return d.c(this, cls);
    }

    public void p(boolean z9) {
        HashMap hashMap;
        if (this.f12922g.compareAndSet((Object) null, Boolean.valueOf(z9))) {
            synchronized (this) {
                hashMap = new HashMap(this.f12916a);
            }
            o(hashMap, z9);
        }
    }
}
