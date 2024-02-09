package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

public class c extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final s.b f10906d;

    /* renamed from: e  reason: collision with root package name */
    private Method f10907e;

    private class a extends androidx.core.view.b {

        /* renamed from: d  reason: collision with root package name */
        final ActionProvider f10908d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f10908d = actionProvider;
        }

        public boolean a() {
            return this.f10908d.hasSubMenu();
        }

        public View c() {
            return this.f10908d.onCreateActionView();
        }

        public boolean e() {
            return this.f10908d.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.f10908d.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f  reason: collision with root package name */
        private b.C0035b f10910f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.f10908d.isVisible();
        }

        public View d(MenuItem menuItem) {
            return this.f10908d.onCreateActionView(menuItem);
        }

        public boolean g() {
            return this.f10908d.overridesItemVisibility();
        }

        public void j(b.C0035b bVar) {
            this.f10910f = bVar;
            this.f10908d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z9) {
            b.C0035b bVar = this.f10910f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z9);
            }
        }
    }

    /* renamed from: k.c$c  reason: collision with other inner class name */
    static class C0166c extends FrameLayout implements j.c {

        /* renamed from: m  reason: collision with root package name */
        final CollapsibleActionView f10912m;

        C0166c(View view) {
            super(view.getContext());
            this.f10912m = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f10912m;
        }

        public void c() {
            this.f10912m.onActionViewExpanded();
        }

        public void f() {
            this.f10912m.onActionViewCollapsed();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f10913a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f10913a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f10913a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f10913a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f10915a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f10915a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f10915a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, s.b bVar) {
        super(context);
        if (bVar != null) {
            this.f10906d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f10906d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f10906d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        androidx.core.view.b b10 = this.f10906d.b();
        if (b10 instanceof a) {
            return ((a) b10).f10908d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f10906d.getActionView();
        return actionView instanceof C0166c ? ((C0166c) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f10906d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f10906d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f10906d.getContentDescription();
    }

    public int getGroupId() {
        return this.f10906d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f10906d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f10906d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10906d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f10906d.getIntent();
    }

    public int getItemId() {
        return this.f10906d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f10906d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f10906d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f10906d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f10906d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f10906d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f10906d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f10906d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f10906d.getTooltipText();
    }

    public void h(boolean z9) {
        try {
            if (this.f10907e == null) {
                this.f10907e = this.f10906d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f10907e.invoke(this.f10906d, new Object[]{Boolean.valueOf(z9)});
        } catch (Exception e10) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
        }
    }

    public boolean hasSubMenu() {
        return this.f10906d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f10906d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f10906d.isCheckable();
    }

    public boolean isChecked() {
        return this.f10906d.isChecked();
    }

    public boolean isEnabled() {
        return this.f10906d.isEnabled();
    }

    public boolean isVisible() {
        return this.f10906d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f10903a, actionProvider);
        s.b bVar2 = this.f10906d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public MenuItem setActionView(int i10) {
        this.f10906d.setActionView(i10);
        View actionView = this.f10906d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f10906d.setActionView((View) new C0166c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0166c(view);
        }
        this.f10906d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f10906d.setAlphabeticShortcut(c10);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f10906d.setAlphabeticShortcut(c10, i10);
        return this;
    }

    public MenuItem setCheckable(boolean z9) {
        this.f10906d.setCheckable(z9);
        return this;
    }

    public MenuItem setChecked(boolean z9) {
        this.f10906d.setChecked(z9);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f10906d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z9) {
        this.f10906d.setEnabled(z9);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f10906d.setIcon(i10);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f10906d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10906d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10906d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f10906d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f10906d.setNumericShortcut(c10);
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f10906d.setNumericShortcut(c10, i10);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f10906d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10906d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f10906d.setShortcut(c10, c11);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10906d.setShortcut(c10, c11, i10, i11);
        return this;
    }

    public void setShowAsAction(int i10) {
        this.f10906d.setShowAsAction(i10);
    }

    public MenuItem setShowAsActionFlags(int i10) {
        this.f10906d.setShowAsActionFlags(i10);
        return this;
    }

    public MenuItem setTitle(int i10) {
        this.f10906d.setTitle(i10);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f10906d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10906d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f10906d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z9) {
        return this.f10906d.setVisible(z9);
    }
}
