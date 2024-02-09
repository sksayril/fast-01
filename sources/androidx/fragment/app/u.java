package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.x;
import androidx.fragment.app.c0;
import androidx.lifecycle.g;
import androidx.lifecycle.g0;

class u {

    /* renamed from: a  reason: collision with root package name */
    private final m f2582a;

    /* renamed from: b  reason: collision with root package name */
    private final v f2583b;

    /* renamed from: c  reason: collision with root package name */
    private final Fragment f2584c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2585d = false;

    /* renamed from: e  reason: collision with root package name */
    private int f2586e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ View f2587m;

        a(View view) {
            this.f2587m = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f2587m.removeOnAttachStateChangeListener(this);
            x.d0(this.f2587m);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2589a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2589a = r0
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2589a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2589a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2589a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.u.b.<clinit>():void");
        }
    }

    u(m mVar, v vVar, Fragment fragment) {
        this.f2582a = mVar;
        this.f2583b = vVar;
        this.f2584c = fragment;
    }

    u(m mVar, v vVar, Fragment fragment, t tVar) {
        this.f2582a = mVar;
        this.f2583b = vVar;
        this.f2584c = fragment;
        fragment.f2317o = null;
        fragment.f2318p = null;
        fragment.D = 0;
        fragment.A = false;
        fragment.f2326x = false;
        Fragment fragment2 = fragment.f2322t;
        fragment.f2323u = fragment2 != null ? fragment2.f2320r : null;
        fragment.f2322t = null;
        Bundle bundle = tVar.f2581y;
        fragment.f2316n = bundle == null ? new Bundle() : bundle;
    }

    u(m mVar, v vVar, ClassLoader classLoader, j jVar, t tVar) {
        this.f2582a = mVar;
        this.f2583b = vVar;
        Fragment a10 = jVar.a(classLoader, tVar.f2569m);
        this.f2584c = a10;
        Bundle bundle = tVar.f2578v;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.u1(tVar.f2578v);
        a10.f2320r = tVar.f2570n;
        a10.f2328z = tVar.f2571o;
        a10.B = true;
        a10.I = tVar.f2572p;
        a10.J = tVar.f2573q;
        a10.K = tVar.f2574r;
        a10.N = tVar.f2575s;
        a10.f2327y = tVar.f2576t;
        a10.M = tVar.f2577u;
        a10.L = tVar.f2579w;
        a10.f2306d0 = g.b.values()[tVar.f2580x];
        Bundle bundle2 = tVar.f2581y;
        a10.f2316n = bundle2 == null ? new Bundle() : bundle2;
        if (n.E0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    private boolean l(View view) {
        if (view == this.f2584c.T) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2584c.T) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f2584c.h1(bundle);
        this.f2582a.j(this.f2584c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2584c.T != null) {
            s();
        }
        if (this.f2584c.f2317o != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2584c.f2317o);
        }
        if (this.f2584c.f2318p != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2584c.f2318p);
        }
        if (!this.f2584c.V) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2584c.V);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2584c);
        }
        Fragment fragment = this.f2584c;
        fragment.N0(fragment.f2316n);
        m mVar = this.f2582a;
        Fragment fragment2 = this.f2584c;
        mVar.a(fragment2, fragment2.f2316n, false);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        int j10 = this.f2583b.j(this.f2584c);
        Fragment fragment = this.f2584c;
        fragment.S.addView(fragment.T, j10);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2584c);
        }
        Fragment fragment = this.f2584c;
        Fragment fragment2 = fragment.f2322t;
        u uVar = null;
        if (fragment2 != null) {
            u m10 = this.f2583b.m(fragment2.f2320r);
            if (m10 != null) {
                Fragment fragment3 = this.f2584c;
                fragment3.f2323u = fragment3.f2322t.f2320r;
                fragment3.f2322t = null;
                uVar = m10;
            } else {
                throw new IllegalStateException("Fragment " + this.f2584c + " declared target fragment " + this.f2584c.f2322t + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.f2323u;
            if (str != null && (uVar = this.f2583b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2584c + " declared target fragment " + this.f2584c.f2323u + " that does not belong to this FragmentManager!");
            }
        }
        if (uVar != null && (n.P || uVar.k().f2315m < 1)) {
            uVar.m();
        }
        Fragment fragment4 = this.f2584c;
        fragment4.F = fragment4.E.s0();
        Fragment fragment5 = this.f2584c;
        fragment5.H = fragment5.E.v0();
        this.f2582a.g(this.f2584c, false);
        this.f2584c.O0();
        this.f2582a.b(this.f2584c, false);
    }

    /* access modifiers changed from: package-private */
    public int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f2584c;
        if (fragment2.E == null) {
            return fragment2.f2315m;
        }
        int i10 = this.f2586e;
        int i11 = b.f2589a[fragment2.f2306d0.ordinal()];
        if (i11 != 1) {
            i10 = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(i10, -1) : Math.min(i10, 0) : Math.min(i10, 1) : Math.min(i10, 5);
        }
        Fragment fragment3 = this.f2584c;
        if (fragment3.f2328z) {
            if (fragment3.A) {
                i10 = Math.max(this.f2586e, 2);
                View view = this.f2584c.T;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f2586e < 4 ? Math.min(i10, fragment3.f2315m) : Math.min(i10, 1);
            }
        }
        if (!this.f2584c.f2326x) {
            i10 = Math.min(i10, 1);
        }
        c0.e.b bVar = null;
        if (n.P && (viewGroup = fragment.S) != null) {
            bVar = c0.n(viewGroup, (fragment = this.f2584c).G()).l(this);
        }
        if (bVar == c0.e.b.ADDING) {
            i10 = Math.min(i10, 6);
        } else if (bVar == c0.e.b.REMOVING) {
            i10 = Math.max(i10, 3);
        } else {
            Fragment fragment4 = this.f2584c;
            if (fragment4.f2327y) {
                i10 = fragment4.Z() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        Fragment fragment5 = this.f2584c;
        if (fragment5.U && fragment5.f2315m < 5) {
            i10 = Math.min(i10, 4);
        }
        if (n.E0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + this.f2584c);
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2584c);
        }
        Fragment fragment = this.f2584c;
        if (!fragment.f2305c0) {
            this.f2582a.h(fragment, fragment.f2316n, false);
            Fragment fragment2 = this.f2584c;
            fragment2.R0(fragment2.f2316n);
            m mVar = this.f2582a;
            Fragment fragment3 = this.f2584c;
            mVar.c(fragment3, fragment3.f2316n, false);
            return;
        }
        fragment.o1(fragment.f2316n);
        this.f2584c.f2315m = 1;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        String str;
        if (!this.f2584c.f2328z) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2584c);
            }
            Fragment fragment = this.f2584c;
            LayoutInflater X0 = fragment.X0(fragment.f2316n);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.f2584c;
            ViewGroup viewGroup2 = fragment2.S;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i10 = fragment2.J;
                if (i10 != 0) {
                    if (i10 != -1) {
                        viewGroup = (ViewGroup) fragment2.E.n0().d(this.f2584c.J);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.f2584c;
                            if (!fragment3.B) {
                                try {
                                    str = fragment3.M().getResourceName(this.f2584c.J);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2584c.J) + " (" + str + ") for fragment " + this.f2584c);
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("Cannot create fragment " + this.f2584c + " for a container view with no id");
                    }
                }
            }
            Fragment fragment4 = this.f2584c;
            fragment4.S = viewGroup;
            fragment4.T0(X0, viewGroup, fragment4.f2316n);
            View view = this.f2584c.T;
            if (view != null) {
                boolean z9 = false;
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.f2584c;
                fragment5.T.setTag(f0.b.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment6 = this.f2584c;
                if (fragment6.L) {
                    fragment6.T.setVisibility(8);
                }
                if (x.O(this.f2584c.T)) {
                    x.d0(this.f2584c.T);
                } else {
                    View view2 = this.f2584c.T;
                    view2.addOnAttachStateChangeListener(new a(view2));
                }
                this.f2584c.k1();
                m mVar = this.f2582a;
                Fragment fragment7 = this.f2584c;
                mVar.m(fragment7, fragment7.T, fragment7.f2316n, false);
                int visibility = this.f2584c.T.getVisibility();
                float alpha = this.f2584c.T.getAlpha();
                if (n.P) {
                    this.f2584c.A1(alpha);
                    Fragment fragment8 = this.f2584c;
                    if (fragment8.S != null && visibility == 0) {
                        View findFocus = fragment8.T.findFocus();
                        if (findFocus != null) {
                            this.f2584c.v1(findFocus);
                            if (n.E0(2)) {
                                Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2584c);
                            }
                        }
                        this.f2584c.T.setAlpha(0.0f);
                    }
                } else {
                    Fragment fragment9 = this.f2584c;
                    if (visibility == 0 && fragment9.S != null) {
                        z9 = true;
                    }
                    fragment9.Y = z9;
                }
            }
            this.f2584c.f2315m = 2;
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        Fragment f10;
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2584c);
        }
        Fragment fragment = this.f2584c;
        boolean z9 = true;
        boolean z10 = fragment.f2327y && !fragment.Z();
        if (z10 || this.f2583b.o().o(this.f2584c)) {
            k<?> kVar = this.f2584c.F;
            if (kVar instanceof g0) {
                z9 = this.f2583b.o().l();
            } else if (kVar.h() instanceof Activity) {
                z9 = true ^ ((Activity) kVar.h()).isChangingConfigurations();
            }
            if (z10 || z9) {
                this.f2583b.o().f(this.f2584c);
            }
            this.f2584c.U0();
            this.f2582a.d(this.f2584c, false);
            for (u next : this.f2583b.k()) {
                if (next != null) {
                    Fragment k10 = next.k();
                    if (this.f2584c.f2320r.equals(k10.f2323u)) {
                        k10.f2322t = this.f2584c;
                        k10.f2323u = null;
                    }
                }
            }
            Fragment fragment2 = this.f2584c;
            String str = fragment2.f2323u;
            if (str != null) {
                fragment2.f2322t = this.f2583b.f(str);
            }
            this.f2583b.q(this);
            return;
        }
        String str2 = this.f2584c.f2323u;
        if (!(str2 == null || (f10 = this.f2583b.f(str2)) == null || !f10.N)) {
            this.f2584c.f2322t = f10;
        }
        this.f2584c.f2315m = 0;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        View view;
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2584c);
        }
        Fragment fragment = this.f2584c;
        ViewGroup viewGroup = fragment.S;
        if (!(viewGroup == null || (view = fragment.T) == null)) {
            viewGroup.removeView(view);
        }
        this.f2584c.V0();
        this.f2582a.n(this.f2584c, false);
        Fragment fragment2 = this.f2584c;
        fragment2.S = null;
        fragment2.T = null;
        fragment2.f2308f0 = null;
        fragment2.f2309g0.i(null);
        this.f2584c.A = false;
    }

    /* access modifiers changed from: package-private */
    public void i() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2584c);
        }
        this.f2584c.W0();
        boolean z9 = false;
        this.f2582a.e(this.f2584c, false);
        Fragment fragment = this.f2584c;
        fragment.f2315m = -1;
        fragment.F = null;
        fragment.H = null;
        fragment.E = null;
        if (fragment.f2327y && !fragment.Z()) {
            z9 = true;
        }
        if (z9 || this.f2583b.o().o(this.f2584c)) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f2584c);
            }
            this.f2584c.W();
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        Fragment fragment = this.f2584c;
        if (fragment.f2328z && fragment.A && !fragment.C) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2584c);
            }
            Fragment fragment2 = this.f2584c;
            fragment2.T0(fragment2.X0(fragment2.f2316n), (ViewGroup) null, this.f2584c.f2316n);
            View view = this.f2584c.T;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2584c;
                fragment3.T.setTag(f0.b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f2584c;
                if (fragment4.L) {
                    fragment4.T.setVisibility(8);
                }
                this.f2584c.k1();
                m mVar = this.f2582a;
                Fragment fragment5 = this.f2584c;
                mVar.m(fragment5, fragment5.T, fragment5.f2316n, false);
                this.f2584c.f2315m = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Fragment k() {
        return this.f2584c;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.f2585d) {
            boolean z9 = false;
            z9 = true;
            try {
                while (true) {
                    int d10 = d();
                    Fragment fragment = this.f2584c;
                    int i10 = fragment.f2315m;
                    if (d10 != i10) {
                        if (d10 <= i10) {
                            switch (i10 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f2584c.f2315m = z9 ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.A = z9;
                                    fragment.f2315m = 2;
                                    break;
                                case 3:
                                    if (n.E0(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2584c);
                                    }
                                    Fragment fragment2 = this.f2584c;
                                    if (fragment2.T != null && fragment2.f2317o == null) {
                                        s();
                                    }
                                    Fragment fragment3 = this.f2584c;
                                    if (!(fragment3.T == null || (viewGroup2 = fragment3.S) == null)) {
                                        c0.n(viewGroup2, fragment3.G()).d(this);
                                    }
                                    this.f2584c.f2315m = 3;
                                    break;
                                case 4:
                                    v();
                                    break;
                                case 5:
                                    fragment.f2315m = 5;
                                    break;
                                case 6:
                                    n();
                                    break;
                            }
                        } else {
                            switch (i10 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.T == null || (viewGroup3 = fragment.S) == null)) {
                                        c0.n(viewGroup3, fragment.G()).b(c0.e.c.from(this.f2584c.T.getVisibility()), this);
                                    }
                                    this.f2584c.f2315m = 4;
                                    break;
                                case 5:
                                    u();
                                    break;
                                case 6:
                                    fragment.f2315m = 6;
                                    break;
                                case 7:
                                    p();
                                    break;
                            }
                        }
                    } else {
                        if (n.P && fragment.Z) {
                            if (!(fragment.T == null || (viewGroup = fragment.S) == null)) {
                                c0 n10 = c0.n(viewGroup, fragment.G());
                                if (this.f2584c.L) {
                                    n10.c(this);
                                } else {
                                    n10.e(this);
                                }
                            }
                            Fragment fragment4 = this.f2584c;
                            n nVar = fragment4.E;
                            if (nVar != null) {
                                nVar.C0(fragment4);
                            }
                            Fragment fragment5 = this.f2584c;
                            fragment5.Z = z9;
                            fragment5.w0(fragment5.L);
                        }
                        this.f2585d = z9;
                        return;
                    }
                }
            } finally {
                this.f2585d = z9;
            }
        } else if (n.E0(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
        }
    }

    /* access modifiers changed from: package-private */
    public void n() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2584c);
        }
        this.f2584c.c1();
        this.f2582a.f(this.f2584c, false);
    }

    /* access modifiers changed from: package-private */
    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f2584c.f2316n;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f2584c;
            fragment.f2317o = fragment.f2316n.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f2584c;
            fragment2.f2318p = fragment2.f2316n.getBundle("android:view_registry_state");
            Fragment fragment3 = this.f2584c;
            fragment3.f2323u = fragment3.f2316n.getString("android:target_state");
            Fragment fragment4 = this.f2584c;
            if (fragment4.f2323u != null) {
                fragment4.f2324v = fragment4.f2316n.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.f2584c;
            Boolean bool = fragment5.f2319q;
            if (bool != null) {
                fragment5.V = bool.booleanValue();
                this.f2584c.f2319q = null;
            } else {
                fragment5.V = fragment5.f2316n.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.f2584c;
            if (!fragment6.V) {
                fragment6.U = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void p() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2584c);
        }
        View A = this.f2584c.A();
        if (A != null && l(A)) {
            boolean requestFocus = A.requestFocus();
            if (n.E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(A);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f2584c);
                sb.append(" resulting in focused view ");
                sb.append(this.f2584c.T.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f2584c.v1((View) null);
        this.f2584c.g1();
        this.f2582a.i(this.f2584c, false);
        Fragment fragment = this.f2584c;
        fragment.f2316n = null;
        fragment.f2317o = null;
        fragment.f2318p = null;
    }

    /* access modifiers changed from: package-private */
    public t r() {
        t tVar = new t(this.f2584c);
        Fragment fragment = this.f2584c;
        if (fragment.f2315m <= -1 || tVar.f2581y != null) {
            tVar.f2581y = fragment.f2316n;
        } else {
            Bundle q9 = q();
            tVar.f2581y = q9;
            if (this.f2584c.f2323u != null) {
                if (q9 == null) {
                    tVar.f2581y = new Bundle();
                }
                tVar.f2581y.putString("android:target_state", this.f2584c.f2323u);
                int i10 = this.f2584c.f2324v;
                if (i10 != 0) {
                    tVar.f2581y.putInt("android:target_req_state", i10);
                }
            }
        }
        return tVar;
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.f2584c.T != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f2584c.T.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f2584c.f2317o = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f2584c.f2308f0.g(bundle);
            if (!bundle.isEmpty()) {
                this.f2584c.f2318p = bundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void t(int i10) {
        this.f2586e = i10;
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2584c);
        }
        this.f2584c.i1();
        this.f2582a.k(this.f2584c, false);
    }

    /* access modifiers changed from: package-private */
    public void v() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2584c);
        }
        this.f2584c.j1();
        this.f2582a.l(this.f2584c, false);
    }
}
