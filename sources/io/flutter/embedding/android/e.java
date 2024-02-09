package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.g;
import d8.h;
import io.flutter.embedding.engine.d;
import io.flutter.plugin.platform.c;
import java.util.Arrays;
import java.util.List;
import y6.a;

class e implements c<Activity> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c f9689a;

    /* renamed from: b  reason: collision with root package name */
    private io.flutter.embedding.engine.a f9690b;

    /* renamed from: c  reason: collision with root package name */
    k f9691c;

    /* renamed from: d  reason: collision with root package name */
    private io.flutter.plugin.platform.c f9692d;

    /* renamed from: e  reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f9693e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f9694f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f9695g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f9696h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9697i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f9698j;

    /* renamed from: k  reason: collision with root package name */
    private d f9699k;

    /* renamed from: l  reason: collision with root package name */
    private final j7.b f9700l;

    class a implements j7.b {
        a() {
        }

        public void c() {
            e.this.f9689a.c();
            boolean unused = e.this.f9695g = false;
        }

        public void f() {
            e.this.f9689a.f();
            boolean unused = e.this.f9695g = true;
            boolean unused2 = e.this.f9696h = true;
        }
    }

    class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ k f9702m;

        b(k kVar) {
            this.f9702m = kVar;
        }

        public boolean onPreDraw() {
            if (e.this.f9695g && e.this.f9693e != null) {
                this.f9702m.getViewTreeObserver().removeOnPreDrawListener(this);
                e.this.f9693e = null;
            }
            return e.this.f9695g;
        }
    }

    interface c extends c.d {
        x A();

        io.flutter.embedding.engine.a B(Context context);

        y C();

        void D(i iVar);

        void E(io.flutter.embedding.engine.a aVar);

        g a();

        void c();

        Activity d();

        void e();

        void f();

        Context getContext();

        String h();

        String i();

        List<String> l();

        boolean m();

        boolean n();

        boolean o();

        String p();

        boolean q();

        String r();

        void s(io.flutter.embedding.engine.a aVar);

        String t();

        io.flutter.plugin.platform.c u(Activity activity, io.flutter.embedding.engine.a aVar);

        void v(h hVar);

        String w();

        boolean x();

        io.flutter.embedding.engine.g y();

        v z();
    }

    e(c cVar) {
        this(cVar, (d) null);
    }

    e(c cVar, d dVar) {
        this.f9700l = new a();
        this.f9689a = cVar;
        this.f9696h = false;
        this.f9699k = dVar;
    }

    private d.b g(d.b bVar) {
        String w9 = this.f9689a.w();
        if (w9 == null || w9.isEmpty()) {
            w9 = x6.a.e().c().f();
        }
        a.c cVar = new a.c(w9, this.f9689a.r());
        String i10 = this.f9689a.i();
        if (i10 == null && (i10 = o(this.f9689a.d().getIntent())) == null) {
            i10 = "/";
        }
        return bVar.i(cVar).k(i10).j(this.f9689a.l());
    }

    private void h(k kVar) {
        if (this.f9689a.z() == v.surface) {
            if (this.f9693e != null) {
                kVar.getViewTreeObserver().removeOnPreDrawListener(this.f9693e);
            }
            this.f9693e = new b(kVar);
            kVar.getViewTreeObserver().addOnPreDrawListener(this.f9693e);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }

    private void i() {
        String str;
        if (this.f9689a.p() == null && !this.f9690b.j().n()) {
            String i10 = this.f9689a.i();
            if (i10 == null && (i10 = o(this.f9689a.d().getIntent())) == null) {
                i10 = "/";
            }
            String t9 = this.f9689a.t();
            if (("Executing Dart entrypoint: " + this.f9689a.r() + ", library uri: " + t9) == null) {
                str = "\"\"";
            } else {
                str = t9 + ", and sending initial route: " + i10;
            }
            x6.b.f("FlutterActivityAndFragmentDelegate", str);
            this.f9690b.n().c(i10);
            String w9 = this.f9689a.w();
            if (w9 == null || w9.isEmpty()) {
                w9 = x6.a.e().c().f();
            }
            this.f9690b.j().k(t9 == null ? new a.c(w9, this.f9689a.r()) : new a.c(w9, t9, this.f9689a.r()), this.f9689a.l());
        }
    }

    private void j() {
        if (this.f9689a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String o(Intent intent) {
        Uri data;
        if (!this.f9689a.x() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    /* access modifiers changed from: package-private */
    public void A() {
        io.flutter.embedding.engine.a aVar;
        x6.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        j();
        if (this.f9689a.o() && (aVar = this.f9690b) != null) {
            aVar.k().e();
        }
    }

    /* access modifiers changed from: package-private */
    public void B(Bundle bundle) {
        x6.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        j();
        if (this.f9689a.q()) {
            bundle.putByteArray("framework", this.f9690b.s().h());
        }
        if (this.f9689a.m()) {
            Bundle bundle2 = new Bundle();
            this.f9690b.i().l(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        x6.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        j();
        i();
        Integer num = this.f9698j;
        if (num != null) {
            this.f9691c.setVisibility(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        io.flutter.embedding.engine.a aVar;
        x6.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        j();
        if (this.f9689a.o() && (aVar = this.f9690b) != null) {
            aVar.k().d();
        }
        this.f9698j = Integer.valueOf(this.f9691c.getVisibility());
        this.f9691c.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public void E(int i10) {
        j();
        io.flutter.embedding.engine.a aVar = this.f9690b;
        if (aVar != null) {
            if (this.f9696h && i10 >= 10) {
                aVar.j().o();
                this.f9690b.v().a();
            }
            this.f9690b.r().n(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void F() {
        j();
        if (this.f9690b != null) {
            x6.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f9690b.i().o();
            return;
        }
        x6.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void G(boolean z9) {
        io.flutter.embedding.engine.a aVar;
        j();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z9 ? "true" : "false");
        x6.b.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (this.f9689a.o() && (aVar = this.f9690b) != null) {
            if (z9) {
                aVar.k().a();
            } else {
                aVar.k().f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        this.f9689a = null;
        this.f9690b = null;
        this.f9691c = null;
        this.f9692d = null;
    }

    /* access modifiers changed from: package-private */
    public void I() {
        d dVar;
        d.b l10;
        x6.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String p10 = this.f9689a.p();
        if (p10 != null) {
            io.flutter.embedding.engine.a a10 = io.flutter.embedding.engine.b.b().a(p10);
            this.f9690b = a10;
            this.f9694f = true;
            if (a10 == null) {
                throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + p10 + "'");
            }
            return;
        }
        c cVar = this.f9689a;
        io.flutter.embedding.engine.a B = cVar.B(cVar.getContext());
        this.f9690b = B;
        if (B != null) {
            this.f9694f = true;
            return;
        }
        String h10 = this.f9689a.h();
        if (h10 != null) {
            dVar = io.flutter.embedding.engine.e.b().a(h10);
            if (dVar != null) {
                l10 = new d.b(this.f9689a.getContext());
            } else {
                throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + h10 + "'");
            }
        } else {
            x6.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            dVar = this.f9699k;
            if (dVar == null) {
                dVar = new d(this.f9689a.getContext(), this.f9689a.y().b());
            }
            l10 = new d.b(this.f9689a.getContext()).h(false).l(this.f9689a.q());
        }
        this.f9690b = dVar.a(g(l10));
        this.f9694f = false;
    }

    /* access modifiers changed from: package-private */
    public void J() {
        io.flutter.plugin.platform.c cVar = this.f9692d;
        if (cVar != null) {
            cVar.C();
        }
    }

    public void e() {
        if (!this.f9689a.n()) {
            this.f9689a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f9689a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* renamed from: k */
    public Activity f() {
        Activity d10 = this.f9689a.d();
        if (d10 != null) {
            return d10;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* access modifiers changed from: package-private */
    public io.flutter.embedding.engine.a l() {
        return this.f9690b;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f9697i;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f9694f;
    }

    /* access modifiers changed from: package-private */
    public void p(int i10, int i11, Intent intent) {
        j();
        if (this.f9690b != null) {
            x6.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i10 + "\nresultCode: " + i11 + "\ndata: " + intent);
            this.f9690b.i().m(i10, i11, intent);
            return;
        }
        x6.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void q(Context context) {
        j();
        if (this.f9690b == null) {
            I();
        }
        if (this.f9689a.m()) {
            x6.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f9690b.i().p(this, this.f9689a.a());
        }
        c cVar = this.f9689a;
        this.f9692d = cVar.u(cVar.d(), this.f9690b);
        this.f9689a.E(this.f9690b);
        this.f9697i = true;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        j();
        if (this.f9690b != null) {
            x6.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f9690b.n().a();
            return;
        }
        x6.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public View s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i10, boolean z9) {
        k kVar;
        x6.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        j();
        boolean z10 = true;
        if (this.f9689a.z() == v.surface) {
            Context context = this.f9689a.getContext();
            if (this.f9689a.C() != y.transparent) {
                z10 = false;
            }
            h hVar = new h(context, z10);
            this.f9689a.v(hVar);
            kVar = new k(this.f9689a.getContext(), hVar);
        } else {
            i iVar = new i(this.f9689a.getContext());
            if (this.f9689a.C() != y.opaque) {
                z10 = false;
            }
            iVar.setOpaque(z10);
            this.f9689a.D(iVar);
            kVar = new k(this.f9689a.getContext(), iVar);
        }
        this.f9691c = kVar;
        this.f9691c.m(this.f9700l);
        x6.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f9691c.o(this.f9690b);
        this.f9691c.setId(i10);
        x A = this.f9689a.A();
        if (A != null) {
            x6.b.g("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
            FlutterSplashView flutterSplashView = new FlutterSplashView(this.f9689a.getContext());
            flutterSplashView.setId(h.e(486947586));
            flutterSplashView.g(this.f9691c, A);
            return flutterSplashView;
        }
        if (z9) {
            h(this.f9691c);
        }
        return this.f9691c;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        x6.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        j();
        if (this.f9693e != null) {
            this.f9691c.getViewTreeObserver().removeOnPreDrawListener(this.f9693e);
            this.f9693e = null;
        }
        k kVar = this.f9691c;
        if (kVar != null) {
            kVar.t();
            this.f9691c.B(this.f9700l);
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        io.flutter.embedding.engine.a aVar;
        x6.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
        j();
        this.f9689a.s(this.f9690b);
        if (this.f9689a.m()) {
            x6.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f9689a.d().isChangingConfigurations()) {
                this.f9690b.i().q();
            } else {
                this.f9690b.i().r();
            }
        }
        io.flutter.plugin.platform.c cVar = this.f9692d;
        if (cVar != null) {
            cVar.p();
            this.f9692d = null;
        }
        if (this.f9689a.o() && (aVar = this.f9690b) != null) {
            aVar.k().b();
        }
        if (this.f9689a.n()) {
            this.f9690b.g();
            if (this.f9689a.p() != null) {
                io.flutter.embedding.engine.b.b().d(this.f9689a.p());
            }
            this.f9690b = null;
        }
        this.f9697i = false;
    }

    /* access modifiers changed from: package-private */
    public void v(Intent intent) {
        j();
        if (this.f9690b != null) {
            x6.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
            this.f9690b.i().onNewIntent(intent);
            String o10 = o(intent);
            if (o10 != null && !o10.isEmpty()) {
                this.f9690b.n().b(o10);
                return;
            }
            return;
        }
        x6.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void w() {
        io.flutter.embedding.engine.a aVar;
        x6.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        j();
        if (this.f9689a.o() && (aVar = this.f9690b) != null) {
            aVar.k().c();
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        x6.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        j();
        if (this.f9690b != null) {
            J();
        } else {
            x6.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    /* access modifiers changed from: package-private */
    public void y(int i10, String[] strArr, int[] iArr) {
        j();
        if (this.f9690b != null) {
            x6.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i10 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
            this.f9690b.i().onRequestPermissionsResult(i10, strArr, iArr);
            return;
        }
        x6.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void z(Bundle bundle) {
        Bundle bundle2;
        x6.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        j();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f9689a.q()) {
            this.f9690b.s().j(bArr);
        }
        if (this.f9689a.m()) {
            this.f9690b.i().n(bundle2);
        }
    }
}
