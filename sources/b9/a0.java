package b9;

import g8.s;
import r8.l;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3427a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, s> f3428b;

    public a0(Object obj, l<? super Throwable, s> lVar) {
        this.f3427a = obj;
        this.f3428b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.l.a(this.f3427a, a0Var.f3427a) && kotlin.jvm.internal.l.a(this.f3428b, a0Var.f3428b);
    }

    public int hashCode() {
        Object obj = this.f3427a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f3428b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f3427a + ", onCancellation=" + this.f3428b + ')';
    }
}
