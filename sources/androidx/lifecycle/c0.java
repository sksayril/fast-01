package androidx.lifecycle;

import android.app.Application;
import j0.a;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f2737a;

    /* renamed from: b  reason: collision with root package name */
    private final b f2738b;

    /* renamed from: c  reason: collision with root package name */
    private final j0.a f2739c;

    public static class a extends c {

        /* renamed from: d  reason: collision with root package name */
        public static final C0050a f2740d = new C0050a((g) null);

        /* renamed from: e  reason: collision with root package name */
        public static final a.b<Application> f2741e = C0050a.C0051a.f2742a;

        /* renamed from: androidx.lifecycle.c0$a$a  reason: collision with other inner class name */
        public static final class C0050a {

            /* renamed from: androidx.lifecycle.c0$a$a$a  reason: collision with other inner class name */
            private static final class C0051a implements a.b<Application> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0051a f2742a = new C0051a();

                private C0051a() {
                }
            }

            private C0050a() {
            }

            public /* synthetic */ C0050a(g gVar) {
                this();
            }
        }
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2743a = a.f2744a;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f2744a = new a();

            private a() {
            }
        }

        <T extends b0> T a(Class<T> cls);

        <T extends b0> T b(Class<T> cls, j0.a aVar);
    }

    public static class c implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f2745b = new a((g) null);

        /* renamed from: c  reason: collision with root package name */
        public static final a.b<String> f2746c = a.C0052a.f2747a;

        public static final class a {

            /* renamed from: androidx.lifecycle.c0$c$a$a  reason: collision with other inner class name */
            private static final class C0052a implements a.b<String> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0052a f2747a = new C0052a();

                private C0052a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }
        }
    }

    public static class d {
        public void a(b0 b0Var) {
            l.e(b0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, b bVar) {
        this(f0Var, bVar, (j0.a) null, 4, (g) null);
        l.e(f0Var, "store");
        l.e(bVar, "factory");
    }

    public c0(f0 f0Var, b bVar, j0.a aVar) {
        l.e(f0Var, "store");
        l.e(bVar, "factory");
        l.e(aVar, "defaultCreationExtras");
        this.f2737a = f0Var;
        this.f2738b = bVar;
        this.f2739c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(f0 f0Var, b bVar, j0.a aVar, int i10, g gVar) {
        this(f0Var, bVar, (i10 & 4) != 0 ? a.C0161a.f10788b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, b bVar) {
        this(g0Var.l(), bVar, e0.a(g0Var));
        l.e(g0Var, "owner");
        l.e(bVar, "factory");
    }

    public <T extends b0> T a(Class<T> cls) {
        l.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends b0> T b(String str, Class<T> cls) {
        T t9;
        l.e(str, "key");
        l.e(cls, "modelClass");
        T b10 = this.f2737a.b(str);
        if (cls.isInstance(b10)) {
            b bVar = this.f2738b;
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                l.b(b10);
                dVar.a(b10);
            }
            l.c(b10, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b10;
        }
        j0.d dVar2 = new j0.d(this.f2739c);
        dVar2.b(c.f2746c, str);
        try {
            t9 = this.f2738b.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t9 = this.f2738b.a(cls);
        }
        this.f2737a.d(str, t9);
        return t9;
    }
}
