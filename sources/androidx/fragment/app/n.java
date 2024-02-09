package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.w;
import androidx.fragment.app.x;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class n {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.c<androidx.activity.result.f> A;
    private androidx.activity.result.c<String[]> B;
    ArrayDeque<l> C = new ArrayDeque<>();
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList<a> I;
    private ArrayList<Boolean> J;
    private ArrayList<Fragment> K;
    private ArrayList<p> L;
    private q M;
    private Runnable N = new g();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<C0048n> f2504a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private boolean f2505b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final v f2506c = new v();

    /* renamed from: d  reason: collision with root package name */
    ArrayList<a> f2507d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Fragment> f2508e;

    /* renamed from: f  reason: collision with root package name */
    private final l f2509f = new l(this);

    /* renamed from: g  reason: collision with root package name */
    private OnBackPressedDispatcher f2510g;

    /* renamed from: h  reason: collision with root package name */
    private final androidx.activity.j f2511h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicInteger f2512i = new AtomicInteger();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f2513j = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f2514k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<m> f2515l;

    /* renamed from: m  reason: collision with root package name */
    private Map<Fragment, HashSet<androidx.core.os.e>> f2516m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    private final x.g f2517n = new d();

    /* renamed from: o  reason: collision with root package name */
    private final m f2518o = new m(this);

    /* renamed from: p  reason: collision with root package name */
    private final CopyOnWriteArrayList<r> f2519p = new CopyOnWriteArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    int f2520q = -1;

    /* renamed from: r  reason: collision with root package name */
    private k<?> f2521r;

    /* renamed from: s  reason: collision with root package name */
    private g f2522s;

    /* renamed from: t  reason: collision with root package name */
    private Fragment f2523t;

    /* renamed from: u  reason: collision with root package name */
    Fragment f2524u;

    /* renamed from: v  reason: collision with root package name */
    private j f2525v = null;

    /* renamed from: w  reason: collision with root package name */
    private j f2526w = new e();

    /* renamed from: x  reason: collision with root package name */
    private d0 f2527x = null;

    /* renamed from: y  reason: collision with root package name */
    private d0 f2528y = new f();

    /* renamed from: z  reason: collision with root package name */
    private androidx.activity.result.c<Intent> f2529z;

    class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            l pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f2544m;
            int i10 = pollFirst.f2545n;
            Fragment i11 = n.this.f2506c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            i11.h0(i10, aVar.b(), aVar.a());
        }
    }

    class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            StringBuilder sb;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No permissions were requested for ");
                sb.append(this);
            } else {
                String str = pollFirst.f2544m;
                int i11 = pollFirst.f2545n;
                Fragment i12 = n.this.f2506c.i(str);
                if (i12 == null) {
                    sb = new StringBuilder();
                    sb.append("Permission request result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    i12.G0(i11, strArr, iArr);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    class c extends androidx.activity.j {
        c(boolean z9) {
            super(z9);
        }

        public void b() {
            n.this.A0();
        }
    }

    class d implements x.g {
        d() {
        }

        public void a(Fragment fragment, androidx.core.os.e eVar) {
            if (!eVar.b()) {
                n.this.Y0(fragment, eVar);
            }
        }

        public void b(Fragment fragment, androidx.core.os.e eVar) {
            n.this.f(fragment, eVar);
        }
    }

    class e extends j {
        e() {
        }

        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.s0().c(n.this.s0().h(), str, (Bundle) null);
        }
    }

    class f implements d0 {
        f() {
        }

        public c0 a(ViewGroup viewGroup) {
            return new c(viewGroup);
        }
    }

    class g implements Runnable {
        g() {
        }

        public void run() {
            n.this.a0(true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f2537a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2538b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f2539c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2537a = viewGroup;
            this.f2538b = view;
            this.f2539c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2537a.endViewTransition(this.f2538b);
            animator.removeListener(this);
            Fragment fragment = this.f2539c;
            View view = fragment.T;
            if (view != null && fragment.L) {
                view.setVisibility(8);
            }
        }
    }

    class i implements r {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Fragment f2541m;

        i(Fragment fragment) {
            this.f2541m = fragment;
        }

        public void b(n nVar, Fragment fragment) {
            this.f2541m.k0(fragment);
        }
    }

    class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        /* renamed from: b */
        public void a(androidx.activity.result.a aVar) {
            l pollFirst = n.this.C.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f2544m;
            int i10 = pollFirst.f2545n;
            Fragment i11 = n.this.f2506c.i(str);
            if (i11 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            i11.h0(i10, aVar.b(), aVar.a());
        }
    }

    static class k extends e.a<androidx.activity.result.f, androidx.activity.result.a> {
        k() {
        }

        /* renamed from: d */
        public Intent a(Context context, androidx.activity.result.f fVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a10 = fVar.a();
            if (!(a10 == null || (bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a10.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    fVar = new f.a(fVar.d()).b((Intent) null).c(fVar.c(), fVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", fVar);
            if (n.E0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        /* renamed from: e */
        public androidx.activity.result.a c(int i10, Intent intent) {
            return new androidx.activity.result.a(i10, intent);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: m  reason: collision with root package name */
        String f2544m;

        /* renamed from: n  reason: collision with root package name */
        int f2545n;

        class a implements Parcelable.Creator<l> {
            a() {
            }

            /* renamed from: a */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            /* renamed from: b */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        l(Parcel parcel) {
            this.f2544m = parcel.readString();
            this.f2545n = parcel.readInt();
        }

        l(String str, int i10) {
            this.f2544m = str;
            this.f2545n = i10;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2544m);
            parcel.writeInt(this.f2545n);
        }
    }

    public interface m {
        void a();
    }

    /* renamed from: androidx.fragment.app.n$n  reason: collision with other inner class name */
    interface C0048n {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class o implements C0048n {

        /* renamed from: a  reason: collision with root package name */
        final String f2546a;

        /* renamed from: b  reason: collision with root package name */
        final int f2547b;

        /* renamed from: c  reason: collision with root package name */
        final int f2548c;

        o(String str, int i10, int i11) {
            this.f2546a = str;
            this.f2547b = i10;
            this.f2548c = i11;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.f2524u;
            if (fragment != null && this.f2547b < 0 && this.f2546a == null && fragment.s().U0()) {
                return false;
            }
            return n.this.W0(arrayList, arrayList2, this.f2546a, this.f2547b, this.f2548c);
        }
    }

    static class p implements Fragment.h {

        /* renamed from: a  reason: collision with root package name */
        final boolean f2550a;

        /* renamed from: b  reason: collision with root package name */
        final a f2551b;

        /* renamed from: c  reason: collision with root package name */
        private int f2552c;

        p(a aVar, boolean z9) {
            this.f2550a = z9;
            this.f2551b = aVar;
        }

        public void a() {
            int i10 = this.f2552c - 1;
            this.f2552c = i10;
            if (i10 == 0) {
                this.f2551b.f2362t.f1();
            }
        }

        public void b() {
            this.f2552c++;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            a aVar = this.f2551b;
            aVar.f2362t.t(aVar, this.f2550a, false, false);
        }

        /* access modifiers changed from: package-private */
        public void d() {
            boolean z9 = this.f2552c > 0;
            for (Fragment next : this.f2551b.f2362t.r0()) {
                next.y1((Fragment.h) null);
                if (z9 && next.b0()) {
                    next.D1();
                }
            }
            a aVar = this.f2551b;
            aVar.f2362t.t(aVar, this.f2550a, !z9, true);
        }

        public boolean e() {
            return this.f2552c == 0;
        }
    }

    static boolean E0(int i10) {
        return O || Log.isLoggable("FragmentManager", i10);
    }

    private boolean F0(Fragment fragment) {
        return (fragment.P && fragment.Q) || fragment.G.n();
    }

    private void L(Fragment fragment) {
        if (fragment != null && fragment.equals(f0(fragment.f2320r))) {
            fragment.f1();
        }
    }

    private void L0(p.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment o10 = bVar.o(i10);
            if (!o10.f2326x) {
                View n12 = o10.n1();
                o10.f2303a0 = n12.getAlpha();
                n12.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private void S(int i10) {
        try {
            this.f2505b = true;
            this.f2506c.d(i10);
            N0(i10, false);
            if (P) {
                for (c0 j10 : r()) {
                    j10.j();
                }
            }
            this.f2505b = false;
            a0(true);
        } catch (Throwable th) {
            this.f2505b = false;
            throw th;
        }
    }

    private void V() {
        if (this.H) {
            this.H = false;
            l1();
        }
    }

    private boolean V0(String str, int i10, int i11) {
        a0(false);
        Z(true);
        Fragment fragment = this.f2524u;
        if (fragment != null && i10 < 0 && str == null && fragment.s().U0()) {
            return true;
        }
        boolean W0 = W0(this.I, this.J, str, i10, i11);
        if (W0) {
            this.f2505b = true;
            try {
                a1(this.I, this.J);
            } finally {
                p();
            }
        }
        m1();
        V();
        this.f2506c.b();
        return W0;
    }

    private void X() {
        if (P) {
            for (c0 j10 : r()) {
                j10.j();
            }
        } else if (!this.f2516m.isEmpty()) {
            for (Fragment next : this.f2516m.keySet()) {
                m(next);
                O0(next);
            }
        }
    }

    private int X0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11, p.b<Fragment> bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            a aVar = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (aVar.x() && !aVar.v(arrayList, i13 + 1, i11)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                p pVar = new p(aVar, booleanValue);
                this.L.add(pVar);
                aVar.z(pVar);
                if (booleanValue) {
                    aVar.q();
                } else {
                    aVar.r(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                d(bVar);
            }
        }
        return i12;
    }

    private void Z(boolean z9) {
        if (this.f2505b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2521r == null) {
            if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f2521r.i().getLooper()) {
            if (!z9) {
                o();
            }
            if (this.I == null) {
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
            }
            this.f2505b = true;
            try {
                e0((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f2505b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    private void a1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                e0(arrayList, arrayList2);
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f2610r) {
                        if (i11 != i10) {
                            d0(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f2610r) {
                                i11++;
                            }
                        }
                        d0(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    d0(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void b1() {
        if (this.f2515l != null) {
            for (int i10 = 0; i10 < this.f2515l.size(); i10++) {
                this.f2515l.get(i10).a();
            }
        }
    }

    private static void c0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            a aVar = arrayList.get(i10);
            boolean z9 = true;
            if (arrayList2.get(i10).booleanValue()) {
                aVar.m(-1);
                if (i10 != i11 - 1) {
                    z9 = false;
                }
                aVar.r(z9);
            } else {
                aVar.m(1);
                aVar.q();
            }
            i10++;
        }
    }

    private void d(p.b<Fragment> bVar) {
        int i10 = this.f2520q;
        if (i10 >= 1) {
            int min = Math.min(i10, 5);
            for (Fragment next : this.f2506c.n()) {
                if (next.f2315m < min) {
                    P0(next, min);
                    if (next.T != null && !next.L && next.Y) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            boolean r2 = r0.f2610r
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.K = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            androidx.fragment.app.v r1 = r6.f2506c
            java.util.List r1 = r1.n()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.w0()
            r1 = 0
            r7 = r4
            r16 = 0
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.s(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.A(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f2601i
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = 0
            goto L_0x0062
        L_0x0060:
            r16 = 1
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            r0.clear()
            if (r2 != 0) goto L_0x00bd
            int r0 = r6.f2520q
            if (r0 < r14) goto L_0x00bd
            boolean r0 = P
            if (r0 == 0) goto L_0x00a4
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00bd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            java.util.ArrayList<androidx.fragment.app.w$a> r1 = r1.f2595c
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.w$a r7 = (androidx.fragment.app.w.a) r7
            androidx.fragment.app.Fragment r7 = r7.f2613b
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.n r8 = r7.E
            if (r8 == 0) goto L_0x0083
            androidx.fragment.app.u r7 = r6.v(r7)
            androidx.fragment.app.v r8 = r6.f2506c
            r8.p(r7)
            goto L_0x0083
        L_0x00a1:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a4:
            androidx.fragment.app.k<?> r0 = r6.f2521r
            android.content.Context r7 = r0.h()
            androidx.fragment.app.g r8 = r6.f2522s
            r13 = 0
            androidx.fragment.app.x$g r0 = r6.f2517n
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = 1
            r14 = r0
            androidx.fragment.app.x.B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00bd:
            r1 = 1
        L_0x00be:
            c0(r18, r19, r20, r21)
            boolean r0 = P
            if (r0 == 0) goto L_0x0143
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00d2:
            if (r2 >= r3) goto L_0x011c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            if (r0 == 0) goto L_0x00fb
            java.util.ArrayList<androidx.fragment.app.w$a> r8 = r7.f2595c
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e3:
            if (r8 < 0) goto L_0x0119
            java.util.ArrayList<androidx.fragment.app.w$a> r9 = r7.f2595c
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.w$a r9 = (androidx.fragment.app.w.a) r9
            androidx.fragment.app.Fragment r9 = r9.f2613b
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.u r9 = r6.v(r9)
            r9.m()
        L_0x00f8:
            int r8 = r8 + -1
            goto L_0x00e3
        L_0x00fb:
            java.util.ArrayList<androidx.fragment.app.w$a> r7 = r7.f2595c
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.w$a r8 = (androidx.fragment.app.w.a) r8
            androidx.fragment.app.Fragment r8 = r8.f2613b
            if (r8 == 0) goto L_0x0101
            androidx.fragment.app.u r8 = r6.v(r8)
            r8.m()
            goto L_0x0101
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x011c:
            int r2 = r6.f2520q
            r6.N0(r2, r1)
            java.util.Set r1 = r6.s(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.c0 r2 = (androidx.fragment.app.c0) r2
            r2.r(r0)
            r2.p()
            r2.g()
            goto L_0x0129
        L_0x013f:
            r0 = r3
            r3 = r5
            goto L_0x0199
        L_0x0143:
            if (r2 == 0) goto L_0x0165
            p.b r7 = new p.b
            r7.<init>()
            r6.d(r7)
            r0 = r17
            r14 = 1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.X0(r1, r2, r3, r4, r5)
            r6.L0(r7)
            goto L_0x016b
        L_0x0165:
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r14 = 1
            r0 = r13
        L_0x016b:
            if (r0 == r12) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r1 = r6.f2520q
            if (r1 < r14) goto L_0x018e
            androidx.fragment.app.k<?> r1 = r6.f2521r
            android.content.Context r7 = r1.h()
            androidx.fragment.app.g r8 = r6.f2522s
            r1 = 1
            androidx.fragment.app.x$g r2 = r6.f2517n
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = 1
            r14 = r2
            androidx.fragment.app.x.B(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0191
        L_0x018e:
            r3 = r11
            r0 = r13
            r1 = 1
        L_0x0191:
            int r2 = r6.f2520q
            r6.N0(r2, r1)
            goto L_0x0199
        L_0x0197:
            r3 = r11
            r0 = r13
        L_0x0199:
            r1 = r20
        L_0x019b:
            if (r1 >= r0) goto L_0x01bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b6
            int r4 = r2.f2364v
            if (r4 < 0) goto L_0x01b6
            r4 = -1
            r2.f2364v = r4
        L_0x01b6:
            r2.y()
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01bc:
            if (r16 == 0) goto L_0x01c1
            r17.b1()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    static int d1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 != 4099) {
            return i10 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void e0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<p> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = this.L.get(i10);
            if (arrayList == null || pVar.f2550a || (indexOf2 = arrayList.indexOf(pVar.f2551b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (pVar.e() || (arrayList != null && pVar.f2551b.v(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i10);
                    i10--;
                    size--;
                    if (arrayList == null || pVar.f2550a || (indexOf = arrayList.indexOf(pVar.f2551b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        pVar.d();
                    }
                }
                i10++;
            } else {
                this.L.remove(i10);
                i10--;
                size--;
            }
            pVar.c();
            i10++;
        }
    }

    private void j0() {
        if (P) {
            for (c0 k10 : r()) {
                k10.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    private void j1(Fragment fragment) {
        ViewGroup o02 = o0(fragment);
        if (o02 != null && fragment.u() + fragment.x() + fragment.I() + fragment.J() > 0) {
            int i10 = f0.b.visible_removing_fragment_view_tag;
            if (o02.getTag(i10) == null) {
                o02.setTag(i10, fragment);
            }
            ((Fragment) o02.getTag(i10)).z1(fragment.H());
        }
    }

    private boolean k0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f2504a) {
            if (this.f2504a.isEmpty()) {
                return false;
            }
            int size = this.f2504a.size();
            boolean z9 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z9 |= this.f2504a.get(i10).a(arrayList, arrayList2);
            }
            this.f2504a.clear();
            this.f2521r.i().removeCallbacks(this.N);
            return z9;
        }
    }

    private void l1() {
        for (u S0 : this.f2506c.k()) {
            S0(S0);
        }
    }

    private void m(Fragment fragment) {
        HashSet hashSet = this.f2516m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).a();
            }
            hashSet.clear();
            w(fragment);
            this.f2516m.remove(fragment);
        }
    }

    private q m0(Fragment fragment) {
        return this.M.h(fragment);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (l0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (H0(r3.f2523t) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f2511h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n$n> r0 = r3.f2504a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.n$n> r1 = r3.f2504a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.j r1 = r3.f2511h     // Catch:{ all -> 0x002a }
            r1.f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.j r0 = r3.f2511h
            int r1 = r3.l0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f2523t
            boolean r1 = r3.H0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.m1():void");
    }

    private void o() {
        if (J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.S;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.J > 0 && this.f2522s.e()) {
            View d10 = this.f2522s.d(fragment.J);
            if (d10 instanceof ViewGroup) {
                return (ViewGroup) d10;
            }
        }
        return null;
    }

    private void p() {
        this.f2505b = false;
        this.J.clear();
        this.I.clear();
    }

    private Set<c0> r() {
        HashSet hashSet = new HashSet();
        for (u k10 : this.f2506c.k()) {
            ViewGroup viewGroup = k10.k().S;
            if (viewGroup != null) {
                hashSet.add(c0.o(viewGroup, x0()));
            }
        }
        return hashSet;
    }

    private Set<c0> s(ArrayList<a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<w.a> it = arrayList.get(i10).f2595c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f2613b;
                if (!(fragment == null || (viewGroup = fragment.S) == null)) {
                    hashSet.add(c0.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    private void u(Fragment fragment) {
        Animator animator;
        if (fragment.T != null) {
            f.d c10 = f.c(this.f2521r.h(), fragment, !fragment.L, fragment.H());
            if (c10 == null || (animator = c10.f2481b) == null) {
                if (c10 != null) {
                    fragment.T.startAnimation(c10.f2480a);
                    c10.f2480a.start();
                }
                fragment.T.setVisibility((!fragment.L || fragment.Y()) ? 0 : 8);
                if (fragment.Y()) {
                    fragment.w1(false);
                }
            } else {
                animator.setTarget(fragment.T);
                if (!fragment.L) {
                    fragment.T.setVisibility(0);
                } else if (fragment.Y()) {
                    fragment.w1(false);
                } else {
                    ViewGroup viewGroup = fragment.S;
                    View view = fragment.T;
                    viewGroup.startViewTransition(view);
                    c10.f2481b.addListener(new h(viewGroup, view, fragment));
                }
                c10.f2481b.start();
            }
        }
        C0(fragment);
        fragment.Z = false;
        fragment.w0(fragment.L);
    }

    private void w(Fragment fragment) {
        fragment.V0();
        this.f2518o.n(fragment, false);
        fragment.S = null;
        fragment.T = null;
        fragment.f2308f0 = null;
        fragment.f2309g0.i(null);
        fragment.A = false;
    }

    static Fragment y0(View view) {
        Object tag = view.getTag(f0.b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void A(Configuration configuration) {
        for (Fragment next : this.f2506c.n()) {
            if (next != null) {
                next.P0(configuration);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void A0() {
        a0(true);
        if (this.f2511h.c()) {
            U0();
        } else {
            this.f2510g.e();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean B(MenuItem menuItem) {
        if (this.f2520q < 1) {
            return false;
        }
        for (Fragment next : this.f2506c.n()) {
            if (next != null && next.Q0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void B0(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.L) {
            fragment.L = true;
            fragment.Z = true ^ fragment.Z;
            j1(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(1);
    }

    /* access modifiers changed from: package-private */
    public void C0(Fragment fragment) {
        if (fragment.f2326x && F0(fragment)) {
            this.D = true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f2520q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z9 = false;
        for (Fragment next : this.f2506c.n()) {
            if (next != null && G0(next) && next.S0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z9 = true;
            }
        }
        if (this.f2508e != null) {
            for (int i10 = 0; i10 < this.f2508e.size(); i10++) {
                Fragment fragment = this.f2508e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.s0();
                }
            }
        }
        this.f2508e = arrayList;
        return z9;
    }

    public boolean D0() {
        return this.G;
    }

    /* access modifiers changed from: package-private */
    public void E() {
        this.G = true;
        a0(true);
        X();
        S(-1);
        this.f2521r = null;
        this.f2522s = null;
        this.f2523t = null;
        if (this.f2510g != null) {
            this.f2511h.d();
            this.f2510g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.f2529z;
        if (cVar != null) {
            cVar.c();
            this.A.c();
            this.B.c();
        }
    }

    /* access modifiers changed from: package-private */
    public void F() {
        S(1);
    }

    /* access modifiers changed from: package-private */
    public void G() {
        for (Fragment next : this.f2506c.n()) {
            if (next != null) {
                next.Y0();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.a0();
    }

    /* access modifiers changed from: package-private */
    public void H(boolean z9) {
        for (Fragment next : this.f2506c.n()) {
            if (next != null) {
                next.Z0(z9);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.E;
        return fragment.equals(nVar.w0()) && H0(nVar.f2523t);
    }

    /* access modifiers changed from: package-private */
    public void I(Fragment fragment) {
        Iterator<r> it = this.f2519p.iterator();
        while (it.hasNext()) {
            it.next().b(this, fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean I0(int i10) {
        return this.f2520q >= i10;
    }

    /* access modifiers changed from: package-private */
    public boolean J(MenuItem menuItem) {
        if (this.f2520q < 1) {
            return false;
        }
        for (Fragment next : this.f2506c.n()) {
            if (next != null && next.a1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean J0() {
        return this.E || this.F;
    }

    /* access modifiers changed from: package-private */
    public void K(Menu menu) {
        if (this.f2520q >= 1) {
            for (Fragment next : this.f2506c.n()) {
                if (next != null) {
                    next.b1(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void K0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (this.f2529z != null) {
            this.C.addLast(new l(fragment.f2320r, i10));
            if (!(intent == null || bundle == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.f2529z.a(intent);
            return;
        }
        this.f2521r.p(fragment, intent, i10, bundle);
    }

    /* access modifiers changed from: package-private */
    public void M() {
        S(5);
    }

    /* access modifiers changed from: package-private */
    public void M0(Fragment fragment) {
        if (this.f2506c.c(fragment.f2320r)) {
            O0(fragment);
            View view = fragment.T;
            if (!(view == null || !fragment.Y || fragment.S == null)) {
                float f10 = fragment.f2303a0;
                if (f10 > 0.0f) {
                    view.setAlpha(f10);
                }
                fragment.f2303a0 = 0.0f;
                fragment.Y = false;
                f.d c10 = f.c(this.f2521r.h(), fragment, true, fragment.H());
                if (c10 != null) {
                    Animation animation = c10.f2480a;
                    if (animation != null) {
                        fragment.T.startAnimation(animation);
                    } else {
                        c10.f2481b.setTarget(fragment.T);
                        c10.f2481b.start();
                    }
                }
            }
            if (fragment.Z) {
                u(fragment);
            }
        } else if (E0(3)) {
            Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2520q + "since it is not added to " + this);
        }
    }

    /* access modifiers changed from: package-private */
    public void N(boolean z9) {
        for (Fragment next : this.f2506c.n()) {
            if (next != null) {
                next.d1(z9);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void N0(int i10, boolean z9) {
        k<?> kVar;
        if (this.f2521r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z9 || i10 != this.f2520q) {
            this.f2520q = i10;
            if (P) {
                this.f2506c.r();
            } else {
                for (Fragment M0 : this.f2506c.n()) {
                    M0(M0);
                }
                for (u next : this.f2506c.k()) {
                    Fragment k10 = next.k();
                    if (!k10.Y) {
                        M0(k10);
                    }
                    if (k10.f2327y && !k10.Z()) {
                        this.f2506c.q(next);
                    }
                }
            }
            l1();
            if (this.D && (kVar = this.f2521r) != null && this.f2520q == 7) {
                kVar.q();
                this.D = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean O(Menu menu) {
        boolean z9 = false;
        if (this.f2520q < 1) {
            return false;
        }
        for (Fragment next : this.f2506c.n()) {
            if (next != null && G0(next) && next.e1(menu)) {
                z9 = true;
            }
        }
        return z9;
    }

    /* access modifiers changed from: package-private */
    public void O0(Fragment fragment) {
        P0(fragment, this.f2520q);
    }

    /* access modifiers changed from: package-private */
    public void P() {
        m1();
        L(this.f2524u);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r2 != 5) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            r10 = this;
            androidx.fragment.app.v r0 = r10.f2506c
            java.lang.String r1 = r11.f2320r
            androidx.fragment.app.u r0 = r0.m(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.u r0 = new androidx.fragment.app.u
            androidx.fragment.app.m r2 = r10.f2518o
            androidx.fragment.app.v r3 = r10.f2506c
            r0.<init>(r2, r3, r11)
            r0.t(r1)
        L_0x0017:
            boolean r2 = r11.f2328z
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r11.A
            if (r2 == 0) goto L_0x0028
            int r2 = r11.f2315m
            if (r2 != r3) goto L_0x0028
            int r12 = java.lang.Math.max(r12, r3)
        L_0x0028:
            int r2 = r0.d()
            int r12 = java.lang.Math.min(r12, r2)
            int r2 = r11.f2315m
            r4 = 3
            java.lang.String r5 = "FragmentManager"
            r6 = -1
            r7 = 5
            r8 = 4
            if (r2 > r12) goto L_0x007c
            if (r2 >= r12) goto L_0x0047
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f2516m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0047
            r10.m(r11)
        L_0x0047:
            int r2 = r11.f2315m
            if (r2 == r6) goto L_0x0057
            if (r2 == 0) goto L_0x005c
            if (r2 == r1) goto L_0x0061
            if (r2 == r3) goto L_0x006b
            if (r2 == r8) goto L_0x0070
            if (r2 == r7) goto L_0x0075
            goto L_0x0164
        L_0x0057:
            if (r12 <= r6) goto L_0x005c
            r0.c()
        L_0x005c:
            if (r12 <= 0) goto L_0x0061
            r0.e()
        L_0x0061:
            if (r12 <= r6) goto L_0x0066
            r0.j()
        L_0x0066:
            if (r12 <= r1) goto L_0x006b
            r0.f()
        L_0x006b:
            if (r12 <= r3) goto L_0x0070
            r0.a()
        L_0x0070:
            if (r12 <= r8) goto L_0x0075
            r0.u()
        L_0x0075:
            if (r12 <= r7) goto L_0x0164
            r0.p()
            goto L_0x0164
        L_0x007c:
            if (r2 <= r12) goto L_0x0164
            if (r2 == 0) goto L_0x015d
            if (r2 == r1) goto L_0x014f
            if (r2 == r3) goto L_0x00c6
            if (r2 == r8) goto L_0x0097
            if (r2 == r7) goto L_0x0092
            r9 = 7
            if (r2 == r9) goto L_0x008d
            goto L_0x0164
        L_0x008d:
            if (r12 >= r9) goto L_0x0092
            r0.n()
        L_0x0092:
            if (r12 >= r7) goto L_0x0097
            r0.v()
        L_0x0097:
            if (r12 >= r8) goto L_0x00c6
            boolean r2 = E0(r4)
            if (r2 == 0) goto L_0x00b3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r2.append(r7)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r5, r2)
        L_0x00b3:
            android.view.View r2 = r11.T
            if (r2 == 0) goto L_0x00c6
            androidx.fragment.app.k<?> r2 = r10.f2521r
            boolean r2 = r2.o(r11)
            if (r2 == 0) goto L_0x00c6
            android.util.SparseArray<android.os.Parcelable> r2 = r11.f2317o
            if (r2 != 0) goto L_0x00c6
            r0.s()
        L_0x00c6:
            if (r12 >= r3) goto L_0x014f
            r2 = 0
            android.view.View r7 = r11.T
            if (r7 == 0) goto L_0x0144
            android.view.ViewGroup r8 = r11.S
            if (r8 == 0) goto L_0x0144
            r8.endViewTransition(r7)
            android.view.View r7 = r11.T
            r7.clearAnimation()
            boolean r7 = r11.d0()
            if (r7 != 0) goto L_0x0144
            int r7 = r10.f2520q
            r8 = 0
            if (r7 <= r6) goto L_0x0105
            boolean r6 = r10.G
            if (r6 != 0) goto L_0x0105
            android.view.View r6 = r11.T
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0105
            float r6 = r11.f2303a0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x0105
            androidx.fragment.app.k<?> r2 = r10.f2521r
            android.content.Context r2 = r2.h()
            r6 = 0
            boolean r7 = r11.H()
            androidx.fragment.app.f$d r2 = androidx.fragment.app.f.c(r2, r11, r6, r7)
        L_0x0105:
            r11.f2303a0 = r8
            android.view.ViewGroup r6 = r11.S
            android.view.View r7 = r11.T
            if (r2 == 0) goto L_0x0112
            androidx.fragment.app.x$g r8 = r10.f2517n
            androidx.fragment.app.f.a(r11, r2, r8)
        L_0x0112:
            r6.removeView(r7)
            boolean r2 = E0(r3)
            if (r2 == 0) goto L_0x013f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removing view "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = " for fragment "
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = " from container "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r5, r2)
        L_0x013f:
            android.view.ViewGroup r2 = r11.S
            if (r6 == r2) goto L_0x0144
            return
        L_0x0144:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f2516m
            java.lang.Object r2 = r2.get(r11)
            if (r2 != 0) goto L_0x014f
            r0.h()
        L_0x014f:
            if (r12 >= r1) goto L_0x015d
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.e>> r2 = r10.f2516m
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x015a
            goto L_0x015e
        L_0x015a:
            r0.g()
        L_0x015d:
            r1 = r12
        L_0x015e:
            if (r1 >= 0) goto L_0x0163
            r0.i()
        L_0x0163:
            r12 = r1
        L_0x0164:
            int r0 = r11.f2315m
            if (r0 == r12) goto L_0x0196
            boolean r0 = E0(r4)
            if (r0 == 0) goto L_0x0194
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r11.f2315m
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
        L_0x0194:
            r11.f2315m = r12
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.P0(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: package-private */
    public void Q() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(7);
    }

    /* access modifiers changed from: package-private */
    public void Q0() {
        if (this.f2521r != null) {
            this.E = false;
            this.F = false;
            this.M.n(false);
            for (Fragment next : this.f2506c.n()) {
                if (next != null) {
                    next.f0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void R() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(5);
    }

    /* access modifiers changed from: package-private */
    public void R0(h hVar) {
        View view;
        for (u next : this.f2506c.k()) {
            Fragment k10 = next.k();
            if (k10.J == hVar.getId() && (view = k10.T) != null && view.getParent() == null) {
                k10.S = hVar;
                next.b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void S0(u uVar) {
        Fragment k10 = uVar.k();
        if (!k10.U) {
            return;
        }
        if (this.f2505b) {
            this.H = true;
            return;
        }
        k10.U = false;
        if (P) {
            uVar.m();
        } else {
            O0(k10);
        }
    }

    /* access modifiers changed from: package-private */
    public void T() {
        this.F = true;
        this.M.n(true);
        S(4);
    }

    public void T0(int i10, int i11) {
        if (i10 >= 0) {
            Y(new o((String) null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    /* access modifiers changed from: package-private */
    public void U() {
        S(2);
    }

    public boolean U0() {
        return V0((String) null, -1, 0);
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2506c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2508e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f2508e.get(i10).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f2507d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f2507d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.o(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2512i.get());
        synchronized (this.f2504a) {
            int size3 = this.f2504a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(this.f2504a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2521r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2522s);
        if (this.f2523t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2523t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2520q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean W0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int i12;
        ArrayList<a> arrayList3 = this.f2507d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2507d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f2507d.get(size2);
                    if ((str != null && str.equals(aVar.t())) || (i10 >= 0 && i10 == aVar.f2364v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f2507d.get(size2);
                        if ((str == null || !str.equals(aVar2.t())) && (i10 < 0 || i10 != aVar2.f2364v)) {
                            break;
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f2507d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2507d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f2507d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void Y(C0048n nVar, boolean z9) {
        if (!z9) {
            if (this.f2521r != null) {
                o();
            } else if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f2504a) {
            if (this.f2521r != null) {
                this.f2504a.add(nVar);
                f1();
            } else if (!z9) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Y0(Fragment fragment, androidx.core.os.e eVar) {
        HashSet hashSet = this.f2516m.get(fragment);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            this.f2516m.remove(fragment);
            if (fragment.f2315m < 5) {
                w(fragment);
                O0(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void Z0(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.D);
        }
        boolean z9 = !fragment.Z();
        if (!fragment.M || z9) {
            this.f2506c.s(fragment);
            if (F0(fragment)) {
                this.D = true;
            }
            fragment.f2327y = true;
            j1(fragment);
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean a0(boolean z9) {
        Z(z9);
        boolean z10 = false;
        while (k0(this.I, this.J)) {
            this.f2505b = true;
            try {
                a1(this.I, this.J);
                p();
                z10 = true;
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        m1();
        V();
        this.f2506c.b();
        return z10;
    }

    /* access modifiers changed from: package-private */
    public void b0(C0048n nVar, boolean z9) {
        if (!z9 || (this.f2521r != null && !this.G)) {
            Z(z9);
            if (nVar.a(this.I, this.J)) {
                this.f2505b = true;
                try {
                    a1(this.I, this.J);
                } finally {
                    p();
                }
            }
            m1();
            V();
            this.f2506c.b();
        }
    }

    /* access modifiers changed from: package-private */
    public void c1(Parcelable parcelable) {
        u uVar;
        if (parcelable != null) {
            p pVar = (p) parcelable;
            if (pVar.f2553m != null) {
                this.f2506c.t();
                Iterator<t> it = pVar.f2553m.iterator();
                while (it.hasNext()) {
                    t next = it.next();
                    if (next != null) {
                        Fragment g10 = this.M.g(next.f2570n);
                        if (g10 != null) {
                            if (E0(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g10);
                            }
                            uVar = new u(this.f2518o, this.f2506c, g10, next);
                        } else {
                            uVar = new u(this.f2518o, this.f2506c, this.f2521r.h().getClassLoader(), p0(), next);
                        }
                        Fragment k10 = uVar.k();
                        k10.E = this;
                        if (E0(2)) {
                            Log.v("FragmentManager", "restoreSaveState: active (" + k10.f2320r + "): " + k10);
                        }
                        uVar.o(this.f2521r.h().getClassLoader());
                        this.f2506c.p(uVar);
                        uVar.t(this.f2520q);
                    }
                }
                for (Fragment next2 : this.M.j()) {
                    if (!this.f2506c.c(next2.f2320r)) {
                        if (E0(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + next2 + " that was not found in the set of active Fragments " + pVar.f2553m);
                        }
                        this.M.m(next2);
                        next2.E = this;
                        u uVar2 = new u(this.f2518o, this.f2506c, next2);
                        uVar2.t(1);
                        uVar2.m();
                        next2.f2327y = true;
                        uVar2.m();
                    }
                }
                this.f2506c.u(pVar.f2554n);
                if (pVar.f2555o != null) {
                    this.f2507d = new ArrayList<>(pVar.f2555o.length);
                    int i10 = 0;
                    while (true) {
                        b[] bVarArr = pVar.f2555o;
                        if (i10 >= bVarArr.length) {
                            break;
                        }
                        a a10 = bVarArr[i10].a(this);
                        if (E0(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + a10.f2364v + "): " + a10);
                            PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                            a10.p("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f2507d.add(a10);
                        i10++;
                    }
                } else {
                    this.f2507d = null;
                }
                this.f2512i.set(pVar.f2556p);
                String str = pVar.f2557q;
                if (str != null) {
                    Fragment f02 = f0(str);
                    this.f2524u = f02;
                    L(f02);
                }
                ArrayList<String> arrayList = pVar.f2558r;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        Bundle bundle = pVar.f2559s.get(i11);
                        bundle.setClassLoader(this.f2521r.h().getClassLoader());
                        this.f2513j.put(arrayList.get(i11), bundle);
                    }
                }
                this.C = new ArrayDeque<>(pVar.f2560t);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar) {
        if (this.f2507d == null) {
            this.f2507d = new ArrayList<>();
        }
        this.f2507d.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public Parcelable e1() {
        int size;
        j0();
        X();
        a0(true);
        this.E = true;
        this.M.n(true);
        ArrayList<t> v9 = this.f2506c.v();
        b[] bVarArr = null;
        if (v9.isEmpty()) {
            if (E0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> w9 = this.f2506c.w();
        ArrayList<a> arrayList = this.f2507d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new b[size];
            for (int i10 = 0; i10 < size; i10++) {
                bVarArr[i10] = new b(this.f2507d.get(i10));
                if (E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f2507d.get(i10));
                }
            }
        }
        p pVar = new p();
        pVar.f2553m = v9;
        pVar.f2554n = w9;
        pVar.f2555o = bVarArr;
        pVar.f2556p = this.f2512i.get();
        Fragment fragment = this.f2524u;
        if (fragment != null) {
            pVar.f2557q = fragment.f2320r;
        }
        pVar.f2558r.addAll(this.f2513j.keySet());
        pVar.f2559s.addAll(this.f2513j.values());
        pVar.f2560t = new ArrayList<>(this.C);
        return pVar;
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, androidx.core.os.e eVar) {
        if (this.f2516m.get(fragment) == null) {
            this.f2516m.put(fragment, new HashSet());
        }
        this.f2516m.get(fragment).add(eVar);
    }

    /* access modifiers changed from: package-private */
    public Fragment f0(String str) {
        return this.f2506c.f(str);
    }

    /* access modifiers changed from: package-private */
    public void f1() {
        synchronized (this.f2504a) {
            ArrayList<p> arrayList = this.L;
            boolean z9 = false;
            boolean z10 = arrayList != null && !arrayList.isEmpty();
            if (this.f2504a.size() == 1) {
                z9 = true;
            }
            if (z10 || z9) {
                this.f2521r.i().removeCallbacks(this.N);
                this.f2521r.i().post(this.N);
                m1();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public u g(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        u v9 = v(fragment);
        fragment.E = this;
        this.f2506c.p(v9);
        if (!fragment.M) {
            this.f2506c.a(fragment);
            fragment.f2327y = false;
            if (fragment.T == null) {
                fragment.Z = false;
            }
            if (F0(fragment)) {
                this.D = true;
            }
        }
        return v9;
    }

    public Fragment g0(int i10) {
        return this.f2506c.g(i10);
    }

    /* access modifiers changed from: package-private */
    public void g1(Fragment fragment, boolean z9) {
        ViewGroup o02 = o0(fragment);
        if (o02 != null && (o02 instanceof h)) {
            ((h) o02).setDrawDisappearingViewsLast(!z9);
        }
    }

    public void h(r rVar) {
        this.f2519p.add(rVar);
    }

    public Fragment h0(String str) {
        return this.f2506c.h(str);
    }

    /* access modifiers changed from: package-private */
    public void h1(Fragment fragment, g.b bVar) {
        if (!fragment.equals(f0(fragment.f2320r)) || !(fragment.F == null || fragment.E == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.f2306d0 = bVar;
    }

    /* access modifiers changed from: package-private */
    public int i() {
        return this.f2512i.getAndIncrement();
    }

    /* access modifiers changed from: package-private */
    public Fragment i0(String str) {
        return this.f2506c.i(str);
    }

    /* access modifiers changed from: package-private */
    public void i1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.f2320r)) && (fragment.F == null || fragment.E == this))) {
            Fragment fragment2 = this.f2524u;
            this.f2524u = fragment;
            L(fragment2);
            L(this.f2524u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.activity.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(androidx.fragment.app.k<?> r3, androidx.fragment.app.g r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.k<?> r0 = r2.f2521r
            if (r0 != 0) goto L_0x0103
            r2.f2521r = r3
            r2.f2522s = r4
            r2.f2523t = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.n$i r4 = new androidx.fragment.app.n$i
            r4.<init>(r5)
        L_0x0011:
            r2.h(r4)
            goto L_0x001d
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.r
            if (r4 == 0) goto L_0x001d
            r4 = r3
            androidx.fragment.app.r r4 = (androidx.fragment.app.r) r4
            goto L_0x0011
        L_0x001d:
            androidx.fragment.app.Fragment r4 = r2.f2523t
            if (r4 == 0) goto L_0x0024
            r2.m1()
        L_0x0024:
            boolean r4 = r3 instanceof androidx.activity.l
            if (r4 == 0) goto L_0x0039
            r4 = r3
            androidx.activity.l r4 = (androidx.activity.l) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.j()
            r2.f2510g = r0
            if (r5 == 0) goto L_0x0034
            r4 = r5
        L_0x0034:
            androidx.activity.j r1 = r2.f2511h
            r0.b(r4, r1)
        L_0x0039:
            if (r5 == 0) goto L_0x0044
            androidx.fragment.app.n r3 = r5.E
            androidx.fragment.app.q r3 = r3.m0(r5)
        L_0x0041:
            r2.M = r3
            goto L_0x005a
        L_0x0044:
            boolean r4 = r3 instanceof androidx.lifecycle.g0
            if (r4 == 0) goto L_0x0053
            androidx.lifecycle.g0 r3 = (androidx.lifecycle.g0) r3
            androidx.lifecycle.f0 r3 = r3.l()
            androidx.fragment.app.q r3 = androidx.fragment.app.q.i(r3)
            goto L_0x0041
        L_0x0053:
            androidx.fragment.app.q r3 = new androidx.fragment.app.q
            r4 = 0
            r3.<init>(r4)
            goto L_0x0041
        L_0x005a:
            androidx.fragment.app.q r3 = r2.M
            boolean r4 = r2.J0()
            r3.n(r4)
            androidx.fragment.app.v r3 = r2.f2506c
            androidx.fragment.app.q r4 = r2.M
            r3.x(r4)
            androidx.fragment.app.k<?> r3 = r2.f2521r
            boolean r4 = r3 instanceof androidx.activity.result.e
            if (r4 == 0) goto L_0x0102
            androidx.activity.result.e r3 = (androidx.activity.result.e) r3
            androidx.activity.result.d r3 = r3.g()
            if (r5 == 0) goto L_0x008c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.f2320r
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x008e
        L_0x008c:
            java.lang.String r4 = ""
        L_0x008e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            e.f r0 = new e.f
            r0.<init>()
            androidx.fragment.app.n$j r1 = new androidx.fragment.app.n$j
            r1.<init>()
            androidx.activity.result.c r5 = r3.i(r5, r0, r1)
            r2.f2529z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.n$k r0 = new androidx.fragment.app.n$k
            r0.<init>()
            androidx.fragment.app.n$a r1 = new androidx.fragment.app.n$a
            r1.<init>()
            androidx.activity.result.c r5 = r3.i(r5, r0, r1)
            r2.A = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            e.e r5 = new e.e
            r5.<init>()
            androidx.fragment.app.n$b r0 = new androidx.fragment.app.n$b
            r0.<init>()
            androidx.activity.result.c r3 = r3.i(r4, r5, r0)
            r2.B = r3
        L_0x0102:
            return
        L_0x0103:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.j(androidx.fragment.app.k, androidx.fragment.app.g, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.M) {
            fragment.M = false;
            if (!fragment.f2326x) {
                this.f2506c.a(fragment);
                if (E0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (F0(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k1(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.L) {
            fragment.L = false;
            fragment.Z = !fragment.Z;
        }
    }

    public w l() {
        return new a(this);
    }

    public int l0() {
        ArrayList<a> arrayList = this.f2507d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        boolean z9 = false;
        for (Fragment next : this.f2506c.l()) {
            if (next != null) {
                z9 = F0(next);
                continue;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public g n0() {
        return this.f2522s;
    }

    public j p0() {
        j jVar = this.f2525v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f2523t;
        return fragment != null ? fragment.E.p0() : this.f2526w;
    }

    public final void q(String str) {
        this.f2513j.remove(str);
    }

    /* access modifiers changed from: package-private */
    public v q0() {
        return this.f2506c;
    }

    public List<Fragment> r0() {
        return this.f2506c.n();
    }

    /* access modifiers changed from: package-private */
    public k<?> s0() {
        return this.f2521r;
    }

    /* access modifiers changed from: package-private */
    public void t(a aVar, boolean z9, boolean z10, boolean z11) {
        if (z9) {
            aVar.r(z11);
        } else {
            aVar.q();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z9));
        if (z10 && this.f2520q >= 1) {
            x.B(this.f2521r.h(), this.f2522s, arrayList, arrayList2, 0, 1, true, this.f2517n);
        }
        if (z11) {
            N0(this.f2520q, true);
        }
        for (Fragment next : this.f2506c.l()) {
            if (next != null && next.T != null && next.Y && aVar.u(next.J)) {
                float f10 = next.f2303a0;
                if (f10 > 0.0f) {
                    next.T.setAlpha(f10);
                }
                if (z11) {
                    next.f2303a0 = 0.0f;
                } else {
                    next.f2303a0 = -1.0f;
                    next.Y = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 t0() {
        return this.f2509f;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2523t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            obj = this.f2523t;
        } else {
            k<?> kVar = this.f2521r;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f2521r;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public m u0() {
        return this.f2518o;
    }

    /* access modifiers changed from: package-private */
    public u v(Fragment fragment) {
        u m10 = this.f2506c.m(fragment.f2320r);
        if (m10 != null) {
            return m10;
        }
        u uVar = new u(this.f2518o, this.f2506c, fragment);
        uVar.o(this.f2521r.h().getClassLoader());
        uVar.t(this.f2520q);
        return uVar;
    }

    /* access modifiers changed from: package-private */
    public Fragment v0() {
        return this.f2523t;
    }

    public Fragment w0() {
        return this.f2524u;
    }

    /* access modifiers changed from: package-private */
    public void x(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.M) {
            fragment.M = true;
            if (fragment.f2326x) {
                if (E0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.f2506c.s(fragment);
                if (F0(fragment)) {
                    this.D = true;
                }
                j1(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public d0 x0() {
        d0 d0Var = this.f2527x;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.f2523t;
        return fragment != null ? fragment.E.x0() : this.f2528y;
    }

    /* access modifiers changed from: package-private */
    public void y() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(4);
    }

    /* access modifiers changed from: package-private */
    public void z() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        S(0);
    }

    /* access modifiers changed from: package-private */
    public f0 z0(Fragment fragment) {
        return this.M.k(fragment);
    }
}
