package p1;

import android.content.Context;
import java.util.concurrent.Executor;
import p1.v;
import q1.j;
import q1.l;
import r1.d;
import v1.c;
import w1.f;
import w1.r;
import w1.s;
import w1.v;
import w1.w;
import w1.x;
import x1.g;
import x1.h;
import x1.i;
import x1.m0;
import x1.n0;
import x1.u0;

final class e extends v {

    /* renamed from: m  reason: collision with root package name */
    private f8.a<Executor> f11816m;

    /* renamed from: n  reason: collision with root package name */
    private f8.a<Context> f11817n;

    /* renamed from: o  reason: collision with root package name */
    private f8.a f11818o;

    /* renamed from: p  reason: collision with root package name */
    private f8.a f11819p;

    /* renamed from: q  reason: collision with root package name */
    private f8.a f11820q;

    /* renamed from: r  reason: collision with root package name */
    private f8.a<String> f11821r;

    /* renamed from: s  reason: collision with root package name */
    private f8.a<m0> f11822s;

    /* renamed from: t  reason: collision with root package name */
    private f8.a<f> f11823t;

    /* renamed from: u  reason: collision with root package name */
    private f8.a<x> f11824u;

    /* renamed from: v  reason: collision with root package name */
    private f8.a<c> f11825v;

    /* renamed from: w  reason: collision with root package name */
    private f8.a<r> f11826w;

    /* renamed from: x  reason: collision with root package name */
    private f8.a<v> f11827x;

    /* renamed from: y  reason: collision with root package name */
    private f8.a<u> f11828y;

    private static final class b implements v.a {

        /* renamed from: a  reason: collision with root package name */
        private Context f11829a;

        private b() {
        }

        public v a() {
            d.a(this.f11829a, Context.class);
            return new e(this.f11829a);
        }

        /* renamed from: c */
        public b b(Context context) {
            this.f11829a = (Context) d.b(context);
            return this;
        }
    }

    private e(Context context) {
        g(context);
    }

    public static v.a e() {
        return new b();
    }

    private void g(Context context) {
        this.f11816m = r1.a.a(k.a());
        r1.b a10 = r1.c.a(context);
        this.f11817n = a10;
        j a11 = j.a(a10, z1.c.a(), z1.d.a());
        this.f11818o = a11;
        this.f11819p = r1.a.a(l.a(this.f11817n, a11));
        this.f11820q = u0.a(this.f11817n, g.a(), i.a());
        this.f11821r = r1.a.a(h.a(this.f11817n));
        this.f11822s = r1.a.a(n0.a(z1.c.a(), z1.d.a(), x1.j.a(), this.f11820q, this.f11821r));
        v1.g b10 = v1.g.b(z1.c.a());
        this.f11823t = b10;
        v1.i a12 = v1.i.a(this.f11817n, this.f11822s, b10, z1.d.a());
        this.f11824u = a12;
        f8.a<Executor> aVar = this.f11816m;
        f8.a aVar2 = this.f11819p;
        f8.a<m0> aVar3 = this.f11822s;
        this.f11825v = v1.d.a(aVar, aVar2, a12, aVar3, aVar3);
        f8.a<Context> aVar4 = this.f11817n;
        f8.a aVar5 = this.f11819p;
        f8.a<m0> aVar6 = this.f11822s;
        this.f11826w = s.a(aVar4, aVar5, aVar6, this.f11824u, this.f11816m, aVar6, z1.c.a(), z1.d.a(), this.f11822s);
        f8.a<Executor> aVar7 = this.f11816m;
        f8.a<m0> aVar8 = this.f11822s;
        this.f11827x = w.a(aVar7, aVar8, this.f11824u, aVar8);
        this.f11828y = r1.a.a(w.a(z1.c.a(), z1.d.a(), this.f11825v, this.f11826w, this.f11827x));
    }

    /* access modifiers changed from: package-private */
    public x1.d a() {
        return this.f11822s.get();
    }

    /* access modifiers changed from: package-private */
    public u b() {
        return this.f11828y.get();
    }
}
