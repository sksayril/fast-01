package b9;

import g8.s;
import kotlin.jvm.internal.g;
import r8.l;

final class y {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3500a;

    /* renamed from: b  reason: collision with root package name */
    public final j f3501b;

    /* renamed from: c  reason: collision with root package name */
    public final l<Throwable, s> f3502c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3503d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f3504e;

    public y(Object obj, j jVar, l<? super Throwable, s> lVar, Object obj2, Throwable th) {
        this.f3500a = obj;
        this.f3501b = jVar;
        this.f3502c = lVar;
        this.f3503d = obj2;
        this.f3504e = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(Object obj, j jVar, l lVar, Object obj2, Throwable th, int i10, g gVar) {
        this(obj, (i10 & 2) != 0 ? null : jVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ y b(y yVar, Object obj, j jVar, l<Throwable, s> lVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = yVar.f3500a;
        }
        if ((i10 & 2) != 0) {
            jVar = yVar.f3501b;
        }
        j jVar2 = jVar;
        if ((i10 & 4) != 0) {
            lVar = yVar.f3502c;
        }
        l<Throwable, s> lVar2 = lVar;
        if ((i10 & 8) != 0) {
            obj2 = yVar.f3503d;
        }
        Object obj4 = obj2;
        if ((i10 & 16) != 0) {
            th = yVar.f3504e;
        }
        return yVar.a(obj, jVar2, lVar2, obj4, th);
    }

    public final y a(Object obj, j jVar, l<? super Throwable, s> lVar, Object obj2, Throwable th) {
        return new y(obj, jVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f3504e != null;
    }

    public final void d(m<?> mVar, Throwable th) {
        j jVar = this.f3501b;
        if (jVar != null) {
            mVar.m(jVar, th);
        }
        l<Throwable, s> lVar = this.f3502c;
        if (lVar != null) {
            mVar.o(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.l.a(this.f3500a, yVar.f3500a) && kotlin.jvm.internal.l.a(this.f3501b, yVar.f3501b) && kotlin.jvm.internal.l.a(this.f3502c, yVar.f3502c) && kotlin.jvm.internal.l.a(this.f3503d, yVar.f3503d) && kotlin.jvm.internal.l.a(this.f3504e, yVar.f3504e);
    }

    public int hashCode() {
        Object obj = this.f3500a;
        int i10 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        j jVar = this.f3501b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        l<Throwable, s> lVar = this.f3502c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f3503d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3504e;
        if (th != null) {
            i10 = th.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f3500a + ", cancelHandler=" + this.f3501b + ", onCancellation=" + this.f3502c + ", idempotentResume=" + this.f3503d + ", cancelCause=" + this.f3504e + ')';
    }
}
