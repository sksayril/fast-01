package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import d8.h;
import io.flutter.embedding.android.e;
import io.flutter.plugin.platform.c;
import java.util.List;
import x6.b;

public class d extends Activity implements e.c, l {

    /* renamed from: q  reason: collision with root package name */
    public static final int f9683q = h.e(61938);

    /* renamed from: m  reason: collision with root package name */
    private boolean f9684m = false;

    /* renamed from: n  reason: collision with root package name */
    protected e f9685n;

    /* renamed from: o  reason: collision with root package name */
    private m f9686o;

    /* renamed from: p  reason: collision with root package name */
    private final OnBackInvokedCallback f9687p;

    class a implements OnBackInvokedCallback {
        a() {
        }

        public void onBackInvoked() {
            d.this.onBackPressed();
        }
    }

    public d() {
        this.f9687p = Build.VERSION.SDK_INT >= 33 ? new a() : null;
        this.f9686o = new m(this);
    }

    private void F() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void G() {
        if (I() == f.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View H() {
        return this.f9685n.s((LayoutInflater) null, (ViewGroup) null, (Bundle) null, f9683q, z() == v.surface);
    }

    private Drawable L() {
        try {
            Bundle K = K();
            int i10 = K != null ? K.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i10 != 0) {
                return androidx.core.content.res.h.d(getResources(), i10, getTheme());
            }
            return null;
        } catch (Resources.NotFoundException e10) {
            b.b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e10;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private boolean M() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private boolean P(String str) {
        StringBuilder sb;
        String str2;
        e eVar = this.f9685n;
        if (eVar == null) {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after release.";
        } else if (eVar.m()) {
            return true;
        } else {
            sb = new StringBuilder();
            sb.append("FlutterActivity ");
            sb.append(hashCode());
            sb.append(" ");
            sb.append(str);
            str2 = " called after detach.";
        }
        sb.append(str2);
        b.g("FlutterActivity", sb.toString());
        return false;
    }

    private void Q() {
        try {
            Bundle K = K();
            if (K != null) {
                int i10 = K.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i10 != -1) {
                    setTheme(i10);
                    return;
                }
                return;
            }
            b.f("FlutterActivity", "Using the launch theme as normal theme.");
        } catch (PackageManager.NameNotFoundException unused) {
            b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public x A() {
        Drawable L = L();
        if (L != null) {
            return new b(L);
        }
        return null;
    }

    public io.flutter.embedding.engine.a B(Context context) {
        return null;
    }

    public y C() {
        return I() == f.opaque ? y.opaque : y.transparent;
    }

    public void D(i iVar) {
    }

    public void E(io.flutter.embedding.engine.a aVar) {
        if (!this.f9685n.n()) {
            i7.a.a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public f I() {
        return getIntent().hasExtra("background_mode") ? f.valueOf(getIntent().getStringExtra("background_mode")) : f.opaque;
    }

    /* access modifiers changed from: protected */
    public io.flutter.embedding.engine.a J() {
        return this.f9685n.l();
    }

    /* access modifiers changed from: protected */
    public Bundle K() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public void N() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f9687p);
            this.f9684m = true;
        }
    }

    public void O() {
        R();
        e eVar = this.f9685n;
        if (eVar != null) {
            eVar.H();
            this.f9685n = null;
        }
    }

    public void R() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f9687p);
            this.f9684m = false;
        }
    }

    public g a() {
        return this.f9686o;
    }

    public boolean b() {
        return false;
    }

    public void c() {
    }

    public Activity d() {
        return this;
    }

    public void e() {
        b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + J() + " evicted by another attaching activity");
        e eVar = this.f9685n;
        if (eVar != null) {
            eVar.t();
            this.f9685n.u();
        }
    }

    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    public void g(boolean z9) {
        if (z9 && !this.f9684m) {
            N();
        } else if (!z9 && this.f9684m) {
            R();
        }
    }

    public Context getContext() {
        return this;
    }

    public String h() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    public String i() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle K = K();
            if (K != null) {
                return K.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public List<String> l() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public boolean m() {
        return true;
    }

    public boolean n() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (p() != null || this.f9685n.n()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public boolean o() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (P("onActivityResult")) {
            this.f9685n.p(i10, i11, intent);
        }
    }

    public void onBackPressed() {
        if (P("onBackPressed")) {
            this.f9685n.r();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Q();
        super.onCreate(bundle);
        e eVar = new e(this);
        this.f9685n = eVar;
        eVar.q(this);
        this.f9685n.z(bundle);
        this.f9686o.h(g.a.ON_CREATE);
        G();
        setContentView(H());
        F();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (P("onDestroy")) {
            this.f9685n.t();
            this.f9685n.u();
        }
        O();
        this.f9686o.h(g.a.ON_DESTROY);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (P("onNewIntent")) {
            this.f9685n.v(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (P("onPause")) {
            this.f9685n.w();
        }
        this.f9686o.h(g.a.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        if (P("onPostResume")) {
            this.f9685n.x();
        }
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (P("onRequestPermissionsResult")) {
            this.f9685n.y(i10, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f9686o.h(g.a.ON_RESUME);
        if (P("onResume")) {
            this.f9685n.A();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (P("onSaveInstanceState")) {
            this.f9685n.B(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f9686o.h(g.a.ON_START);
        if (P("onStart")) {
            this.f9685n.C();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (P("onStop")) {
            this.f9685n.D();
        }
        this.f9686o.h(g.a.ON_STOP);
    }

    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (P("onTrimMemory")) {
            this.f9685n.E(i10);
        }
    }

    public void onUserLeaveHint() {
        if (P("onUserLeaveHint")) {
            this.f9685n.F();
        }
    }

    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (P("onWindowFocusChanged")) {
            this.f9685n.G(z9);
        }
    }

    public String p() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public boolean q() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : p() == null;
    }

    public String r() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle K = K();
            String string = K != null ? K.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public void s(io.flutter.embedding.engine.a aVar) {
    }

    public String t() {
        try {
            Bundle K = K();
            if (K != null) {
                return K.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public c u(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new c(d(), aVar.o(), this);
    }

    public void v(h hVar) {
    }

    public String w() {
        String dataString;
        if (!M() || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public boolean x() {
        try {
            Bundle K = K();
            if (K != null) {
                return K.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public io.flutter.embedding.engine.g y() {
        return io.flutter.embedding.engine.g.a(getIntent());
    }

    public v z() {
        return I() == f.opaque ? v.surface : v.texture;
    }
}
