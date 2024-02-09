package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.e;
import androidx.core.view.a0;
import androidx.core.view.v;
import androidx.core.view.x;
import androidx.fragment.app.c0;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class c extends c0 {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2385a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.fragment.app.c0$e$c[] r0 = androidx.fragment.app.c0.e.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2385a = r0
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.GONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2385a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.INVISIBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2385a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.REMOVED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2385a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.fragment.app.c0$e$c r1 = androidx.fragment.app.c0.e.c.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.a.<clinit>():void");
        }
    }

    class b implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ List f2386m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c0.e f2387n;

        b(List list, c0.e eVar) {
            this.f2386m = list;
            this.f2387n = eVar;
        }

        public void run() {
            if (this.f2386m.contains(this.f2387n)) {
                this.f2386m.remove(this.f2387n);
                c.this.s(this.f2387n);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    class C0046c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2390b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f2391c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c0.e f2392d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f2393e;

        C0046c(ViewGroup viewGroup, View view, boolean z9, c0.e eVar, k kVar) {
            this.f2389a = viewGroup;
            this.f2390b = view;
            this.f2391c = z9;
            this.f2392d = eVar;
            this.f2393e = kVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2389a.endViewTransition(this.f2390b);
            if (this.f2391c) {
                this.f2392d.e().applyState(this.f2390b);
            }
            this.f2393e.a();
        }
    }

    class d implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Animator f2395a;

        d(Animator animator) {
            this.f2395a = animator;
        }

        public void a() {
            this.f2395a.end();
        }
    }

    class e implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2397a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2398b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f2399c;

        class a implements Runnable {
            a() {
            }

            public void run() {
                e eVar = e.this;
                eVar.f2397a.endViewTransition(eVar.f2398b);
                e.this.f2399c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f2397a = viewGroup;
            this.f2398b = view;
            this.f2399c = kVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f2397a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f2402a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2403b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f2404c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f2402a = view;
            this.f2403b = viewGroup;
            this.f2404c = kVar;
        }

        public void a() {
            this.f2402a.clearAnimation();
            this.f2403b.endViewTransition(this.f2402a);
            this.f2404c.a();
        }
    }

    class g implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c0.e f2406m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c0.e f2407n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f2408o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p.a f2409p;

        g(c0.e eVar, c0.e eVar2, boolean z9, p.a aVar) {
            this.f2406m = eVar;
            this.f2407n = eVar2;
            this.f2408o = z9;
            this.f2409p = aVar;
        }

        public void run() {
            x.f(this.f2406m.f(), this.f2407n.f(), this.f2408o, this.f2409p, false);
        }
    }

    class h implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ z f2411m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ View f2412n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Rect f2413o;

        h(z zVar, View view, Rect rect) {
            this.f2411m = zVar;
            this.f2412n = view;
            this.f2413o = rect;
        }

        public void run() {
            this.f2411m.k(this.f2412n, this.f2413o);
        }
    }

    class i implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ArrayList f2415m;

        i(ArrayList arrayList) {
            this.f2415m = arrayList;
        }

        public void run() {
            x.A(this.f2415m, 4);
        }
    }

    class j implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m f2417m;

        j(m mVar) {
            this.f2417m = mVar;
        }

        public void run() {
            this.f2417m.a();
        }
    }

    private static class k extends l {

        /* renamed from: c  reason: collision with root package name */
        private boolean f2419c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f2420d = false;

        /* renamed from: e  reason: collision with root package name */
        private f.d f2421e;

        k(c0.e eVar, androidx.core.os.e eVar2, boolean z9) {
            super(eVar, eVar2);
            this.f2419c = z9;
        }

        /* access modifiers changed from: package-private */
        public f.d e(Context context) {
            if (this.f2420d) {
                return this.f2421e;
            }
            f.d c10 = f.c(context, b().f(), b().e() == c0.e.c.VISIBLE, this.f2419c);
            this.f2421e = c10;
            this.f2420d = true;
            return c10;
        }
    }

    private static class l {

        /* renamed from: a  reason: collision with root package name */
        private final c0.e f2422a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.os.e f2423b;

        l(c0.e eVar, androidx.core.os.e eVar2) {
            this.f2422a = eVar;
            this.f2423b = eVar2;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f2422a.d(this.f2423b);
        }

        /* access modifiers changed from: package-private */
        public c0.e b() {
            return this.f2422a;
        }

        /* access modifiers changed from: package-private */
        public androidx.core.os.e c() {
            return this.f2423b;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0014, code lost:
            r2 = androidx.fragment.app.c0.e.c.VISIBLE;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d() {
            /*
                r3 = this;
                androidx.fragment.app.c0$e r0 = r3.f2422a
                androidx.fragment.app.Fragment r0 = r0.f()
                android.view.View r0 = r0.T
                androidx.fragment.app.c0$e$c r0 = androidx.fragment.app.c0.e.c.from((android.view.View) r0)
                androidx.fragment.app.c0$e r1 = r3.f2422a
                androidx.fragment.app.c0$e$c r1 = r1.e()
                if (r0 == r1) goto L_0x001d
                androidx.fragment.app.c0$e$c r2 = androidx.fragment.app.c0.e.c.VISIBLE
                if (r0 == r2) goto L_0x001b
                if (r1 == r2) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r0 = 0
                goto L_0x001e
            L_0x001d:
                r0 = 1
            L_0x001e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.l.d():boolean");
        }
    }

    private static class m extends l {

        /* renamed from: c  reason: collision with root package name */
        private final Object f2424c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f2425d;

        /* renamed from: e  reason: collision with root package name */
        private final Object f2426e;

        m(c0.e eVar, androidx.core.os.e eVar2, boolean z9, boolean z10) {
            super(eVar, eVar2);
            boolean z11;
            Object obj;
            if (eVar.e() == c0.e.c.VISIBLE) {
                Fragment f10 = eVar.f();
                this.f2424c = z9 ? f10.L() : f10.v();
                Fragment f11 = eVar.f();
                z11 = z9 ? f11.p() : f11.o();
            } else {
                Fragment f12 = eVar.f();
                this.f2424c = z9 ? f12.N() : f12.y();
                z11 = true;
            }
            this.f2425d = z11;
            if (z10) {
                Fragment f13 = eVar.f();
                obj = z9 ? f13.P() : f13.O();
            } else {
                obj = null;
            }
            this.f2426e = obj;
        }

        private z f(Object obj) {
            if (obj == null) {
                return null;
            }
            z zVar = x.f2621b;
            if (zVar != null && zVar.e(obj)) {
                return zVar;
            }
            z zVar2 = x.f2622c;
            if (zVar2 != null && zVar2.e(obj)) {
                return zVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* access modifiers changed from: package-private */
        public z e() {
            z f10 = f(this.f2424c);
            z f11 = f(this.f2426e);
            if (f10 == null || f11 == null || f10 == f11) {
                return f10 != null ? f10 : f11;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f2424c + " which uses a different Transition  type than its shared element transition " + this.f2426e);
        }

        public Object g() {
            return this.f2426e;
        }

        /* access modifiers changed from: package-private */
        public Object h() {
            return this.f2424c;
        }

        public boolean i() {
            return this.f2426e != null;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            return this.f2425d;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<c0.e> list2, boolean z9, Map<c0.e, Boolean> map) {
        StringBuilder sb;
        String str;
        f.d e10;
        ViewGroup m10 = m();
        Context context = m10.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (k next : list) {
            if (!next.d() && (e10 = next.e(context)) != null) {
                Animator animator = e10.f2481b;
                if (animator == null) {
                    arrayList.add(next);
                } else {
                    c0.e b10 = next.b();
                    Fragment f10 = b10.f();
                    if (Boolean.TRUE.equals(map.get(b10))) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + f10 + " as this Fragment was involved in a Transition.");
                        }
                        next.a();
                    } else {
                        boolean z11 = b10.e() == c0.e.c.GONE;
                        List<c0.e> list3 = list2;
                        if (z11) {
                            list3.remove(b10);
                        }
                        View view = f10.T;
                        m10.startViewTransition(view);
                        C0046c cVar = r0;
                        C0046c cVar2 = new C0046c(m10, view, z11, b10, next);
                        animator.addListener(cVar);
                        animator.setTarget(view);
                        animator.start();
                        next.c().c(new d(animator));
                        z10 = true;
                    }
                }
            } else {
                next.a();
            }
            Map<c0.e, Boolean> map2 = map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            c0.e b11 = kVar.b();
            Fragment f11 = b11.f();
            if (z9) {
                if (n.E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f11);
                    str = " as Animations cannot run alongside Transitions.";
                }
                kVar.a();
            } else if (z10) {
                if (n.E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(f11);
                    str = " as Animations cannot run alongside Animators.";
                }
                kVar.a();
            } else {
                View view2 = f11.T;
                Animation animation = (Animation) androidx.core.util.h.j(((f.d) androidx.core.util.h.j(kVar.e(context))).f2480a);
                if (b11.e() != c0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar.a();
                } else {
                    m10.startViewTransition(view2);
                    f.e eVar = new f.e(animation, m10, view2);
                    eVar.setAnimationListener(new e(m10, view2, kVar));
                    view2.startAnimation(eVar);
                }
                kVar.c().c(new f(view2, m10, kVar));
            }
            sb.append(str);
            Log.v("FragmentManager", sb.toString());
            kVar.a();
        }
    }

    private Map<c0.e, Boolean> x(List<m> list, List<c0.e> list2, boolean z9, c0.e eVar, c0.e eVar2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        View view;
        View view2;
        Object obj;
        c0.e eVar3;
        c0.e eVar4;
        Object obj2;
        Object obj3;
        p.a aVar;
        c0.e eVar5;
        z zVar;
        View view3;
        Rect rect;
        ArrayList arrayList3;
        c0.e eVar6;
        ArrayList arrayList4;
        boolean z10 = z9;
        c0.e eVar7 = eVar;
        c0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        z zVar2 = null;
        for (m next : list) {
            if (!next.d()) {
                z e10 = next.e();
                if (zVar2 == null) {
                    zVar2 = e10;
                } else if (!(e10 == null || zVar2 == e10)) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + next.b().f() + " returned Transition " + next.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar2 == null) {
            for (m next2 : list) {
                hashMap.put(next2.b(), Boolean.FALSE);
                next2.a();
            }
            return hashMap;
        }
        View view4 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        p.a aVar2 = new p.a();
        Object obj4 = null;
        View view5 = null;
        boolean z11 = false;
        for (m next3 : list) {
            if (!next3.i() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList4 = arrayList6;
                eVar6 = eVar7;
                arrayList3 = arrayList5;
                rect = rect2;
                view3 = view4;
                zVar = zVar2;
                eVar5 = eVar8;
                view5 = view5;
            } else {
                Object B = zVar2.B(zVar2.g(next3.g()));
                ArrayList<String> Q = eVar2.f().Q();
                ArrayList<String> Q2 = eVar.f().Q();
                ArrayList<String> R = eVar.f().R();
                Object obj5 = B;
                View view6 = view5;
                int i10 = 0;
                while (i10 < R.size()) {
                    int indexOf = Q.indexOf(R.get(i10));
                    ArrayList<String> arrayList7 = R;
                    if (indexOf != -1) {
                        Q.set(indexOf, Q2.get(i10));
                    }
                    i10++;
                    R = arrayList7;
                }
                ArrayList<String> R2 = eVar2.f().R();
                Fragment f10 = eVar.f();
                if (!z10) {
                    f10.z();
                    eVar2.f().w();
                } else {
                    f10.w();
                    eVar2.f().z();
                }
                int i11 = 0;
                for (int size = Q.size(); i11 < size; size = size) {
                    aVar2.put(Q.get(i11), R2.get(i11));
                    i11++;
                }
                p.a aVar3 = new p.a();
                u(aVar3, eVar.f().T);
                aVar3.o(Q);
                aVar2.o(aVar3.keySet());
                p.a aVar4 = new p.a();
                u(aVar4, eVar2.f().T);
                aVar4.o(R2);
                aVar4.o(aVar2.values());
                x.x(aVar2, aVar4);
                v(aVar3, aVar2.keySet());
                v(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList4 = arrayList6;
                    eVar6 = eVar7;
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    zVar = zVar2;
                    view5 = view6;
                    obj4 = null;
                    eVar5 = eVar8;
                } else {
                    x.f(eVar2.f(), eVar.f(), z10, aVar3, true);
                    ArrayList<String> arrayList8 = Q;
                    g gVar = r0;
                    ViewGroup m10 = m();
                    Object obj6 = obj5;
                    p.a aVar5 = aVar4;
                    View view7 = view6;
                    p.a aVar6 = aVar3;
                    aVar = aVar2;
                    ArrayList arrayList9 = arrayList6;
                    g gVar2 = new g(eVar2, eVar, z9, aVar5);
                    v.a(m10, gVar2);
                    arrayList5.addAll(aVar6.values());
                    if (!arrayList8.isEmpty()) {
                        View view8 = (View) aVar6.get(arrayList8.get(0));
                        zVar2.v(obj6, view8);
                        view5 = view8;
                    } else {
                        view5 = view7;
                    }
                    arrayList4 = arrayList9;
                    arrayList4.addAll(aVar5.values());
                    if (!R2.isEmpty()) {
                        View view9 = (View) aVar5.get(R2.get(0));
                        if (view9 != null) {
                            v.a(m(), new h(zVar2, view9, rect2));
                            z11 = true;
                        }
                    }
                    zVar2.z(obj6, view4, arrayList5);
                    arrayList3 = arrayList5;
                    rect = rect2;
                    view3 = view4;
                    zVar = zVar2;
                    zVar2.t(obj6, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, obj6, arrayList4);
                    Boolean bool = Boolean.TRUE;
                    eVar6 = eVar;
                    hashMap.put(eVar6, bool);
                    eVar5 = eVar2;
                    hashMap.put(eVar5, bool);
                    obj4 = obj6;
                }
            }
            eVar7 = eVar6;
            arrayList5 = arrayList3;
            rect2 = rect;
            view4 = view3;
            eVar8 = eVar5;
            aVar2 = aVar;
            z10 = z9;
            arrayList6 = arrayList4;
            zVar2 = zVar;
        }
        View view10 = view5;
        p.a aVar7 = aVar2;
        ArrayList arrayList10 = arrayList6;
        c0.e eVar9 = eVar7;
        ArrayList arrayList11 = arrayList5;
        Rect rect3 = rect2;
        View view11 = view4;
        z zVar3 = zVar2;
        c0.e eVar10 = eVar8;
        ArrayList arrayList12 = new ArrayList();
        Object obj7 = null;
        Object obj8 = null;
        for (m next4 : list) {
            if (next4.d()) {
                hashMap.put(next4.b(), Boolean.FALSE);
                next4.a();
            } else {
                Object g10 = zVar3.g(next4.h());
                c0.e b10 = next4.b();
                boolean z12 = obj4 != null && (b10 == eVar9 || b10 == eVar10);
                if (g10 == null) {
                    if (!z12) {
                        hashMap.put(b10, Boolean.FALSE);
                        next4.a();
                    }
                    List<c0.e> list3 = list2;
                    arrayList = arrayList10;
                    arrayList2 = arrayList11;
                    view = view11;
                    obj = obj7;
                    eVar3 = eVar10;
                    view2 = view10;
                } else {
                    ArrayList arrayList13 = new ArrayList();
                    Object obj9 = obj7;
                    t(arrayList13, b10.f().T);
                    if (z12) {
                        if (b10 == eVar9) {
                            arrayList13.removeAll(arrayList11);
                        } else {
                            arrayList13.removeAll(arrayList10);
                        }
                    }
                    if (arrayList13.isEmpty()) {
                        zVar3.a(g10, view11);
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        view = view11;
                        eVar4 = b10;
                        obj3 = obj8;
                        eVar3 = eVar10;
                        List<c0.e> list4 = list2;
                        obj2 = obj9;
                    } else {
                        zVar3.b(g10, arrayList13);
                        view = view11;
                        obj2 = obj9;
                        c0.e eVar11 = b10;
                        arrayList2 = arrayList11;
                        obj3 = obj8;
                        arrayList = arrayList10;
                        eVar3 = eVar10;
                        zVar3.t(g10, g10, arrayList13, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                        if (eVar11.e() == c0.e.c.GONE) {
                            eVar4 = eVar11;
                            list2.remove(eVar4);
                            ArrayList arrayList14 = new ArrayList(arrayList13);
                            arrayList14.remove(eVar4.f().T);
                            zVar3.r(g10, eVar4.f().T, arrayList14);
                            v.a(m(), new i(arrayList13));
                        } else {
                            List<c0.e> list5 = list2;
                            eVar4 = eVar11;
                        }
                    }
                    if (eVar4.e() == c0.e.c.VISIBLE) {
                        arrayList12.addAll(arrayList13);
                        if (z11) {
                            zVar3.u(g10, rect3);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        zVar3.v(g10, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (next4.j()) {
                        obj8 = zVar3.n(obj3, g10, (Object) null);
                        obj = obj2;
                    } else {
                        obj = zVar3.n(obj2, g10, (Object) null);
                        obj8 = obj3;
                    }
                }
                eVar10 = eVar3;
                obj7 = obj;
                view10 = view2;
                view11 = view;
                arrayList11 = arrayList2;
                arrayList10 = arrayList;
            }
        }
        ArrayList arrayList15 = arrayList10;
        ArrayList arrayList16 = arrayList11;
        c0.e eVar12 = eVar10;
        Object m11 = zVar3.m(obj8, obj7, obj4);
        for (m next5 : list) {
            if (!next5.d()) {
                Object h10 = next5.h();
                c0.e b11 = next5.b();
                boolean z13 = obj4 != null && (b11 == eVar9 || b11 == eVar12);
                if (h10 != null || z13) {
                    if (!x.P(m())) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b11);
                        }
                        next5.a();
                    } else {
                        zVar3.w(next5.b().f(), m11, next5.c(), new j(next5));
                    }
                }
            }
        }
        if (!x.P(m())) {
            return hashMap;
        }
        x.A(arrayList12, 4);
        ArrayList arrayList17 = arrayList15;
        ArrayList<String> o10 = zVar3.o(arrayList17);
        zVar3.c(m(), m11);
        zVar3.y(m(), arrayList16, arrayList17, o10, aVar7);
        x.A(arrayList12, 0);
        zVar3.A(obj4, arrayList16, arrayList17);
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void f(List<c0.e> list, boolean z9) {
        c0.e eVar = null;
        c0.e eVar2 = null;
        for (c0.e next : list) {
            c0.e.c from = c0.e.c.from(next.f().T);
            int i10 = a.f2385a[next.e().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                if (from == c0.e.c.VISIBLE && eVar == null) {
                    eVar = next;
                }
            } else if (i10 == 4 && from != c0.e.c.VISIBLE) {
                eVar2 = next;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<c0.e> arrayList3 = new ArrayList<>(list);
        for (c0.e next2 : list) {
            androidx.core.os.e eVar3 = new androidx.core.os.e();
            next2.j(eVar3);
            arrayList.add(new k(next2, eVar3, z9));
            androidx.core.os.e eVar4 = new androidx.core.os.e();
            next2.j(eVar4);
            boolean z10 = false;
            if (z9) {
                if (next2 != eVar) {
                    arrayList2.add(new m(next2, eVar4, z9, z10));
                    next2.a(new b(arrayList3, next2));
                }
            } else if (next2 != eVar2) {
                arrayList2.add(new m(next2, eVar4, z9, z10));
                next2.a(new b(arrayList3, next2));
            }
            z10 = true;
            arrayList2.add(new m(next2, eVar4, z9, z10));
            next2.a(new b(arrayList3, next2));
        }
        Map<c0.e, Boolean> x9 = x(arrayList2, arrayList3, z9, eVar, eVar2);
        w(arrayList, arrayList3, x9.containsValue(Boolean.TRUE), x9);
        for (c0.e s9 : arrayList3) {
            s(s9);
        }
        arrayList3.clear();
    }

    /* access modifiers changed from: package-private */
    public void s(c0.e eVar) {
        eVar.e().applyState(eVar.f().T);
    }

    /* access modifiers changed from: package-private */
    public void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!a0.a(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        t(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* access modifiers changed from: package-private */
    public void u(Map<String, View> map, View view) {
        String H = x.H(view);
        if (H != null) {
            map.put(H, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(p.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(x.H((View) it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
