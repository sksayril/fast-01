package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.d0;
import androidx.core.view.f0;
import androidx.core.view.x;
import f.e;
import f.f;
import f.h;
import f.j;

public class c1 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f828a;

    /* renamed from: b  reason: collision with root package name */
    private int f829b;

    /* renamed from: c  reason: collision with root package name */
    private View f830c;

    /* renamed from: d  reason: collision with root package name */
    private View f831d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f832e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f833f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f834g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f835h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f836i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f837j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f838k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f839l;

    /* renamed from: m  reason: collision with root package name */
    boolean f840m;

    /* renamed from: n  reason: collision with root package name */
    private c f841n;

    /* renamed from: o  reason: collision with root package name */
    private int f842o;

    /* renamed from: p  reason: collision with root package name */
    private int f843p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f844q;

    class a implements View.OnClickListener {

        /* renamed from: m  reason: collision with root package name */
        final k.a f845m;

        a() {
            this.f845m = new k.a(c1.this.f828a.getContext(), 0, 16908332, 0, 0, c1.this.f836i);
        }

        public void onClick(View view) {
            c1 c1Var = c1.this;
            Window.Callback callback = c1Var.f839l;
            if (callback != null && c1Var.f840m) {
                callback.onMenuItemSelected(0, this.f845m);
            }
        }
    }

    class b extends f0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f847a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f848b;

        b(int i10) {
            this.f848b = i10;
        }

        public void a(View view) {
            this.f847a = true;
        }

        public void b(View view) {
            if (!this.f847a) {
                c1.this.f828a.setVisibility(this.f848b);
            }
        }

        public void c(View view) {
            c1.this.f828a.setVisibility(0);
        }
    }

    public c1(Toolbar toolbar, boolean z9) {
        this(toolbar, z9, h.abc_action_bar_up_description, e.abc_ic_ab_back_material);
    }

    public c1(Toolbar toolbar, boolean z9, int i10, int i11) {
        Drawable drawable;
        this.f842o = 0;
        this.f843p = 0;
        this.f828a = toolbar;
        this.f836i = toolbar.getTitle();
        this.f837j = toolbar.getSubtitle();
        this.f835h = this.f836i != null;
        this.f834g = toolbar.getNavigationIcon();
        a1 u9 = a1.u(toolbar.getContext(), (AttributeSet) null, j.f8588a, f.a.actionBarStyle, 0);
        this.f844q = u9.f(j.f8643l);
        if (z9) {
            CharSequence o10 = u9.o(j.f8673r);
            if (!TextUtils.isEmpty(o10)) {
                C(o10);
            }
            CharSequence o11 = u9.o(j.f8663p);
            if (!TextUtils.isEmpty(o11)) {
                B(o11);
            }
            Drawable f10 = u9.f(j.f8653n);
            if (f10 != null) {
                x(f10);
            }
            Drawable f11 = u9.f(j.f8648m);
            if (f11 != null) {
                setIcon(f11);
            }
            if (this.f834g == null && (drawable = this.f844q) != null) {
                A(drawable);
            }
            m(u9.j(j.f8623h, 0));
            int m10 = u9.m(j.f8618g, 0);
            if (m10 != 0) {
                v(LayoutInflater.from(this.f828a.getContext()).inflate(m10, this.f828a, false));
                m(this.f829b | 16);
            }
            int l10 = u9.l(j.f8633j, 0);
            if (l10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f828a.getLayoutParams();
                layoutParams.height = l10;
                this.f828a.setLayoutParams(layoutParams);
            }
            int d10 = u9.d(j.f8613f, -1);
            int d11 = u9.d(j.f8608e, -1);
            if (d10 >= 0 || d11 >= 0) {
                this.f828a.J(Math.max(d10, 0), Math.max(d11, 0));
            }
            int m11 = u9.m(j.f8678s, 0);
            if (m11 != 0) {
                Toolbar toolbar2 = this.f828a;
                toolbar2.M(toolbar2.getContext(), m11);
            }
            int m12 = u9.m(j.f8668q, 0);
            if (m12 != 0) {
                Toolbar toolbar3 = this.f828a;
                toolbar3.L(toolbar3.getContext(), m12);
            }
            int m13 = u9.m(j.f8658o, 0);
            if (m13 != 0) {
                this.f828a.setPopupTheme(m13);
            }
        } else {
            this.f829b = u();
        }
        u9.v();
        w(i10);
        this.f838k = this.f828a.getNavigationContentDescription();
        this.f828a.setNavigationOnClickListener(new a());
    }

    private void D(CharSequence charSequence) {
        this.f836i = charSequence;
        if ((this.f829b & 8) != 0) {
            this.f828a.setTitle(charSequence);
            if (this.f835h) {
                x.i0(this.f828a.getRootView(), charSequence);
            }
        }
    }

    private void E() {
        if ((this.f829b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f838k)) {
            this.f828a.setNavigationContentDescription(this.f843p);
        } else {
            this.f828a.setNavigationContentDescription(this.f838k);
        }
    }

    private void F() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f829b & 4) != 0) {
            toolbar = this.f828a;
            drawable = this.f834g;
            if (drawable == null) {
                drawable = this.f844q;
            }
        } else {
            toolbar = this.f828a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void G() {
        Drawable drawable;
        int i10 = this.f829b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f833f) == null) {
            drawable = this.f832e;
        }
        this.f828a.setLogo(drawable);
    }

    private int u() {
        if (this.f828a.getNavigationIcon() == null) {
            return 11;
        }
        this.f844q = this.f828a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f834g = drawable;
        F();
    }

    public void B(CharSequence charSequence) {
        this.f837j = charSequence;
        if ((this.f829b & 8) != 0) {
            this.f828a.setSubtitle(charSequence);
        }
    }

    public void C(CharSequence charSequence) {
        this.f835h = true;
        D(charSequence);
    }

    public void a(Menu menu, j.a aVar) {
        if (this.f841n == null) {
            c cVar = new c(this.f828a.getContext());
            this.f841n = cVar;
            cVar.p(f.action_menu_presenter);
        }
        this.f841n.k(aVar);
        this.f828a.K((androidx.appcompat.view.menu.e) menu, this.f841n);
    }

    public boolean b() {
        return this.f828a.B();
    }

    public void c() {
        this.f840m = true;
    }

    public void collapseActionView() {
        this.f828a.e();
    }

    public boolean d() {
        return this.f828a.A();
    }

    public boolean e() {
        return this.f828a.w();
    }

    public boolean f() {
        return this.f828a.P();
    }

    public boolean g() {
        return this.f828a.d();
    }

    public Context getContext() {
        return this.f828a.getContext();
    }

    public CharSequence getTitle() {
        return this.f828a.getTitle();
    }

    public void h() {
        this.f828a.f();
    }

    public void i(int i10) {
        this.f828a.setVisibility(i10);
    }

    public void j(t0 t0Var) {
        Toolbar toolbar;
        View view = this.f830c;
        if (view != null && view.getParent() == (toolbar = this.f828a)) {
            toolbar.removeView(this.f830c);
        }
        this.f830c = t0Var;
        if (t0Var != null && this.f842o == 2) {
            this.f828a.addView(t0Var, 0);
            Toolbar.e eVar = (Toolbar.e) this.f830c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f307a = 8388691;
            t0Var.setAllowCollapse(true);
        }
    }

    public void k(boolean z9) {
    }

    public boolean l() {
        return this.f828a.v();
    }

    public void m(int i10) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i11 = this.f829b ^ i10;
        this.f829b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    E();
                }
                F();
            }
            if ((i11 & 3) != 0) {
                G();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f828a.setTitle(this.f836i);
                    toolbar = this.f828a;
                    charSequence = this.f837j;
                } else {
                    charSequence = null;
                    this.f828a.setTitle((CharSequence) null);
                    toolbar = this.f828a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i11 & 16) != 0 && (view = this.f831d) != null) {
                if ((i10 & 16) != 0) {
                    this.f828a.addView(view);
                } else {
                    this.f828a.removeView(view);
                }
            }
        }
    }

    public int n() {
        return this.f829b;
    }

    public void o(int i10) {
        x(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public int p() {
        return this.f842o;
    }

    public d0 q(int i10, long j10) {
        return x.c(this.f828a).b(i10 == 0 ? 1.0f : 0.0f).f(j10).h(new b(i10));
    }

    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void setIcon(int i10) {
        setIcon(i10 != 0 ? g.a.b(getContext(), i10) : null);
    }

    public void setIcon(Drawable drawable) {
        this.f832e = drawable;
        G();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f839l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f835h) {
            D(charSequence);
        }
    }

    public void t(boolean z9) {
        this.f828a.setCollapsible(z9);
    }

    public void v(View view) {
        View view2 = this.f831d;
        if (!(view2 == null || (this.f829b & 16) == 0)) {
            this.f828a.removeView(view2);
        }
        this.f831d = view;
        if (view != null && (this.f829b & 16) != 0) {
            this.f828a.addView(view);
        }
    }

    public void w(int i10) {
        if (i10 != this.f843p) {
            this.f843p = i10;
            if (TextUtils.isEmpty(this.f828a.getNavigationContentDescription())) {
                y(this.f843p);
            }
        }
    }

    public void x(Drawable drawable) {
        this.f833f = drawable;
        G();
    }

    public void y(int i10) {
        z(i10 == 0 ? null : getContext().getString(i10));
    }

    public void z(CharSequence charSequence) {
        this.f838k = charSequence;
        E();
    }
}
