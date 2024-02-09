package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.g;

public abstract class l implements Cloneable {
    private static final int[] S = {2, 1, 3, 4};
    private static final g T = new a();
    private static ThreadLocal<p.a<Animator, d>> U = new ThreadLocal<>();
    private ArrayList<Class> A = null;
    private s B = new s();
    private s C = new s();
    p D = null;
    private int[] E = S;
    private ArrayList<r> F;
    private ArrayList<r> G;
    private ViewGroup H = null;
    boolean I = false;
    ArrayList<Animator> J = new ArrayList<>();
    private int K = 0;
    private boolean L = false;
    private boolean M = false;
    private ArrayList<f> N = null;
    private ArrayList<Animator> O = new ArrayList<>();
    private e P;
    private p.a<String, String> Q;
    private g R = T;

    /* renamed from: m  reason: collision with root package name */
    private String f12635m = getClass().getName();

    /* renamed from: n  reason: collision with root package name */
    private long f12636n = -1;

    /* renamed from: o  reason: collision with root package name */
    long f12637o = -1;

    /* renamed from: p  reason: collision with root package name */
    private TimeInterpolator f12638p = null;

    /* renamed from: q  reason: collision with root package name */
    ArrayList<Integer> f12639q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    ArrayList<View> f12640r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    private ArrayList<String> f12641s = null;

    /* renamed from: t  reason: collision with root package name */
    private ArrayList<Class> f12642t = null;

    /* renamed from: u  reason: collision with root package name */
    private ArrayList<Integer> f12643u = null;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList<View> f12644v = null;

    /* renamed from: w  reason: collision with root package name */
    private ArrayList<Class> f12645w = null;

    /* renamed from: x  reason: collision with root package name */
    private ArrayList<String> f12646x = null;

    /* renamed from: y  reason: collision with root package name */
    private ArrayList<Integer> f12647y = null;

    /* renamed from: z  reason: collision with root package name */
    private ArrayList<View> f12648z = null;

    static class a extends g {
        a() {
        }

        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p.a f12649a;

        b(p.a aVar) {
            this.f12649a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f12649a.remove(animator);
            l.this.J.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            l.this.J.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        public void onAnimationEnd(Animator animator) {
            l.this.v();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        View f12652a;

        /* renamed from: b  reason: collision with root package name */
        String f12653b;

        /* renamed from: c  reason: collision with root package name */
        r f12654c;

        /* renamed from: d  reason: collision with root package name */
        g0 f12655d;

        /* renamed from: e  reason: collision with root package name */
        l f12656e;

        d(View view, String str, l lVar, g0 g0Var, r rVar) {
            this.f12652a = view;
            this.f12653b = str;
            this.f12654c = rVar;
            this.f12655d = g0Var;
            this.f12656e = lVar;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(l lVar);

        void b(l lVar);

        void c(l lVar);

        void d(l lVar);
    }

    private static p.a<Animator, d> D() {
        p.a<Animator, d> aVar = U.get();
        if (aVar != null) {
            return aVar;
        }
        p.a<Animator, d> aVar2 = new p.a<>();
        U.set(aVar2);
        return aVar2;
    }

    private static boolean N(r rVar, r rVar2, String str) {
        Object obj = rVar.f12670a.get(str);
        Object obj2 = rVar2.f12670a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void O(p.a<View, r> aVar, p.a<View, r> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            View valueAt = sparseArray.valueAt(i10);
            if (valueAt != null && M(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i10))) != null && M(view)) {
                r rVar = aVar.get(valueAt);
                r rVar2 = aVar2.get(view);
                if (!(rVar == null || rVar2 == null)) {
                    this.F.add(rVar);
                    this.G.add(rVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void P(p.a<View, r> aVar, p.a<View, r> aVar2) {
        r remove;
        View view;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View i10 = aVar.i(size);
            if (!(i10 == null || !M(i10) || (remove = aVar2.remove(i10)) == null || (view = remove.f12671b) == null || !M(view))) {
                this.F.add(aVar.k(size));
                this.G.add(remove);
            }
        }
    }

    private void Q(p.a<View, r> aVar, p.a<View, r> aVar2, p.d<View> dVar, p.d<View> dVar2) {
        View h10;
        int s9 = dVar.s();
        for (int i10 = 0; i10 < s9; i10++) {
            View t9 = dVar.t(i10);
            if (t9 != null && M(t9) && (h10 = dVar2.h(dVar.n(i10))) != null && M(h10)) {
                r rVar = aVar.get(t9);
                r rVar2 = aVar2.get(h10);
                if (!(rVar == null || rVar2 == null)) {
                    this.F.add(rVar);
                    this.G.add(rVar2);
                    aVar.remove(t9);
                    aVar2.remove(h10);
                }
            }
        }
    }

    private void R(p.a<View, r> aVar, p.a<View, r> aVar2, p.a<String, View> aVar3, p.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View m10 = aVar3.m(i10);
            if (m10 != null && M(m10) && (view = aVar4.get(aVar3.i(i10))) != null && M(view)) {
                r rVar = aVar.get(m10);
                r rVar2 = aVar2.get(view);
                if (!(rVar == null || rVar2 == null)) {
                    this.F.add(rVar);
                    this.G.add(rVar2);
                    aVar.remove(m10);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void S(s sVar, s sVar2) {
        p.a aVar = new p.a((g) sVar.f12673a);
        p.a aVar2 = new p.a((g) sVar2.f12673a);
        int i10 = 0;
        while (true) {
            int[] iArr = this.E;
            if (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 == 1) {
                    P(aVar, aVar2);
                } else if (i11 == 2) {
                    R(aVar, aVar2, sVar.f12676d, sVar2.f12676d);
                } else if (i11 == 3) {
                    O(aVar, aVar2, sVar.f12674b, sVar2.f12674b);
                } else if (i11 == 4) {
                    Q(aVar, aVar2, sVar.f12675c, sVar2.f12675c);
                }
                i10++;
            } else {
                e(aVar, aVar2);
                return;
            }
        }
    }

    private void Y(Animator animator, p.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            h(animator);
        }
    }

    private void e(p.a<View, r> aVar, p.a<View, r> aVar2) {
        for (int i10 = 0; i10 < aVar.size(); i10++) {
            r m10 = aVar.m(i10);
            if (M(m10.f12671b)) {
                this.F.add(m10);
                this.G.add((Object) null);
            }
        }
        for (int i11 = 0; i11 < aVar2.size(); i11++) {
            r m11 = aVar2.m(i11);
            if (M(m11.f12671b)) {
                this.G.add(m11);
                this.F.add((Object) null);
            }
        }
    }

    private static void f(s sVar, View view, r rVar) {
        sVar.f12673a.put(view, rVar);
        int id = view.getId();
        if (id >= 0) {
            if (sVar.f12674b.indexOfKey(id) >= 0) {
                sVar.f12674b.put(id, (Object) null);
            } else {
                sVar.f12674b.put(id, view);
            }
        }
        String H2 = x.H(view);
        if (H2 != null) {
            if (sVar.f12676d.containsKey(H2)) {
                sVar.f12676d.put(H2, null);
            } else {
                sVar.f12676d.put(H2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (sVar.f12675c.k(itemIdAtPosition) >= 0) {
                    View h10 = sVar.f12675c.h(itemIdAtPosition);
                    if (h10 != null) {
                        x.p0(h10, false);
                        sVar.f12675c.p(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                x.p0(view, true);
                sVar.f12675c.p(itemIdAtPosition, view);
            }
        }
    }

    private void k(View view, boolean z9) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f12643u;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f12644v;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.f12645w;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            if (!this.f12645w.get(i10).isInstance(view)) {
                                i10++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        r rVar = new r();
                        rVar.f12671b = view;
                        if (z9) {
                            p(rVar);
                        } else {
                            i(rVar);
                        }
                        rVar.f12672c.add(this);
                        n(rVar);
                        f(z9 ? this.B : this.C, view, rVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f12647y;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f12648z;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.A;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i11 = 0;
                                    while (i11 < size2) {
                                        if (!this.A.get(i11).isInstance(view)) {
                                            i11++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                                    k(viewGroup.getChildAt(i12), z9);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public String A() {
        return this.f12635m;
    }

    public g B() {
        return this.R;
    }

    public o C() {
        return null;
    }

    public long E() {
        return this.f12636n;
    }

    public List<Integer> F() {
        return this.f12639q;
    }

    public List<String> G() {
        return this.f12641s;
    }

    public List<Class> H() {
        return this.f12642t;
    }

    public List<View> I() {
        return this.f12640r;
    }

    public String[] J() {
        return null;
    }

    public r K(View view, boolean z9) {
        p pVar = this.D;
        if (pVar != null) {
            return pVar.K(view, z9);
        }
        return (z9 ? this.B : this.C).f12673a.get(view);
    }

    public boolean L(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] J2 = J();
        if (J2 != null) {
            int length = J2.length;
            int i10 = 0;
            while (i10 < length) {
                if (!N(rVar, rVar2, J2[i10])) {
                    i10++;
                }
            }
            return false;
        }
        for (String N2 : rVar.f12670a.keySet()) {
            if (N(rVar, rVar2, N2)) {
            }
        }
        return false;
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean M(View view) {
        ArrayList<Class> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f12643u;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f12644v;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList5 = this.f12645w;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f12645w.get(i10).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f12646x != null && x.H(view) != null && this.f12646x.contains(x.H(view))) {
            return false;
        }
        if ((this.f12639q.size() == 0 && this.f12640r.size() == 0 && (((arrayList = this.f12642t) == null || arrayList.isEmpty()) && ((arrayList2 = this.f12641s) == null || arrayList2.isEmpty()))) || this.f12639q.contains(Integer.valueOf(id)) || this.f12640r.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f12641s;
        if (arrayList6 != null && arrayList6.contains(x.H(view))) {
            return true;
        }
        if (this.f12642t != null) {
            for (int i11 = 0; i11 < this.f12642t.size(); i11++) {
                if (this.f12642t.get(i11).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void T(View view) {
        if (!this.M) {
            p.a<Animator, d> D2 = D();
            int size = D2.size();
            g0 e10 = z.e(view);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d m10 = D2.m(i10);
                if (m10.f12652a != null && e10.equals(m10.f12655d)) {
                    a.b(D2.i(i10));
                }
            }
            ArrayList<f> arrayList = this.N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.N.clone();
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    ((f) arrayList2.get(i11)).a(this);
                }
            }
            this.L = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void U(ViewGroup viewGroup) {
        d dVar;
        this.F = new ArrayList<>();
        this.G = new ArrayList<>();
        S(this.B, this.C);
        p.a<Animator, d> D2 = D();
        int size = D2.size();
        g0 e10 = z.e(viewGroup);
        for (int i10 = size - 1; i10 >= 0; i10--) {
            Animator i11 = D2.i(i10);
            if (!(i11 == null || (dVar = D2.get(i11)) == null || dVar.f12652a == null || !e10.equals(dVar.f12655d))) {
                r rVar = dVar.f12654c;
                View view = dVar.f12652a;
                r K2 = K(view, true);
                r z9 = z(view, true);
                if (!(K2 == null && z9 == null) && dVar.f12656e.L(rVar, z9)) {
                    if (i11.isRunning() || i11.isStarted()) {
                        i11.cancel();
                    } else {
                        D2.remove(i11);
                    }
                }
            }
        }
        u(viewGroup, this.B, this.C, this.F, this.G);
        Z();
    }

    public l V(f fVar) {
        ArrayList<f> arrayList = this.N;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.N.size() == 0) {
            this.N = null;
        }
        return this;
    }

    public l W(View view) {
        this.f12640r.remove(view);
        return this;
    }

    public void X(View view) {
        if (this.L) {
            if (!this.M) {
                p.a<Animator, d> D2 = D();
                int size = D2.size();
                g0 e10 = z.e(view);
                for (int i10 = size - 1; i10 >= 0; i10--) {
                    d m10 = D2.m(i10);
                    if (m10.f12652a != null && e10.equals(m10.f12655d)) {
                        a.c(D2.i(i10));
                    }
                }
                ArrayList<f> arrayList = this.N;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.N.clone();
                    int size2 = arrayList2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((f) arrayList2.get(i11)).b(this);
                    }
                }
            }
            this.L = false;
        }
    }

    /* access modifiers changed from: protected */
    public void Z() {
        g0();
        p.a<Animator, d> D2 = D();
        Iterator<Animator> it = this.O.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (D2.containsKey(next)) {
                g0();
                Y(next, D2);
            }
        }
        this.O.clear();
        v();
    }

    public l a0(long j10) {
        this.f12637o = j10;
        return this;
    }

    public l b(f fVar) {
        if (this.N == null) {
            this.N = new ArrayList<>();
        }
        this.N.add(fVar);
        return this;
    }

    public void b0(e eVar) {
        this.P = eVar;
    }

    public l c0(TimeInterpolator timeInterpolator) {
        this.f12638p = timeInterpolator;
        return this;
    }

    public l d(View view) {
        this.f12640r.add(view);
        return this;
    }

    public void d0(g gVar) {
        if (gVar == null) {
            gVar = T;
        }
        this.R = gVar;
    }

    public void e0(o oVar) {
    }

    public l f0(long j10) {
        this.f12636n = j10;
        return this;
    }

    /* access modifiers changed from: protected */
    public void g0() {
        if (this.K == 0) {
            ArrayList<f> arrayList = this.N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.N.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).d(this);
                }
            }
            this.M = false;
        }
        this.K++;
    }

    /* access modifiers changed from: protected */
    public void h(Animator animator) {
        if (animator == null) {
            v();
            return;
        }
        if (w() >= 0) {
            animator.setDuration(w());
        }
        if (E() >= 0) {
            animator.setStartDelay(E());
        }
        if (y() != null) {
            animator.setInterpolator(y());
        }
        animator.addListener(new c());
        animator.start();
    }

    /* access modifiers changed from: package-private */
    public String h0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f12637o != -1) {
            str2 = str2 + "dur(" + this.f12637o + ") ";
        }
        if (this.f12636n != -1) {
            str2 = str2 + "dly(" + this.f12636n + ") ";
        }
        if (this.f12638p != null) {
            str2 = str2 + "interp(" + this.f12638p + ") ";
        }
        if (this.f12639q.size() <= 0 && this.f12640r.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f12639q.size() > 0) {
            for (int i10 = 0; i10 < this.f12639q.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f12639q.get(i10);
            }
        }
        if (this.f12640r.size() > 0) {
            for (int i11 = 0; i11 < this.f12640r.size(); i11++) {
                if (i11 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f12640r.get(i11);
            }
        }
        return str3 + ")";
    }

    public abstract void i(r rVar);

    /* access modifiers changed from: package-private */
    public void n(r rVar) {
    }

    public abstract void p(r rVar);

    /* access modifiers changed from: package-private */
    public void q(ViewGroup viewGroup, boolean z9) {
        p.a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class> arrayList2;
        r(z9);
        if ((this.f12639q.size() > 0 || this.f12640r.size() > 0) && (((arrayList = this.f12641s) == null || arrayList.isEmpty()) && ((arrayList2 = this.f12642t) == null || arrayList2.isEmpty()))) {
            for (int i10 = 0; i10 < this.f12639q.size(); i10++) {
                View findViewById = viewGroup.findViewById(this.f12639q.get(i10).intValue());
                if (findViewById != null) {
                    r rVar = new r();
                    rVar.f12671b = findViewById;
                    if (z9) {
                        p(rVar);
                    } else {
                        i(rVar);
                    }
                    rVar.f12672c.add(this);
                    n(rVar);
                    f(z9 ? this.B : this.C, findViewById, rVar);
                }
            }
            for (int i11 = 0; i11 < this.f12640r.size(); i11++) {
                View view = this.f12640r.get(i11);
                r rVar2 = new r();
                rVar2.f12671b = view;
                if (z9) {
                    p(rVar2);
                } else {
                    i(rVar2);
                }
                rVar2.f12672c.add(this);
                n(rVar2);
                f(z9 ? this.B : this.C, view, rVar2);
            }
        } else {
            k(viewGroup, z9);
        }
        if (!z9 && (aVar = this.Q) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList3.add(this.B.f12676d.remove(this.Q.i(i12)));
            }
            for (int i13 = 0; i13 < size; i13++) {
                View view2 = (View) arrayList3.get(i13);
                if (view2 != null) {
                    this.B.f12676d.put(this.Q.m(i13), view2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void r(boolean z9) {
        s sVar;
        if (z9) {
            this.B.f12673a.clear();
            this.B.f12674b.clear();
            sVar = this.B;
        } else {
            this.C.f12673a.clear();
            this.C.f12674b.clear();
            sVar = this.C;
        }
        sVar.f12675c.d();
    }

    /* renamed from: s */
    public l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.O = new ArrayList<>();
            lVar.B = new s();
            lVar.C = new s();
            lVar.F = null;
            lVar.G = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator t(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    public String toString() {
        return h0("");
    }

    /* access modifiers changed from: protected */
    public void u(ViewGroup viewGroup, s sVar, s sVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        int i10;
        Animator animator;
        r rVar;
        View view;
        r rVar2;
        Animator animator2;
        p.a<Animator, d> D2 = D();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            r rVar3 = arrayList.get(i11);
            r rVar4 = arrayList2.get(i11);
            if (rVar3 != null && !rVar3.f12672c.contains(this)) {
                rVar3 = null;
            }
            if (rVar4 != null && !rVar4.f12672c.contains(this)) {
                rVar4 = null;
            }
            if (!(rVar3 == null && rVar4 == null)) {
                if (rVar3 == null || rVar4 == null || L(rVar3, rVar4)) {
                    Animator t9 = t(viewGroup, rVar3, rVar4);
                    if (t9 != null) {
                        if (rVar4 != null) {
                            View view2 = rVar4.f12671b;
                            String[] J2 = J();
                            if (view2 != null && J2 != null && J2.length > 0) {
                                rVar2 = new r();
                                rVar2.f12671b = view2;
                                r rVar5 = sVar2.f12673a.get(view2);
                                if (rVar5 != null) {
                                    int i12 = 0;
                                    while (i12 < J2.length) {
                                        rVar2.f12670a.put(J2[i12], rVar5.f12670a.get(J2[i12]));
                                        i12++;
                                        t9 = t9;
                                        size = size;
                                        rVar5 = rVar5;
                                    }
                                }
                                Animator animator3 = t9;
                                i10 = size;
                                int size2 = D2.size();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = D2.get(D2.i(i13));
                                    if (dVar.f12654c != null && dVar.f12652a == view2 && dVar.f12653b.equals(A()) && dVar.f12654c.equals(rVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                }
                            } else {
                                s sVar3 = sVar2;
                                i10 = size;
                                animator2 = t9;
                                rVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            rVar = rVar2;
                        } else {
                            s sVar4 = sVar2;
                            i10 = size;
                            view = rVar3.f12671b;
                            animator = t9;
                            rVar = null;
                        }
                        if (animator != null) {
                            D2.put(animator, new d(view, A(), this, z.e(viewGroup), rVar));
                            this.O.add(animator);
                        }
                        i11++;
                        size = i10;
                    }
                    s sVar5 = sVar2;
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            ViewGroup viewGroup2 = viewGroup;
            s sVar52 = sVar2;
            i10 = size;
            i11++;
            size = i10;
        }
        for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
            Animator animator4 = this.O.get(sparseIntArray.keyAt(i14));
            animator4.setStartDelay((((long) sparseIntArray.valueAt(i14)) - Long.MAX_VALUE) + animator4.getStartDelay());
        }
    }

    /* access modifiers changed from: protected */
    public void v() {
        int i10 = this.K - 1;
        this.K = i10;
        if (i10 == 0) {
            ArrayList<f> arrayList = this.N;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.N.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((f) arrayList2.get(i11)).c(this);
                }
            }
            for (int i12 = 0; i12 < this.B.f12675c.s(); i12++) {
                View t9 = this.B.f12675c.t(i12);
                if (t9 != null) {
                    x.p0(t9, false);
                }
            }
            for (int i13 = 0; i13 < this.C.f12675c.s(); i13++) {
                View t10 = this.C.f12675c.t(i13);
                if (t10 != null) {
                    x.p0(t10, false);
                }
            }
            this.M = true;
        }
    }

    public long w() {
        return this.f12637o;
    }

    public e x() {
        return this.P;
    }

    public TimeInterpolator y() {
        return this.f12638p;
    }

    /* access modifiers changed from: package-private */
    public r z(View view, boolean z9) {
        p pVar = this.D;
        if (pVar != null) {
            return pVar.z(view, z9);
        }
        ArrayList<r> arrayList = z9 ? this.F : this.G;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            r rVar = arrayList.get(i11);
            if (rVar == null) {
                return null;
            }
            if (rVar.f12671b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 < 0) {
            return null;
        }
        return (z9 ? this.G : this.F).get(i10);
    }
}
