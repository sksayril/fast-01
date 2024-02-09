package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;
import f.g;

class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: m  reason: collision with root package name */
    private e f551m;

    /* renamed from: n  reason: collision with root package name */
    private b f552n;

    /* renamed from: o  reason: collision with root package name */
    c f553o;

    /* renamed from: p  reason: collision with root package name */
    private j.a f554p;

    public f(e eVar) {
        this.f551m = eVar;
    }

    public void a() {
        b bVar = this.f552n;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void b(e eVar, boolean z9) {
        if (z9 || eVar == this.f551m) {
            a();
        }
        j.a aVar = this.f554p;
        if (aVar != null) {
            aVar.b(eVar, z9);
        }
    }

    public boolean c(e eVar) {
        j.a aVar = this.f554p;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.f551m;
        b.a aVar = new b.a(eVar.u());
        c cVar = new c(aVar.b(), g.abc_list_menu_item_layout);
        this.f553o = cVar;
        cVar.k(this);
        this.f551m.b(this.f553o);
        aVar.c(this.f553o.a(), this);
        View y9 = eVar.y();
        if (y9 != null) {
            aVar.d(y9);
        } else {
            aVar.e(eVar.w()).h(eVar.x());
        }
        aVar.f(this);
        b a10 = aVar.a();
        this.f552n = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f552n.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f552n.show();
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f551m.L((g) this.f553o.a().getItem(i10), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f553o.b(this.f551m, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f552n.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f552n.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f551m.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f551m.performShortcut(i10, keyEvent, 0);
    }
}
