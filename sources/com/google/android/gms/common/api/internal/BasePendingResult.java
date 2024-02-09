package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import f2.g;
import f2.h;
import f2.k;
import f2.l;
import g2.f0;
import h2.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import r2.j;

@KeepName
public abstract class BasePendingResult<R extends k> extends g<R> {

    /* renamed from: o  reason: collision with root package name */
    static final ThreadLocal f4915o = new l0();

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f4916p = 0;

    /* renamed from: a  reason: collision with root package name */
    private final Object f4917a = new Object();

    /* renamed from: b  reason: collision with root package name */
    protected final a f4918b = new a(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    protected final WeakReference f4919c = new WeakReference((Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final CountDownLatch f4920d = new CountDownLatch(1);

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f4921e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private l f4922f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicReference f4923g = new AtomicReference();
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public k f4924h;

    /* renamed from: i  reason: collision with root package name */
    private Status f4925i;

    /* renamed from: j  reason: collision with root package name */
    private volatile boolean f4926j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f4927k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f4928l;

    /* renamed from: m  reason: collision with root package name */
    private h2.k f4929m;
    @KeepName
    private m0 mResultGuardian;

    /* renamed from: n  reason: collision with root package name */
    private boolean f4930n = false;

    public static class a<R extends k> extends j {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(l lVar, k kVar) {
            int i10 = BasePendingResult.f4916p;
            sendMessage(obtainMessage(1, new Pair((l) p.j(lVar), kVar)));
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                l lVar = (l) pair.first;
                k kVar = (k) pair.second;
                try {
                    lVar.a(kVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.h(kVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
            } else {
                ((BasePendingResult) message.obj).b(Status.f4906v);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
    }

    private final k e() {
        k kVar;
        synchronized (this.f4917a) {
            p.n(!this.f4926j, "Result has already been consumed.");
            p.n(c(), "Result is not ready.");
            kVar = this.f4924h;
            this.f4924h = null;
            this.f4922f = null;
            this.f4926j = true;
        }
        if (((c0) this.f4923g.getAndSet((Object) null)) == null) {
            return (k) p.j(kVar);
        }
        throw null;
    }

    private final void f(k kVar) {
        this.f4924h = kVar;
        this.f4925i = kVar.c();
        this.f4929m = null;
        this.f4920d.countDown();
        if (this.f4927k) {
            this.f4922f = null;
        } else {
            l lVar = this.f4922f;
            if (lVar != null) {
                this.f4918b.removeMessages(2);
                this.f4918b.a(lVar, e());
            } else if (this.f4924h instanceof h) {
                this.mResultGuardian = new m0(this, (f0) null);
            }
        }
        ArrayList arrayList = this.f4921e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g.a) arrayList.get(i10)).a(this.f4925i);
        }
        this.f4921e.clear();
    }

    public static void h(k kVar) {
        if (kVar instanceof h) {
            try {
                ((h) kVar).a();
            } catch (RuntimeException e10) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(kVar)), e10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract R a(Status status);

    @Deprecated
    public final void b(Status status) {
        synchronized (this.f4917a) {
            if (!c()) {
                d(a(status));
                this.f4928l = true;
            }
        }
    }

    public final boolean c() {
        return this.f4920d.getCount() == 0;
    }

    public final void d(R r9) {
        synchronized (this.f4917a) {
            if (this.f4928l || this.f4927k) {
                h(r9);
                return;
            }
            c();
            p.n(!c(), "Results have already been set");
            p.n(!this.f4926j, "Result has already been consumed");
            f(r9);
        }
    }
}
