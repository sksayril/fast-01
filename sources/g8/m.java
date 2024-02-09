package g8;

import java.io.Serializable;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class m<T> implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    public static final a f8970m = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* renamed from: m  reason: collision with root package name */
        public final Throwable f8971m;

        public b(Throwable th) {
            l.e(th, "exception");
            this.f8971m = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && l.a(this.f8971m, ((b) obj).f8971m);
        }

        public int hashCode() {
            return this.f8971m.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f8971m + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f8971m;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
