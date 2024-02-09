package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.h;
import androidx.lifecycle.g0;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private final k<?> f2491a;

    private i(k<?> kVar) {
        this.f2491a = kVar;
    }

    public static i b(k<?> kVar) {
        return new i((k) h.k(kVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.f2491a;
        kVar.f2497q.j(kVar, kVar, fragment);
    }

    public void c() {
        this.f2491a.f2497q.y();
    }

    public void d(Configuration configuration) {
        this.f2491a.f2497q.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f2491a.f2497q.B(menuItem);
    }

    public void f() {
        this.f2491a.f2497q.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f2491a.f2497q.D(menu, menuInflater);
    }

    public void h() {
        this.f2491a.f2497q.E();
    }

    public void i() {
        this.f2491a.f2497q.G();
    }

    public void j(boolean z9) {
        this.f2491a.f2497q.H(z9);
    }

    public boolean k(MenuItem menuItem) {
        return this.f2491a.f2497q.J(menuItem);
    }

    public void l(Menu menu) {
        this.f2491a.f2497q.K(menu);
    }

    public void m() {
        this.f2491a.f2497q.M();
    }

    public void n(boolean z9) {
        this.f2491a.f2497q.N(z9);
    }

    public boolean o(Menu menu) {
        return this.f2491a.f2497q.O(menu);
    }

    public void p() {
        this.f2491a.f2497q.Q();
    }

    public void q() {
        this.f2491a.f2497q.R();
    }

    public void r() {
        this.f2491a.f2497q.T();
    }

    public boolean s() {
        return this.f2491a.f2497q.a0(true);
    }

    public n t() {
        return this.f2491a.f2497q;
    }

    public void u() {
        this.f2491a.f2497q.Q0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2491a.f2497q.t0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.f2491a;
        if (kVar instanceof g0) {
            kVar.f2497q.c1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public Parcelable x() {
        return this.f2491a.f2497q.e1();
    }
}
