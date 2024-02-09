package g8;

import java.io.Serializable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import r8.a;

final class o<T> implements g<T>, Serializable {

    /* renamed from: m  reason: collision with root package name */
    private a<? extends T> f8972m;

    /* renamed from: n  reason: collision with root package name */
    private volatile Object f8973n;

    /* renamed from: o  reason: collision with root package name */
    private final Object f8974o;

    public o(a<? extends T> aVar, Object obj) {
        l.e(aVar, "initializer");
        this.f8972m = aVar;
        this.f8973n = q.f8975a;
        this.f8974o = obj == null ? this : obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a aVar, Object obj, int i10, g gVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f8973n != q.f8975a;
    }

    public T getValue() {
        T t9;
        T t10 = this.f8973n;
        T t11 = q.f8975a;
        if (t10 != t11) {
            return t10;
        }
        synchronized (this.f8974o) {
            t9 = this.f8973n;
            if (t9 == t11) {
                a aVar = this.f8972m;
                l.b(aVar);
                t9 = aVar.invoke();
                this.f8973n = t9;
                this.f8972m = null;
            }
        }
        return t9;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
