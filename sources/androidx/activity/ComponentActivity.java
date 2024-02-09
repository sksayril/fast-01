package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.h;
import androidx.core.app.i;
import androidx.core.app.q;
import androidx.lifecycle.c0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import e.a;
import g8.s;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity extends h implements g0, androidx.lifecycle.f, s0.d, l, androidx.activity.result.e, i {
    private final CopyOnWriteArrayList<androidx.core.util.a<Integer>> A;
    private final CopyOnWriteArrayList<androidx.core.util.a<Intent>> B;
    private final CopyOnWriteArrayList<androidx.core.util.a<i>> C;
    private final CopyOnWriteArrayList<androidx.core.util.a<q>> D;
    private boolean E;
    private boolean F;

    /* renamed from: o  reason: collision with root package name */
    final d.a f128o = new d.a();

    /* renamed from: p  reason: collision with root package name */
    private final androidx.core.view.i f129p = new androidx.core.view.i(new d(this));

    /* renamed from: q  reason: collision with root package name */
    private final m f130q = new m(this);

    /* renamed from: r  reason: collision with root package name */
    final s0.c f131r;

    /* renamed from: s  reason: collision with root package name */
    private f0 f132s;

    /* renamed from: t  reason: collision with root package name */
    private final OnBackPressedDispatcher f133t;

    /* renamed from: u  reason: collision with root package name */
    final f f134u;

    /* renamed from: v  reason: collision with root package name */
    final h f135v;

    /* renamed from: w  reason: collision with root package name */
    private int f136w;

    /* renamed from: x  reason: collision with root package name */
    private final AtomicInteger f137x;

    /* renamed from: y  reason: collision with root package name */
    private final androidx.activity.result.d f138y;

    /* renamed from: z  reason: collision with root package name */
    private final CopyOnWriteArrayList<androidx.core.util.a<Configuration>> f139z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    class b extends androidx.activity.result.d {

        class a implements Runnable {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f145m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ a.C0127a f146n;

            a(int i10, a.C0127a aVar) {
                this.f145m = i10;
                this.f146n = aVar;
            }

            public void run() {
                b.this.c(this.f145m, this.f146n.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        class C0003b implements Runnable {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f148m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f149n;

            C0003b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f148m = i10;
                this.f149n = sendIntentException;
            }

            public void run() {
                b.this.b(this.f148m, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f149n));
            }
        }

        b() {
        }

        public <I, O> void f(int i10, e.a<I, O> aVar, I i11, androidx.core.app.c cVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0127a<O> b10 = aVar.b(componentActivity, i11);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, i11);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.s(componentActivity, stringArrayExtra, i10);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.activity.result.f fVar = (androidx.activity.result.f) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.b.v(componentActivity, fVar.d(), i10, fVar.a(), fVar.b(), fVar.c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new C0003b(i10, e10));
                }
            } else {
                androidx.core.app.b.u(componentActivity, a10, i10, bundle2);
            }
        }
    }

    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    static class d {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    static final class e {

        /* renamed from: a  reason: collision with root package name */
        Object f151a;

        /* renamed from: b  reason: collision with root package name */
        f0 f152b;

        e() {
        }
    }

    private interface f extends Executor {
        void e();

        void n(View view);
    }

    class g implements f, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: m  reason: collision with root package name */
        final long f153m = (SystemClock.uptimeMillis() + 10000);

        /* renamed from: n  reason: collision with root package name */
        Runnable f154n;

        /* renamed from: o  reason: collision with root package name */
        boolean f155o = false;

        g() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            Runnable runnable = this.f154n;
            if (runnable != null) {
                runnable.run();
                this.f154n = null;
            }
        }

        public void e() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public void execute(Runnable runnable) {
            this.f154n = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f155o) {
                decorView.postOnAnimation(new f(this));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public void n(View view) {
            if (!this.f155o) {
                this.f155o = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public void onDraw() {
            Runnable runnable = this.f154n;
            if (runnable != null) {
                runnable.run();
                this.f154n = null;
                if (!ComponentActivity.this.f135v.c()) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f153m) {
                return;
            }
            this.f155o = false;
            ComponentActivity.this.getWindow().getDecorView().post(this);
        }

        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        s0.c a10 = s0.c.a(this);
        this.f131r = a10;
        this.f133t = new OnBackPressedDispatcher(new a());
        f r9 = r();
        this.f134u = r9;
        this.f135v = new h(r9, new e(this));
        this.f137x = new AtomicInteger();
        this.f138y = new b();
        this.f139z = new CopyOnWriteArrayList<>();
        this.A = new CopyOnWriteArrayList<>();
        this.B = new CopyOnWriteArrayList<>();
        this.C = new CopyOnWriteArrayList<>();
        this.D = new CopyOnWriteArrayList<>();
        this.E = false;
        this.F = false;
        if (a() != null) {
            int i10 = Build.VERSION.SDK_INT;
            a().a(new j() {
                public void h(l lVar, g.a aVar) {
                    if (aVar == g.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            c.a(peekDecorView);
                        }
                    }
                }
            });
            a().a(new j() {
                public void h(l lVar, g.a aVar) {
                    if (aVar == g.a.ON_DESTROY) {
                        ComponentActivity.this.f128o.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.l().a();
                        }
                        ComponentActivity.this.f134u.e();
                    }
                }
            });
            a().a(new j() {
                public void h(l lVar, g.a aVar) {
                    ComponentActivity.this.s();
                    ComponentActivity.this.a().c(this);
                }
            });
            a10.c();
            y.a(this);
            if (i10 <= 23) {
                a().a(new ImmLeaksCleaner(this));
            }
            k().h("android:support:activity-result", new b(this));
            q(new c(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private f r() {
        return new g();
    }

    private void t() {
        h0.a(getWindow().getDecorView(), this);
        i0.a(getWindow().getDecorView(), this);
        s0.e.a(getWindow().getDecorView(), this);
        o.a(getWindow().getDecorView(), this);
        n.a(getWindow().getDecorView(), this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ s v() {
        reportFullyDrawn();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Bundle w() {
        Bundle bundle = new Bundle();
        this.f138y.h(bundle);
        return bundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(Context context) {
        Bundle b10 = k().b("android:support:activity-result");
        if (b10 != null) {
            this.f138y.g(b10);
        }
    }

    public androidx.lifecycle.g a() {
        return this.f130q;
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        t();
        this.f134u.n(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    public j0.a e() {
        j0.d dVar = new j0.d();
        if (getApplication() != null) {
            dVar.b(c0.a.f2741e, getApplication());
        }
        dVar.b(y.f2792a, this);
        dVar.b(y.f2793b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            dVar.b(y.f2794c, getIntent().getExtras());
        }
        return dVar;
    }

    public final androidx.activity.result.d g() {
        return this.f138y;
    }

    public final OnBackPressedDispatcher j() {
        return this.f133t;
    }

    public final androidx.savedstate.a k() {
        return this.f131r.b();
    }

    public f0 l() {
        if (getApplication() != null) {
            s();
            return this.f132s;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.f138y.b(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    public void onBackPressed() {
        this.f133t.e();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.a<Configuration>> it = this.f139z.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f131r.d(bundle);
        this.f128o.c(this);
        super.onCreate(bundle);
        v.e(this);
        if (androidx.core.os.a.c()) {
            this.f133t.f(d.a(this));
        }
        int i10 = this.f136w;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.f129p.a(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.f129p.c(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z9) {
        if (!this.E) {
            Iterator<androidx.core.util.a<i>> it = this.C.iterator();
            while (it.hasNext()) {
                it.next().accept(new i(z9));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z9, Configuration configuration) {
        this.E = true;
        try {
            super.onMultiWindowModeChanged(z9, configuration);
            this.E = false;
            Iterator<androidx.core.util.a<i>> it = this.C.iterator();
            while (it.hasNext()) {
                it.next().accept(new i(z9, configuration));
            }
        } catch (Throwable th) {
            this.E = false;
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.a<Intent>> it = this.B.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.f129p.b(menu);
        super.onPanelClosed(i10, menu);
    }

    public void onPictureInPictureModeChanged(boolean z9) {
        if (!this.F) {
            Iterator<androidx.core.util.a<q>> it = this.D.iterator();
            while (it.hasNext()) {
                it.next().accept(new q(z9));
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z9, Configuration configuration) {
        this.F = true;
        try {
            super.onPictureInPictureModeChanged(z9, configuration);
            this.F = false;
            Iterator<androidx.core.util.a<q>> it = this.D.iterator();
            while (it.hasNext()) {
                it.next().accept(new q(z9, configuration));
            }
        } catch (Throwable th) {
            this.F = false;
            throw th;
        }
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.f129p.d(menu);
        return true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.f138y.b(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object y9 = y();
        f0 f0Var = this.f132s;
        if (f0Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            f0Var = eVar.f152b;
        }
        if (f0Var == null && y9 == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f151a = y9;
        eVar2.f152b = f0Var;
        return eVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.g a10 = a();
        if (a10 instanceof m) {
            ((m) a10).n(g.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f131r.e(bundle);
    }

    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<androidx.core.util.a<Integer>> it = this.A.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public final void q(d.b bVar) {
        this.f128o.a(bVar);
    }

    public void reportFullyDrawn() {
        try {
            if (u0.a.h()) {
                u0.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f135v.b();
        } finally {
            u0.a.f();
        }
    }

    /* access modifiers changed from: package-private */
    public void s() {
        if (this.f132s == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f132s = eVar.f152b;
            }
            if (this.f132s == null) {
                this.f132s = new f0();
            }
        }
    }

    public void setContentView(int i10) {
        t();
        this.f134u.n(getWindow().getDecorView());
        super.setContentView(i10);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        t();
        this.f134u.n(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        t();
        this.f134u.n(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void u() {
        invalidateOptionsMenu();
    }

    @Deprecated
    public Object y() {
        return null;
    }
}
