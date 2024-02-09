package d4;

import com.google.auto.value.AutoValue;
import d4.a0;
import d4.b;
import d4.c;
import d4.d;
import d4.e;
import d4.f;
import d4.g;
import d4.h;
import d4.i;
import d4.k;
import d4.l;
import d4.m;
import d4.n;
import d4.o;
import d4.p;
import d4.q;
import d4.r;
import d4.s;
import d4.t;
import d4.u;
import d4.v;
import d4.w;
import d4.x;
import d4.y;
import d4.z;
import java.nio.charset.Charset;
import java.util.List;

@AutoValue
public abstract class f0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f8002a = Charset.forName("UTF-8");

    @AutoValue
    public static abstract class a {

        @AutoValue
        /* renamed from: d4.f0$a$a  reason: collision with other inner class name */
        public static abstract class C0106a {

            @AutoValue.Builder
            /* renamed from: d4.f0$a$a$a  reason: collision with other inner class name */
            public static abstract class C0107a {
                public abstract C0106a a();

                public abstract C0107a b(String str);

                public abstract C0107a c(String str);

                public abstract C0107a d(String str);
            }

            public static C0107a a() {
                return new d.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();
        }

        @AutoValue.Builder
        public static abstract class b {
            public abstract a a();

            public abstract b b(List<C0106a> list);

            public abstract b c(int i10);

            public abstract b d(int i10);

            public abstract b e(String str);

            public abstract b f(long j10);

            public abstract b g(int i10);

            public abstract b h(long j10);

            public abstract b i(long j10);

            public abstract b j(String str);
        }

        public static b a() {
            return new c.b();
        }

        public abstract List<C0106a> b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract long f();

        public abstract int g();

        public abstract long h();

        public abstract long i();

        public abstract String j();
    }

    @AutoValue.Builder
    public static abstract class b {
        public abstract f0 a();

        public abstract b b(a aVar);

        public abstract b c(String str);

        public abstract b d(String str);

        public abstract b e(String str);

        public abstract b f(String str);

        public abstract b g(String str);

        public abstract b h(String str);

        public abstract b i(d dVar);

        public abstract b j(int i10);

        public abstract b k(String str);

        public abstract b l(e eVar);
    }

    @AutoValue
    public static abstract class c {

        @AutoValue.Builder
        public static abstract class a {
            public abstract c a();

            public abstract a b(String str);

            public abstract a c(String str);
        }

        public static a a() {
            return new e.b();
        }

        public abstract String b();

        public abstract String c();
    }

    @AutoValue
    public static abstract class d {

        @AutoValue.Builder
        public static abstract class a {
            public abstract d a();

            public abstract a b(List<b> list);

            public abstract a c(String str);
        }

        @AutoValue
        public static abstract class b {

            @AutoValue.Builder
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            public static a a() {
                return new g.b();
            }

            public abstract byte[] b();

            public abstract String c();
        }

        public static a a() {
            return new f.b();
        }

        public abstract List<b> b();

        public abstract String c();
    }

    @AutoValue
    public static abstract class e {

        @AutoValue
        public static abstract class a {

            @AutoValue.Builder
            /* renamed from: d4.f0$e$a$a  reason: collision with other inner class name */
            public static abstract class C0108a {
                public abstract a a();

                public abstract C0108a b(String str);

                public abstract C0108a c(String str);

                public abstract C0108a d(String str);

                public abstract C0108a e(String str);

                public abstract C0108a f(String str);

                public abstract C0108a g(String str);
            }

            @AutoValue
            public static abstract class b {
                public abstract String a();
            }

            public static C0108a a() {
                return new i.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract b g();

            public abstract String h();
        }

        @AutoValue.Builder
        public static abstract class b {
            public abstract e a();

            public abstract b b(a aVar);

            public abstract b c(String str);

            public abstract b d(boolean z9);

            public abstract b e(c cVar);

            public abstract b f(Long l10);

            public abstract b g(List<d> list);

            public abstract b h(String str);

            public abstract b i(int i10);

            public abstract b j(String str);

            public b k(byte[] bArr) {
                return j(new String(bArr, f0.f8002a));
            }

            public abstract b l(C0123e eVar);

            public abstract b m(long j10);

            public abstract b n(f fVar);
        }

        @AutoValue
        public static abstract class c {

            @AutoValue.Builder
            public static abstract class a {
                public abstract c a();

                public abstract a b(int i10);

                public abstract a c(int i10);

                public abstract a d(long j10);

                public abstract a e(String str);

                public abstract a f(String str);

                public abstract a g(String str);

                public abstract a h(long j10);

                public abstract a i(boolean z9);

                public abstract a j(int i10);
            }

            public static a a() {
                return new k.b();
            }

            public abstract int b();

            public abstract int c();

            public abstract long d();

            public abstract String e();

            public abstract String f();

            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();
        }

        @AutoValue
        public static abstract class d {

            @AutoValue
            public static abstract class a {

                @AutoValue.Builder
                /* renamed from: d4.f0$e$d$a$a  reason: collision with other inner class name */
                public static abstract class C0109a {
                    public abstract a a();

                    public abstract C0109a b(List<c> list);

                    public abstract C0109a c(Boolean bool);

                    public abstract C0109a d(c cVar);

                    public abstract C0109a e(List<c> list);

                    public abstract C0109a f(b bVar);

                    public abstract C0109a g(List<c> list);

                    public abstract C0109a h(int i10);
                }

                @AutoValue
                public static abstract class b {

                    @AutoValue
                    /* renamed from: d4.f0$e$d$a$b$a  reason: collision with other inner class name */
                    public static abstract class C0110a {

                        @AutoValue.Builder
                        /* renamed from: d4.f0$e$d$a$b$a$a  reason: collision with other inner class name */
                        public static abstract class C0111a {
                            public abstract C0110a a();

                            public abstract C0111a b(long j10);

                            public abstract C0111a c(String str);

                            public abstract C0111a d(long j10);

                            public abstract C0111a e(String str);

                            public C0111a f(byte[] bArr) {
                                return e(new String(bArr, f0.f8002a));
                            }
                        }

                        public static C0111a a() {
                            return new o.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract long d();

                        public abstract String e();

                        public byte[] f() {
                            String e10 = e();
                            if (e10 != null) {
                                return e10.getBytes(f0.f8002a);
                            }
                            return null;
                        }
                    }

                    @AutoValue.Builder
                    /* renamed from: d4.f0$e$d$a$b$b  reason: collision with other inner class name */
                    public static abstract class C0112b {
                        public abstract b a();

                        public abstract C0112b b(a aVar);

                        public abstract C0112b c(List<C0110a> list);

                        public abstract C0112b d(c cVar);

                        public abstract C0112b e(C0114d dVar);

                        public abstract C0112b f(List<C0116e> list);
                    }

                    @AutoValue
                    public static abstract class c {

                        @AutoValue.Builder
                        /* renamed from: d4.f0$e$d$a$b$c$a  reason: collision with other inner class name */
                        public static abstract class C0113a {
                            public abstract c a();

                            public abstract C0113a b(c cVar);

                            public abstract C0113a c(List<C0116e.C0118b> list);

                            public abstract C0113a d(int i10);

                            public abstract C0113a e(String str);

                            public abstract C0113a f(String str);
                        }

                        public static C0113a a() {
                            return new p.b();
                        }

                        public abstract c b();

                        public abstract List<C0116e.C0118b> c();

                        public abstract int d();

                        public abstract String e();

                        public abstract String f();
                    }

                    @AutoValue
                    /* renamed from: d4.f0$e$d$a$b$d  reason: collision with other inner class name */
                    public static abstract class C0114d {

                        @AutoValue.Builder
                        /* renamed from: d4.f0$e$d$a$b$d$a  reason: collision with other inner class name */
                        public static abstract class C0115a {
                            public abstract C0114d a();

                            public abstract C0115a b(long j10);

                            public abstract C0115a c(String str);

                            public abstract C0115a d(String str);
                        }

                        public static C0115a a() {
                            return new q.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract String d();
                    }

                    @AutoValue
                    /* renamed from: d4.f0$e$d$a$b$e  reason: collision with other inner class name */
                    public static abstract class C0116e {

                        @AutoValue.Builder
                        /* renamed from: d4.f0$e$d$a$b$e$a  reason: collision with other inner class name */
                        public static abstract class C0117a {
                            public abstract C0116e a();

                            public abstract C0117a b(List<C0118b> list);

                            public abstract C0117a c(int i10);

                            public abstract C0117a d(String str);
                        }

                        @AutoValue
                        /* renamed from: d4.f0$e$d$a$b$e$b  reason: collision with other inner class name */
                        public static abstract class C0118b {

                            @AutoValue.Builder
                            /* renamed from: d4.f0$e$d$a$b$e$b$a  reason: collision with other inner class name */
                            public static abstract class C0119a {
                                public abstract C0118b a();

                                public abstract C0119a b(String str);

                                public abstract C0119a c(int i10);

                                public abstract C0119a d(long j10);

                                public abstract C0119a e(long j10);

                                public abstract C0119a f(String str);
                            }

                            public static C0119a a() {
                                return new s.b();
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            public abstract String f();
                        }

                        public static C0117a a() {
                            return new r.b();
                        }

                        public abstract List<C0118b> b();

                        public abstract int c();

                        public abstract String d();
                    }

                    public static C0112b a() {
                        return new n.b();
                    }

                    public abstract a b();

                    public abstract List<C0110a> c();

                    public abstract c d();

                    public abstract C0114d e();

                    public abstract List<C0116e> f();
                }

                @AutoValue
                public static abstract class c {

                    @AutoValue.Builder
                    /* renamed from: d4.f0$e$d$a$c$a  reason: collision with other inner class name */
                    public static abstract class C0120a {
                        public abstract c a();

                        public abstract C0120a b(boolean z9);

                        public abstract C0120a c(int i10);

                        public abstract C0120a d(int i10);

                        public abstract C0120a e(String str);
                    }

                    public static C0120a a() {
                        return new t.b();
                    }

                    public abstract int b();

                    public abstract int c();

                    public abstract String d();

                    public abstract boolean e();
                }

                public static C0109a a() {
                    return new m.b();
                }

                public abstract List<c> b();

                public abstract Boolean c();

                public abstract c d();

                public abstract List<c> e();

                public abstract b f();

                public abstract List<c> g();

                public abstract int h();

                public abstract C0109a i();
            }

            @AutoValue.Builder
            public static abstract class b {
                public abstract d a();

                public abstract b b(a aVar);

                public abstract b c(c cVar);

                public abstract b d(C0121d dVar);

                public abstract b e(f fVar);

                public abstract b f(long j10);

                public abstract b g(String str);
            }

            @AutoValue
            public static abstract class c {

                @AutoValue.Builder
                public static abstract class a {
                    public abstract c a();

                    public abstract a b(Double d10);

                    public abstract a c(int i10);

                    public abstract a d(long j10);

                    public abstract a e(int i10);

                    public abstract a f(boolean z9);

                    public abstract a g(long j10);
                }

                public static a a() {
                    return new u.b();
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();
            }

            @AutoValue
            /* renamed from: d4.f0$e$d$d  reason: collision with other inner class name */
            public static abstract class C0121d {

                @AutoValue.Builder
                /* renamed from: d4.f0$e$d$d$a */
                public static abstract class a {
                    public abstract C0121d a();

                    public abstract a b(String str);
                }

                public static a a() {
                    return new v.b();
                }

                public abstract String b();
            }

            @AutoValue
            /* renamed from: d4.f0$e$d$e  reason: collision with other inner class name */
            public static abstract class C0122e {

                @AutoValue.Builder
                /* renamed from: d4.f0$e$d$e$a */
                public static abstract class a {
                    public abstract C0122e a();

                    public abstract a b(String str);

                    public abstract a c(String str);

                    public abstract a d(b bVar);

                    public abstract a e(long j10);
                }

                @AutoValue
                /* renamed from: d4.f0$e$d$e$b */
                public static abstract class b {

                    @AutoValue.Builder
                    /* renamed from: d4.f0$e$d$e$b$a */
                    public static abstract class a {
                        public abstract b a();

                        public abstract a b(String str);

                        public abstract a c(String str);
                    }

                    public static a a() {
                        return new x.b();
                    }

                    public abstract String b();

                    public abstract String c();
                }

                public static a a() {
                    return new w.b();
                }

                public abstract String b();

                public abstract String c();

                public abstract b d();

                public abstract long e();
            }

            @AutoValue
            public static abstract class f {

                @AutoValue.Builder
                public static abstract class a {
                    public abstract f a();

                    public abstract a b(List<C0122e> list);
                }

                public static a a() {
                    return new y.b();
                }

                public abstract List<C0122e> b();
            }

            public static b a() {
                return new l.b();
            }

            public abstract a b();

            public abstract c c();

            public abstract C0121d d();

            public abstract f e();

            public abstract long f();

            public abstract String g();

            public abstract b h();
        }

        @AutoValue
        /* renamed from: d4.f0$e$e  reason: collision with other inner class name */
        public static abstract class C0123e {

            @AutoValue.Builder
            /* renamed from: d4.f0$e$e$a */
            public static abstract class a {
                public abstract C0123e a();

                public abstract a b(String str);

                public abstract a c(boolean z9);

                public abstract a d(int i10);

                public abstract a e(String str);
            }

            public static a a() {
                return new z.b();
            }

            public abstract String b();

            public abstract int c();

            public abstract String d();

            public abstract boolean e();
        }

        @AutoValue
        public static abstract class f {

            @AutoValue.Builder
            public static abstract class a {
                public abstract f a();

                public abstract a b(String str);
            }

            public static a a() {
                return new a0.b();
            }

            public abstract String b();
        }

        public static b a() {
            return new h.b().d(false);
        }

        public abstract a b();

        public abstract String c();

        public abstract c d();

        public abstract Long e();

        public abstract List<d> f();

        public abstract String g();

        public abstract int h();

        public abstract String i();

        public byte[] j() {
            return i().getBytes(f0.f8002a);
        }

        public abstract C0123e k();

        public abstract long l();

        public abstract f m();

        public abstract boolean n();

        public abstract b o();

        /* access modifiers changed from: package-private */
        public e p(String str) {
            return o().c(str).a();
        }

        /* access modifiers changed from: package-private */
        public e q(List<d> list) {
            return o().g(list).a();
        }

        /* access modifiers changed from: package-private */
        public e r(long j10, boolean z9, String str) {
            b o10 = o();
            o10.f(Long.valueOf(j10));
            o10.d(z9);
            if (str != null) {
                o10.n(f.a().b(str).a());
            }
            return o10.a();
        }
    }

    public static b b() {
        return new b.C0105b();
    }

    public abstract a c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract d j();

    public abstract int k();

    public abstract String l();

    public abstract e m();

    /* access modifiers changed from: protected */
    public abstract b n();

    public f0 o(String str) {
        b c10 = n().c(str);
        if (m() != null) {
            c10.l(m().p(str));
        }
        return c10.a();
    }

    public f0 p(a aVar) {
        return aVar == null ? this : n().b(aVar).a();
    }

    public f0 q(List<e.d> list) {
        if (m() != null) {
            return n().l(m().q(list)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public f0 r(String str) {
        return n().f(str).a();
    }

    public f0 s(d dVar) {
        return n().l((e) null).i(dVar).a();
    }

    public f0 t(long j10, boolean z9, String str) {
        b n10 = n();
        if (m() != null) {
            n10.l(m().r(j10, z9, str));
        }
        return n10.a();
    }
}
