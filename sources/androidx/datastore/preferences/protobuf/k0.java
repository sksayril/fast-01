package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t1;

public class k0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final a<K, V> f2013a;

    /* renamed from: b  reason: collision with root package name */
    private final K f2014b;

    /* renamed from: c  reason: collision with root package name */
    private final V f2015c;

    static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final t1.b f2016a;

        /* renamed from: b  reason: collision with root package name */
        public final K f2017b;

        /* renamed from: c  reason: collision with root package name */
        public final t1.b f2018c;

        /* renamed from: d  reason: collision with root package name */
        public final V f2019d;

        public a(t1.b bVar, K k10, t1.b bVar2, V v9) {
            this.f2016a = bVar;
            this.f2017b = k10;
            this.f2018c = bVar2;
            this.f2019d = v9;
        }
    }

    private k0(t1.b bVar, K k10, t1.b bVar2, V v9) {
        this.f2013a = new a<>(bVar, k10, bVar2, v9);
        this.f2014b = k10;
        this.f2015c = v9;
    }

    static <K, V> int b(a<K, V> aVar, K k10, V v9) {
        return u.d(aVar.f2016a, 1, k10) + u.d(aVar.f2018c, 2, v9);
    }

    public static <K, V> k0<K, V> d(t1.b bVar, K k10, t1.b bVar2, V v9) {
        return new k0<>(bVar, k10, bVar2, v9);
    }

    static <K, V> void e(k kVar, a<K, V> aVar, K k10, V v9) {
        u.z(kVar, aVar.f2016a, 1, k10);
        u.z(kVar, aVar.f2018c, 2, v9);
    }

    public int a(int i10, K k10, V v9) {
        return k.V(i10) + k.C(b(this.f2013a, k10, v9));
    }

    /* access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.f2013a;
    }
}
