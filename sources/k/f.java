package k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import s.c;

class f extends d implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    private final c f10918e;

    f(Context context, c cVar) {
        super(context, cVar);
        this.f10918e = cVar;
    }

    public void clearHeader() {
        this.f10918e.clearHeader();
    }

    public MenuItem getItem() {
        return c(this.f10918e.getItem());
    }

    public SubMenu setHeaderIcon(int i10) {
        this.f10918e.setHeaderIcon(i10);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f10918e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i10) {
        this.f10918e.setHeaderTitle(i10);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f10918e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f10918e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i10) {
        this.f10918e.setIcon(i10);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f10918e.setIcon(drawable);
        return this;
    }
}
