package j;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import j.b;
import java.lang.ref.WeakReference;

public class e extends b implements e.a {

    /* renamed from: o  reason: collision with root package name */
    private Context f10729o;

    /* renamed from: p  reason: collision with root package name */
    private ActionBarContextView f10730p;

    /* renamed from: q  reason: collision with root package name */
    private b.a f10731q;

    /* renamed from: r  reason: collision with root package name */
    private WeakReference<View> f10732r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10733s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f10734t;

    /* renamed from: u  reason: collision with root package name */
    private androidx.appcompat.view.menu.e f10735u;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z9) {
        this.f10729o = context;
        this.f10730p = actionBarContextView;
        this.f10731q = aVar;
        androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f10735u = S;
        S.R(this);
        this.f10734t = z9;
    }

    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f10731q.a(this, menuItem);
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f10730p.l();
    }

    public void c() {
        if (!this.f10733s) {
            this.f10733s = true;
            this.f10731q.c(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.f10732r;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f10735u;
    }

    public MenuInflater f() {
        return new g(this.f10730p.getContext());
    }

    public CharSequence g() {
        return this.f10730p.getSubtitle();
    }

    public CharSequence i() {
        return this.f10730p.getTitle();
    }

    public void k() {
        this.f10731q.d(this, this.f10735u);
    }

    public boolean l() {
        return this.f10730p.j();
    }

    public void m(View view) {
        this.f10730p.setCustomView(view);
        this.f10732r = view != null ? new WeakReference<>(view) : null;
    }

    public void n(int i10) {
        o(this.f10729o.getString(i10));
    }

    public void o(CharSequence charSequence) {
        this.f10730p.setSubtitle(charSequence);
    }

    public void q(int i10) {
        r(this.f10729o.getString(i10));
    }

    public void r(CharSequence charSequence) {
        this.f10730p.setTitle(charSequence);
    }

    public void s(boolean z9) {
        super.s(z9);
        this.f10730p.setTitleOptional(z9);
    }
}
