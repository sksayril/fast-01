package p3;

import java.io.Serializable;
import java.util.Objects;

public final class l {

    static class a<T> implements k<T>, Serializable {

        /* renamed from: m  reason: collision with root package name */
        final k<T> f11867m;

        /* renamed from: n  reason: collision with root package name */
        volatile transient boolean f11868n;

        /* renamed from: o  reason: collision with root package name */
        transient T f11869o;

        a(k<T> kVar) {
            this.f11867m = (k) h.i(kVar);
        }

        public T get() {
            if (!this.f11868n) {
                synchronized (this) {
                    if (!this.f11868n) {
                        T t9 = this.f11867m.get();
                        this.f11869o = t9;
                        this.f11868n = true;
                        return t9;
                    }
                }
            }
            return e.a(this.f11869o);
        }

        public String toString() {
            Object obj;
            if (this.f11868n) {
                String valueOf = String.valueOf(this.f11869o);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            } else {
                obj = this.f11867m;
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    static class b<T> implements k<T> {

        /* renamed from: m  reason: collision with root package name */
        volatile k<T> f11870m;

        /* renamed from: n  reason: collision with root package name */
        volatile boolean f11871n;

        /* renamed from: o  reason: collision with root package name */
        T f11872o;

        b(k<T> kVar) {
            this.f11870m = (k) h.i(kVar);
        }

        public T get() {
            if (!this.f11871n) {
                synchronized (this) {
                    if (!this.f11871n) {
                        k<T> kVar = this.f11870m;
                        Objects.requireNonNull(kVar);
                        T t9 = kVar.get();
                        this.f11872o = t9;
                        this.f11871n = true;
                        this.f11870m = null;
                        return t9;
                    }
                }
            }
            return e.a(this.f11872o);
        }

        public String toString() {
            Object obj = this.f11870m;
            if (obj == null) {
                String valueOf = String.valueOf(this.f11872o);
                StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                sb.append("<supplier that returned ");
                sb.append(valueOf);
                sb.append(">");
                obj = sb.toString();
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
            sb2.append("Suppliers.memoize(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class c<T> implements k<T>, Serializable {

        /* renamed from: m  reason: collision with root package name */
        final T f11873m;

        c(T t9) {
            this.f11873m = t9;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return f.a(this.f11873m, ((c) obj).f11873m);
            }
            return false;
        }

        public T get() {
            return this.f11873m;
        }

        public int hashCode() {
            return f.b(this.f11873m);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f11873m);
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Suppliers.ofInstance(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> k<T> a(k<T> kVar) {
        return ((kVar instanceof b) || (kVar instanceof a)) ? kVar : kVar instanceof Serializable ? new a(kVar) : new b(kVar);
    }

    public static <T> k<T> b(T t9) {
        return new c(t9);
    }
}
