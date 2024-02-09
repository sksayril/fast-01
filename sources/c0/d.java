package c0;

import java.util.Map;
import kotlin.jvm.internal.l;

public abstract class d {

    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f3546a;

        public a(String str) {
            l.e(str, "name");
            this.f3546a = str;
        }

        public final String a() {
            return this.f3546a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return l.a(this.f3546a, ((a) obj).f3546a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3546a.hashCode();
        }

        public String toString() {
            return this.f3546a;
        }
    }

    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private final a<T> f3547a;

        /* renamed from: b  reason: collision with root package name */
        private final T f3548b;

        public final a<T> a() {
            return this.f3547a;
        }

        public final T b() {
            return this.f3548b;
        }
    }

    public abstract Map<a<?>, Object> a();

    public abstract <T> T b(a<T> aVar);

    public final a c() {
        return new a(f0.o(a()), false);
    }

    public final d d() {
        return new a(f0.o(a()), true);
    }
}
