package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.l;
import androidx.activity.result.d;
import androidx.core.app.b;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.g0;
import androidx.lifecycle.m;
import androidx.savedstate.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class e extends ComponentActivity implements b.f, b.h {
    final i G = i.b(new c());
    final m H = new m(this);
    boolean I;
    boolean J;
    boolean K = true;

    class a implements a.c {
        a() {
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.C();
            e.this.H.h(g.a.ON_STOP);
            Parcelable x9 = e.this.G.x();
            if (x9 != null) {
                bundle.putParcelable("android:support:fragments", x9);
            }
            return bundle;
        }
    }

    class b implements d.b {
        b() {
        }

        public void a(Context context) {
            e.this.G.a((Fragment) null);
            Bundle b10 = e.this.k().b("android:support:fragments");
            if (b10 != null) {
                e.this.G.w(b10.getParcelable("android:support:fragments"));
            }
        }
    }

    class c extends k<e> implements g0, l, androidx.activity.result.e, r {
        public c() {
            super(e.this);
        }

        public g a() {
            return e.this.H;
        }

        public void b(n nVar, Fragment fragment) {
            e.this.E(fragment);
        }

        public View d(int i10) {
            return e.this.findViewById(i10);
        }

        public boolean e() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public d g() {
            return e.this.g();
        }

        public OnBackPressedDispatcher j() {
            return e.this.j();
        }

        public f0 l() {
            return e.this.l();
        }

        public LayoutInflater n() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        public boolean o(Fragment fragment) {
            return !e.this.isFinishing();
        }

        public void q() {
            e.this.H();
        }

        /* renamed from: r */
        public e m() {
            return e.this;
        }
    }

    public e() {
        B();
    }

    private void B() {
        k().h("android:support:fragments", new a());
        q(new b());
    }

    private static boolean D(n nVar, g.b bVar) {
        boolean z9 = false;
        for (Fragment next : nVar.r0()) {
            if (next != null) {
                if (next.B() != null) {
                    z9 |= D(next.s(), bVar);
                }
                a0 a0Var = next.f2308f0;
                if (a0Var != null && a0Var.a().b().isAtLeast(g.b.STARTED)) {
                    next.f2308f0.h(bVar);
                    z9 = true;
                }
                if (next.f2307e0.b().isAtLeast(g.b.STARTED)) {
                    next.f2307e0.n(bVar);
                    z9 = true;
                }
            }
        }
        return z9;
    }

    public n A() {
        return this.G.t();
    }

    /* access modifiers changed from: package-private */
    public void C() {
        do {
        } while (D(A(), g.b.CREATED));
    }

    @Deprecated
    public void E(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public boolean F(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    public void G() {
        this.H.h(g.a.ON_RESUME);
        this.G.p();
    }

    @Deprecated
    public void H() {
        invalidateOptionsMenu();
    }

    @Deprecated
    public final void b(int i10) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.I);
        printWriter.print(" mResumed=");
        printWriter.print(this.J);
        printWriter.print(" mStopped=");
        printWriter.print(this.K);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.G.t().W(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.G.u();
        super.onActivityResult(i10, i11, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.G.u();
        super.onConfigurationChanged(configuration);
        this.G.d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.H.h(g.a.ON_CREATE);
        this.G.f();
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return i10 == 0 ? super.onCreatePanelMenu(i10, menu) | this.G.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i10, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View z9 = z(view, str, context, attributeSet);
        return z9 == null ? super.onCreateView(view, str, context, attributeSet) : z9;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View z9 = z((View) null, str, context, attributeSet);
        return z9 == null ? super.onCreateView(str, context, attributeSet) : z9;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.G.h();
        this.H.h(g.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.G.i();
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.G.k(menuItem);
        }
        if (i10 != 6) {
            return false;
        }
        return this.G.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z9) {
        this.G.j(z9);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.G.u();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i10, Menu menu) {
        if (i10 == 0) {
            this.G.l(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.J = false;
        this.G.m();
        this.H.h(g.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z9) {
        this.G.n(z9);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        G();
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return i10 == 0 ? F(view, menu) | this.G.o(menu) : super.onPreparePanel(i10, view, menu);
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.G.u();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        this.G.u();
        super.onResume();
        this.J = true;
        this.G.s();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        this.G.u();
        super.onStart();
        this.K = false;
        if (!this.I) {
            this.I = true;
            this.G.c();
        }
        this.G.s();
        this.H.h(g.a.ON_START);
        this.G.q();
    }

    public void onStateNotSaved() {
        this.G.u();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.K = true;
        C();
        this.G.r();
        this.H.h(g.a.ON_STOP);
    }

    /* access modifiers changed from: package-private */
    public final View z(View view, String str, Context context, AttributeSet attributeSet) {
        return this.G.v(view, str, context, attributeSet);
    }
}
