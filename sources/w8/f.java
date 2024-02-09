package w8;

import kotlin.jvm.internal.g;

public final class f extends d {

    /* renamed from: q  reason: collision with root package name */
    public static final a f13020q = new a((g) null);

    /* renamed from: r  reason: collision with root package name */
    private static final f f13021r = new f(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public f(long j10, long j11) {
        super(j10, j11, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (!(c() == fVar.c() && d() == fVar.d())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean g(long j10) {
        return c() <= j10 && j10 <= d();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (c() ^ (c() >>> 32))) + (d() ^ (d() >>> 32)));
    }

    public boolean isEmpty() {
        return c() > d();
    }

    public String toString() {
        return c() + ".." + d();
    }
}
