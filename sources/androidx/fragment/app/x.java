package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class x {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f2620a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    static final z f2621b = new y();

    /* renamed from: c  reason: collision with root package name */
    static final z f2622c = w();

    class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f2623m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Fragment f2624n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2625o;

        a(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f2623m = gVar;
            this.f2624n = fragment;
            this.f2625o = eVar;
        }

        public void run() {
            this.f2623m.a(this.f2624n, this.f2625o);
        }
    }

    class b implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ArrayList f2626m;

        b(ArrayList arrayList) {
            this.f2626m = arrayList;
        }

        public void run() {
            x.A(this.f2626m, 4);
        }
    }

    class c implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g f2627m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Fragment f2628n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ androidx.core.os.e f2629o;

        c(g gVar, Fragment fragment, androidx.core.os.e eVar) {
            this.f2627m = gVar;
            this.f2628n = fragment;
            this.f2629o = eVar;
        }

        public void run() {
            this.f2627m.a(this.f2628n, this.f2629o);
        }
    }

    class d implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f2630m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ z f2631n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ View f2632o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Fragment f2633p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ ArrayList f2634q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ ArrayList f2635r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ ArrayList f2636s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ Object f2637t;

        d(Object obj, z zVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2630m = obj;
            this.f2631n = zVar;
            this.f2632o = view;
            this.f2633p = fragment;
            this.f2634q = arrayList;
            this.f2635r = arrayList2;
            this.f2636s = arrayList3;
            this.f2637t = obj2;
        }

        public void run() {
            Object obj = this.f2630m;
            if (obj != null) {
                this.f2631n.p(obj, this.f2632o);
                this.f2635r.addAll(x.k(this.f2631n, this.f2630m, this.f2633p, this.f2634q, this.f2632o));
            }
            if (this.f2636s != null) {
                if (this.f2637t != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f2632o);
                    this.f2631n.q(this.f2637t, this.f2636s, arrayList);
                }
                this.f2636s.clear();
                this.f2636s.add(this.f2632o);
            }
        }
    }

    class e implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Fragment f2638m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Fragment f2639n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ boolean f2640o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p.a f2641p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ View f2642q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ z f2643r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ Rect f2644s;

        e(Fragment fragment, Fragment fragment2, boolean z9, p.a aVar, View view, z zVar, Rect rect) {
            this.f2638m = fragment;
            this.f2639n = fragment2;
            this.f2640o = z9;
            this.f2641p = aVar;
            this.f2642q = view;
            this.f2643r = zVar;
            this.f2644s = rect;
        }

        public void run() {
            x.f(this.f2638m, this.f2639n, this.f2640o, this.f2641p, false);
            View view = this.f2642q;
            if (view != null) {
                this.f2643r.k(view, this.f2644s);
            }
        }
    }

    class f implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ z f2645m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p.a f2646n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Object f2647o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ h f2648p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ ArrayList f2649q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ View f2650r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ Fragment f2651s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ Fragment f2652t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ boolean f2653u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ ArrayList f2654v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ Object f2655w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ Rect f2656x;

        f(z zVar, p.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z9, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2645m = zVar;
            this.f2646n = aVar;
            this.f2647o = obj;
            this.f2648p = hVar;
            this.f2649q = arrayList;
            this.f2650r = view;
            this.f2651s = fragment;
            this.f2652t = fragment2;
            this.f2653u = z9;
            this.f2654v = arrayList2;
            this.f2655w = obj2;
            this.f2656x = rect;
        }

        public void run() {
            p.a<String, View> h10 = x.h(this.f2645m, this.f2646n, this.f2647o, this.f2648p);
            if (h10 != null) {
                this.f2649q.addAll(h10.values());
                this.f2649q.add(this.f2650r);
            }
            x.f(this.f2651s, this.f2652t, this.f2653u, h10, false);
            Object obj = this.f2647o;
            if (obj != null) {
                this.f2645m.A(obj, this.f2654v, this.f2649q);
                View s9 = x.s(h10, this.f2648p, this.f2655w, this.f2653u);
                if (s9 != null) {
                    this.f2645m.k(s9, this.f2656x);
                }
            }
        }
    }

    interface g {
        void a(Fragment fragment, androidx.core.os.e eVar);

        void b(Fragment fragment, androidx.core.os.e eVar);
    }

    static class h {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f2657a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2658b;

        /* renamed from: c  reason: collision with root package name */
        public a f2659c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f2660d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2661e;

        /* renamed from: f  reason: collision with root package name */
        public a f2662f;

        h() {
        }
    }

    static void A(ArrayList<View> arrayList, int i10) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i10);
            }
        }
    }

    static void B(Context context, g gVar, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, boolean z9, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i12 = i10; i12 < i11; i12++) {
            a aVar = arrayList.get(i12);
            if (arrayList2.get(i12).booleanValue()) {
                e(aVar, sparseArray, z9);
            } else {
                c(aVar, sparseArray, z9);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i13 = 0; i13 < size; i13++) {
                int keyAt = sparseArray.keyAt(i13);
                p.a<String, String> d10 = d(keyAt, arrayList, arrayList2, i10, i11);
                h hVar = (h) sparseArray.valueAt(i13);
                if (gVar.e() && (viewGroup = (ViewGroup) gVar.d(keyAt)) != null) {
                    if (z9) {
                        o(viewGroup, hVar, view, d10, gVar2);
                    } else {
                        n(viewGroup, hVar, view, d10, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, p.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m10 = aVar.m(size);
            if (collection.contains(androidx.core.view.x.H(m10))) {
                arrayList.add(m10);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.f2326x != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.L == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.w.a r9, android.util.SparseArray<androidx.fragment.app.x.h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f2613b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.J
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f2620a
            int r9 = r9.f2612a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f2612a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = 0
            r3 = 0
        L_0x002a:
            r4 = 0
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.Z
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.L
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f2326x
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.L
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.Z
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.f2326x
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.L
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.f2326x
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.L
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            boolean r9 = r0.f2326x
            if (r12 == 0) goto L_0x0072
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.T
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.f2303a0
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x0079
        L_0x0070:
            r9 = 0
            goto L_0x0079
        L_0x0072:
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.L
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x0079:
            r4 = r9
            r9 = 1
            r3 = 0
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.Y
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.f2326x
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.L
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r2 = r9
            r9 = 0
            goto L_0x002a
        L_0x0090:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.x$h r5 = (androidx.fragment.app.x.h) r5
            if (r2 == 0) goto L_0x00a2
            androidx.fragment.app.x$h r5 = p(r5, r10, r1)
            r5.f2657a = r0
            r5.f2658b = r11
            r5.f2659c = r8
        L_0x00a2:
            r2 = 0
            if (r12 != 0) goto L_0x00c3
            if (r3 == 0) goto L_0x00c3
            if (r5 == 0) goto L_0x00af
            androidx.fragment.app.Fragment r3 = r5.f2660d
            if (r3 != r0) goto L_0x00af
            r5.f2660d = r2
        L_0x00af:
            boolean r3 = r8.f2610r
            if (r3 != 0) goto L_0x00c3
            androidx.fragment.app.n r3 = r8.f2362t
            androidx.fragment.app.u r6 = r3.v(r0)
            androidx.fragment.app.v r7 = r3.q0()
            r7.p(r6)
            r3.O0(r0)
        L_0x00c3:
            if (r4 == 0) goto L_0x00d5
            if (r5 == 0) goto L_0x00cb
            androidx.fragment.app.Fragment r3 = r5.f2660d
            if (r3 != 0) goto L_0x00d5
        L_0x00cb:
            androidx.fragment.app.x$h r5 = p(r5, r10, r1)
            r5.f2660d = r0
            r5.f2661e = r11
            r5.f2662f = r8
        L_0x00d5:
            if (r12 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00e1
            if (r5 == 0) goto L_0x00e1
            androidx.fragment.app.Fragment r8 = r5.f2657a
            if (r8 != r0) goto L_0x00e1
            r5.f2657a = r2
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x.b(androidx.fragment.app.a, androidx.fragment.app.w$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(a aVar, SparseArray<h> sparseArray, boolean z9) {
        int size = aVar.f2595c.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(aVar, aVar.f2595c.get(i10), sparseArray, false, z9);
        }
    }

    private static p.a<String, String> d(int i10, ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i11, int i12) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        p.a<String, String> aVar = new p.a<>();
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            a aVar2 = arrayList.get(i13);
            if (aVar2.u(i10)) {
                boolean booleanValue = arrayList2.get(i13).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2608p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2608p;
                        arrayList4 = aVar2.f2609q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f2608p;
                        arrayList3 = aVar2.f2609q;
                        arrayList4 = arrayList6;
                    }
                    for (int i14 = 0; i14 < size; i14++) {
                        String str = arrayList4.get(i14);
                        String str2 = arrayList3.get(i14);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(a aVar, SparseArray<h> sparseArray, boolean z9) {
        if (aVar.f2362t.n0().e()) {
            for (int size = aVar.f2595c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f2595c.get(size), sparseArray, true, z9);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z9, p.a<String, View> aVar, boolean z10) {
        if (z9) {
            fragment2.w();
        } else {
            fragment.w();
        }
    }

    private static boolean g(z zVar, List<Object> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!zVar.e(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    static p.a<String, View> h(z zVar, p.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f2657a;
        View T = fragment.T();
        if (aVar.isEmpty() || obj == null || T == null) {
            aVar.clear();
            return null;
        }
        p.a<String, View> aVar2 = new p.a<>();
        zVar.j(aVar2, T);
        a aVar3 = hVar.f2659c;
        if (hVar.f2658b) {
            fragment.z();
            arrayList = aVar3.f2608p;
        } else {
            fragment.w();
            arrayList = aVar3.f2609q;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static p.a<String, View> i(z zVar, p.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2660d;
        p.a<String, View> aVar2 = new p.a<>();
        zVar.j(aVar2, fragment.n1());
        a aVar3 = hVar.f2662f;
        if (hVar.f2661e) {
            fragment.w();
            arrayList = aVar3.f2609q;
        } else {
            fragment.z();
            arrayList = aVar3.f2608p;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
        }
        aVar.o(aVar2.keySet());
        return aVar2;
    }

    private static z j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object y9 = fragment.y();
            if (y9 != null) {
                arrayList.add(y9);
            }
            Object N = fragment.N();
            if (N != null) {
                arrayList.add(N);
            }
            Object P = fragment.P();
            if (P != null) {
                arrayList.add(P);
            }
        }
        if (fragment2 != null) {
            Object v9 = fragment2.v();
            if (v9 != null) {
                arrayList.add(v9);
            }
            Object L = fragment2.L();
            if (L != null) {
                arrayList.add(L);
            }
            Object O = fragment2.O();
            if (O != null) {
                arrayList.add(O);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        z zVar = f2621b;
        if (zVar != null && g(zVar, arrayList)) {
            return zVar;
        }
        z zVar2 = f2622c;
        if (zVar2 != null && g(zVar2, arrayList)) {
            return zVar2;
        }
        if (zVar == null && zVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View T = fragment.T();
        if (T != null) {
            zVar.f(arrayList2, T);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        zVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(z zVar, ViewGroup viewGroup, View view, p.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        p.a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        z zVar2 = zVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f2657a;
        Fragment fragment2 = hVar2.f2660d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z9 = hVar2.f2658b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = t(zVar2, fragment, fragment2, z9);
            aVar2 = aVar;
        }
        p.a<String, View> i10 = i(zVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(i10.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        f(fragment, fragment2, z9, i10, true);
        if (obj4 != null) {
            rect = new Rect();
            zVar2.z(obj4, view, arrayList3);
            z(zVar, obj4, obj2, i10, hVar2.f2661e, hVar2.f2662f);
            if (obj5 != null) {
                zVar2.u(obj5, rect);
            }
        } else {
            rect = null;
        }
        f fVar = r0;
        f fVar2 = new f(zVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z9, arrayList, obj, rect);
        v.a(viewGroup, fVar);
        return obj4;
    }

    private static Object m(z zVar, ViewGroup viewGroup, View view, p.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        View view2;
        z zVar2 = zVar;
        View view3 = view;
        p.a<String, String> aVar2 = aVar;
        h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj4 = obj;
        Fragment fragment = hVar2.f2657a;
        Fragment fragment2 = hVar2.f2660d;
        if (fragment != null) {
            fragment.n1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z9 = hVar2.f2658b;
        Object t9 = aVar.isEmpty() ? null : t(zVar, fragment, fragment2, z9);
        p.a<String, View> i10 = i(zVar, aVar2, t9, hVar2);
        p.a<String, View> h10 = h(zVar, aVar2, t9, hVar2);
        if (aVar.isEmpty()) {
            if (i10 != null) {
                i10.clear();
            }
            if (h10 != null) {
                h10.clear();
            }
            obj3 = null;
        } else {
            a(arrayList3, i10, aVar.keySet());
            a(arrayList4, h10, aVar.values());
            obj3 = t9;
        }
        if (obj4 == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z9, i10, true);
        if (obj3 != null) {
            arrayList4.add(view3);
            zVar.z(obj3, view3, arrayList3);
            z(zVar, obj3, obj2, i10, hVar2.f2661e, hVar2.f2662f);
            Rect rect2 = new Rect();
            View s9 = s(h10, hVar2, obj4, z9);
            if (s9 != null) {
                zVar.u(obj4, rect2);
            }
            rect = rect2;
            view2 = s9;
        } else {
            view2 = null;
            rect = null;
        }
        v.a(viewGroup, new e(fragment, fragment2, z9, h10, view2, zVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, p.a<String, String> aVar, g gVar) {
        Object obj;
        ViewGroup viewGroup2 = viewGroup;
        h hVar2 = hVar;
        View view2 = view;
        p.a<String, String> aVar2 = aVar;
        g gVar2 = gVar;
        Fragment fragment = hVar2.f2657a;
        Fragment fragment2 = hVar2.f2660d;
        z j10 = j(fragment2, fragment);
        if (j10 != null) {
            boolean z9 = hVar2.f2658b;
            boolean z10 = hVar2.f2661e;
            Object q9 = q(j10, fragment, z9);
            Object r9 = r(j10, fragment2, z10);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = r9;
            z zVar = j10;
            Object l10 = l(j10, viewGroup, view, aVar, hVar, arrayList, arrayList2, q9, obj2);
            Object obj3 = q9;
            if (obj3 == null && l10 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList<View> k10 = k(zVar, obj, fragment2, arrayList4, view2);
            if (k10 == null || k10.isEmpty()) {
                obj = null;
            }
            Object obj4 = obj;
            zVar.a(obj3, view2);
            Object u9 = u(zVar, obj3, obj4, l10, fragment, hVar2.f2658b);
            if (!(fragment2 == null || k10 == null || (k10.size() <= 0 && arrayList4.size() <= 0))) {
                androidx.core.os.e eVar = new androidx.core.os.e();
                gVar2.b(fragment2, eVar);
                zVar.w(fragment2, u9, eVar, new c(gVar2, fragment2, eVar));
            }
            if (u9 != null) {
                ArrayList arrayList5 = new ArrayList();
                z zVar2 = zVar;
                zVar2.t(u9, obj3, arrayList5, obj4, k10, l10, arrayList2);
                y(zVar2, viewGroup, fragment, view, arrayList2, obj3, arrayList5, obj4, k10);
                ViewGroup viewGroup3 = viewGroup;
                z zVar3 = zVar;
                ArrayList arrayList6 = arrayList2;
                zVar3.x(viewGroup3, arrayList6, aVar2);
                zVar3.c(viewGroup3, u9);
                zVar3.s(viewGroup3, arrayList6, aVar2);
            }
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, p.a<String, String> aVar, g gVar) {
        Object obj;
        h hVar2 = hVar;
        View view2 = view;
        g gVar2 = gVar;
        Fragment fragment = hVar2.f2657a;
        Fragment fragment2 = hVar2.f2660d;
        z j10 = j(fragment2, fragment);
        if (j10 != null) {
            boolean z9 = hVar2.f2658b;
            boolean z10 = hVar2.f2661e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object q9 = q(j10, fragment, z9);
            Object r9 = r(j10, fragment2, z10);
            ArrayList arrayList3 = arrayList2;
            Object m10 = m(j10, viewGroup, view, aVar, hVar, arrayList2, arrayList, q9, r9);
            Object obj2 = q9;
            if (obj2 == null && m10 == null) {
                obj = r9;
                if (obj == null) {
                    return;
                }
            } else {
                obj = r9;
            }
            ArrayList<View> k10 = k(j10, obj, fragment2, arrayList3, view2);
            ArrayList<View> k11 = k(j10, obj2, fragment, arrayList, view2);
            A(k11, 4);
            Fragment fragment3 = fragment;
            ArrayList<View> arrayList4 = k10;
            Object u9 = u(j10, obj2, obj, m10, fragment3, z9);
            if (!(fragment2 == null || arrayList4 == null || (arrayList4.size() <= 0 && arrayList3.size() <= 0))) {
                androidx.core.os.e eVar = new androidx.core.os.e();
                g gVar3 = gVar;
                gVar3.b(fragment2, eVar);
                j10.w(fragment2, u9, eVar, new a(gVar3, fragment2, eVar));
            }
            if (u9 != null) {
                v(j10, obj, fragment2, arrayList4);
                ArrayList<String> o10 = j10.o(arrayList);
                z zVar = j10;
                zVar.t(u9, obj2, k11, obj, arrayList4, m10, arrayList);
                ViewGroup viewGroup2 = viewGroup;
                j10.c(viewGroup2, u9);
                zVar.y(viewGroup2, arrayList3, arrayList, o10, aVar);
                A(k11, 0);
                j10.A(m10, arrayList3, arrayList);
            }
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i10) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i10, hVar2);
        return hVar2;
    }

    private static Object q(z zVar, Fragment fragment, boolean z9) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z9 ? fragment.L() : fragment.v());
    }

    private static Object r(z zVar, Fragment fragment, boolean z9) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z9 ? fragment.N() : fragment.y());
    }

    static View s(p.a<String, View> aVar, h hVar, Object obj, boolean z9) {
        ArrayList<String> arrayList;
        a aVar2 = hVar.f2659c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2608p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z9 ? aVar2.f2608p : aVar2.f2609q).get(0));
    }

    private static Object t(z zVar, Fragment fragment, Fragment fragment2, boolean z9) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return zVar.B(zVar.g(z9 ? fragment2.P() : fragment.O()));
    }

    private static Object u(z zVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z9) {
        return (obj == null || obj2 == null || fragment == null) ? true : z9 ? fragment.p() : fragment.o() ? zVar.n(obj2, obj, obj3) : zVar.m(obj2, obj, obj3);
    }

    private static void v(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.f2326x && fragment.L && fragment.Z) {
            fragment.w1(true);
            zVar.r(obj, fragment.T(), arrayList);
            v.a(fragment.S, new b(arrayList));
        }
    }

    private static z w() {
        try {
            return v0.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static void x(p.a<String, String> aVar, p.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void y(z zVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        v.a(viewGroup, new d(obj, zVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(z zVar, Object obj, Object obj2, p.a<String, View> aVar, boolean z9, a aVar2) {
        ArrayList<String> arrayList = aVar2.f2608p;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z9 ? aVar2.f2609q : aVar2.f2608p).get(0));
            zVar.v(obj, view);
            if (obj2 != null) {
                zVar.v(obj2, view);
            }
        }
    }
}
