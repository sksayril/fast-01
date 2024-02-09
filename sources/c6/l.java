package c6;

import java.util.Map;
import o5.a;
import o5.c;
import o5.e;
import o5.f;
import o5.n;

public final class l extends p {

    /* renamed from: i  reason: collision with root package name */
    private final p f3839i = new e();

    private static n t(n nVar) {
        String f10 = nVar.f();
        if (f10.charAt(0) == '0') {
            n nVar2 = new n(f10.substring(1), (byte[]) null, nVar.e(), a.UPC_A);
            if (nVar.d() != null) {
                nVar2.g(nVar.d());
            }
            return nVar2;
        }
        throw f.a();
    }

    public n a(int i10, u5.a aVar, Map<e, ?> map) {
        return t(this.f3839i.a(i10, aVar, map));
    }

    public n d(c cVar, Map<e, ?> map) {
        return t(this.f3839i.d(cVar, map));
    }

    public n e(c cVar) {
        return t(this.f3839i.e(cVar));
    }

    /* access modifiers changed from: protected */
    public int m(u5.a aVar, int[] iArr, StringBuilder sb) {
        return this.f3839i.m(aVar, iArr, sb);
    }

    public n n(int i10, u5.a aVar, int[] iArr, Map<e, ?> map) {
        return t(this.f3839i.n(i10, aVar, iArr, map));
    }

    /* access modifiers changed from: package-private */
    public a r() {
        return a.UPC_A;
    }
}
