package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import j.b;
import java.util.ArrayList;
import k.c;
import k.d;
import p.g;

public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f10736a;

    /* renamed from: b  reason: collision with root package name */
    final b f10737b;

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f10738a;

        /* renamed from: b  reason: collision with root package name */
        final Context f10739b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f10740c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final g<Menu, Menu> f10741d = new g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f10739b = context;
            this.f10738a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f10741d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            d dVar = new d(this.f10739b, (s.a) menu);
            this.f10741d.put(menu, dVar);
            return dVar;
        }

        public boolean a(b bVar, MenuItem menuItem) {
            return this.f10738a.onActionItemClicked(e(bVar), new c(this.f10739b, (s.b) menuItem));
        }

        public boolean b(b bVar, Menu menu) {
            return this.f10738a.onCreateActionMode(e(bVar), f(menu));
        }

        public void c(b bVar) {
            this.f10738a.onDestroyActionMode(e(bVar));
        }

        public boolean d(b bVar, Menu menu) {
            return this.f10738a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f10740c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f10740c.get(i10);
                if (fVar != null && fVar.f10737b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f10739b, bVar);
            this.f10740c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f10736a = context;
        this.f10737b = bVar;
    }

    public void finish() {
        this.f10737b.c();
    }

    public View getCustomView() {
        return this.f10737b.d();
    }

    public Menu getMenu() {
        return new d(this.f10736a, (s.a) this.f10737b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f10737b.f();
    }

    public CharSequence getSubtitle() {
        return this.f10737b.g();
    }

    public Object getTag() {
        return this.f10737b.h();
    }

    public CharSequence getTitle() {
        return this.f10737b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f10737b.j();
    }

    public void invalidate() {
        this.f10737b.k();
    }

    public boolean isTitleOptional() {
        return this.f10737b.l();
    }

    public void setCustomView(View view) {
        this.f10737b.m(view);
    }

    public void setSubtitle(int i10) {
        this.f10737b.n(i10);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f10737b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.f10737b.p(obj);
    }

    public void setTitle(int i10) {
        this.f10737b.q(i10);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10737b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z9) {
        this.f10737b.s(z9);
    }
}
