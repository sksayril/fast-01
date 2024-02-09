package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p.g;
import s.c;

abstract class b {

    /* renamed from: a  reason: collision with root package name */
    final Context f10903a;

    /* renamed from: b  reason: collision with root package name */
    private g<s.b, MenuItem> f10904b;

    /* renamed from: c  reason: collision with root package name */
    private g<c, SubMenu> f10905c;

    b(Context context) {
        this.f10903a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof s.b)) {
            return menuItem;
        }
        s.b bVar = (s.b) menuItem;
        if (this.f10904b == null) {
            this.f10904b = new g<>();
        }
        MenuItem menuItem2 = this.f10904b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f10903a, bVar);
        this.f10904b.put(bVar, cVar);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f10905c == null) {
            this.f10905c = new g<>();
        }
        SubMenu subMenu2 = this.f10905c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        f fVar = new f(this.f10903a, cVar);
        this.f10905c.put(cVar, fVar);
        return fVar;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        g<s.b, MenuItem> gVar = this.f10904b;
        if (gVar != null) {
            gVar.clear();
        }
        g<c, SubMenu> gVar2 = this.f10905c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10) {
        if (this.f10904b != null) {
            int i11 = 0;
            while (i11 < this.f10904b.size()) {
                if (this.f10904b.i(i11).getGroupId() == i10) {
                    this.f10904b.k(i11);
                    i11--;
                }
                i11++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g(int i10) {
        if (this.f10904b != null) {
            for (int i11 = 0; i11 < this.f10904b.size(); i11++) {
                if (this.f10904b.i(i11).getItemId() == i10) {
                    this.f10904b.k(i11);
                    return;
                }
            }
        }
    }
}
