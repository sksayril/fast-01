package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.e;
import androidx.core.view.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f2427a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<e> f2428b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<e> f2429c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    boolean f2430d = false;

    /* renamed from: e  reason: collision with root package name */
    boolean f2431e = false;

    class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f2432m;

        a(d dVar) {
            this.f2432m = dVar;
        }

        public void run() {
            if (c0.this.f2428b.contains(this.f2432m)) {
                this.f2432m.e().applyState(this.f2432m.f().T);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f2434m;

        b(d dVar) {
            this.f2434m = dVar;
        }

        public void run() {
            c0.this.f2428b.remove(this.f2434m);
            c0.this.f2429c.remove(this.f2434m);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2436a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f2437b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                androidx.fragment.app.c0$e$b[] r0 = androidx.fragment.app.c0.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2437b = r0
                r1 = 1
                androidx.fragment.app.c0$e$b r2 = androidx.fragment.app.c0.e.b.ADDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2437b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$b r3 = androidx.fragment.app.c0.e.b.REMOVING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f2437b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$b r4 = androidx.fragment.app.c0.e.b.NONE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                androidx.fragment.app.c0$e$c[] r3 = androidx.fragment.app.c0.e.c.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f2436a = r3
                androidx.fragment.app.c0$e$c r4 = androidx.fragment.app.c0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f2436a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.fragment.app.c0$e$c r3 = androidx.fragment.app.c0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f2436a     // Catch:{ NoSuchFieldError -> 0x004d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f2436a     // Catch:{ NoSuchFieldError -> 0x0058 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c0.c.<clinit>():void");
        }
    }

    private static class d extends e {

        /* renamed from: h  reason: collision with root package name */
        private final u f2438h;

        d(e.c cVar, e.b bVar, u uVar, androidx.core.os.e eVar) {
            super(cVar, bVar, uVar.k(), eVar);
            this.f2438h = uVar;
        }

        public void c() {
            super.c();
            this.f2438h.m();
        }

        /* access modifiers changed from: package-private */
        public void l() {
            if (g() == e.b.ADDING) {
                Fragment k10 = this.f2438h.k();
                View findFocus = k10.T.findFocus();
                if (findFocus != null) {
                    k10.v1(findFocus);
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k10);
                    }
                }
                View n12 = f().n1();
                if (n12.getParent() == null) {
                    this.f2438h.b();
                    n12.setAlpha(0.0f);
                }
                if (n12.getAlpha() == 0.0f && n12.getVisibility() == 0) {
                    n12.setVisibility(4);
                }
                n12.setAlpha(k10.K());
            }
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        private c f2439a;

        /* renamed from: b  reason: collision with root package name */
        private b f2440b;

        /* renamed from: c  reason: collision with root package name */
        private final Fragment f2441c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Runnable> f2442d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private final HashSet<androidx.core.os.e> f2443e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        private boolean f2444f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f2445g = false;

        class a implements e.b {
            a() {
            }

            public void a() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c from(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i10);
            }

            static c from(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            /* access modifiers changed from: package-private */
            public void applyState(View view) {
                int i10;
                int i11 = c.f2436a[ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i10 = 0;
                    } else if (i11 == 3) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i10 = 8;
                    } else if (i11 == 4) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    } else {
                        return;
                    }
                    view.setVisibility(i10);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f2439a = cVar;
            this.f2440b = bVar;
            this.f2441c = fragment;
            eVar.c(new a());
        }

        /* access modifiers changed from: package-private */
        public final void a(Runnable runnable) {
            this.f2442d.add(runnable);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            if (!h()) {
                this.f2444f = true;
                if (this.f2443e.isEmpty()) {
                    c();
                    return;
                }
                Iterator it = new ArrayList(this.f2443e).iterator();
                while (it.hasNext()) {
                    ((androidx.core.os.e) it.next()).a();
                }
            }
        }

        public void c() {
            if (!this.f2445g) {
                if (n.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f2445g = true;
                for (Runnable run : this.f2442d) {
                    run.run();
                }
            }
        }

        public final void d(androidx.core.os.e eVar) {
            if (this.f2443e.remove(eVar) && this.f2443e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f2439a;
        }

        public final Fragment f() {
            return this.f2441c;
        }

        /* access modifiers changed from: package-private */
        public b g() {
            return this.f2440b;
        }

        /* access modifiers changed from: package-private */
        public final boolean h() {
            return this.f2444f;
        }

        /* access modifiers changed from: package-private */
        public final boolean i() {
            return this.f2445g;
        }

        public final void j(androidx.core.os.e eVar) {
            l();
            this.f2443e.add(eVar);
        }

        /* access modifiers changed from: package-private */
        public final void k(c cVar, b bVar) {
            b bVar2;
            int i10 = c.f2437b[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2441c + " mFinalState = " + this.f2439a + " -> REMOVED. mLifecycleImpact  = " + this.f2440b + " to REMOVING.");
                    }
                    this.f2439a = c.REMOVED;
                    bVar2 = b.REMOVING;
                } else if (i10 == 3 && this.f2439a != c.REMOVED) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2441c + " mFinalState = " + this.f2439a + " -> " + cVar + ". ");
                    }
                    this.f2439a = cVar;
                    return;
                } else {
                    return;
                }
            } else if (this.f2439a == c.REMOVED) {
                if (n.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2441c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2440b + " to ADDING.");
                }
                this.f2439a = c.VISIBLE;
                bVar2 = b.ADDING;
            } else {
                return;
            }
            this.f2440b = bVar2;
        }

        /* access modifiers changed from: package-private */
        public void l() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f2439a + "} " + "{" + "mLifecycleImpact = " + this.f2440b + "} " + "{" + "mFragment = " + this.f2441c + "}";
        }
    }

    c0(ViewGroup viewGroup) {
        this.f2427a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, u uVar) {
        synchronized (this.f2428b) {
            androidx.core.os.e eVar = new androidx.core.os.e();
            e h10 = h(uVar.k());
            if (h10 != null) {
                h10.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, uVar, eVar);
            this.f2428b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        Iterator<e> it = this.f2428b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        Iterator<e> it = this.f2429c.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f().equals(fragment) && !next.h()) {
                return next;
            }
        }
        return null;
    }

    static c0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.x0());
    }

    static c0 o(ViewGroup viewGroup, d0 d0Var) {
        int i10 = f0.b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof c0) {
            return (c0) tag;
        }
        c0 a10 = d0Var.a(viewGroup);
        viewGroup.setTag(i10, a10);
        return a10;
    }

    private void q() {
        Iterator<e> it = this.f2428b.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g() == e.b.ADDING) {
                next.k(e.c.from(next.f().n1().getVisibility()), e.b.NONE);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(e.c cVar, u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar.k());
        }
        a(cVar, e.b.ADDING, uVar);
    }

    /* access modifiers changed from: package-private */
    public void c(u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar.k());
        }
        a(e.c.GONE, e.b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    public void d(u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, uVar);
    }

    /* access modifiers changed from: package-private */
    public void e(u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, uVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void f(List<e> list, boolean z9);

    /* access modifiers changed from: package-private */
    public void g() {
        if (!this.f2431e) {
            if (!x.O(this.f2427a)) {
                j();
                this.f2430d = false;
                return;
            }
            synchronized (this.f2428b) {
                if (!this.f2428b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2429c);
                    this.f2429c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f2429c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f2428b);
                    this.f2428b.clear();
                    this.f2429c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((e) it2.next()).l();
                    }
                    f(arrayList2, this.f2430d);
                    this.f2430d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        String str;
        String str2;
        boolean O = x.O(this.f2427a);
        synchronized (this.f2428b) {
            q();
            Iterator<e> it = this.f2428b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            Iterator it2 = new ArrayList(this.f2429c).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (n.E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (O) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f2427a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.b();
            }
            Iterator it3 = new ArrayList(this.f2428b).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (n.E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (O) {
                        str = "";
                    } else {
                        str = "Container " + this.f2427a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k() {
        if (this.f2431e) {
            this.f2431e = false;
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public e.b l(u uVar) {
        e h10 = h(uVar.k());
        e.b g10 = h10 != null ? h10.g() : null;
        e i10 = i(uVar.k());
        return (i10 == null || !(g10 == null || g10 == e.b.NONE)) ? g10 : i10.g();
    }

    public ViewGroup m() {
        return this.f2427a;
    }

    /* access modifiers changed from: package-private */
    public void p() {
        synchronized (this.f2428b) {
            q();
            this.f2431e = false;
            int size = this.f2428b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f2428b.get(size);
                e.c from = e.c.from(eVar.f().T);
                e.c e10 = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (e10 == cVar && from != cVar) {
                    this.f2431e = eVar.f().b0();
                    break;
                }
                size--;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z9) {
        this.f2430d = z9;
    }
}
