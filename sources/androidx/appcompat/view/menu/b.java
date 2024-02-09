package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.p0;
import androidx.core.view.e;
import androidx.core.view.x;
import f.g;
import java.util.ArrayList;
import java.util.List;

final class b extends h implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int N = g.abc_cascading_menu_item_layout;
    private View A;
    View B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private j.a J;
    ViewTreeObserver K;
    private PopupWindow.OnDismissListener L;
    boolean M;

    /* renamed from: n  reason: collision with root package name */
    private final Context f485n;

    /* renamed from: o  reason: collision with root package name */
    private final int f486o;

    /* renamed from: p  reason: collision with root package name */
    private final int f487p;

    /* renamed from: q  reason: collision with root package name */
    private final int f488q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f489r;

    /* renamed from: s  reason: collision with root package name */
    final Handler f490s;

    /* renamed from: t  reason: collision with root package name */
    private final List<e> f491t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    final List<d> f492u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f493v = new a();

    /* renamed from: w  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f494w = new C0007b();

    /* renamed from: x  reason: collision with root package name */
    private final o0 f495x = new c();

    /* renamed from: y  reason: collision with root package name */
    private int f496y = 0;

    /* renamed from: z  reason: collision with root package name */
    private int f497z = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (b.this.c() && b.this.f492u.size() > 0 && !b.this.f492u.get(0).f505a.x()) {
                View view = b.this.B;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                for (d dVar : b.this.f492u) {
                    dVar.f505a.a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    class C0007b implements View.OnAttachStateChangeListener {
        C0007b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.K;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.K = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.K.removeGlobalOnLayoutListener(bVar.f493v);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements o0 {

        class a implements Runnable {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ d f501m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ MenuItem f502n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ e f503o;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f501m = dVar;
                this.f502n = menuItem;
                this.f503o = eVar;
            }

            public void run() {
                d dVar = this.f501m;
                if (dVar != null) {
                    b.this.M = true;
                    dVar.f506b.e(false);
                    b.this.M = false;
                }
                if (this.f502n.isEnabled() && this.f502n.hasSubMenu()) {
                    this.f503o.L(this.f502n, 4);
                }
            }
        }

        c() {
        }

        public void e(e eVar, MenuItem menuItem) {
            d dVar = null;
            b.this.f490s.removeCallbacksAndMessages((Object) null);
            int size = b.this.f492u.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                } else if (eVar == b.this.f492u.get(i10).f506b) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 != -1) {
                int i11 = i10 + 1;
                if (i11 < b.this.f492u.size()) {
                    dVar = b.this.f492u.get(i11);
                }
                b.this.f490s.postAtTime(new a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void f(e eVar, MenuItem menuItem) {
            b.this.f490s.removeCallbacksAndMessages(eVar);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final p0 f505a;

        /* renamed from: b  reason: collision with root package name */
        public final e f506b;

        /* renamed from: c  reason: collision with root package name */
        public final int f507c;

        public d(p0 p0Var, e eVar, int i10) {
            this.f505a = p0Var;
            this.f506b = eVar;
            this.f507c = i10;
        }

        public ListView a() {
            return this.f505a.h();
        }
    }

    public b(Context context, View view, int i10, int i11, boolean z9) {
        this.f485n = context;
        this.A = view;
        this.f487p = i10;
        this.f488q = i11;
        this.f489r = z9;
        this.H = false;
        this.C = D();
        Resources resources = context.getResources();
        this.f486o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.abc_config_prefDialogWidth));
        this.f490s = new Handler();
    }

    private int A(e eVar) {
        int size = this.f492u.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (eVar == this.f492u.get(i10).f506b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = eVar.getItem(i10);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        int i10;
        d dVar2;
        int firstVisiblePosition;
        MenuItem B2 = B(dVar.f506b, eVar);
        if (B2 == null) {
            return null;
        }
        ListView a10 = dVar.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            dVar2 = (d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (d) adapter;
            i10 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i11 >= count) {
                i11 = -1;
                break;
            } else if (B2 == dVar2.getItem(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1 && (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a10.getChildCount()) {
            return a10.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return x.z(this.A) == 1 ? 0 : 1;
    }

    private int E(int i10) {
        List<d> list = this.f492u;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.B.getWindowVisibleDisplayFrame(rect);
        return this.C == 1 ? (iArr[0] + a10.getWidth()) + i10 > rect.right ? 0 : 1 : iArr[0] - i10 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        View view;
        d dVar;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f485n);
        d dVar2 = new d(eVar, from, this.f489r, N);
        if (!c() && this.H) {
            dVar2.d(true);
        } else if (c()) {
            dVar2.d(h.x(eVar));
        }
        int o10 = h.o(dVar2, (ViewGroup) null, this.f485n, this.f486o);
        p0 z9 = z();
        z9.p(dVar2);
        z9.B(o10);
        z9.C(this.f497z);
        if (this.f492u.size() > 0) {
            List<d> list = this.f492u;
            dVar = list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z9.Q(false);
            z9.N((Object) null);
            int E2 = E(o10);
            boolean z10 = E2 == 1;
            this.C = E2;
            if (Build.VERSION.SDK_INT >= 26) {
                z9.z(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.A.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f497z & 7) == 5) {
                    iArr[0] = iArr[0] + this.A.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.f497z & 5) != 5) {
                if (z10) {
                    o10 = view.getWidth();
                }
                i12 = i10 - o10;
                z9.l(i12);
                z9.I(true);
                z9.j(i11);
            } else if (!z10) {
                o10 = view.getWidth();
                i12 = i10 - o10;
                z9.l(i12);
                z9.I(true);
                z9.j(i11);
            }
            i12 = i10 + o10;
            z9.l(i12);
            z9.I(true);
            z9.j(i11);
        } else {
            if (this.D) {
                z9.l(this.F);
            }
            if (this.E) {
                z9.j(this.G);
            }
            z9.D(n());
        }
        this.f492u.add(new d(z9, eVar, this.C));
        z9.a();
        ListView h10 = z9.h();
        h10.setOnKeyListener(this);
        if (dVar == null && this.I && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.abc_popup_menu_header_item_layout, h10, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(eVar.x());
            h10.addHeaderView(frameLayout, (Object) null, false);
            z9.a();
        }
    }

    private p0 z() {
        p0 p0Var = new p0(this.f485n, (AttributeSet) null, this.f487p, this.f488q);
        p0Var.P(this.f495x);
        p0Var.H(this);
        p0Var.G(this);
        p0Var.z(this.A);
        p0Var.C(this.f497z);
        p0Var.F(true);
        p0Var.E(2);
        return p0Var;
    }

    public void a() {
        if (!c()) {
            for (e F2 : this.f491t) {
                F(F2);
            }
            this.f491t.clear();
            View view = this.A;
            this.B = view;
            if (view != null) {
                boolean z9 = this.K == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.K = viewTreeObserver;
                if (z9) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f493v);
                }
                this.B.addOnAttachStateChangeListener(this.f494w);
            }
        }
    }

    public void b(e eVar, boolean z9) {
        int A2 = A(eVar);
        if (A2 >= 0) {
            int i10 = A2 + 1;
            if (i10 < this.f492u.size()) {
                this.f492u.get(i10).f506b.e(false);
            }
            d remove = this.f492u.remove(A2);
            remove.f506b.O(this);
            if (this.M) {
                remove.f505a.O((Object) null);
                remove.f505a.A(0);
            }
            remove.f505a.dismiss();
            int size = this.f492u.size();
            this.C = size > 0 ? this.f492u.get(size - 1).f507c : D();
            if (size == 0) {
                dismiss();
                j.a aVar = this.J;
                if (aVar != null) {
                    aVar.b(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.K;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.K.removeGlobalOnLayoutListener(this.f493v);
                    }
                    this.K = null;
                }
                this.B.removeOnAttachStateChangeListener(this.f494w);
                this.L.onDismiss();
            } else if (z9) {
                this.f492u.get(0).f506b.e(false);
            }
        }
    }

    public boolean c() {
        return this.f492u.size() > 0 && this.f492u.get(0).f505a.c();
    }

    public void dismiss() {
        int size = this.f492u.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f492u.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.f505a.c()) {
                    dVar.f505a.dismiss();
                }
            }
        }
    }

    public boolean e(m mVar) {
        for (d next : this.f492u) {
            if (mVar == next.f506b) {
                next.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.J;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    public void f(boolean z9) {
        for (d a10 : this.f492u) {
            h.y(a10.a().getAdapter()).notifyDataSetChanged();
        }
    }

    public boolean g() {
        return false;
    }

    public ListView h() {
        if (this.f492u.isEmpty()) {
            return null;
        }
        List<d> list = this.f492u;
        return list.get(list.size() - 1).a();
    }

    public void k(j.a aVar) {
        this.J = aVar;
    }

    public void l(e eVar) {
        eVar.c(this, this.f485n);
        if (c()) {
            F(eVar);
        } else {
            this.f491t.add(eVar);
        }
    }

    /* access modifiers changed from: protected */
    public boolean m() {
        return false;
    }

    public void onDismiss() {
        d dVar;
        int size = this.f492u.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f492u.get(i10);
            if (!dVar.f505a.c()) {
                break;
            }
            i10++;
        }
        if (dVar != null) {
            dVar.f506b.e(false);
        }
    }

    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(View view) {
        if (this.A != view) {
            this.A = view;
            this.f497z = e.b(this.f496y, x.z(view));
        }
    }

    public void r(boolean z9) {
        this.H = z9;
    }

    public void s(int i10) {
        if (this.f496y != i10) {
            this.f496y = i10;
            this.f497z = e.b(i10, x.z(this.A));
        }
    }

    public void t(int i10) {
        this.D = true;
        this.F = i10;
    }

    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.L = onDismissListener;
    }

    public void v(boolean z9) {
        this.I = z9;
    }

    public void w(int i10) {
        this.E = true;
        this.G = i10;
    }
}
