package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.s;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, l, g0, androidx.lifecycle.f, s0.d {

    /* renamed from: m0  reason: collision with root package name */
    static final Object f2302m0 = new Object();
    boolean A;
    boolean B;
    boolean C;
    int D;
    n E;
    k<?> F;
    n G = new o();
    Fragment H;
    int I;
    int J;
    String K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    boolean Q = true;
    private boolean R;
    ViewGroup S;
    View T;
    boolean U;
    boolean V = true;
    e W;
    Runnable X = new a();
    boolean Y;
    boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    float f2303a0;

    /* renamed from: b0  reason: collision with root package name */
    LayoutInflater f2304b0;

    /* renamed from: c0  reason: collision with root package name */
    boolean f2305c0;

    /* renamed from: d0  reason: collision with root package name */
    g.b f2306d0 = g.b.RESUMED;

    /* renamed from: e0  reason: collision with root package name */
    m f2307e0;

    /* renamed from: f0  reason: collision with root package name */
    a0 f2308f0;

    /* renamed from: g0  reason: collision with root package name */
    q<l> f2309g0 = new q<>();

    /* renamed from: h0  reason: collision with root package name */
    c0.b f2310h0;

    /* renamed from: i0  reason: collision with root package name */
    s0.c f2311i0;

    /* renamed from: j0  reason: collision with root package name */
    private int f2312j0;

    /* renamed from: k0  reason: collision with root package name */
    private final AtomicInteger f2313k0 = new AtomicInteger();

    /* renamed from: l0  reason: collision with root package name */
    private final ArrayList<g> f2314l0 = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    int f2315m = -1;

    /* renamed from: n  reason: collision with root package name */
    Bundle f2316n;

    /* renamed from: o  reason: collision with root package name */
    SparseArray<Parcelable> f2317o;

    /* renamed from: p  reason: collision with root package name */
    Bundle f2318p;

    /* renamed from: q  reason: collision with root package name */
    Boolean f2319q;

    /* renamed from: r  reason: collision with root package name */
    String f2320r = UUID.randomUUID().toString();

    /* renamed from: s  reason: collision with root package name */
    Bundle f2321s;

    /* renamed from: t  reason: collision with root package name */
    Fragment f2322t;

    /* renamed from: u  reason: collision with root package name */
    String f2323u = null;

    /* renamed from: v  reason: collision with root package name */
    int f2324v;

    /* renamed from: w  reason: collision with root package name */
    private Boolean f2325w = null;

    /* renamed from: x  reason: collision with root package name */
    boolean f2326x;

    /* renamed from: y  reason: collision with root package name */
    boolean f2327y;

    /* renamed from: z  reason: collision with root package name */
    boolean f2328z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Fragment.this.D1();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            Fragment.this.f(false);
        }
    }

    class c implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c0 f2332m;

        c(c0 c0Var) {
            this.f2332m = c0Var;
        }

        public void run() {
            this.f2332m.g();
        }
    }

    class d extends g {
        d() {
        }

        public View d(int i10) {
            View view = Fragment.this.T;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        public boolean e() {
            return Fragment.this.T != null;
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        View f2335a;

        /* renamed from: b  reason: collision with root package name */
        Animator f2336b;

        /* renamed from: c  reason: collision with root package name */
        boolean f2337c;

        /* renamed from: d  reason: collision with root package name */
        int f2338d;

        /* renamed from: e  reason: collision with root package name */
        int f2339e;

        /* renamed from: f  reason: collision with root package name */
        int f2340f;

        /* renamed from: g  reason: collision with root package name */
        int f2341g;

        /* renamed from: h  reason: collision with root package name */
        int f2342h;

        /* renamed from: i  reason: collision with root package name */
        ArrayList<String> f2343i;

        /* renamed from: j  reason: collision with root package name */
        ArrayList<String> f2344j;

        /* renamed from: k  reason: collision with root package name */
        Object f2345k = null;

        /* renamed from: l  reason: collision with root package name */
        Object f2346l;

        /* renamed from: m  reason: collision with root package name */
        Object f2347m;

        /* renamed from: n  reason: collision with root package name */
        Object f2348n;

        /* renamed from: o  reason: collision with root package name */
        Object f2349o;

        /* renamed from: p  reason: collision with root package name */
        Object f2350p;

        /* renamed from: q  reason: collision with root package name */
        Boolean f2351q;

        /* renamed from: r  reason: collision with root package name */
        Boolean f2352r;

        /* renamed from: s  reason: collision with root package name */
        float f2353s;

        /* renamed from: t  reason: collision with root package name */
        View f2354t;

        /* renamed from: u  reason: collision with root package name */
        boolean f2355u;

        /* renamed from: v  reason: collision with root package name */
        h f2356v;

        /* renamed from: w  reason: collision with root package name */
        boolean f2357w;

        e() {
            Object obj = Fragment.f2302m0;
            this.f2346l = obj;
            this.f2347m = null;
            this.f2348n = obj;
            this.f2349o = null;
            this.f2350p = obj;
            this.f2353s = 1.0f;
            this.f2354t = null;
        }
    }

    public static class f extends RuntimeException {
        public f(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class g {
        private g() {
        }

        /* access modifiers changed from: package-private */
        public abstract void a();
    }

    interface h {
        void a();

        void b();
    }

    public Fragment() {
        V();
    }

    private int D() {
        g.b bVar = this.f2306d0;
        return (bVar == g.b.INITIALIZED || this.H == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.H.D());
    }

    private void V() {
        this.f2307e0 = new m(this);
        this.f2311i0 = s0.c.a(this);
        this.f2310h0 = null;
    }

    @Deprecated
    public static Fragment X(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) j.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.u1(bundle);
            }
            return fragment;
        } catch (InstantiationException e10) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (IllegalAccessException e11) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private e i() {
        if (this.W == null) {
            this.W = new e();
        }
        return this.W;
    }

    private void p1() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.T != null) {
            q1(this.f2316n);
        }
        this.f2316n = null;
    }

    /* access modifiers changed from: package-private */
    public View A() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2354t;
    }

    public boolean A0(MenuItem menuItem) {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void A1(float f10) {
        i().f2353s = f10;
    }

    public final Object B() {
        k<?> kVar = this.F;
        if (kVar == null) {
            return null;
        }
        return kVar.m();
    }

    public void B0(Menu menu) {
    }

    /* access modifiers changed from: package-private */
    public void B1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        i();
        e eVar = this.W;
        eVar.f2343i = arrayList;
        eVar.f2344j = arrayList2;
    }

    @Deprecated
    public LayoutInflater C(Bundle bundle) {
        k<?> kVar = this.F;
        if (kVar != null) {
            LayoutInflater n10 = kVar.n();
            androidx.core.view.g.a(n10, this.G.t0());
            return n10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void C0() {
        this.R = true;
    }

    @Deprecated
    public void C1(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.F != null) {
            G().K0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void D0(boolean z9) {
    }

    public void D1() {
        if (this.W != null && i().f2355u) {
            if (this.F == null) {
                i().f2355u = false;
            } else if (Looper.myLooper() != this.F.i().getLooper()) {
                this.F.i().postAtFrontOfQueue(new b());
            } else {
                f(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int E() {
        e eVar = this.W;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2342h;
    }

    public void E0(Menu menu) {
    }

    public final Fragment F() {
        return this.H;
    }

    public void F0(boolean z9) {
    }

    public final n G() {
        n nVar = this.E;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Deprecated
    public void G0(int i10, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        e eVar = this.W;
        if (eVar == null) {
            return false;
        }
        return eVar.f2337c;
    }

    public void H0() {
        this.R = true;
    }

    /* access modifiers changed from: package-private */
    public int I() {
        e eVar = this.W;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2340f;
    }

    public void I0(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public int J() {
        e eVar = this.W;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2341g;
    }

    public void J0() {
        this.R = true;
    }

    /* access modifiers changed from: package-private */
    public float K() {
        e eVar = this.W;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.f2353s;
    }

    public void K0() {
        this.R = true;
    }

    public Object L() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2348n;
        return obj == f2302m0 ? y() : obj;
    }

    public void L0(View view, Bundle bundle) {
    }

    public final Resources M() {
        return m1().getResources();
    }

    public void M0(Bundle bundle) {
        this.R = true;
    }

    public Object N() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2346l;
        return obj == f2302m0 ? v() : obj;
    }

    /* access modifiers changed from: package-private */
    public void N0(Bundle bundle) {
        this.G.Q0();
        this.f2315m = 3;
        this.R = false;
        g0(bundle);
        if (this.R) {
            p1();
            this.G.y();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public Object O() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2349o;
    }

    /* access modifiers changed from: package-private */
    public void O0() {
        Iterator<g> it = this.f2314l0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f2314l0.clear();
        this.G.j(this.F, g(), this);
        this.f2315m = 0;
        this.R = false;
        j0(this.F.h());
        if (this.R) {
            this.E.I(this);
            this.G.z();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onAttach()");
    }

    public Object P() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2350p;
        return obj == f2302m0 ? O() : obj;
    }

    /* access modifiers changed from: package-private */
    public void P0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.G.A(configuration);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f2343i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> Q() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$e r0 = r1.W
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f2343i
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.Q():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    public boolean Q0(MenuItem menuItem) {
        if (this.L) {
            return false;
        }
        if (l0(menuItem)) {
            return true;
        }
        return this.G.B(menuItem);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f2344j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> R() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$e r0 = r1.W
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f2344j
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.R():java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    public void R0(Bundle bundle) {
        this.G.Q0();
        this.f2315m = 1;
        this.R = false;
        this.f2307e0.a(new j() {
            public void h(l lVar, g.a aVar) {
                View view;
                if (aVar == g.a.ON_STOP && (view = Fragment.this.T) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.f2311i0.d(bundle);
        m0(bundle);
        this.f2305c0 = true;
        if (this.R) {
            this.f2307e0.h(g.a.ON_CREATE);
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onCreate()");
    }

    @Deprecated
    public final Fragment S() {
        String str;
        Fragment fragment = this.f2322t;
        if (fragment != null) {
            return fragment;
        }
        n nVar = this.E;
        if (nVar == null || (str = this.f2323u) == null) {
            return null;
        }
        return nVar.f0(str);
    }

    /* access modifiers changed from: package-private */
    public boolean S0(Menu menu, MenuInflater menuInflater) {
        boolean z9 = false;
        if (this.L) {
            return false;
        }
        if (this.P && this.Q) {
            z9 = true;
            p0(menu, menuInflater);
        }
        return z9 | this.G.D(menu, menuInflater);
    }

    public View T() {
        return this.T;
    }

    /* access modifiers changed from: package-private */
    public void T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.G.Q0();
        this.C = true;
        this.f2308f0 = new a0(this, l());
        View q02 = q0(layoutInflater, viewGroup, bundle);
        this.T = q02;
        if (q02 != null) {
            this.f2308f0.c();
            h0.a(this.T, this.f2308f0);
            i0.a(this.T, this.f2308f0);
            s0.e.a(this.T, this.f2308f0);
            this.f2309g0.i(this.f2308f0);
        } else if (!this.f2308f0.d()) {
            this.f2308f0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public LiveData<l> U() {
        return this.f2309g0;
    }

    /* access modifiers changed from: package-private */
    public void U0() {
        this.G.E();
        this.f2307e0.h(g.a.ON_DESTROY);
        this.f2315m = 0;
        this.R = false;
        this.f2305c0 = false;
        r0();
        if (!this.R) {
            throw new e0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    public void V0() {
        this.G.F();
        if (this.T != null && this.f2308f0.a().b().isAtLeast(g.b.CREATED)) {
            this.f2308f0.b(g.a.ON_DESTROY);
        }
        this.f2315m = 1;
        this.R = false;
        t0();
        if (this.R) {
            androidx.loader.app.a.b(this).c();
            this.C = false;
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void W() {
        V();
        this.f2320r = UUID.randomUUID().toString();
        this.f2326x = false;
        this.f2327y = false;
        this.f2328z = false;
        this.A = false;
        this.B = false;
        this.D = 0;
        this.E = null;
        this.G = new o();
        this.F = null;
        this.I = 0;
        this.J = 0;
        this.K = null;
        this.L = false;
        this.M = false;
    }

    /* access modifiers changed from: package-private */
    public void W0() {
        this.f2315m = -1;
        this.R = false;
        u0();
        this.f2304b0 = null;
        if (!this.R) {
            throw new e0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.G.D0()) {
            this.G.E();
            this.G = new o();
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater X0(Bundle bundle) {
        LayoutInflater v02 = v0(bundle);
        this.f2304b0 = v02;
        return v02;
    }

    /* access modifiers changed from: package-private */
    public boolean Y() {
        e eVar = this.W;
        if (eVar == null) {
            return false;
        }
        return eVar.f2357w;
    }

    /* access modifiers changed from: package-private */
    public void Y0() {
        onLowMemory();
        this.G.G();
    }

    /* access modifiers changed from: package-private */
    public final boolean Z() {
        return this.D > 0;
    }

    /* access modifiers changed from: package-private */
    public void Z0(boolean z9) {
        z0(z9);
        this.G.H(z9);
    }

    public androidx.lifecycle.g a() {
        return this.f2307e0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a0() {
        /*
            r2 = this;
            boolean r0 = r2.Q
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.n r0 = r2.E
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.H
            boolean r0 = r0.G0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.a0():boolean");
    }

    /* access modifiers changed from: package-private */
    public boolean a1(MenuItem menuItem) {
        if (this.L) {
            return false;
        }
        if (!this.P || !this.Q || !A0(menuItem)) {
            return this.G.J(menuItem);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean b0() {
        e eVar = this.W;
        if (eVar == null) {
            return false;
        }
        return eVar.f2355u;
    }

    /* access modifiers changed from: package-private */
    public void b1(Menu menu) {
        if (!this.L) {
            if (this.P && this.Q) {
                B0(menu);
            }
            this.G.K(menu);
        }
    }

    public final boolean c0() {
        return this.f2327y;
    }

    /* access modifiers changed from: package-private */
    public void c1() {
        this.G.M();
        if (this.T != null) {
            this.f2308f0.b(g.a.ON_PAUSE);
        }
        this.f2307e0.h(g.a.ON_PAUSE);
        this.f2315m = 6;
        this.R = false;
        C0();
        if (!this.R) {
            throw new e0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d0() {
        Fragment F2 = F();
        return F2 != null && (F2.c0() || F2.d0());
    }

    /* access modifiers changed from: package-private */
    public void d1(boolean z9) {
        D0(z9);
        this.G.N(z9);
    }

    public /* synthetic */ j0.a e() {
        return androidx.lifecycle.e.a(this);
    }

    public final boolean e0() {
        n nVar = this.E;
        if (nVar == null) {
            return false;
        }
        return nVar.J0();
    }

    /* access modifiers changed from: package-private */
    public boolean e1(Menu menu) {
        boolean z9 = false;
        if (this.L) {
            return false;
        }
        if (this.P && this.Q) {
            z9 = true;
            E0(menu);
        }
        return z9 | this.G.O(menu);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    public void f(boolean z9) {
        ViewGroup viewGroup;
        n nVar;
        e eVar = this.W;
        h hVar = null;
        if (eVar != null) {
            eVar.f2355u = false;
            h hVar2 = eVar.f2356v;
            eVar.f2356v = null;
            hVar = hVar2;
        }
        if (hVar != null) {
            hVar.a();
        } else if (n.P && this.T != null && (viewGroup = this.S) != null && (nVar = this.E) != null) {
            c0 n10 = c0.n(viewGroup, nVar);
            n10.p();
            if (z9) {
                this.F.i().post(new c(n10));
            } else {
                n10.g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f0() {
        this.G.Q0();
    }

    /* access modifiers changed from: package-private */
    public void f1() {
        boolean H0 = this.E.H0(this);
        Boolean bool = this.f2325w;
        if (bool == null || bool.booleanValue() != H0) {
            this.f2325w = Boolean.valueOf(H0);
            F0(H0);
            this.G.P();
        }
    }

    /* access modifiers changed from: package-private */
    public g g() {
        return new d();
    }

    @Deprecated
    public void g0(Bundle bundle) {
        this.R = true;
    }

    /* access modifiers changed from: package-private */
    public void g1() {
        this.G.Q0();
        this.G.a0(true);
        this.f2315m = 7;
        this.R = false;
        H0();
        if (this.R) {
            m mVar = this.f2307e0;
            g.a aVar = g.a.ON_RESUME;
            mVar.h(aVar);
            if (this.T != null) {
                this.f2308f0.b(aVar);
            }
            this.G.Q();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onResume()");
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.I));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.J));
        printWriter.print(" mTag=");
        printWriter.println(this.K);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2315m);
        printWriter.print(" mWho=");
        printWriter.print(this.f2320r);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2326x);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2327y);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2328z);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.L);
        printWriter.print(" mDetached=");
        printWriter.print(this.M);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.Q);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.P);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.N);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.V);
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.E);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.F);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.H);
        }
        if (this.f2321s != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2321s);
        }
        if (this.f2316n != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2316n);
        }
        if (this.f2317o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2317o);
        }
        if (this.f2318p != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2318p);
        }
        Fragment S2 = S();
        if (S2 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(S2);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2324v);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(H());
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(u());
        }
        if (x() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(x());
        }
        if (I() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(I());
        }
        if (J() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(J());
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.S);
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.T);
        }
        if (q() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(q());
        }
        if (t() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.G + ":");
        n nVar = this.G;
        nVar.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void h0(int i10, int i11, Intent intent) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    /* access modifiers changed from: package-private */
    public void h1(Bundle bundle) {
        I0(bundle);
        this.f2311i0.e(bundle);
        Parcelable e12 = this.G.e1();
        if (e12 != null) {
            bundle.putParcelable("android:support:fragments", e12);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    @Deprecated
    public void i0(Activity activity) {
        this.R = true;
    }

    /* access modifiers changed from: package-private */
    public void i1() {
        this.G.Q0();
        this.G.a0(true);
        this.f2315m = 5;
        this.R = false;
        J0();
        if (this.R) {
            m mVar = this.f2307e0;
            g.a aVar = g.a.ON_START;
            mVar.h(aVar);
            if (this.T != null) {
                this.f2308f0.b(aVar);
            }
            this.G.R();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onStart()");
    }

    public void j0(Context context) {
        this.R = true;
        k<?> kVar = this.F;
        Activity f10 = kVar == null ? null : kVar.f();
        if (f10 != null) {
            this.R = false;
            i0(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public void j1() {
        this.G.T();
        if (this.T != null) {
            this.f2308f0.b(g.a.ON_STOP);
        }
        this.f2307e0.h(g.a.ON_STOP);
        this.f2315m = 4;
        this.R = false;
        K0();
        if (!this.R) {
            throw new e0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public final androidx.savedstate.a k() {
        return this.f2311i0.b();
    }

    @Deprecated
    public void k0(Fragment fragment) {
    }

    /* access modifiers changed from: package-private */
    public void k1() {
        L0(this.T, this.f2316n);
        this.G.U();
    }

    public f0 l() {
        if (this.E == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (D() != g.b.INITIALIZED.ordinal()) {
            return this.E.z0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public boolean l0(MenuItem menuItem) {
        return false;
    }

    public final e l1() {
        e n10 = n();
        if (n10 != null) {
            return n10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* access modifiers changed from: package-private */
    public Fragment m(String str) {
        return str.equals(this.f2320r) ? this : this.G.i0(str);
    }

    public void m0(Bundle bundle) {
        this.R = true;
        o1(bundle);
        if (!this.G.I0(1)) {
            this.G.C();
        }
    }

    public final Context m1() {
        Context t9 = t();
        if (t9 != null) {
            return t9;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final e n() {
        k<?> kVar = this.F;
        if (kVar == null) {
            return null;
        }
        return (e) kVar.f();
    }

    public Animation n0(int i10, boolean z9, int i11) {
        return null;
    }

    public final View n1() {
        View T2 = T();
        if (T2 != null) {
            return T2;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public boolean o() {
        Boolean bool;
        e eVar = this.W;
        if (eVar == null || (bool = eVar.f2352r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animator o0(int i10, boolean z9, int i11) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void o1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.G.c1(parcelable);
            this.G.C();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.R = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        l1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.R = true;
    }

    public boolean p() {
        Boolean bool;
        e eVar = this.W;
        if (eVar == null || (bool = eVar.f2351q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void p0(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: package-private */
    public View q() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2335a;
    }

    public View q0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f2312j0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void q1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2317o;
        if (sparseArray != null) {
            this.T.restoreHierarchyState(sparseArray);
            this.f2317o = null;
        }
        if (this.T != null) {
            this.f2308f0.f(this.f2318p);
            this.f2318p = null;
        }
        this.R = false;
        M0(bundle);
        if (!this.R) {
            throw new e0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.T != null) {
            this.f2308f0.b(g.a.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    public Animator r() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2336b;
    }

    public void r0() {
        this.R = true;
    }

    /* access modifiers changed from: package-private */
    public void r1(View view) {
        i().f2335a = view;
    }

    public final n s() {
        if (this.F != null) {
            return this.G;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void s0() {
    }

    /* access modifiers changed from: package-private */
    public void s1(int i10, int i11, int i12, int i13) {
        if (this.W != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            i().f2338d = i10;
            i().f2339e = i11;
            i().f2340f = i12;
            i().f2341g = i13;
        }
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        C1(intent, i10, (Bundle) null);
    }

    public Context t() {
        k<?> kVar = this.F;
        if (kVar == null) {
            return null;
        }
        return kVar.h();
    }

    public void t0() {
        this.R = true;
    }

    /* access modifiers changed from: package-private */
    public void t1(Animator animator) {
        i().f2336b = animator;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2320r);
        if (this.I != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.I));
        }
        if (this.K != null) {
            sb.append(" tag=");
            sb.append(this.K);
        }
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public int u() {
        e eVar = this.W;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2338d;
    }

    public void u0() {
        this.R = true;
    }

    public void u1(Bundle bundle) {
        if (this.E == null || !e0()) {
            this.f2321s = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public Object v() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2345k;
    }

    public LayoutInflater v0(Bundle bundle) {
        return C(bundle);
    }

    /* access modifiers changed from: package-private */
    public void v1(View view) {
        i().f2354t = view;
    }

    /* access modifiers changed from: package-private */
    public s w() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        Objects.requireNonNull(eVar);
        return null;
    }

    public void w0(boolean z9) {
    }

    /* access modifiers changed from: package-private */
    public void w1(boolean z9) {
        i().f2357w = z9;
    }

    /* access modifiers changed from: package-private */
    public int x() {
        e eVar = this.W;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2339e;
    }

    @Deprecated
    public void x0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.R = true;
    }

    /* access modifiers changed from: package-private */
    public void x1(int i10) {
        if (this.W != null || i10 != 0) {
            i();
            this.W.f2342h = i10;
        }
    }

    public Object y() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        return eVar.f2347m;
    }

    public void y0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.R = true;
        k<?> kVar = this.F;
        Activity f10 = kVar == null ? null : kVar.f();
        if (f10 != null) {
            this.R = false;
            x0(f10, attributeSet, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void y1(h hVar) {
        i();
        e eVar = this.W;
        h hVar2 = eVar.f2356v;
        if (hVar != hVar2) {
            if (hVar == null || hVar2 == null) {
                if (eVar.f2355u) {
                    eVar.f2356v = hVar;
                }
                if (hVar != null) {
                    hVar.b();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    /* access modifiers changed from: package-private */
    public s z() {
        e eVar = this.W;
        if (eVar == null) {
            return null;
        }
        Objects.requireNonNull(eVar);
        return null;
    }

    public void z0(boolean z9) {
    }

    /* access modifiers changed from: package-private */
    public void z1(boolean z9) {
        if (this.W != null) {
            i().f2337c = z9;
        }
    }
}
