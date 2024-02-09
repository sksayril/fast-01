package d9;

import kotlin.jvm.internal.l;

public final class g<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f8266b = new b((kotlin.jvm.internal.g) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final c f8267c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f8268a;

    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f8269a;

        public a(Throwable th) {
            this.f8269a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && l.a(this.f8269a, ((a) obj).f8269a);
        }

        public int hashCode() {
            Throwable th = this.f8269a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f8269a + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return g.c(new a(th));
        }

        public final <E> Object b() {
            return g.c(g.f8267c);
        }

        public final <E> Object c(E e10) {
            return g.c(e10);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ g(Object obj) {
        this.f8268a = obj;
    }

    public static final /* synthetic */ g b(Object obj) {
        return new g(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof g) && l.a(obj, ((g) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f8269a;
        }
        return null;
    }

    public static final T f(Object obj) {
        if (!(obj instanceof c)) {
            return obj;
        }
        return null;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f8268a, obj);
    }

    public int hashCode() {
        return g(this.f8268a);
    }

    public final /* synthetic */ Object k() {
        return this.f8268a;
    }

    public String toString() {
        return j(this.f8268a);
    }
}
