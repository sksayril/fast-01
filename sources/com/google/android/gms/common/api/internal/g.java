package com.google.android.gms.common.api.internal;

import d3.k;
import e2.d;
import f2.a;
import f2.a.b;
import g2.d0;
import g2.i;
import h2.p;

public abstract class g<A extends a.b, ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final d[] f4984a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4985b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4986c;

    public static class a<A extends a.b, ResultT> {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public i f4987a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f4988b = true;

        /* renamed from: c  reason: collision with root package name */
        private d[] f4989c;

        /* renamed from: d  reason: collision with root package name */
        private int f4990d = 0;

        /* synthetic */ a(d0 d0Var) {
        }

        public g<A, ResultT> a() {
            p.b(this.f4987a != null, "execute parameter required");
            return new a0(this, this.f4989c, this.f4988b, this.f4990d);
        }

        public a<A, ResultT> b(i<A, k<ResultT>> iVar) {
            this.f4987a = iVar;
            return this;
        }

        public a<A, ResultT> c(boolean z9) {
            this.f4988b = z9;
            return this;
        }

        public a<A, ResultT> d(d... dVarArr) {
            this.f4989c = dVarArr;
            return this;
        }

        public a<A, ResultT> e(int i10) {
            this.f4990d = i10;
            return this;
        }
    }

    protected g(d[] dVarArr, boolean z9, int i10) {
        this.f4984a = dVarArr;
        boolean z10 = false;
        if (dVarArr != null && z9) {
            z10 = true;
        }
        this.f4985b = z10;
        this.f4986c = i10;
    }

    public static <A extends a.b, ResultT> a<A, ResultT> a() {
        return new a<>((d0) null);
    }

    /* access modifiers changed from: protected */
    public abstract void b(A a10, k<ResultT> kVar);

    public boolean c() {
        return this.f4985b;
    }

    public final int d() {
        return this.f4986c;
    }

    public final d[] e() {
        return this.f4984a;
    }
}
