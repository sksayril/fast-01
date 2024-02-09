package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

public abstract class a implements j {

    /* renamed from: m  reason: collision with root package name */
    protected Context f475m;

    /* renamed from: n  reason: collision with root package name */
    protected Context f476n;

    /* renamed from: o  reason: collision with root package name */
    protected e f477o;

    /* renamed from: p  reason: collision with root package name */
    protected LayoutInflater f478p;

    /* renamed from: q  reason: collision with root package name */
    protected LayoutInflater f479q;

    /* renamed from: r  reason: collision with root package name */
    private j.a f480r;

    /* renamed from: s  reason: collision with root package name */
    private int f481s;

    /* renamed from: t  reason: collision with root package name */
    private int f482t;

    /* renamed from: u  reason: collision with root package name */
    protected k f483u;

    /* renamed from: v  reason: collision with root package name */
    private int f484v;

    public a(Context context, int i10, int i11) {
        this.f475m = context;
        this.f478p = LayoutInflater.from(context);
        this.f481s = i10;
        this.f482t = i11;
    }

    /* access modifiers changed from: protected */
    public void a(View view, int i10) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f483u).addView(view, i10);
    }

    public void b(e eVar, boolean z9) {
        j.a aVar = this.f480r;
        if (aVar != null) {
            aVar.b(eVar, z9);
        }
    }

    public abstract void c(g gVar, k.a aVar);

    public void d(Context context, e eVar) {
        this.f476n = context;
        this.f479q = LayoutInflater.from(context);
        this.f477o = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(androidx.appcompat.view.menu.m r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.j$a r0 = r1.f480r
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.e r2 = r1.f477o
        L_0x0009:
            boolean r2 = r0.c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.a.e(androidx.appcompat.view.menu.m):boolean");
    }

    public void f(boolean z9) {
        ViewGroup viewGroup = (ViewGroup) this.f483u;
        if (viewGroup != null) {
            e eVar = this.f477o;
            int i10 = 0;
            if (eVar != null) {
                eVar.r();
                ArrayList<g> E = this.f477o.E();
                int size = E.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    g gVar = E.get(i12);
                    if (q(i11, gVar)) {
                        View childAt = viewGroup.getChildAt(i11);
                        g itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View n10 = n(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            n10.setPressed(false);
                            n10.jumpDrawablesToCurrentState();
                        }
                        if (n10 != childAt) {
                            a(n10, i11);
                        }
                        i11++;
                    }
                }
                i10 = i11;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (!l(viewGroup, i10)) {
                    i10++;
                }
            }
        }
    }

    public k.a h(ViewGroup viewGroup) {
        return (k.a) this.f478p.inflate(this.f482t, viewGroup, false);
    }

    public boolean i(e eVar, g gVar) {
        return false;
    }

    public boolean j(e eVar, g gVar) {
        return false;
    }

    public void k(j.a aVar) {
        this.f480r = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean l(ViewGroup viewGroup, int i10) {
        viewGroup.removeViewAt(i10);
        return true;
    }

    public j.a m() {
        return this.f480r;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        k.a h10 = view instanceof k.a ? (k.a) view : h(viewGroup);
        c(gVar, h10);
        return (View) h10;
    }

    public k o(ViewGroup viewGroup) {
        if (this.f483u == null) {
            k kVar = (k) this.f478p.inflate(this.f481s, viewGroup, false);
            this.f483u = kVar;
            kVar.b(this.f477o);
            f(true);
        }
        return this.f483u;
    }

    public void p(int i10) {
        this.f484v = i10;
    }

    public abstract boolean q(int i10, g gVar);
}
