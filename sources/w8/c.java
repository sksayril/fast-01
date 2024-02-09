package w8;

import kotlin.jvm.internal.g;

public final class c extends a {

    /* renamed from: q  reason: collision with root package name */
    public static final a f13010q = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public static final c f13011r = new c(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a() {
            return c.f13011r;
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (!(c() == cVar.c() && d() == cVar.d())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c() * 31) + d();
    }

    public boolean isEmpty() {
        return c() > d();
    }

    public boolean k(int i10) {
        return c() <= i10 && i10 <= d();
    }

    public Integer l() {
        return Integer.valueOf(d());
    }

    public Integer o() {
        return Integer.valueOf(c());
    }

    public String toString() {
        return c() + ".." + d();
    }
}
