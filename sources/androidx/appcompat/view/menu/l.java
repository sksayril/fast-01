package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.p0;
import androidx.core.view.x;
import f.d;
import f.g;

final class l extends h implements PopupWindow.OnDismissListener, View.OnKeyListener {
    private static final int H = g.abc_popup_menu_item_layout;
    private j.a A;
    ViewTreeObserver B;
    private boolean C;
    private boolean D;
    private int E;
    private int F = 0;
    private boolean G;

    /* renamed from: n  reason: collision with root package name */
    private final Context f596n;

    /* renamed from: o  reason: collision with root package name */
    private final e f597o;

    /* renamed from: p  reason: collision with root package name */
    private final d f598p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f599q;

    /* renamed from: r  reason: collision with root package name */
    private final int f600r;

    /* renamed from: s  reason: collision with root package name */
    private final int f601s;

    /* renamed from: t  reason: collision with root package name */
    private final int f602t;

    /* renamed from: u  reason: collision with root package name */
    final p0 f603u;

    /* renamed from: v  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f604v = new a();

    /* renamed from: w  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f605w = new b();

    /* renamed from: x  reason: collision with root package name */
    private PopupWindow.OnDismissListener f606x;

    /* renamed from: y  reason: collision with root package name */
    private View f607y;

    /* renamed from: z  reason: collision with root package name */
    View f608z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (l.this.c() && !l.this.f603u.x()) {
                View view = l.this.f608z;
                if (view == null || !view.isShown()) {
                    l.this.dismiss();
                } else {
                    l.this.f603u.a();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.B;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.B = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.B.removeGlobalOnLayoutListener(lVar.f604v);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, e eVar, View view, int i10, int i11, boolean z9) {
        this.f596n = context;
        this.f597o = eVar;
        this.f599q = z9;
        this.f598p = new d(eVar, LayoutInflater.from(context), z9, H);
        this.f601s = i10;
        this.f602t = i11;
        Resources resources = context.getResources();
        this.f600r = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.f607y = view;
        this.f603u = new p0(context, (AttributeSet) null, i10, i11);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (c()) {
            return true;
        }
        if (this.C || (view = this.f607y) == null) {
            return false;
        }
        this.f608z = view;
        this.f603u.G(this);
        this.f603u.H(this);
        this.f603u.F(true);
        View view2 = this.f608z;
        boolean z9 = this.B == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.B = viewTreeObserver;
        if (z9) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f604v);
        }
        view2.addOnAttachStateChangeListener(this.f605w);
        this.f603u.z(view2);
        this.f603u.C(this.F);
        if (!this.D) {
            this.E = h.o(this.f598p, (ViewGroup) null, this.f596n, this.f600r);
            this.D = true;
        }
        this.f603u.B(this.E);
        this.f603u.E(2);
        this.f603u.D(n());
        this.f603u.a();
        ListView h10 = this.f603u.h();
        h10.setOnKeyListener(this);
        if (this.G && this.f597o.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f596n).inflate(g.abc_popup_menu_header_item_layout, h10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f597o.x());
            }
            frameLayout.setEnabled(false);
            h10.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f603u.p(this.f598p);
        this.f603u.a();
        return true;
    }

    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void b(e eVar, boolean z9) {
        if (eVar == this.f597o) {
            dismiss();
            j.a aVar = this.A;
            if (aVar != null) {
                aVar.b(eVar, z9);
            }
        }
    }

    public boolean c() {
        return !this.C && this.f603u.c();
    }

    public void dismiss() {
        if (c()) {
            this.f603u.dismiss();
        }
    }

    public boolean e(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f596n, mVar, this.f608z, this.f599q, this.f601s, this.f602t);
            iVar.j(this.A);
            iVar.g(h.x(mVar));
            iVar.i(this.f606x);
            this.f606x = null;
            this.f597o.e(false);
            int d10 = this.f603u.d();
            int n10 = this.f603u.n();
            if ((Gravity.getAbsoluteGravity(this.F, x.z(this.f607y)) & 7) == 5) {
                d10 += this.f607y.getWidth();
            }
            if (iVar.n(d10, n10)) {
                j.a aVar = this.A;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    public void f(boolean z9) {
        this.D = false;
        d dVar = this.f598p;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public boolean g() {
        return false;
    }

    public ListView h() {
        return this.f603u.h();
    }

    public void k(j.a aVar) {
        this.A = aVar;
    }

    public void l(e eVar) {
    }

    public void onDismiss() {
        this.C = true;
        this.f597o.close();
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.B = this.f608z.getViewTreeObserver();
            }
            this.B.removeGlobalOnLayoutListener(this.f604v);
            this.B = null;
        }
        this.f608z.removeOnAttachStateChangeListener(this.f605w);
        PopupWindow.OnDismissListener onDismissListener = this.f606x;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f607y = view;
    }

    public void r(boolean z9) {
        this.f598p.d(z9);
    }

    public void s(int i10) {
        this.F = i10;
    }

    public void t(int i10) {
        this.f603u.l(i10);
    }

    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f606x = onDismissListener;
    }

    public void v(boolean z9) {
        this.G = z9;
    }

    public void w(int i10) {
        this.f603u.j(i10);
    }
}
