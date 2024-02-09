package androidx.datastore.preferences.protobuf;

final class j0 implements h1 {

    /* renamed from: b  reason: collision with root package name */
    private static final q0 f1976b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final q0 f1977a;

    static class a implements q0 {
        a() {
        }

        public p0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class<?> cls) {
            return false;
        }
    }

    private static class b implements q0 {

        /* renamed from: a  reason: collision with root package name */
        private q0[] f1978a;

        b(q0... q0VarArr) {
            this.f1978a = q0VarArr;
        }

        public p0 a(Class<?> cls) {
            for (q0 q0Var : this.f1978a) {
                if (q0Var.b(cls)) {
                    return q0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class<?> cls) {
            for (q0 b10 : this.f1978a) {
                if (b10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public j0() {
        this(b());
    }

    private j0(q0 q0Var) {
        this.f1977a = (q0) a0.b(q0Var, "messageInfoFactory");
    }

    private static q0 b() {
        return new b(x.c(), c());
    }

    private static q0 c() {
        try {
            return (q0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f1976b;
        }
    }

    private static boolean d(p0 p0Var) {
        return p0Var.b() == b1.PROTO2;
    }

    private static <T> g1<T> e(Class<T> cls, p0 p0Var) {
        if (y.class.isAssignableFrom(cls)) {
            if (d(p0Var)) {
                return u0.N(cls, p0Var, y0.b(), h0.b(), i1.M(), s.b(), o0.b());
            }
            return u0.N(cls, p0Var, y0.b(), h0.b(), i1.M(), (q<?>) null, o0.b());
        } else if (d(p0Var)) {
            return u0.N(cls, p0Var, y0.a(), h0.a(), i1.H(), s.a(), o0.a());
        } else {
            return u0.N(cls, p0Var, y0.a(), h0.a(), i1.I(), (q<?>) null, o0.a());
        }
    }

    public <T> g1<T> a(Class<T> cls) {
        n1<?, ?> H;
        q<?> a10;
        i1.J(cls);
        p0 a11 = this.f1977a.a(cls);
        if (!a11.a()) {
            return e(cls, a11);
        }
        if (y.class.isAssignableFrom(cls)) {
            H = i1.M();
            a10 = s.b();
        } else {
            H = i1.H();
            a10 = s.a();
        }
        return v0.l(H, a10, a11.c());
    }
}
