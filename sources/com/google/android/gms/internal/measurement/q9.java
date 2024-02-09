package com.google.android.gms.internal.measurement;

final class q9 implements xa {

    /* renamed from: b  reason: collision with root package name */
    private static final ea f5536b = new u9();

    /* renamed from: a  reason: collision with root package name */
    private final ea f5537a;

    public q9() {
        this(new w9(q8.c(), b()));
    }

    private q9(ea eaVar) {
        this.f5537a = (ea) r8.f(eaVar, "messageInfoFactory");
    }

    private static ea b() {
        try {
            return (ea) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return f5536b;
        }
    }

    private static boolean c(ba baVar) {
        return s9.f5593a[baVar.a().ordinal()] != 1;
    }

    public final <T> va<T> a(Class<T> cls) {
        Class<p8> cls2 = p8.class;
        wa.o(cls);
        ba a10 = this.f5537a.a(cls);
        if (a10.b()) {
            return cls2.isAssignableFrom(cls) ? ja.i(wa.u(), f8.b(), a10.zza()) : ja.i(wa.f(), f8.a(), a10.zza());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean c10 = c(a10);
            ka b10 = ma.b();
            l9 c11 = l9.c();
            ub<?, ?> u9 = wa.u();
            if (c10) {
                return ha.m(cls, a10, b10, c11, u9, f8.b(), ca.b());
            }
            return ha.m(cls, a10, b10, c11, u9, (e8<?>) null, ca.b());
        }
        boolean c12 = c(a10);
        ka a11 = ma.a();
        l9 a12 = l9.a();
        ub<?, ?> f10 = wa.f();
        if (c12) {
            return ha.m(cls, a10, a11, a12, f10, f8.a(), ca.a());
        }
        return ha.m(cls, a10, a11, a12, f10, (e8<?>) null, ca.a());
    }
}
