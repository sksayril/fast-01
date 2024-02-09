package w8;

import h8.b0;
import kotlin.jvm.internal.g;
import m8.c;

public class d implements Iterable<Long>, s8.a {

    /* renamed from: p  reason: collision with root package name */
    public static final a f13012p = new a((g) null);

    /* renamed from: m  reason: collision with root package name */
    private final long f13013m;

    /* renamed from: n  reason: collision with root package name */
    private final long f13014n;

    /* renamed from: o  reason: collision with root package name */
    private final long f13015o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public d(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (j12 != Long.MIN_VALUE) {
            this.f13013m = j10;
            this.f13014n = c.d(j10, j11, j12);
            this.f13015o = j12;
        } else {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final long c() {
        return this.f13013m;
    }

    public final long d() {
        return this.f13014n;
    }

    /* renamed from: f */
    public b0 iterator() {
        return new e(this.f13013m, this.f13014n, this.f13015o);
    }
}
