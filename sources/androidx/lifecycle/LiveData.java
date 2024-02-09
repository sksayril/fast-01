package androidx.lifecycle;

import androidx.lifecycle.g;
import java.util.Map;

public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    static final Object f2700k = new Object();

    /* renamed from: a  reason: collision with root package name */
    final Object f2701a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private m.b<r<? super T>, LiveData<T>.c> f2702b = new m.b<>();

    /* renamed from: c  reason: collision with root package name */
    int f2703c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2704d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Object f2705e;

    /* renamed from: f  reason: collision with root package name */
    volatile Object f2706f;

    /* renamed from: g  reason: collision with root package name */
    private int f2707g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2708h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f2709i;

    /* renamed from: j  reason: collision with root package name */
    private final Runnable f2710j;

    class LifecycleBoundObserver extends LiveData<T>.c implements j {

        /* renamed from: q  reason: collision with root package name */
        final l f2711q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ LiveData f2712r;

        /* access modifiers changed from: package-private */
        public void e() {
            this.f2711q.a().c(this);
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f2711q.a().b().isAtLeast(g.b.STARTED);
        }

        public void h(l lVar, g.a aVar) {
            g.b b10 = this.f2711q.a().b();
            if (b10 == g.b.DESTROYED) {
                this.f2712r.h(this.f2715m);
                return;
            }
            g.b bVar = null;
            while (bVar != b10) {
                a(f());
                bVar = b10;
                b10 = this.f2711q.a().b();
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f2701a) {
                obj = LiveData.this.f2706f;
                LiveData.this.f2706f = LiveData.f2700k;
            }
            LiveData.this.i(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(r<? super T> rVar) {
            super(rVar);
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return true;
        }
    }

    private abstract class c {

        /* renamed from: m  reason: collision with root package name */
        final r<? super T> f2715m;

        /* renamed from: n  reason: collision with root package name */
        boolean f2716n;

        /* renamed from: o  reason: collision with root package name */
        int f2717o = -1;

        c(r<? super T> rVar) {
            this.f2715m = rVar;
        }

        /* access modifiers changed from: package-private */
        public void a(boolean z9) {
            if (z9 != this.f2716n) {
                this.f2716n = z9;
                LiveData.this.b(z9 ? 1 : -1);
                if (this.f2716n) {
                    LiveData.this.d(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean f();
    }

    public LiveData() {
        Object obj = f2700k;
        this.f2706f = obj;
        this.f2710j = new a();
        this.f2705e = obj;
        this.f2707g = -1;
    }

    static void a(String str) {
        if (!l.c.f().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void c(LiveData<T>.c cVar) {
        if (cVar.f2716n) {
            if (!cVar.f()) {
                cVar.a(false);
                return;
            }
            int i10 = cVar.f2717o;
            int i11 = this.f2707g;
            if (i10 < i11) {
                cVar.f2717o = i11;
                cVar.f2715m.a(this.f2705e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i10) {
        int i11 = this.f2703c;
        this.f2703c = i10 + i11;
        if (!this.f2704d) {
            this.f2704d = true;
            while (true) {
                try {
                    int i12 = this.f2703c;
                    if (i11 != i12) {
                        boolean z9 = i11 == 0 && i12 > 0;
                        boolean z10 = i11 > 0 && i12 == 0;
                        if (z9) {
                            f();
                        } else if (z10) {
                            g();
                        }
                        i11 = i12;
                    } else {
                        return;
                    }
                } finally {
                    this.f2704d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(LiveData<T>.c cVar) {
        if (this.f2708h) {
            this.f2709i = true;
            return;
        }
        this.f2708h = true;
        do {
            this.f2709i = false;
            if (cVar == null) {
                m.b<K, V>.d f10 = this.f2702b.f();
                while (f10.hasNext()) {
                    c((c) ((Map.Entry) f10.next()).getValue());
                    if (this.f2709i) {
                        break;
                    }
                }
            } else {
                c(cVar);
                cVar = null;
            }
        } while (this.f2709i);
        this.f2708h = false;
    }

    public void e(r<? super T> rVar) {
        a("observeForever");
        b bVar = new b(rVar);
        c k10 = this.f2702b.k(rVar, bVar);
        if (k10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (k10 == null) {
            bVar.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    public void h(r<? super T> rVar) {
        a("removeObserver");
        c l10 = this.f2702b.l(rVar);
        if (l10 != null) {
            l10.e();
            l10.a(false);
        }
    }

    /* access modifiers changed from: protected */
    public void i(T t9) {
        a("setValue");
        this.f2707g++;
        this.f2705e = t9;
        d((LiveData<T>.c) null);
    }
}
