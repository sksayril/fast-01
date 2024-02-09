package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.x;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends l {

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<i.b0> f2963h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<i.b0> f2964i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<j> f2965j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private ArrayList<i> f2966k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    ArrayList<ArrayList<i.b0>> f2967l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    ArrayList<ArrayList<j>> f2968m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    ArrayList<ArrayList<i>> f2969n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    ArrayList<i.b0> f2970o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    ArrayList<i.b0> f2971p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    ArrayList<i.b0> f2972q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    ArrayList<i.b0> f2973r = new ArrayList<>();

    class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ArrayList f2974m;

        a(ArrayList arrayList) {
            this.f2974m = arrayList;
        }

        public void run() {
            Iterator it = this.f2974m.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.J(jVar.f3008a, jVar.f3009b, jVar.f3010c, jVar.f3011d, jVar.f3012e);
            }
            this.f2974m.clear();
            c.this.f2968m.remove(this.f2974m);
        }
    }

    class b implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ArrayList f2976m;

        b(ArrayList arrayList) {
            this.f2976m = arrayList;
        }

        public void run() {
            Iterator it = this.f2976m.iterator();
            while (it.hasNext()) {
                c.this.I((i) it.next());
            }
            this.f2976m.clear();
            c.this.f2969n.remove(this.f2976m);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    class C0060c implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ArrayList f2978m;

        C0060c(ArrayList arrayList) {
            this.f2978m = arrayList;
        }

        public void run() {
            Iterator it = this.f2978m.iterator();
            while (it.hasNext()) {
                c.this.H((i.b0) it.next());
            }
            this.f2978m.clear();
            c.this.f2967l.remove(this.f2978m);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.b0 f2980a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2981b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f2982c;

        d(i.b0 b0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2980a = b0Var;
            this.f2981b = viewPropertyAnimator;
            this.f2982c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2981b.setListener((Animator.AnimatorListener) null);
            this.f2982c.setAlpha(1.0f);
            c.this.x(this.f2980a);
            c.this.f2972q.remove(this.f2980a);
            c.this.M();
        }

        public void onAnimationStart(Animator animator) {
            c.this.y(this.f2980a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.b0 f2984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f2985b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2986c;

        e(i.b0 b0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2984a = b0Var;
            this.f2985b = view;
            this.f2986c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2985b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2986c.setListener((Animator.AnimatorListener) null);
            c.this.r(this.f2984a);
            c.this.f2970o.remove(this.f2984a);
            c.this.M();
        }

        public void onAnimationStart(Animator animator) {
            c.this.s(this.f2984a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i.b0 f2988a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2989b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f2990c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f2991d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2992e;

        f(i.b0 b0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2988a = b0Var;
            this.f2989b = i10;
            this.f2990c = view;
            this.f2991d = i11;
            this.f2992e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f2989b != 0) {
                this.f2990c.setTranslationX(0.0f);
            }
            if (this.f2991d != 0) {
                this.f2990c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f2992e.setListener((Animator.AnimatorListener) null);
            c.this.v(this.f2988a);
            c.this.f2971p.remove(this.f2988a);
            c.this.M();
        }

        public void onAnimationStart(Animator animator) {
            c.this.w(this.f2988a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f2994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2995b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f2996c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2994a = iVar;
            this.f2995b = viewPropertyAnimator;
            this.f2996c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2995b.setListener((Animator.AnimatorListener) null);
            this.f2996c.setAlpha(1.0f);
            this.f2996c.setTranslationX(0.0f);
            this.f2996c.setTranslationY(0.0f);
            c.this.t(this.f2994a.f3002a, true);
            c.this.f2973r.remove(this.f2994a.f3002a);
            c.this.M();
        }

        public void onAnimationStart(Animator animator) {
            c.this.u(this.f2994a.f3002a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f2998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2999b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f3000c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2998a = iVar;
            this.f2999b = viewPropertyAnimator;
            this.f3000c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2999b.setListener((Animator.AnimatorListener) null);
            this.f3000c.setAlpha(1.0f);
            this.f3000c.setTranslationX(0.0f);
            this.f3000c.setTranslationY(0.0f);
            c.this.t(this.f2998a.f3003b, false);
            c.this.f2973r.remove(this.f2998a.f3003b);
            c.this.M();
        }

        public void onAnimationStart(Animator animator) {
            c.this.u(this.f2998a.f3003b, false);
        }
    }

    private static class i {

        /* renamed from: a  reason: collision with root package name */
        public i.b0 f3002a;

        /* renamed from: b  reason: collision with root package name */
        public i.b0 f3003b;

        /* renamed from: c  reason: collision with root package name */
        public int f3004c;

        /* renamed from: d  reason: collision with root package name */
        public int f3005d;

        /* renamed from: e  reason: collision with root package name */
        public int f3006e;

        /* renamed from: f  reason: collision with root package name */
        public int f3007f;

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3002a + ", newHolder=" + this.f3003b + ", fromX=" + this.f3004c + ", fromY=" + this.f3005d + ", toX=" + this.f3006e + ", toY=" + this.f3007f + '}';
        }
    }

    private static class j {

        /* renamed from: a  reason: collision with root package name */
        public i.b0 f3008a;

        /* renamed from: b  reason: collision with root package name */
        public int f3009b;

        /* renamed from: c  reason: collision with root package name */
        public int f3010c;

        /* renamed from: d  reason: collision with root package name */
        public int f3011d;

        /* renamed from: e  reason: collision with root package name */
        public int f3012e;
    }

    private void K(i.b0 b0Var) {
        View view = b0Var.f3120a;
        ViewPropertyAnimator animate = view.animate();
        this.f2972q.add(b0Var);
        animate.setDuration(k()).alpha(0.0f).setListener(new d(b0Var, animate, view)).start();
    }

    private void N(List<i> list, i.b0 b0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (P(iVar, b0Var) && iVar.f3002a == null && iVar.f3003b == null) {
                list.remove(iVar);
            }
        }
    }

    private void O(i iVar) {
        i.b0 b0Var = iVar.f3002a;
        if (b0Var != null) {
            P(iVar, b0Var);
        }
        i.b0 b0Var2 = iVar.f3003b;
        if (b0Var2 != null) {
            P(iVar, b0Var2);
        }
    }

    private boolean P(i iVar, i.b0 b0Var) {
        boolean z9 = false;
        if (iVar.f3003b == b0Var) {
            iVar.f3003b = null;
        } else if (iVar.f3002a != b0Var) {
            return false;
        } else {
            iVar.f3002a = null;
            z9 = true;
        }
        b0Var.f3120a.setAlpha(1.0f);
        b0Var.f3120a.setTranslationX(0.0f);
        b0Var.f3120a.setTranslationY(0.0f);
        t(b0Var, z9);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void H(i.b0 b0Var) {
        View view = b0Var.f3120a;
        ViewPropertyAnimator animate = view.animate();
        this.f2970o.add(b0Var);
        animate.alpha(1.0f).setDuration(h()).setListener(new e(b0Var, view, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void I(i iVar) {
        i.b0 b0Var = iVar.f3002a;
        View view = null;
        View view2 = b0Var == null ? null : b0Var.f3120a;
        i.b0 b0Var2 = iVar.f3003b;
        if (b0Var2 != null) {
            view = b0Var2.f3120a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(i());
            this.f2973r.add(iVar.f3002a);
            duration.translationX((float) (iVar.f3006e - iVar.f3004c));
            duration.translationY((float) (iVar.f3007f - iVar.f3005d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f2973r.add(iVar.f3003b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(i()).alpha(1.0f).setListener(new h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: package-private */
    public void J(i.b0 b0Var, int i10, int i11, int i12, int i13) {
        View view = b0Var.f3120a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f2971p.add(b0Var);
        animate.setDuration(j()).setListener(new f(b0Var, i14, view, i15, animate)).start();
    }

    /* access modifiers changed from: package-private */
    public void L(List<i.b0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3120a.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void M() {
        if (!l()) {
            e();
        }
    }

    public boolean c(i.b0 b0Var, List<Object> list) {
        return !list.isEmpty() || super.c(b0Var, list);
    }

    public void f(i.b0 b0Var) {
        View view = b0Var.f3120a;
        view.animate().cancel();
        int size = this.f2965j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f2965j.get(size).f3008a == b0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                v(b0Var);
                this.f2965j.remove(size);
            }
        }
        N(this.f2966k, b0Var);
        if (this.f2963h.remove(b0Var)) {
            view.setAlpha(1.0f);
            x(b0Var);
        }
        if (this.f2964i.remove(b0Var)) {
            view.setAlpha(1.0f);
            r(b0Var);
        }
        for (int size2 = this.f2969n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f2969n.get(size2);
            N(arrayList, b0Var);
            if (arrayList.isEmpty()) {
                this.f2969n.remove(size2);
            }
        }
        for (int size3 = this.f2968m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f2968m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f3008a == b0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    v(b0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2968m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2967l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f2967l.get(size5);
            if (arrayList3.remove(b0Var)) {
                view.setAlpha(1.0f);
                r(b0Var);
                if (arrayList3.isEmpty()) {
                    this.f2967l.remove(size5);
                }
            }
        }
        this.f2972q.remove(b0Var);
        this.f2970o.remove(b0Var);
        this.f2973r.remove(b0Var);
        this.f2971p.remove(b0Var);
        M();
    }

    public void g() {
        int size = this.f2965j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f2965j.get(size);
            View view = jVar.f3008a.f3120a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            v(jVar.f3008a);
            this.f2965j.remove(size);
        }
        for (int size2 = this.f2963h.size() - 1; size2 >= 0; size2--) {
            x(this.f2963h.get(size2));
            this.f2963h.remove(size2);
        }
        int size3 = this.f2964i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            i.b0 b0Var = this.f2964i.get(size3);
            b0Var.f3120a.setAlpha(1.0f);
            r(b0Var);
            this.f2964i.remove(size3);
        }
        for (int size4 = this.f2966k.size() - 1; size4 >= 0; size4--) {
            O(this.f2966k.get(size4));
        }
        this.f2966k.clear();
        if (l()) {
            for (int size5 = this.f2968m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f2968m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f3008a.f3120a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    v(jVar2.f3008a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2968m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2967l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f2967l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    i.b0 b0Var2 = (i.b0) arrayList2.get(size8);
                    b0Var2.f3120a.setAlpha(1.0f);
                    r(b0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2967l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2969n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f2969n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    O((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2969n.remove(arrayList3);
                    }
                }
            }
            L(this.f2972q);
            L(this.f2971p);
            L(this.f2970o);
            L(this.f2973r);
            e();
        }
    }

    public boolean l() {
        return !this.f2964i.isEmpty() || !this.f2966k.isEmpty() || !this.f2965j.isEmpty() || !this.f2963h.isEmpty() || !this.f2971p.isEmpty() || !this.f2972q.isEmpty() || !this.f2970o.isEmpty() || !this.f2973r.isEmpty() || !this.f2968m.isEmpty() || !this.f2967l.isEmpty() || !this.f2969n.isEmpty();
    }

    public void p() {
        boolean z9 = !this.f2963h.isEmpty();
        boolean z10 = !this.f2965j.isEmpty();
        boolean z11 = !this.f2966k.isEmpty();
        boolean z12 = !this.f2964i.isEmpty();
        if (z9 || z10 || z12 || z11) {
            Iterator<i.b0> it = this.f2963h.iterator();
            while (it.hasNext()) {
                K(it.next());
            }
            this.f2963h.clear();
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f2965j);
                this.f2968m.add(arrayList);
                this.f2965j.clear();
                a aVar = new a(arrayList);
                if (z9) {
                    x.c0(((j) arrayList.get(0)).f3008a.f3120a, aVar, k());
                } else {
                    aVar.run();
                }
            }
            if (z11) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f2966k);
                this.f2969n.add(arrayList2);
                this.f2966k.clear();
                b bVar = new b(arrayList2);
                if (z9) {
                    x.c0(((i) arrayList2.get(0)).f3002a.f3120a, bVar, k());
                } else {
                    bVar.run();
                }
            }
            if (z12) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f2964i);
                this.f2967l.add(arrayList3);
                this.f2964i.clear();
                C0060c cVar = new C0060c(arrayList3);
                if (z9 || z10 || z11) {
                    long j10 = 0;
                    long k10 = z9 ? k() : 0;
                    long j11 = z10 ? j() : 0;
                    if (z11) {
                        j10 = i();
                    }
                    x.c0(((i.b0) arrayList3.get(0)).f3120a, cVar, k10 + Math.max(j11, j10));
                    return;
                }
                cVar.run();
            }
        }
    }
}
