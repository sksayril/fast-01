package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;
import d3.k;
import e2.d;
import f2.a;
import f2.a.b;
import g2.i;
import g2.w;
import g2.x;
import g2.y;
import h2.p;

public class f<A extends a.b, L> {

    /* renamed from: a  reason: collision with root package name */
    public final e<A, L> f4973a;

    /* renamed from: b  reason: collision with root package name */
    public final h f4974b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f4975c;

    public static class a<A extends a.b, L> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public i f4976a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public i f4977b;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f4978c = w.f8916m;

        /* renamed from: d  reason: collision with root package name */
        private c f4979d;

        /* renamed from: e  reason: collision with root package name */
        private d[] f4980e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4981f = true;

        /* renamed from: g  reason: collision with root package name */
        private int f4982g;

        /* synthetic */ a(x xVar) {
        }

        public f<A, L> a() {
            boolean z9 = true;
            p.b(this.f4976a != null, "Must set register function");
            p.b(this.f4977b != null, "Must set unregister function");
            if (this.f4979d == null) {
                z9 = false;
            }
            p.b(z9, "Must set holder");
            return new f<>(new y(this, this.f4979d, this.f4980e, this.f4981f, this.f4982g), new z(this, (c.a) p.k(this.f4979d.b(), "Key must not be null")), this.f4978c, (y) null);
        }

        public a<A, L> b(i<A, k<Void>> iVar) {
            this.f4976a = iVar;
            return this;
        }

        public a<A, L> c(int i10) {
            this.f4982g = i10;
            return this;
        }

        public a<A, L> d(i<A, k<Boolean>> iVar) {
            this.f4977b = iVar;
            return this;
        }

        public a<A, L> e(c<L> cVar) {
            this.f4979d = cVar;
            return this;
        }
    }

    /* synthetic */ f(e eVar, h hVar, Runnable runnable, y yVar) {
        this.f4973a = eVar;
        this.f4974b = hVar;
        this.f4975c = runnable;
    }

    public static <A extends a.b, L> a<A, L> a() {
        return new a<>((x) null);
    }
}
