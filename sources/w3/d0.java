package w3;

import s4.a;
import s4.b;

class d0<T> implements b<T>, a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final a.C0209a<Object> f12887c = b0.f12871a;

    /* renamed from: d  reason: collision with root package name */
    private static final b<Object> f12888d = c0.f12886a;

    /* renamed from: a  reason: collision with root package name */
    private a.C0209a<T> f12889a;

    /* renamed from: b  reason: collision with root package name */
    private volatile b<T> f12890b;

    private d0(a.C0209a<T> aVar, b<T> bVar) {
        this.f12889a = aVar;
        this.f12890b = bVar;
    }

    static <T> d0<T> e() {
        return new d0<>(f12887c, f12888d);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(b bVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(a.C0209a aVar, a.C0209a aVar2, b bVar) {
        aVar.a(bVar);
        aVar2.a(bVar);
    }

    static <T> d0<T> i(b<T> bVar) {
        return new d0<>((a.C0209a) null, bVar);
    }

    public void a(a.C0209a<T> aVar) {
        b<T> bVar;
        b<T> bVar2 = this.f12890b;
        b<Object> bVar3 = f12888d;
        if (bVar2 != bVar3) {
            aVar.a(bVar2);
            return;
        }
        b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f12890b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                this.f12889a = new a0(this.f12889a, aVar);
            }
        }
        if (bVar4 != null) {
            aVar.a(bVar);
        }
    }

    public T get() {
        return this.f12890b.get();
    }

    /* access modifiers changed from: package-private */
    public void j(b<T> bVar) {
        a.C0209a<T> aVar;
        if (this.f12890b == f12888d) {
            synchronized (this) {
                aVar = this.f12889a;
                this.f12889a = null;
                this.f12890b = bVar;
            }
            aVar.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
