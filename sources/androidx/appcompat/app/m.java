package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.t0;
import androidx.core.view.d0;
import androidx.core.view.e0;
import androidx.core.view.f0;
import androidx.core.view.g0;
import androidx.core.view.x;
import f.f;
import f.j;
import j.b;
import j.g;
import j.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class m extends a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;
    final e0 B = new a();
    final e0 C = new b();
    final g0 D = new c();

    /* renamed from: a  reason: collision with root package name */
    Context f415a;

    /* renamed from: b  reason: collision with root package name */
    private Context f416b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f417c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f418d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f419e;

    /* renamed from: f  reason: collision with root package name */
    h0 f420f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f421g;

    /* renamed from: h  reason: collision with root package name */
    View f422h;

    /* renamed from: i  reason: collision with root package name */
    t0 f423i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Object> f424j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private int f425k = -1;

    /* renamed from: l  reason: collision with root package name */
    private boolean f426l;

    /* renamed from: m  reason: collision with root package name */
    d f427m;

    /* renamed from: n  reason: collision with root package name */
    j.b f428n;

    /* renamed from: o  reason: collision with root package name */
    b.a f429o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f430p;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<a.b> f431q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    private boolean f432r;

    /* renamed from: s  reason: collision with root package name */
    private int f433s = 0;

    /* renamed from: t  reason: collision with root package name */
    boolean f434t = true;

    /* renamed from: u  reason: collision with root package name */
    boolean f435u;

    /* renamed from: v  reason: collision with root package name */
    boolean f436v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f437w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f438x = true;

    /* renamed from: y  reason: collision with root package name */
    h f439y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f440z;

    class a extends f0 {
        a() {
        }

        public void b(View view) {
            View view2;
            m mVar = m.this;
            if (mVar.f434t && (view2 = mVar.f422h) != null) {
                view2.setTranslationY(0.0f);
                m.this.f419e.setTranslationY(0.0f);
            }
            m.this.f419e.setVisibility(8);
            m.this.f419e.setTransitioning(false);
            m mVar2 = m.this;
            mVar2.f439y = null;
            mVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = m.this.f418d;
            if (actionBarOverlayLayout != null) {
                x.d0(actionBarOverlayLayout);
            }
        }
    }

    class b extends f0 {
        b() {
        }

        public void b(View view) {
            m mVar = m.this;
            mVar.f439y = null;
            mVar.f419e.requestLayout();
        }
    }

    class c implements g0 {
        c() {
        }

        public void a(View view) {
            ((View) m.this.f419e.getParent()).invalidate();
        }
    }

    public class d extends j.b implements e.a {

        /* renamed from: o  reason: collision with root package name */
        private final Context f444o;

        /* renamed from: p  reason: collision with root package name */
        private final e f445p;

        /* renamed from: q  reason: collision with root package name */
        private b.a f446q;

        /* renamed from: r  reason: collision with root package name */
        private WeakReference<View> f447r;

        public d(Context context, b.a aVar) {
            this.f444o = context;
            this.f446q = aVar;
            e S = new e(context).S(1);
            this.f445p = S;
            S.R(this);
        }

        public boolean a(e eVar, MenuItem menuItem) {
            b.a aVar = this.f446q;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        public void b(e eVar) {
            if (this.f446q != null) {
                k();
                m.this.f421g.l();
            }
        }

        public void c() {
            m mVar = m.this;
            if (mVar.f427m == this) {
                if (!m.w(mVar.f435u, mVar.f436v, false)) {
                    m mVar2 = m.this;
                    mVar2.f428n = this;
                    mVar2.f429o = this.f446q;
                } else {
                    this.f446q.c(this);
                }
                this.f446q = null;
                m.this.v(false);
                m.this.f421g.g();
                m mVar3 = m.this;
                mVar3.f418d.setHideOnContentScrollEnabled(mVar3.A);
                m.this.f427m = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.f447r;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f445p;
        }

        public MenuInflater f() {
            return new g(this.f444o);
        }

        public CharSequence g() {
            return m.this.f421g.getSubtitle();
        }

        public CharSequence i() {
            return m.this.f421g.getTitle();
        }

        public void k() {
            if (m.this.f427m == this) {
                this.f445p.d0();
                try {
                    this.f446q.d(this, this.f445p);
                } finally {
                    this.f445p.c0();
                }
            }
        }

        public boolean l() {
            return m.this.f421g.j();
        }

        public void m(View view) {
            m.this.f421g.setCustomView(view);
            this.f447r = new WeakReference<>(view);
        }

        public void n(int i10) {
            o(m.this.f415a.getResources().getString(i10));
        }

        public void o(CharSequence charSequence) {
            m.this.f421g.setSubtitle(charSequence);
        }

        public void q(int i10) {
            r(m.this.f415a.getResources().getString(i10));
        }

        public void r(CharSequence charSequence) {
            m.this.f421g.setTitle(charSequence);
        }

        public void s(boolean z9) {
            super.s(z9);
            m.this.f421g.setTitleOptional(z9);
        }

        public boolean t() {
            this.f445p.d0();
            try {
                return this.f446q.b(this, this.f445p);
            } finally {
                this.f445p.c0();
            }
        }
    }

    public m(Activity activity, boolean z9) {
        this.f417c = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (!z9) {
            this.f422h = decorView.findViewById(16908290);
        }
    }

    public m(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }

    private h0 A(View view) {
        if (view instanceof h0) {
            return (h0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.f437w) {
            this.f437w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f418d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.decor_content_parent);
        this.f418d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f420f = A(view.findViewById(f.action_bar));
        this.f421g = (ActionBarContextView) view.findViewById(f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.action_bar_container);
        this.f419e = actionBarContainer;
        h0 h0Var = this.f420f;
        if (h0Var == null || this.f421g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f415a = h0Var.getContext();
        boolean z9 = (this.f420f.n() & 4) != 0;
        if (z9) {
            this.f426l = true;
        }
        j.a b10 = j.a.b(this.f415a);
        J(b10.a() || z9);
        H(b10.g());
        TypedArray obtainStyledAttributes = this.f415a.obtainStyledAttributes((AttributeSet) null, j.f8588a, f.a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(j.f8638k, false)) {
            I(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f8628i, 0);
        if (dimensionPixelSize != 0) {
            G((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void H(boolean z9) {
        this.f432r = z9;
        if (!z9) {
            this.f420f.j((t0) null);
            this.f419e.setTabContainer(this.f423i);
        } else {
            this.f419e.setTabContainer((t0) null);
            this.f420f.j(this.f423i);
        }
        boolean z10 = true;
        boolean z11 = B() == 2;
        t0 t0Var = this.f423i;
        if (t0Var != null) {
            if (z11) {
                t0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f418d;
                if (actionBarOverlayLayout != null) {
                    x.d0(actionBarOverlayLayout);
                }
            } else {
                t0Var.setVisibility(8);
            }
        }
        this.f420f.t(!this.f432r && z11);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f418d;
        if (this.f432r || !z11) {
            z10 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z10);
    }

    private boolean K() {
        return x.P(this.f419e);
    }

    private void L() {
        if (!this.f437w) {
            this.f437w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f418d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            M(false);
        }
    }

    private void M(boolean z9) {
        if (w(this.f435u, this.f436v, this.f437w)) {
            if (!this.f438x) {
                this.f438x = true;
                z(z9);
            }
        } else if (this.f438x) {
            this.f438x = false;
            y(z9);
        }
    }

    static boolean w(boolean z9, boolean z10, boolean z11) {
        if (z11) {
            return true;
        }
        return !z9 && !z10;
    }

    public int B() {
        return this.f420f.p();
    }

    public void E(boolean z9) {
        F(z9 ? 4 : 0, 4);
    }

    public void F(int i10, int i11) {
        int n10 = this.f420f.n();
        if ((i11 & 4) != 0) {
            this.f426l = true;
        }
        this.f420f.m((i10 & i11) | ((~i11) & n10));
    }

    public void G(float f10) {
        x.n0(this.f419e, f10);
    }

    public void I(boolean z9) {
        if (!z9 || this.f418d.w()) {
            this.A = z9;
            this.f418d.setHideOnContentScrollEnabled(z9);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    public void J(boolean z9) {
        this.f420f.k(z9);
    }

    public void a() {
        if (this.f436v) {
            this.f436v = false;
            M(true);
        }
    }

    public void b() {
        h hVar = this.f439y;
        if (hVar != null) {
            hVar.a();
            this.f439y = null;
        }
    }

    public void c(int i10) {
        this.f433s = i10;
    }

    public void d() {
    }

    public void e(boolean z9) {
        this.f434t = z9;
    }

    public void f() {
        if (!this.f436v) {
            this.f436v = true;
            M(true);
        }
    }

    public boolean h() {
        h0 h0Var = this.f420f;
        if (h0Var == null || !h0Var.l()) {
            return false;
        }
        this.f420f.collapseActionView();
        return true;
    }

    public void i(boolean z9) {
        if (z9 != this.f430p) {
            this.f430p = z9;
            int size = this.f431q.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f431q.get(i10).a(z9);
            }
        }
    }

    public int j() {
        return this.f420f.n();
    }

    public Context k() {
        if (this.f416b == null) {
            TypedValue typedValue = new TypedValue();
            this.f415a.getTheme().resolveAttribute(f.a.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f416b = new ContextThemeWrapper(this.f415a, i10);
            } else {
                this.f416b = this.f415a;
            }
        }
        return this.f416b;
    }

    public void m(Configuration configuration) {
        H(j.a.b(this.f415a).g());
    }

    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        d dVar = this.f427m;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        boolean z9 = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z9 = false;
        }
        e10.setQwertyMode(z9);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    public void r(boolean z9) {
        if (!this.f426l) {
            E(z9);
        }
    }

    public void s(boolean z9) {
        h hVar;
        this.f440z = z9;
        if (!z9 && (hVar = this.f439y) != null) {
            hVar.a();
        }
    }

    public void t(CharSequence charSequence) {
        this.f420f.setWindowTitle(charSequence);
    }

    public j.b u(b.a aVar) {
        d dVar = this.f427m;
        if (dVar != null) {
            dVar.c();
        }
        this.f418d.setHideOnContentScrollEnabled(false);
        this.f421g.k();
        d dVar2 = new d(this.f421g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f427m = dVar2;
        dVar2.k();
        this.f421g.h(dVar2);
        v(true);
        return dVar2;
    }

    public void v(boolean z9) {
        d0 d0Var;
        d0 d0Var2;
        if (z9) {
            L();
        } else {
            C();
        }
        if (K()) {
            if (z9) {
                d0Var = this.f420f.q(4, 100);
                d0Var2 = this.f421g.f(0, 200);
            } else {
                d0Var2 = this.f420f.q(0, 200);
                d0Var = this.f421g.f(8, 100);
            }
            h hVar = new h();
            hVar.d(d0Var, d0Var2);
            hVar.h();
        } else if (z9) {
            this.f420f.i(4);
            this.f421g.setVisibility(0);
        } else {
            this.f420f.i(0);
            this.f421g.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        b.a aVar = this.f429o;
        if (aVar != null) {
            aVar.c(this.f428n);
            this.f428n = null;
            this.f429o = null;
        }
    }

    public void y(boolean z9) {
        View view;
        h hVar = this.f439y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f433s != 0 || (!this.f440z && !z9)) {
            this.B.b((View) null);
            return;
        }
        this.f419e.setAlpha(1.0f);
        this.f419e.setTransitioning(true);
        h hVar2 = new h();
        float f10 = (float) (-this.f419e.getHeight());
        if (z9) {
            int[] iArr = {0, 0};
            this.f419e.getLocationInWindow(iArr);
            f10 -= (float) iArr[1];
        }
        d0 m10 = x.c(this.f419e).m(f10);
        m10.k(this.D);
        hVar2.c(m10);
        if (this.f434t && (view = this.f422h) != null) {
            hVar2.c(x.c(view).m(f10));
        }
        hVar2.f(E);
        hVar2.e(250);
        hVar2.g(this.B);
        this.f439y = hVar2;
        hVar2.h();
    }

    public void z(boolean z9) {
        View view;
        View view2;
        h hVar = this.f439y;
        if (hVar != null) {
            hVar.a();
        }
        this.f419e.setVisibility(0);
        if (this.f433s != 0 || (!this.f440z && !z9)) {
            this.f419e.setAlpha(1.0f);
            this.f419e.setTranslationY(0.0f);
            if (this.f434t && (view = this.f422h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b((View) null);
        } else {
            this.f419e.setTranslationY(0.0f);
            float f10 = (float) (-this.f419e.getHeight());
            if (z9) {
                int[] iArr = {0, 0};
                this.f419e.getLocationInWindow(iArr);
                f10 -= (float) iArr[1];
            }
            this.f419e.setTranslationY(f10);
            h hVar2 = new h();
            d0 m10 = x.c(this.f419e).m(0.0f);
            m10.k(this.D);
            hVar2.c(m10);
            if (this.f434t && (view2 = this.f422h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(x.c(this.f422h).m(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250);
            hVar2.g(this.C);
            this.f439y = hVar2;
            hVar2.h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f418d;
        if (actionBarOverlayLayout != null) {
            x.d0(actionBarOverlayLayout);
        }
    }
}
