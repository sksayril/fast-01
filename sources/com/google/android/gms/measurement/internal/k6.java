package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.n1;
import h2.p;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class k6<V> extends FutureTask<V> implements Comparable<k6<V>> {

    /* renamed from: m  reason: collision with root package name */
    private final long f6255m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f6256n;

    /* renamed from: o  reason: collision with root package name */
    private final String f6257o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ f6 f6258p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k6(f6 f6Var, Runnable runnable, boolean z9, String str) {
        super(n1.a().b(runnable), (Object) null);
        this.f6258p = f6Var;
        p.j(str);
        long andIncrement = f6.f6016l.getAndIncrement();
        this.f6255m = andIncrement;
        this.f6257o = str;
        this.f6256n = z9;
        if (andIncrement == Long.MAX_VALUE) {
            f6Var.k().F().a("Tasks index overflow");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k6(f6 f6Var, Callable<V> callable, boolean z9, String str) {
        super(n1.a().a(callable));
        this.f6258p = f6Var;
        p.j(str);
        long andIncrement = f6.f6016l.getAndIncrement();
        this.f6255m = andIncrement;
        this.f6257o = str;
        this.f6256n = z9;
        if (andIncrement == Long.MAX_VALUE) {
            f6Var.k().F().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        k6 k6Var = (k6) obj;
        boolean z9 = this.f6256n;
        if (z9 != k6Var.f6256n) {
            return z9 ? -1 : 1;
        }
        long j10 = this.f6255m;
        long j11 = k6Var.f6255m;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f6258p.k().H().b("Two tasks share the same index. index", Long.valueOf(this.f6255m));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f6258p.k().F().b(this.f6257o, th);
        super.setException(th);
    }
}
