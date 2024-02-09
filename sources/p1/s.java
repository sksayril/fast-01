package p1;

import n1.b;
import n1.c;
import n1.e;
import n1.f;
import n1.h;

final class s<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final p f11840a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11841b;

    /* renamed from: c  reason: collision with root package name */
    private final b f11842c;

    /* renamed from: d  reason: collision with root package name */
    private final e<T, byte[]> f11843d;

    /* renamed from: e  reason: collision with root package name */
    private final t f11844e;

    s(p pVar, String str, b bVar, e<T, byte[]> eVar, t tVar) {
        this.f11840a = pVar;
        this.f11841b = str;
        this.f11842c = bVar;
        this.f11843d = eVar;
        this.f11844e = tVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(Exception exc) {
    }

    public void a(c<T> cVar, h hVar) {
        this.f11844e.a(o.a().e(this.f11840a).c(cVar).f(this.f11841b).d(this.f11843d).b(this.f11842c).a(), hVar);
    }

    public void b(c<T> cVar) {
        a(cVar, r.f11839a);
    }

    /* access modifiers changed from: package-private */
    public p d() {
        return this.f11840a;
    }
}
