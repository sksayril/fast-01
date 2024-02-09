package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.v;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class u implements l {

    /* renamed from: u  reason: collision with root package name */
    public static final b f2770u = new b((g) null);
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final u f2771v = new u();

    /* renamed from: m  reason: collision with root package name */
    private int f2772m;

    /* renamed from: n  reason: collision with root package name */
    private int f2773n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2774o = true;

    /* renamed from: p  reason: collision with root package name */
    private boolean f2775p = true;

    /* renamed from: q  reason: collision with root package name */
    private Handler f2776q;

    /* renamed from: r  reason: collision with root package name */
    private final m f2777r = new m(this);

    /* renamed from: s  reason: collision with root package name */
    private final Runnable f2778s = new t(this);
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final v.a f2779t = new d(this);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2780a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            l.e(activity, "activity");
            l.e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final l a() {
            return u.f2771v;
        }

        public final void b(Context context) {
            l.e(context, "context");
            u.f2771v.i(context);
        }
    }

    public static final class c extends c {
        final /* synthetic */ u this$0;

        public static final class a extends c {
            final /* synthetic */ u this$0;

            a(u uVar) {
                this.this$0 = uVar;
            }

            public void onActivityPostResumed(Activity activity) {
                l.e(activity, "activity");
                this.this$0.f();
            }

            public void onActivityPostStarted(Activity activity) {
                l.e(activity, "activity");
                this.this$0.g();
            }
        }

        c(u uVar) {
            this.this$0 = uVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                v.f2782n.b(activity).f(this.this$0.f2779t);
            }
        }

        public void onActivityPaused(Activity activity) {
            l.e(activity, "activity");
            this.this$0.e();
        }

        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
            a.a(activity, new a(this.this$0));
        }

        public void onActivityStopped(Activity activity) {
            l.e(activity, "activity");
            this.this$0.h();
        }
    }

    public static final class d implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f2781a;

        d(u uVar) {
            this.f2781a = uVar;
        }

        public void o() {
            this.f2781a.f();
        }

        public void s() {
            this.f2781a.g();
        }

        public void t() {
        }
    }

    private u() {
    }

    /* access modifiers changed from: private */
    public static final void l(u uVar) {
        l.e(uVar, "this$0");
        uVar.m();
        uVar.n();
    }

    public g a() {
        return this.f2777r;
    }

    public final void e() {
        int i10 = this.f2773n - 1;
        this.f2773n = i10;
        if (i10 == 0) {
            Handler handler = this.f2776q;
            l.b(handler);
            handler.postDelayed(this.f2778s, 700);
        }
    }

    public final void f() {
        int i10 = this.f2773n + 1;
        this.f2773n = i10;
        if (i10 != 1) {
            return;
        }
        if (this.f2774o) {
            this.f2777r.h(g.a.ON_RESUME);
            this.f2774o = false;
            return;
        }
        Handler handler = this.f2776q;
        l.b(handler);
        handler.removeCallbacks(this.f2778s);
    }

    public final void g() {
        int i10 = this.f2772m + 1;
        this.f2772m = i10;
        if (i10 == 1 && this.f2775p) {
            this.f2777r.h(g.a.ON_START);
            this.f2775p = false;
        }
    }

    public final void h() {
        this.f2772m--;
        n();
    }

    public final void i(Context context) {
        l.e(context, "context");
        this.f2776q = new Handler();
        this.f2777r.h(g.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c(this));
    }

    public final void m() {
        if (this.f2773n == 0) {
            this.f2774o = true;
            this.f2777r.h(g.a.ON_PAUSE);
        }
    }

    public final void n() {
        if (this.f2772m == 0 && this.f2774o) {
            this.f2777r.h(g.a.ON_STOP);
            this.f2775p = true;
        }
    }
}
