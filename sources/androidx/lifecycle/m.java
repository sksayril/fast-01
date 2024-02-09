package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import l.c;

public class m extends g {

    /* renamed from: j  reason: collision with root package name */
    public static final a f2754j = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2755b;

    /* renamed from: c  reason: collision with root package name */
    private m.a<k, b> f2756c;

    /* renamed from: d  reason: collision with root package name */
    private g.b f2757d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<l> f2758e;

    /* renamed from: f  reason: collision with root package name */
    private int f2759f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2760g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2761h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<g.b> f2762i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final g.b a(g.b bVar, g.b bVar2) {
            l.e(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private g.b f2763a;

        /* renamed from: b  reason: collision with root package name */
        private j f2764b;

        public b(k kVar, g.b bVar) {
            l.e(bVar, "initialState");
            l.b(kVar);
            this.f2764b = o.f(kVar);
            this.f2763a = bVar;
        }

        public final void a(l lVar, g.a aVar) {
            l.e(aVar, "event");
            g.b targetState = aVar.getTargetState();
            this.f2763a = m.f2754j.a(this.f2763a, targetState);
            j jVar = this.f2764b;
            l.b(lVar);
            jVar.h(lVar, aVar);
            this.f2763a = targetState;
        }

        public final g.b b() {
            return this.f2763a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m(l lVar) {
        this(lVar, true);
        l.e(lVar, "provider");
    }

    private m(l lVar, boolean z9) {
        this.f2755b = z9;
        this.f2756c = new m.a<>();
        this.f2757d = g.b.INITIALIZED;
        this.f2762i = new ArrayList<>();
        this.f2758e = new WeakReference<>(lVar);
    }

    private final void d(l lVar) {
        Iterator<Map.Entry<k, b>> descendingIterator = this.f2756c.descendingIterator();
        l.d(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f2761h) {
            Map.Entry next = descendingIterator.next();
            l.d(next, "next()");
            k kVar = (k) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f2757d) > 0 && !this.f2761h && this.f2756c.contains(kVar)) {
                g.a a10 = g.a.Companion.a(bVar.b());
                if (a10 != null) {
                    m(a10.getTargetState());
                    bVar.a(lVar, a10);
                    l();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = r4.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.lifecycle.g.b e(androidx.lifecycle.k r4) {
        /*
            r3 = this;
            m.a<androidx.lifecycle.k, androidx.lifecycle.m$b> r0 = r3.f2756c
            java.util.Map$Entry r4 = r0.o(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.m$b r4 = (androidx.lifecycle.m.b) r4
            if (r4 == 0) goto L_0x0016
            androidx.lifecycle.g$b r4 = r4.b()
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            java.util.ArrayList<androidx.lifecycle.g$b> r1 = r3.f2762i
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x002f
            java.util.ArrayList<androidx.lifecycle.g$b> r0 = r3.f2762i
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.g$b r0 = (androidx.lifecycle.g.b) r0
        L_0x002f:
            androidx.lifecycle.m$a r1 = f2754j
            androidx.lifecycle.g$b r2 = r3.f2757d
            androidx.lifecycle.g$b r4 = r1.a(r2, r4)
            androidx.lifecycle.g$b r4 = r1.a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m.e(androidx.lifecycle.k):androidx.lifecycle.g$b");
    }

    @SuppressLint({"RestrictedApi"})
    private final void f(String str) {
        if (this.f2755b && !c.f().b()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void g(l lVar) {
        m.b<K, V>.d f10 = this.f2756c.f();
        l.d(f10, "observerMap.iteratorWithAdditions()");
        while (f10.hasNext() && !this.f2761h) {
            Map.Entry entry = (Map.Entry) f10.next();
            k kVar = (k) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f2757d) < 0 && !this.f2761h && this.f2756c.contains(kVar)) {
                m(bVar.b());
                g.a c10 = g.a.Companion.c(bVar.b());
                if (c10 != null) {
                    bVar.a(lVar, c10);
                    l();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    private final boolean i() {
        if (this.f2756c.size() == 0) {
            return true;
        }
        Map.Entry<k, b> c10 = this.f2756c.c();
        l.b(c10);
        g.b b10 = c10.getValue().b();
        Map.Entry<k, b> g10 = this.f2756c.g();
        l.b(g10);
        g.b b11 = g10.getValue().b();
        return b10 == b11 && this.f2757d == b11;
    }

    private final void k(g.b bVar) {
        g.b bVar2 = this.f2757d;
        if (bVar2 != bVar) {
            if ((bVar2 == g.b.INITIALIZED && bVar == g.b.DESTROYED) ? false : true) {
                this.f2757d = bVar;
                if (this.f2760g || this.f2759f != 0) {
                    this.f2761h = true;
                    return;
                }
                this.f2760g = true;
                o();
                this.f2760g = false;
                if (this.f2757d == g.b.DESTROYED) {
                    this.f2756c = new m.a<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException(("no event down from " + this.f2757d + " in component " + this.f2758e.get()).toString());
        }
    }

    private final void l() {
        ArrayList<g.b> arrayList = this.f2762i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void m(g.b bVar) {
        this.f2762i.add(bVar);
    }

    private final void o() {
        l lVar = (l) this.f2758e.get();
        if (lVar != null) {
            while (true) {
                boolean i10 = i();
                this.f2761h = false;
                if (!i10) {
                    g.b bVar = this.f2757d;
                    Map.Entry<k, b> c10 = this.f2756c.c();
                    l.b(c10);
                    if (bVar.compareTo(c10.getValue().b()) < 0) {
                        d(lVar);
                    }
                    Map.Entry<k, b> g10 = this.f2756c.g();
                    if (!this.f2761h && g10 != null && this.f2757d.compareTo(g10.getValue().b()) > 0) {
                        g(lVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
    }

    public void a(k kVar) {
        l lVar;
        l.e(kVar, "observer");
        f("addObserver");
        g.b bVar = this.f2757d;
        g.b bVar2 = g.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = g.b.INITIALIZED;
        }
        b bVar3 = new b(kVar, bVar2);
        if (this.f2756c.k(kVar, bVar3) == null && (lVar = (l) this.f2758e.get()) != null) {
            boolean z9 = this.f2759f != 0 || this.f2760g;
            g.b e10 = e(kVar);
            this.f2759f++;
            while (bVar3.b().compareTo(e10) < 0 && this.f2756c.contains(kVar)) {
                m(bVar3.b());
                g.a c10 = g.a.Companion.c(bVar3.b());
                if (c10 != null) {
                    bVar3.a(lVar, c10);
                    l();
                    e10 = e(kVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
            }
            if (!z9) {
                o();
            }
            this.f2759f--;
        }
    }

    public g.b b() {
        return this.f2757d;
    }

    public void c(k kVar) {
        l.e(kVar, "observer");
        f("removeObserver");
        this.f2756c.l(kVar);
    }

    public void h(g.a aVar) {
        l.e(aVar, "event");
        f("handleLifecycleEvent");
        k(aVar.getTargetState());
    }

    public void j(g.b bVar) {
        l.e(bVar, "state");
        f("markState");
        n(bVar);
    }

    public void n(g.b bVar) {
        l.e(bVar, "state");
        f("setCurrentState");
        k(bVar);
    }
}
