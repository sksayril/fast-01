package c4;

import com.google.firebase.crashlytics.internal.common.i;
import com.google.firebase.crashlytics.internal.common.n;
import d4.f0;
import g4.f;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class m {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final f f3621a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n f3622b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f3623c;

    /* renamed from: d  reason: collision with root package name */
    private final a f3624d = new a(false);

    /* renamed from: e  reason: collision with root package name */
    private final a f3625e = new a(true);

    /* renamed from: f  reason: collision with root package name */
    private final j f3626f = new j(128);

    /* renamed from: g  reason: collision with root package name */
    private final AtomicMarkableReference<String> f3627g = new AtomicMarkableReference<>((Object) null, false);

    private class a {

        /* renamed from: a  reason: collision with root package name */
        final AtomicMarkableReference<d> f3628a;

        /* renamed from: b  reason: collision with root package name */
        private final AtomicReference<Callable<Void>> f3629b = new AtomicReference<>((Object) null);

        /* renamed from: c  reason: collision with root package name */
        private final boolean f3630c;

        public a(boolean z9) {
            this.f3630c = z9;
            this.f3628a = new AtomicMarkableReference<>(new d(64, z9 ? 8192 : 1024), false);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Void c() {
            this.f3629b.set((Object) null);
            e();
            return null;
        }

        private void d() {
            l lVar = new l(this);
            if (this.f3629b.compareAndSet((Object) null, lVar)) {
                m.this.f3622b.h(lVar);
            }
        }

        private void e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f3628a.isMarked()) {
                    map = this.f3628a.getReference().a();
                    AtomicMarkableReference<d> atomicMarkableReference = this.f3628a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                m.this.f3621a.q(m.this.f3623c, map, this.f3630c);
            }
        }

        public Map<String, String> b() {
            return this.f3628a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                if (!this.f3628a.getReference().d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<d> atomicMarkableReference = this.f3628a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                d();
                return true;
            }
        }
    }

    public m(String str, f fVar, n nVar) {
        this.f3623c = str;
        this.f3621a = new f(fVar);
        this.f3622b = nVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object i() {
        l();
        return null;
    }

    public static m j(String str, f fVar, n nVar) {
        f fVar2 = new f(fVar);
        m mVar = new m(str, fVar, nVar);
        mVar.f3624d.f3628a.getReference().e(fVar2.i(str, false));
        mVar.f3625e.f3628a.getReference().e(fVar2.i(str, true));
        mVar.f3627g.set(fVar2.k(str), false);
        mVar.f3626f.c(fVar2.j(str));
        return mVar;
    }

    public static String k(String str, f fVar) {
        return new f(fVar).k(str);
    }

    private void l() {
        boolean z9;
        String str;
        synchronized (this.f3627g) {
            z9 = false;
            if (this.f3627g.isMarked()) {
                str = h();
                this.f3627g.set(str, false);
                z9 = true;
            } else {
                str = null;
            }
        }
        if (z9) {
            this.f3621a.s(this.f3623c, str);
        }
    }

    public Map<String, String> e() {
        return this.f3624d.b();
    }

    public Map<String, String> f() {
        return this.f3625e.b();
    }

    public List<f0.e.d.C0122e> g() {
        return this.f3626f.a();
    }

    public String h() {
        return this.f3627g.getReference();
    }

    public boolean m(String str, String str2) {
        return this.f3624d.f(str, str2);
    }

    public boolean n(String str, String str2) {
        return this.f3625e.f(str, str2);
    }

    public void o(String str) {
        synchronized (this.f3623c) {
            this.f3623c = str;
            Map<String, String> b10 = this.f3624d.b();
            List<i> b11 = this.f3626f.b();
            if (h() != null) {
                this.f3621a.s(str, h());
            }
            if (!b10.isEmpty()) {
                this.f3621a.p(str, b10);
            }
            if (!b11.isEmpty()) {
                this.f3621a.r(str, b11);
            }
        }
    }

    public void p(String str) {
        String c10 = d.c(str, 1024);
        synchronized (this.f3627g) {
            if (!i.y(c10, this.f3627g.getReference())) {
                this.f3627g.set(c10, true);
                this.f3622b.h(new k(this));
            }
        }
    }
}
