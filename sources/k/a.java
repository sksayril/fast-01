package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import s.b;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f10883a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10884b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10885c;

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f10886d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f10887e;

    /* renamed from: f  reason: collision with root package name */
    private Intent f10888f;

    /* renamed from: g  reason: collision with root package name */
    private char f10889g;

    /* renamed from: h  reason: collision with root package name */
    private int f10890h = 4096;

    /* renamed from: i  reason: collision with root package name */
    private char f10891i;

    /* renamed from: j  reason: collision with root package name */
    private int f10892j = 4096;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f10893k;

    /* renamed from: l  reason: collision with root package name */
    private Context f10894l;

    /* renamed from: m  reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f10895m;

    /* renamed from: n  reason: collision with root package name */
    private CharSequence f10896n;

    /* renamed from: o  reason: collision with root package name */
    private CharSequence f10897o;

    /* renamed from: p  reason: collision with root package name */
    private ColorStateList f10898p = null;

    /* renamed from: q  reason: collision with root package name */
    private PorterDuff.Mode f10899q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10900r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10901s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f10902t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f10894l = context;
        this.f10883a = i11;
        this.f10884b = i10;
        this.f10885c = i13;
        this.f10886d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f10893k;
        if (drawable == null) {
            return;
        }
        if (this.f10900r || this.f10901s) {
            Drawable q9 = androidx.core.graphics.drawable.a.q(drawable);
            this.f10893k = q9;
            Drawable mutate = q9.mutate();
            this.f10893k = mutate;
            if (this.f10900r) {
                androidx.core.graphics.drawable.a.o(mutate, this.f10898p);
            }
            if (this.f10901s) {
                androidx.core.graphics.drawable.a.p(this.f10893k, this.f10899q);
            }
        }
    }

    public b a(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    public androidx.core.view.b b() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f10892j;
    }

    public char getAlphabeticShortcut() {
        return this.f10891i;
    }

    public CharSequence getContentDescription() {
        return this.f10896n;
    }

    public int getGroupId() {
        return this.f10884b;
    }

    public Drawable getIcon() {
        return this.f10893k;
    }

    public ColorStateList getIconTintList() {
        return this.f10898p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10899q;
    }

    public Intent getIntent() {
        return this.f10888f;
    }

    public int getItemId() {
        return this.f10883a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f10890h;
    }

    public char getNumericShortcut() {
        return this.f10889g;
    }

    public int getOrder() {
        return this.f10885c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f10886d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10887e;
        return charSequence != null ? charSequence : this.f10886d;
    }

    public CharSequence getTooltipText() {
        return this.f10897o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f10902t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f10902t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f10902t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f10902t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c10) {
        this.f10891i = Character.toLowerCase(c10);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f10891i = Character.toLowerCase(c10);
        this.f10892j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public MenuItem setCheckable(boolean z9) {
        this.f10902t = z9 | (this.f10902t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z9) {
        this.f10902t = (z9 ? 2 : 0) | (this.f10902t & -3);
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.f10896n = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z9) {
        this.f10902t = (z9 ? 16 : 0) | (this.f10902t & -17);
        return this;
    }

    public MenuItem setIcon(int i10) {
        this.f10893k = androidx.core.content.a.e(this.f10894l, i10);
        c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f10893k = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10898p = colorStateList;
        this.f10900r = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10899q = mode;
        this.f10901s = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f10888f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c10) {
        this.f10889g = c10;
        return this;
    }

    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f10889g = c10;
        this.f10890h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10895m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c10, char c11) {
        this.f10889g = c10;
        this.f10891i = Character.toLowerCase(c11);
        return this;
    }

    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10889g = c10;
        this.f10890h = KeyEvent.normalizeMetaState(i10);
        this.f10891i = Character.toLowerCase(c11);
        this.f10892j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    public void setShowAsAction(int i10) {
    }

    public MenuItem setTitle(int i10) {
        this.f10886d = this.f10894l.getResources().getString(i10);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f10886d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10887e = charSequence;
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.f10897o = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z9) {
        int i10 = 8;
        int i11 = this.f10902t & 8;
        if (z9) {
            i10 = 0;
        }
        this.f10902t = i11 | i10;
        return this;
    }
}
