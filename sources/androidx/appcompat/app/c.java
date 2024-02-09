package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.g1;
import androidx.core.app.j;
import androidx.core.app.t;
import androidx.fragment.app.e;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.savedstate.a;
import j.b;

public class c extends e implements d, t.a {
    private e L;
    private Resources M;

    class a implements a.c {
        a() {
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.I().u(bundle);
            return bundle;
        }
    }

    class b implements d.b {
        b() {
        }

        public void a(Context context) {
            e I = c.this.I();
            I.n();
            I.q(c.this.k().b("androidx:appcompat"));
        }
    }

    public c() {
        K();
    }

    private void K() {
        k().h("androidx:appcompat", new a());
        q(new b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean Q(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.c.Q(android.view.KeyEvent):boolean");
    }

    private void t() {
        h0.a(getWindow().getDecorView(), this);
        i0.a(getWindow().getDecorView(), this);
        s0.e.a(getWindow().getDecorView(), this);
    }

    public void H() {
        I().o();
    }

    public e I() {
        if (this.L == null) {
            this.L = e.g(this, this);
        }
        return this.L;
    }

    public a J() {
        return I().m();
    }

    public void L(t tVar) {
        tVar.d(this);
    }

    /* access modifiers changed from: protected */
    public void M(int i10) {
    }

    public void N(t tVar) {
    }

    @Deprecated
    public void O() {
    }

    public boolean P() {
        Intent h10 = h();
        if (h10 == null) {
            return false;
        }
        if (S(h10)) {
            t g10 = t.g(this);
            L(g10);
            N(g10);
            g10.i();
            try {
                androidx.core.app.b.p(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            R(h10);
            return true;
        }
    }

    public void R(Intent intent) {
        j.e(this, intent);
    }

    public boolean S(Intent intent) {
        return j.f(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        I().d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(I().f(context));
    }

    public void closeOptionsMenu() {
        a J = J();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (J == null || !J.g()) {
            super.closeOptionsMenu();
        }
    }

    public void d(j.b bVar) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a J = J();
        if (keyCode != 82 || J == null || !J.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public j.b f(b.a aVar) {
        return null;
    }

    public <T extends View> T findViewById(int i10) {
        return I().i(i10);
    }

    public MenuInflater getMenuInflater() {
        return I().l();
    }

    public Resources getResources() {
        if (this.M == null && g1.c()) {
            this.M = new g1(this, super.getResources());
        }
        Resources resources = this.M;
        return resources == null ? super.getResources() : resources;
    }

    public Intent h() {
        return j.a(this);
    }

    public void i(j.b bVar) {
    }

    public void invalidateOptionsMenu() {
        I().o();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.M != null) {
            this.M.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        I().p(configuration);
    }

    public void onContentChanged() {
        O();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        I().r();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (Q(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a J = J();
        if (menuItem.getItemId() != 16908332 || J == null || (J.j() & 4) == 0) {
            return false;
        }
        return P();
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        I().s(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        I().t();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        I().v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        I().w();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        I().E(charSequence);
    }

    public void openOptionsMenu() {
        a J = J();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (J == null || !J.q()) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int i10) {
        t();
        I().A(i10);
    }

    public void setContentView(View view) {
        t();
        I().B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        I().C(view, layoutParams);
    }

    public void setTheme(int i10) {
        super.setTheme(i10);
        I().D(i10);
    }
}
