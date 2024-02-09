package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

class c extends androidx.appcompat.view.menu.a implements b.a {
    private boolean A;
    private int B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;
    private final SparseBooleanArray J = new SparseBooleanArray();
    e K;
    a L;
    C0009c M;
    private b N;
    final f O = new f();
    int P;

    /* renamed from: w  reason: collision with root package name */
    d f794w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f795x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f796y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f797z;

    private class a extends i {
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false, f.a.actionOverflowMenuStyle);
            if (!((g) mVar.getItem()).l()) {
                View view2 = c.this.f794w;
                f(view2 == null ? (View) c.this.f483u : view2);
            }
            j(c.this.O);
        }

        /* access modifiers changed from: protected */
        public void e() {
            c cVar = c.this;
            cVar.L = null;
            cVar.P = 0;
            super.e();
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        public k.e a() {
            a aVar = c.this.L;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    private class C0009c implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private e f800m;

        public C0009c(e eVar) {
            this.f800m = eVar;
        }

        public void run() {
            if (c.this.f477o != null) {
                c.this.f477o.d();
            }
            View view = (View) c.this.f483u;
            if (!(view == null || view.getWindowToken() == null || !this.f800m.m())) {
                c.this.K = this.f800m;
            }
            c.this.M = null;
        }
    }

    private class d extends r implements ActionMenuView.a {

        class a extends l0 {

            /* renamed from: v  reason: collision with root package name */
            final /* synthetic */ c f803v;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f803v = cVar;
            }

            public k.e b() {
                e eVar = c.this.K;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                c.this.K();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.M != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, f.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            d1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    private class e extends i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z9) {
            super(context, eVar, view, z9, f.a.actionOverflowMenuStyle);
            h(8388613);
            j(c.this.O);
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (c.this.f477o != null) {
                c.this.f477o.close();
            }
            c.this.K = null;
            super.e();
        }
    }

    private class f implements j.a {
        f() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
            if (eVar instanceof m) {
                eVar.D().e(false);
            }
            j.a m10 = c.this.m();
            if (m10 != null) {
                m10.b(eVar, z9);
            }
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == c.this.f477o) {
                return false;
            }
            c.this.P = ((m) eVar).getItem().getItemId();
            j.a m10 = c.this.m();
            if (m10 != null) {
                return m10.c(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, f.g.abc_action_menu_layout, f.g.abc_action_menu_item_layout);
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f483u;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f794w;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f796y) {
            return this.f795x;
        }
        return null;
    }

    public boolean B() {
        k kVar;
        C0009c cVar = this.M;
        if (cVar == null || (kVar = this.f483u) == null) {
            e eVar = this.K;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.M = null;
        return true;
    }

    public boolean C() {
        a aVar = this.L;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.M != null || E();
    }

    public boolean E() {
        e eVar = this.K;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.E) {
            this.D = j.a.b(this.f476n).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f477o;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z9) {
        this.H = z9;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f483u = actionMenuView;
        actionMenuView.b(this.f477o);
    }

    public void I(Drawable drawable) {
        d dVar = this.f794w;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f796y = true;
        this.f795x = drawable;
    }

    public void J(boolean z9) {
        this.f797z = z9;
        this.A = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f797z || E() || (eVar = this.f477o) == null || this.f483u == null || this.M != null || eVar.z().isEmpty()) {
            return false;
        }
        C0009c cVar = new C0009c(new e(this.f476n, this.f477o, this.f794w, true));
        this.M = cVar;
        ((View) this.f483u).post(cVar);
        return true;
    }

    public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
        y();
        super.b(eVar, z9);
    }

    public void c(g gVar, k.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f483u);
        if (this.N == null) {
            this.N = new b();
        }
        actionMenuItemView.setPopupCallback(this.N);
    }

    public void d(Context context, androidx.appcompat.view.menu.e eVar) {
        super.d(context, eVar);
        Resources resources = context.getResources();
        j.a b10 = j.a.b(context);
        if (!this.A) {
            this.f797z = b10.h();
        }
        if (!this.G) {
            this.B = b10.c();
        }
        if (!this.E) {
            this.D = b10.d();
        }
        int i10 = this.B;
        if (this.f797z) {
            if (this.f794w == null) {
                d dVar = new d(this.f475m);
                this.f794w = dVar;
                if (this.f796y) {
                    dVar.setImageDrawable(this.f795x);
                    this.f795x = null;
                    this.f796y = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f794w.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f794w.getMeasuredWidth();
        } else {
            this.f794w = null;
        }
        this.C = i10;
        this.I = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean e(m mVar) {
        boolean z9 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m mVar2 = mVar;
        while (mVar2.e0() != this.f477o) {
            mVar2 = (m) mVar2.e0();
        }
        View z10 = z(mVar2.getItem());
        if (z10 == null) {
            return false;
        }
        this.P = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z9 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f476n, mVar, z10);
        this.L = aVar;
        aVar.g(z9);
        this.L.k();
        super.e(mVar);
        return true;
    }

    public void f(boolean z9) {
        k kVar;
        super.f(z9);
        ((View) this.f483u).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f477o;
        boolean z10 = false;
        if (eVar != null) {
            ArrayList<g> s9 = eVar.s();
            int size = s9.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b b10 = s9.get(i10).b();
                if (b10 != null) {
                    b10.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f477o;
        ArrayList<g> z11 = eVar2 != null ? eVar2.z() : null;
        if (this.f797z && z11 != null) {
            int size2 = z11.size();
            if (size2 == 1) {
                z10 = !z11.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z10 = true;
            }
        }
        d dVar = this.f794w;
        if (z10) {
            if (dVar == null) {
                this.f794w = new d(this.f475m);
            }
            ViewGroup viewGroup = (ViewGroup) this.f794w.getParent();
            if (viewGroup != this.f483u) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f794w);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f483u;
                actionMenuView.addView(this.f794w, actionMenuView.F());
            }
        } else if (dVar != null && dVar.getParent() == (kVar = this.f483u)) {
            ((ViewGroup) kVar).removeView(this.f794w);
        }
        ((ActionMenuView) this.f483u).setOverflowReserved(this.f797z);
    }

    public boolean g() {
        int i10;
        ArrayList<g> arrayList;
        int i11;
        int i12;
        int i13;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f477o;
        View view = null;
        int i14 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i15 = cVar.D;
        int i16 = cVar.C;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f483u;
        boolean z9 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            g gVar = arrayList.get(i19);
            if (gVar.o()) {
                i17++;
            } else if (gVar.n()) {
                i18++;
            } else {
                z9 = true;
            }
            if (cVar.H && gVar.isActionViewExpanded()) {
                i15 = 0;
            }
        }
        if (cVar.f797z && (z9 || i18 + i17 > i15)) {
            i15--;
        }
        int i20 = i15 - i17;
        SparseBooleanArray sparseBooleanArray = cVar.J;
        sparseBooleanArray.clear();
        if (cVar.F) {
            int i21 = cVar.I;
            i11 = i16 / i21;
            i12 = i21 + ((i16 % i21) / i11);
        } else {
            i12 = 0;
            i11 = 0;
        }
        int i22 = 0;
        int i23 = 0;
        while (i22 < i10) {
            g gVar2 = arrayList.get(i22);
            if (gVar2.o()) {
                View n10 = cVar.n(gVar2, view, viewGroup);
                if (cVar.F) {
                    i11 -= ActionMenuView.L(n10, i12, i11, makeMeasureSpec, i14);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i23 == 0) {
                    i23 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i13 = i10;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z10 = sparseBooleanArray.get(groupId2);
                boolean z11 = (i20 > 0 || z10) && i16 > 0 && (!cVar.F || i11 > 0);
                boolean z12 = z11;
                i13 = i10;
                if (z11) {
                    View n11 = cVar.n(gVar2, (View) null, viewGroup);
                    if (cVar.F) {
                        int L2 = ActionMenuView.L(n11, i12, i11, makeMeasureSpec, 0);
                        i11 -= L2;
                        if (L2 == 0) {
                            z12 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z13 = z12;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i23 == 0) {
                        i23 = measuredWidth2;
                    }
                    z11 = z13 & (!cVar.F ? i16 + i23 > 0 : i16 >= 0);
                }
                if (z11 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z10) {
                    sparseBooleanArray.put(groupId2, false);
                    int i24 = 0;
                    while (i24 < i22) {
                        g gVar3 = arrayList.get(i24);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i20++;
                            }
                            gVar3.u(false);
                        }
                        i24++;
                    }
                }
                if (z11) {
                    i20--;
                }
                gVar2.u(z11);
            } else {
                i13 = i10;
                gVar2.u(false);
                i22++;
                view = null;
                cVar = this;
                i10 = i13;
                i14 = 0;
            }
            i22++;
            view = null;
            cVar = this;
            i10 = i13;
            i14 = 0;
        }
        return true;
    }

    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f794w) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public k o(ViewGroup viewGroup) {
        k kVar = this.f483u;
        k o10 = super.o(viewGroup);
        if (kVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    public boolean q(int i10, g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
