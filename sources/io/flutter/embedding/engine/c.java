package io.flutter.embedding.engine;

import a7.d;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.g;
import c7.a;
import d7.c;
import d8.e;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k7.m;
import k7.n;
import k7.p;
import k7.q;

class c implements c7.b, d7.b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<? extends c7.a>, c7.a> f9821a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final a f9822b;

    /* renamed from: c  reason: collision with root package name */
    private final a.b f9823c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Class<? extends c7.a>, d7.a> f9824d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private io.flutter.embedding.android.c<Activity> f9825e;

    /* renamed from: f  reason: collision with root package name */
    private C0153c f9826f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9827g = false;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Class<? extends c7.a>, h7.a> f9828h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    private Service f9829i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<Class<? extends c7.a>, e7.a> f9830j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    private BroadcastReceiver f9831k;

    /* renamed from: l  reason: collision with root package name */
    private final Map<Class<? extends c7.a>, f7.a> f9832l = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    private ContentProvider f9833m;

    private static class b implements a.C0082a {

        /* renamed from: a  reason: collision with root package name */
        final d f9834a;

        private b(d dVar) {
            this.f9834a = dVar;
        }
    }

    /* renamed from: io.flutter.embedding.engine.c$c  reason: collision with other inner class name */
    private static class C0153c implements d7.c {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f9835a;

        /* renamed from: b  reason: collision with root package name */
        private final HiddenLifecycleReference f9836b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<p> f9837c = new HashSet();

        /* renamed from: d  reason: collision with root package name */
        private final Set<m> f9838d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        private final Set<n> f9839e = new HashSet();

        /* renamed from: f  reason: collision with root package name */
        private final Set<q> f9840f = new HashSet();

        /* renamed from: g  reason: collision with root package name */
        private final Set<Object> f9841g = new HashSet();

        /* renamed from: h  reason: collision with root package name */
        private final Set<c.a> f9842h = new HashSet();

        public C0153c(Activity activity, g gVar) {
            this.f9835a = activity;
            this.f9836b = new HiddenLifecycleReference(gVar);
        }

        public Object a() {
            return this.f9836b;
        }

        public void b(p pVar) {
            this.f9837c.add(pVar);
        }

        public void c(m mVar) {
            this.f9838d.add(mVar);
        }

        public Activity d() {
            return this.f9835a;
        }

        public void e(n nVar) {
            this.f9839e.add(nVar);
        }

        public void f(p pVar) {
            this.f9837c.remove(pVar);
        }

        public void g(m mVar) {
            this.f9838d.remove(mVar);
        }

        /* access modifiers changed from: package-private */
        public boolean h(int i10, int i11, Intent intent) {
            Iterator it = new HashSet(this.f9838d).iterator();
            while (true) {
                boolean z9 = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z9;
                    }
                    if (((m) it.next()).m(i10, i11, intent) || z9) {
                        z9 = true;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void i(Intent intent) {
            for (n onNewIntent : this.f9839e) {
                onNewIntent.onNewIntent(intent);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean j(int i10, String[] strArr, int[] iArr) {
            Iterator<p> it = this.f9837c.iterator();
            while (true) {
                boolean z9 = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z9;
                    }
                    if (it.next().onRequestPermissionsResult(i10, strArr, iArr) || z9) {
                        z9 = true;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void k(Bundle bundle) {
            for (c.a n10 : this.f9842h) {
                n10.n(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        public void l(Bundle bundle) {
            for (c.a l10 : this.f9842h) {
                l10.l(bundle);
            }
        }

        /* access modifiers changed from: package-private */
        public void m() {
            for (q o10 : this.f9840f) {
                o10.o();
            }
        }
    }

    c(Context context, a aVar, d dVar, d dVar2) {
        this.f9822b = aVar;
        this.f9823c = new a.b(context, aVar, aVar.j(), aVar.r(), aVar.p().X(), new b(dVar), dVar2);
    }

    private void b(Activity activity, g gVar) {
        this.f9826f = new C0153c(activity, gVar);
        this.f9822b.p().s0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f9822b.p().D(activity, this.f9822b.r(), this.f9822b.j());
        for (d7.a next : this.f9824d.values()) {
            if (this.f9827g) {
                next.onReattachedToActivityForConfigChanges(this.f9826f);
            } else {
                next.onAttachedToActivity(this.f9826f);
            }
        }
        this.f9827g = false;
    }

    private void d() {
        this.f9822b.p().P();
        this.f9825e = null;
        this.f9826f = null;
    }

    private void e() {
        if (j()) {
            r();
        } else if (t()) {
            h();
        } else if (k()) {
            f();
        } else if (s()) {
            g();
        }
    }

    private boolean j() {
        return this.f9825e != null;
    }

    private boolean k() {
        return this.f9831k != null;
    }

    private boolean s() {
        return this.f9833m != null;
    }

    private boolean t() {
        return this.f9829i != null;
    }

    public void a(c7.a aVar) {
        e.a("FlutterEngineConnectionRegistry#add " + aVar.getClass().getSimpleName());
        try {
            if (i(aVar.getClass())) {
                x6.b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + aVar + ") but it was already registered with this FlutterEngine (" + this.f9822b + ").");
                return;
            }
            x6.b.f("FlutterEngineCxnRegstry", "Adding plugin: " + aVar);
            this.f9821a.put(aVar.getClass(), aVar);
            aVar.onAttachedToEngine(this.f9823c);
            if (aVar instanceof d7.a) {
                d7.a aVar2 = (d7.a) aVar;
                this.f9824d.put(aVar.getClass(), aVar2);
                if (j()) {
                    aVar2.onAttachedToActivity(this.f9826f);
                }
            }
            if (aVar instanceof h7.a) {
                h7.a aVar3 = (h7.a) aVar;
                this.f9828h.put(aVar.getClass(), aVar3);
                if (t()) {
                    aVar3.b((h7.b) null);
                }
            }
            if (aVar instanceof e7.a) {
                e7.a aVar4 = (e7.a) aVar;
                this.f9830j.put(aVar.getClass(), aVar4);
                if (k()) {
                    aVar4.a((e7.b) null);
                }
            }
            if (aVar instanceof f7.a) {
                f7.a aVar5 = (f7.a) aVar;
                this.f9832l.put(aVar.getClass(), aVar5);
                if (s()) {
                    aVar5.b((f7.b) null);
                }
            }
            e.d();
        } finally {
            e.d();
        }
    }

    public void c() {
        x6.b.f("FlutterEngineCxnRegstry", "Destroying.");
        e();
        w();
    }

    public void f() {
        if (k()) {
            e.a("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
            try {
                for (e7.a b10 : this.f9830j.values()) {
                    b10.b();
                }
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
        }
    }

    public void g() {
        if (s()) {
            e.a("FlutterEngineConnectionRegistry#detachFromContentProvider");
            try {
                for (f7.a a10 : this.f9832l.values()) {
                    a10.a();
                }
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
        }
    }

    public void h() {
        if (t()) {
            e.a("FlutterEngineConnectionRegistry#detachFromService");
            try {
                for (h7.a a10 : this.f9828h.values()) {
                    a10.a();
                }
                this.f9829i = null;
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
        }
    }

    public boolean i(Class<? extends c7.a> cls) {
        return this.f9821a.containsKey(cls);
    }

    public void l(Bundle bundle) {
        if (j()) {
            e.a("FlutterEngineConnectionRegistry#onSaveInstanceState");
            try {
                this.f9826f.l(bundle);
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
        }
    }

    public boolean m(int i10, int i11, Intent intent) {
        if (j()) {
            e.a("FlutterEngineConnectionRegistry#onActivityResult");
            try {
                return this.f9826f.h(i10, i11, intent);
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
    }

    public void n(Bundle bundle) {
        if (j()) {
            e.a("FlutterEngineConnectionRegistry#onRestoreInstanceState");
            try {
                this.f9826f.k(bundle);
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
        }
    }

    public void o() {
        if (j()) {
            e.a("FlutterEngineConnectionRegistry#onUserLeaveHint");
            try {
                this.f9826f.m();
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
        }
    }

    public void onNewIntent(Intent intent) {
        if (j()) {
            e.a("FlutterEngineConnectionRegistry#onNewIntent");
            try {
                this.f9826f.i(intent);
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
        }
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (j()) {
            e.a("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
            try {
                return this.f9826f.j(i10, strArr, iArr);
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
    }

    public void p(io.flutter.embedding.android.c<Activity> cVar, g gVar) {
        e.a("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            io.flutter.embedding.android.c<Activity> cVar2 = this.f9825e;
            if (cVar2 != null) {
                cVar2.e();
            }
            e();
            this.f9825e = cVar;
            b(cVar.f(), gVar);
        } finally {
            e.d();
        }
    }

    public void q() {
        if (j()) {
            e.a("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
            try {
                this.f9827g = true;
                for (d7.a onDetachedFromActivityForConfigChanges : this.f9824d.values()) {
                    onDetachedFromActivityForConfigChanges.onDetachedFromActivityForConfigChanges();
                }
                d();
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void r() {
        if (j()) {
            e.a("FlutterEngineConnectionRegistry#detachFromActivity");
            try {
                for (d7.a onDetachedFromActivity : this.f9824d.values()) {
                    onDetachedFromActivity.onDetachedFromActivity();
                }
                d();
            } finally {
                e.d();
            }
        } else {
            x6.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
        }
    }

    public void u(Class<? extends c7.a> cls) {
        c7.a aVar = this.f9821a.get(cls);
        if (aVar != null) {
            e.a("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
            try {
                if (aVar instanceof d7.a) {
                    if (j()) {
                        ((d7.a) aVar).onDetachedFromActivity();
                    }
                    this.f9824d.remove(cls);
                }
                if (aVar instanceof h7.a) {
                    if (t()) {
                        ((h7.a) aVar).a();
                    }
                    this.f9828h.remove(cls);
                }
                if (aVar instanceof e7.a) {
                    if (k()) {
                        ((e7.a) aVar).b();
                    }
                    this.f9830j.remove(cls);
                }
                if (aVar instanceof f7.a) {
                    if (s()) {
                        ((f7.a) aVar).a();
                    }
                    this.f9832l.remove(cls);
                }
                aVar.onDetachedFromEngine(this.f9823c);
                this.f9821a.remove(cls);
            } finally {
                e.d();
            }
        }
    }

    public void v(Set<Class<? extends c7.a>> set) {
        for (Class<? extends c7.a> u9 : set) {
            u(u9);
        }
    }

    public void w() {
        v(new HashSet(this.f9821a.keySet()));
        this.f9821a.clear();
    }
}
