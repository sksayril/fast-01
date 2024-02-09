package p1;

import java.util.Set;
import n1.b;
import n1.e;
import n1.f;
import n1.g;

final class q implements g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f11836a;

    /* renamed from: b  reason: collision with root package name */
    private final p f11837b;

    /* renamed from: c  reason: collision with root package name */
    private final t f11838c;

    q(Set<b> set, p pVar, t tVar) {
        this.f11836a = set;
        this.f11837b = pVar;
        this.f11838c = tVar;
    }

    public <T> f<T> a(String str, Class<T> cls, b bVar, e<T, byte[]> eVar) {
        if (this.f11836a.contains(bVar)) {
            return new s(this.f11837b, str, bVar, eVar, this.f11838c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f11836a}));
    }
}
