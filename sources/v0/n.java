package v0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private static l f12657a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<WeakReference<p.a<ViewGroup, ArrayList<l>>>> f12658b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    static ArrayList<ViewGroup> f12659c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: m  reason: collision with root package name */
        l f12660m;

        /* renamed from: n  reason: collision with root package name */
        ViewGroup f12661n;

        /* renamed from: v0.n$a$a  reason: collision with other inner class name */
        class C0216a extends m {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p.a f12662a;

            C0216a(p.a aVar) {
                this.f12662a = aVar;
            }

            public void c(l lVar) {
                ((ArrayList) this.f12662a.get(a.this.f12661n)).remove(lVar);
            }
        }

        a(l lVar, ViewGroup viewGroup) {
            this.f12660m = lVar;
            this.f12661n = viewGroup;
        }

        private void a() {
            this.f12661n.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f12661n.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!n.f12659c.remove(this.f12661n)) {
                return true;
            }
            p.a<ViewGroup, ArrayList<l>> b10 = n.b();
            ArrayList arrayList = b10.get(this.f12661n);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b10.put(this.f12661n, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f12660m);
            this.f12660m.b(new C0216a(b10));
            this.f12660m.q(this.f12661n, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).X(this.f12661n);
                }
            }
            this.f12660m.U(this.f12661n);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            n.f12659c.remove(this.f12661n);
            ArrayList arrayList = n.b().get(this.f12661n);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).X(this.f12661n);
                }
            }
            this.f12660m.r(true);
        }
    }

    public static void a(ViewGroup viewGroup, l lVar) {
        if (!f12659c.contains(viewGroup) && x.P(viewGroup)) {
            f12659c.add(viewGroup);
            if (lVar == null) {
                lVar = f12657a;
            }
            l s9 = lVar.clone();
            d(viewGroup, s9);
            k.c(viewGroup, (k) null);
            c(viewGroup, s9);
        }
    }

    static p.a<ViewGroup, ArrayList<l>> b() {
        p.a<ViewGroup, ArrayList<l>> aVar;
        WeakReference weakReference = f12658b.get();
        if (weakReference != null && (aVar = (p.a) weakReference.get()) != null) {
            return aVar;
        }
        p.a<ViewGroup, ArrayList<l>> aVar2 = new p.a<>();
        f12658b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, l lVar) {
        if (lVar != null && viewGroup != null) {
            a aVar = new a(lVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    private static void d(ViewGroup viewGroup, l lVar) {
        ArrayList arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((l) it.next()).T(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.q(viewGroup, true);
        }
        k b10 = k.b(viewGroup);
        if (b10 != null) {
            b10.a();
        }
    }
}
