package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import c7.a;
import d7.c;
import io.flutter.plugins.imagepicker.l;
import io.flutter.plugins.imagepicker.p;
import java.util.List;
import k7.o;

public class ImagePickerPlugin implements c7.a, d7.a, p.f {

    /* renamed from: m  reason: collision with root package name */
    private a.b f10524m;

    /* renamed from: n  reason: collision with root package name */
    b f10525n;

    private class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

        /* renamed from: m  reason: collision with root package name */
        private final Activity f10526m;

        LifeCycleObserver(Activity activity) {
            this.f10526m = activity;
        }

        public void b(l lVar) {
        }

        public void c(l lVar) {
            onActivityDestroyed(this.f10526m);
        }

        public void d(l lVar) {
        }

        public void i(l lVar) {
        }

        public void k(l lVar) {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f10526m == activity && activity.getApplicationContext() != null) {
                ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
            }
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
            if (this.f10526m == activity) {
                ImagePickerPlugin.this.f10525n.b().U();
            }
        }

        public void s(l lVar) {
            onActivityStopped(this.f10526m);
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10528a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10529b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        static {
            /*
                io.flutter.plugins.imagepicker.p$m[] r0 = io.flutter.plugins.imagepicker.p.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10529b = r0
                r1 = 1
                io.flutter.plugins.imagepicker.p$m r2 = io.flutter.plugins.imagepicker.p.m.GALLERY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10529b     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.imagepicker.p$m r3 = io.flutter.plugins.imagepicker.p.m.CAMERA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                io.flutter.plugins.imagepicker.p$k[] r2 = io.flutter.plugins.imagepicker.p.k.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f10528a = r2
                io.flutter.plugins.imagepicker.p$k r3 = io.flutter.plugins.imagepicker.p.k.FRONT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f10528a     // Catch:{ NoSuchFieldError -> 0x0038 }
                io.flutter.plugins.imagepicker.p$k r2 = io.flutter.plugins.imagepicker.p.k.REAR     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.ImagePickerPlugin.a.<clinit>():void");
        }
    }

    private class b {

        /* renamed from: a  reason: collision with root package name */
        private Application f10530a;

        /* renamed from: b  reason: collision with root package name */
        private Activity f10531b;

        /* renamed from: c  reason: collision with root package name */
        private l f10532c;

        /* renamed from: d  reason: collision with root package name */
        private LifeCycleObserver f10533d;

        /* renamed from: e  reason: collision with root package name */
        private c f10534e;

        /* renamed from: f  reason: collision with root package name */
        private k7.c f10535f;

        /* renamed from: g  reason: collision with root package name */
        private g f10536g;

        b(Application application, Activity activity, k7.c cVar, p.f fVar, o oVar, c cVar2) {
            this.f10530a = application;
            this.f10531b = activity;
            this.f10534e = cVar2;
            this.f10535f = cVar;
            this.f10532c = ImagePickerPlugin.this.e(activity);
            u.f(cVar, fVar);
            LifeCycleObserver lifeCycleObserver = new LifeCycleObserver(activity);
            this.f10533d = lifeCycleObserver;
            if (oVar != null) {
                application.registerActivityLifecycleCallbacks(lifeCycleObserver);
                oVar.c(this.f10532c);
                oVar.b(this.f10532c);
                return;
            }
            cVar2.c(this.f10532c);
            cVar2.b(this.f10532c);
            g a10 = g7.a.a(cVar2);
            this.f10536g = a10;
            a10.a(this.f10533d);
        }

        /* access modifiers changed from: package-private */
        public Activity a() {
            return this.f10531b;
        }

        /* access modifiers changed from: package-private */
        public l b() {
            return this.f10532c;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            c cVar = this.f10534e;
            if (cVar != null) {
                cVar.g(this.f10532c);
                this.f10534e.f(this.f10532c);
                this.f10534e = null;
            }
            g gVar = this.f10536g;
            if (gVar != null) {
                gVar.c(this.f10533d);
                this.f10536g = null;
            }
            u.f(this.f10535f, (p.f) null);
            Application application = this.f10530a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.f10533d);
                this.f10530a = null;
            }
            this.f10531b = null;
            this.f10533d = null;
            this.f10532c = null;
        }
    }

    private l f() {
        b bVar = this.f10525n;
        if (bVar == null || bVar.a() == null) {
            return null;
        }
        return this.f10525n.b();
    }

    private void g(l lVar, p.l lVar2) {
        p.k b10 = lVar2.b();
        if (b10 != null) {
            lVar.V(a.f10528a[b10.ordinal()] != 1 ? l.c.REAR : l.c.FRONT);
        }
    }

    private void h(k7.c cVar, Application application, Activity activity, o oVar, c cVar2) {
        this.f10525n = new b(application, activity, cVar, this, oVar, cVar2);
    }

    private void i() {
        b bVar = this.f10525n;
        if (bVar != null) {
            bVar.c();
            this.f10525n = null;
        }
    }

    public void a(p.i iVar, p.e eVar, p.j<List<String>> jVar) {
        l f10 = f();
        if (f10 == null) {
            jVar.b(new p.d("no_activity", "image_picker plugin requires a foreground activity.", (Object) null));
        } else {
            f10.j(iVar, eVar, jVar);
        }
    }

    public void b(p.l lVar, p.h hVar, p.e eVar, p.j<List<String>> jVar) {
        l f10 = f();
        if (f10 == null) {
            jVar.b(new p.d("no_activity", "image_picker plugin requires a foreground activity.", (Object) null));
            return;
        }
        g(f10, lVar);
        if (eVar.b().booleanValue()) {
            f10.k(hVar, eVar.c().booleanValue(), jVar);
            return;
        }
        int i10 = a.f10529b[lVar.c().ordinal()];
        if (i10 == 1) {
            f10.i(hVar, eVar.c().booleanValue(), jVar);
        } else if (i10 == 2) {
            f10.X(hVar, jVar);
        }
    }

    public void c(p.l lVar, p.n nVar, p.e eVar, p.j<List<String>> jVar) {
        l f10 = f();
        if (f10 == null) {
            jVar.b(new p.d("no_activity", "image_picker plugin requires a foreground activity.", (Object) null));
            return;
        }
        g(f10, lVar);
        if (eVar.b().booleanValue()) {
            jVar.b(new RuntimeException("Multi-video selection is not implemented"));
            return;
        }
        int i10 = a.f10529b[lVar.c().ordinal()];
        if (i10 == 1) {
            f10.l(nVar, eVar.c().booleanValue(), jVar);
        } else if (i10 == 2) {
            f10.Y(nVar, jVar);
        }
    }

    public p.b d() {
        l f10 = f();
        if (f10 != null) {
            return f10.T();
        }
        throw new p.d("no_activity", "image_picker plugin requires a foreground activity.", (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final l e(Activity activity) {
        return new l(activity, new o(activity, new a()), new c(activity));
    }

    public void onAttachedToActivity(c cVar) {
        h(this.f10524m.b(), (Application) this.f10524m.a(), cVar.d(), (o) null, cVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f10524m = bVar;
    }

    public void onDetachedFromActivity() {
        i();
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f10524m = null;
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
