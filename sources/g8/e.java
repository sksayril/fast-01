package g8;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import w8.c;

public final class e implements Comparable<e> {

    /* renamed from: q  reason: collision with root package name */
    public static final a f8961q = new a((g) null);

    /* renamed from: r  reason: collision with root package name */
    public static final e f8962r = f.a();

    /* renamed from: m  reason: collision with root package name */
    private final int f8963m;

    /* renamed from: n  reason: collision with root package name */
    private final int f8964n;

    /* renamed from: o  reason: collision with root package name */
    private final int f8965o;

    /* renamed from: p  reason: collision with root package name */
    private final int f8966p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public e(int i10, int i11, int i12) {
        this.f8963m = i10;
        this.f8964n = i11;
        this.f8965o = i12;
        this.f8966p = g(i10, i11, i12);
    }

    private final int g(int i10, int i11, int i12) {
        boolean z9 = false;
        if (new c(0, 255).k(i10) && new c(0, 255).k(i11) && new c(0, 255).k(i12)) {
            z9 = true;
        }
        if (z9) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    /* renamed from: e */
    public int compareTo(e eVar) {
        l.e(eVar, "other");
        return this.f8966p - eVar.f8966p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f8966p == eVar.f8966p;
    }

    public int hashCode() {
        return this.f8966p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8963m);
        sb.append('.');
        sb.append(this.f8964n);
        sb.append('.');
        sb.append(this.f8965o);
        return sb.toString();
    }
}
