package c0;

import c0.d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import r8.l;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<d.a<?>, Object> f3537a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f3538b;

    /* renamed from: c0.a$a  reason: collision with other inner class name */
    static final class C0076a extends m implements l<Map.Entry<d.a<?>, Object>, CharSequence> {

        /* renamed from: m  reason: collision with root package name */
        public static final C0076a f3539m = new C0076a();

        C0076a() {
            super(1);
        }

        /* renamed from: b */
        public final CharSequence invoke(Map.Entry<d.a<?>, Object> entry) {
            kotlin.jvm.internal.l.e(entry, "entry");
            return "  " + entry.getKey().a() + " = " + entry.getValue();
        }
    }

    public a() {
        this((Map) null, false, 3, (g) null);
    }

    public a(Map<d.a<?>, Object> map, boolean z9) {
        kotlin.jvm.internal.l.e(map, "preferencesMap");
        this.f3537a = map;
        this.f3538b = new AtomicBoolean(z9);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Map map, boolean z9, int i10, g gVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z9);
    }

    public Map<d.a<?>, Object> a() {
        Map<d.a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f3537a);
        kotlin.jvm.internal.l.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    public <T> T b(d.a<T> aVar) {
        kotlin.jvm.internal.l.e(aVar, "key");
        return this.f3537a.get(aVar);
    }

    public final void e() {
        if (!(!this.f3538b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return kotlin.jvm.internal.l.a(this.f3537a, ((a) obj).f3537a);
        }
        return false;
    }

    public final void f() {
        this.f3538b.set(true);
    }

    public final void g(d.b<?>... bVarArr) {
        kotlin.jvm.internal.l.e(bVarArr, "pairs");
        e();
        for (d.b<?> bVar : bVarArr) {
            j(bVar.a(), bVar.b());
        }
    }

    public final <T> T h(d.a<T> aVar) {
        kotlin.jvm.internal.l.e(aVar, "key");
        e();
        return this.f3537a.remove(aVar);
    }

    public int hashCode() {
        return this.f3537a.hashCode();
    }

    public final <T> void i(d.a<T> aVar, T t9) {
        kotlin.jvm.internal.l.e(aVar, "key");
        j(aVar, t9);
    }

    public final void j(d.a<?> aVar, Object obj) {
        Map<d.a<?>, Object> map;
        kotlin.jvm.internal.l.e(aVar, "key");
        e();
        if (obj == null) {
            h(aVar);
            return;
        }
        if (obj instanceof Set) {
            map = this.f3537a;
            obj = Collections.unmodifiableSet(v.D((Iterable) obj));
            kotlin.jvm.internal.l.d(obj, "unmodifiableSet(value.toSet())");
        } else {
            map = this.f3537a;
        }
        map.put(aVar, obj);
    }

    public String toString() {
        return v.r(this.f3537a.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, C0076a.f3539m, 24, (Object) null);
    }
}
