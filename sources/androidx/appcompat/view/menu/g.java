package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.core.view.b;
import f.h;
import s.b;

public final class g implements b {
    private View A;
    private androidx.core.view.b B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;

    /* renamed from: a  reason: collision with root package name */
    private final int f555a;

    /* renamed from: b  reason: collision with root package name */
    private final int f556b;

    /* renamed from: c  reason: collision with root package name */
    private final int f557c;

    /* renamed from: d  reason: collision with root package name */
    private final int f558d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f559e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f560f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f561g;

    /* renamed from: h  reason: collision with root package name */
    private char f562h;

    /* renamed from: i  reason: collision with root package name */
    private int f563i = 4096;

    /* renamed from: j  reason: collision with root package name */
    private char f564j;

    /* renamed from: k  reason: collision with root package name */
    private int f565k = 4096;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f566l;

    /* renamed from: m  reason: collision with root package name */
    private int f567m = 0;

    /* renamed from: n  reason: collision with root package name */
    e f568n;

    /* renamed from: o  reason: collision with root package name */
    private m f569o;

    /* renamed from: p  reason: collision with root package name */
    private Runnable f570p;

    /* renamed from: q  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f571q;

    /* renamed from: r  reason: collision with root package name */
    private CharSequence f572r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f573s;

    /* renamed from: t  reason: collision with root package name */
    private ColorStateList f574t = null;

    /* renamed from: u  reason: collision with root package name */
    private PorterDuff.Mode f575u = null;

    /* renamed from: v  reason: collision with root package name */
    private boolean f576v = false;

    /* renamed from: w  reason: collision with root package name */
    private boolean f577w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f578x = false;

    /* renamed from: y  reason: collision with root package name */
    private int f579y = 16;

    /* renamed from: z  reason: collision with root package name */
    private int f580z;

    class a implements b.C0035b {
        a() {
        }

        public void onActionProviderVisibilityChanged(boolean z9) {
            g gVar = g.this;
            gVar.f568n.J(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f568n = eVar;
        this.f555a = i11;
        this.f556b = i10;
        this.f557c = i12;
        this.f558d = i13;
        this.f559e = charSequence;
        this.f580z = i14;
    }

    private static void d(StringBuilder sb, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f578x && (this.f576v || this.f577w)) {
            drawable = androidx.core.graphics.drawable.a.q(drawable).mutate();
            if (this.f576v) {
                androidx.core.graphics.drawable.a.o(drawable, this.f574t);
            }
            if (this.f577w) {
                androidx.core.graphics.drawable.a.p(drawable, this.f575u);
            }
            this.f578x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return this.f568n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f580z & 4) == 4;
    }

    public s.b a(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.h();
        }
        this.A = null;
        this.B = bVar;
        this.f568n.K(true);
        androidx.core.view.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.j(new a());
        }
        return this;
    }

    public androidx.core.view.b b() {
        return this.B;
    }

    public void c() {
        this.f568n.I(this);
    }

    public boolean collapseActionView() {
        if ((this.f580z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f568n.f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f568n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f558d;
    }

    /* access modifiers changed from: package-private */
    public char g() {
        return this.f568n.G() ? this.f564j : this.f562h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View d10 = bVar.d(this);
        this.A = d10;
        return d10;
    }

    public int getAlphabeticModifiers() {
        return this.f565k;
    }

    public char getAlphabeticShortcut() {
        return this.f564j;
    }

    public CharSequence getContentDescription() {
        return this.f572r;
    }

    public int getGroupId() {
        return this.f556b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f566l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f567m == 0) {
            return null;
        }
        Drawable b10 = g.a.b(this.f568n.u(), this.f567m);
        this.f567m = 0;
        this.f566l = b10;
        return e(b10);
    }

    public ColorStateList getIconTintList() {
        return this.f574t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f575u;
    }

    public Intent getIntent() {
        return this.f561g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f555a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    public int getNumericModifiers() {
        return this.f563i;
    }

    public char getNumericShortcut() {
        return this.f562h;
    }

    public int getOrder() {
        return this.f557c;
    }

    public SubMenu getSubMenu() {
        return this.f569o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f559e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f560f;
        return charSequence != null ? charSequence : this.f559e;
    }

    public CharSequence getTooltipText() {
        return this.f573s;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        int i10;
        char g10 = g();
        if (g10 == 0) {
            return "";
        }
        Resources resources = this.f568n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f568n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(h.abc_prepend_shortcut_label));
        }
        int i11 = this.f568n.G() ? this.f565k : this.f563i;
        d(sb, i11, 65536, resources.getString(h.abc_menu_meta_shortcut_label));
        d(sb, i11, 4096, resources.getString(h.abc_menu_ctrl_shortcut_label));
        d(sb, i11, 2, resources.getString(h.abc_menu_alt_shortcut_label));
        d(sb, i11, 1, resources.getString(h.abc_menu_shift_shortcut_label));
        d(sb, i11, 4, resources.getString(h.abc_menu_sym_shortcut_label));
        d(sb, i11, 8, resources.getString(h.abc_menu_function_shortcut_label));
        if (g10 == 8) {
            i10 = h.abc_menu_delete_shortcut_label;
        } else if (g10 == 10) {
            i10 = h.abc_menu_enter_shortcut_label;
        } else if (g10 != ' ') {
            sb.append(g10);
            return sb.toString();
        } else {
            i10 = h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i10));
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f569o != null;
    }

    /* access modifiers changed from: package-private */
    public CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.f579y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f579y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f579y & 16) != 0;
    }

    public boolean isVisible() {
        androidx.core.view.b bVar = this.B;
        return (bVar == null || !bVar.g()) ? (this.f579y & 8) == 0 : (this.f579y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        androidx.core.view.b bVar;
        if ((this.f580z & 8) == 0) {
            return false;
        }
        if (this.A == null && (bVar = this.B) != null) {
            this.A = bVar.d(this);
        }
        return this.A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f571q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f568n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f570p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f561g != null) {
            try {
                this.f568n.u().startActivity(this.f561g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        androidx.core.view.b bVar = this.B;
        return bVar != null && bVar.e();
    }

    public boolean l() {
        return (this.f579y & 32) == 32;
    }

    public boolean m() {
        return (this.f579y & 4) != 0;
    }

    public boolean n() {
        return (this.f580z & 1) == 1;
    }

    public boolean o() {
        return (this.f580z & 2) == 2;
    }

    /* renamed from: p */
    public s.b setActionView(int i10) {
        Context u9 = this.f568n.u();
        setActionView(LayoutInflater.from(u9).inflate(i10, new LinearLayout(u9), false));
        return this;
    }

    /* renamed from: q */
    public s.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f555a) > 0) {
            view.setId(i10);
        }
        this.f568n.I(this);
        return this;
    }

    public void r(boolean z9) {
        this.D = z9;
        this.f568n.K(false);
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z9) {
        int i10 = this.f579y;
        int i11 = (z9 ? 2 : 0) | (i10 & -3);
        this.f579y = i11;
        if (i10 != i11) {
            this.f568n.K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f564j == c10) {
            return this;
        }
        this.f564j = Character.toLowerCase(c10);
        this.f568n.K(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f564j == c10 && this.f565k == i10) {
            return this;
        }
        this.f564j = Character.toLowerCase(c10);
        this.f565k = KeyEvent.normalizeMetaState(i10);
        this.f568n.K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z9) {
        int i10 = this.f579y;
        boolean z10 = z9 | (i10 & true);
        this.f579y = z10 ? 1 : 0;
        if (i10 != z10) {
            this.f568n.K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z9) {
        if ((this.f579y & 4) != 0) {
            this.f568n.T(this);
        } else {
            s(z9);
        }
        return this;
    }

    public s.b setContentDescription(CharSequence charSequence) {
        this.f572r = charSequence;
        this.f568n.K(false);
        return this;
    }

    public MenuItem setEnabled(boolean z9) {
        this.f579y = z9 ? this.f579y | 16 : this.f579y & -17;
        this.f568n.K(false);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f566l = null;
        this.f567m = i10;
        this.f578x = true;
        this.f568n.K(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f567m = 0;
        this.f566l = drawable;
        this.f578x = true;
        this.f568n.K(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f574t = colorStateList;
        this.f576v = true;
        this.f578x = true;
        this.f568n.K(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f575u = mode;
        this.f577w = true;
        this.f578x = true;
        this.f568n.K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f561g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        if (this.f562h == c10) {
            return this;
        }
        this.f562h = c10;
        this.f568n.K(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f562h == c10 && this.f563i == i10) {
            return this;
        }
        this.f562h = c10;
        this.f563i = KeyEvent.normalizeMetaState(i10);
        this.f568n.K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f571q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f562h = c10;
        this.f564j = Character.toLowerCase(c11);
        this.f568n.K(false);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f562h = c10;
        this.f563i = KeyEvent.normalizeMetaState(i10);
        this.f564j = Character.toLowerCase(c11);
        this.f565k = KeyEvent.normalizeMetaState(i11);
        this.f568n.K(false);
        return this;
    }

    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            this.f580z = i10;
            this.f568n.I(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(int i10) {
        return setTitle((CharSequence) this.f568n.u().getString(i10));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f559e = charSequence;
        this.f568n.K(false);
        m mVar = this.f569o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f560f = charSequence;
        this.f568n.K(false);
        return this;
    }

    public s.b setTooltipText(CharSequence charSequence) {
        this.f573s = charSequence;
        this.f568n.K(false);
        return this;
    }

    public MenuItem setVisible(boolean z9) {
        if (y(z9)) {
            this.f568n.J(this);
        }
        return this;
    }

    public void t(boolean z9) {
        this.f579y = (z9 ? 4 : 0) | (this.f579y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f559e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z9) {
        this.f579y = z9 ? this.f579y | 32 : this.f579y & -33;
    }

    /* access modifiers changed from: package-private */
    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    /* renamed from: w */
    public s.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f569o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    public boolean y(boolean z9) {
        int i10 = this.f579y;
        int i11 = (z9 ? 0 : 8) | (i10 & -9);
        this.f579y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f568n.A();
    }
}
