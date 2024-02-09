package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import g8.s;
import h8.e;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f162a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e<j> f163b = new e<>();

    /* renamed from: c  reason: collision with root package name */
    private r8.a<s> f164c;

    /* renamed from: d  reason: collision with root package name */
    private OnBackInvokedCallback f165d;

    /* renamed from: e  reason: collision with root package name */
    private OnBackInvokedDispatcher f166e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f167f;

    private final class LifecycleOnBackPressedCancellable implements j, a {

        /* renamed from: m  reason: collision with root package name */
        private final g f168m;

        /* renamed from: n  reason: collision with root package name */
        private final j f169n;

        /* renamed from: o  reason: collision with root package name */
        private a f170o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f171p;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, g gVar, j jVar) {
            l.e(gVar, "lifecycle");
            l.e(jVar, "onBackPressedCallback");
            this.f171p = onBackPressedDispatcher;
            this.f168m = gVar;
            this.f169n = jVar;
            gVar.a(this);
        }

        public void cancel() {
            this.f168m.c(this);
            this.f169n.e(this);
            a aVar = this.f170o;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f170o = null;
        }

        public void h(androidx.lifecycle.l lVar, g.a aVar) {
            l.e(lVar, "source");
            l.e(aVar, "event");
            if (aVar == g.a.ON_START) {
                this.f170o = this.f171p.c(this.f169n);
            } else if (aVar == g.a.ON_STOP) {
                a aVar2 = this.f170o;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == g.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    static final class a extends m implements r8.a<s> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f172m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(OnBackPressedDispatcher onBackPressedDispatcher) {
            super(0);
            this.f172m = onBackPressedDispatcher;
        }

        public final void b() {
            this.f172m.g();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return s.f8976a;
        }
    }

    static final class b extends m implements r8.a<s> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f173m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(OnBackPressedDispatcher onBackPressedDispatcher) {
            super(0);
            this.f173m = onBackPressedDispatcher;
        }

        public final void b() {
            this.f173m.e();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return s.f8976a;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f174a = new c();

        private c() {
        }

        /* access modifiers changed from: private */
        public static final void c(r8.a aVar) {
            l.e(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        public final OnBackInvokedCallback b(r8.a<s> aVar) {
            l.e(aVar, "onBackInvoked");
            return new k(aVar);
        }

        public final void d(Object obj, int i10, Object obj2) {
            l.e(obj, "dispatcher");
            l.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            l.e(obj, "dispatcher");
            l.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private final class d implements a {

        /* renamed from: m  reason: collision with root package name */
        private final j f175m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f176n;

        public d(OnBackPressedDispatcher onBackPressedDispatcher, j jVar) {
            l.e(jVar, "onBackPressedCallback");
            this.f176n = onBackPressedDispatcher;
            this.f175m = jVar;
        }

        public void cancel() {
            this.f176n.f163b.remove(this.f175m);
            this.f175m.e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f175m.g((r8.a<s>) null);
                this.f176n.g();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f162a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f164c = new a(this);
            this.f165d = c.f174a.b(new b(this));
        }
    }

    public final void b(androidx.lifecycle.l lVar, j jVar) {
        l.e(lVar, "owner");
        l.e(jVar, "onBackPressedCallback");
        g a10 = lVar.a();
        if (a10.b() != g.b.DESTROYED) {
            jVar.a(new LifecycleOnBackPressedCancellable(this, a10, jVar));
            if (Build.VERSION.SDK_INT >= 33) {
                g();
                jVar.g(this.f164c);
            }
        }
    }

    public final a c(j jVar) {
        l.e(jVar, "onBackPressedCallback");
        this.f163b.add(jVar);
        d dVar = new d(this, jVar);
        jVar.a(dVar);
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            jVar.g(this.f164c);
        }
        return dVar;
    }

    public final boolean d() {
        e<j> eVar = this.f163b;
        if ((eVar instanceof Collection) && eVar.isEmpty()) {
            return false;
        }
        for (j c10 : eVar) {
            if (c10.c()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        j jVar;
        e<j> eVar = this.f163b;
        ListIterator<j> listIterator = eVar.listIterator(eVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                jVar = null;
                break;
            }
            jVar = listIterator.previous();
            if (jVar.c()) {
                break;
            }
        }
        j jVar2 = jVar;
        if (jVar2 != null) {
            jVar2.b();
            return;
        }
        Runnable runnable = this.f162a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        l.e(onBackInvokedDispatcher, "invoker");
        this.f166e = onBackInvokedDispatcher;
        g();
    }

    public final void g() {
        boolean d10 = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f166e;
        OnBackInvokedCallback onBackInvokedCallback = this.f165d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (d10 && !this.f167f) {
                c.f174a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f167f = true;
            } else if (!d10 && this.f167f) {
                c.f174a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f167f = false;
            }
        }
    }
}
